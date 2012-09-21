package com.rs2hd.content;

import com.rs2hd.model.Entity;
import com.rs2hd.model.Player;

public class FollowPlayer {
	
	private Entity p2;
	boolean canwalk = true;
	
	public void followPlayer(Entity entity) {
		Player p = (Player) entity;
		p2 = p.followPlayer;
		int playerX = p2.getLocation().getX();
		int playerY = p2.getLocation().getY();
		if(p.getLocation().getX() >= p2.getLocation().getX()+20 || p.getLocation().getX() <= p2.getLocation().getX()-20 || p.getLocation().getY() >= p2.getLocation().getY()+20 || p.getLocation().getY() <= p2.getLocation().getY()-20) {
			p.getWalkingQueue().reset();
			p.followPlayer = null;
			p.followingPlayer = false;
		}
		if (p2 == null) {
			p.resetFaceId();
			p.followPlayer = null;
			p.followingPlayer = false;
		}
		if (p2 != null) {
			if (playerY < p.getLocation().getY()) {
				p.moveX = GetMove(p.getLocation().getX(), playerX);
				p.moveY = GetMove(p.getLocation().getY(), playerY + 1);
				if(canwalk == true) {
				p.WalkTo().GoTo(p, p2.getLocation().getX(), p2.getLocation().getY()  + 1);
				}
			} else if (playerY > p.getLocation().getY()) {
				p.moveX = GetMove(p.getLocation().getX(), playerX);
				p.moveY = GetMove(p.getLocation().getY(), playerY - 1);
				if(canwalk == true) {
				p.WalkTo().GoTo(p, p2.getLocation().getX(), p2.getLocation().getY() - 1);
				}
			} else if (playerX < p.getLocation().getX()) {
				p.moveX = GetMove(p.getLocation().getX(), playerX + 1);
				p.moveY = GetMove(p.getLocation().getY(), playerY);
				if(canwalk == true) {
				p.WalkTo().GoTo(p, p2.getLocation().getX() + 1, p2.getLocation().getY());
				}
			} else if (playerX > p.getLocation().getX()) {
				p.moveX = GetMove(p.getLocation().getX(), playerX - 1);
				p.moveY = GetMove(p.getLocation().getY(), playerY);
				if(canwalk == true) {
				p.WalkTo().GoTo(p, p2.getLocation().getX() - 1, p2.getLocation().getY());
				}
				}
			if(canwalk == true) {
			p.turnTo(p.followPlayer);
			}
			canwalk = true;
			}
	}
	public int GetMove(int Place1, int Place2) {
		if ((Place1 - Place2) == 0)
			return 0;
		else if ((Place1 - Place2) < 0)
			return 1;
		else if ((Place1 - Place2) > 0)
			return -1;
		return 0;
	}
		
		
		public void resetFollow(Player p) {
			if (p == null) {
				return;
			}
			p.followingPlayer = false;
		}
	}

    


