package com.example.street_treat

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.example.street_treat.Utils.Navigationscreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.street_treat.folders.*
import com.example.street_treat.ui.theme.FirstpageButton

//create navigation host controller to navigate from one screen to other


@Composable
fun <a : Any> Startnavigation(){
    val navcontroller = rememberNavController()
    NavHost(navController = navcontroller, startDestination = Navigationscreen.Firstpage.route){
        composable(Navigationscreen.Firstpage.route){
            FirstpageButton(navcontroller)
        }
        composable(Navigationscreen.Secondpage.route){
            Secondpage(navcontroller)
        }
        composable(Navigationscreen.Thirdpage.route) {
            val answer = navcontroller.previousBackStackEntry?.savedStateHandle?.get<a>("stallid")
            Log.d("try", answer.toString())
            Thirdpage(navcontroller,answer.toString())

        }
        composable(Navigationscreen.Confirmation.route){
            val chosen = navcontroller.previousBackStackEntry?.savedStateHandle?.get<a>("chosen")
            Confirmation(navcontroller,chosen.toString())
        }
        composable(Navigationscreen.Paymentpage.route){

            var price = navcontroller.previousBackStackEntry?.savedStateHandle?.get<Double>("price")
            Paymentpage(navcontroller, price = price.toString())
        }
        composable(Navigationscreen.Successful.route){
            val imm = navcontroller.previousBackStackEntry?.savedStateHandle?.get<String>("imm")
            Successful(navcontroller,imm.toString())
        }
        composable(Navigationscreen.Bill.route){
            val im = navcontroller.previousBackStackEntry?.savedStateHandle?.get<String>("im")
            val passon = navcontroller.previousBackStackEntry?.savedStateHandle?.get<String>("passon")

            Bill(navcontroller,imm = im.toString(), choice = passon.toString())
        }
    }
}
