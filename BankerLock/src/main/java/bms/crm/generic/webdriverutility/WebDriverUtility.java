package bms.crm.generic.webdriverutility;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void waitForElementPresent(WebDriver driver, WebDriver element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf((WebElement) element));

	}

	public void switchNewBrowserTab(WebDriver driver, String partialURL) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String winndowID = it.next();
			driver.switchTo().window(winndowID);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(partialURL)) {
				break;

			}
		}
	}

	public void switchNewBrowserTabonTitle(WebDriver driver, String partialTittle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String winndowID = it.next();
			driver.switchTo().window(winndowID);

			String actUrl = driver.getTitle();
			if (actUrl.contains(partialTittle)) {
				break;

			}
		}
	}

	public void switchtoFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchtoFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	public void switchtoFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchtoAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchtoAlertAndDismis(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void switchtoAlertAndSendData(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
		;
	}

	public void selectByText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void deSelectByText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}

	public void deSelectAll(WebElement element) {
		Select sel = new Select(element);
		sel.deselectAll();
	}

	public void mousemoveonElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	public void mousemovebyoffset(WebDriver driver, int x, int y) {
		Actions act = new Actions(driver);
		act.moveByOffset(x, y).perform();
	}

	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();

	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();

	}

	public void dragNDrop(WebDriver driver, WebElement element, WebElement element2) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element2).perform();
	}

	public void dragNDrop(WebDriver driver, WebElement element, int x, int y) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(element, x, y).perform();

	}

	public void alertAccept(WebDriver driver) {
		// Alert ref= new Alert(element) ;
		driver.switchTo().alert().accept();

	}

	public void sendKeys(WebDriver driver, String keysToSend) {
		driver.switchTo().alert().sendKeys(keysToSend);
	}

	public void dismiss() {

	}
}