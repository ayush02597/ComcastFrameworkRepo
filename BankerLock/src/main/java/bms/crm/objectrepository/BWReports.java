package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BWReports {
	WebDriver driver;

	public BWReports(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='bwdates-report-ds.php']")
	private WebElement bwDatesbtn;

	@FindBy(xpath = "//h1[text()='B/w Dates Report Date Selection']")
	private WebElement dateSelPg;
	@FindBy(id = "fromdate")
	private WebElement fromdate;
	@FindBy(id = "todate")
	private WebElement todate;
	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBwDatesbtn() {
		return bwDatesbtn;
	}

	public WebElement getDateSelPg() {
		return dateSelPg;
	}

	public WebElement getFromdate() {
		return fromdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
