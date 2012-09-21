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

public class MuteUser {

private static List<String> muted = new ArrayList<String>();

public MuteUser() {
muteuser();
}

private void muteuser() {
        muted.clear();
        try {        
            BufferedReader in = new BufferedReader(new FileReader("data/mutes.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                muted.add(inFile);
            }
        } catch (Exception e) {}
    }

    public boolean isMuted(String name){
        if (muted.contains(name))
            return true;
        return false;
    }



private void writeTo(String name, String path)
    {
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(path +".txt", true));
            bw.write(name);
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
        muteuser();
    }

public void Mute(Player player, String mute) {
for(Player p : World.getInstance().getPlayerList()) {
if(p.getUsername().equalsIgnoreCase(mute)) {
writeTo(mute, "data/mutes");
p.sm("You have been muted by  "+player.getUsername()+ ".");
player.sm("You have muted: "+mute+ ".");
}
}
}


public void RelogMute() {
muteuser();
}

}