package com.RetroShopper;

import java.util.Scanner;


public class Game {
    private boolean seeksJordans = true;
    private Player player;
    private Location location;

    Scanner myObj = new Scanner(System.in);

    public Game(Player player1) {
        location = new Location();
        location.initialise();
        player = player1;
    }

    public void gameRun(InputSetUp inputSetUp){
        System.out.println("Welcome to Arndale shopping plaza. Within these stores lies one retro Jordan.\n" +
                "It is all yours if you can find it. Goodluck in your adventure!!!");


        while (seeksJordans == true){
            System.out.println("What direction would you like to go? Up/Down/Left/Right");
            String userInput = myObj.nextLine();

            System.out.println("You have chosen to go" + userInput);


            switch (inputSetUp.nextLine()) {
                case "Up":
                    player.moveForward(location);
                    break;

                case "Down":
                    player.moveDown(location);
                    break;

                case "Left":
                    player.moveLeft(location);
                    break;

                case "Right":
                    player.moveRight(location);
                    break;

                default:
                    System.out.println("You have chosen an invalid location, try again please");
                    break;
            }

            if (location.getTiles()[player.getPlayerPosX()][player.getPlayerPosY()].getClass() == JordanLocation.class){
                boolean b = seeksJordans == false;
            }
        }
    }
};
