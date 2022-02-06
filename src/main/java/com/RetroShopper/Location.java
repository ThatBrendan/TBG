package com.RetroShopper;

public class Location {

    private Tile [][] tiles = new Tile[4][4];

    public Tile[][] getTiles() {
        return tiles;
    }

    public void initialise(){
        for (int i =0; i < tiles.length; i++) {
            for (int j =0; j < tiles[i].length; j++) {
                tiles[i][j] = new Tile();
            }
        }
        tiles[2][2] = new JordanLocation();
    }
}
