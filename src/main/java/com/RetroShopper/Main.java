package com.RetroShopper;

public class Main {
    public static void main(String[] args) {
        InputSetUp input = (InputSetUp) new ScannerInputSource();
        System.out.println("Please what is your name: ");
        String playerName = input.nextLine();

        Player player = new Player(2,2, playerName);

        Game game = new Game(player);
        game.gameRun(input);
    }
}
