package com.rs2hd.content;

import com.rs2hd.event.Event;
import com.rs2hd.model.Location;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * Handles wilderness miscellaneous methods.
 *
 * @author Graham
 */
public class Wilderness {
    /**
     * Displays the wilderness warning sign if the player hasn't seen it this session.
     *
     * @param player
     */
    public static void showWarning(Player player) {
        if (Location.wildernessLevel(player.getLocation()) > 0) {
            handleJump(player);
        } else {
            if (player.getTemporaryAttribute("wildernessWarned") == Boolean.TRUE) {
                handleJump(player);
            } else {
                player.getActionSender().sendInterface(382, false);
            }
        }
    }

    /**
     * Handles a jump into the wilderness.
     *
     * @param player
     */
    public static void handleJump(final Player player) {
        player.getActionSender().sendCloseInterface();
        player.getActionSender().sendCloseChatboxInterface();
        player.getActionSender().removeTab();
        player.setTemporaryAttribute("wildernessWarned", Boolean.TRUE);
        int delay = 0;
        if (player.getLocation().getY() == 3520) {
            // leaving wildy
            player.getWalkingQueue().reset();
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() - 2);
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() - 1);
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() - 0);
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() + 1);
        } else {
            // entering wildy
            player.getWalkingQueue().reset();
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() + 1);
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() + 2);
            player.getWalkingQueue().addStepToWalkingQueue(player.getLocation().getLocalX(), player.getLocation().getY() + 3);
            delay = 500;
        }
        final boolean isRunning = player.getWalkingQueue().isRunToggled();
        player.getWalkingQueue().setIsRunning(false);
        player.getWalkingQueue().setRunToggled(false);
        World.getInstance().registerEvent(new Event(delay) {
            @Override
            public void execute() {
                player.Render = 2750;
		player.RenderRunning = false;
                player.getUpdateFlags().setAppearanceUpdateRequired(true);
                this.stop();
            }
        });
        World.getInstance().registerEvent(new Event(2500 + delay) {
            @Override
            public void execute() {
                player.Render = 2750;
		player.RenderRunning = false;
                player.getUpdateFlags().setAppearanceUpdateRequired(true);
                player.getWalkingQueue().setRunToggled(isRunning);
                this.stop();
			}
		});
	}
}
