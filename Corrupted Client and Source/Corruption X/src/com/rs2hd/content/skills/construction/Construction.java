package com.rs2hd.content.skills.construction;

import com.rs2hd.model.Player;


/**
 * @author Dragonkk look my junk
 *
 */
public class Construction {

	private transient Player player;
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		} catch(Exception e) {
		}
	}

public int RoomAmount; //number of rooms
public int[] RoomType = new int[24];
public int[] RoomCoordX = new int[24];
public int[] RoomCoordY = new int[24];

//Garden
public int[] CentrepieceSpace = new int[24];
public int[] TreeSpace = new int[24];
public int[] BigTreeSpace = new int[24];
public int[] SmallPlantSpace1 = new int[24];
public int[] SmallPlantSpace2 = new int[24];
public int[] BigPlantSpace1 = new int[24];
public int[] BigPlantSpace2 = new int[24];

public int WallType;//Wall Type
public boolean BuildMode = true;

public void LoadRoom(Player Owner, Player Visitor, int RoomId) { //loads Rooms

if ((Owner != Visitor && Owner.getHouse().BuildMode == true) || Owner == null || Visitor == null)
return;//checks if u owner and if cons mode on and if owner is on ur visitor

switch (RoomType[RoomId]) {
case 0:
default:
//doesnt load anything
break;

case 1: //garden
LoadGarden(Owner, Visitor, RoomId);
break;
case 2: //Parlor
LoadWalls(Owner, Visitor, RoomId);
LoadParlor(Owner, Visitor, RoomId);
break;
}
}
public void LoadParlor(Player Owner, Player Visitor, int RoomId) {

if ((Owner != Visitor && Owner.getHouse().BuildMode == true) || Owner == null || Visitor == null)
return;//checks if u owner and if cons mode on and if owner is on ur visitor
}

public void LoadGarden(Player Owner, Player Visitor, int RoomId) {

if ((Owner != Visitor && Owner.getHouse().BuildMode == true) || Owner == null || Visitor == null)
return;//checks if u owner and if cons mode on and if owner is on ur visitor


int HouseHeight = 0;
if (Owner.getHouse().BuildMode == true) {
if (CentrepieceSpace[RoomId] == 15361)
Visitor.getActionSender().sendCreateObject(15361, HouseHeight, RoomCoordX[RoomId]-1 , RoomCoordY[RoomId], 0, 10);
if (TreeSpace[RoomId] == 15363)
Visitor.getActionSender().sendCreateObject(15363, HouseHeight, RoomCoordX[RoomId]+2 , RoomCoordY[RoomId]+2, 0, 10);
if (BigTreeSpace[RoomId] == 15362)
Visitor.getActionSender().sendCreateObject(15362, HouseHeight, RoomCoordX[RoomId]-3 , RoomCoordY[RoomId]+2, 0, 10);
if (SmallPlantSpace1[RoomId] == 15366)
Visitor.getActionSender().sendCreateObject(15366, HouseHeight, RoomCoordX[RoomId]-1 , RoomCoordY[RoomId]-2, 0, 10);
if (SmallPlantSpace2[RoomId] == 15367)
Visitor.getActionSender().sendCreateObject(15367, HouseHeight, RoomCoordX[RoomId] , RoomCoordY[RoomId]+2, 0, 10);
if (BigPlantSpace1[RoomId] == 15364)
Visitor.getActionSender().sendCreateObject(15364, HouseHeight, RoomCoordX[RoomId]+1 , RoomCoordY[RoomId]-3, 0, 10);
if (BigPlantSpace2[RoomId] == 15365)
Visitor.getActionSender().sendCreateObject(15365, HouseHeight, RoomCoordX[RoomId]-3 , RoomCoordY[RoomId]-3, 0, 10);
int DoorRight = 15305;
int DoorLeft = 15306;
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId] , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId] -1 , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId] , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId] -1 , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId]+3, RoomCoordY[RoomId], 2, 0);
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId]+3 , RoomCoordY[RoomId] +1,  2, 0);
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId]-4, RoomCoordY[RoomId], 0, 0);
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] +1, 0, 0);
}
if (CentrepieceSpace[RoomId] == 13405)
Visitor.getActionSender().sendCreateObject(CentrepieceSpace[RoomId], HouseHeight, RoomCoordX[RoomId]-1 , RoomCoordY[RoomId], 0, 10);
}

public void LoadWalls(Player Owner, Player Visitor, int RoomId) {

if ((Owner != Visitor && Owner.getHouse().BuildMode == true) || Owner == null || Visitor == null)
return;//checks if u owner and if cons mode on and if owner is on ur visitor


int HouseHeight = 0;
int Walls;
int DoorRight;
int DoorLeft;
int WallWindow;

switch(WallType) {
case 0:
default:
Walls = 13116; //Wall id
WallWindow = 13117;
DoorRight = 13118;
DoorLeft = 13119;
break;
}

//coord 3010 
//Walls 
// up
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId] , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId] +1 , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] +2 , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId] -1 , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId] -2 , RoomCoordY[RoomId] +4, 1, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] -3 , RoomCoordY[RoomId] +4, 1, 0);

Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] +3 , RoomCoordY[RoomId] +4, 1, 2);

Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] -4 , RoomCoordY[RoomId] +4, 0, 2);

Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] +3 , RoomCoordY[RoomId] -3, 6, 2);

Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] -3, 3, 2);

// down
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId] , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId] +1 , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] +2 , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId] -1 , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId] -2 , RoomCoordY[RoomId] -3, 3, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId] -3 , RoomCoordY[RoomId] -3, 3, 0);
//right
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId]+3, RoomCoordY[RoomId], 2, 0);
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId]+3 , RoomCoordY[RoomId] +1,  2, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId]+3 , RoomCoordY[RoomId] +2,  2, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId]+3 , RoomCoordY[RoomId] +3,  2, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId]+3 , RoomCoordY[RoomId] -1,  2, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId]+3 , RoomCoordY[RoomId] -2,  2, 0);
//left
Visitor.getActionSender().sendCreateObject(DoorLeft, HouseHeight, RoomCoordX[RoomId]-4, RoomCoordY[RoomId], 0, 0);
Visitor.getActionSender().sendCreateObject(DoorRight, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] +1, 0, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] +2, 0, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] +3, 0, 0);
Visitor.getActionSender().sendCreateObject(WallWindow, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] -1, 0, 0);
Visitor.getActionSender().sendCreateObject(Walls, HouseHeight, RoomCoordX[RoomId]-4 , RoomCoordY[RoomId] -2, 0, 0);
//coord 3010 
}

public void createRoom(Player Owner, int createRoomType, int CenterCoordX, int CenterCoordY) { //creates Rooms
Owner.getHouse().RoomAmount = Owner.getHouse().RoomAmount +1;//Amount of rooms

int RoomId = Owner.getHouse().RoomAmount; //New room id
if (RoomId > 24) {
Owner.getHouse().RoomAmount = 24; //limit 24rooms
return;
}
RoomType[RoomId] = createRoomType; //room type kitchen etc...
RoomCoordX[RoomId] = CenterCoordX; //coordX for create room across
RoomCoordY[RoomId] = CenterCoordY;//coordY for create room across

if(createRoomType == 1) {
CentrepieceSpace[RoomId] = 15361;
TreeSpace[RoomId] = 15363;
BigTreeSpace[RoomId] = 15362;
SmallPlantSpace1[RoomId] = 15366;
SmallPlantSpace2[RoomId] = 15367;
BigPlantSpace1[RoomId] = 15364;
BigPlantSpace2[RoomId] = 15365;

if (RoomId == 1)
CentrepieceSpace[RoomId] = 13405;
}

}


}
