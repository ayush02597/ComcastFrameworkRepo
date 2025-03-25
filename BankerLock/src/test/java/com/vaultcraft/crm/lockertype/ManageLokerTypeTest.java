package com.vaultcraft.crm.lockertype;

import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.objectrepository.Home;
import bms.crm.objectrepository.Managelocker;

public class ManageLokerTypeTest extends BaseClass {
	@Test

	public void manageLocker() throws Throwable {
		String expLockerpgnm = elib.getDataFromExcel("vaultcraftsendtoend", 24, 7);
		String searchdata = elib.getDataFromExcel("vaultcraftsendtoend", 25, 4);
		Home hp = new Home(driver);
		hp.getLokertypeModule().click();
		;

		Managelocker ml = new Managelocker(driver);
		ml.getManagelocker().click();
		String actpgnm = ml.getManagelockerpg().getText();
		System.out.println(" actual " + actpgnm + " expected " + expLockerpgnm);
		Assert.assertEquals(actpgnm, expLockerpgnm);

		ml.getSearchtxt().sendKeys(searchdata);

	}

}
