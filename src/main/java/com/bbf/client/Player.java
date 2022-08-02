package com.bbf.client;

<<<<<<< HEAD
import java.util.ArrayList;

public class Player extends Attacker
{
    //CLASS FIELDS--------------------------------------------------------------
    private ArrayList<Item> itemArrayList;
=======
import java.util.Scanner;

public class Player extends Attacker {
    //fields
    private String item;
>>>>>>> f15bb3c44ef9ffe0230544bda350b8e97700ed8f
    protected Player player = null;
    private String name;
    public Purse purse;
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

<<<<<<< HEAD

    //METHODS-------------------------------------------------------------------

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public ArrayList<Item> getItemArrayList()
    {
        return this.itemArrayList;
    }

    public void addItem(Item item)
    {
        this.itemArrayList.add(item);
=======
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
>>>>>>> f15bb3c44ef9ffe0230544bda350b8e97700ed8f
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
                "itemArrayList=" + itemArrayList +
                ", player=" + player +
                ", name='" + name + '\'' +
<<<<<<< HEAD
                ", purse=" + purse +
                ", damage=" + damage +
                '}';
    }

    public boolean hasHealingItem()
    {
        return false;
    }

    public void heal()
    {
    }


    //EQUALS--------------------------------------------------------------------

    //INNER CLASSES-------------------------------------------------------------







=======
                ", damage=" + damage +
                '}';
    }
>>>>>>> f15bb3c44ef9ffe0230544bda350b8e97700ed8f
}


