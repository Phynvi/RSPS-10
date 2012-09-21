package com.rs2hd.model;

/**
 * Container class.
 * @author Graham
 *
 * @param <T>
 */
public class Container<T extends Item> {
	
	private Item[] data;
	public boolean alwaysStackable = false;
	
	public Container() {}
	
	public Container(int size, boolean alwaysStackable) {
		data = new Item[size];
		this.alwaysStackable = alwaysStackable;
	}
	
	public void shift() {
		Item[] oldData = data;
		data = new Item[oldData.length];
		int ptr = 0;
		for(int i = 0; i < data.length; i++) {
			if(oldData[i] != null) {
				data[ptr++] = oldData[i];
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(int slot) {
		if(slot < 0 || slot >= data.length) {
			return null;
		}
		return (T) data[slot];
	}
	
	public void set(int slot, T item) {
		try {
		if(slot < 0 || slot >= data.length) {
			return;
		}
		data[slot] = item;
		} catch(Exception e) {
		}
	}
	
	public boolean forceAdd(T item) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				data[i] = item;
				return true;
			}
		}
		return false;
	}
	
	public boolean add(T item) {
		if(alwaysStackable || item.getDefinition().isStackable() || item.getDefinition().isNoted()) {
			for(int i = 0; i < data.length; i++) {
				if(data[i] != null) {
					if(data[i].getId() == item.getId()) {
						data[i] = new Item(data[i].getDefinition().getId(), data[i].getAmount() + item.getAmount());
						return true;
					}
				}
			}
		} else {
			if(item.getAmount() > 1) {
				if(freeSlots() >= item.getAmount()) {
					for(int i = 0; i < item.getAmount(); i++) {
						int index = freeSlot();
						data[index] = new Item(item.getId(), 1);
					}
					return true;
				} else {
					return false;
				}
			}
		}
		int index = freeSlot();
		if(index == -1) {
			return false;
		}
		data[index] = item;
		return true;
	}
	
	public int freeSlots() {
		try {
		int j = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				j++;
			}
		}
		return j;
		} catch(Exception e) {
		return 0;
		}
	}
	
	public void remove(T item) {
		try {
		int removed = 0, toRemove = item.getAmount();
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item.getId()) {
					int amt = data[i].getAmount();
					if(amt > toRemove) {
						removed += toRemove;
						amt -= toRemove;
						toRemove = 0;
						data[i] = new Item(data[i].getDefinition().getId(), amt);
						return;
					} else {
						removed += amt;
						toRemove -= amt;
						data[i] = null;
					}
				}
			}
		}
		} catch(Exception e) {
		}
	}
	
	public void removeAll(T item) {
		try {
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item.getId()) {
					data[i] = null;
				}
			}
		}
		} catch(Exception e) {
		}
	}
	
	public boolean containsOne(T item) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item.getId()) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean contains(T item) {
		int amtOf = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item.getId()) {
					amtOf += data[i].getAmount();
				}
			}
		}
		return amtOf >= item.getAmount();
	}
	
	public int freeSlot() {
		try {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				return i;
			}
		}
		return -1;
		} catch(Exception e) {
		return -1;
		}
	}

	public void clear() {
		try {
		for(int i = 0; i < data.length; i++) {
			data[i] = null;
		}
		} catch(Exception e) {
		}
	}

	public int getSize() {
		try {
		return data.length;
		} catch(Exception e) {
		return -1;
		}
	}

	public int getFreeSlots() {
		try {
		int s = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				s++;
			}
		}
		return s;
		} catch(Exception e) {
		return 0;
		}
	}

	public int getNumberOf(Item item) {
		try {
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item.getId()) {
					count += data[i].getAmount();
				}
			}
		}
		return count;
		} catch(Exception e) {
		return 0;
		}
	}
	public int getNumberOff(int item) {
		try {
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item) {
					count += data[i].getAmount();
				}
			}
		}
		return count;
		} catch(Exception e) {
		return 0;
		}
	}
	public Item[] getItems() {
		return data;
	}

	public Container<Item> asItemContainer() {
		Container<Item> c = new Container<Item>(data.length, this.alwaysStackable);
		for(int i = 0; i < data.length; i++) {
			c.data[i] = data[i];
		}
		return c;
	}

	public int getFreeSlot() {
		try {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				return i;
			}
		}
		return 0;
		} catch(Exception e) {
		return 0;
		}
	}

	public Item lookup(int id) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				continue;
			}
			if(data[i].getId() == id) {
				return data[i];
			}
		}
		return null;
	}
	
	public int lookupSlot(int id) {
		try {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == null) {
				continue;
			}
			if(data[i].getId() == id) {
				return i;
			}
		}
		return -1;
		} catch(Exception e) {
		return -1;
		}
	}

	public void reset() {
		try {
		data = new Item[data.length];
		} catch(Exception e) {
		}
	}

	public void remove(int preferredSlot, Item item) {
		try {
		int removed = 0, toRemove = item.getAmount();
		if(data[preferredSlot] != null) {
			if(data[preferredSlot].getId() == item.getId()) {
				int amt = data[preferredSlot].getAmount();
				if(amt > toRemove) {
					removed += toRemove;
					amt -= toRemove;
					toRemove = 0;
					data[preferredSlot] = new Item(data[preferredSlot].getDefinition().getId(), amt);
					return;
				} else {
					removed += amt;
					toRemove -= amt;
					data[preferredSlot] = null;
				}
			}
		}
		for(int i = 0; i < data.length; i++) {
			if(data[i] != null) {
				if(data[i].getId() == item.getId()) {
					int amt = data[i].getAmount();
					if(amt > toRemove) {
						removed += toRemove;
						amt -= toRemove;
						toRemove = 0;
						data[i] = new Item(data[i].getDefinition().getId(), amt);
						return;
					} else {
						removed += amt;
						toRemove -= amt;
						data[i] = null;
					}
				}
			}
		}
		} catch(Exception e) {
		}
	}

	public void addAll(Container<T> container) {
		try {
		for(int i = 0; i < container.getSize(); i++) {
			T item = container.get(i);
			if(item != null) {
				this.add(item);
			}
		}
		} catch(Exception e) {
		}
	}

	public boolean hasSpaceFor(Container<T> container) {
		for(int i = 0; i < container.getSize(); i++) {
			T item = container.get(i);
			if(item != null) {
				if(!this.hasSpaceForItem(item)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean hasSpaceForItem(T item) {
		if(alwaysStackable || item.getDefinition().isStackable() || item.getDefinition().isNoted()) {
			for(int i = 0; i < data.length; i++) {
				if(data[i] != null) {
					if(data[i].getId() == item.getId()) {
						return true;
					}
				}
			}
		} else {
			if(item.getAmount() > 1) {
				if(freeSlots() >= item.getAmount()) {
					return true;
				} else {
					return false;
				}
			}
		}
		int index = freeSlot();
		if(index == -1) {
			return false;
		}
		return true;
	}

}
