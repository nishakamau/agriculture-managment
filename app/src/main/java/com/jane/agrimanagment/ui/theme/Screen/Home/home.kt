package com.jane.agrimanagment.ui.theme.Screen.Home

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.jane.agrimanagment.Navigation.ROUTE_ABOUT
import com.jane.agrimanagment.Navigation.ROUTE_RATING
import com.jane.agrimanagment.Navigation.ROUTE_REGISTER
import com.jane.agrimanagment.R

@Composable
fun HomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.cow), contentDescription = "logo",
                contentScale = ContentScale.Crop,
                 modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape))
        }
        Text(text = "Welcome to Home page",
            onTextLayout = {},
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ABOUT)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "About Us ")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate(ROUTE_RATING)
        },modifier=Modifier.fillMaxWidth()) {
            Text(text = "Rating")
        }

        Button(onClick = {
            navController.navigate(ROUTE_ABOUT)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "My ACC")
        }
        Spacer(modifier = Modifier.height(10.dp))

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}