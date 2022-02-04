package com.RetroShopper;

import java.util.Random;

public class Board {
    int totalnumberOfShops = 4;

    public Board(){
        //Location Schuh
    Location location00 = new Location();
    location00.setDisplayShop("Schuh");

    //Location Footlocker
        Location location01 = new Location();
        location01.setDisplayShop("Footlocker");

        //Location Primark
        Location location10 = new Location();
        location10.setDisplayShop("Primark");

        //Location JDsports
        Location location11 = new Location();
        location11.setDisplayShop("JDsports");
        location11.isHasJordans();



    }


}
