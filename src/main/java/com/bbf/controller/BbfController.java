package com.bbf.controller;

import com.bbf.client.GameSaver;

import java.io.Serializable;
import java.util.Scanner;

public class BbfController
{
    public Game currentGame;


    public void execute(){
        welcomeMessage();
        chooseGameOptions();
        currentGame.play();
    }

    private void welcomeMessage()
    {
        System.out.println("BBF: Bigger Badder Faster\n");
        System.out.println("Plaseholder for more info on the game\n");
        System.out.println("Go [location] north, south, east, west\n");
        System.out.println("Get [item] get any item available in the room\n");
    }

    private void chooseGameOptions()
    {
        System.out.println("1. start new game\n2. load game");
        Scanner myObj = new Scanner(System.in);

        String userInput = myObj.nextLine();
        if(userInput.equals("1"))
            freshGame();
    }

    public void freshGame()
    {
        currentGame = new Game();
    }

    public void loadGame()
    {
        //TODO: retrieve saved games
        if(!GameSaver.hasSavedGames() && GameSaver.playSavedGames())
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
//        public Room currentRoom;
//        public Item[] roomItems;
//        public Route[] routes;

        public void play()
        {
            while (true)
            {
                showOptions();
            }
        }

        private void showOptions()
        {
//            System.out.println("You are in room " + currentRoom);
//            System.out.println("The items in the rooms are...");
//            for (item : roomItems)
//                System.out.println("\t" + item);
//            System.out.println("The possible routes to take are...");
//            for(route : routes)
//                System.out.println("\t" + route);

            System.out.println("\nTo quit the game enter \"q\"");
            Scanner myObj = new Scanner(System.in);

            String input = myObj.nextLine();

            if(input.equals("q"))
                endGame();
        }
    }


    //NESTED INNER STATIC CLASS

}