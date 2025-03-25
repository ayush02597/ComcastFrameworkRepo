package com.vaultcraft.crm.lockertype;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.generic.webdriverutility.WebDriverUtility;
import bms.crm.objectrepository.AddLockerType;
import bms.crm.objectrepository.Home;

public class AddLockerTypeTest extends BaseClass {
	@Test
	public void addLocker() throws Throwable {
		String expLockerpgnm = elib.getDataFromExcel("vaultcraftsendtoend", 18, 7);
		String lockerprice = elib.getDataFromExcel("vaultcraftsendtoend", 20, 4) + jlib.getRandomNumber();
		String lockersize = elib.getDataFromExcel("vaultcraftsendtoend", 19, 4);

		Home hp = new Home(driver);
		hp.getLokertypeModule().click();

		AddLockerType alt = new AddLockerType(driver);
		alt.getAddlocker().click();
		String actlockerpg = alt.getLockerpage().getText();
		System.out.println("actual " + actlockerpg + " expected " + expLockerpgnm);
		Assert.assertEquals(actlockerpg, expLockerpgnm);

		WebElement size = alt.getLockersize();
		// Select sel = new Select(size);
		// sel.selectByValue(lockersize);*/
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.selectByValue(size, lockersize);

		alt.getLockerPrice().sendKeys(lockerprice);
		alt.getSubmitbtn().click();

		wdu.alertAccept(driver);
	}

}
