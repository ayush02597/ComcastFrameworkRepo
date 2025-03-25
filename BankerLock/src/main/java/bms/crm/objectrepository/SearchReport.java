package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchReport {

	WebDriver driver;

	public SearchReport(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[text()='Search Report']")
	private WebElement searchReportbtn;

	@FindBy(xpath = "//h1[text()='Search Report']")
	private WebElement searchReportPg;

	@FindBy(id = "searchinput")
	private WebElement searchreporttxt;
	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchReportbtn() {
		return searchReportbtn;
	}

	public WebElement getSearchReportPg() {
		return searchReportPg;
	}

	public WebElement getSearchreporttxt() {
		return searchreporttxt;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
