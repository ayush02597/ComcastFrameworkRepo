package com.vaultcraft.crm.subbanker;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.Home;
import bms.crm.objectrepository.ManageSubBanker;

public class ManageSubBankerTest extends BaseClass {
	@Test
	public void verifyTitle() throws Throwable {
		String exptit = elib.getDataFromExcel("vaultcraftsendtoend", 15, 7);
		Home hp = new Home(driver);
		hp.getSubbankermodule().click();

		ManageSubBanker msb = new ManageSubBanker(driver);
		msb.getManagebtn().click();
		Thread.sleep(2000);
		String actwebtitle = driver.getTitle();
		System.out.println("actual" + actwebtitle);
		String actTitle = msb.getpageTitle().getText();
		System.out.println("expected " + exptit + " actual " + actTitle);
		Assert.assertEquals(exptit, actTitle);

	}

}
