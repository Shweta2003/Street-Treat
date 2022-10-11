package com.example.street_treat.folders
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.street_treat.R
import com.example.street_treat.Utils.Navigationscreen

@Composable
fun Confirmation(navController: NavHostController, el: String){
    navController.currentBackStackEntry?.savedStateHandle?.set("passon",el)
    val d1 = ","
    val d2 = "["
    val d3 = "]"
    val str = el.split(d1,d2,d3)
    val last = str.lastIndex
    val s1 = mutableListOf<String>()
    val s2 = mutableListOf<String>()
    for(i in 0..last){
        if (i%2 == 0){
            s1.add(str[i])
        }
        else{
            s2.add(str[i])
        }
    }
    var a = 0.00
    s2.add(0,"")
        for (i in s1) {
            if (i.isNotBlank()){
                a += i.toDouble()

            }
        }
    Column (modifier = Modifier.fillMaxHeight().background(color = MaterialTheme.colors.onPrimary)){
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(color = MaterialTheme.colors.surface),
        horizontalArrangement = Arrangement.SpaceBetween){
            IconButton(onClick = {
                navController.popBackStack()
                navController.navigate(Navigationscreen.Secondpage.route)
            }){
                val image = painterResource(id = R.drawable.backbutton)
                androidx.compose.foundation.Image(painter = image, contentDescription = null,
                    Modifier.size(90.dp))
            }

            val image2 = painterResource(id = R.drawable.confirmingbutton)
            Icon(
                painter = image2,
                contentDescription = null,tint = Color.Unspecified,
                modifier = Modifier.wrapContentSize()
            )
        }
        Text(text = "Confirm Order",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.width(15.dp))
        for (i in 0..last / 2) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = s2[i],
                    textAlign = TextAlign.Start,
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.h2)
                Text(text = s1[i],
                    textAlign = TextAlign.End,
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.body1)
            }
        }
        Spacer(modifier = Modifier.height(120.dp))
        Text(text = "Your total Bill : Rs. ${a}",
        modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h3)
        IconButton(onClick = {
            navController.popBackStack()
            navController.currentBackStackEntry?.savedStateHandle?.set("price",a)

            navController.navigate(Navigationscreen.Paymentpage.route)


        }, modifier = Modifier
            .background(color = Color.Transparent)
            .border(width = 0.dp, color = Color.Transparent)
            .align(alignment = Alignment.CenterHorizontally)
            .clip(RoundedCornerShape(100))
            .height(100.dp)) {
            val image = painterResource(id = R.drawable.confirm_button)
            androidx.compose.foundation.Image(painter = image,
                contentDescription = null)
        }
    }
}