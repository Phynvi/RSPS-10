package com.rs2hd.model;
import com.rs2hd.model.Player;
import com.rs2hd.util.Misc;
import com.rs2hd.event.*;

public class RequestAssist {
	
@SuppressWarnings("unused")
private transient Player p;
	
public RequestAssist(Player p) {
	this.p = p;
}
public transient Player AssistReq = null;

public transient boolean IsAssisting = false;
public transient Player AssistedBy = null;
public transient boolean[] assistSkills = new boolean[24];
public transient int[] assistSkillsXp = new int[24];
public transient int assistTotalXp = 0;

public void requestAssist(Player p, Player other) {
	try {
	if(other.RequestAssist().AssistReq == p) {
		p.RequestAssist().turnAssistOn(p, other);
		other.RequestAssist().turnAssistOn(other, p);
		p.RequestAssist().ShowAssistInter(p);
		p.RequestAssist().CheckPlayer(other);
		other.RequestAssist().CheckPlayer(p);
	} else {
		p.getActionSender().sendMessage("Sending Assist request...");
		//other.getActionSender().sendTradeReq(Misc.upper(other.getUsername()), "is requesting your assistance.");
		AssistReq = other;
	}
	} catch(Exception e) {
		p.sm("error"+e);
	}
}


private void turnAssistOff(Player p) {
	IsAssisting = false;
	AssistedBy = null;
	resetSkillsDefinitons(p);
	p.getActionSender().sendInterfaceConfig(745, 2, false);
	AssistReq = null;
}
public void AssistFinishInter(Player p) {
	p.getActionSender().sendInterface(255);
	p.getActionSender().sendString( "Request Assist finished.", 255, 3);
	p.sm("Request Assist finished.");
}
public void turnAssistOn(Player p, Player assister) {
	IsAssisting = true;
	AssistedBy = assister;
	resetSkillsDefinitons(p);
	p.getActionSender().sendInterfaceConfig(745, 2, true);
}
public void ShowAssistInter(Player p) {
	p.getActionSender().sendInterface(301);
	p.getActionSender().sendInventoryInterface(56);
	p.getActionSender().sendString("", 301, 10);
	p.getActionSender().sendString("Assist System XP Display - You are assisting "+AssistedBy.getUsername(), 301, 101);
	
}


public void CheckPlayer(final Player p) {
	World.getInstance().registerEvent(new Event(3000) {
		public void execute() {
		if (p == null) {
			this.stop();
			return;
		}
		if ((AssistedBy == null && p != null) || IsAssisting == false || AssistedBy.RequestAssist().IsAssisting == false) {
			AssistFinishInter(p);
			turnAssistOff(p);
			this.stop();
			return;
		}
		}
		});
}


private void resetSkillsDefinitons(Player p) {
	for (int i = 0; i < 24; i++) {
		assistSkills[i] = false;
		assistSkillsXp[i] = 0;
	}
}

public void SetAssistXp(Player p) {
	p.getActionSender().sendString(""+assistSkillsXp[20],301,71);
	p.getActionSender().sendString(""+assistSkillsXp[12],301,73);
	p.getActionSender().sendString(""+assistSkillsXp[9],301,75);
	p.getActionSender().sendString(""+assistSkillsXp[21],301,77);
	p.getActionSender().sendString(""+assistSkillsXp[19],301,79);
	p.getActionSender().sendString(""+assistSkillsXp[6],301,81);
	p.getActionSender().sendString(""+assistSkillsXp[13],301,83);
	p.getActionSender().sendString(""+assistSkillsXp[7],301,85);
	p.getActionSender().sendString(""+assistSkillsXp[15],301,87);
	p.getActionSender().sendString(""+assistTotalXp,301,99);
}

public void SetOption(Player p, int buttonId) {
	if (IsAssisting == false)
		return;
	
	switch(buttonId){
		case 15: //runecrafting
			if (assistSkills[20] == true) {
				assistSkills[20] = false;
				p.getActionSender().sendInterfaceConfig(301, 14, false);
			}else{
				assistSkills[20] = true;
				p.getActionSender().sendInterfaceConfig(301, 14, true);
			}
		break;
		case 20: //crafting
			if (assistSkills[12] == true) {
				assistSkills[12] = false;
				p.getActionSender().sendInterfaceConfig(301, 19, false);
			}else{
				assistSkills[12] = true;
				p.getActionSender().sendInterfaceConfig(301, 19, true);
			}
		break;
		case 25: //fletching
			if (assistSkills[9] == true) {
				assistSkills[9] = false;
				p.getActionSender().sendInterfaceConfig(301, 24, false);
			}else{
				assistSkills[9] = true;
				p.getActionSender().sendInterfaceConfig(301, 24, true);
			}
		break;
		case 30: //construction
			if (assistSkills[21] == true) {
				assistSkills[21] = false;
				p.getActionSender().sendInterfaceConfig(301, 29, false);
			}else{
				assistSkills[21] = true;
				p.getActionSender().sendInterfaceConfig(301, 29, true);
			}
		break;
		case 35: //farming
			if (assistSkills[19] == true) {
				assistSkills[19] = false;
				p.getActionSender().sendInterfaceConfig(301, 34, false);
			}else{
				assistSkills[19] = true;
				p.getActionSender().sendInterfaceConfig(301, 34, true);
			}
		break;
		case 40: //magic
			if (assistSkills[6] == true) {
				assistSkills[6] = false;
				p.getActionSender().sendInterfaceConfig(301, 39, false);
			}else{
				p.RequestAssist().assistSkills[6] = true;
				p.getActionSender().sendInterfaceConfig(301, 39, true);
			}
		break;
		case 45: //smithing
			if (assistSkills[13] == true) {
				assistSkills[13] = false;
				p.getActionSender().sendInterfaceConfig(301, 44, false);
			}else{
				assistSkills[13] = true;
				p.getActionSender().sendInterfaceConfig(301, 44, true);
			}
		break;
		case 50: //cooking
			if (assistSkills[7] == true) {
				assistSkills[7] = false;
				p.getActionSender().sendInterfaceConfig(301, 49, false);
			}else{
				assistSkills[7] = true;
				p.getActionSender().sendInterfaceConfig(301, 49, true);
			}
		break;
		case 55: //herblore
			if (assistSkills[15] == true) {
				assistSkills[15] = false;
				p.getActionSender().sendInterfaceConfig(301, 54, false);
			}else{
				assistSkills[15] = true;
				p.getActionSender().sendInterfaceConfig(301, 54, true);
			}
		break;
			
	}
}


}
