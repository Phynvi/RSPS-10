package com.rs2hd.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.rs2hd.util.log.Logger;

public class Censor {

    public static List<String> censored = new ArrayList<String>();

    public Censor() {
	loadWords();
    }

    private void loadWords() {
        String word = null;
        try {
            BufferedReader in = new BufferedReader(new FileReader("data/Censor.txt"));
            while ((word = in.readLine()) != null) {
                censored.add(word);
            }
            in.close();
            in = null;
        } catch (Exception e) {
Logger.getInstance().info("Error load the censor.");
        }
    }
public static String Replace(String text) {
	for (String s : censored) {
	    if (text.contains(s)) {
		int length = s.length();
		String replace = "";
		for(int i = 0; i < length; i++) {
		    replace += "*";
		}
		text = text.replaceAll(s, replace);
	    }
	}

return text;
}

}