package bms.crm.objectrepository;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSubBanker {
	WebDriver driver;

	public ManageSubBanker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='manage-subadmins.php']")
	private WebElement managebtn;

	@FindBy(xpath = "//h1[text()='Manage Sub Banker']")
	private WebElement pageTittle;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	private WebElement searchtxt;

	@FindBy(xpath = "//h3[text()='Sub Banker Details']")
	private WebElement subBankerDetails;

	public WebElement getSubBankerDetails() {
		return subBankerDetails;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getManagebtn() {
		return managebtn;
	}

	public WebElement getpageTitle() {
		return pageTittle;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public void subbankerTitle() {
		managebtn.click();
	}

	public void searchSubbanker(String subBank) {
		managebtn.click();
		searchtxt.sendKeys(subBank);

	}

}
