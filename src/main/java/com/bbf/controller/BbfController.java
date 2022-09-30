package com.bbf.controller;

import com.bbf.client.GameSaver;
import com.bbf.client.Location;
import com.bbf.client.Item;
import com.bbf.client.Room;
import com.bbf.client.Player;

import java.io.File;
import java.io.FileNotFoundException;
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
        try {
            printSplash();
        }
        catch (Exception e){
            System.out.println("print splash failed");
        }
        System.out.println("BBF: Bigger Badder Faster\n");
        System.out.println("Placeholder for more info on the game\n");
        System.out.println("Go [location] north, south, east, west\n");
        System.out.println("Get [item] get any item available in the room\n");
    }
    private void printSplash() throws FileNotFoundException {
        File splashTxt = new File("src/main/resources/com/bbf/SplashScreen_1.txt");
        Scanner scan = new Scanner(splashTxt);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
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
        freshGame();
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
        public Location[] locations;

        public void play()
        {
            while (true)
            {
                showOptions();
                TextParser command = new TextParser();
                command.execute(this, locations, roomItems);
            }
        }

        private void showOptions()
        {
//            System.out.println("You are in room " + currentRoom);
//            System.out.println("The items in the rooms are...");
//            for (item : roomItems)
//                System.out.println("\t" + item);
//
            showCurrentRoom();
            showRoomItems();

            System.out.println("\nTo quit the game enter \"q\"");

            Scanner myObj = new Scanner(System.in);
            String input = myObj.nextLine();

            if (input.equals("q"))
                endGame();

        }
        public void updateGameRoom(String location)
        {
            // TODO: 7/21/22 update currentRoom, roomItems, & locations fields in the game class when passed in which location was taken
        }

        public void showCurrentRoom()
        {
            System.out.println("You are in room " + currentRoom);
        }

        public void showRoomItems()
        {
            System.out.println("The items in the current rooms are...");
            for (var item : currentGame.roomItems)
                System.out.println("\t" + item);
        }

        public void storeItem(String itemFromCommand)
        {
            //TODO
        }

        public void showLocations()
        {
            System.out.println("The possible routes to take are...");
            for(var route : locations)
                System.out.println("\t" + route);
        }
    }
}