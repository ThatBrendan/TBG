package com.RetroShopper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String playerName = myObj.nextLine();

        Player player = new Player(2,2, playerName);

        Game game = new Game(player);
        game.gameRun();
    }
}
