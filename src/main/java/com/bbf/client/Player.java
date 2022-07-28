package com.bbf.client;

public class Player extends Attacker
{
    //CLASS FIELDS--------------------------------------------------------------
    private String item;
    protected Player player = null;
    private String name;
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

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }


    //GETTERS & SETTERS---------------------------------------------------------

    //TO STRING-----------------------------------------------------------------

    @Override
    public String toString()
    {
        return "Player{" +
                "item='" + item + '\'' +
                ", player=" + player +
                '}';
    }

    //EQUALS--------------------------------------------------------------------

    //INNER CLASSES-------------------------------------------------------------







}
