package com.vaultcraft.crm.subbanker;

import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.CreateSubBanker;
import bms.crm.objectrepository.Home;

public class CreateNewSubBanker extends BaseClass {
	@Test
	public void createOrg() throws Throwable {

		// read testscript data from excel file

		String user = elib.getDataFromExcel("vaultcraftsendtoend", 7, 4) + jlib.getRandomNumber();
		String name = elib.getDataFromExcel("vaultcraftsendtoend", 8, 4) + jlib.getRandomNumber();
		String email = elib.getDataFromExcel("vaultcraftsendtoend", 9, 4);
		String mobile = elib.getDataFromExcel("vaultcraftsendtoend", 10, 4);
		String pwd = elib.getDataFromExcel("vaultcraftsendtoend", 11, 4);

		// step 2 navigate to sub-banker module
		Home hp = new Home(driver);
		hp.getSubbankermodule().click();

		// step 3 click on add new sub-banker button
		CreateSubBanker sb = new CreateSubBanker(driver);
		sb.getAddSubbankerBtn().click();

		// step4 enter all the details& create new sub-banker
		CreateSubBanker csb = new CreateSubBanker(driver);
		csb.createSubBanker(user, name, email, mobile, pwd);

		Thread.sleep(2000);
	}

}
