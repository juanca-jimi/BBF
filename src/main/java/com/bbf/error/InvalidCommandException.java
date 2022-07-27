package com.bbf.error;

public class InvalidCommandException extends RuntimeException
{
    public InvalidCommandException(String message)
    {
        // TODO: 7/22/22 use a "Command" interface so that you can call all possible commands at runtime instead of hard coding it
        System.out.println("You have entered an invalid command: " + message + ". Valid Commands are...");
        System.out.println("\tGo");
        System.out.println("\tLook");
        System.out.println("\tGet");
    }
}