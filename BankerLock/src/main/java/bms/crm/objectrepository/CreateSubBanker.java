package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSubBanker {
	WebDriver driver;

	public CreateSubBanker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='add-subadmin.php']")
	private WebElement addSubbankerBtn;

	@FindBy(id = "sadminusername")
	private WebElement subAdminUser;

	@FindBy(id = "fullname")
	private WebElement fullnametxt;

	@FindBy(id = "emailid")
	private WebElement emailtxt;

	@FindBy(id = "mobilenumber")
	private WebElement mobilenotxt;

	@FindBy(id = "inputpwd")
	private WebElement pwdTxtfld;

	public WebElement getAddSubbankerBtn() {
		return addSubbankerBtn;
	}

	public WebElement getSubAdminUser() {
		return subAdminUser;
	}

	public WebElement getFullnametxt() {
		return fullnametxt;
	}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getMobilenotxt() {
		return mobilenotxt;
	}

	public WebElement getPwdTxtfld() {
		return pwdTxtfld;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	@FindBy(id = "submit")
	private WebElement submitbtn;

	public void createSubBanker(String user, String name, String email, String mobile, String pwd) throws Throwable {
		subAdminUser.sendKeys(user);
		fullnametxt.sendKeys(name);
		emailtxt.sendKeys(email);
		mobilenotxt.sendKeys(mobile);
		pwdTxtfld.sendKeys(pwd);
		Thread.sleep(1000);
		submitbtn.click();
	}
}
