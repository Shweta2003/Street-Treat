package com.example.street_treat.folders
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.street_treat.R
import com.example.street_treat.Utils.Navigationscreen

@Composable
fun Paymentpage(navcontroller: NavHostController,price:String) {

    Column (modifier = Modifier
        .fillMaxWidth().fillMaxHeight().background(color = MaterialTheme.colors.onPrimary)) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.surface)
            .height(60.dp)) {
            val image = painterResource(id = R.drawable.paymenticon)
            Icon(
                painter = image,
                contentDescription = null,tint = Color.Unspecified
            )
            Text(text = " MK PAYMENT",
                modifier = Modifier.align(alignment = Alignment.Bottom),
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h6)

        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Pay : ${price}",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h3)
        var s1 = MaterialTheme.colors.onPrimary
        var s2 = MaterialTheme.colors.background
        var color1 = remember { mutableStateOf(s1) }
        var color2 = remember { mutableStateOf(s1) }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .background(color = MaterialTheme.colors.onPrimary),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center) {


                Button(
                    onClick = {
                        if (color1.value == s1 && color2.value == s1){
                            color1.value = s2
                        }
                        else if (color1.value == s2 || color2.value == s2){
                            color1.value = s1
                        }

                    },colors = ButtonDefaults.outlinedButtonColors(color1.value)
                )
                {
                    val Image = painterResource(id = R.drawable.cash_button)
                    Image(painter = Image, contentDescription = null,
                        Modifier.size(150.dp))
                }

                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = {
                    if (color2.value == s1 && color1.value == s1){
                        color2.value = s2
                    }
                    else if (color2.value == s2 || color1.value == s2){
                        color2.value = s1
                    }
                },
                    colors = ButtonDefaults.outlinedButtonColors(color2.value)) {
                    val image = painterResource(id = R.drawable.pay_button)
                    Image(painter = image, contentDescription = null,
                        Modifier.size(150.dp))
                }

        }
        how(color1 ,navcontroller)
    }
}


        @Composable
        fun how(color1: MutableState<Color>,navcontroller: NavHostController) {
            var text by remember { mutableStateOf("") }
            var text2 by remember { mutableStateOf("") }
            var text3 by remember { mutableStateOf("") }
            Spacer(modifier = Modifier.height(30.dp))
            Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.background(color = MaterialTheme.colors.onPrimary)){
                Text(text = "ENTER DETAILS :  ",
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.h2)
                Spacer(modifier = Modifier.height(30.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween)  {
                    Text(text = "NAME",
                        color = MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.h2)
                    TextField(
                        value = text,
                        onValueChange = { text = it },
                        Modifier
                            .background(color = Color.Transparent)
                            .border(width = 4.dp, color = Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "ID",
                        color = MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.h2)
                    TextField(
                        value = text2,
                        onValueChange = { text2 = it },
                        Modifier

                            .background(color = Color.Transparent)
                            .border(width = 4.dp, color = Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "ENTER UPID(not compulsory) TO PAY ONLINE",
                        color = MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.h2,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                    TextField(
                        value = text3,
                        onValueChange = { text3 = it },
                        Modifier
                            .background(color = Color.Transparent)
                            .border(width = 4.dp, color = Color.Black)
                    )
                var s2 = MaterialTheme.colors.background
                var data1 = text+","+text2+","+"1"//1 to pay
                var data2 = text+","+text2+","+text3+","+"0"// 0 for already paid
                Spacer(modifier = Modifier.height(60.dp))
                IconButton(onClick = {
                    if (color1.value == s2){
                        navcontroller.currentBackStackEntry?.savedStateHandle?.set("imm",data2.toString())
                        navcontroller.navigate(Navigationscreen.Successful.route)
                    }
                    else{
                        navcontroller.currentBackStackEntry?.savedStateHandle?.set("im",data1.toString())
                        navcontroller.navigate(Navigationscreen.Bill.route)

                    }
                }){
                    val Image = painterResource(id = R.drawable.proceed)
                    Image(painter = Image, contentDescription = null,
                        Modifier
                            .width(270.dp)
                            .height(70.dp))
                }
                Spacer(modifier = Modifier.height(30.dp))
            }
        }