package com.example.street_treat.folders

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.Navigator
import androidx.navigation.compose.rememberNavController
import com.example.street_treat.R
import com.example.street_treat.Utils.Navigationscreen
@Composable
fun Thirdpage(navcontroller: NavHostController, result: String) {
    Column{
        var r = mutableListOf<String>()
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = MaterialTheme.colors.surface), horizontalArrangement = Arrangement.SpaceBetween){

            IconButton(onClick = {

            navcontroller.navigate(Navigationscreen.Secondpage.route)
            }){
                val Image = painterResource(id = R.drawable.backbutton)
                androidx.compose.foundation.Image(painter = Image, contentDescription = null,
                    Modifier.size(90.dp))
            }

            Toolbardesign()

        IconButton(onClick = {
            navcontroller.currentBackStackEntry?.savedStateHandle?.set("id",result)
            navcontroller.navigate(Navigationscreen.Confirmation.route)
        },modifier = Modifier
            .clip(RoundedCornerShape(50))) {
                val Image = painterResource(id = R.drawable.next_button_removebg_preview)
                androidx.compose.foundation.Image(painter = Image, contentDescription = null,
                Modifier.size(90.dp))
            }
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.onPrimary)) {
            when (result) {
                "0" -> {
                    LazyColumn {
                        items(menu_1) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "1" -> {
                    LazyColumn() {
                        items(menu_2) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }

                }
                "2" -> {
                    LazyColumn() {
                        items(menu_3) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "3" -> {
                    LazyColumn() {
                        items(menu_4) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "4" -> {
                    LazyColumn() {
                        items(menu_5) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "5" -> {
                    LazyColumn() {
                        items(menu_6) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "6" -> {
                    LazyColumn() {
                        items(menu_7) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "7" -> {
                    LazyColumn() {
                        items(menu_8) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "8" -> {
                    LazyColumn() {
                        items(menu_9) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "9" -> {
                    LazyColumn() {
                        items(menu_10) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "10" -> {
                    LazyColumn() {
                        items(menu_11) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "11" -> {
                    LazyColumn() {
                        items(menu_12) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "12" -> {
                    LazyColumn() {
                        items(menu_13) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "13" -> {
                    LazyColumn() {
                        items(menu_14) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "14" -> {
                    LazyColumn() {
                        items(menu_15) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "15" -> {
                    LazyColumn() {
                        items(menu_18) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "16" -> {
                    LazyColumn() {
                        items(menu_16) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "17" -> {
                    LazyColumn() {
                        items(menu_17) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "18" -> {
                    LazyColumn() {
                        items(menu_18) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "19" -> {
                    LazyColumn() {
                        items(menu_19) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }
                "20" -> {
                    LazyColumn() {
                        items(menu_20) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }

                "21" -> {
                    LazyColumn() {
                        items(menu_21) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }

                "22" -> {
                    LazyColumn() {
                        items(menu_22) {
                            r = Texting(menu_1 = it, list = r)
                            navcontroller.currentBackStackEntry?.savedStateHandle?.set("chosen",r)
                        }
                    }
                }

            }
        }
    }




}

@Composable
fun Texting (menu_1: Menu_1, list: MutableList<String>): MutableList<String> {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation = 0.dp)
            .clickable(
                onClick = {
                }
            )
    ) {
        var s1 = MaterialTheme.colors.onPrimary
        var s2 = MaterialTheme.colors.background
        var color = remember { mutableStateOf(s1) }

        TextButton(
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .fillMaxWidth()
                .padding(all = 3.dp)
                .background(color = MaterialTheme.colors.onPrimary)
                .clip(RoundedCornerShape(30)),


            colors = ButtonDefaults.buttonColors(backgroundColor = color.value),
            onClick = {

                if(menu_1.selected == false) {
                    menu_1.selected = true
                    color.value = s2
                }
                else if(menu_1.selected == true){
                    menu_1.selected = false
                    color.value = s1

                }
            }) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        modifier = Modifier
                            .size(90.dp)
                            .padding(top = 8.dp, end = 5.dp)
                            .clip(RoundedCornerShape(50)),
                        contentScale = ContentScale.Crop,
                        painter = painterResource(menu_1.image_stall),
                        contentDescription = null
                    )

                    Text(text = menu_1.item_name,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(top = 8.dp),
                        color = MaterialTheme.colors.onSurface,
                        style = MaterialTheme.typography.h2)
                }


                Text(text = menu_1.price.toString(),
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(top = 15.dp),
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.body1)
            }

        }
    }
    if (menu_1.selected == true){
        list.add(menu_1.item_name)
        list.add( menu_1.price.toString())
    }
    else if (menu_1.selected == false){
        if ( menu_1.item_name in list){
            list.remove(menu_1.item_name)
            list.remove(menu_1.price.toString())
        }
    }
    return list

}

@Composable
fun Toolbardesign(){
    Row (horizontalArrangement = Arrangement.End){
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Menu",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h6)

    }
}





