package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	WebDriver driver;

	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='About us']")
	private WebElement aboutUsBtn;

	@FindBy(xpath = "//h1[text()='About us']")
	private WebElement aboutUsPg;

	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAboutUsBtn() {
		return aboutUsBtn;
	}

	public WebElement getAboutUsPg() {
		return aboutUsPg;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
