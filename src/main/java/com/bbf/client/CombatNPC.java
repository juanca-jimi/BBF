package com.bbf.client;

public class CombatNPC extends Attacker
{
    //CLASS FIELDS--------------------------------------------------------------
    private double fightMultiplier;

    //CONSTRUCTORS--------------------------------------------------------------
    public CombatNPC()
    {
        this.name = "an anonymous character";
        this.healthPoints = 1000;
        printStartingStatement();
    }

    public CombatNPC(String enemyName, short healthPoints)
    {
        this.name = enemyName;
        this.healthPoints = healthPoints;
        printStartingStatement();
    }


    //METHODS-------------------------------------------------------------------


    public void printStartingStatement()
    {
        System.out.printf("Starting war with %s.. they have %d healthpoints", this.name, this.healthPoints);
    }


    //GETTERS & SETTERS---------------------------------------------------------


    //TO STRING-----------------------------------------------------------------


    //EQUALS--------------------------------------------------------------------


    //INNER CLASSES-------------------------------------------------------------


}