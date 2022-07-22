package com.game.client;

import com.game.controller.Location;
import com.game.error.InvalidLocationException;
//----
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
        System.out.println("This is a welcome message");
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
        public Location[] locations;

        public void play()
        {
            while (true)
            {
                showOptions();
            }
        }

        private void updateGameRoom(Location location)
        {
            // TODO: 7/21/22 update currentRoom, roomItems, & locations fields in the game class when passed in which location was taken
        }

        private void showOptions()
        {
            showCurrentRoom();
            showRoomItems();
            showValidLocations();

            System.out.println("\nTo quit the game enter \"q\"");

            Scanner myObj = new Scanner(System.in);
            String input = myObj.nextLine();

            if (input.equals("q"))
                endGame();
        }

        public void showCurrentRoom()
        {
            System.out.println("You are in room " + currentRoom);
        }

        public void showRoomItems()
        {
            System.out.println("The items in the rooms are...");
            for (var item : currentGame.roomItems)
                System.out.println("\t" + item);
        }

        public void showValidLocations()
        {
            System.out.println("The possible locations to take are...");
            for (var location : currentGame.locations)
                System.out.println("\t" + location);
        }

        public void move(Location location)
        {
            if (isValidLocation(location))
            {
                updateGameRoom(location);
            } else
            {
                throw new InvalidLocationException(location, locations);
            }
        }

        private boolean isValidLocation(Location location)
        {
            for (var validPath : locations)
                if (location.equals(validPath))
                    return true;
            return false;
        }

        private class Room
        {
        }

        private class Item
        {
        }


    }


    //NESTED INNER STATIC CLASS

}