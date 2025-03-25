package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managelocker {
	WebDriver driver;

	public Managelocker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='manage-lockertype.php']")
	private WebElement managelocker;

	@FindBy(xpath = "//h1[text()='Manage Locker Type']")
	private WebElement managelockerpg;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	private WebElement searchtxt;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getManagelocker() {
		return managelocker;
	}

	public WebElement getManagelockerpg() {
		return managelockerpg;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

}
