package com.rs2hd.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rs2hd.model.Player;
import com.rs2hd.model.World;

@SuppressWarnings("unused")
public class AddTile {
private Player p;
private static List<String> tiles = new ArrayList<String>();

public AddTile() {
addTile();
}

public void addTile() {
        tiles.clear();
        try {        
            BufferedReader in = new BufferedReader(new FileReader("data/tiles.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                tiles.add(inFile);
            }
        } catch (Exception e) {}
    }



public void newTile()
    {
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter("data/tiles.txt", true));
            bw.write(p.getLocation().getX());
	    bw.write(p.getLocation().getY());
            bw.write(p.getLocation().getZ());
            bw.newLine();
            bw.flush();
        } 
		catch (IOException ioe) 
		{
            ioe.printStackTrace();
        } 
		finally 
		{
            if (bw != null)
			{
                try
                {
                    bw.close();
                } catch (IOException ioe2) {
                    System.out.println("Error writing system log.");
                    ioe2.printStackTrace();
                }
			}
        }
        addTile();
    }
}