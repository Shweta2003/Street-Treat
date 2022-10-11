package com.example.street_treat.folders

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.street_treat.R
import com.example.street_treat.Utils.Navigationscreen

@Composable
fun Successful(navcontroller: NavHostController, imm: String) {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        val different = imm.split(",")
        val p = different[0] + "," + different[1] + "," + different[3]
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.surface)
            .height(60.dp)) {
            val image = painterResource(id = R.drawable.confirmingbutton)
            Icon(
                painter = image,
                contentDescription = null, tint = Color.Unspecified
            )
            Text(text = "THANKYOU ${different[1]}!!!\n Payment has been made!!",
                textAlign = TextAlign.Center,
                modifier = Modifier.align(alignment = Alignment.Bottom),
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h2)
        }
        val image = painterResource(id = R.drawable.smile)
        Box(modifier = Modifier.fillMaxSize()) {
            Image(painter = image, contentDescription = "Payment Success",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize())
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom) {
                    IconButton(onClick = {
                        navcontroller.popBackStack()
                        navcontroller.currentBackStackEntry?.savedStateHandle?.set("im",
                            p.toString())
                        navcontroller.navigate(Navigationscreen.Bill.route)
                    }) {
                        val image = painterResource(id = R.drawable.th_removebg_preview)
                        Image(painter = image, contentDescription = null,
                            modifier = Modifier.size(200.dp))
                    }
                }
            }
        }
    }


}

