package com.bbf.GameObjects;

import jdk.nashorn.internal.parser.JSONParser;
import netscape.javascript.JSObject;


import java.util.List;

public class Demo_Room {
    String thePrompt;
    String[] theAvailableDirections;
    List<JSObject> theEnemies;
    List<JSObject> theItems;

    Demo_Room(JSObject theJSON){
    try {

        thePrompt = theJSON.getMember("Prompt").toString();
        theAvailableDirections = (String[]) theJSON.getMember("Available_Directions");
        for (JSObject enemy :
                (JSObject[]) theJSON.getMember("Enemies")) {
            theEnemies.add(enemy);
        }
        for (JSObject item :
                (JSObject[]) theJSON.getMember("Items") ) {
            theItems.add(item);
        }

    }
    catch (Exception e){
        System.out.println("Demo room failed to build");
    }
    }

    public String getThePrompt() {
        return thePrompt;
    }

    public String[] getTheAvailableDirections() {
        return theAvailableDirections;
    }

    public List<JSObject> getTheEnemies() {
        return theEnemies;
    }

    public List<JSObject> getTheItems() {
        return theItems;
    }
}
