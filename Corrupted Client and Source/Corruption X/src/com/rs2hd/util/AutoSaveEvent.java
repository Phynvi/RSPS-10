package com.rs2hd.util;


import com.rs2hd.event.Event;

import com.rs2hd.model.Player;

import com.rs2hd.model.World;


/**

 * Performs automatic player saving.

 *

 * @author blake

 */

public class AutoSaveEvent extends Event {


    /**

     * Constructs a new auto save event.

     */

    public AutoSaveEvent() {

        super(80000);

    }


    /**

     * Executes the save sequence.

     */

    public void execute() {

        for (Player player : World.getInstance().getPlayerList()) {

			if (player == null) {

				continue;

			}

            World.getInstance().engine().getWorkerThread()
 
                   .savePlayer(player);

        }

        System.out.println("SAVED ALL PLAYERS.");

    }


}

