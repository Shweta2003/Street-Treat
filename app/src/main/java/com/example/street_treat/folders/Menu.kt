package com.example.street_treat.folders

import androidx.annotation.DrawableRes

import com.example.street_treat.R

data class Menu_1(
    @DrawableRes val image_stall: Int,
    var item_name: String,
    var price: Double,
    var selected: Boolean = false,

)


val menu_1 = mutableListOf(
    Menu_1(R.drawable.mixveg,"Mix Veg",115.00),
    Menu_1(R.drawable.v2,"Veg Kolhapuri",120.00),
    Menu_1(R.drawable.v3,"Veg Hydrabadi",120.00),
    Menu_1(R.drawable.v4,"Veg Handi",135.00),
    Menu_1(R.drawable.v5,"Alu Masal",115.00),
    Menu_1(R.drawable.v6,"Alu jeera",100.00),
    Menu_1(R.drawable.v7,"Dum Alu Punjabi",120.00),

    Menu_1(R.drawable.v8,"Roti",25.00),
    Menu_1(R.drawable.v9,"Butter Nan",35.00),
    Menu_1(R.drawable.v10,"Onion Kulcha",40.00),
    Menu_1(R.drawable.v11,"Paneer Paratha", 60.00),

    Menu_1(R.drawable.v12,"Baby Corn Masala",125.00),
    Menu_1(R.drawable.v13,"Paneer Pakoda",150.00),
    Menu_1(R.drawable.v14,"Paneer Tikka",155.00),
    Menu_1(R.drawable.v16,"Veg Sheek Kabab",150.00),
    Menu_1(R.drawable.v15,"Paneer Manchurian",160.00),
    Menu_1(R.drawable.v17,"Paneer butter Garlic",170.00),

    Menu_1(R.drawable.v18,"Boondi Raita",80.00),

    Menu_1(R.drawable.v19,"Lassi",45.00),
    Menu_1(R.drawable.v20,"Butter Milk",35.00)
)

val menu_2 = mutableListOf(
    Menu_1(R.drawable.v21,"Crispy Mustard \nChicken",214.00),
    Menu_1(R.drawable.v22,"Maple Bourbon\n Chicken",216.00),
    Menu_1(R.drawable.v23,"Southern-Fried\n Chicken",219.00),
    Menu_1(R.drawable.v24,"Super-Crunchy \nFried Chicken",222.00),
    Menu_1(R.drawable.v25,"Baked Chicken \nAlla Milanese",219.00),
    Menu_1(R.drawable.v26,"Fried Chicken Tenders",227.00),

    Menu_1(R.drawable.v27,"6pc. Chicken Wings",222.00),
    Menu_1(R.drawable.v28,"2pc. Chicken Combo",236.00),
    Menu_1(R.drawable.v29,"Popcorn Nuggets \nCombo",248.00),
    Menu_1(R.drawable.v28,"4pc. grilled\n Chicken COmbo",235.00),
    Menu_1(R.drawable.v24,"8pc. Crispy \nBucket Combo",250.00),
    Menu_1(R.drawable.v30,"Tenders Meal Combo",230.00)
)

val menu_3 = mutableListOf(
    Menu_1(R.drawable.v31,"Dokk Suop\n(Rice cake & Soup)",880.00,),
    Menu_1(R.drawable.v32,"Deonjangjjligae\n(Bean paste \n soup with veg \nand green onion)",880.00),
    Menu_1(R.drawable.v33,"Galbitang\n(Beef rib with veg)",900.00),
    Menu_1(R.drawable.v34,"Scon Tofu\n(Soft Tofu Stew)",880.00),
    Menu_1(R.drawable.v35,"Dokkmandu Soup",850.00),
    Menu_1(R.drawable.v36,"Mandu Soup",890.00),
    Menu_1(R.drawable.v37,"Kimchijjigae\n(Kimchi with \nveg's soup)",880.00),
    Menu_1(R.drawable.v39,"Chadol Deonjangjjgae",870.00),
    Menu_1(R.drawable.v40,"Yukgaejang\n(Spicy beef with veg)",910.00),
    Menu_1(R.drawable.v41,"Samgaetang\n(chicken Soup)",1200.00),
    Menu_1(R.drawable.v42,"LA Galbi\n(Beef Short Rib,\n marinated soy sauce\n seasoning mixture)",1000.00),
    Menu_1(R.drawable.v43,"Chicken Bulgogi",780.00),
    Menu_1(R.drawable.v44,"Grilled with Mackerel",2500.00),
    Menu_1(R.drawable.v45,"Bulgogi(Marinated\n with Beef)",2000.00),
    Menu_1(R.drawable.v46,"Jaeyokbokkem\n(Marinated with spicy\n sauce & boiled Pork)",1600.00),
    Menu_1(R.drawable.v47,"Pork Belly",870.00),
    Menu_1(R.drawable.v48,"Bibimbab",880.00),
    Menu_1(R.drawable.v49,"Hot Pot Bibimbab",1200.00),
    Menu_1(R.drawable.v50,"Chadolbagi Sook-\njubokkem",2900.00)
)

val menu_4 = listOf(
    Menu_1(R.drawable.v51,"Value Taco\n(Crunchy or soft)",179.00),
    Menu_1(R.drawable.v52,"Chicken al\n Carbon Taco",179.00),
    Menu_1(R.drawable.v53,"Habanero Grilled \nChicken Taco",189.00),
    Menu_1(R.drawable.v55,"Jacked Up Value\n BRC Burrito",80.00),
    Menu_1(R.drawable.v56,"Del's BRC Burrito",80.00),
    Menu_1(R.drawable.v55,"Chicken Crunch\n Burrito",100.00),
    Menu_1(R.drawable.v56,"Mini Cheddar\n Quesadilla",180.00),
    Menu_1(R.drawable.v58,"Chicken Rollers",200.00),
    Menu_1(R.drawable.v59,"3 Layer Queso Nachos",159.00),

    Menu_1(R.drawable.v60,"Minni Churro",150.00),
    Menu_1(R.drawable.v61,"Donut Bites 4pc.",169.00),
    Menu_1(R.drawable.v62,"Value Iced Coffee",169.00),
    Menu_1(R.drawable.v63,"Med. Brewed Iced Tea",169.00)

)

val menu_5 = listOf(
    Menu_1(R.drawable.v65,"Apple Pie",300.00),
    Menu_1(R.drawable.v66,"BLueberry pie",270.00),
    Menu_1(R.drawable.v66,"Cherry Pie",270.00),
    Menu_1(R.drawable.v68,"Lemon Tart",250.00),
    Menu_1(R.drawable.v69,"Cupckaes (each pc.)",70.00),
    Menu_1(R.drawable.v70,"Lava Cake 3",80.00),
    Menu_1(R.drawable.v71,"Passion Mousse Torte", 90.00),
    Menu_1(R.drawable.v72,"Milk Chocolate \nCHip(each pc.)",75.00),
    Menu_1(R.drawable.v73,"Choco Chip With \n Walnut(each pc.)",75.00),
    Menu_1(R.drawable.v74,"Chocolate \nchip(each pc.)",75.00),
    Menu_1(R.drawable.v75,"White choco \nMacademia(each pc.)",70.00),
    Menu_1(R.drawable.v76,"Pecan Caramel\n Brownie(each pc.)",75.00),
    Menu_1(R.drawable.v77,"Brownie Assor-\ntment(4 pc.)",140.00),
    Menu_1(R.drawable.v79,"7 Layer Bar(each pc.)",85.00),
    Menu_1(R.drawable.v78,"Rasberry",75.00)
)

val menu_6 = listOf(
    Menu_1(R.drawable.v80,"Pineapple Cake(/kg)",450.00),
    Menu_1(R.drawable.v81,"Butter Scotch \nCake(/kg)",500.00),
    Menu_1(R.drawable.v82,"Black Forest Cake\n(/kg)",500.00),
    Menu_1(R.drawable.v87,"Italian Chocolate\n Cake(/kg)",500.00),
    Menu_1(R.drawable.v94,"White Truffle \nCake(/kg)",550.00),
    Menu_1(R.drawable.v86,"Total Chocolate \nCake(/kg)",600.00),
    Menu_1(R.drawable.v93,"Fig Rosen Chocol-\nate Cake(/kg)",600.00),
    Menu_1(R.drawable.v91,"Choco Almond\n Cake(/kg)",500.00),
    Menu_1(R.drawable.v90,"Fresh Mango Cake\n(/kg)",600.00),
    Menu_1(R.drawable.v82,"Chocolate Black \nForest Cake(/kg)",550.00),
    Menu_1(R.drawable.v90,"Chocolate Butter \nScotch Cake(/kg)",550.00),
    Menu_1(R.drawable.v89,"Coconut Cake(/kg)",450.00),
    Menu_1(R.drawable.v88,"Fig Cake(/kg)",600.00),
    Menu_1(R.drawable.v87,"Choco Strawberry \nCake(/kg)",600.00)
)
val menu_7 = listOf(
    Menu_1(R.drawable.v95,"Napolean Cake(1/2 kg)",170.00),
    Menu_1(R.drawable.v96,"Almond Apricot\n Cake(1/2 kg)",170.00),
    Menu_1(R.drawable.v91,"Almond Flore-\nntine(1/2 kg)",170.00),
    Menu_1(R.drawable.v70,"Baklava(1/2 kg)",150.00),
    Menu_1(R.drawable.v97,"Raisin Oatmeal \nCookie(6 pc.)",170.00),
    Menu_1(R.drawable.v98,"Chocolate Oatmeal\n Cookie(6 pc.)",170.00),
    Menu_1(R.drawable.v99,"Pecan Tart(1/2 kg)",100.00),
    Menu_1(R.drawable.v100,"Tihini(1/2 kg)",80.00),
    Menu_1(R.drawable.v101,"French Macaron(8 pc.)",200.00),
    Menu_1(R.drawable.v97,"Birdnest Cookie(6 pc.)",140.00),
    Menu_1(R.drawable.v102,"Buckwheat \nCookie(6 pc.)",155.00),
    Menu_1(R.drawable.v98,"Almond Cookie(6 pc.)",160.00),
    Menu_1(R.drawable.v103,"Cream Purlee(4 pc.)",230.00)
)

val menu_8 = listOf(
    Menu_1(R.drawable.v104,"Daal Makhni",230.00),
    Menu_1(R.drawable.v105,"Daal Tadka",230.00),
    Menu_1(R.drawable.v106,"Yellow Daal Tadka",230.00),
    Menu_1(R.drawable.v107,"Palak Paneer",230.00),
    Menu_1(R.drawable.v108,"Malai Kofta",270.00),
    Menu_1(R.drawable.v109,"Hara Bhara Kofta",270.00),
    Menu_1(R.drawable.v14,"Paneer Tikka Masala",270.00),
    Menu_1(R.drawable.v110,"Paneer Afgani",270.00),
    Menu_1(R.drawable.v111,"Paneer Kalimirch",270.00),
    Menu_1(R.drawable.v112,"Paneer Khurchan",270.00),
    Menu_1(R.drawable.v113,"Paneer Butter Masala",300.00),
    Menu_1(R.drawable.v114,"Soya Bhurji",300.00,),
    Menu_1(R.drawable.mixveg,"Mix Veg",250.00),
    Menu_1(R.drawable.v116,"Aloo Gobi",230.00),
    Menu_1(R.drawable.v115,"Mutter Mushroon",230.00),
    Menu_1(R.drawable.v117,"Shahi Paneer",290.00),
    Menu_1(R.drawable.v118,"Veg Korma",290.00),
    Menu_1(R.drawable.v119,"Sarson ka Saag",140.00),

    Menu_1(R.drawable.v8,"Roti",40.00),
    Menu_1(R.drawable.v9,"Butter Nan",50.00),
    Menu_1(R.drawable.v10,"Onion Kulcha",55.00),
    Menu_1(R.drawable.v11,"Paneer Paratha", 70.00),

)
val menu_9 = listOf(
    Menu_1(R.drawable.v120,"Strawberry Milkshake",160.00),
    Menu_1(R.drawable.v121,"Chocolate Milkshake",160.00),
    Menu_1(R.drawable.v122,"Vanilla Milkshake",160.00),
    Menu_1(R.drawable.v123,"Banana Milkshake",160.00),
    Menu_1(R.drawable.v124,"Oreo Milkshake",160.00),
    Menu_1(R.drawable.v125,"Mint Areo Milkshake",160.00),
    Menu_1(R.drawable.v127,"Chocolate orange\n Milkshake",160.00),
    Menu_1(R.drawable.v129,"Crunchie",160.00),
    Menu_1(R.drawable.v130,"Millionaires \nShortcake",160.00),
    Menu_1(R.drawable.v131,"Waffle Cone",80.00),
    Menu_1(R.drawable.v132,"Scoop Sundae",170.00),
    Menu_1(R.drawable.v133,"Pop Tarts",80.00),
    Menu_1(R.drawable.v134,"Nutella & \nMarshmallow\n Toasties",120.00),
    Menu_1(R.drawable.v135,"Peanut Butter & \nMarshmallow \nToasties",120.00),
    Menu_1(R.drawable.v136,"Blue Bubblegum",100.00),
    Menu_1(R.drawable.v138,"Chocolate floats",120.00)
)

val menu_13 = listOf(
    Menu_1(R.drawable.v137,"Long Jamun",35.00),
    Menu_1(R.drawable.v139,"Carrot Halwa",58.00),
    Menu_1(R.drawable.v140,"Moongdhal Halwa",60.00),
    Menu_1(R.drawable.v141,"Bagam Halwa",124.00),
    Menu_1(R.drawable.v142,"Rasgulla",23.00),
    Menu_1(R.drawable.v143,"Bengali Roll",38.00),
    Menu_1(R.drawable.v145,"Choice of\n Bengali Sweets",42.00),
    Menu_1(R.drawable.v146,"Kesar Bati",42.00),
    Menu_1(R.drawable.v147,"Basundhi(100gms)",58.00),
    Menu_1(R.drawable.v148,"Rasmalai (2pcs)",56.00),
    Menu_1(R.drawable.v149,"Chocolate Doughnut",48.00),
    Menu_1(R.drawable.v150,"Choco Mousse",56.00),
    Menu_1(R.drawable.v151,"Passion Fruit Mousse",56.00),
    Menu_1(R.drawable.v152,"Cold Kesar Badam Milk",76.00),
    Menu_1(R.drawable.v19,"Lassi (Sweet/Salt)",55.00)
)

val menu_11 = listOf(
    Menu_1(R.drawable.v153,"Syake",58.00),
    Menu_1(R.drawable.v154,"Syake Saisi",58.00),
    Menu_1(R.drawable.v155,"Izumidai",65.00),
    Menu_1(R.drawable.v156,"Izumidai saisi",65.00),
    Menu_1(R.drawable.v157,"Philly kunsei syake",72.00),
    Menu_1(R.drawable.v158,"Ebi",50.00),
    Menu_1(R.drawable.v160,"Maguro",77.00),
    Menu_1(R.drawable.v162,"Inari",60.00),
    Menu_1(R.drawable.v159,"Kunsei syake",77.00),
    Menu_1(R.drawable.v153,"Masago",55.00),
    Menu_1(R.drawable.v163,"Karai",73.00),
    Menu_1(R.drawable.v161,"Maki de tartare\n/ 2 morceaux",99.00),
    Menu_1(R.drawable.v164,"Tartare",120.00)
)

val menu_12 = listOf(
    Menu_1(R.drawable.v165,"Simple Chai",10.00),
    Menu_1(R.drawable.v166,"Teh Tarik",10.00),
    Menu_1(R.drawable.v167,"Masala Tea",15.00),
    Menu_1(R.drawable.v168,"Tea Masala Bru",15.00),
    Menu_1(R.drawable.v169,"Tea Halia",12.00),
    Menu_1(R.drawable.v170,"Milo Bru",12.00),
    Menu_1(R.drawable.v180,"Nescafe",15.00),
    Menu_1(R.drawable.v171,"Nescafe Bru",15.00),
    Menu_1(R.drawable.v172,"Nescafe Godzilla",15.00),
    Menu_1(R.drawable.v173,"Neslo",15.00),
    Menu_1(R.drawable.v176,"Horlicks Halia",18.00),
    Menu_1(R.drawable.v174,"Aaloo Paratha",20.00),
    Menu_1(R.drawable.v175,"Aloo Pyaaz Paratha",20.00),
    Menu_1(R.drawable.v177,"Quater Butter Paratha",15.00),
    Menu_1(R.drawable.v178,"Mix Paratha",30.00),
    Menu_1(R.drawable.v179,"Paneer Pyaz Paratha",35.00),
    Menu_1(R.drawable.v181,"Gobhi mix paratha",25.00)

)
val menu_10 = listOf(
    Menu_1(R.drawable.v182,"Vanilla Scoop",60.00),
    Menu_1(R.drawable.v183,"Mango Scoop",60.00),
    Menu_1(R.drawable.v184,"Green Pista Scoop",60.00),
    Menu_1(R.drawable.v86,"Strawberry Scoop",60.00),
    Menu_1(R.drawable.v186,"Pan Nawabi Scoop",75.00),
    Menu_1(R.drawable.v185,"Green Pista Scoop",75.00),
    Menu_1(R.drawable.v187,"Tuttifruiti Scoop",75.00),
    Menu_1(R.drawable.v184,"Kesar Pista Scoop",75.00),
    Menu_1(R.drawable.v189,"Black Current Scoop",75.00),
    Menu_1(R.drawable.v190,"Red Velvet Scoop",75.00),
    Menu_1(R.drawable.v191,"Mellow Jellow Scoop",75.00),
    Menu_1(R.drawable.v192,"Spanish Saffrom Scoop",75.00),
    Menu_1(R.drawable.v193,"American Nuts Scoop",75.00),
    Menu_1(R.drawable.v197,"Butterscotch Scoop",60.00),
    Menu_1(R.drawable.v189,"Roasted Almond Scoop",75.00),
    Menu_1(R.drawable.v199,"Caramel Litchi Scoop",75.00),
    Menu_1(R.drawable.v188,"Chocolate Brownie\n Scoop",75.00),
    Menu_1(R.drawable.v198,"Sitafal Scoop",75.00)
)

val menu_14 = listOf(
    Menu_1(R.drawable.v83,"Cake Pop vanilla",37.00),
    Menu_1(R.drawable.v85,"Cake Pop Chocolate",37.00),
    Menu_1(R.drawable.v84,"Cake Pop Bubblegum",37.00),
    Menu_1(R.drawable.v86,"Strawberry pastry",70.00),
    Menu_1(R.drawable.v82,"Black Forest",75.00),
    Menu_1(R.drawable.v200,"White Forest",75.00),
    Menu_1(R.drawable.v201,"Blueberry Pastry",75.00),
    Menu_1(R.drawable.v202,"Butterscotch Pastry",75.00),
    Menu_1(R.drawable.v203,"Chocolate Truffle",75.00),
    Menu_1(R.drawable.v204,"Red Velvet",100.00),
    Menu_1(R.drawable.v205,"Oreo Pastry",100.00),
    Menu_1(R.drawable.v206,"Ferrero Rocher",120.00),
    Menu_1(R.drawable.v207,"Tiramisu",100.00),
    Menu_1(R.drawable.v208,"Mango Lychee Pastry",75.00),
    Menu_1(R.drawable.v210,"Checker Board Pastry",85.00),
    Menu_1(R.drawable.v209,"Honey Almond Pastry",100.00),
    Menu_1(R.drawable.v211,"Crackle Pastry",100.00)
)
val menu_15 = listOf(
    Menu_1(R.drawable.v104,"Daal Makhni",230.00),
    Menu_1(R.drawable.v105,"Daal Tadka",230.00),
    Menu_1(R.drawable.v106,"Yellow Daal Tadka",230.00),
    Menu_1(R.drawable.v107,"Palak Paneer",230.00),
    Menu_1(R.drawable.v108,"Malai Kofta",270.00),
    Menu_1(R.drawable.v109,"Hara Bhara Kofta",270.00),
    Menu_1(R.drawable.v14,"Paneer Tikka Masala",270.00),
    Menu_1(R.drawable.v110,"Paneer Afgani",270.00),
    Menu_1(R.drawable.v111,"Paneer Kalimirch",270.00),
    Menu_1(R.drawable.v112,"Paneer Khurchan",270.00),
    Menu_1(R.drawable.v113,"Paneer Butter Masala",300.00),
    Menu_1(R.drawable.v3,"Veg Hydrabadi",120.00),
    Menu_1(R.drawable.v4,"Veg Handi",135.00),
    Menu_1(R.drawable.v5,"Alu Masal",115.00),
    Menu_1(R.drawable.v6,"Alu jeera",100.00),
    Menu_1(R.drawable.v7,"Dum Alu Punjabi",120.00),

    Menu_1(R.drawable.v8,"Roti",25.00),
    Menu_1(R.drawable.v9,"Butter Nan",35.00),
    Menu_1(R.drawable.v19,"Lassi",45.00),
    Menu_1(R.drawable.v20,"Butter Milk",35.00)
)

val menu_16 = listOf(
    Menu_1(R.drawable.v212,"SONIC Cheeseburger",80.00),
    Menu_1(R.drawable.v213,"SuperSONIC Double\n Cheeseburger",130.00),
    Menu_1(R.drawable.v214,"SuperSONIC Bacon \nDouble Cheeseburger",130.00),
    Menu_1(R.drawable.v215,"Brown Bag Special",160.00),
    Menu_1(R.drawable.v218,"Premium Beef \nHot Dogs",100.00),
    Menu_1(R.drawable.v217,"Footlong Quater\n Pound Coney",120.00),
    Menu_1(R.drawable.v216,"JUMBO Popcorn\n Chicken",170.00),
    Menu_1(R.drawable.v219,"Chicken Wrap",170.00),
    Menu_1(R.drawable.v230,"Mozzarella Sticks",55.00),
    Menu_1(R.drawable.v232,"Handmade Onion\n Rings",50.00),
    Menu_1(R.drawable.v231,"Ched 'R' Peppers",60.00),
    Menu_1(R.drawable.v233,"Chili Cheese Tots\n & fries",58.00),
    Menu_1(R.drawable.v234,"Tots & Fries",60.00)
)

val menu_17 = listOf(
    Menu_1(R.drawable.v235,"Cat's Famous \nTEXAS DOG",80.00),
    Menu_1(R.drawable.v236,"Chihuahua THE \nTACO DOG",80.00),
    Menu_1(R.drawable.v237,"Philly Fido",80.00),
    Menu_1(R.drawable.v239,"The OCHO",80.00),
    Menu_1(R.drawable.v240,"Devil DOG",100.00),
    Menu_1(R.drawable.v242,"Super Hero DOG",100.00),
    Menu_1(R.drawable.v241,"PAISANO the\n Pizza Dog",130.00),
    Menu_1(R.drawable.v238,"Loch Ness MONSTER",130.00),
    Menu_1(R.drawable.v243,"APPETEAZER",120.00),
    Menu_1(R.drawable.v244,"Spud Missile",120.00),
    Menu_1(R.drawable.v245,"B.L.T.D.",100.00),
    Menu_1(R.drawable.v246,"SPOT",100.00)

)

val menu_18 = listOf(
    Menu_1(R.drawable.v212,"SONIC Cheeseburger",80.00),
    Menu_1(R.drawable.v213,"SuperSONIC Double\n Cheeseburger",130.00),
    Menu_1(R.drawable.v214,"SuperSONIC Bacon \nDouble \nCheeseburger",130.00),
    Menu_1(R.drawable.v215,"Brown Bag Special",160.00),

    Menu_1(R.drawable.v8,"Roti",25.00),
    Menu_1(R.drawable.v9,"Butter Nan",35.00),
    Menu_1(R.drawable.v10,"Onion Kulcha",40.00),
    Menu_1(R.drawable.v11,"Paneer Paratha", 60.00),

    Menu_1(R.drawable.v12,"Baby Corn Masala",125.00),
    Menu_1(R.drawable.v13,"Paneer Pakoda",150.00),
    Menu_1(R.drawable.v14,"Paneer Tikka",155.00),
    Menu_1(R.drawable.v16,"Veg Sheek Kabab",150.00),
    Menu_1(R.drawable.v15,"Paneer Manchurian",160.00),
    Menu_1(R.drawable.v17,"Paneer butter Garlic",170.00),

    Menu_1(R.drawable.v202,"Butterscotch Pastry",75.00),
    Menu_1(R.drawable.v203,"Chocolate Truffle",75.00),
    Menu_1(R.drawable.v204,"Red Velvet",100.00),
    Menu_1(R.drawable.v205,"Oreo Pastry",100.00),
    Menu_1(R.drawable.v206,"Ferrero Rocher",120.00),
    Menu_1(R.drawable.v207,"Tiramisu",100.00)
)

val menu_19 = listOf(
    Menu_1(R.drawable.v251,"Butter Salt \nCorn Snack",120.00),
    Menu_1(R.drawable.v312,"Corn Chat Masala",120.00),
    Menu_1(R.drawable.v253,"Corn CHilly Lime",120.00),
    Menu_1(R.drawable.v255,"Honey Corn",150.00),
    Menu_1(R.drawable.v258,"Tangi Pepper Corn",150.00),
    Menu_1(R.drawable.v256,"Tomato Pudina Corn",150.00),
    Menu_1(R.drawable.v252,"Indian Masala Corn",120.00),
    Menu_1(R.drawable.v254,"Halka Pulka Corn",100.00),
    Menu_1(R.drawable.v259,"Mix Cocktail \nSprout Salad",100.00),
    Menu_1(R.drawable.v260,"Maxican Mayonesse\n Corn Salad",120.00),
    Menu_1(R.drawable.v261,"Mango Sprout \nCorn Salad",120.00),
    Menu_1(R.drawable.v256,"Veg Cheese \nCorn Salad",120.00),
    Menu_1(R.drawable.v262,"Peanut Sprout\n Corn Salad",120.00),
    Menu_1(R.drawable.v251,"Bel Corn",100.00)
)
val menu_20 = listOf(
    Menu_1(R.drawable.v273,"Chicken Kebab \n(Regular)",45.00),
    Menu_1(R.drawable.v274,"Beef Kebab (Regular)",45.00),
    Menu_1(R.drawable.v275,"Lamb Kebab (Regular)",47.00),
    Menu_1(R.drawable.v281,"Mixed Kebab (Regular)",50.00),
    Menu_1(R.drawable.v282,"Vegetarian Kebab\n (Regular)",55.00),
    Menu_1(R.drawable.v273,"1 pc Karage",30.00),
    Menu_1(R.drawable.v233,"French fries",60.00),
    Menu_1(R.drawable.v280,"Spaghetti",60.00),
    Menu_1(R.drawable.v31,"Rice",60.00),
    Menu_1(R.drawable.v109,"Beef Kofta",20.00),
    Menu_1(R.drawable.v276,"Chicken Tikka",25.00),
    Menu_1(R.drawable.v274,"Lamb Tikka",45.00),
    Menu_1(R.drawable.v278,"Chicken tikka \nand Salad",70.00),
    Menu_1(R.drawable.v277,"Nestea Lemon Tea",25.00),
    Menu_1(R.drawable.v283,"Coca Cola",30.00),
    Menu_1(R.drawable.v279,"Mineral Water",20.00),
)

val menu_21 = listOf(
    Menu_1(R.drawable.v284,"Margherita",75.00),
    Menu_1(R.drawable.v292,"Double Cheese\n Margherita",130.00),
    Menu_1(R.drawable.v288,"Pepper pizza",175.00),
    Menu_1(R.drawable.v287,"Cheese & Barbeque\n Chicken Pizza",130.00),
    Menu_1(R.drawable.v290,"Meatza pizza",245.00),
    Menu_1(R.drawable.v289,"Veg Single pizza",170.00),
    Menu_1(R.drawable.v290,"Zesty Chicken Pizza",210.00),
    Menu_1(R.drawable.v286,"Veg Extravaganza\n Pizza",210.00),
    Menu_1(R.drawable.v290,"Barbeque Chicken\n Pizza",175.00),
    Menu_1(R.drawable.v285,"Cheese & Basil/\ntartar dip ",20.00)

)
val menu_22 = listOf(
    Menu_1(R.drawable.v300,"Dog Brasil",70.00),
    Menu_1(R.drawable.v301,"DOG Mega Brasil",100.00),
    Menu_1(R.drawable.v302,"Super Brasil Hot Dog",100.00),
    Menu_1(R.drawable.v304,"Dog Pig",100.00),
    Menu_1(R.drawable.v303,"Dog Brocous",100.00),
    Menu_1(R.drawable.v305,"Dog Parma",100.00),
    Menu_1(R.drawable.v306,"Dog Chicken",120.00),
    Menu_1(R.drawable.v307,"Dog light",120.00),
    Menu_1(R.drawable.v308,"Dog Vegeterian",80.00),
    Menu_1(R.drawable.v301,"Dog Calabresa",100.00),
    Menu_1(R.drawable.v310,"Dog jaba",80.00),
    Menu_1(R.drawable.v300,"Dog Strongonoff",110.00),
    Menu_1(R.drawable.v309,"DOG Kids",78.00),
    Menu_1(R.drawable.v311,"Dog Chicken Supreme",130.00),
    Menu_1(R.drawable.v303,"Dog 4 Queljos",100.00)
)
