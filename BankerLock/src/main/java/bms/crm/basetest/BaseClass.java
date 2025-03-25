package bms.crm.basetest;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import bms.crm.generic.databaseutility.Database;
import bms.crm.generic.fileutility.ExcelUtility;
import bms.crm.generic.fileutility.FileUtility;
import bms.crm.generic.webdriverutility.JavaUtility;
import bms.crm.generic.webdriverutility.WebDriverUtility;
import bms.crm.objectrepository.Home;
import bms.crm.objectrepository.Login;

public class BaseClass {
	public WebDriver driver = null;
	public Database dbLib = new Database();
	public FileUtility fLib = new FileUtility();
	public WebDriverUtility wdUtil = new WebDriverUtility();

	public ExcelUtility elib = new ExcelUtility();
	public JavaUtility jlib = new JavaUtility();
	public static WebDriver sdriver = null;

	
	@BeforeSuite
	public void configBS() throws SQLException {
		System.out.println("===connect to DB, Report config===");
		dbLib.getdbconnection();

		
	}

	@Parameters("Browser")
	@BeforeClass
	public void configBC(@Optional("chrome") String browser) throws Throwable {
		System.out.println("==Launch the Broweser===");
		String Browser = browser;
		// fLib.getDataFromPropertyFile("browser");
		// driver condition
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		} else
			driver = new ChromeDriver();
		wdUtil.waitForPageToLoad(driver);
		sdriver = driver;
	}

	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("==Login==");
		String Url = fLib.getDataFromPropertyFile("url");
		String Username = fLib.getDataFromPropertyFile("username");
		String password = fLib.getDataFromPropertyFile("password");
		Login lp = new Login(driver);
		lp.loginToapp(Url, Username, password);
	}

	@AfterMethod
	public void configAM() throws InterruptedException {
		System.out.println("==Logout==");
		Home hp = new Home(driver);
		hp.logout();
	}

	@AfterClass
	public void configAC() {
		System.out.println("==Close the Browser");
		driver.quit();
	}

	@AfterSuite
	public void configAS() throws SQLException {
		System.out.println("Close the Connection with DB");
		dbLib.closeConnection();

	
	}

}
