package com.bbf.client;

import java.util.ArrayList;

public class Player extends Attacker
{
    //CLASS FIELDS--------------------------------------------------------------
    private ArrayList<Item> itemArrayList;
    protected Player player = null;
    private String name;
    public Purse purse;
    short damage = 0;


    //CONSTRUCTORS--------------------------------------------------------------

    public Player getPlayer()
    {
        return player;
    }


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
    }


    //GETTERS & SETTERS---------------------------------------------------------

    //TO STRING-----------------------------------------------------------------

    @Override
    public String toString()
    {
        return "Player{" +
                "itemArrayList=" + itemArrayList +
                ", player=" + player +
                ", name='" + name + '\'' +
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







}
