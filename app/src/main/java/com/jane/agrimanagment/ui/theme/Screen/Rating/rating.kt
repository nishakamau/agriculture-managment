package com.jane.agrimanagment.ui.theme.Screen.Rating

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.w3c.dom.Text

@Composable
fun RatingScreen(navController: NavController) {
    var rating by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Rate our app", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))

        RatingBar(
            rating = rating,
            onRatingChanged = { newRating ->
                rating = newRating
                navController.setGraph(newRating.toInt())
            }
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = { /* Navigate to next screen */ }) {
            Text(text = "Submit")
        }
    }
}

class MaterialTheme {
    companion object {
        val typography: Any = TODO()
    }

}

@Composable
fun RatingBar(
    rating: Float,
    onRatingChanged: (Float) -> Unit
) {
   
    Slider(
        value = rating,
        onValueChange = onRatingChanged,
        valueRange = 0f..5f,
        steps = 0,
        modifier = Modifier.width(200.dp)
    )
}


