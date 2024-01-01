package com.roof.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondPage(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Page 2")

        Button(onClick = {
            // navController.navigate("Third_Page")
            navController.navigate("Third_Page") {
                popUpTo("Second_Page") {
                    inclusive = true
                }
            }
        }) {
            Text(text = "Next")
        }

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Back")
        }
    }
}