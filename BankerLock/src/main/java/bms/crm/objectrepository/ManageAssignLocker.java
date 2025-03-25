package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class ManageAssignLocker {
	WebDriver driver;

	public ManageAssignLocker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='manage-locker-form.php'])[1]")
	private WebElement manageAsignLoker;

	@FindBy(xpath = "//h1[text()='Manage Assign Locker']")
	private WebElement manageAssignlokerpg;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	private WebElement searchtxtfld;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getManageAsignLokerbtn() {
		return manageAsignLoker;
	}

	public WebElement getManageAssignlokerpg() {
		return manageAssignlokerpg;
	}

	public WebElement getSearchtxtfld() {
		return searchtxtfld;
	}

}
