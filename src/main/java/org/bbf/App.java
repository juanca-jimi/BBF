package org.bbf;

import com.bbf.client.Player;
import com.bbf.controller.BbfController;

public class App
{
    public static void main( String[] args )
    {
        BbfController controller = new BbfController();
        controller.execute();
//        Player controller = new Player();
//        //controller.execute();
//        controller.attackWhenPrompt("key");
    }
}
