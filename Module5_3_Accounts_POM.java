package pages;

import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import Utilities.ObjectRepo;
import Utilities.commonLib;

public class Module5_3_Accounts_POM {

	String Random = RandomStringUtils.randomNumeric(5);
	String TestAccountType = "TestAccountType" + Random;
	String TestAccountName = "TestAccountName" + Random;

	@FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
	private WebElement ClickDropdownHomePage;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon css-1ylescl']")
	private WebElement quickActionsOnHomePage;
	@FindBy(xpath = "(//div[@title='New Jurisdiction64934'])[1]")
	public WebElement TitleJurisdiction;
	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;
	@FindBy(xpath = "//*[text()='SET UP JURISDICTION ACCOUNTS']")
	private WebElement SetupJurisdictionAccountsOption;
	@FindBy(xpath = "//*[text()='Set Up Jurisdiction Accounts']")
	public WebElement headingOfSetupJurisdictionPage;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Submit']")
	public WebElement AddNewAccountButton;
	@FindBy(xpath = "//*[text()='Add New Jurisdiction Accounts']")
	public WebElement AddNewPageHeader;
	@FindBy(xpath = "//*[@id='accountType']")
	public WebElement AccountTypeTextBox;
	@FindBy(xpath = "//input[@name='accountNameLangEnglish']")
	public WebElement AccountNameTextBox;
	@FindBy(xpath = "//*[@data-testid='submitBtn']")
	public WebElement SubmitbuttononAddNewAccount;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	public WebElement ContinueButtononAddNewAccount;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[1]")
	public WebElement AddedAccountName;
	@FindBy(xpath = "//*[text()='Manage Jurisdiction Accounts']")
	public WebElement headingOfManageJurisdictionAccountsPage;
	@FindBy(xpath = "//*[text()='Read more']")
	public WebElement ReadMoreButton;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[2]")
	public WebElement ClosebuttonMessage;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ParaToastMessage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	public WebElement HeaderTostMessageHeading;
	@FindBy(xpath = "//*[@data-testid='more-actions']")
	public WebElement MoreActionsButton;
	@FindBy(xpath = "//*[text()='ADD NEW ACCOUNT']")
	public WebElement AddNewButton;

	public static String linkedstatus;
	public static commonLib CommonLibref = new commonLib();

	public Module5_3_Accounts_POM() {
		PageFactory.initElements(driver.get(), this);
	}

	public void expandAllJurisdictionsOnHomePage() {
		// wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		CommonLibref.click(ClickDropdownHomePage, "javascriptClick", "ClickDropdownHomePage");
		// ClickDropdownHomePage.click();
		ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
		System.out.println("Click on All Jurisdictions");

	}

	public void selectJurisdictionOtherThanOnboarding() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
//		homepageSearchOption.sendKeys("New Jurisdiction64934");
//		System.out.println("Enter Jurisdiction Name =" + "New Jurisdiction64934");
	}

	public void setupJurisdictionAccountsOptionFromQuickActions() {
	    wait.until(ExpectedConditions.elementToBeClickable(SetupJurisdictionAccountsOption));
	    CommonLibref.click(SetupJurisdictionAccountsOption, "javascriptClick", "SetupJurisdictionAccountsOption");
	    ObjectRepo.test.log(Status.PASS, "Step: Click on Setup Jurisdiction Account");
	    System.out.println("Select Manage Jurisdiction Status");
	}
	
	public void assertionOfSetupJurisdictionAccount() {
		wait.until(ExpectedConditions.visibilityOf(headingOfSetupJurisdictionPage));
		WebElement element = headingOfSetupJurisdictionPage;
		Boolean value = element.isDisplayed();
		wait.until(ExpectedConditions.visibilityOf(headingOfSetupJurisdictionPage));
		// Thread.sleep(6000);
		String acualtext1 = headingOfSetupJurisdictionPage.getText();
		System.out.println(acualtext1);
		Assert.assertEquals(acualtext1, "Set Up Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Status page is displayed");
		System.out.println("Setup Jurisdiction Accounts page is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(AddNewAccountButton));
		CommonLibref.click(AddNewAccountButton, "javascriptClick", "AddNewAccountButton");
	}

	public void addNewAccountButton() {
		wait.until(ExpectedConditions.visibilityOf(AddNewPageHeader));
		System.out.println(AddNewPageHeader.getText());
		AccountTypeTextBox.sendKeys(TestAccountType);
		AccountNameTextBox.sendKeys(TestAccountName);
		AccountNameTextBox.sendKeys(Keys.ENTER);
		CommonLibref.click(ReadMoreButton, "moveToElementClick", "ReadMoreButton");
		// ReadMoreButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(SubmitbuttononAddNewAccount));
		CommonLibref.click(SubmitbuttononAddNewAccount, "moveToElementClick", "SubmitbuttononAddNewAccount");
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButtononAddNewAccount));
		CommonLibref.click(ContinueButtononAddNewAccount, "moveToElementClick", "ContinueButtononAddNewAccount");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.elementToBeClickable(ClosebuttonMessage));
		wait.until(ExpectedConditions.visibilityOf(HeaderTostMessageHeading));
		System.out.println(HeaderTostMessageHeading.getText());
		System.out.println(ParaToastMessage.getText());
		CommonLibref.click(ClosebuttonMessage, "moveToElementClick", "ClosebuttonMessage");
		// ClosebuttonMessage.click();
		ObjectRepo.test.log(Status.PASS, "New Default Account is added");
	}

	public void searchonDefaultAccount() {
		wait.until(ExpectedConditions.visibilityOf(headingOfManageJurisdictionAccountsPage));
		System.out.println(headingOfManageJurisdictionAccountsPage.getText());
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid='CloseIcon'])[2]"))).click();
		
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(TestAccountType);
		System.out.println(AddedAccountName.getText() + " is displayed");
		Assert.assertEquals(TestAccountType, AddedAccountName.getText());
		ObjectRepo.test.log(Status.PASS, "New Default Account is displayed in Manage Jurisdiction Accounts page");
	}

	public void selectOnboardingJurisdiction(String JurisdictionName) {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(JurisdictionName);
		System.out.println("Enter Jurisdiction Name =" + JurisdictionName);
	}
}
