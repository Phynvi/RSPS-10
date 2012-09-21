package com.rs2hd.model;

import java.util.*;
import java.io.*;

import com.rs2hd.io.XStreamPlayerLoader;
import com.rs2hd.model.Player;
import org.apache.mina.common.IoSession;

/**
 * 
 * Working Rs2hd Mute
 * @author Jon
 *
 */

public class Muted
{
public static List<String> muted = new ArrayList<String>();

public void muteUser(String name) 
{
BufferedWriter bw = null;
try 
{
bw = new BufferedWriter(new FileWriter("data/text/mutes.txt", true));
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

public boolean isMuted(String name) {
update();
if (muted.contains(name))
return true;
return false;
}

public void unMute(String name)
{
if (name != null)
{
File file = new File("data/text/mutes.txt");
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

public static void update() {
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

public Muted()
{
update();
}
} 