package com.bbf.error;

import com.bbf.client.Location;

public class InvalidLocationException extends RuntimeException
{
    public InvalidLocationException(String route, Location[] routes)
    {
        System.out.println("You have entered an invalid route:" + route + ". Please try again.\nValid Routes Are...");
        for (var currLocation : routes)
            System.out.println("\t" + currLocation);
    }
}