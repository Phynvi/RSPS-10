/*
 * Class noclip handlers
 * Created by Caelum
 */

package com.rs2hd.model;

import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;
import com.rs2hd.util.log.Logger;
import com.rs2hd.script.ScriptManager;

public class NoclipHandler {
	
	public int maxObjects = 30000;
	public int objectLoadedId = 0;
	public int[] objectX = new int[maxObjects];
	public int[] objectY = new int[maxObjects];
	public int[] oHeight = new int[maxObjects];
	
	public boolean checkPos(int absX , int absY,int height, int dir){
		for(int i = 0;i < maxObjects; i++){
			if(objectX[i] <= 0 || objectY[i] <= 0 || absX <= 0 || absY <= 0){
				continue;
			}
			if(objectX[i] == absX && objectY[i] == absY && oHeight[i] == height){
				return false;
			}
		}
		return true;
	}
	public NoclipHandler(){
		String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[500];
        BufferedReader mapFile = null;
        try
        {
            mapFile = new BufferedReader(new FileReader("./data/map.cfg"));
            line = mapFile.readLine().trim();
        }
        catch(Exception e)
        {
            return;
        }
        while (line != null)
        {
            int spot = line.indexOf("=");
            if (spot > -1)
            {
                token = line.substring(0, spot).trim();
                token2 = line.substring(spot + 1).trim();
                token2_2 = token2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token3 = token2_2.split("\t");
                if (token.equals("object"))
                {
                    objectX[objectLoadedId] = Integer.parseInt(token3[0]);
                    objectY[objectLoadedId] = Integer.parseInt(token3[1]);
					oHeight[objectLoadedId] = Integer.parseInt(token3[2]);
					objectLoadedId++;
                }
            }
            else
            {
                if (line.equals("[ENDOFOBJECTLIST]"))
                {
					maxObjects = objectLoadedId;
					ScriptManager.getInstance().call
("NPC clipping Started.- system by Caelum.");
                    try
                    {
                        mapFile.close();
                    }
                    catch (IOException ioexception)
                    {}
                    mapFile = null;
                    return;
                }
            }
            try
            {
                line = mapFile.readLine().trim();
            }
            catch (IOException ioexception1)
            {
                try
                {
                   mapFile.close();
                }
                catch (IOException ioexception)
                {}
                mapFile = null;
                return;
            }
        }
        return;
	}
}