package com.vaultcraft.crm.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;

import bms.crm.objectrepository.ContactUs;
import bms.crm.objectrepository.Home;

public class ContactUsTest extends BaseClass {
	@Test
	public void verifyAboutUs() throws Throwable {
		String exppgnm = elib.getDataFromExcel("vaultcraftsendtoend", 59, 7);

		Home hp = new Home(driver);
		hp.getPagesModule().click();

		ContactUs as = new ContactUs(driver);
		as.getContactUsBtn().click();

		String actpgnm = as.getContactUsPg().getText();
		System.out.println(" actual " + actpgnm + " expected " + exppgnm);
		Assert.assertEquals(actpgnm, exppgnm);

	}

}
