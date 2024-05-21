package com.jane.agrimanagment.ui.theme.Screen.AboutUs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jane.agrimanagment.R
import com.jane.agrimanagment.ui.theme.Screen.Home.HomeScreen

@Composable
fun AboutUsScreen(navController: NavController){
    Image(painter = painterResource(id = R.drawable.cow), contentDescription = "cow",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(30.dp)
            .clip(shape = CircleShape))
    Spacer(modifier = Modifier.height(10.dp))
    }
@Preview
@Composable
fun AboutUsScreenPreview(){
    AboutUsScreen(rememberNavController())
}


