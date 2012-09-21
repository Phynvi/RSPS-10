package com.rs2hd.model;

import java.util.*;
import java.io.*;

import com.rs2hd.io.XStreamPlayerLoader;
import com.rs2hd.model.Player;
import org.apache.mina.common.IoSession;

/**
 * 
 * Working Rs2hd Ban
 * @author Jon
 *
 */

public class Banned
{
public static List<String> banned = new ArrayList<String>();

public void banUser(String name) 
{
BufferedWriter bw = null;
try 
{
bw = new BufferedWriter(new FileWriter("data/text/bans.txt", true));
bw.write(name);
bw.newLine();
bw.flush();
} catch (IOException ioe) {
ioe.printStackTrace();
} finally {
if (bw != null)
try 
{
bw.close();
} catch (IOException ioe2) {
System.out.println("Error writing system log.");
ioe2.printStackTrace();
}
}
update();
}

public boolean isBanned(String name) {
update();
if (banned.contains(name)) 
return true;
return false;
}

public void unBan(String name)
{
if (name != null)
{
File file = new File("data/text/bans.txt");
if (file.exists()) {	
try {
BufferedReader in = new BufferedReader(new FileReader(file));
BufferedWriter out = new BufferedWriter(new FileWriter(file));
String inFile;
while ((inFile = in.readLine()) != null) {
if (inFile.equalsIgnoreCase(name)) {} 
else 
out.write(inFile);
}
} catch (Exception e) {}
} 
}
update();
}

public static void update()
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

public Banned()
{
update();
}
} 