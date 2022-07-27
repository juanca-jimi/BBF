package com.bbf.controller;

import com.bbf.GameObjects.Demo_Room;
import com.bbf.GameObjects.JSON_Controller;
import com.bbf.client.GameSaver;
import netscape.javascript.JSObject;

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
        System.out.println("Plaseholder for more info on the game\n");
        System.out.println("Go [location] north, south, east, west\n");
        System.out.println("Get [item] get any item available in the room\n");
    }
    private void printSplash() throws FileNotFoundException {
        File splashTxt = new File("src/main/resources/com/bbf/SplashScreen_1.txt");
        Scanner scnr = new Scanner(splashTxt);

        while (scnr.hasNextLine())
            System.out.println(scnr.nextLine());
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
        //object that contains all the items, enemies, directions you can go, treasure etc...
        public Demo_Room currentRoom;
        public JSON_Controller json_handler;
        Game(){
            this.json_handler = new JSON_Controller();
            //use demo stuff until generator is built
            File demoPath = new File("src/main/resources/com/bbf/DEMO_Room.JSON");
            JSObject d
            this.currentRoom = json_handler.JSON_Helper();
        }

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