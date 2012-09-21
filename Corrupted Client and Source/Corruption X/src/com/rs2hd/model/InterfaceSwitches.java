package com.rs2hd.model;

public class InterfaceSwitches {
	private Player player;

	public InterfaceSwitches(Player player) {
		this.player = player;
	}

	public void analyzeLogin() {
		if (player.getDisplayMode() == 2 || player.getDisplayMode() == 3) {
			sendFullScreenInterfaces();
			player.setFullScreen(true);
		} else {
			sendMainInterfaces();
			player.setFullScreen(false);
		}
		player.getActionSender().sendAccessMask(65535, 65535, player.isFullScreen()? 746 : 548, player.isFullScreen() ? 120 : 81, 0, 2);
		player.getActionSender().sendAccessMask(65535, 65535, 884, 11, 0, 2);
		player.getActionSender().sendAccessMask(65535, 65535, 884, 12, 0, 2);
		player.getActionSender().sendAccessMask(65535, 65535, 884, 13, 0, 2);
		player.getActionSender().sendAccessMask(65535, 65535, 884, 14, 0, 2);
	}

	public void switchDisplayerModes() {
		if ((player.getDisplayMode() == 2 || player.getDisplayMode() == 3)
				&& !player.isFullScreen()) {
			switchToFSFromNormal();
			player.setFullScreen(true);
		} else if ((player.getDisplayMode() == 0 || player.getDisplayMode() == 1)
				&& player.isFullScreen()) {
			switchToNormalFromFS();
			player.setFullScreen(false);
		}
	}

	public void sendMainInterfaces() {
		player.getActionSender().setInterface(1, 548, 150, 884).setInterface(1,
				548, 151, 320).setInterface(1, 548, 152, 190).setInterface(1,
						548, 153, 259).setInterface(1, 548, 154, 149).setInterface(1,
								548, 155, 387).setInterface(1, 548, 156, 271).setInterface(1,
										548, 157, player.magicType).setInterface(1, 548, 159, 550).setInterface(1,
												548, 160, 551).setInterface(1, 548, 161, 589).setInterface(1,
														548, 162, 261).setInterface(1, 548, 163, 464).setInterface(1,
																548, 164, 187).setInterface(1, 548, 165, 34).setInterface(1,
																		548, 168, 182).setInterface(1, 548, 150, 884).setInterface(1,
																				548, 20, 751).setInterface(1, 548, 141, 752).setInterface(1,
																						548, 14, 754).setInterface(1, 548, 133, 748).setInterface(1,
																								548, 134, 749).setInterface(1, 548, 135, 750).setInterface(1,
																										548, 137, 747).setInterface(1, 548, 12, 745).setInterface(1,
																												752, 8, 137).setInterface(1, 548, 150, 884).setInterface(1,
																														548, 151, 320).setInterface(1, 548, 152, 190).setInterface(1,
																																548, 153, 259).setInterface(1, 548, 154, 149).setInterface(1,
																																		548, 155, 387).setInterface(1, 548, 156, 271).setInterface(1,
																																				548, 157, player.magicType).setInterface(1, 548, 159, 550).setInterface(1,
																																						548, 160, 551).setInterface(1, 548, 161, 589).setInterface(1,
																																								548, 162, 261).setInterface(1, 548, 163, 464).setInterface(1,
																																										548, 164, 187).setInterface(1, 548, 165, 34).setInterface(1,
																																												548, 168, 182).setWindow(548, 0).setAccessMask(-1, -1, 548,
																																														79, 0, 2).setAccessMask(-1, -1, 548, 80, 0, 2).setAccessMask(
																																																-1, -1, 548, 81, 0, 2).setAccessMask(0, 300, 190, 18, 0, 14)
																																																.setAccessMask(0, 11, 190, 15, 0, 2).setAccessMask(-1, -1,
																																																		548, 82, 0, 2).setAccessMask(-1, -1, 548, 83, 0, 2)
																																																		.setAccessMask(-1, -1, 548, 84, 0, 2).setAccessMask(-1, -1,
																																																				548, 85, 0, 2).setAccessMask(0, 27, 271, 6, 0, 2)
																																																				.setAccessMask(-1, -1, 548, 86, 0, 2).setAccessMask(-1, -1,
																																																						548, 50, 0, 2).setAccessMask(-1, -1, 548, 51, 0, 2)
																																																						.setAccessMask(-1, -1, 548, 52, 0, 2).setAccessMask(-1, -1,
																																																								548, 53, 0, 2).setAccessMask(-1, -1, 548, 54, 0, 2)
																																																								.setAccessMask(-1, -1, 548, 55, 0, 2).setAccessMask(0, 712,
																																																										187, 1, 0, 2).setAccessMask(-1, -1, 548, 56, 0, 2)
																																																										.setAccessMask(0, 29, 34, 9, 40, 30);
	}

	public void sendFullScreenInterfaces() {
		player.getActionSender().setInterface(1, 548, 150, 884).setInterface(1,
				548, 151, 320).setInterface(1, 548, 152, 190).setInterface(1,
						548, 153, 259).setInterface(1, 548, 154, 149).setInterface(1,
								548, 155, 387).setInterface(1, 548, 156, 271).setInterface(1,
										548, 157, player.magicType).setInterface(1, 548, 159, 550).setInterface(1,
												548, 160, 551).setInterface(1, 548, 161, 589).setInterface(1,
														548, 162, 261).setInterface(1, 548, 163, 464).setInterface(1,
																548, 164, 187).setInterface(1, 548, 165, 34).setInterface(1,
																		548, 168, 182).setInterface(1, 548, 150, 884).setInterface(1,
																				746, 15, 751).setInterface(1, 746, 18, 752).setInterface(1,
																						746, 19, 754).setInterface(1, 746, 163, 748).setInterface(1,
																								746, 164, 749).setInterface(1, 746, 165, 750).setInterface(1,
																										746, 166, 747).setInterface(1, 746, 11, 745).setInterface(1,
																												752, 8, 137).setInterface(1, 746, 29, 884).setInterface(1,
																														746, 30, 320).setInterface(1, 746, 31, 190).setInterface(1,
																																746, 32, 259).setInterface(1, 746, 33, 149).setInterface(1,
																																		746, 34, 387).setInterface(1, 746, 35, 271).setInterface(1,
																																				746, 36, player.magicType).setInterface(1, 746, 38, 550).setInterface(1,
																																						746, 39, 551).setInterface(1, 746, 40, 589).setInterface(1,
																																								746, 41, 261).setInterface(1, 746, 42, 464).setInterface(1,
																																										746, 43, 187).setInterface(1, 746, 44, 34).setInterface(1,
																																												746, 47, 182).setAccessMask(-1, -1, 746, 120, 0, 2)
																																												.setAccessMask(-1, -1, 884, 11, 0, 2).setAccessMask(-1, -1,
																																														884, 12, 0, 2).setAccessMask(-1, -1, 884, 13, 0, 2)
																																														.setAccessMask(-1, -1, 746, 121, 0, 2).setAccessMask(-1, -1,
																																																746, 122, 0, 2).setAccessMask(0, 300, 190, 18, 0, 14)
																																																.setAccessMask(0, 11, 190, 15, 0, 2).setAccessMask(-1, -1,
																																																		746, 123, 0, 2).setAccessMask(-1, -1, 746, 124, 0, 2)
																																																		.setAccessMask(-1, -1, 746, 125, 0, 2).setAccessMask(-1, -1,
																																																				746, 126, 0, 2).setAccessMask(0, 27, 271, 6, 0, 2)
																																																				.setAccessMask(-1, -1, 746, 127, 0, 2).setAccessMask(-1, -1,
																																																						746, 129, 0, 2).setAccessMask(-1, -1, 746, 130, 0, 2)
																																																						.setAccessMask(-1, -1, 746, 131, 0, 2).setAccessMask(-1, -1,
																																																								746, 132, 0, 2).setAccessMask(-1, -1, 746, 133, 0, 2)
																																																								.setAccessMask(-1, -1, 746, 134, 0, 2).setAccessMask(0, 717,
																																																										187, 1, 0, 2).setAccessMask(-1, -1, 746, 135, 0, 2)
																																																										.setAccessMask(0, 29, 34, 9, 40, 30).setWindow(746, 0);
	}

	public void switchToFSFromNormal() {
		player.getActionSender().setWindow(746, 0).switchPanes2(548, 5, 746, 6)
		.switchPanes2(548, 6, 746, 5).switchPanes2(548, 16, 746, 8)
		.switchPanes2(548, 141, 746, 18).switchPanes2(548, 14, 746, 19)
		.switchPanes2(548, 20, 746, 15).switchPanes2(548, 145, 746, 26)
		.switchPanes2(548, 146, 746, 27).switchPanes2(548, 150, 746, 29)
		.switchPanes2(548, 151, 746, 30).switchPanes2(548, 152, 746, 31)
		.switchPanes2(548, 153, 746, 32).switchPanes2(548, 154, 746, 33)
		.switchPanes2(548, 155, 746, 34).switchPanes2(548, 156, 746, 35)
		.switchPanes2(548, 157, 746, 36).switchPanes2(548, 158, 746, 37)
		.switchPanes2(548, 159, 746, 38).switchPanes2(548, 160, 746, 39)
		.switchPanes2(548, 161, 746, 40).switchPanes2(548, 162, 746, 41)
		.switchPanes2(548, 163, 746, 42).switchPanes2(548, 164, 746, 43)
		.switchPanes2(548, 165, 746, 44).switchPanes2(548, 167, 746, 46)
		.switchPanes2(548, 168, 746, 47).switchPanes2(548, 133, 746, 163)
		.switchPanes2(548, 134, 746, 164)
		.switchPanes2(548, 135, 746, 165)
		.switchPanes2(548, 137, 746, 166).switchPanes2(548, 12, 746, 11);
	}

	public void switchToNormalFromFS() {
		player.getActionSender().setWindow(548, 0).switchPanes2(746, 6, 548, 5)
		.switchPanes2(746, 5, 548, 6).switchPanes2(746, 8, 548, 16)
		.switchPanes2(746, 18, 548, 141).switchPanes2(746, 19, 548, 14)
		.switchPanes2(746, 15, 548, 20).switchPanes2(746, 26, 548, 145)
		.switchPanes2(746, 27, 548, 146).switchPanes2(746, 29, 548, 150)
		.switchPanes2(746, 30, 548, 151).switchPanes2(746, 31, 548, 152)
		.switchPanes2(746, 32, 548, 153).switchPanes2(746, 33, 548, 154)
		.switchPanes2(746, 34, 548, 155).switchPanes2(746, 35, 548, 156)
		.switchPanes2(746, 36, 548, 157).switchPanes2(746, 37, 548, 158)
		.switchPanes2(746, 38, 548, 159).switchPanes2(746, 39, 548, 160)
		.switchPanes2(746, 40, 548, 161).switchPanes2(746, 41, 548, 162)
		.switchPanes2(746, 42, 548, 163).switchPanes2(746, 43, 548, 164)
		.switchPanes2(746, 44, 548, 165).switchPanes2(746, 46, 548, 167)
		.switchPanes2(746, 47, 548, 168).switchPanes2(746, 163, 548, 133)
		.switchPanes2(746, 164, 548, 134)
		.switchPanes2(746, 165, 548, 135)
		.switchPanes2(746, 166, 548, 137).switchPanes2(746, 11, 548, 12);
	}
}
