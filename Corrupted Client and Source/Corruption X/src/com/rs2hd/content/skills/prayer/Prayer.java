package com.rs2hd.content.skills.prayer;

import com.rs2hd.model.Player;

public class Prayer {

	public void handlePrayerSwitch(Player p, int buttonId) {
		switch(buttonId) {
		case 1: //quickprayer
			if (p.PrayerON == false) {
				UseQuickPrayer(p);
			}else{
				PrayerOff(p);
			}
			break;
		case 2: //quickprayer settings
			if (p.QuickPrayer == false) {
				p.getActionSender().dunno(168,6);
				p.getActionSender().dunno(181,1);
				p.getActionSender().sendAccessMask(2, 271, 7, 0, 27);
				QuickPrayerConfig(p);
				p.QuickPrayer = true;
			}else{
				p.getActionSender().dunno(168,6);
				p.getActionSender().dunno(181,0);
				p.getActionSender().sendAccessMask(2, 271, 6 , 0, 27);
				p.QuickPrayer = false;
			}
			break;
		}
	}
	public void UseQuickPrayer(Player p) {
		if(p.QuickTHICKSKIN == true)
			handlePrayerUse(p, 0);
		if(p.QuickBURSTOFSTRENGHT == true)
			handlePrayerUse(p, 1);
		if(p.QuickCLARITYOFTHOUGHT == true)
			handlePrayerUse(p, 2);
		if(p.QuickSHARPEYE == true)
			handlePrayerUse(p, 3);
		if(p.QuickMYSTICWILL == true)
			handlePrayerUse(p, 4);
		if(p.QuickROCKSKIN == true)
			handlePrayerUse(p, 5);
		if(p.QuickSUPERHUMANSTRENGHT == true)
			handlePrayerUse(p, 6);
		if(p.QuickIMPROVEDREFLEXES == true)
			handlePrayerUse(p, 7);
		if(p.QuickRAPIDRESTORE == true)
			handlePrayerUse(p, 8);
		if(p.QuickRAPIDHEAL == true)
			handlePrayerUse(p, 9);
		if(p.QuickPROTECTITEM == true)
			handlePrayerUse(p, 10);
		if(p.QuickHAWKEYE == true)
			handlePrayerUse(p, 11);
		if(p.QuickMYSTICLORE == true)
			handlePrayerUse(p, 12);
		if(p.QuickSTEELSKIN == true)
			handlePrayerUse(p, 13);
		if(p.QuickULTIMATESTRENGHT == true)
			handlePrayerUse(p, 14);
		if(p.QuickINCREDIBLEREFLEXES == true)
			handlePrayerUse(p, 15);
		if(p.QuickPROTECTFROMSUMMONING == true)
			handlePrayerUse(p, 16);
		if(p.QuickPROTECTFROMMAGIC == true)
			handlePrayerUse(p, 17);
		if(p.QuickPROTECTFROMMISSELES == true)
			handlePrayerUse(p, 18);
		if(p.QuickPROTECTFROMMELEE == true)
			handlePrayerUse(p, 19);
		if(p.QuickEAGLEEYE == true)
			handlePrayerUse(p, 20);
		if(p.QuickMYSTICMIGHT == true)
			handlePrayerUse(p, 21);
		if(p.QuickRETRIBUTION == true)
			handlePrayerUse(p, 22);
		if(p.QuickREDEMPTION == true)
			handlePrayerUse(p, 23);
		if(p.QuickSMITE == true)
			handlePrayerUse(p, 24);
		if(p.QuickCHILVALRY == true)
			handlePrayerUse(p, 25);
		if(p.QuickPIETY == true)
			handlePrayerUse(p, 26);
	}
	public void QuickhandlePrayerUse(Player p, int PrayerButton) {
		switch(PrayerButton) {
		case 0:
			if(p.getSkills().getLevelForXp(5) < 1) {
				p.sm("You need 1 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.QuickTHICKSKIN == false) {
				//DEF
				p.QuickROCKSKIN = false;
				p.QuickSTEELSKIN = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickTHICKSKIN = true;
			}else{
				p.QuickTHICKSKIN = false;
			}
			break;
		case 1:
			if(p.getSkills().getLevelForXp(5) < 4) {
				p.sm("You need 4 Prayer to activate this.");
				return;
			}
			if(p.QuickBURSTOFSTRENGHT == false) {
				//STR
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickBURSTOFSTRENGHT = true;
			}else{
				p.QuickBURSTOFSTRENGHT = false;
			}
			break;
		case 2:
			if(p.getSkills().getLevelForXp(5) < 7) {
				p.sm("You need 7 Prayer to activate this.");
				return;
			}
			if(p.QuickCLARITYOFTHOUGHT == false) {
				//ATT
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickCLARITYOFTHOUGHT = true;
			}else{
				p.QuickCLARITYOFTHOUGHT = false;
			}
			break;
		case 3:
			if(p.getSkills().getLevelForXp(5) < 8) {
				p.sm("You need 8 Prayer to activate this.");
				return;
			}
			if(p.QuickSHARPEYE == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickSHARPEYE = true;
			}else{
				p.QuickSHARPEYE = false;
			}
			break;
		case 4:
			if(p.getSkills().getLevelForXp(5) < 9) {
				p.sm("You need 9 Prayer to activate this.");
				return;
			}
			if(p.QuickMYSTICWILL == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickMYSTICWILL = true;
			}else{
				p.QuickMYSTICWILL = false;
			}
			break;
		case 5:
			if(p.getSkills().getLevelForXp(5) < 10) {
				p.sm("You need 10 Prayer to activate this.");
				return;
			}
			if(p.QuickROCKSKIN == false) {
				//DEF
				p.QuickTHICKSKIN = false;
				p.QuickSTEELSKIN = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickROCKSKIN = true;
			}else{
				p.QuickROCKSKIN = false;
			}
			break;
		case 6:
			if(p.getSkills().getLevelForXp(5) < 13) {
				p.sm("You need 13 Prayer to activate this.");
				return;
			}
			if(p.QuickSUPERHUMANSTRENGHT == false) {
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickSUPERHUMANSTRENGHT = true;
			}else{
				p.QuickSUPERHUMANSTRENGHT = false;
			}
			break;
		case 7:
			if(p.getSkills().getLevelForXp(5) < 16) {
				p.sm("You need 16 Prayer to activate this.");
				return;
			}
			if(p.QuickIMPROVEDREFLEXES == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickIMPROVEDREFLEXES = true;
			}else{
				p.QuickIMPROVEDREFLEXES = false;
			}
			break;
		case 8:
			if(p.getSkills().getLevelForXp(5) < 19) {
				p.sm("You need 19 Prayer to activate this.");
				return;
			}
			if(p.QuickRAPIDRESTORE == false) {
				p.QuickRAPIDRESTORE = true;
			}else{
				p.QuickRAPIDRESTORE = false;
			}
			break;
		case 9:
			if(p.getSkills().getLevelForXp(5) < 22) {
				p.sm("You need 22 Prayer to activate this.");
				return;
			}
			if(p.QuickRAPIDHEAL == false) {
				p.QuickRAPIDHEAL = true;
			}else{
				p.QuickRAPIDHEAL = false;
			}
			break;
		case 10:
			if(p.getSkills().getLevelForXp(5) < 25) {
				p.sm("You need 25 Prayer to activate this.");
				return;
			}
			if(p.QuickPROTECTITEM == false) {
				p.QuickPROTECTITEM = true;
			}else{
				p.QuickPROTECTITEM = false;
			}
			break;
		case 11:
			if(p.getSkills().getLevelForXp(5) < 26) {
				p.sm("You need 26 Prayer to activate this.");
				return;
			}
			if(p.QuickHAWKEYE == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickHAWKEYE = true;
			}else{
				p.QuickHAWKEYE = false;
			}
			break;
		case 12:
			if(p.getSkills().getLevelForXp(5) < 27) {
				p.sm("You need 27 Prayer to activate this.");
				return;
			}
			if(p.QuickMYSTICLORE == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickMYSTICLORE = true;
			}else{
				p.QuickMYSTICLORE = false;
			}
			break;
		case 13:
			if(p.getSkills().getLevelForXp(5) < 28) {
				p.sm("You need 28 Prayer to activate this.");
				return;
			}
			if(p.QuickSTEELSKIN == false) {
				//DEF
				p.QuickTHICKSKIN = false;
				p.QuickROCKSKIN = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickSTEELSKIN = true;
			}else{
				p.QuickSTEELSKIN = false;
			}
			break;
		case 14:
			if(p.getSkills().getLevelForXp(5) < 31) {
				p.sm("You need 31 Prayer to activate this.");
				return;
			}
			if(p.QuickULTIMATESTRENGHT == false) {
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickULTIMATESTRENGHT = true;
			}else{
				p.QuickULTIMATESTRENGHT = false;
			}
			break;
		case 15:
			if(p.getSkills().getLevelForXp(5) < 34) {
				p.sm("You need 34 Prayer to activate this.");
				return;
			}
			if(p.QuickINCREDIBLEREFLEXES == false) {

				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickINCREDIBLEREFLEXES = true;
			}else{
				p.QuickINCREDIBLEREFLEXES = false;
			}

			break;


		case 16:
			if(p.getSkills().getLevelForXp(5) < 35) {
				p.sm("You need 35 Prayer to activate this.");
				return;
			}
			if(p.QuickPROTECTFROMSUMMONING == false) {
				p.QuickPROTECTFROMSUMMONING = true;
			}else{
				p.QuickPROTECTFROMSUMMONING = false;
			}

			break;


		case 17:
			if(p.getSkills().getLevelForXp(5) < 37) {
				p.sm("You need 37 Prayer to activate this.");
				return;
			}
			if(p.QuickPROTECTFROMMAGIC == false) {
				p.QuickPROTECTFROMMISSELES = false;
				p.QuickPROTECTFROMMELEE = false;

				p.QuickRETRIBUTION = false;
				p.QuickREDEMPTION = false;
				p.QuickSMITE = false;

				p.QuickPROTECTFROMMAGIC = true;
			}else{
				p.QuickPROTECTFROMMAGIC = false;
			}

			break;


		case 18:
			if(p.getSkills().getLevelForXp(5) < 40) {
				p.sm("You need 40 Prayer to activate this.");
				return;
			}
			if(p.QuickPROTECTFROMMISSELES == false) {
				p.QuickPROTECTFROMMAGIC = false;
				p.QuickPROTECTFROMMELEE = false;

				p.QuickRETRIBUTION = false;
				p.QuickREDEMPTION = false;
				p.QuickSMITE = false;

				p.QuickPROTECTFROMMISSELES = true;
			}else{
				p.QuickPROTECTFROMMISSELES = false;
			}

			break;


		case 19:
			if(p.getSkills().getLevelForXp(5) < 43) {
				p.sm("You need 43 Prayer to activate this.");
				return;
			}
			if(p.QuickPROTECTFROMMELEE == false) {
				p.QuickPROTECTFROMMAGIC = false;
				p.QuickPROTECTFROMMISSELES = false;

				p.QuickRETRIBUTION = false;
				p.QuickREDEMPTION = false;
				p.QuickSMITE = false;

				p.QuickPROTECTFROMMELEE = true;
			}else{
				p.QuickPROTECTFROMMELEE = false;
			}

			break;


		case 20: //eagle eye
			if(p.getSkills().getLevelForXp(5) < 44) {
				p.sm("You need 44 Prayer to activate this.");
				return;
			}
			if(p.QuickEAGLEEYE == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickEAGLEEYE = true;
			}else{
				p.QuickEAGLEEYE = false;
			}

			break;



		case 21:
			if(p.getSkills().getLevelForXp(5) < 45) {
				p.sm("You need 45 Prayer to activate this.");
				return;
			}
			if(p.QuickMYSTICMIGHT == false) {
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;
				p.QuickCHILVALRY = false;

				p.QuickMYSTICMIGHT = true;
			}else{
				p.QuickMYSTICMIGHT = false;
			}

			break;


		case 22: //retribution
			if(p.getSkills().getLevelForXp(5) < 46) {
				p.sm("You need 46 Prayer to activate this.");
				return;
			}
			if(p.QuickRETRIBUTION == false) {
				p.QuickPROTECTFROMMAGIC = false;
				p.QuickPROTECTFROMMISSELES = false;
				p.QuickPROTECTFROMMELEE = false;

				p.QuickREDEMPTION = false;
				p.QuickSMITE = false;

				p.QuickRETRIBUTION = true;
			}else{
				p.QuickRETRIBUTION = false;
			}

			break;


		case 23: //redemption
			if(p.getSkills().getLevelForXp(5) < 49) {
				p.sm("You need 49 Prayer to activate this.");
				return;
			}
			if(p.QuickREDEMPTION == false) {
				p.QuickPROTECTFROMMAGIC = false;
				p.QuickPROTECTFROMMISSELES = false;
				p.QuickPROTECTFROMMELEE = false;

				p.QuickRETRIBUTION = false;
				p.QuickSMITE = false;

				p.QuickREDEMPTION = true;
			}else{
				p.QuickREDEMPTION = false;
			}

			break;


		case 24: //smite
			if(p.getSkills().getLevelForXp(5) < 52) {
				p.sm("You need 52 Prayer to activate this.");
				return;
			}
			if(p.QuickSMITE == false) {
				p.QuickPROTECTFROMMAGIC = false;
				p.QuickPROTECTFROMMISSELES = false;
				p.QuickPROTECTFROMMELEE = false;

				p.QuickRETRIBUTION = false;
				p.QuickREDEMPTION = false;

				p.QuickSMITE = true;
			}else{
				p.QuickSMITE = false;
			}

			break;


		case 25: //CHILVALRY
			if(p.getSkills().getLevelForXp(5) < 60) {
				p.sm("You need 60 Prayer to activate this.");
				return;
			}
			if(p.QuickCHILVALRY == false) {
				//DEF
				p.QuickTHICKSKIN = false;
				p.QuickROCKSKIN = false;
				p.QuickSTEELSKIN = false;
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickPIETY = false;

				p.QuickCHILVALRY = true;
			}else{
				p.QuickCHILVALRY = false;
			}

			break;


		case 26:
			if(p.getSkills().getLevelForXp(5) < 70) {
				p.sm("You need 70 Prayer to activate this.");
				return;
			}
			if(p.QuickPIETY == false) { //PIETY
				//DEF
				p.QuickTHICKSKIN = false;
				p.QuickROCKSKIN = false;
				p.QuickSTEELSKIN = false;
				//ATT
				p.QuickCLARITYOFTHOUGHT = false;
				p.QuickIMPROVEDREFLEXES = false;
				p.QuickINCREDIBLEREFLEXES = false;
				//STR
				p.QuickBURSTOFSTRENGHT = false;
				p.QuickSUPERHUMANSTRENGHT = false;
				p.QuickULTIMATESTRENGHT = false;
				//MAGIC
				p.QuickMYSTICWILL = false;
				p.QuickMYSTICLORE = false;
				p.QuickMYSTICMIGHT = false;
				//RANGE
				p.QuickSHARPEYE = false;
				p.QuickHAWKEYE = false;
				p.QuickEAGLEEYE = false;

				p.QuickCHILVALRY = false;

				p.QuickPIETY = true;
			}else{
				p.QuickPIETY = false;
			}

			break;



		}
		QuickPrayerConfig(p);
	}
	public void handlePrayerUse(Player p, int PrayerButton) {
		switch(PrayerButton) {
		case 0:
			if(p.getSkills().getLevelForXp(5) < 1) {
				p.sm("You need 1 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.THICKSKIN == false) {
				//DEF
				p.ROCKSKIN = false;
				p.STEELSKIN = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.THICKSKIN = true;
				PrayerOn(p);
			}else{
				p.THICKSKIN = false;
				PrayerConfig(p);
			}
			break;
		case 1:
			if(p.getSkills().getLevelForXp(5) < 4) {
				p.sm("You need 4 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.BURSTOFSTRENGHT == false) {
				//STR
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.BURSTOFSTRENGHT = true;
				PrayerOn(p);
			}else{
				p.BURSTOFSTRENGHT = false;
				PrayerConfig(p);
			}
			break;
		case 2:
			if(p.getSkills().getLevelForXp(5) < 7) {
				p.sm("You need 7 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.CLARITYOFTHOUGHT == false) {
				//ATT
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.CLARITYOFTHOUGHT = true;
				PrayerOn(p);
			}else{
				p.CLARITYOFTHOUGHT = false;
				PrayerConfig(p);
			}
			break;
		case 3:
			if(p.getSkills().getLevelForXp(5) < 8) {
				p.sm("You need 8 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.SHARPEYE == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.SHARPEYE = true;
				PrayerOn(p);
			}else{
				p.SHARPEYE = false;
				PrayerConfig(p);
			}
			break;
		case 4:
			if(p.getSkills().getLevelForXp(5) < 9) {
				p.sm("You need 9 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.MYSTICWILL == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.MYSTICWILL = true;
				PrayerOn(p);
			}else{
				p.MYSTICWILL = false;
				PrayerConfig(p);
			}
			break;
		case 5:
			if(p.getSkills().getLevelForXp(5) < 10) {
				p.sm("You need 10 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.ROCKSKIN == false) {
				//DEF
				p.THICKSKIN = false;
				p.STEELSKIN = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.ROCKSKIN = true;
				PrayerOn(p);
			}else{
				p.ROCKSKIN = false;
				PrayerConfig(p);
			}
			break;
		case 6:
			if(p.getSkills().getLevelForXp(5) < 13) {
				p.sm("You need 13 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.SUPERHUMANSTRENGHT == false) {
				//STR
				p.BURSTOFSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.SUPERHUMANSTRENGHT = true;
				PrayerOn(p);
			}else{
				p.SUPERHUMANSTRENGHT = false;
				PrayerConfig(p);
			}
			break;
		case 7:
			if(p.getSkills().getLevelForXp(5) < 16) {
				p.sm("You need 16 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.IMPROVEDREFLEXES == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.INCREDIBLEREFLEXES = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.IMPROVEDREFLEXES = true;
				PrayerOn(p);
			}else{
				p.IMPROVEDREFLEXES = false;
				PrayerConfig(p);
			}
			break;
		case 8:
			if(p.getSkills().getLevelForXp(5) < 19) {
				p.sm("You need 19 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.RAPIDRESTORE == false) {
				p.RAPIDRESTORE = true;
				PrayerOn(p);
			}else{
				p.RAPIDRESTORE = false;
				PrayerConfig(p);
			}
			break;
		case 9:
			if(p.getSkills().getLevelForXp(5) < 22) {
				p.sm("You need 22 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.RAPIDHEAL == false) {
				p.RAPIDHEAL = true;
				PrayerOn(p);
			}else{
				p.RAPIDHEAL = false;
				PrayerConfig(p);
			}
			break;
		case 10:
			if(p.getSkills().getLevelForXp(5) < 25) {
				p.sm("You need 25 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.PROTECTITEM == false) {
				p.PROTECTITEM = true;
				PrayerOn(p);
			}else{
				p.PROTECTITEM = false;
				PrayerConfig(p);
			}
			break;
		case 11:
			if(p.getSkills().getLevelForXp(5) < 26) {
				p.sm("You need 26 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.HAWKEYE == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.HAWKEYE = true;
				PrayerOn(p);
			}else{
				p.HAWKEYE = false;
				PrayerConfig(p);
			}
			break;
		case 12:
			if(p.getSkills().getLevelForXp(5) < 27) {
				p.sm("You need 27 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.MYSTICLORE == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.MYSTICLORE = true;
				PrayerOn(p);
			}else{
				p.MYSTICLORE = false;
				PrayerConfig(p);
			}
			break;
		case 13:
			if(p.getSkills().getLevelForXp(5) < 28) {
				p.sm("You need 28 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.STEELSKIN == false) {
				//DEF
				p.THICKSKIN = false;
				p.ROCKSKIN = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.STEELSKIN = true;
				PrayerOn(p);
			}else{
				p.STEELSKIN = false;
				PrayerConfig(p);
			}
			break;
		case 14:
			if(p.getSkills().getLevelForXp(5) < 31) {
				p.sm("You need 31 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.ULTIMATESTRENGHT == false) {
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.ULTIMATESTRENGHT = true;
				PrayerOn(p);
			}else{
				p.ULTIMATESTRENGHT = false;
				PrayerConfig(p);
			}
			break;
		case 15:
			if(p.getSkills().getLevelForXp(5) < 34) {
				p.sm("You need 34 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.INCREDIBLEREFLEXES == false) {

				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.INCREDIBLEREFLEXES = true;
				PrayerOn(p);
			}else{
				p.INCREDIBLEREFLEXES = false;
				PrayerConfig(p);
			}

			break;


		case 16:
			if(p.getSkills().getLevelForXp(5) < 35) {
				p.sm("You need 35 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.PROTECTFROMSUMMONING == false) {
				p.PROTECTFROMSUMMONING = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.PROTECTFROMSUMMONING = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 17:
			if(p.getSkills().getLevelForXp(5) < 37) {
				p.sm("You need 37 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.PROTECTFROMMAGIC == false) {
				p.PROTECTFROMMISSELES = false;
				p.PROTECTFROMMELEE = false;

				p.RETRIBUTION = false;
				p.REDEMPTION = false;
				p.SMITE = false;

				p.PROTECTFROMMAGIC = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.PROTECTFROMMAGIC = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 18:
			if(p.getSkills().getLevelForXp(5) < 40) {
				p.sm("You need 40 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.PROTECTFROMMISSELES == false) {
				p.PROTECTFROMMAGIC = false;
				p.PROTECTFROMMELEE = false;

				p.RETRIBUTION = false;
				p.REDEMPTION = false;
				p.SMITE = false;

				p.PROTECTFROMMISSELES = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.PROTECTFROMMISSELES = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 19:
			if(p.getSkills().getLevelForXp(5) < 43) {
				p.sm("You need 43 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.PROTECTFROMMELEE == false) {
				p.PROTECTFROMMAGIC = false;
				p.PROTECTFROMMISSELES = false;

				p.RETRIBUTION = false;
				p.REDEMPTION = false;
				p.SMITE = false;

				p.PROTECTFROMMELEE = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.PROTECTFROMMELEE = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 20: //eagle eye
			if(p.getSkills().getLevelForXp(5) < 44) {
				p.sm("You need 44 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.EAGLEEYE == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.EAGLEEYE = true;
				PrayerOn(p);
			}else{
				p.EAGLEEYE = false;
				PrayerConfig(p);
			}

			break;



		case 21:
			if(p.getSkills().getLevelForXp(5) < 45) {
				p.sm("You need 45 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.MYSTICMIGHT == false) {
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;
				p.CHILVALRY = false;

				p.MYSTICMIGHT = true;
				PrayerOn(p);
			}else{
				p.MYSTICMIGHT = false;
				PrayerConfig(p);
			}

			break;


		case 22: //retribution
			if(p.getSkills().getLevelForXp(5) < 46) {
				p.sm("You need 46 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.RETRIBUTION == false) {
				p.PROTECTFROMMAGIC = false;
				p.PROTECTFROMMISSELES = false;
				p.PROTECTFROMMELEE = false;

				p.REDEMPTION = false;
				p.SMITE = false;

				p.RETRIBUTION = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.RETRIBUTION = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 23: //redemption
			if(p.getSkills().getLevelForXp(5) < 49) {
				p.sm("You need 49 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.REDEMPTION == false) {
				p.PROTECTFROMMAGIC = false;
				p.PROTECTFROMMISSELES = false;
				p.PROTECTFROMMELEE = false;

				p.RETRIBUTION = false;
				p.SMITE = false;

				p.REDEMPTION = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.REDEMPTION = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 24: //smite
			if(p.getSkills().getLevelForXp(5) < 52) {
				p.sm("You need 52 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.SMITE == false) {
				p.PROTECTFROMMAGIC = false;
				p.PROTECTFROMMISSELES = false;
				p.PROTECTFROMMELEE = false;

				p.RETRIBUTION = false;
				p.REDEMPTION = false;

				p.SMITE = true;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerOn(p);
			}else{
				p.SMITE = false;
				p.getHeadIcons().getPrayerIcon(p);
				p.getUpdateFlags().setAppearanceUpdateRequired(true);
				PrayerConfig(p);
			}

			break;


		case 25: //CHILVALRY
			if(p.getSkills().getLevelForXp(5) < 60) {
				p.sm("You need 60 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.CHILVALRY == false) {
				//DEF
				p.THICKSKIN = false;
				p.ROCKSKIN = false;
				p.STEELSKIN = false;
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.PIETY = false;

				p.CHILVALRY = true;
				PrayerOn(p);
			}else{
				p.CHILVALRY = false;
				PrayerConfig(p);
			}

			break;


		case 26:
			if(p.getSkills().getLevelForXp(5) < 70) {
				p.sm("You need 70 Prayer to activate this.");
				return;
			}
			if(p.getSkills().getLevel(5) == 0) {
				p.sm("Please recharge your prayer at the Lumbridge Church.");
				return;
			}
			if(p.PIETY == false) { //PIETY
				//DEF
				p.THICKSKIN = false;
				p.ROCKSKIN = false;
				p.STEELSKIN = false;
				//ATT
				p.CLARITYOFTHOUGHT = false;
				p.IMPROVEDREFLEXES = false;
				p.INCREDIBLEREFLEXES = false;
				//STR
				p.BURSTOFSTRENGHT = false;
				p.SUPERHUMANSTRENGHT = false;
				p.ULTIMATESTRENGHT = false;
				//MAGIC
				p.MYSTICWILL = false;
				p.MYSTICLORE = false;
				p.MYSTICMIGHT = false;
				//RANGE
				p.SHARPEYE = false;
				p.HAWKEYE = false;
				p.EAGLEEYE = false;

				p.CHILVALRY = false;

				p.PIETY = true;
				PrayerOn(p);
			}else{
				p.PIETY = false;
				PrayerConfig(p);
			}

			break;



		}

	}
	public void PrayerOn(Player p) {

		p.PrayerON = true;
		PrayerConfig(p);
		//p.getActionSender().dunno(168,5);
		p.getActionSender().dunno(182,1);
		p.getActionSender().dunno(695,0);

	}
	public void PrayerOff(Player p) {
		p.THICKSKIN = false;
		p.BURSTOFSTRENGHT = false;
		p.CLARITYOFTHOUGHT = false;
		p.SHARPEYE = false;
		p.MYSTICWILL = false;
		p.ROCKSKIN = false;
		p.SUPERHUMANSTRENGHT = false;
		p.IMPROVEDREFLEXES = false;
		p.RAPIDRESTORE = false;
		p.RAPIDHEAL = false;
		p.PROTECTITEM = false;
		p.HAWKEYE = false;
		p.MYSTICLORE = false;
		p.STEELSKIN = false;
		p.ULTIMATESTRENGHT = false;
		p.INCREDIBLEREFLEXES = false;
		p.PROTECTFROMSUMMONING = false;
		p.PROTECTFROMMAGIC = false;
		p.PROTECTFROMMISSELES = false;
		p.PROTECTFROMMELEE = false;
		p.EAGLEEYE = false;
		p.MYSTICMIGHT = false;
		p.RETRIBUTION = false;
		p.REDEMPTION = false;
		p.SMITE = false;
		p.CHILVALRY = false;
		p.PIETY = false;
		//p.getActionSender().dunno(168,5);
		p.getActionSender().sendConfig(1395, 0);
		p.getActionSender().sendConfig(1396, 0);
		p.getActionSender().sendConfig(173, 1);
		p.getActionSender().dunno(182,0);
		p.getActionSender().dunno(181,0);
		p.getActionSender().dunno(695,0);
		p.PrayerON = false;
		p.getHeadIcons().getPrayerIcon(p);
		p.getUpdateFlags().setAppearanceUpdateRequired(true);
		p.drainRate = 0;
	}


	public void QuickPrayerConfig(Player pl) {
		int drainRate = 0;
		if(pl.QuickTHICKSKIN == true)
			drainRate += 1;
		if(pl.QuickBURSTOFSTRENGHT == true)
			drainRate += 2;
		if(pl.QuickCLARITYOFTHOUGHT == true)
			drainRate += 4;
		if(pl.QuickSHARPEYE == true)
			drainRate += 262144;
		if(pl.QuickMYSTICWILL == true)
			drainRate += 524288;
		if(pl.QuickROCKSKIN == true)
			drainRate += 8;
		if(pl.QuickSUPERHUMANSTRENGHT == true)
			drainRate += 16;
		if(pl.QuickIMPROVEDREFLEXES == true)
			drainRate += 32;
		if(pl.QuickRAPIDRESTORE == true)
			drainRate += 64;
		if(pl.QuickRAPIDHEAL == true)
			drainRate += 128;
		if(pl.QuickPROTECTITEM == true)
			drainRate += 256;
		if(pl.QuickHAWKEYE == true)
			drainRate += 1048576;
		if(pl.QuickMYSTICLORE == true)
			drainRate += 2097152;
		if(pl.QuickSTEELSKIN == true)
			drainRate += 512;
		if(pl.QuickULTIMATESTRENGHT == true)
			drainRate += 1024;
		if(pl.QuickINCREDIBLEREFLEXES == true)
			drainRate += 2048;
		if(pl.QuickPROTECTFROMSUMMONING == true)
			pl.drainRate += 16777216;
		if(pl.QuickPROTECTFROMMAGIC == true)
			drainRate += 4096;
		if(pl.QuickPROTECTFROMMISSELES == true)
			pl.drainRate += 8192;
		if(pl.QuickPROTECTFROMMELEE == true)
			drainRate += 16384;
		if(pl.QuickEAGLEEYE == true)
			drainRate += 4194304;
		if(pl.QuickMYSTICMIGHT == true)
			drainRate += 8388608;
		if(pl.QuickRETRIBUTION == true)
			drainRate += 32768;
		if(pl.QuickREDEMPTION == true)
			drainRate += 65536;
		if(pl.QuickSMITE == true)
			drainRate += 131072;
		if(pl.QuickCHILVALRY == true)
			drainRate += 33554432;
		if(pl.QuickPIETY == true)
			drainRate += 67108864;
		pl.getActionSender().sendConfig(1397, drainRate);
	}

	public void PrayerConfig(Player pl) {
		int q = 0;
		pl.drainRate = 0;
		if(pl.THICKSKIN == true) {
			q = 1;
			pl.drainRate += 3;
		}
		int w = 0;
		if(pl.BURSTOFSTRENGHT == true) {
			w = 2;
			pl.drainRate += 4;
		}
		int e = 0;
		if(pl.CLARITYOFTHOUGHT == true) {
			e = 4;
			pl.drainRate += 5;
		}
		int r = 0;
		if(pl.SHARPEYE == true) {
			r = 262144;
			pl.drainRate += 6;
		}
		int t = 0;
		if(pl.MYSTICWILL == true) {
			t = 524288;
			pl.drainRate += 7;
		}
		int y = 0;
		if(pl.ROCKSKIN == true) {
			y = 8;
			pl.drainRate += 8;
		}
		int u = 0;
		if(pl.SUPERHUMANSTRENGHT == true) {
			u = 16;
			pl.drainRate += 9;
		}
		int i = 0;
		if(pl.IMPROVEDREFLEXES == true) {
			i = 32;
			pl.drainRate += 10;
		}
		int o = 0;
		if(pl.RAPIDRESTORE == true) {
			o = 64;
			pl.drainRate += 6;
		}
		int p = 0;
		if(pl.RAPIDHEAL == true) {
			p = 128;
			pl.drainRate += 7;
		}
		int a = 0;
		if(pl.PROTECTITEM == true) {
			a = 256;
			pl.drainRate += 6;
		}
		int s = 0;
		if(pl.HAWKEYE == true) {
			s = 1048576;
			pl.drainRate += 12;
		}
		int d = 0;
		if(pl.MYSTICLORE == true) {
			d = 2097152;
			pl.drainRate += 13;
		}
		int f = 0;
		if(pl.STEELSKIN == true) {
			f = 512;
			pl.drainRate += 14;
		}
		int g = 0;
		if(pl.ULTIMATESTRENGHT == true) {
			g = 1024;
			pl.drainRate += 15;
		}
		int h = 0;
		if(pl.INCREDIBLEREFLEXES == true) {
			h = 2048;
			pl.drainRate += 16;
		}
		int j = 0;
		if(pl.PROTECTFROMSUMMONING == true) {
			j = 16777216;
			pl.drainRate += 17;
		}
		int k = 0;
		if(pl.PROTECTFROMMAGIC == true) {
			k = 4096;
			pl.drainRate += 18;
		}
		int l = 0;
		if(pl.PROTECTFROMMISSELES == true) {
			l = 8192;
			pl.drainRate += 19;
		}
		int ç = 0;
		if(pl.PROTECTFROMMELEE == true) {
			ç = 16384;
			pl.drainRate += 20;
		}
		int z = 0;
		if(pl.EAGLEEYE == true) {
			z = 4194304;
			pl.drainRate += 21;
		}
		int x = 0;
		if(pl.MYSTICMIGHT == true) {
			x = 8388608;
			pl.drainRate += 22;
		}
		int c = 0;
		if(pl.RETRIBUTION == true) {
			c = 32768;
			pl.drainRate += 23;
		}
		int v = 0;
		if(pl.REDEMPTION == true) {
			v = 65536;
			pl.drainRate += 24;
		}
		int b = 0;
		if(pl.SMITE == true) {
			b = 131072;
			pl.drainRate += 15;
		}
		int n = 0;
		if(pl.CHILVALRY == true) {
			n = 33554432;
			pl.drainRate += 26;
		}
		int m = 0;
		if(pl.PIETY == true) {
			m = 67108864;
			pl.drainRate += 28;
		}
		int PrayerConfig = q+w+e+r+t+y+u+i+o+p+a+s+d+f+g+h+j+k+l+ç+z+x+c+v+b+n+m;
		pl.getActionSender().sendConfig(1395, PrayerConfig);
		if (PrayerConfig == 0) {
			PrayerOff(pl);
		}
	}
}

