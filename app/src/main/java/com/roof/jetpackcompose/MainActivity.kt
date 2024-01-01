package com.roof.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.roof.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // openNewPage()
                    Greeting()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    /*Text(
        text = "JetpackCompose",
        fontStyle = FontStyle.Italic,
        fontSize = 20.sp
    )*/

    /*Column(
        // modifier = Modifier.fillMaxHeight()
        // modifier = Modifier.fillMaxWidth()
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Jetpack 1")
        Text(text = "Jetpack 2")
        Text(text = "Jetpack 3")
        Text(text = "Jetpack 4")
        Text(text = "Jetpack 5")
        Text(text = "Jetpack 6")
    }*/

    /*SelectionContainer {
        Column {
            Text(text = "Text 1")
            DisableSelection {
                Text(text = "Text 2")
            }
            Text(text = "Text 3")
        }
    }*/

    /*Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Text 1")
        Text(text = "Text 2")
        Text(text = "Text 3")
    }*/

    /*Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.size(100.dp).background(Color.Red))
        Box(modifier = Modifier.size(75.dp).background(Color.Yellow))
        Box(modifier = Modifier.size(50.dp).background(Color.Red))
    }*/

    /*Column {
        MyText(text = "Text 1", color = Color.Red, size = 25)
        MyText(text = "Text 2", color = Color.Yellow, size = 20)
        MyText(text = "Text 3", color = Color.Black, size = 15)
    }*/

    /*val number = remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = number.value.toString())
        Text(text = "Add", modifier = Modifier.clickable {
            number.value++
        })
    }*/


    /*var number by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Text(text = number.toString())

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            OutlinedButton(onClick = {
                number--
            }, modifier = Modifier
                .fillMaxWidth()
                .weight(50f)) {
                Text(text = "Çıkar")
            }

            Button(onClick = { number++ }, modifier = Modifier
                .fillMaxWidth()
                .weight(50f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                )) {
                Text(text = "Ekle")
            }

        }
    }*/

    /*var name by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        TextField(
            value = name, onValueChange = { if (it.length <= 5) name = it },
            label = {
                Text(text = "Enter Name")
            },
            singleLine = true,
            supportingText = {
                Text(
                    text = "${name.length} / 5",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End
                )
            },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )

        Text(text = name, fontSize = 25.sp)
    }*/

    

}

@Composable
fun openNewPage() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "First_Page" ) {
        composable(route = "First_Page") {
            FirstPage(navController = navController)
        }

        composable(route = "Second_Page") {
            SecondPage(navController = navController)
        }

        composable(route = "Third_Page") {
            ThirdPage(navController = navController)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting()
    }
}