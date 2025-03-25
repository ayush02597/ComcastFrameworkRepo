package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLockerType {
	WebDriver driver;

	public AddLockerType(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='add-lockertype.php']")
	private WebElement addlocker;

	@FindBy(xpath = "//h1[text()='Create Locker Type']")
	private WebElement lockerpage;

	@FindBy(id = "lockersize")
	private WebElement lockersize;

	@FindBy(id = "lockerprice")
	private WebElement lockerPrice;

	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddlocker() {
		return addlocker;
	}

	public WebElement getLockerpage() {
		return lockerpage;
	}

	public WebElement getLockersize() {
		return lockersize;
	}

	public WebElement getLockerPrice() {
		return lockerPrice;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
}
