package com.RetroShopper;

import java.util.Scanner;

public class Game extends Location{
    public static void main(String[] args) {
    Board gameboard = new Board();
    Player player = new Player();
        Scanner myObj = new Scanner(System.in);
        System.out.println("You are currently at the store looking for the Retro Jordans that Michael Jordan wore in the finals \n" +
                "You know they are limited editions and they have just been released to retro stores \n" +
                "Feeling hyped about getting them, you walk around the store shopping plaza in search for these lovely shoes. \n" +
                "What store would you go to? (Enter: JDsport, Footlocker, Schuh or Primark)");
        String Direction = myObj.nextLine();

        do switch (Direction) {
            case "JDsport":
                if (isJDsport && hasJordans) {
                    System.out.println("Would you like to purchase for £199");
                } else {
                    System.out.println("Would you like to check other stores??");
                }
                break;

            case "Schuh":
                if (isSchuh && hasJordans) {
                    System.out.println("Would you like to purchase for £199");
                } else {
                    System.out.println("Would you like to check other stores??");
                }
                break;

            case "FootLocker":
                if (isFootlocker && hasJordans) {
                    System.out.println("Would you like to purchase for £199");
                } else {
                    System.out.println("Would you like to check other stores??");
                }
                break;

            case "Primark":
                if (isPrimark && hasJordans) {
                    System.out.println("Would you like to purchase for £199");
                } else {
                    System.out.println("Would you like to check other stores??");
                }
                break;

        } while (player.playerHasJordans);

    }

};
