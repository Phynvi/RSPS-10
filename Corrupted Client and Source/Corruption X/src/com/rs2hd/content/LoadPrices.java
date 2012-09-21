package com.rs2hd.content;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import com.rs2hd.model.Player;
import com.rs2hd.util.log.Logger;

/**
 * Item Definition class
 * @author Graham
 *
 */
public class LoadPrices {

private int [] itemPriceMin = new int[16000];
private int [] itemPriceMed = new int[16000];
private int [] itemPriceMax = new int[16000];
public int [][] objects = new int[0][0];
public void DumpData(int Id) {
	try {
          BufferedWriter  bf = new BufferedWriter(new FileWriter("./data/mapdata/special/"+Id+".txt", false));
			bf.write("0");
	          bf.newLine();
	          bf.flush();
				bf.write("0");
		          bf.newLine();
		          bf.flush();
					bf.write("0");
			          bf.newLine();
			          bf.flush();
						bf.write("0");
				          bf.newLine();
				          bf.flush();
	     bf.flush();
	     bf.close();
	     bf = null; 
	} catch(Exception e) {
	}
	}
public void LoadObjects() {
	/*int amt = 0;
	        String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[10];
	        BufferedReader list = null;
	        try {
	            list = new BufferedReader(new FileReader("./data/objects.dat"));
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
	                if (token.equals("Object")) {
	amt ++;
	objects[Integer.parseInt(token3[1])][Integer.parseInt(token3[2])] =  Integer.parseInt(token3[0]);
	                    }             
	            } else {
	                if (line.equals("[ENDOFOBJECTLIST]")) {
	                    try {
	Logger.getInstance().info("Loaded "+ amt + " of objects handleds.");
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
	        }*/
	    }

    public LoadPrices() {
		/*for(int i = 0; i < 17500; i++) {
			DumpData(i);
		}*/
int amt = 0;
        String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[10];
        BufferedReader list = null;
        try {
            list = new BufferedReader(new FileReader("./data/prices.cfg"));
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
                if (token.equals("Item")) {
amt ++;
int ItemId = Integer.parseInt(token3[0]);
itemPriceMin[ItemId] = Integer.parseInt(token3[1]);
itemPriceMed[ItemId] = Integer.parseInt(token3[2]);
itemPriceMax[ItemId] = Integer.parseInt(token3[3]);
                    }             
            } else {
                if (line.equals("[ENDOFPRICELIST]")) {
                    try {
                    	LoadObjects();
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

public int getMinimumPrice(int Id) {
return itemPriceMin[Id];
}

public int getNormalPrice(int Id) {
return itemPriceMed[Id];
}

public int getMaximumPrice(int Id) {
return itemPriceMax[Id];
}

}