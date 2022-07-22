import java.util.Scanner;
//import java.io.StreamTokenizer;

import java.util.*;

public class TextParser {
    public String item = null;
    public String location = null;
    private Player player = null;
    private final Scanner scanner = new Scanner(System.in);

    public TextParser(String item, String location) {
        this.item = item;
        this.location = location;
    }

    private String textParser() {
        basicGameInfo();
        return null;
    }

    private String basicGameInfo() {
        String message1 = "Go [location]" + getLocation() + "Get [item]" + getItem();
        String userInput = scanner.nextLine().toLowerCase().trim();
        if(userInput == userInput) {
            System.out.println("get more info placeholder");
        } else {
            message1;
            userInput;
        }
    }

    private

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

/*
Textparser class
 */
