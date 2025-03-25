package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bms.crm.generic.webdriverutility.WebDriverUtility;

public class Login extends WebDriverUtility {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement usernamedt;

	@FindBy(name = "inputpwd")
	private WebElement pwddt;

	@FindBy(name = "login")
	private WebElement loginbtn;

	public WebElement getUsernamedt() {
		return usernamedt;
	}

	public void setUsernamedt(WebElement usernamedt) {
		this.usernamedt = usernamedt;
	}

	public WebElement getPwddt() {
		return pwddt;
	}

	public void setPwddt(WebElement pwddt) {
		this.pwddt = pwddt;
	}

	public WebElement getLogindt() {
		return loginbtn;
	}

	public void setLogindt(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void loginToapp(String url, String username, String password) {
		waitForPageToLoad(driver);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
		usernamedt.sendKeys(username);
		pwddt.sendKeys(password);
		loginbtn.click();
	}

}
