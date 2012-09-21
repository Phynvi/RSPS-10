package com.rs2hd.content.skills.summoning;

import com.rs2hd.model.FamiliarNpc;
import com.rs2hd.model.NPC;
import com.rs2hd.model.Player;
import com.rs2hd.model.World;

/**
 * @author Dragonkk 
 * remade on 546 and notp erfect
 *
 */
@SuppressWarnings("unused")
public class Summon {

 
	public void SummonStart(Player p, int ItemId, boolean check) {
try {
	if (check == true) {
	}
	if (p.Summoning && check)
	return;
	switch(ItemId) {
		case 12031:
			
				p.sm("This familiar can no longer be spawned.");
		

		break;
		case 12029:
			if (p.getSkills().getLevelForXp(23) < 68) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12007;
new FamiliarNpc(6813,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6813);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12007:
			if (p.getSkills().getLevelForXp(23) < 52) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12029;
p.FamiliarInvSize = 12;
new FamiliarNpc(6794,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6794);
p.getInventory().deleteItem(ItemId,1);
		break;
case 12023:
			if (p.getSkills().getLevelForXp(23) < 58) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
			
p.Summoning = true;
p.SummoningItemId = 12023;
new FamiliarNpc(1609,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 1609);
p.getInventory().deleteItem(ItemId,1);

		break;
		case 12047:
			if (p.getSkills().getLevelForXp(23) < 1) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12047;
new FamiliarNpc(6829,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6829);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12083:
			if (p.getSkills().getLevelForXp(23) < 86) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12083;
new FamiliarNpc(6863,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6863);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12099:
			if (p.getSkills().getLevelForXp(23) < 43) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12099;
new FamiliarNpc(6879,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6879);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12097:
			if (p.getSkills().getLevelForXp(23) < 43) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12097;
new FamiliarNpc(6877,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6877);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12095:
			if (p.getSkills().getLevelForXp(23) < 43) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12095;
new FamiliarNpc(6875,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6875);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12093:
			if (p.getSkills().getLevelForXp(23) < 96) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12093;
p.FamiliarInvSize = 30;
new FamiliarNpc(6873,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6873);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12101:
			if (p.getSkills().getLevelForXp(23) < 43) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12101;
new FamiliarNpc(6881,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 6881);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12790:
			if (p.getSkills().getLevelForXp(23) < 99) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12790;
new FamiliarNpc(7343,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 7343);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12786:
			if (p.getSkills().getLevelForXp(23) < 89) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12786;
new FamiliarNpc(7339,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 7339);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12784:
			if (p.getSkills().getLevelForXp(23) < 57) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12784;
new FamiliarNpc(7337,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 7337);
p.getInventory().deleteItem(ItemId,1);
		break;
		case 12788:
			if (p.getSkills().getLevelForXp(23) < 83) {
				p.sm("You dont have the summoning level required to summon this familiar.");
				return;
			}
p.Summoning = true;
p.SummoningItemId = 12788;
new FamiliarNpc(7341,p);
p.getActionSender().sendTab(92, 662);
SummonConfigs(p, 7341);
p.getInventory().deleteItem(ItemId,1);
		break;
		default:
			p.FamiliarInvSize = 0;
		break;			
	}
	//p.SummoningItemId = ItemId;
} catch(Exception e) {
}
}
	public void SummonSpecial(Player p, int ChillId) {
		p.FamiliarSpec = ChillId;
		}
	public void SummonConfigs(Player p, int ItemId) {
	switch(ItemId) {
		case  6815:
			// chill 20-39 spec bar
p.getActionSender().sendInterfaceConfig(662, 135, true);
p.getActionSender().sendInterfaceConfig(662, 66, true);
p.getActionSender().sendInterfaceConfig(662, 44, false); //disable cat
p.getActionSender().sendInterfaceConfig(662, 45, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 46, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 47, false); //disable something near summon
p.getActionSender().sendInterfaceConfig(662, 60, true); //able number of scrolls
p.getActionSender().sendInterfaceConfig(662, 122, true); //tortoise spec
		break;
		case  6813:
			// chill 20-39 spec bar
p.getActionSender().sendInterfaceConfig(662, 135, true);
p.getActionSender().sendInterfaceConfig(662, 66, true);
p.getActionSender().sendInterfaceConfig(662, 44, false); //disable cat
p.getActionSender().sendInterfaceConfig(662, 45, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 46, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 47, false); //disable something near summon
p.getActionSender().sendInterfaceConfig(662, 60, true); //able number of scrolls
p.getActionSender().sendInterfaceConfig(662, 122, true); //tortoise spec
		break;
		case  6794:
			// chill 20-39 spec bar
p.getActionSender().sendInterfaceConfig(662, 135, true);
p.getActionSender().sendInterfaceConfig(662, 66, true);
p.getActionSender().sendInterfaceConfig(662, 44, false); //disable cat
p.getActionSender().sendInterfaceConfig(662, 45, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 46, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 47, false); //disable something near summon
p.getActionSender().sendInterfaceConfig(662, 60, true); //able number of scrolls
p.getActionSender().sendInterfaceConfig(662, 122, true); //tortoise spec
		break;
		case  6829:
			// chill 20-39 spec bar
p.getActionSender().sendInterfaceConfig(662, 135, true);
p.getActionSender().sendInterfaceConfig(662, 66, true);
p.getActionSender().sendInterfaceConfig(662, 44, false); //disable cat
p.getActionSender().sendInterfaceConfig(662, 45, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 46, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 47, false); //disable something near summon
p.getActionSender().sendInterfaceConfig(662, 60, true); //able number of scrolls
p.getActionSender().sendInterfaceConfig(662, 122, true); //tortoise spec
		break;


		default:
p.getActionSender().sendInterfaceConfig(662, 135, true);
p.getActionSender().sendInterfaceConfig(662, 66, true);
p.getActionSender().sendInterfaceConfig(662, 44, false); //disable cat
p.getActionSender().sendInterfaceConfig(662, 45, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 46, false); //disable cat inform perccent thing
p.getActionSender().sendInterfaceConfig(662, 47, false); //disable something near summon
p.getActionSender().sendInterfaceConfig(662, 60, true); //able number of scrolls
p.getActionSender().sendInterfaceConfig(662, 122, true); //tortoise spec
		break;	
}
}

}