package com.bbf.controller;

import com.bbf.client.Attacker;
import com.bbf.client.Player;

public class Combat
{
    public static void fight(Player player, Attacker attacker)
    {
        
        while (player.isAlive() && attacker.isAlive())
        {
            player.getsAttacked(attacker.attack());
            // TODO: 7/28/22 LET USER KNOW what is going on above
            attacker.getsAttacked(player.attack());
            // TODO: 7/28/22 LET USER KNOW what is going on above
        }
        
        whoDied(player, attacker);
    }

    private static void whoDied(Player player, Attacker attacker)
    {
        if(player.isAlive())
            System.out.println("You win!");
        else
        {
            System.out.println("You lose!");
            // TODO: 7/28/22  System.out.println("Loading last saved point...");
        }
    }
    
    
}