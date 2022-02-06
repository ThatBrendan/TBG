package com.RetroShopper;

public class JordanLocation extends Tile{
    public JordanLocation(){

    }

    @Override
    public void onPlayerEnter(Player player){
        System.out.println("Jordans have been found");
    }
}
