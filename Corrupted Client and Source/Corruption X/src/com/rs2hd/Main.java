package com.rs2hd;

import com.rs2hd.util.log.Logger;
import com.rs2hd.tools.simpleGUI;

/**
 * Generic main class which starts the server.
 *
 * @author Graham
 */
public class Main {

    /**
     * Logger instance.
     */
    private static Logger logger = Logger.getInstance();
    
    /**
     * Server GUI
     */
   // public static Frame frame = new Frame("CrystalBlaze");

    /**
     * Entry point of the program.
     * <p/>
     * Sets everything rolling.
     *
     * @param args
     */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Server s = null;
                try {
                    s = new Server();
			new simpleGUI();
                } catch (Exception e) {
                    logger.error(e.toString());
                    logger.stackTrace(e);
                    return;
                }
                System.gc();
                s.go();
            }
        }, "CorruptionX").start();
	}

}
