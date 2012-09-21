package com.rs2hd.model;

import com.rs2hd.event.Event;

public class NpcDialogue {
	
private transient Player p;
private transient int NpcId = 0;
private transient NPC NpcTo = null;
private transient int TalkStage = 0;
public transient boolean istalking = false;
public NpcDialogue(Player p) {
	try {
	this.p = p;
	} catch(Exception e) {
	}
}

public void StartTalkingTo(NPC n) {
if (istalking)
resetTalk();
String[] inform;
istalking = true;
NpcId = n.getId();
TalkStage = 1;
switch (n.getId()) {
case 2205:
inform  = new String[]{"Keldagrim city.","Keldagrim mine."};
definitions(236,inform);
p.getActionSender().sendString("Where would you like to go?",236,0);
break;
case 2206:
inform  = new String[]{"Keldagrim port.","Fishing platform."};
definitions(236,inform);
p.getActionSender().sendString("Where would you like to go?",236,0);
break;
case 8279:
inform  = new String[]{"Cyrisus","Hello! Welcome to Fatality."};
definitions(241,inform);
break;
case 8454:
	NpcTo = n;
	inform  = new String[]{"Across the charm.","Into the charm."};
	definitions(236,inform);
	break;
default:
resetTalk();
break;
}
}
public void KeepTalkingTo(int Interface, int ChillId) {
if (istalking == false)
return;
String[] inform;
switch(Interface){
case 241:
switch(NpcId){
case 8279:
if (ChillId == 5) {
	switch(TalkStage){
	case 1:
	case 4:
	case 5:
	case 8:
		TalkStage = 2;
		inform  = new String[]{"Who are you?","What is Fatality?","What are you working on?","Nothing, bye."};
		definitions(237,inform);
	break;
	case 3:
		TalkStage = 7;
		inform  = new String[]{"Cyrisus", "and brother of the most powerfull god of runescape..."};
		definitions(241,inform);
	break;
	case 7:
		TalkStage = 8;
		inform  = new String[]{"Cyrisus", "Caelum!!"};
		definitions(241,inform);
	break;
	case 6:
	resetTalk();
	break;
	}
}
break;
default:
resetTalk();
break;
	}
break;
case 237:
	switch(NpcId){
	case 8279:
		if (TalkStage == 2) {
			if (ChillId == 1) {		
				TalkStage = 3;
				inform  = new String[]{"Cyrisus", "I am Cyrisus, the King of Fatality."};
				definitions(241,inform);
			}
			if (ChillId == 2) {		
				TalkStage = 4;
				inform  = new String[]{"Cyrisus","Fatality its the World you're in at the moment."};
				definitions(241,inform);
			}
			if (ChillId == 3) {		
				TalkStage = 5;
				inform  = new String[]{"Cyrisus","I am working with my brother Caelum at NPC Dialogue."};
				definitions(241,inform);
			}
			if (ChillId == 4) {		
				TalkStage = 6;
				inform  = new String[]{p.getUsername(),"Sorry, I got to go..."};
				definitions(241,inform);
			}
		}
		break;
	default:
		resetTalk();
		break;
	}
break;
case 236:
switch(NpcId){
case 8454:
	if (ChillId == 1) {
		p.sm("Working on this.");
		//p.teleport(Location.location(2887, 10224, 0));
		}
		if (ChillId == 2) {
			NpcTo.UsingThis = true;
			NpcTo.setId(8455);
			p.teleport(Location.location(NpcTo.getLocation().getX()+1,NpcTo.getLocation().getY()+1,NpcTo.getLocation().getZ()));
			p.animate(2046);
			p.cantWalk = true;
			World.getInstance().registerEvent(new Event(1000) {
				public void execute() {
					p.animate(2048);
					p.getActionSender().sendTab(1, 818);
					World.getInstance().registerEvent(new Event(10000) {
						public void execute() {
							p.animate(2047);
							World.getInstance().registerEvent(new Event(1000) {
								public void execute() {
									NpcTo.UsingThis = false;
							p.getActionSender().sendTab(1,56);
							p.teleport(Entity.DEFAULT_LOCATION);
							p.cantWalk = false;
							NpcTo.setId(8454);
							this.stop();
								}
							});
							this.stop();
						}
					});
					this.stop();
				}
					});
		//p.teleport(Location.location(2782, 3273, 0));	
		}
		resetTalk();
	break;
case 2205:
if (ChillId == 1) {
p.teleport(Location.location(2887, 10224, 0));
}
if (ChillId == 2) {
//p.teleport(Location.location(2782, 3273, 0));	
}
resetTalk();
break;
case 2206:
if (ChillId == 1) {
p.teleport(Location.location(2871, 10143, 0));
}
if (ChillId == 2) {
p.teleport(Location.location(2782, 3273, 0));	
}	
resetTalk();
break;
default:
resetTalk();
break;
}
break;
default:
resetTalk();
break;
}
}

public void definitions(int Interface, String[] TalkDefinitons) {
int []ChildOptions = new int[7];
p.getActionSender().sendChatboxInterface(Interface);
switch(Interface) {
case 236:
ChildOptions[0] = 1;
ChildOptions[1] = 2;
break;
case 237:
ChildOptions[0] = 1;
ChildOptions[1] = 2;
ChildOptions[2] = 3;
ChildOptions[3] = 4;
break;
case 241:
ChildOptions[0] = 3;
ChildOptions[1] = 4;
break;
}
for (int ChildOptionId = 0; ChildOptionId < TalkDefinitons.length; ChildOptionId++) {
p.getActionSender().sendString(TalkDefinitons[ChildOptionId],Interface,ChildOptions[ChildOptionId]);
}
}
public void resetTalk() {
	istalking = false;
	NpcId = 0;
	TalkStage = 0;
	p.getActionSender().sendCloseChatboxInterface();
}
}
