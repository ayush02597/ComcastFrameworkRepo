package com.vaultcraft.crm.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.Home;
import bms.crm.objectrepository.SearchReport;

public class SearchReportTest extends BaseClass {
	@Test
	public void searchReport() throws Throwable {
		String exppgnm = elib.getDataFromExcel("vaultcraftsendtoend", 52, 7);
		String lokernm = elib.getDataFromExcel("vaultcraftsendtoend", 53, 4);

		Home hp = new Home(driver);
		hp.getReportsModule().click();

		SearchReport sr = new SearchReport(driver);
		sr.getSearchReportbtn().click();
		String actpgnm = sr.getSearchReportPg().getText();
		System.out.println(" actual " + actpgnm + " expected " + exppgnm);
		Assert.assertEquals(actpgnm, exppgnm);

		sr.getSearchreporttxt().sendKeys(lokernm);
		sr.getSubmitbtn().click();
	}

}
