package bms.crm.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Dashboard')]")
	private WebElement dashboardModule;

	@FindBy(xpath = "//p[contains(text(),'Sub-Banker')]")
	private WebElement subbankermodule;

	@FindBy(xpath = "//p[contains(text(),'Locker Type')]")
	private WebElement lokertypeModule;

	@FindBy(xpath = "//p[contains(text(),'Assign Locker')]")
	private WebElement assignLokerModule;

	@FindBy(xpath = "//p[contains(text(),'Reports')]")
	private WebElement reportsModule;

	@FindBy(xpath = "//p[contains(text(),'Pages')]")
	private WebElement pagesModule;

	@FindBy(xpath = "//p[contains(text(),'Account Settings')]")
	private WebElement accountsettingModule;

	@FindBy(xpath = "//a[@href=\"manage-subadmins.php\"]")
	private WebElement subadminDashLink;

	@FindBy(xpath = "//a[@href=\"manage-lockertype.php\"]")
	private WebElement listesdlokertypeDashlink;

	@FindBy(xpath = "//a[@href=\"manage-locker-form.php\"] ")
	private WebElement assignedlokerDashlink;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDashboardModule() {
		return dashboardModule;
	}

	public WebElement getSubbankermodule() {
		return subbankermodule;
	}

	public WebElement getLokertypeModule() {
		return lokertypeModule;
	}

	public WebElement getAssignLokerModule() {
		return assignLokerModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getPagesModule() {
		return pagesModule;
	}

	public WebElement getAccountsettingModule() {
		return accountsettingModule;
	}

	public WebElement getSubadminDashLink() {
		return subadminDashLink;
	}

	public WebElement getListesdlokertypeDashlink() {
		return listesdlokertypeDashlink;
	}

	public WebElement getAssignedlokerDashlink() {
		return assignedlokerDashlink;
	}

	public void logout() {
		accountsettingModule.click();
		driver.findElement(By.xpath("//p[text()='Logout']")).click();

	}
}
