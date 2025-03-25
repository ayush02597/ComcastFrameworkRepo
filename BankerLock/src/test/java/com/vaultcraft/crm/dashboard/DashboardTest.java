package com.vaultcraft.crm.dashboard;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;

import bms.crm.objectrepository.Dashboard;
import bms.crm.objectrepository.Home;

public class DashboardTest extends BaseClass {
	@Test
	public void verifyAboutUs() throws Throwable {
		String exppgnm = elib.getDataFromExcel("vaultcraftsendtoend", 65, 7);

		Home hp = new Home(driver);
		hp.getDashboardModule().click();

		Dashboard db = new Dashboard(driver);

		String actpgnm = db.getDashboardPg().getText();
		System.out.println(" actual " + actpgnm + " expected " + exppgnm);
		Assert.assertEquals(actpgnm, exppgnm);

	}

}
