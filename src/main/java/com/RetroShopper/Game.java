package com.RetroShopper;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("You are currently at the store looking for the Retro Jordans that Michael Jordan wore in the finals \n" +
                "You know they are limited editions and they have just been released to retro stores \n" +
                "Feeling hyped about getting them, you walk around the store shopping plaza in search for these lovely shoes. \n" +
                "What store would you go to? (Enter: JDsport, Footlocker, Schuh or Primark)");
        String Direction = myObj.nextLine();
        int[] currentPosition = Player.Position();
        int[] jordanLocation = {(int) (Math.random() * 5), (int) (Math.random() * 5)};
        double Distance = Math.sqrt(Math.pow((jordanLocation[0] - currentPosition[0]),2) + Math.pow((jordanLocation[1] - currentPosition[1]),2));
        do {
            switch (Direction) {
                case "JDsport":
                    currentPosition[0] += 1;
                    Distance = Math.sqrt(Math.pow((jordanLocation[0] - currentPosition[0]),2) + Math.pow((jordanLocation[1] - currentPosition[1]),2));
                    int chanceOfArea = (int) (Math.random() * 3);
                    if (chanceOfArea == 1) {
                        System.out.println(Location.Arndale());
                    }
                    else if (chanceOfArea == 2) {
                    System.out.println(Location.PeelPark());
                }
                    else if (chanceOfArea == 3) {
                    System.out.println(Location.CheshireOaks());
                }
                    Direction = myObj.nextLine();
                    break;

                case "Footlocker":
                    currentPosition[0] -= 1;
                    Distance = Math.sqrt(Math.pow((jordanLocation[0] - currentPosition[0]),2) + Math.pow((jordanLocation[1] - currentPosition[1]),2));
                    chanceOfArea = (int) (Math.random() * 3);
                    if (chanceOfArea == 1) {
                        System.out.println(Location.Arndale());
                    }
                    else if (chanceOfArea == 2) {
                        System.out.println(Location.PeelPark());
                    }
                    else if (chanceOfArea == 3) {
                        System.out.println(Location.CheshireOaks());
                    }
                    Direction = myObj.nextLine();
                    break;

                case "Schuh":
                    currentPosition[1] += 1;
                    Distance = Math.sqrt(Math.pow((jordanLocation[0] - currentPosition[0]),2) + Math.pow((jordanLocation[1] - currentPosition[1]),2));
                    chanceOfArea = (int) (Math.random() * 3);
                    if (chanceOfArea == 1) {
                        System.out.println(Location.Arndale());
                    }
                    else if (chanceOfArea == 2) {
                        System.out.println(Location.PeelPark());
                    }
                    else if (chanceOfArea == 3) {
                        System.out.println(Location.CheshireOaks());
                    }
                    Direction = myObj.nextLine();
                    break;

                case "Primark":
                    currentPosition[1] -= 1;
                    Distance = Math.sqrt(Math.pow((jordanLocation[0] - currentPosition[0]),2) + Math.pow((jordanLocation[1] - currentPosition[1]),2));
                    chanceOfArea = (int) (Math.random() * 3);

                    if (chanceOfArea == 1) {
                        System.out.println(Location.Arndale());
                    }
                    else if (chanceOfArea == 2) {
                        System.out.println(Location.PeelPark());
                    }
                    else if (chanceOfArea == 3) {
                        System.out.println(Location.CheshireOaks());
                    }
                    Direction = myObj.nextLine();
                    break;
            }
        } while (Distance != 0.0);
        System.out.println("Yaaaay you have found the last pair of Retro Jordans.");
    }

}
