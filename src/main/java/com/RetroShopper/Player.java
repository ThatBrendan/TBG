package com.RetroShopper;

import java.util.ArrayList;

public class Player {
    private String Name;
    private ArrayList<RetroJordan> Retro = new ArrayList<RetroJordan>();

    private int playerPosX;
    private int playerPosY;




    public Player(int posX, int posY, String name) {
        setName(name);

        playerPosX = posX;
        playerPosY = posY;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPlayerPosX() {
        return playerPosX;
    }

    public void setPlayerPosX(int playerPosX) {
        this.playerPosX = playerPosX;
    }

    public int getPlayerPosY() {
        return playerPosY;
    }

    public void setPlayerPosY(int playerPosY) {
        this.playerPosY = playerPosY;
    }


    public void moveForward(Location location) {
        Tile old_tile = location.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosY(this.getPlayerPosY() + 1);
        if (this.getPlayerPosY() >= location.getTiles()[0].length) {
            this.setPlayerPosY(0);
        }
        location.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onPlayerEnter(this);
    }

    public void moveDown(Location location) {
        Tile old_tile = location.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosY(this.getPlayerPosY() - 1);
        if (this.getPlayerPosY() < 0){
            this.setPlayerPosY(location.getTiles()[0].length -1);
        }
        location.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onPlayerEnter(this);
    }

    public void moveLeft(Location location) {
        Tile old_tile = location.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosY(this.getPlayerPosX() - 1);
        if (this.getPlayerPosX() < 0) {
            this.setPlayerPosY(location.getTiles().length -1);
        }
        location.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onPlayerEnter(this);
    }

    public void moveRight(Location location) {
        Tile old_tile = location.getTiles()[this.getPlayerPosX()][this.getPlayerPosY()];
        this.setPlayerPosX(this.getPlayerPosX() + 1);
        if (this.getPlayerPosY() >= location.getTiles()[0].length) {
            this.setPlayerPosX(0);
        }
        location.getTiles()[this.getPlayerPosX()] [this.getPlayerPosY()].onPlayerEnter(this);
    }
}
