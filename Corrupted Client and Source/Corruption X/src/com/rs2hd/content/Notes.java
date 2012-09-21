package com.rs2hd.content;

import com.rs2hd.model.Player;
/*
 * TODO put the notes of  familiarinv here
 */
public class Notes {
public static int IntColorValue(int Color, int NoteId) {
return Color*4^NoteId;
}
public static void LoadNotes(Player p) {
	
	for(int i = 0; i < 30; i++)
	p.getActionSender().sendInfoString(p.Notes[i],149+i);
	/*for(int i = 1430; i < 1440; i++)
	sendConfig(i, 1);*/
	p.getActionSender().sendConfig(1440, getTotalColorValue(p));
}
public static void LoadNotesFirstTime(Player p) {
	
	for(int i = 0; i < 30; i++)
	p.getActionSender().sendInfoString(p.Notes[i],149+i);
	for(int i = 1430; i < 1450; i++)
	p.getActionSender().sendConfig(i, i);
	p.getActionSender().sendConfig(1440, getTotalColorValue(p));
	p.getActionSender().sendConfig(1439, 0);
}
public static int getFreeNote(Player p) {
	for(int i = 0; i < 30; i++) {
if (p.Notes[i].equals("")) 
return i;
}
return -1;
}
public static int getTotalColorValue(Player p) {
int Color = 0;
for(int i = 0; i < 30; i++) {
if (!p.Notes[i].equals("")) 
Color += IntColorValue(p.NoteColor[i],i);
}
return Color;
}
public static void addNote(Player p) {
int NoteId = (getFreeNote(p));
if (NoteId == -1)
return;
p.Notes[NoteId] = "Skuxx owns! NoteId: "+NoteId+".";
}
public static void EditNote(Player p, String Option, int ButtonId, int ButtonId2) {
if ((ButtonId == 11||ButtonId == 8) && Option.equals("DeleteAll")) {
p.getActionSender().sendConfig(1440, 0);
ResetNotes(p);
LoadNotes(p);
}
if ((ButtonId == 11||ButtonId == 8) && Option.equals("Delete") && SelectedNote == -1) {
p.sm("Please select a note first.");
return;
}
if ((ButtonId == 11||ButtonId == 8) && Option.equals("Delete") && SelectedNote != -1) {
	p.Notes[SelectedNote] = "";
	p.NoteColor[SelectedNote] = 0;
	LoadNotes(p);
	return;
}
if (ButtonId == 9 && Option.equals("Delete") && ButtonId2 != -1) {
	p.Notes[ButtonId2] = "";
	p.NoteColor[ButtonId2] = 0;
	LoadNotes(p);
	return;
}
if (ButtonId == 9 && Option.equals("Select") && ButtonId2 != -1) {
	if (SelectedNote != ButtonId2)
	SelectedNote = ButtonId2;
	else
    p.SelectedNote = -1;
	p.getActionSender().sendConfig(1440, p.SelectedNote);
	LoadNotes(p);
	return;
}
if (ButtonId == 9 && Option.equals("Edit") && ButtonId2 != -1) {
	p.getActionSender().sendConfig(1440, ButtonId2);
	p.SelectedNote = ButtonId2;
	return;
}
if (ButtonId == 9 && Option.equals("Colour") && ButtonId2 != -1) {
	p.getActionSender().sendConfig(1440, ButtonId2);
	p.SelectedNote = ButtonId2;
	p.getActionSender().sendInterfaceConfig(34, 16, true);
	return;
}
if ((ButtonId == 35||ButtonId == 37||ButtonId == 39||ButtonId == 41) && Option.equals("SelectColour") && ButtonId2 != -1) {
	p.getActionSender().sendConfig(1440, ButtonId2);
	p.SelectedNote = ButtonId2;
	switch (ButtonId) {
	case 35:
	p.NoteColor[ButtonId2] = 0;
	break;
	case 37:
		p.NoteColor[ButtonId2] = 1;
	break;
	case 39:
		p.NoteColor[ButtonId2] = 2;
	break;
	case 41:
		p.NoteColor[ButtonId2] = 3;
	break;
	}
	p.getActionSender().sendInterfaceConfig(34, 16, false);
	LoadNotes(p);
	return;
}
if (ButtonId == 3 && Option.equals("Add") && p.getFamiliarInventory().SelectedNote == -1) {
	addNote(p);
	LoadNotes(p);
	return;
	}
}
public static void ResetNotes(Player p) {
	for(int i = 0; i < 30; i++) {
p.getFamiliarInventory().Notes[i] = "";
p.getFamiliarInventory().NoteColor[i] = 0;
	}
}

}
