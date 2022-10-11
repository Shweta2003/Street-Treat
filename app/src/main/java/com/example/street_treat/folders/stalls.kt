package com.example.street_treat.folders

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import com.example.street_treat.R

data class Stalls(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @IntegerRes val stallid: Int,
    val stalladdress : String
)
val stalls = listOf(
    Stalls(R.drawable.image1,R.string.stall_name1,R.integer.stall_name1,"Punjabi Dhaba, block12, Laxmi Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image2,R.string.stall_name2,R.integer.stall_name2,"Chai ka Chaska, block10, Laxmi Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image3,R.string.stall_name3,R.integer.stall_name3,"Fantastic Fast Food, block34, Shastri Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image4,R.string.stall_name4,R.integer.stall_name4,"Hamara Hot Dog, lane-2, black-C, Gurunanak Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image5,R.string.stall_name5,R.integer.stall_name5,"Laxmi Food Court, lane no 22, Gurunanak Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image6,R.string.stall_name6,R.integer.stall_name6,"Secret Sweet Corn, lane-2,near Durga Mandir, Gurunanak Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image7,R.string.stall_name7,R.integer.stall_name7,"Doner Kabab, blockA-5, Sahitya Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image8,R.string.stall_name8,R.integer.stall_name8,"Pyaar se pizza, block 12, Laxmi Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image9,R.string.stall_name9,R.integer.stall_name9,"HHG is here, block 29, Laxmi Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image10,R.string.stall_name10,R.integer.stall_name10,"Chandu ChickenFry, lane-5, block34,Gurunanak Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image11,R.string.stall_name11,R.integer.stall_name11,"Itaewon Classes, block 12, Hall street,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image12,R.string.stall_name12,R.integer.stall_name12,"Eat and repeat, block 10, Laxmi Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image13,R.string.stall_name13,R.integer.stall_name13,"Dearest, block D, Hall Street,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image14,R.string.stall_name14,R.integer.stall_name14,"Peaceful plate, block 14, Andheri Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image15,R.string.stall_name15,R.integer.stall_name15,"Rajashree Cakes, lane no 22, Gurunanak Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image16,R.string.stall_name16,R.integer.stall_name16,"Dearest, lane 30, Hall Street,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image17,R.string.stall_name17,R.integer.stall_name17,"Treat or teeth, block D, near JJ PlaySchool,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image18,R.string.stall_name18,R.integer.stall_name18,"Sweet Lovers, block 29, Laxmi Chowk,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image19,R.string.stall_name19,R.integer.stall_name19,"Je Jagah hai Japani, Lane C,Z Hall Street,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image20,R.string.stall_name20,R.integer.stall_name20,"Have a Taste, lane-2,near Durga Mandir, Gurunanak Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image21,R.string.stall_name21,R.integer.stall_name21,"Time for Deserts, block34, Gurunanak Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.image22,R.string.stall_name22,R.integer.stall_name22,"Chop Shop , block D, near Swadhin Auditorium, Gurunanak Road,  akurdi, Pune - 411035"),
    Stalls(R.drawable.randombutton,R.string.stall_name23,R.integer.stall_name23,"")

)
