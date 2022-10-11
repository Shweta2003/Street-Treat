package com.example.street_treat.folders

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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
import com.example.street_treat.ui.theme.Dark
import com.example.street_treat.ui.theme.backdark
import com.example.street_treat.ui.theme.light

@Composable
fun Bill(navcontroller: NavHostController, imm: String,choice: String) {
    var ran = (0..1000).shuffled().last()
    val b = imm.split(",")
    val c = choice.split("[",",","]")
    //price list
    var d = mutableListOf<String>()
    //name list
    var e = mutableListOf<String>()
    val last = c.lastIndex
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.surface)
            .height(80.dp)) {
            val image = painterResource(id = R.drawable.recipticon)
            Icon(
                painter = image,
                contentDescription = null,tint = Color.Unspecified,
                modifier = Modifier.clip(RoundedCornerShape(50))
            )
            Spacer(modifier = Modifier.width(70.dp))
            Text(text = "RECIPT",
                textAlign = TextAlign.Center,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h6)

        }
        Text(text = "Order ID : ${ran}FROMSTREET_TREAT22",
            textAlign = TextAlign.Center,
            color = Color.Black,
            style = MaterialTheme.typography.h3)
        Spacer(Modifier.height(50.dp))
        Text(text = "NAME   :   ${b[0]}",
            textAlign = TextAlign.Start,
            color = Color.Black,
            style = MaterialTheme.typography.h2,
            modifier = Modifier.fillMaxWidth())

        Text(text = "ID      :  ${b[1]}",
            textAlign = TextAlign.Start,
            color = Color.Black,
            style = MaterialTheme.typography.h2,
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(30.dp))
        for(i in 1..last){
            if (i%2 == 0){
                d.add(c[i])
            }
            else{
                e.add(c[i])
            }
        }
        var sum = 0.00
        for (s in d){
            sum += s.toDouble()
        }
        val el2 = d.lastIndex
        for (i in 0..el2){
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text = " ${e[i]}",
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    style = MaterialTheme.typography.h2)

                Text(text = "${d[i]}  ",
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    style = MaterialTheme.typography.h2)
            }
            Spacer(modifier = Modifier.height(10.dp))

        }
        Spacer(modifier = Modifier.height(50.dp))
        if(b[2].toInt() == 0){
            Text(text = "PAYMENT OF RUPEES ${sum} DONE !!!!",
                textAlign = TextAlign.Center,
                color = Dark,
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 6.dp, color = Dark, shape = RoundedCornerShape(15))
                    .background(light))
        }
        else{
            Text(text = "PAYMENT OF RUPEES ${sum} TO BE DONE !!!!",
                textAlign = TextAlign.Center,
                color = backdark,
                style = MaterialTheme.typography.h3,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 6.dp, color = backdark, shape = RoundedCornerShape(15))
                    .background(color = MaterialTheme.colors.onPrimary))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {
            var time = (0..60).random()
            Text(text = "You can pickup your order in ${time} minutes!! ",
                textAlign = TextAlign.End,
                color = Color.Black,
                style = MaterialTheme.typography.h2,
                modifier = Modifier.fillMaxWidth())
            Text(text = " Thankyou for Ordering!!! ",
                textAlign = TextAlign.End,
                color = Color.Black,
                style = MaterialTheme.typography.h2,
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "ADDRESS : Near DY Patil Complex, Akurdi, Pune - 411035 ",
                textAlign = TextAlign.End,
                color = Color.Black,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.fillMaxWidth())
        }

    }


}