package com.example.street_treat

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.street_treat.Utils.Navigationscreen
import com.example.street_treat.folders.Stalls
import com.example.street_treat.folders.stalls


@Composable
fun Secondpage(navHostController: NavHostController) {
    Column() {
        TopAppBar(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
            backgroundColor = MaterialTheme.colors.surface,
            contentColor = MaterialTheme.colors.onPrimary) {
            Tooltopdesign()
        }
        Scaffold(
        ) {
            val i = 1
            LazyColumn(modifier = Modifier.background(color = MaterialTheme.colors.background)
            ) {
                items(stalls) {
                    val go = pass_id(stalls = it)
                    Button(onClick = {
                        navHostController.currentBackStackEntry?.savedStateHandle?.set("stallid",
                            go.toShort())
                        navHostController.navigate(Navigationscreen.Thirdpage.route)
                    }, modifier = Modifier.background(color = MaterialTheme.colors.onPrimary)
                        .clip(RoundedCornerShape(0))
                    )
                    {
                        Stallall(stalls = it)

                    }
                }
            }
        }
    }
}

@Composable
fun Stallall(stalls: Stalls, modifier: Modifier = Modifier) {
    Card(
        elevation = 4.dp,
        modifier = modifier
            .padding(8.dp).background(color = MaterialTheme.colors.background)


    ) {
        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colors.onPrimary)
                .clip(RoundedCornerShape(50.dp))

                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow,
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(153.dp)
                    .padding(4.dp)
            ) {
                Stallicon(stalls.imageResourceId)
                StallInformation(stalls.name)
                Spacer(Modifier.weight(0.2f))


            }
        }
    }
}

@Composable
fun Tooltopdesign(){
    Row(modifier = Modifier.background(color = MaterialTheme.colors.surface), verticalAlignment = Alignment.Bottom) {
        Spacer(modifier = Modifier.size(8.dp))
        val image = painterResource(id = R.drawable.menuicon_removebg_preview)
        Icon(
            painter = image,
            contentDescription = null,tint = Color.Unspecified,
            modifier = Modifier
                .wrapContentSize()
                .size(60.dp)
        )
        Text(
            text = "  Street  Treat",
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h6,
        )

    }
}

@Composable
fun Stallicon(@DrawableRes stallicon: Int, modifier: Modifier = Modifier) {

    Image(
        modifier = modifier
            .size(140.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(50)),
        contentScale = ContentScale.Crop,
        painter = painterResource(stallicon),
        contentDescription = null
    )

}

@Composable
fun StallInformation(@StringRes stallname: Int, modifier: Modifier = Modifier) {
        Text(
            text = stringResource(stallname),
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h3,
            modifier = modifier
                .padding(top = 35.dp)
                .fillMaxWidth()
        )
    }

@Composable
fun pass_id(stalls: Stalls): Int {
    var value = 0
    if (stalls.stallid == R.integer.stall_name23){
        var rand = (0..22).random()
        value = rand

    }

    else{
        value = stalls.stallid

    }
    return value
}