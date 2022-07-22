package com.game.error;

import com.game.controller.Location;

public class InvalidLocationException extends RuntimeException
{
    public InvalidLocationException(Location route, Location[] routes)
    {
        System.out.println("You have entered an invalid route:" + route.toString() + ". Please try again.\nValid Routes Are...");
        for (var currLocation : routes)
            System.out.println("\t" + currLocation);
    }
}