# Copyright (c) 2009 Graham Edgecombe <grahamedgecombe@gmail.com>
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

from com.rs2hd.model import Skills
from com.rs2hd.event import Event
from com.rs2hd.model import World

# event that runs after 2000ms then stops itself
# resets the busy flag
class BuryEvent(Event):
	# start the event for the specified player and do the animation
	def __init__(self, player):
		Event.__init__(self, 2000)
		self.player = player
		player.setBusy(True)
		player.animate(827)
	# reset the busy flag so other actions can happen
	def execute(self):
		# send a message saying it is buried
		self.player.getActionSender().sendMessage("You bury the bones.")
		self.player.setBusy(False)
		Event.stop(self)

# makes the player bury the specified item (and get given the specified prayer
# xp)
def bury(player, id, slot, xp):
	# check if the player is busy, if so do not complete the action
	if player.isBusy():
		return
	# if the inventory contains the bones
	item = player.getInventory().getContainer().get(slot)
	if item.getId() == id and item.getAmount() == 1:
		# delete the bones
		player.getInventory().getContainer().set(slot, None)
		player.getInventory().refresh()
		# give the XP
		player.getSkills().addXp(Skills.PRAYER, xp)
		# send a message saying it is burying
		player.getActionSender().sendMessage("You start to dig a hole in the ground...")
		# register the bury event
		World.getInstance().registerEvent(BuryEvent(player))

# normal bones: 
def item_select_526(player, slot):
	bury(player, 526, slot, 1500)

# wolf bones:
def item_select_2859(player, slot):
	bury(player, 2859, slot, 1500)

# burnt bones:
def item_select_528(player, slot):
	bury(player, 528, slot, 1500)

# monkey bones:
def item_select_3179(player, slot):
	bury(player, 3179, slot, 1500)

# bat bones:
def item_select_530(player, slot):
	bury(player, 530, slot, 2200)

# big bones:
def item_select_532(player, slot):
	bury(player, 532, slot, 2900)

# jogre bones:
def item_select_3125(player, slot):
	bury(player, 3125, slot, 2900)

# curved bones:
def item_select_10977(player, slot):
	bury(player, 10977, slot, 2900)

# long bones:
def item_select_10976(player, slot):
	bury(player, 10976, slot, 2900)

# zogre bones:
def item_select_4812(player, slot):
	bury(player, 4812, slot, 3250)

# shaikahan bones:
def item_select_3123(player, slot):
	bury(player, 3123, slot, 2900)

# babydragon bones:
def item_select_534(player, slot):
	bury(player, 534, slot, 2900)

# wyvern bones:
def item_select_6812(player, slot):
	bury(player, 6812, slot, 3000)

# dragon bones:
def item_select_536(player, slot):
	bury(player, 536, slot, 3250)

# fayrg bones:
def item_select_4830(player, slot):
	bury(player, 4830, slot, 3500)

# raurg bones:
def item_select_4832(player, slot):
	bury(player, 4832, slot, 3600)

# dagannoth bones:
def item_select_6729(player, slot):
	bury(player, 6729, slot, 3675)

# ourg bones:
def item_select_4834(player, slot):
	bury(player, 4834, slot, 3800)

