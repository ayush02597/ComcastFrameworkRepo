package com.vaultcraft.crm.assignlocker;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.Home;
import bms.crm.objectrepository.ManageAssignLocker;

public class ManageAssignLockerTest extends BaseClass {
	@Test
	public void manageAssLocker() throws Throwable {
		String expManageAssignpgnm = elib.getDataFromExcel("vaultcraftsendtoend", 44, 7);
		String searchLocker = elib.getDataFromExcel("vaultcraftsendtoend", 45, 4);

		Home hp = new Home(driver);
		hp.getAssignLokerModule().click();
		;

		ManageAssignLocker msl = new ManageAssignLocker(driver);
		msl.getManageAsignLokerbtn().click();
		String actmsg = msl.getManageAssignlokerpg().getText();
		System.out.println("actual " + actmsg + " expected ");
		Assert.assertEquals(actmsg, expManageAssignpgnm);

		msl.getSearchtxtfld().sendKeys(searchLocker);
	}

}
