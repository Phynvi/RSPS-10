# Copyright (c) 2009 Graham Edgecombe <grahamedgecombe@gmail.com>
# Portions based on Vastico's script also released under MIT.
# Copyright (c) 2009 Vastico.
# 
# Permission is hereby granted, free of charge, to any person
# obtaining a copy of this software and associated documentation
# files (the "Software"), to deal in the Software without
# restriction, including without limitation the rights to use,
# copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the
# Software is furnished to do so, subject to the following
# conditions:
# 
# The above copyright notice and this permission notice shall be
# included in all copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
# EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
# OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
# NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
# HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
# WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
# FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
# OTHER DEALINGS IN THE SOFTWARE.

from com.rs2hd.event import Event
from com.rs2hd.model import Skills
from com.rs2hd.model import World
from com.rs2hd.model import Item

class PotionEvent(Event):
	def __init__(self, player, stat, amount):
		Event.__init__(self, 1500)
		self.player = player
		self.stat = stat
		self.amount = amount
		player.animate(829)
	def execute(self):
		self.player.getSkills().set(self.stat, int(int(self.player.getSkills().getLevelForXp(self.stat)) + int(self.amount)))
		Event.stop(self)

def drink(player, id, slot, replace, stat, amount):
	if player.isBusy():
		return
	item = player.getInventory().getContainer().get(slot)
	if item.getId() == id and item.getAmount() == 1:
		player.getInventory().getContainer().set(slot, None)
		player.getActionSender().sendMessage("You drink the " + item.getDefinition().getName() + ".")
		if replace != -1:
			player.getInventory().getContainer().set(slot, Item(replace, 1))
		player.getInventory().refresh()
		World.getInstance().registerEvent(PotionEvent(player, stat, amount))


		
# Custom extreme attack (2)
def item_select_11429(player, slot):
	drink(player, 11429, slot, 11431, Skills.ATTACK, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.25)))

# Custom extreme attack (1)
def item_select_11431(player, slot):
	drink(player, 11431, slot, 229, Skills.ATTACK, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.25)))	


# Custom extreme str (2)
def item_select_11443(player, slot):
	drink(player, 11443, slot, 11441, Skills.STRENGTH, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.25)))

# Custom extreme str (1)
def item_select_11441(player, slot):
	drink(player, 11441, slot, 229, Skills.STRENGTH, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.25)))


# Custom extreme def (2)
def item_select_11457(player, slot):
	drink(player, 11457, slot, 11459, Skills.DEFENCE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.25)))

# Custom extreme def (1)
def item_select_11459(player, slot):
	drink(player, 11459, slot, 229, Skills.DEFENCE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.25)))


# Custom extreme ranging (2)
def item_select_11509(player, slot):
	drink(player, 11509, slot, 11511, Skills.RANGE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.25)))	

# Custom extreme ranging (1)
def item_select_11511(player, slot):
	drink(player, 11511, slot, 229, Skills.RANGE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.25)))	


	
# Super Attack (4)
def item_select_2436(player, slot):
	drink(player, 2436, slot, 145, Skills.ATTACK, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.15)))

# Super Attack (3)
def item_select_145(player, slot):
	drink(player, 145, slot, 147, Skills.ATTACK, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.15)))

# Super Attack (2)
def item_select_147(player, slot):
	drink(player, 147, slot, 149, Skills.ATTACK, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.15)))

# Super Attack (1)
def item_select_149(player, slot):
	drink(player, 149, slot, 229, Skills.ATTACK, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.15)))

# Attack potion (4)
def item_select_2428(player, slot):
	drink(player, 2428, slot, 121, Skills.ATTACK, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.10)))

# Attack potion (3)
def item_select_121(player, slot):
	drink(player, 121, slot, 123, Skills.ATTACK, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.10)))

# Attack potion(2)
def item_select_123(player, slot):
	drink(player, 123, slot, 125, Skills.ATTACK, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.10)))

# Attack potion (1)
def item_select_125(player, slot):
	drink(player, 125, slot, 229, Skills.ATTACK, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.ATTACK)) * 0.10)))

# Super Strength (4)
def item_select_2440(player, slot):
	drink(player, 2440, slot, 157, Skills.STRENGTH, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.15)))

# Super Strength (3)
def item_select_157(player, slot):
	drink(player, 157, slot, 159, Skills.STRENGTH, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.15)))

# Super Strength (2)
def item_select_159(player, slot):
	drink(player, 159, slot, 161, Skills.STRENGTH, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.15)))

# Super Strength (1)
def item_select_161(player, slot):
	drink(player, 161, slot, 229, Skills.STRENGTH, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.15)))

# Strength potion (4)
def item_select_113(player, slot):
	drink(player, 113, slot, 115, Skills.STRENGTH, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.10)))

# Strength potion (3)
def item_select_115(player, slot):
	drink(player, 115, slot, 117, Skills.STRENGTH, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.10)))

# Strength potion(2)
def item_select_117(player, slot):
	drink(player, 117, slot, 119, Skills.STRENGTH, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.10)))

# Strength potion (1)
def item_select_119(player, slot):
	drink(player, 119, slot, 229, Skills.STRENGTH, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.STRENGTH)) * 0.10)))

# Super Defence (4)
def item_select_2442(player, slot):
	drink(player, 2442, slot, 163, Skills.DEFENCE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.15)))

# Super Defence (3)
def item_select_163(player, slot):
	drink(player, 163, slot, 165, Skills.DEFENCE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.15)))

# Super Defence (2)
def item_select_165(player, slot):
	drink(player, 165, slot, 167, Skills.DEFENCE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.15)))

# Super Defence (1)
def item_select_167(player, slot):
	drink(player, 167, slot, 229, Skills.DEFENCE, int(round(5.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.15)))

# Defence potion (4)
def item_select_2432(player, slot):
	drink(player, 2428, slot, 133, Skills.DEFENCE, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.10)))

# Defence potion (3)
def item_select_133(player, slot):
	drink(player, 133, slot, 135, Skills.DEFENCE, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.10)))

# Defence potion(2)
def item_select_135(player, slot):
	drink(player, 135, slot, 137, Skills.DEFENCE, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.10)))

# Defence potion (1)
def item_select_137(player, slot):
	drink(player, 137, slot, 229, Skills.DEFENCE, int(round(3.0 + float(player.getSkills().getLevelForXp(Skills.DEFENCE)) * 0.10)))

# Ranging Potion (4)
def item_select_2444(player, slot):
	drink(player, 2444, slot, 169, Skills.RANGE, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.1)))

# Ranging Potion (3)
def item_select_169(player, slot):
	drink(player, 169, slot, 171, Skills.RANGE, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.1)))

# Ranging Potion (2)
def item_select_171(player, slot):
	drink(player, 171, slot, 173, Skills.RANGE, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.1)))

# Ranging Potion (1)
def item_select_173(player, slot):
	drink(player, 173, slot, 229, Skills.RANGE, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.1)))

# Magic potion (4)
def item_select_3040(player, slot):
	drink(player, 3040, slot, 3042, Skills.MAGIC, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.0)))

# Magic potion (3)
def item_select_3042(player, slot):
	drink(player, 3042, slot, 3044, Skills.MAGIC, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.0)))

# Magic potion (2)
def item_select_3044(player, slot):
	drink(player, 3044, slot, 3046, Skills.MAGIC, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.0)))

# Magic potion (1)
def item_select_3046(player, slot):
			drink(player, 3046, slot, 229, Skills.MAGIC, int(round(4.0 + float(player.getSkills().getLevelForXp(Skills.RANGE)) * 0.0)))

