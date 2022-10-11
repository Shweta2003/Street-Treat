package com.example.street_treat.Utils

import com.example.street_treat.folders.Stalls


sealed class Navigationscreen(val route : String) {
    //route will give unique name to each screen
    object Firstpage : Navigationscreen ( route = "firstpage")
    object Secondpage : Navigationscreen(route = "secondpage")
    object Thirdpage : Navigationscreen(route = "thirdpage")
    object Confirmation : Navigationscreen(route = "Confirmation")
    object Paymentpage : Navigationscreen(route = "paymentpage")
    object Successful : Navigationscreen(route = "successful")
    object Bill : Navigationscreen(route = "bill")
}