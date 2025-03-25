package com.vaultcraft.crm.subbanker;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.Home;
import bms.crm.objectrepository.ManageSubBanker;

public class SearchSubBaker extends BaseClass {
	@Test
	public void searchsubBanker() throws Throwable {
		String searchnm = elib.getDataFromExcel("vaultcraftsendtoend", 16, 4);
		String expagename = elib.getDataFromExcel("vaultcraftsendtoend", 16, 7);
		Home hp = new Home(driver);
		hp.getSubbankermodule().click();

		ManageSubBanker msb = new ManageSubBanker(driver);
		msb.getManagebtn().click();
		msb.getSearchtxt().sendKeys(searchnm);
		Thread.sleep(2000);
		String details = msb.getSubBankerDetails().getText();
		System.out.println(details);
		System.out.println(expagename);

		// Assert.assertTrue((details.equals("Sub Banker Details")),"Something is
		// missing------------------------------");
		Assert.assertEquals(details, expagename);

	}
}
