from com.rs2hd.event import Event
from com.rs2hd.model import World
from com.rs2hd.model import Location

class TeleportEvent(Event):
	def __init__(self, player, x, y, z):
		Event.__init__(self, 1255)
		self.player = player
		player.setBusy(True)
		player.getWalkingQueue().reset();
		player.animate(75133)
		player.graphics(1680)
		self.location = Location.location(x, y, z)
	def execute(self):
		self.player.teleport(self.location)
		self.player.animate(75134)
		World.getInstance().registerEvent(ResetAnimationEvent(self.player))
		Event.stop(self)

class ResetAnimationEvent(Event):
	def __init__(self, player):
		Event.__init__(self, 1500)
		self.player = player
	def execute(self):
		self.player.animate(-1)
		self.player.setBusy(False)
		Event.stop(self)

def teletab(player, id, slot, x, y, z):
	if player.isBusy():
		return
	if player.isDead():
		return
	
	if player.isTeleBlocked:
		player.getActionSender().sendMessage("You are teleblocked.")
		return
	item = player.getInventory().getContainer().get(slot)
	if item.getId() == id and item.getAmount() >= 1:
		player.getInventory().deleteItem(id, 1);
		player.getInventory().refresh()
		player.getActionSender().sendMessage("You are not going anywhere.")
		
# Varrock
def item_select_8007(player, slot):
	teletab(player, 8007, slot, 3210, 3424, 0)

# Lumbridge
def item_select_8008(player, slot):
	teletab(player, 8008, slot, 3222, 3218, 0)

# Falador
def item_select_8009(player, slot):
	teletab(player, 8009, slot, 2964, 3378, 0)

# Camelot
def item_select_8010(player, slot):
	teletab(player, 8010, slot, 2757, 3477, 0)

# Ardougne
def item_select_8011(player, slot):
	teletab(player, 8011, slot, 2661, 3305, 0)

# Watchtower
def item_select_8012(player, slot):
	teletab(player, 8012, slot, 2548, 3114, 0)
