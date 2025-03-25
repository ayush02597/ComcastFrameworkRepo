package com.vaultcraft.crm.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.AboutUs;
import bms.crm.objectrepository.Home;

public class AboutUsTest extends BaseClass {
	@Test
	public void verifyAboutUs() throws Throwable {
		String exppgnm = elib.getDataFromExcel("vaultcraftsendtoend", 55, 7);

		Home hp = new Home(driver);
		hp.getPagesModule().click();

		AboutUs as = new AboutUs(driver);
		as.getAboutUsBtn().click();

		String actpgnm = as.getAboutUsPg().getText();
		System.out.println(" actual " + actpgnm + " expected " + exppgnm);
		Assert.assertEquals(actpgnm, exppgnm);

	}

}
