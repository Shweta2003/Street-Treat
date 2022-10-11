package com.example.street_treat.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.street_treat.R
import com.example.street_treat.Utils.Navigationscreen

@Composable
fun FirstpageButton(navHostController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)) {
        Image(
            painterResource(id = R.drawable.images2),
            contentDescription = "",
            contentScale = ContentScale.FillBounds, // or some other scale
            modifier = Modifier.matchParentSize()
        )

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(283.dp))
                Row() {
                    Spacer(modifier = Modifier.width(130.dp))
                    IconButton(
                        onClick = {
                            navHostController.popBackStack()
                            navHostController.navigate(Navigationscreen.Secondpage.route)
                        }, modifier = Modifier.shadow(elevation = 10.dp) ){

                        var img = painterResource(id = R.drawable.toicon_removebg_preview)
                        Image(painter = img, contentDescription = null, contentScale = ContentScale.FillBounds,
                            modifier = Modifier.animateContentSize(
                                animationSpec = spring(
                                    dampingRatio = Spring.DampingRatioMediumBouncy,
                                    stiffness = Spring.StiffnessLow,
                                )
                            )
                                .size(165.dp)
                                .shadow(elevation = 30.dp))

                    }
                }
                
            }


        }
    }
}



