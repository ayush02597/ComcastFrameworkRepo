package bms.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAsignLoker {
	WebDriver driver;

	public AddAsignLoker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='add-locker-form.php']")
	private WebElement addAsignLoker;

	@FindBy(xpath = "//h1[text()='Add Locker Form']")
	private WebElement assignlokerpg;

	@FindBy(id = "ahname")
	private WebElement fullnametxt;
	@FindBy(id = "emailid")
	private WebElement emailtxt;
	@FindBy(id = "mobilenumber")
	private WebElement mobiletxt;
	@FindBy(name = "comadd")
	private WebElement addressfld;

	@FindBy(id = "occupation")
	private WebElement occpttxt;
	@FindBy(id = "lockersize")
	private WebElement lockersizeSelct;
	@FindBy(id = "lockernum")
	private WebElement locknumtxt;
	@FindBy(id = "keynum")
	private WebElement keynumtxt;
	@FindBy(id = "nomineename")
	private WebElement nomineetxt;
	@FindBy(name = "instruction")
	private WebElement instructiontxt;
	@FindBy(id = "nomineerelation")
	private WebElement nomineRelatntxt;
	@FindBy(id = "status")
	private WebElement statusCheck;
	@FindBy(name = "valuabledetails")
	private WebElement valuabledtlTxt;
	@FindBy(name = "idcard")
	private WebElement choseId;
	@FindBy(id = "addressproof")
	private WebElement uploadId;
	@FindBy(id = "photo")
	private WebElement uploadPhoto;
	@FindBy(id = "submit")
	private WebElement submitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddAsignLoker() {
		return addAsignLoker;
	}

	public WebElement getAssignlokerpg() {
		return assignlokerpg;
	}

	public WebElement getFullnametxt() {
		return fullnametxt;
	}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getMobiletxt() {
		return mobiletxt;
	}

	public WebElement getAddressfld() {
		return addressfld;
	}

	public WebElement getOccpttxt() {
		return occpttxt;
	}

	public WebElement getLockersizeSelct() {
		return lockersizeSelct;
	}

	public WebElement getLocknumtxt() {
		return locknumtxt;
	}

	public WebElement getKeynumtxt() {
		return keynumtxt;
	}

	public WebElement getNomineetxt() {
		return nomineetxt;
	}

	public WebElement getNomineRelatntxt() {
		return nomineRelatntxt;
	}

	public WebElement getInstructiontxt() {
		return instructiontxt;
	}

	public WebElement getChoseId() {
		return choseId;
	}

	public WebElement getStatusCheck() {
		return statusCheck;
	}

	public WebElement getValuabledtlTxt() {
		return valuabledtlTxt;
	}

	public WebElement getUploadPhoto() {
		return uploadPhoto;

	}

	public WebElement getUploadId() {
		return uploadId;

	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
