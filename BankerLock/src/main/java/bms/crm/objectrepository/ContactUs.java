package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	WebDriver driver;

	public ContactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Contact us']")
	private WebElement contactUsBtn;

	@FindBy(xpath = "//h1[text()='Contact us']")
	private WebElement contactUsPg;

	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactUsBtn() {
		return contactUsBtn;
	}

	public WebElement getContactUsPg() {
		return contactUsPg;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
}
