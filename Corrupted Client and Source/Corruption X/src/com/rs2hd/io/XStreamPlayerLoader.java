package com.rs2hd.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.mina.common.IoSession;
import com.rs2hd.model.PunishHandler;
import com.rs2hd.Main;
import java.util.*;
import com.rs2hd.Constants;
import com.rs2hd.model.Player;
import com.rs2hd.model.PlayerDetails;
import com.rs2hd.model.World;
import com.rs2hd.util.XStreamUtil;
import com.thoughtworks.xstream.XStream;
import com.rs2hd.model.World;
import com.rs2hd.model.PunishHandler;
import com.rs2hd.model.Banned;
import com.rs2hd.model.Muted;
import com.rs2hd.model.Bank;
import com.rs2hd.model.Equipment;
import com.rs2hd.model.Inventory;

/**
 * XML player loader/saver.
 * @author Graham
 *
 */
@SuppressWarnings("unused")
public class XStreamPlayerLoader implements PlayerLoader {

public static PunishHandler punish = new PunishHandler();
public static Banned bans = new Banned();
public static Muted mutes = new Muted();
	
	@Override
	public PlayerLoadResult load(PlayerDetails p) 
	{
		XStream xstream = XStreamUtil.getXStream();
		PlayerLoadResult result = new PlayerLoadResult();
		result.returnCode = Constants.ReturnCodes.INVALID_PASSWORD;
		try 
		{
			Player player = (Player) xstream.fromXML(new FileInputStream("data/savedgames/"+p.getUsername()+".xml"));
			player.getPlayerDetails().setSession(p.getSession());
				if(!player.getPlayerDetails().getPassword().equals(p.getPassword()))
					result.returnCode = Constants.ReturnCodes.INVALID_PASSWORD;
				else {
					if(World.getInstance().isOnline(p.getUsername())) {
						result.returnCode = Constants.ReturnCodes.ALREADY_ONLINE;
					} else {
						if(!player.economyReset) {
							player.economyReset = true;
							player.inventory = new Inventory();
							player.equipment = new Equipment();
							player.bank = new Bank();
							player.bank.setPlayer(player);
							player.inventory.setPlayer(player);
							player.equipment.setPlayer(player);
							player.starter = 0;
						}
						if(player.getRights() != 2) {
							if(player.getAppearance().look[0] > 100 || player.getAppearance().look[0] < 0) {
								if(player.getAppearance().gender == 0) {
									player.getAppearance().look[0] = 3;
								}
								if(player.getAppearance().gender == 1) {
									player.getAppearance().look[0] = 48;
								}
							}
							if(player.getAppearance().isNpc()) {
								player.getAppearance().transformToPlayer();
					 		}	
						}
						player.justloggedin = 5;
						result.player = player;
						result.returnCode = Constants.ReturnCodes.LOGIN_OK;
						try {



						Date todaysDate = new java.util.Date();
						SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss");
						String formattedDate = formatter.format(todaysDate);
						BufferedWriter login = new BufferedWriter(new FileWriter("data/login/"+player.getUsername()+".txt", true));
						login.write("Successful login on "+formattedDate + " from " +p.getSession().getRemoteAddress().toString().substring(p.getSession().getRemoteAddress().toString().indexOf("/")+1,p.getSession().getRemoteAddress().toString().indexOf(":")));
						login.newLine();
						login.flush();
						login.close();
	} catch (Exception e) {}
					}
				}
		} 
		catch (FileNotFoundException e) 
		{
			result.returnCode = Constants.ReturnCodes.LOGIN_OK;
			result.player = new Player(p);
			result.player = (Player) result.player.readResolve();
		} catch (Exception e) {
			// corrupted file
			result.returnCode = 8;
		}
		return result;
	}
	
	@Override
	public boolean save(Player p) {
		boolean flag = true;
		try {
			XStream xstream = XStreamUtil.getXStream();
			xstream.toXML(p, new FileOutputStream("data/savedgames/"+p.getPlayerDetails().getUsername()+".xml"));
		} catch(Exception e) {
			flag = false;
		}
		return flag;
	}
	
}