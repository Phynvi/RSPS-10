package com.rs2hd.model;

import com.rs2hd.util.Misc;

/**
 * Manages requests (trade, duel).
 * @author Graham
 *
 */
public class Request {
	
	private Player player;
	protected Player duelReq = null;
	protected Player tradeReq = null;
	protected Trade trade = null;
	
	public Request(Player player) {
		this.player = player;
	}
	
	public void requestTrade(Player other) {
		try {
		if(other.getRequests().tradeReq == player) {
			answerTrade(other);
		} else {
			player.getActionSender().sendMessage("Sending trade request...");
            		other.getActionSender().sendTradeReq(Misc.upper(player.getUsername()), "wishes to trade with you.");
			tradeReq = other;
		}
		} catch(Exception e) {
		}
	}

	public void answerTrade(Player other) {
		try {
		if(trade != null) {
			if(trade.getPlayer1() == other && trade.getPlayer2() == player) {
				return;
			}
			if(trade.getPlayer2() == other && trade.getPlayer1() == player) {
				return;
			}
			trade.close();
		}
		if(other.getRequests().tradeReq == player) {
			// both players are trading each other so establish the trade
			establishTrade(player, other);
		} else {
			requestTrade(other);
		}
		} catch(Exception e) {
		}
	}

	private static void establishTrade(Player player, Player other) {
		try {
		Trade trade = new Trade(player, other);
		player.getRequests().trade = trade;
		other.getRequests().trade = trade;
		} catch(Exception e) {
		}
	}

	public boolean isTrading() {
		return trade != null;
	}

	public void closeTrade() {
		try {
		if(trade != null) {
			trade.close();
		}
		} catch(Exception e) {
		}
	}

	public Trade getTrade() {
		return trade;
	}

}
