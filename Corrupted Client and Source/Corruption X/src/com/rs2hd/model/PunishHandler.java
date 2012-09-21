package com.rs2hd.model;

import java.util.*;
import java.io.*;

import org.apache.mina.common.IoSession;

import com.rs2hd.io.XStreamPlayerLoader;

public class PunishHandler
{
	public static List<String> banned = new ArrayList<String>();
	public static List<String> muted = new ArrayList<String>();
	public static List<String> ipbanned = new ArrayList<String>();
	public static List<String> ipmuted = new ArrayList<String>();
	
	public PunishHandler()
	{	
		updateAll();
	}
	
	public static void updateAll()
	{
		banUpdate();
		ipbanUpdate();
		muteUpdate();
		ipmuteUpdate();
	}
		
	public static void banUpdate()
    {
        banned.clear();
        try
        {        
            BufferedReader in = new BufferedReader(new FileReader("data/text/bans.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                banned.add(inFile);
            }
        } catch (Exception e) {}
    }
	
	public static void ipmuteUpdate()
    {
        ipmuted.clear();
        try
        {        
            BufferedReader in = new BufferedReader(new FileReader("data/text/ipmutes.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                ipmuted.add(inFile);
            }
        } catch (Exception e) {}
    }
	
	public static void muteUpdate()
    {
        muted.clear();
        try
        {        
            BufferedReader in = new BufferedReader(new FileReader("data/text/mutes.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                muted.add(inFile);
            }
        } catch (Exception e) {}
    }
	
	public static void ipbanUpdate()
    {
        ipbanned.clear();
        try
        {        
            BufferedReader in = new BufferedReader(new FileReader("data/text/ipbans.txt"));
            String inFile;
            while ((inFile = in.readLine()) != null)
            {
                ipbanned.add(inFile);
            }
        } catch (Exception e) {}
    }
	
	public void writeTo(String name, String path)
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
        updateAll();
    }
	
	public void deleteFrom(String name, String path)
    {
        if (name != null)
        {
            File file = new File(path + ".txt");
            if (file.exists())
            {    
                try
                {
                    BufferedReader in = new BufferedReader(new FileReader(file));
                    BufferedWriter out = new BufferedWriter(new FileWriter(file));
                    String inFile;
                    while ((inFile = in.readLine()) != null)
                    {
                        if (inFile.equalsIgnoreCase(name))
                            out.write(inFile);
                    }
                } catch (Exception e) {}
            }
        }
        updateAll();
    }
	
	public boolean isBanned(String name)
    {
        updateAll();
        if (banned.contains(name))
            return true;
        return false;
    }
	
	public boolean isIpBanned(IoSession session)
    {
        String ip = session.getRemoteAddress().toString();
        updateAll();
        if (ipbanned.contains(ip))
            return true;
        return false;
    }
	
	public boolean isIpMuted(IoSession session)
    {
        String ip = session.getRemoteAddress().toString();
        updateAll();
        if (ipmuted.contains(ip))
            return true;
        return false;
    }
	
	public boolean isMuted(String name)
    {
        updateAll();
        if (muted.contains(name))
            return true;
        return false;
    }
	
}