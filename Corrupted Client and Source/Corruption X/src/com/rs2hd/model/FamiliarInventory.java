package com.rs2hd.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rs2hd.util.log.Logger;

/**
 * @author Dragonkk and gotta make notes on other place it can be static since loads and saves -.-
 * gotta remake fam inv.
 *
 */
public class FamiliarInventory {


	private transient Player player;
	
	public void setPlayer(Player player) {
		try {
		this.player = player;
		} catch(Exception e) {
		}
	}
	public Container<Item> FamiliarInv = new Container<Item>(20, false);
	public transient int SelectedNote = -1;
	public int IntColorValue(int Color, int NoteId) {
		return (int) (Math.pow(4, NoteId)*Color);
	}
	public int numberOf(int id) {
		try {
		return FamiliarInv.getNumberOf(new Item(id, 1));
		} catch(Exception e) {
		return 0;
		}
	}
	public void deleteItem(int item, int amount) {
		try {
		FamiliarInv.remove(new Item(item, amount));
		refresh();
		} catch(Exception e) {
		}
	}
		public void LoadNotes(Player p) {
			OrganizeNotes(p);
			SaveNotesInTxt(p);
			for(int i = 0; i < 30; i++)
			if (p.Notes[i].equals("null"))
			p.getActionSender().sendInfoString("",149+i);
			else
			p.getActionSender().sendInfoString(p.Notes[i],149+i);
			p.getActionSender().sendConfig(1440, getFirstTotalColorValue(p));
			p.getActionSender().sendConfig(1441, getSecondTotalColorValue(p));
		}
		public void LoadNotesFirstTime(Player p) {
			LoadNotesFromTxt(p);
			OrganizeNotes(p);
			for(int i = 0; i < 30; i++)
				if (p.Notes[i].equals("null"))
				p.getActionSender().sendInfoString("",149+i);
				else
				p.getActionSender().sendInfoString(p.Notes[i],149+i);
			for(int i = 1430; i < 1440; i++)
			p.getActionSender().sendConfig(i, 1);
			p.getActionSender().sendConfig(1440, getFirstTotalColorValue(p));
			p.getActionSender().sendConfig(1441, getSecondTotalColorValue(p));
			p.getActionSender().sendConfig(1439, 0);
		}
		public void SaveNotesInTxt(Player p) {
		try {
	          BufferedWriter  bf = new BufferedWriter(new FileWriter("./data/notes/"+p.getUsername()+".txt", false));
	          for(int i = 0; i < 30; i++) {
				if (p.Notes[i] == null || p.Notes == null)
				bf.write("Note = "+i+ "\t"+"null"+ "\t"+0);	
				else
				bf.write("Note = "+i+ "\t"+p.Notes[i]+ "\t"+p.NoteColor[i]);
		          bf.newLine();
		          bf.flush();
			}
			bf.write("[ENDOFNOTELIST]");
	          bf.newLine();
	          bf.flush();
		     bf.flush();
		     bf.close();
		     bf = null; 
		     LoadNotesFromTxt(p);
		} catch(Exception e) {
		}
		}
	    public void LoadNotesFromTxt(Player p) {
	    	p.Notes = new String[30];
	    	p.NoteColor = new int[30];
	    	        String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[10];
	    	        BufferedReader list = null;
	    	        try {
	    	            list = new BufferedReader(new FileReader("./data/notes/"+p.getUsername()+".txt"));
	    	            line = list.readLine().trim();
	    	        } catch (Exception e) {
	    	        	SaveNotesInTxt(p);
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
	    	                if (token.equals("Note")) {
	    	int NoteId = Integer.parseInt(token3[0]);
	    	p.Notes[NoteId] = token3[1];
	    	p.NoteColor[NoteId] = Integer.parseInt(token3[2]);
	    	                    }             
	    	            } else {
	    	                if (line.equals("[ENDOFNOTELIST]")) {
	    	                    try {
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
		public int getFreeNote(Player p) {
			for(int i = 0; i < 30; i++) {
		if (p.Notes[i].equals("null") || p.Notes[i] == null) 
		return i;
		}
		return -1;
		}
		public int getFirstTotalColorValue(Player p) {
		int Color = 0;
		for(int i = 0; i < 15; i++) {
		if (!p.Notes[i].equals("null ")) 
		Color += IntColorValue(p.NoteColor[i],i);
		}
		return Color;
		}
		public int getSecondTotalColorValue(Player p) { //TODO
			int Color = 0;
			for(int i = 0; i < 15; i++) {
			if (!p.Notes[i*2].equals("null")) 
			Color += IntColorValue(p.NoteColor[i*2],i);
			}
			return Color;
			}
		public void addNote(Player p, String Note) {
		int NoteId = (getFreeNote(p));
		if (NoteId == -1)
		return;
		SelectedNote = NoteId;
		p.getActionSender().sendConfig(1439, NoteId);
		p.Notes[NoteId] = Note;
		p.NoteColor[NoteId] = 0;
		LoadNotes(p);
		}
		public void editNote(Player p, String Note) {
			p.Notes[SelectedNote] = Note;
			LoadNotes(p);
			}
		public void EditNote(Player p, String Option, int ButtonId, int ButtonId2) {
		if ((ButtonId == 11||ButtonId == 8) && Option.equals("DeleteAll")) {
		SelectedNote = -1;
		p.getActionSender().sendConfig(1439, -1);
		ResetNotes(p);
		LoadNotes(p);
		}
		if ((ButtonId == 11||ButtonId == 8) && Option.equals("Delete") && SelectedNote == -1) {
		p.sm("Please select a note first.");
		return;
		}
		if ((ButtonId == 11||ButtonId == 8) && Option.equals("Delete") && SelectedNote != -1) {
			p.getActionSender().sendConfig(1439, -1);
			p.Notes[SelectedNote] = "null";
			p.NoteColor[SelectedNote] = 0;
			SelectedNote = -1;
			LoadNotes(p);
			return;
		}
		if (ButtonId == 9 && Option.equals("Delete") && ButtonId2 != -1) {
			SelectedNote = -1;
			p.getActionSender().sendConfig(1439, -1);
			p.Notes[ButtonId2] = "null";
			p.NoteColor[ButtonId2] = 0;
			LoadNotes(p);
			return;
		}
		if (ButtonId == 9 && Option.equals("Select") && ButtonId2 != -1) {
			if (SelectedNote != ButtonId2)
			SelectedNote = ButtonId2;
			else
		    SelectedNote = -1;
			p.getActionSender().sendConfig(1439, SelectedNote);
			LoadNotes(p);
			return;
		}
		if (ButtonId == 9 && Option.equals("Edit") && ButtonId2 != -1) {
			p.getActionSender().sendConfig(1439, ButtonId2);
			SelectedNote = ButtonId2;
			p.setTemporaryAttribute("EditNote", 0);
			p.getActionSender().sendRunScript(110, new Object[]{"Edit Note:"}, "s");
			return;
		}
		if (ButtonId == 9 && Option.equals("Colour") && ButtonId2 != -1) {
			p.getActionSender().sendConfig(1439, ButtonId2);
			SelectedNote = ButtonId2;
			p.getActionSender().sendInterfaceConfig(34, 16, true);
			return;
		}
		if ((ButtonId == 35||ButtonId == 37||ButtonId == 39||ButtonId == 41) && Option.equals("SelectColour") && ButtonId2 != -1) {
			switch (ButtonId) {
			case 35:
			p.NoteColor[SelectedNote] = 0;
			break;
			case 37:
				p.NoteColor[SelectedNote] = 1;
			break;
			case 39:
				p.NoteColor[SelectedNote] = 2;
			break;
			case 41:
				p.NoteColor[SelectedNote] = 3;
			break;
			}
			p.getActionSender().sendInterfaceConfig(34, 16, false);
			LoadNotes(p);
			return;
		}
		if (ButtonId == 3 && Option.equals("Add")) {
			p.setTemporaryAttribute("AddNote", 0);
			p.getActionSender().sendRunScript(110, new Object[]{"Add Note:"}, "s");
			return;
			}
		}
		public void ResetNotes(Player p) {
			for(int i = 0; i < 30; i++) {
		p.Notes[i] = "null";
		p.NoteColor[i] = 0;
			}
		}
		public void OrganizeNotes(Player p) {
			for(int i = 0; i < 30; i++) {
			if (p.Notes[i].equals("null") ||  p.Notes[i] == null) {
				continue;
			}
				for(int ii = 0; ii < i; ii++) {
					if (p.Notes[ii].equals("null") ||  p.Notes[ii] == null) {	
						p.Notes[ii] = p.Notes[i];
						p.NoteColor[ii] = p.NoteColor[i];
						p.Notes[i] = "null";
						p.NoteColor[i] = 0;
					}
				}
			}
		}
	public void openFamiliarInventory() {
		try {
		refresh();
		/*player.getActionSender().sendInterface(518);
		player.getActionSender().sendInventoryInterface(517);*/
		player.getActionSender().sendInterface(671);
		player.getActionSender().sendInventoryInterface(665);
		} catch(Exception e) {
		}
	}
	
	public void refresh() {
		try {
/*player.getActionSender().sendItems(518, 78, 93, FamiliarInv);
player.getActionSender().sendItems(517, 0, 93, player.getInventory().getContainer());*/
			player.getActionSender().sendItems(-1, 63772, 530, FamiliarInv);
			player.getActionSender().sendItems(-1, 64209, 93, player.getInventory().getContainer());
			invOptions();
			
			
player.getActionSender().sendItems(149, 0, 93, player.getInventory().getContainer());



		} catch(Exception e) {
		}
	}
	public void invOptions() {
		try {		
			Object[] tparams1 = new Object[]{"Withdraw-X<col=ff9040>", "Withdraw-All<col=ff9040>", "Withdraw-10<col=ff9040>", "Withdraw-5<col=ff9040>", "Withdraw-1<col=ff9040>", 43974683, 0, 5, 6, 530, 43974683};
			player.getActionSender().sendRunScript(149, tparams1, "IviiiIsssss");
			player.getActionSender().sendAccessMask(1086, 671, 27, 0, 29);
			Object[] tparams2 = new Object[]{"Store-X<col=ff9040>", "Store-All<col=ff9040>", "Store-10<col=ff9040>", "Store-5<col=ff9040>", "Store-1<col=ff9040>", 43581440, 0, 7, 4, 93, 43581440};
			player.getActionSender().sendRunScript(149, tparams2, "IviiiIsssss");
			player.getActionSender().sendAccessMask(1086, 665, 0, 0, 27);

		} catch(Exception e) {
		}
	}
	public Container<Item> getContainer() {
		return FamiliarInv;
	}

	public int getFreeSlots() {
		try {
		return FamiliarInv.getFreeSlots();
		} catch(Exception e) {
		return 0;
		}
	}


	public void FamiliarInvItem(int slot, int amount) {
		try {
		if(slot < 0 || slot > Inventory.SIZE || amount <= 0) {
			return;
		}
		Item item = player.getInventory().getContainer().get(slot);
		if(item == null) {
			return;
		}
		if(amount > player.getInventory().getContainer().getNumberOf(item)) {
			item = new Item(item.getId(), item.getAmount());
		} else {
			item = new Item(item.getId(), amount);
		}
		if(player.getInventory().getContainer().contains(item)) {
			/*if(FamiliarInv.containsOne(item)) {
				for(int i = 0; i < SIZE; i++) {
					Item familiarinvitem = FamiliarInv.get(i);
					if(familiarinvitem == null) {
						continue;
					}
					if(familiarinvitem.getId() == item.getId()) {
						FamiliarInv.set(i, new Item(item.getId(), familiarinvitem.getAmount() + item.getAmount()));
						player.getInventory().getContainer().remove(item);
						break;
					}
				}
			} else {*/
				if(getFreeSlots() <= 0) {
					player.getActionSender().sendMessage("Not enough space in your Familiar Inventory.");
				} else {
					FamiliarInv.add(item);
					player.getInventory().getContainer().remove(item);
				}
			//}
		}
		refresh();
		} catch(Exception e) {
		}
	}
	public void InvItemAll() {
player.getInventory().getContainer().addAll(FamiliarInv);
getContainer().reset();
refresh();
	}
	public void deleteAll(int item) {
		try {
		FamiliarInv.removeAll(new Item(item));
		refresh();
		} catch(Exception e) {
		}
	}
	public void DropAll() {
for(int i = 12; i > 0; i--) {
Item item = FamiliarInv.get(i);
World.getInstance().getItemManager().createGroundItem(player, item);
}
getContainer().reset();
refresh();
	}


	public void InvItem(int slot, int amount) {
		try {
		if(slot < 0 || slot > player.FamiliarInvSize || amount <= 0) {
			return;
		}
		Item item = FamiliarInv.get(slot);
		if(item == null) {
			return;
		}
		if(amount > item.getAmount()) {
			item = new Item(item.getId(), item.getAmount());
		} else {
			item = new Item(item.getId(), amount);
		}
		if(FamiliarInv.contains(item)) {
			if(player.getInventory().getFreeSlots() <= 0) {
				player.getActionSender().sendMessage("Not enough space in your inventory.");
			} else {
				player.getInventory().getContainer().add(item);
				FamiliarInv.remove(item);
				FamiliarInv.shift();
			}
		}
		refresh();
		} catch(Exception e) {
		}
	}

}
