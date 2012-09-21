package com.rs2hd.model;

import com.rs2hd.GameEngine;
import com.rs2hd.util.Misc;

/*
 * Author dragonkk for this junk
 */
public class NpcWalk {
	public class Point {
		public int x;
		public int y;
		public int dir;
	}
	
	private static final int SIZE = 50;
	
	public int wQueueReadPtr = 0;
	public int wQueueWritePtr = 0;
	public Point[] walkingQueue = new Point[SIZE];
	
	transient int moveX = -1, moveY = -1;
	public transient int direction = -1;
	private transient NPC npc;
	private transient NPC n;
    public NpcWalk(NPC npc) {
		this.npc = npc;
		this.n = npc;
		for(int i = 0; i < SIZE; i++) {
			walkingQueue[i] = new Point();
			walkingQueue[i].x   = 0;
			walkingQueue[i].y   = 0;
			walkingQueue[i].dir = -1;
		}
		resetWalking();
	}
    /**
     * Resets walking.
     */
    public void resetWalking() {
	moveX = -1;
	moveY = -1;
	direction = -1;
		/*walkingQueue[0].x   = n.getLocation().getLocalX();
		walkingQueue[0].y   = n.getLocation().getLocalY();
		walkingQueue[0].dir = -1;
		wQueueReadPtr = wQueueWritePtr = 1;*/
    }

	public void addToWalkingQueue(int x, int y) {
		try {
		int diffX = x - walkingQueue[wQueueWritePtr - 1].x, diffY = y - walkingQueue[wQueueWritePtr - 1].y;
		int max = Math.max(Math.abs(diffX), Math.abs(diffY));
		for (int i = 0; i < max; i++) {
			if (diffX < 0)
				diffX++;
			else if (diffX > 0)
				diffX--;
			if (diffY < 0)
				diffY++;
			else if (diffY > 0)
				diffY--;
addStepToWalkingQueue(x - diffX, y - diffY);
		}
		} catch(Exception e) {
		}
	}
	public void addStepToWalkingQueue(int x, int y) {
		try {
		int diffX = x - walkingQueue[wQueueWritePtr - 1].x, diffY = y - walkingQueue[wQueueWritePtr - 1].y;
        int dir = Misc.direction(n.getLocation().getX(), n.getLocation().getY(), (n.getLocation().getX() + diffX), (n.getLocation().getY() + diffY));
		//int dir = Misc.direction(diffX, diffY);
		if (wQueueWritePtr >= SIZE) {
			return;
		}
		if (dir != -1) {
			//dir >>= 1;
			walkingQueue[wQueueWritePtr].x = x;
			walkingQueue[wQueueWritePtr].y = y;
			walkingQueue[wQueueWritePtr++].dir = dir;
		}
		} catch(Exception e) {
		}
	}
	private int getNextWalkingDirection() {
		if (wQueueReadPtr == wQueueWritePtr) {
			return -1;
		}
		int dir = walkingQueue[wQueueReadPtr++].dir;
		dir >>= 1;
		int xdiff = Misc.nDIRECTION_DELTA_X[dir];
		int ydiff = Misc.nDIRECTION_DELTA_Y[dir];
Location newLocation = Location.location(npc.getLocation().getX()+xdiff, npc.getLocation().getY()+ydiff, npc.getLocation().getZ());
		npc.setLocation(newLocation);
		return dir;
	}
    /**
     * Get the walking direction.
     */
    private int direction(int srcX, int srcY, int destX, int destY) {
        int dx = destX - srcX, dy = destY - srcY;
        if (dx < 0) {
            if (dy < 0) {
                if (dx < dy)
                    return 11;
                else if (dx > dy)
                    return 9;
                else
                    return 10;
            } else if(dy > 0) {
                if (-dx < dy)
                    return 15;
                else if (-dx > dy)
                    return 13;
                else
                    return 14;
            }
            else
                return 12;
        } else if (dx > 0) {
            if (dy < 0) {
                if (dx < -dy)
                    return 7;
                else if (dx > -dy)
                    return 5;
                else
                    return 6;
            } else if (dy > 0) {
                if (dx < dy)
                    return 1;
                else if (dx > dy)
                    return 3;
                else
                    return 2;
            } else
                return 4;
        } else {
            if (dy < 0)
                return 8;
            else if (dy > 0)
                return 0;
            else
                return -1;
        }
    }

	public int getMove(int Place1, int Place2) {
        if ((Place1 - Place2) == 0)
            return 0;
        else if ((Place1 - Place2) < 0)
            return 1;
        else if ((Place1 - Place2) > 0)
            return -1;
        return 0;
    }
	private int NpcSize() {
		switch (n.getId()) {
		case 6815:
		case 6816:
		return 1;
		default:
		return 0;
		}
		}
	
    /**
     * Stops npc from noclipping through players && Npcs.
     */
    void PlayerNpcPos() {
    	if (!CanGoHere(moveX,moveY)) {
    moveX = 0;
    moveY = 0;
	}
    }
    boolean CanGoHere(int moveX, int moveY) {
    	for (int i = 0; i < 300; i++) {
    		if (World.getInstance().getPlayerList().get(i) != null) {
    			Player pl = World.getInstance().getPlayerList().get(i);
    			if (n.getLocation().getX() + moveX == pl.getLocation().getX() && n.getLocation().getY() + moveY == pl.getLocation().getY() || Misc.getDistance(n.getLocation().getX() + moveX, n.getLocation().getY() + moveY, pl.getLocation().getX(), pl.getLocation().getY()) == NpcSize()) {
return false;
    			}
    		}
    	}
    	for (int i = 0; i < 300; i++) {
    		if (World.getInstance().getPlayerList().get(i) != null) {
    			NPC pl = World.getInstance().getNpcList().get(i);
    			if (n.getLocation().getX() + moveX == pl.getLocation().getX() && n.getLocation().getY() + moveY == pl.getLocation().getY() || Misc.getDistance(n.getLocation().getX() + moveX, n.getLocation().getY() + moveY, pl.getLocation().getX(), pl.getLocation().getY()) == NpcSize()) {
return false;
    			}
    		}
    	}
 return true;
        }
    /**
     * Stops npcs from noclipping on each other.
     */
	private void npcPos() {
			for (int i = 0; i < 200; i++) { //World.getInstance().getNpcList().size()
				if (World.getInstance().getNpcList().get(i) == null)
					continue;
				NPC npcs = World.getInstance().getNpcList().get(i);
				int absY = npcs.getLocation().getY();
				int absX = npcs.getLocation().getY();
		            	int npcSize = 0;
		            	if(NpcSize() > 1)
		                	if(n.getLocation().getX() < absX && n.getLocation().getY() > absY) {
		                    		if(n.getLocation().getY() - absY > 1 && NpcSize() >= 3)
		                        		npcSize += NpcSize();
		                    		else
		                        		npcSize += NpcSize() / 2;
		                	} else
		                	if(n.getLocation().getX() > absX && n.getLocation().getY() > absY) {
		                    		if(n.getLocation().getY() - absY > 1 && NpcSize() >= 3)
		                       			npcSize += NpcSize() / 2 + 1;
		                    		else
		                        		npcSize += NpcSize() / 2;
		                	} else
		                	if(n.getLocation().getX() > absX && n.getLocation().getY() <= absY)
		                    		if(n.getLocation().getX() - absX > 1 && NpcSize() >= 3)
		                        		npcSize += NpcSize() / 2 + 1;
		                    		else
		                        		npcSize += NpcSize() / 2;
				if (n.getLocation().getX() + moveX == absX && n.getLocation().getY() + moveY == absY || Misc.getDistance(n.getLocation().getX() + moveX, n.getLocation().getY() + moveY, absX, absY) == npcSize && (NpcSize() != -1)) {
					moveX = 0;
					moveY = 0;
				}
			}
	}
			public void followPlayer(Player p, int Size) {
				/*if (npc.isIsFamiliar()) {
				if(npc.getLocation().getDistance(p.getLocation()) == 1) {
					npc.setFollowDelayed(false);
					return;
				}
				if(!npc.isFollowDelayed()) {
				npc.setFollowDelayed(true);
				return;
				}
				}*/
				resetWalking();
		    	int pX = p.getLocation().getX();
		    	int pY = p.getLocation().getY();
		    	int nabsX = npc.getLocation().getX();
		    	int nabsY = npc.getLocation().getY();
		    	
		    	if(pY < nabsY && pX == nabsX) {
		    		moveX = 0;
		    		moveY = getMove(nabsY, pY + 1);
			}
			else if(pY > nabsY && pX == nabsX) {
		   		moveX = 0;
		    		moveY = getMove(nabsY, pY - 1);
			}
			else if(pX < nabsX && pY == nabsY ) {
		    		moveX = getMove(nabsX, pX + 1);
		    		moveY = 0;
			}
			else if(pX > nabsX && pY == nabsY) {
		    		moveX = getMove(nabsX, pX - 1);
		    		moveY = 0;
			}
				else if(pX < nabsX && pY < nabsY) {
		    		moveX = getMove(nabsX, pX + 1);
		    		moveY = getMove(nabsY, pY + 1);
			}
			else if(pX > nabsX && pY > nabsY) {
		    		moveX = getMove(nabsX, pX - 1);
		    		moveY = getMove(nabsY, pY - 1);
			}
			else if(pX < nabsX && pY > nabsY) {
		    		moveX = getMove(nabsX, pX + 1);
		    		moveY = getMove(nabsY, pY - 1);
			}
			else if(pX > nabsX && pY < nabsY ) {
		   		moveX = getMove(nabsX, pX - 1);
		   		moveY = getMove(nabsY, pY + 1);
			}
		    	getNextNPCMovementnocliped(p);
		    }
			public void getNextNpcMovement() {
				try {
				npc.getSprites().setSprites(-1, -1);
		    			int nabsX = npc.getLocation().getX();
		    			int nabsY = npc.getLocation().getY();
					int walkDir = getNextWalkingDirection();
					int runDir  = -1;

					npc.getSprites().setSprites(walkDir, runDir);
					if (walkDir != -1 || runDir != -1)
						npc.getUpdateFlags().setWalked(true);
				} catch(Exception e) {
				}
			}
			public void ObjectPos(Player p) {
				int dir = direction(n.getLocation().getX(), n.getLocation().getY(), (n.getLocation().getX() + moveX), (n.getLocation().getY() + moveY));
				//System.out.println("npc["+npc.getIndex()+"]["+npc.getId()+"] dir: "+dir);
		        if (!GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir)) {
		        	if (dir == 0 || dir == 8) { //north south
		        		if (GameEngine.clipInfo.checkPos((1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir) && GameEngine.clipInfo.checkPos((-1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir) 
		        				&& (Misc.getDistance((1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), p.getLocation().getX(), p.getLocation().getY()) < Misc.getDistance((-1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), p.getLocation().getX(), p.getLocation().getY()))) {
		        			moveX++;
		 		            return;
		        		} else 	if (GameEngine.clipInfo.checkPos((1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir) && GameEngine.clipInfo.checkPos((-1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir) 
			        				&& (Misc.getDistance((-1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), p.getLocation().getX(), p.getLocation().getY()) < Misc.getDistance((+1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), p.getLocation().getX(), p.getLocation().getY()))) {
			        	moveX--;
			 		    return;
		        		} else if (GameEngine.clipInfo.checkPos((1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir)) {
		        			moveX++;
		 		            return;
		        		 }else if (GameEngine.clipInfo.checkPos((-1 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir)) {
		        			 moveX--;
		        			 return;
			        	} else 	if (GameEngine.clipInfo.checkPos((1 + n.getLocation().getX()), (n.getLocation().getY()), n.getLocation().getZ(), dir) && GameEngine.clipInfo.checkPos((-1 + n.getLocation().getX()), (n.getLocation().getY()), n.getLocation().getZ(), dir) 
			        				&& (Misc.getDistance((1 + n.getLocation().getX()), (n.getLocation().getY()), p.getLocation().getX(), p.getLocation().getY()) < Misc.getDistance((-1 + n.getLocation().getX()), (n.getLocation().getY()), p.getLocation().getX(), p.getLocation().getY()))) {
			        	moveX++;
			        	moveY = 0;
			 		    return;
			        	} else 	if (GameEngine.clipInfo.checkPos((1 + n.getLocation().getX()), (n.getLocation().getY()), n.getLocation().getZ(), dir) && GameEngine.clipInfo.checkPos((-1 + n.getLocation().getX()), (n.getLocation().getY()), n.getLocation().getZ(), dir) 
		        				&& (Misc.getDistance((-1 + n.getLocation().getX()), (n.getLocation().getY()), p.getLocation().getX(), p.getLocation().getY()) < Misc.getDistance((1 + n.getLocation().getX()), (n.getLocation().getY()), p.getLocation().getX(), p.getLocation().getY()))) {
			        moveX--;
		        	moveY = 0;
		 		    return;
		        		 }else if (GameEngine.clipInfo.checkPos((1 + n.getLocation().getX()), (n.getLocation().getY()), n.getLocation().getZ(), dir)) {
		        			 moveX++;
		        			 moveY = 0;
		        			 return;
		        		 }else if (GameEngine.clipInfo.checkPos((-1 + n.getLocation().getX()), (n.getLocation().getY()), n.getLocation().getZ(), dir)) {
		        			 moveX--;
		        			 moveY = 0;
		        			 return;
		        		 }
		        	}else if (dir == 4 || dir == 12) { //east/west
		        		if (GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() + 1), n.getLocation().getZ(), dir) && GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() - 1), n.getLocation().getZ(), dir) 
		        				&& (Misc.getDistance((moveX + n.getLocation().getX()), (n.getLocation().getY() + 1), p.getLocation().getX(), p.getLocation().getY()) < Misc.getDistance((moveX + n.getLocation().getX()), (n.getLocation().getY() -1), p.getLocation().getX(), p.getLocation().getY()))) {
		        			moveY++;
		 		            return;
		        		} else 	if (GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() + 1), n.getLocation().getZ(), dir) && GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() - 1), n.getLocation().getZ(), dir)
			        				&& (Misc.getDistance((moveX + n.getLocation().getX()), (n.getLocation().getY() + 1), p.getLocation().getX(), p.getLocation().getY()) < Misc.getDistance((moveX + n.getLocation().getX()), (n.getLocation().getY() -1), p.getLocation().getX(), p.getLocation().getY()))) {
			        	moveY--;
			 		    return;
		        		}else if (GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() + 1), n.getLocation().getZ(), dir)) {
			        			moveY++;
			 		            return;
			        		 }else if (GameEngine.clipInfo.checkPos((moveX + n.getLocation().getX()), (n.getLocation().getY() - 1), n.getLocation().getZ(), dir)) {
			        			 moveY--;
			        			 return;
			        		 }
		        	}else if (dir == 2 || dir == 6 || dir == 10 || dir == 14) { //northwest northeast southeast  southwest
		        		 if (GameEngine.clipInfo.checkPos((0 + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir)) {
			        			moveX = 0;
			 		            return;
			        		 }else if (GameEngine.clipInfo.checkPos(((-(moveX)) + n.getLocation().getX()), (n.getLocation().getY() + moveY), n.getLocation().getZ(), dir)) {
			        			 moveX = (-(moveX));
			        			 return;
			        		 }	
		        	}
		            moveX = 0;
		            moveY = 0;
		        }
			}
		    /**
		     * Adds the new positioning onto the NPC.
		     * @param n The npc to get the data from.
		     */
		    public void getNextNPCMovementnocliped(Player p) {
		        if (n == null) {
		            return;
		        }
			//npcPos();
			PlayerNpcPos();
	        ObjectPos(p);
	        //System.out.println("moveX: "+moveX+" ,MoveY: "+moveY);
		        if (moveX == 0 && moveY == 0) {
		            return;
		        }
		        int dir = direction(n.getLocation().getX(), n.getLocation().getY(), (n.getLocation().getX() + moveX), (n.getLocation().getY() + moveY));
		        if (dir == -1) {
		            return;
		        }
		        dir >>= 1;
			//npc.getSprites().setSprites(dir, -1);
		        direction = dir;
		        n.setLocation(Location.location(n.getLocation().getX()+moveX, n.getLocation().getY()+moveY, n.getLocation().getZ()));
		        npc.getUpdateFlags().setWalked(true);
		    }
	}
