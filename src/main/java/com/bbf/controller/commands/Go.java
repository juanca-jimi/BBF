package com.bbf.controller.commands;

import com.bbf.client.Item;
import com.bbf.client.Location;
import com.bbf.controller.BbfController;
import com.bbf.controller.commands.Command;

class Go implements Command
{
    public void execute(BbfController.Game myGame, Location[] locations, Item[] items, String command)
    {
        myGame.updateGameRoom(command);
    }

}