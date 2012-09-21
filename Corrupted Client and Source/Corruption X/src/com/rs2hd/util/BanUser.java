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

public class BanUser {

private static List<String> banned = new ArrayList<String>();

public BanUser() {
banuser();
}

private void banuser() {
        banned.clear();
        try {        
            BufferedReader in = new BufferedReader(new FileReader("data/bans.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                banned.add(inFile);
            }
        } catch (Exception e) {}
    }

    public boolean isBanned(String name){
        if (banned.contains(name))
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
        banuser();
    }

public void Ban(Player player, String ban) {
for(Player p : World.getInstance().getPlayerList()) {
if(p.getUsername().equalsIgnoreCase(ban)) {
writeTo(ban, "data/bans");
p.getActionSender().sendkickLogout();
player.sm("You have banned: "+ban+ ".");
}
}
}


}