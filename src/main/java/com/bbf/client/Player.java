package com.bbf.client;

import java.util.Scanner;

public class Player extends Attacker {
    //fields
    private String item;
    protected Player player = null;
    private String name;
    short damage = 0;

    //CONSTRUCTORS--------------------------------------------------------------

    //methods
    public void attackWhenPrompt(String item) {
        System.out.println("Here is your current item or items: " + item);

        System.out.println("Do you want to attack? Just type the word attack: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toLowerCase().trim();

        if(userInput.equals("attack")) {
            System.out.println("You just attacked the " + item);
        } else {
            System.out.println("You have to type attack to continue");
            System.out.println("Try again!");
        }
        //attackWhenPrompt("");
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getDamage() {
        return damage;
    }

    public void setDamage(short damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "item='" + item + '\'' +
                ", player=" + player +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}


