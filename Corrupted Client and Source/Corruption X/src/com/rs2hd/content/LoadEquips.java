package com.rs2hd.content;

import java.io.BufferedReader;
import java.io.FileReader;
import com.rs2hd.util.log.Logger;

/**
 * Item Definition class
 * @author Graham
 *
 */
public class LoadEquips {

private int [] EquipsIds = new int[16000];


    public LoadEquips() {
int amt = 0;
        String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[10];
        BufferedReader list = null;
        try {
            list = new BufferedReader(new FileReader("./data/equip.txt"));
            line = list.readLine().trim();
        } catch (Exception e) {
            Logger.getInstance().info("Error loading item list.");
        }
        while (line != null) {
            int spot = line.indexOf("=");
            if (spot > -1) {
                token = line.substring(0, spot).trim();
                token2 = line.substring(spot + 1).trim();
                token2_2 = token2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token3 = token2_2.split("\t");
                if (token.equals("item")) {
amt ++;
int ItemId = Integer.parseInt(token3[0]);
EquipsIds[ItemId] = Integer.parseInt(token3[1]);
                    }             
            } else {
                if (line.equals("[ENDOFEQUIPLIST]")) {
                    try {
Logger.getInstance().info("Loaded "+ amt + "item prices.");
                        list.close();
                    } catch (Exception exception) {
                    }
                    list = null;
                    return;
                }
            }
            try {
                line = list.readLine().trim();
            } catch (Exception exception1) {
                try {
                    list.close();
                } catch (Exception exception) {
                }
                list = null;
                return;
            }
        }
    }

public int getEquipId(int item) {
return EquipsIds[item];
}

}