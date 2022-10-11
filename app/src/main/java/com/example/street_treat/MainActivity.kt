package com.example.street_treat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.street_treat.ui.theme.Street_treatTheme
import kotlinx.coroutines.GlobalScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState,)

        setContent {
            Street_treatTheme {
                Box(modifier = Modifier.background(color = Color.White)){
                    Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                        Startnavigation<StringRes>()
                        var chosen = GlobalScope
                    }
                    // A surface container using the 'background' color from the theme

                }





            }

        }
    }

}




@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    Street_treatTheme {
    }
}

@Composable
fun NextPage(){
    Text(text = "hhhh")
}