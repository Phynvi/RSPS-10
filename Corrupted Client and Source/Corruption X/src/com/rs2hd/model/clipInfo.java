/*
 * Class noclip handlers
 * Created by Dragonkk
 * Thanks help from laxika anyway it sucks xD
 */

package com.rs2hd.model;

public class clipInfo {

    //Height - X - Y
    public static byte coords[][][] = new byte [4][5000][10500];

    public boolean checkPos(int absX, int absY, int height, int dir) {
        //System.out.println("x: "+absX+" y: "+absY+" height: "+height+" dir: "+dir);
    	byte type = coords[height][absX][absY];
    	if (type == 2)
    	return true;
        return false;
    }
}