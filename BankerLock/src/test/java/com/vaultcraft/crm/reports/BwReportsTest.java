package com.vaultcraft.crm.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.generic.webdriverutility.JavaUtility;
import bms.crm.objectrepository.BWReports;
import bms.crm.objectrepository.Home;

public class BwReportsTest extends BaseClass {
	@Test
	public void bwReports() throws Throwable {
		String exppgnm = elib.getDataFromExcel("vaultcraftsendtoend", 46, 7);

		Home hp = new Home(driver);
		hp.getReportsModule().click();

		BWReports bwr = new BWReports(driver);
		bwr.getBwDatesbtn().click();
		String actPg = bwr.getDateSelPg().getText();
		System.out.println(" actual " + actPg);
		Assert.assertEquals(actPg, exppgnm);

		JavaUtility ju = new JavaUtility();
		String reqdt = ju.getRequiredDateDDmmYYYY(-30);
		String todt = ju.getSystemDateDDmmYYYY();
		bwr.getFromdate().sendKeys(reqdt);
		bwr.getTodate().sendKeys(todt);

		bwr.getSubmitbtn().click();

	}
}