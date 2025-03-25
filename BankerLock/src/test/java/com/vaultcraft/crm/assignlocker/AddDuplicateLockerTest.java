package com.vaultcraft.crm.assignlocker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import bms.crm.basetest.BaseClass;
import bms.crm.generic.webdriverutility.WebDriverUtility;
import bms.crm.objectrepository.AddAsignLoker;
import bms.crm.objectrepository.Home;

public class AddDuplicateLockerTest extends BaseClass {
	@Test
	public void addAssignLocker() throws Throwable {
		String expAssignpgnm = elib.getDataFromExcel("vaultcraftsendtoend", 27, 7);
		String name = elib.getDataFromExcel("vaultcraftsendtoend", 28, 4);
		String email = elib.getDataFromExcel("vaultcraftsendtoend", 29, 4);
		String mobile = elib.getDataFromExcel("vaultcraftsendtoend", 30, 4);
		String address = elib.getDataFromExcel("vaultcraftsendtoend", 31, 4);
		String occupt = elib.getDataFromExcel("vaultcraftsendtoend", 32, 4);
		String lokerType = elib.getDataFromExcel("vaultcraftsendtoend", 33, 4);
		String lokernm = elib.getDataFromExcel("vaultcraftsendtoend", 34, 4) + jlib.getRandomNumber();
		String keynm = elib.getDataFromExcel("vaultcraftsendtoend", 35, 4) + jlib.getRandomNumber();
		String instrction = elib.getDataFromExcel("vaultcraftsendtoend", 36, 4);
		String nominee = elib.getDataFromExcel("vaultcraftsendtoend", 37, 4);
		String nomineeRelat = elib.getDataFromExcel("vaultcraftsendtoend", 38, 4);
		String valuableDetl = elib.getDataFromExcel("vaultcraftsendtoend", 39, 4);
		String chooseId = elib.getDataFromExcel("vaultcraftsendtoend", 40, 4);
		Home hp = new Home(driver);
		hp.getAssignLokerModule().click();

		AddAsignLoker aal = new AddAsignLoker(driver);
		aal.getAddAsignLoker().click();

		String actAssignpg = aal.getAssignlokerpg().getText();
		System.out.println("actual " + actAssignpg + " expected " + expAssignpgnm);
		Assert.assertEquals(actAssignpg, expAssignpgnm);

		aal.getFullnametxt().sendKeys(name);
		aal.getEmailtxt().sendKeys(email);
		aal.getMobiletxt().sendKeys(mobile);
		aal.getAddressfld().sendKeys(address);
		aal.getOccpttxt().sendKeys(occupt);
		WebElement size = aal.getLockersizeSelct();
		Select sel = new Select(size);
		sel.selectByValue(lokerType);
		aal.getLocknumtxt().sendKeys(lokernm);
		aal.getKeynumtxt().sendKeys(keynm);
		aal.getInstructiontxt().sendKeys(instrction);
		aal.getValuabledtlTxt().sendKeys(valuableDetl);
		aal.getNomineetxt().sendKeys(nominee);
		aal.getNomineRelatntxt().sendKeys(nomineeRelat);
		WebElement id = aal.getChoseId();
		Select selId = new Select(id);
		selId.selectByValue(chooseId);
		aal.getUploadId().sendKeys("C:\\Users\\HP\\git\\repository4\\BankerLock\\Test Data\\photo.png");
		aal.getUploadPhoto().sendKeys("C:\\Users\\HP\\git\\repository4\\BankerLock\\Test Data\\photo.png");
		aal.getStatusCheck().click();
		aal.getSubmitbtn();
		Thread.sleep(3000);
		WebDriverUtility wdu = new WebDriverUtility();
		wdu.alertAccept(driver);

	}

}
