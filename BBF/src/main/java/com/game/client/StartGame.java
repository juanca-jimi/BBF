package com.game.client;

import java.io.Serializable;
import java.util.Scanner;

public class StartGame
{
    public Game currentGame;


    public StartGame()
    {
        welcomeMessage();
        chooseGameOptions();
        currentGame.play();
    }

    private void welcomeMessage()
    {

    }

    private void chooseGameOptions()
    {
        System.out.println("1. start new game\n2. load game");
        Scanner myObj = new Scanner(System.in);

        String userInput = myObj.nextLine();
        if (userInput.equals("1"))
            freshGame();
    }

    public void freshGame()
    {
        currentGame = new Game();
    }

    public void loadGame()
    {
        //TODO: retrieve saved games
        if (!GameSaver.hasSavedGames() && GameSaver.playSavedGames())
        {
            currentGame = null;
            // TODO: 7/20/22 use GameSaver.selectSavedGame() above
            return;
        }
        currentGame = new Game();
    }

    public void endGame()
    {
        goodbyeMessage();
        if (GameSaver.saveGameQuestion())
        {
            new GameSaver(currentGame);
        }
    }

    private void goodbyeMessage()
    {
        System.out.println("You are exiting");
    }


    public class Game implements Serializable
    {
        public Room currentRoom;
        public Item[] roomItems;
        public Route[] routes;

        public void play()
        {
            while (true)
            {
                showOptions();
            }
        }

        private void updateGameRoom(Route route)
        {
            // TODO: 7/21/22 update currentRoom, roomItems, & routes fields in the game class when passed in which route was taken
        }

        private void showOptions()
        {
            System.out.println("You are in room " + currentRoom);
            System.out.println("The items in the rooms are...");
            for (var item : roomItems)
                System.out.println("\t" + item);
            System.out.println("The possible routes to take are...");
            for (var route : routes)
                System.out.println("\t" + route);

            System.out.println("\nTo quit the game enter \"q\"");
            Scanner myObj = new Scanner(System.in);

            String input = myObj.nextLine();

            if (input.equals("q"))
                endGame();
        }

        private class Room
        {
        }

        private class Item
        {
        }

        private class Route
        {
        }
    }


    //NESTED INNER STATIC CLASS

}