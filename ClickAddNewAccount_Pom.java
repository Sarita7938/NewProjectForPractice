package pages;

import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import Utilities.ObjectRepo;
import Utilities.commonLib;
import junit.framework.Assert;

public class ClickAddNewAccount_Pom {
	private JavascriptExecutor js;
	private commonLib CommonLibref = new commonLib();

	@FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
	private WebElement ClickDropdownHomePage;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement SearchOnHomePage;

	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;

	@FindBy(xpath = "//*[text()='SET UP JURISDICTION ACCOUNTS']")
	private WebElement SetupJurisdictionAccounts;

	@FindBy(xpath = "//*[text()='ADD NEW ACCOUNT']")
	private WebElement ClickonAddNewButton;

	@FindBy(xpath = "(//*[@aria-label=\"Select row\"])[2]")
	private WebElement ClickonCheckbox;

	@FindBy(xpath = "//*[@aria-label='Unselect all rows']")
	private WebElement SelectAllClickonCheckbox;

	@FindBy(xpath = "//*[@data-testid='cancelBtn']")
	private WebElement ClickonCancelButton;

	@FindBy(xpath = "//*[@data-testid='priv_modal_Cancel']")
	private WebElement CancelOnWarningpopup;

	@FindBy(xpath = "//*[@data-testid='priv_modal_Continue']")
	private WebElement ContinueButtonOnWarningPopup;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-qbgv2a']")
	private WebElement HomePage;

	@FindBy(xpath = "//button[@data-testid='submitBtn']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//*[text()='Add New Jurisdiction Accounts']")
	public WebElement AddNewJurisdictionPageHeader;

	@FindBy(xpath = "//*[text()='Add Jurisdiction Accounts']")
	public WebElement AddJurisdictionAccountsPage;

	public ClickAddNewAccount_Pom() {
		PageFactory.initElements(driver.get(), this);
	}

	public void clickDropdownHomePage() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		CommonLibref.click(ClickDropdownHomePage, "javascriptClick", "ClickDropdownHomePage");
		ObjectRepo.test.log(Status.PASS, "Step 1 : User Selects Dropdown on Home Page");
	}

	public void searchOnHomePage() throws InterruptedException {
		Thread.sleep(1000);
		SearchOnHomePage.sendKeys("Los");
		ObjectRepo.test.log(Status.PASS, "Step 2 : User Searches Jurisdiction on Home Page");
	}

	public void quickActionsOnHomePage() throws InterruptedException {
		js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1700)", "");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
		ObjectRepo.test.log(Status.PASS, "Step 3 : User Selects Quick Action");
	}

	public void setupJurisdictionAccounts() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(SetupJurisdictionAccounts)).click();
//		try {
//			CommonLibref.click(SetupJurisdictionAccounts, "javascriptClick", "SetupJurisdictionAccounts");
//			ObjectRepo.test.log(Status.PASS, "Step 4 : User Selects Setup Jurisdiction Accounts");
//		} catch (Exception e) {
//			CommonLibref.click(SetupJurisdictionAccounts, "moveToElementClick", "SetupJurisdictionAccounts");
//			ObjectRepo.test.log(Status.PASS, "Step 4 : User Selects Setup Jurisdiction Accounts");
//		}
	}

	public void clickonAddNewButton() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ClickonAddNewButton)).click();
			ObjectRepo.test.log(Status.PASS, "Step 5 : User Selects Add New Account");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid=\"more-actions\"]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(ClickonAddNewButton)).click();
			ObjectRepo.test.log(Status.PASS, "Step 5 : User Selects Add New Account");
		}
	}


	public void clickonDefaultAccountButton() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid=\"more-actions\"]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='ADD DEFAULT ACCOUNT']"))).click();
			ObjectRepo.test.log(Status.PASS, "Step 5 : User Selects Add New Account");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(ClickonAddNewButton)).click();
			ObjectRepo.test.log(Status.PASS, "Step 5 : User Selects Add New Account");
		}
	}
	
	public void useronAddNewJurisdictionAccounts() {
		Assert.assertEquals(driver.get()
				.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")).getText(),
				"Add New Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Step 6 : User Verifies Add New Account Page");
	}

	public void clickonCheckbox() throws InterruptedException {
		CommonLibref.pageLoader();
		try {
			CommonLibref.scroll(ClickonCheckbox, "scrollToElement", "ClickonCheckbox");
			Thread.sleep(2000);
//			wait.until(ExpectedConditions.elementToBeClickable(ClickonCheckbox));
			CommonLibref.click(ClickonCheckbox, "javascriptClick", "ClickonCheckbox");
			ObjectRepo.test.log(Status.PASS, "Step 7 : User Clicks on Check Box");
		} catch (Exception e) {
			CommonLibref.scroll(ClickonCheckbox, "scrollToElement", "ClickonCheckbox");
			Thread.sleep(2000);
//			wait.until(ExpectedConditions.elementToBeClickable(ClickonCheckbox));
			CommonLibref.click(ClickonCheckbox, "seleniumClick", "ClickonCheckbox");
			ObjectRepo.test.log(Status.PASS, "Step 7 : User Clicks on Check Box");
		}
	}

	public void selectAllClickonCheckbox() throws InterruptedException {
//    	CommonLibref.scroll(SelectAllClickonCheckbox, "scrollToElement", "SelectAllClickonCheckbox");
		Thread.sleep(2000);
//    	wait.until(ExpectedConditions.elementToBeClickable(SelectAllClickonCheckbox));
		CommonLibref.click(SelectAllClickonCheckbox, "javascriptClick", "SelectAllClickonCheckbox");
		ObjectRepo.test.log(Status.PASS, "Step 8 : User Clicks on Check All Check Box");
	}

	public void clickonCancelButton() throws InterruptedException {
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ClickonCancelButton));
		js.executeScript("arguments[0].click();", ClickonCancelButton);
		Thread.sleep(3000);
		ObjectRepo.test.log(Status.PASS, "Step 9 : User Clicks on Cancel Button");
	}

	public void cancelOnWarningpopup() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(CancelOnWarningpopup));
		js.executeScript("arguments[0].click();", CancelOnWarningpopup);
		ObjectRepo.test.log(Status.PASS, "Step 10 : User Clicks on Cancel Button on Warning Popup");
	}

	public void continueButtonOnWarningPopup() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButtonOnWarningPopup));
		js.executeScript("arguments[0].click();", ContinueButtonOnWarningPopup);
		Thread.sleep(6000);
		AssertJUnit.assertEquals(driver.get()
				.findElement(By.xpath("//h1[@class='MuiTypography-root MuiTypography-h1 css-qbgv2a']")).getText(),
				"Welcome!");
		ObjectRepo.test.log(Status.PASS, "Step 11 : User Clicks on Continue Button on Warning Popup");
	}

	public void homePage() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(HomePage));
		js.executeScript("arguments[0].click();", HomePage);
		ObjectRepo.test.log(Status.PASS, "Step 12 : User Returns to HomePage");
	}

	public void submitButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		try {
			CommonLibref.click(SubmitButton, "moveToElementClick", "SubmitButton");
		} catch (NoSuchElementException e) {
			CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
		} catch (Exception e) {
			SubmitButton.click();
		}
		ObjectRepo.test.log(Status.PASS, "Step 13 : User Clicks on Continue Button");
	}
}
