package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.checkerframework.checker.units.qual.s;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

public class Module5_4_Pom {
	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();

	public static String homePage;
	public static String manageJurisdictionAccountsTitlePage;
	public static String editJurisdictionAccountsPage;
	JavascriptExecutor js;
	public static String Prelinkedstatus;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement userIDField;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement PassphraseField;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxRememberMe;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement ManageCronJobs;

	@FindBy(xpath = "//*[@data-testid=\"ExpandMoreIcon\"]")
	private WebElement expandAllJurisdictionsArrow;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;

	@FindBy(xpath = "//input[@data-testid='passphrase']")
	private WebElement passphaseTextField;

	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon;

	// @FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1
	// css-1yfaah8'])[5]")
	// private WebElement selectInitialUser;

	// @FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1
	// css-1yfaah8'])[5]")
//	private WebElement selectManageInitialUser;

	@FindBy(xpath = "//*[contains(text(),'SETUP JURISDICTION ACCOUNTS')]")
	private WebElement selectSetUpJurisdictionAccounts;

	@FindBy(xpath = "//*[text()='SET UP JURISDICTION ACCOUNTS']")
	private WebElement selectSetUpJurisdictionAccounts1;

	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[1]")
	private WebElement accountTypeSpaceXpath;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement manageJurisdictionAccountspagesearch;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1epp0xh']")
	private WebElement rowsperpage;

	@FindBy(xpath = "(//*[contains(text(),'EDIT JURISDICTION ACCOUNT')])")
	private WebElement editJurisdictionAccount;

	@FindBy(xpath = "//*[contains(text(),'DELETE JURISDICTION ACCOUNT')]")
	private WebElement deleteJurisdictionAccount;

	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOption;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-yj408y']")
	private WebElement accounts;

	@FindBy(xpath = "//*[contains(text(),'HOME')]")
	private WebElement homeOption;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement deleteOption2;

	@FindBy(xpath = "//h1[text()='Manage Jurisdiction Accounts']")
	private WebElement manageJurisdictionAccountsTitlePageXpath;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement editJurisdictionAccountPagexpath;

	@FindBy(xpath = "//*[@data-testid='cancelBtn']")
	private WebElement CancelButtonxpath;

	@FindBy(xpath = "//*[text()='Batch']")
	private WebElement Batch1;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement CloseSign1;

	@FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[3]")
	private WebElement ArrowDropDown1;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[7]")
	private WebElement RemoveBatchOption1;

	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[1])")
	private WebElement bankOfUsaxpath;

	@FindBy(xpath = "(//*[contains(text(),'Account Name')])[1]")
	private WebElement scrollAccountNamexpath;

	@FindBy(xpath = "(//*[@class='MuiBox-root css-wkov39'])[2]")
	private WebElement typeOfTransferforIssuance;

	@FindBy(xpath = "(//*[text()='Type of Transfers']//..//..//..//..//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-clearIndicator css-edpqz1'])[2]")
	private WebElement crossButtonOfTypeOfTransfers;

	@FindBy(xpath = "(//*[text()='Type of Transfers']//..//..//..//..//*[@data-testid='ArrowDropDownIcon'])[2]")
	private WebElement batchPcraDropDown;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiChip-deleteIcon MuiChip-deleteIconSmall MuiChip-deleteIconColorDefault MuiChip-deleteIconFilledColorDefault css-1d9kqzu']")
	WebElement batchPCRACloseIcon;

	@FindBy(xpath = "//input[@id='transferDetailsIds-react-hook-form-select-search']")
	private WebElement spaceOfDropdown;

	@FindBy(xpath = "//input[@id='transferDetailsIds-react-hook-form-select-search']")
	private WebElement spaceOfAllocationDropdown;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiChip-deleteIcon MuiChip-deleteIconSmall MuiChip-deleteIconColorDefault MuiChip-deleteIconFilledColorDefault css-1d9kqzu']")
	private WebElement closeReplenishment;

	@FindBy(xpath = "//*[text()='CANCEL']")
	private WebElement CancelButton;

	@FindBy(xpath = "(//*[contains(@class,'MuiTypography-root MuiTypography-body2 link-cell')])[1]")
	private WebElement accountNumberXpath;

	@FindBy(xpath = "(//*[@data-testid='priv_btn_Submit'])")
	private WebElement editBtnOfJurisdictionAccountDetailsPage;

	@FindBy(xpath = "//*[contains(text(),'MANAGE JURISDICTION STATUS')]")
	private WebElement selectManageJurisdictionStatus;

	@FindBy(xpath = "//*[contains(@name,'onboardingTasks.newJurisdictionInformation')]")
	public WebElement checkboxnewjurisdiction1;

	@FindBy(xpath = "//*[contains(@name,'onboardingTasks.setInitialUsers')]")
	public WebElement checkboxinitialusers1;

	@FindBy(xpath = "//*[contains(@name,'onboardingTasks.setJurisdictionAccount')]")
	public WebElement checkboxjurisdictionaccount1;

	@FindBy(xpath = "//*[contains(@name,'onboardingTasks.setJurisdictionBudget')]")
	public WebElement checkboxjurisdictionbudget1;

	@FindBy(xpath = "//*[contains(@name,'onboardingTasks.setPurchaseLimits')]")
	public WebElement checkboxpurchaselimit1;

	@FindBy(xpath = "//*[contains(@name,'acknowledgement')]")
	public WebElement checkboxacknowledgement1;

	@FindBy(xpath = "//*[contains(text(),'Jurisdiction Request and Status Change History')]")
	private WebElement statusChangeHistory;

//	@FindBy (xpath="(//*[text()='Jurisdiction Status'])[2]")
//	public WebElement JurisdictionStatusHeader;

	@FindBy(xpath = "//*[@data-testid='jurisdictionStatus']")
	private WebElement searchFieldOfJurisdictionStatus;

//	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Pre-Linked']")
//	private WebElement savePreLinkedStatus01;

	@FindBy(xpath = "//input[@placeholder='--Select--']")
	public WebElement PreLinkedStatusDisplayed;

	@FindBy(xpath = "//input[@id='jurisdictions-react-hook-form-select-search']")
	public WebElement JurisdictionsTextBox1;

	@FindBy(xpath = "//input[@id='jurisdictionStatus-react-hook-form-select-search']")
	public WebElement JurisdictionStatusTextBox1;

	@FindBy(xpath = "//*[contains(text(),'Change Status')]")
	public WebElement scrollUptoChangeStatus;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	public WebElement SubmitButton1;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Pre-Linked']")
	private WebElement saveJurisdicionStatusfield;

	@FindBy(xpath = "//*[contains(text(),'Jurisdiction Request and Status Change History')]")
	private WebElement jurisdictionStatusChangeHistoryTable;

	@FindBy(xpath = "//input[@data-testid='passphrase']")
	public WebElement PassphraseTextBox1;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement confirmBtnOnWarningPopup;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement errorMessage;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	public WebElement popupclosebutton1;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ErrorMessageforOneIssuanceAct;

	@FindBy(xpath = "//input[@id='jurisdictions-react-hook-form-select-search']")
	public WebElement insideJurisdictionField;

	@FindBy(xpath = "(//*[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[2]")
	public WebElement errorSelectJurisdictionforlinkage;

	@FindBy(xpath = "//*[contains(text(),'MANAGE JURISDICTION DETAILS')]")
	public WebElement selectManageJurisdictionDetails;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement searchJurisdiction;

	@FindBy(xpath = "//*[contains(text(),'Jurisdiction Accounts')]")
	private WebElement scrollUptoJurisdictionAccounts;

	@FindBy(xpath = "//*[contains(text(),'Manage Jurisdiction Details')]")
	private WebElement scrollUptoManageJurisdictionDetails;

	@FindBy(xpath = "//*[contains(text(),'MANAGE STATUS')]")
	private WebElement manageStatusOptionOnMoreActions;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement headingOfManageStatusPage;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ErrorMessageforNoIssuanceAct;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ErrorMessageforPurchaseLimits;

	@FindBy(xpath = "(//h2[@class='MuiTypography-root MuiTypography-h2 css-4cc3qo'])[4]")
	public WebElement scrollUptoPurchaseLimits;

	@FindBy(xpath = "(//*[contains(@type,'button')])[5]")
	public WebElement clickonMoreActionBtnOnDetailsPage;

	@FindBy(xpath = "//input[@id='passphrase']")
	public WebElement clickInsideOutsidePassphrase;

	@FindBy(xpath = "//*[contains(text(),'Passphrase is required')]")
	public WebElement outsidePassphraseErrorMsg;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement invalidPassphraseError;

	@FindBy(xpath = "//button[@data-testid='more-actions']")
	private WebElement moreOptionManagedDetailsPage;

	@FindBy(xpath = "//*[contains(text(),'CANCEL PROPOSED STATUS')]")
	private WebElement cancelProposeBtn;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Reset']")
	private WebElement xpathOfNOBtnOnCancelProposePopup;

	@FindBy(xpath = "//textarea[@aria-describedby='comments-helper-text']")
	public WebElement CommentonCancelCard;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	public WebElement CancelStatusButton;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ToastMessageBody;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	public WebElement Successpopupclosebutton;

	@FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
	private WebElement clickDropdownHomePage;

	@FindBy(xpath = "//*[contains(text(),'JURISDICTION MANAGEMENT')]")
	private WebElement scrollUptoJurisdictionManagement;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageonStatusPage1;

	@FindBy(xpath = "//*[contains(text(),'Onboarding Tasks')]")
	private WebElement scrollUptoOnboardingtasks;

	@FindBy(xpath = "//*[contains(text(),'MANAGE JURISDICTION DETAILS')]")
	private WebElement manageJurisdictionDetailsPage;

	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Cancelled')])[1]")
	private WebElement cancelledStatusInHistoryTable;

	@FindBy(xpath = "(//*[contains(text(),'Jurisdiction Status')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[2]")
	private WebElement jurisdictionStatusInHistoryTable;

	@FindBy(xpath = "(//*[contains(text(),'Updated By')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[4]")
	private WebElement updatedByInHistoryTable;

	@FindBy(xpath = "(//*[contains(text(),'Updated Date (ET)')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[5]")
	private WebElement updateDateInHistoryTable;

	@FindBy(xpath = "(//*[@class='MuiTouchRipple-root css-w0pj6f'])[1]")
	private WebElement moreActionsBtnOnAccountsPage;

	@FindBy(xpath = "//*[contains(text(),'EDIT')]")
	private WebElement editBtnUnderMoreActions;

	@FindBy(xpath = "//*[contains(text(),'Add New Account')]")
	private WebElement addNewActBtnOnDetailsPage;

	@FindBy(xpath = "//*[contains(text(),'SETUP INITIAL USERS')]")
	private WebElement selectSetupInitialUsers;

	@FindBy(xpath = "//button[text()='Add Initial User']")
	private WebElement addInitialUserButton;

	@FindBy(xpath = "//div[text()='Quick Actions']")
	private WebElement quickActionsOnManageInitialUsers;

	@FindBy(xpath = "//*[contains(text(),'EDIT')]")
	private WebElement editBtnOnManageInitialUserspage;
	@FindBy(xpath = "//button[@data-testid='add_batch_save']")
	private WebElement saveButtonXpath1;
	@FindBy(xpath = "(//*[contains(@id,'addressLine1')])[1]")
	private WebElement addAddress1;
	@FindBy(xpath = "(//*[contains(@id,'addressLine2')])[1]")
	private WebElement addAddress2;
	@FindBy(xpath = "//label[text()='City']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement addCity;
	@FindBy(xpath = "//label[text()='Country']//.//..//input[@placeholder='--Select--']")
	private WebElement addCountry;
	@FindBy(xpath = "//label[text()='Zip Code']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement zipCode;
	@FindBy(xpath = "//label[text()='Zip Code']")
	private WebElement zipcodetitle;
	@FindBy(xpath = "//*[@id='zipCode-helper-text']")
	private WebElement errorMessageForZipCode;
	@FindBy(xpath = "//h2[text()='Contact Information']")
	private WebElement contactInformationHeading;

	@FindBy(xpath = "//input[@id='salutation']")
	private WebElement salutation;

	@FindBy(xpath = "//p[@id='salutation-helper-text']")
	private WebElement errormsgforSalutation;

	@FindBy(xpath = "//*[@data-testid='middleName']")
	private WebElement middleName;

	@FindBy(xpath = "//p[@id='middleName-helper-text']")
	private WebElement errormsgMiddlename;

	@FindBy(xpath = "//*[@data-testid='suffix']")
	private WebElement suffix;

	@FindBy(xpath = "//p[@id='suffix-helper-text']")
	private WebElement errormsgforSuffix;

	@FindBy(xpath = "//h2[text()='Change Status']")
	private WebElement headingOfChangeStatus;
	
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdiction;
	public Module5_4_Pom() {
		PageFactory.initElements(driver.get(), this);

	}

	Actions actions = new Actions(driver.get());

	public void LoginWithWCIIncAdmin() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.typeText(userIDField, prop.getProperty("WciIncAdminUserID11"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("WciIncAdminUserID11"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(PassphraseField, prop.getProperty("WciIncAdminPassphrase"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("WciIncAdminPassphrase"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void expandAllJurisdictions1() {
		Common.pageLoader();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[text()='Registration Application Status:']")));
		CommonLibref.scroll(expandAllJurisdictionsArrow, "scrollToBottomOFPage", "expandAllJurisdictionsArrow");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		homePage = expandAllJurisdictions.getText();
		wait.until(ExpectedConditions.elementToBeClickable(expandAllJurisdictionsArrow));
		CommonLibref.click(expandAllJurisdictionsArrow, "moveToElementClick", "expandAllJurisdictionsArrow");
		ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
		System.out.println("Click on All Jurisdictions");
	}

	public void ScrollUptoManageJurisdictions() {
//		wait.until(ExpectedConditions.visibilityOf(RowsPerPage));
		CommonLibref.scroll(ManageCronJobs, "scrollToElement", "ManageCronJobs");
//		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
//		executor.executeScript("window.scrollBy(0,550)", RowsPerPage);
	}

	public void ScrollUptoContactInformation() {
//		JavascriptExecutor js = (JavascriptExecutor) driver.get();
//		js.executeScript("window.scrollBy(0, 500)");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		CommonLibref.scroll(contactInformationHeading, "scrollToElement", "contactInformationHeading");

	}

	public void enterValidDataIntoAddressField1() {
		ObjectRepo.test.log(Status.PASS, "Contact Information card is displayed");
		// CommonLibref.click(addAddress1, "javascriptClick", "addAddress1");
		wait.until(ExpectedConditions.elementToBeClickable(addAddress1));
		Actions action = new Actions(driver.get());
		action.moveToElement(addAddress1).click(addAddress1).build().perform();
		addAddress1.sendKeys(Keys.CONTROL, "a");
		addAddress1.sendKeys(Keys.BACK_SPACE);
		addAddress1.sendKeys("Street1");
		String address1 = addAddress1.getAttribute("Value");
		System.out.println("Addres is display like - " + address1);
		ObjectRepo.test.log(Status.PASS, "Address is display like - " + address1);
		CommonLibref.click(addAddress2, "javascriptClick", "addAddress2");
		addAddress2.sendKeys(Keys.CONTROL, "a");
		addAddress2.sendKeys(Keys.BACK_SPACE);
		addAddress2.sendKeys("Street2");
		String address2 = addAddress1.getAttribute("Value");
		System.out.println("Addres is display like - " + address2);
		ObjectRepo.test.log(Status.PASS, "Address is display like -" + address2);
		String randomZipCodde = RandomStringUtils.randomNumeric(5);
		String ss = "Us" + randomZipCodde;
		zipCode.sendKeys(ss);
		wait.until(ExpectedConditions.elementToBeClickable(zipCode));
		String zipCodeOnJurisdicitonPage = zipCode.getAttribute("Value");
		System.out.println("Zip code is display like - " + zipCodeOnJurisdicitonPage);
		ObjectRepo.test.log(Status.PASS, "Zip code is display like - " + zipCodeOnJurisdicitonPage);
	}

	public void fetchJurisdictionNameFromExcelSheetPTest1() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSaveButtonOnSetUpNewJurisdictionPage1() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonXpath1));
		CommonLibref.click(saveButtonXpath1, "javascriptClick", "SaveButton");
		System.out.println("Steps: Click on Save Button");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Save Button");
	}

	public void SelectJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("AutomationMaryland");
		System.out.println("Enter Jurisdiction Name =" + "AutomationMaryland");
	}

	public void SelectJurisdiction2() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("India");
		System.out.println("Enter Jurisdiction Name =" + "India");
	}

	public void SelectJurisdictionOtherThanOnboard() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("Texas");
		System.out.println("Enter Jurisdiction Name =" + "Texas");
	}

	public void clickOnQuickActions1() {
		wait.until(ExpectedConditions.visibilityOf(ManageCronJobs));
		CommonLibref.scroll(ManageCronJobs, "scrollToBottomOFPage", "manageCornJobsSection");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement quickActions2 = driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']"));
		wait.until(ExpectedConditions.elementToBeClickable(quickActions2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActions2).click(quickActions2).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of HomePage");
			System.out.println("Step :Click on Quick Action of Home Page");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", quickActions2);
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of HomePage");
			System.out.println("Step :Click on Quick Action of Home Page");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of HomePage");
			System.out.println("Step :Click on Quick Action Menu of HomePage");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectSetUpJurisdictionAccounts() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectSetUpJurisdictionAccounts1));
			selectSetUpJurisdictionAccounts1.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on SetUp Jurisdiction Accounts from Quick Actions");
			System.out.println("Step:Click on SetUp Jurisdiction Accounts from Quick Actions");
		} catch (Exception e) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			wait.until(ExpectedConditions.elementToBeClickable(selectSetUpJurisdictionAccounts));
			selectSetUpJurisdictionAccounts.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Jurisdiction Accounts from Quick Actions");
			System.out.println("Step:Click on Manage Jurisdiction Accounts from Quick Actions");
		}
	}

	public void ManageJurisdictionsAccounts() {
		wait.until(ExpectedConditions.elementToBeClickable(selectSetUpJurisdictionAccounts));
		selectSetUpJurisdictionAccounts.click();
		ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Jurisdiction Accounts from Quick Actions");
		System.out.println("Step:Click on Manage Jurisdiction Accounts from Quick Actions");
	}

	public void searchAccountType() {
		String account = accountTypeSpaceXpath.getText();
		System.out.println(account);
		wait.until(ExpectedConditions.visibilityOf(manageJurisdictionAccountspagesearch));
		CommonLibref.scroll(rowsperpage, "scrollToBottomOFPage", "rowsperpage");
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionAccountspagesearch));
		manageJurisdictionAccountspagesearch.click();
		manageJurisdictionAccountspagesearch.sendKeys(account);
	}

	public void clickOnQuickActionsoption() {
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActionsOption).click(quickActionsOption).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Manage Initial Users Page");
			System.out.println("Step :Click on Quick Action of Locked User");
		} catch (NoSuchElementException e) {
			wait.until(ExpectedConditions.elementToBeClickable(quickActionsOption));
			quickActionsOption.click();
			ObjectRepo.test.log(Status.PASS, "Step :Click On Quick Actions option ");
			System.out.println("Step :Click On Quick Actions option ");
		}

	}

	public void editJurisdictionAccount() {
		String edit = accountTypeSpaceXpath.getText();
		System.out.println(edit);
		wait.until(ExpectedConditions.visibilityOf(editJurisdictionAccount));
		// CommonLibref.scroll(rowsperpage, "scrollToBottomOFPage", "rowsperpage");
		wait.until(ExpectedConditions.elementToBeClickable(editJurisdictionAccount));
		// manageJurisdictionAccountspagesearch.click();
		// manageJurisdictionAccountspagesearch.sendKeys(edit);
	}

	public void deleteJurisdictionAccount() {
		String edit = accountTypeSpaceXpath.getText();
		System.out.println(edit);
		wait.until(ExpectedConditions.visibilityOf(deleteJurisdictionAccount));
		// CommonLibref.scroll(rowsperpage, "scrollToBottomOFPage", "rowsperpage");
		wait.until(ExpectedConditions.elementToBeClickable(deleteJurisdictionAccount));
		// manageJurisdictionAccountspagesearch.click();
		// manageJurisdictionAccountspagesearch.sendKeys(edit);
	}

	public void VerifyeditanddeleteJuriAccount() {
		if (editJurisdictionAccount.isSelected() != true) {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("EDIT JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		}

		if (deleteJurisdictionAccount.isSelected() != true) {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("DELETE JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		}

	}

	public void VerifyQuickActionforOtherThanOnboarding() {
		if (editJurisdictionAccount.isSelected() != true) {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("EDIT JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		}

		if (deleteOption2.isSelected() != false) {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(false);
		} else {
			System.out.println("DELETE JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(true);
		}

	}

	public void homeOption() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(homeOption));
			CommonLibref.click(homeOption, "javascriptClick", "HOME");
		} catch (NoSuchElementException e) {
			wait.until(ExpectedConditions.elementToBeClickable(homeOption));
			CommonLibref.click(homeOption, "javascriptClick", "HOME");
		}
	}

	public void accounts() {
		wait.until(ExpectedConditions.elementToBeClickable(accounts));
		Actions action = new Actions(driver.get());
		action.moveToElement(accounts).click(accounts).build().perform();

	}

	public void AssersionOfEditJurisdictionAccountsPage() {
		editJurisdictionAccountsPage = editJurisdictionAccountPagexpath.getText();
		Assert.assertEquals(manageJurisdictionAccountsTitlePage, "Edit Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Step : Edit Jurisdiction Accounts title is displayed");
		System.out.println("Edit Jurisdiction Accounts title is displayed");
	}

	public void ClickOnEditJurisdictionAccount() {
//		String edit = editJurisdictionAccount.getText();
//		System.out.println(edit);		
		wait.until(ExpectedConditions.elementToBeClickable(editJurisdictionAccount));
		editJurisdictionAccount.click();

	}

	public void ScrollUptoCancelButton() {
		wait.until(ExpectedConditions.visibilityOf(CancelButtonxpath));
		CommonLibref.scroll(CancelButtonxpath, "scrollToBottomOFPage", "CancelButton");
	}

	public void VerifyDetailsInTypeOfInstrument() {
		wait.until(ExpectedConditions.visibilityOf(Batch1));
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		int size2 = List.size();
		System.out.println("No of Instruments available :" + size2);
		List<String> Instruments = new ArrayList<>();
		for (int i = 0; i <= size2 - 2; i++) {
			String element = List.get(i).getText();
			System.out.println(element);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of instrument' field' got displayed with dropdown and pre-selected :\r\n"
						+ "Allowance, Offset, Price Containment/ Reserve Allowance, Early Reduction Credits, and Price Ceiling Unit.");

		boolean isClickable = CloseSign1.isSelected();
		if (isClickable) {
			System.out.println("RemoveInstrumentOption is clickable");
			Assert.assertTrue(false);

		} else {

			System.out.println("RemoveInstrumentOption is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of instrument' field' is not Enabled/not getting deselected");
	}

	public void VerifyDetailsInTypeOfTransfer() {
		String BatchText = Batch1.getText();
		System.out.println(BatchText);
		Assert.assertEquals(BatchText, "Batch");
		ArrowDropDown1.isDisplayed();
		System.out.println("Batch is displayed with Dropdown");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of transfer' field' got  displayed with dropdown and pre-selected as Batch transfer");

		boolean isClickable = RemoveBatchOption1.isSelected();

		// Print the result
		if (isClickable) {
			System.out.println("RemoveBatchOption is clickable");
			Assert.assertTrue(false);

		} else {
			System.out.println("RemoveBatchOption is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of transfer' field'is not enabled and not getting  deselected");
	}

	public void VerifyDetailsInTypeOfTransfersForIssuance() {
		wait.until(ExpectedConditions.visibilityOf(typeOfTransferforIssuance));
		String BatchText = typeOfTransferforIssuance.getText();
		System.out.println(BatchText);
		ArrowDropDown1.isDisplayed();
		System.out.println("Batch is displayed with Dropdown");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of transfer' field' got  displayed with dropdown and pre-selected as Batch transfer");

		boolean isClickable = RemoveBatchOption1.isSelected();
		if (isClickable) {
			System.out.println("RemoveBatchOption is clickable");
			Assert.assertTrue(false);
		} else {
			System.out.println("RemoveBatchOption is not clickable");
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of transfer' field'is not enabled and not getting  deselected");
	}

	public void searchIssuanceAccount() {
//		String issuance = accountTypeSpaceXpath.getText();
//		System.out.println(issuance);		
		wait.until(ExpectedConditions.visibilityOf(manageJurisdictionAccountspagesearch));
		CommonLibref.scroll(rowsperpage, "scrollToBottomOFPage", "rowsperpage");
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionAccountspagesearch));
		CommonLibref.click(manageJurisdictionAccountspagesearch, "moveToElementClick",
				"manageJurisdictionAccountspagesearch");
		manageJurisdictionAccountspagesearch.sendKeys("Issuance");
	}

	public void ScrollUptoAccountName() {
		wait.until(ExpectedConditions.visibilityOf(scrollAccountNamexpath));
		CommonLibref.scroll(scrollAccountNamexpath, "scrollToBottomOFPage", "AccountName");
	}

	public void ClickonCrossBtnOfTypeOfTransfers() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(batchPCRACloseIcon));
		wait.until(ExpectedConditions.elementToBeClickable(batchPCRACloseIcon));
		CommonLibref.click(batchPCRACloseIcon, "moveToElementClick", "batchPCRACloseIcon");
		ObjectRepo.test.log(Status.PASS, "Step :Batch PCRA is deselected ");
		System.out.println("Step :Batch PCRA is deselected ");

	}

	public void SelectBatchPCRA() throws InterruptedException {
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(spaceOfDropdown));	
		Actions actions = new Actions(driver.get());

		actions.moveToElement(spaceOfDropdown).click().build().perform();
		spaceOfDropdown.sendKeys(Keys.ENTER);
		ObjectRepo.test.log(Status.PASS, "Step :Batch PCRA is selected ");
		System.out.println("Step :Batch PCRA is selected ");
	}

	public void searchAllocationAccount() {
		wait.until(ExpectedConditions.visibilityOf(manageJurisdictionAccountspagesearch));
		CommonLibref.scroll(rowsperpage, "scrollToBottomOFPage", "rowsperpage");
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionAccountspagesearch));
		CommonLibref.click(manageJurisdictionAccountspagesearch, "moveToElementClick",
				"manageJurisdictionAccountspagesearch");
		manageJurisdictionAccountspagesearch.sendKeys("Allocation");
	}

	public void SelectReplensihment() throws InterruptedException {
		Thread.sleep(2000);
		actions.moveToElement(spaceOfAllocationDropdown).click().build().perform();
		spaceOfAllocationDropdown.sendKeys(Keys.ENTER);
		ObjectRepo.test.log(Status.PASS, "Step :Replenishment is selected ");
		System.out.println("Step :Replenishment is selected ");
	}

	public void DeselectReplenishment() throws InterruptedException {
		Thread.sleep(2000);
		Actions actions = new Actions(driver.get());

		actions.moveToElement(spaceOfAllocationDropdown).click().build().perform();
		spaceOfAllocationDropdown.sendKeys(Keys.BACK_SPACE);
		// wait.until(ExpectedConditions.visibilityOf(closeReplenishment));
		// wait.until(ExpectedConditions.elementToBeClickable(closeReplenishment));
		// CommonLibref.click(closeReplenishment, "moveToElementClick",
		// "closeReplenishment-");
		ObjectRepo.test.log(Status.PASS, "Step :Replenishment is deselected ");
		System.out.println("Step :Replenishment is deselected ");
	}

	public void LoginWithWrongPassword() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.click(userIDField, "moveToElementClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		userIDField.sendKeys(jp.fetchStoredJurisdictionNameValue(1));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseField));
		CommonLibref.click(PassphraseField, "moveToElementClick", "PassphraseField");
		PassphraseField.sendKeys(Keys.CONTROL, "a");
		PassphraseField.sendKeys(Keys.BACK_SPACE);
		PassphraseField.sendKeys("Wciadmin@");
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is invalid.");
		System.out.println("User ID or passphrase entered is invalid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void clickOnQuickActionsofAccount() {
//		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
//		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		WebElement quickActions2 = driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']"));
		wait.until(ExpectedConditions.elementToBeClickable(quickActions2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActions2).click(quickActions2).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Edit Account");
			System.out.println("Step :Click on Quick Action of Manage Jurisdiction Accounts Page");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", quickActions2);
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Edit Account");
			System.out.println("Step :Click on Quick Action of Manage Jurisdiction Accounts Page");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Edit Account");
			System.out.println("Step :Click on Quick Action of Manage Jurisdiction Accounts Page");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ScrollUptoCancelBtn() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 1200)");
			Thread.sleep(2000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,850)", CancelButton);
		}

	}

	public void DisplayLanguageOnEditJurisdictionAccountsPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class=\"MuiTypography-root MuiTypography-body1 css-o6vnld\"]"));

		// List<String> Instruments = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();

			System.out.println("Language is displayed as - " + element);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void DisplayAccountNameOnEditJurisdictionAccountsPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class=\"MuiTypography-root MuiTypography-body1 css-o6vnld\"]"));

		// List<String> Instruments = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String element1 = List.get(i).getText();

			System.out.println("Account Name is displayed as - " + element1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void ScrollUptoRowsPerPage() {
//		wait.until(ExpectedConditions.visibilityOf(RowsPerPage));
		CommonLibref.scroll(rowsperpage, "scrollToElement", "rowsperpage");
//		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
//		executor.executeScript("window.scrollBy(0,550)", RowsPerPage);
	}

	public void AccountNumberClick() {
		wait.until(ExpectedConditions.elementToBeClickable(accountNumberXpath));
		CommonLibref.click(accountNumberXpath, "javascriptClick", "accountNumberXpath");
		System.out.println("Jurisdiction Account Details Page is displayed");
	}

	public void navigateBackToManageJurisdictionAccountspage() {
		driver.get().navigate().back();
		System.out.println();
	}

	public void ClickOnEditBtnOFEditJurisdictionDetailsPage() {
		editBtnOfJurisdictionAccountDetailsPage.click();
		ObjectRepo.test.log(Status.PASS, "Step :Click on the EDIT BTN Of Jurisdiction Account Details");
		System.out.println("Edit Jurisdiction Accounts Page is displayed");
	}

	public void selectManageJurisdictionStatus() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectManageJurisdictionStatus));
			selectManageJurisdictionStatus.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Jurisdiction Status from Quick Actions");
			System.out.println("Step:Click on Manage Jurisdiction Status from Quick Actions");

		} catch (Exception e) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			wait.until(ExpectedConditions.elementToBeClickable(selectManageJurisdictionStatus));
			selectManageJurisdictionStatus.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Jurisdiction Status from Quick Actions");
			System.out.println("Step:Click on Manage Jurisdiction Status from Quick Actions");
		}
	}

	public void checkallthecheckboxes1() {
		System.out.println("Step: Check all CheckBoxes");
		ExpectedConditions.elementToBeClickable(checkboxnewjurisdiction1);
		// checkboxnewjurisdiction1.click();
		CommonLibref.click(checkboxnewjurisdiction1, "javascriptClick", "checkboxnewjurisdiction1");
		ExpectedConditions.elementToBeClickable(checkboxinitialusers1);
		// checkboxinitialusers1.click();
		CommonLibref.click(checkboxinitialusers1, "javascriptClick", "checkboxinitialusers1");
		ExpectedConditions.elementToBeClickable(checkboxjurisdictionaccount1);
		// checkboxjurisdictionaccount1.click();
		CommonLibref.click(checkboxjurisdictionaccount1, "javascriptClick", "checkboxjurisdictionaccount1");
		ExpectedConditions.elementToBeClickable(checkboxjurisdictionbudget1);
		CommonLibref.click(checkboxjurisdictionbudget1, "javascriptClick", "checkboxjurisdictionbudget1");
		ExpectedConditions.elementToBeClickable(checkboxpurchaselimit1);
		CommonLibref.click(checkboxpurchaselimit1, "javascriptClick", "checkboxpurchaselimit1");
		ExpectedConditions.elementToBeClickable(checkboxacknowledgement1);
		CommonLibref.click(checkboxacknowledgement1, "javascriptClick", "checkboxacknowledgement1");
		System.out.println("All checkbox checked.");
	}

	public void ScrollUptoChangeStatus() {
		wait.until(ExpectedConditions.visibilityOf(scrollUptoChangeStatus));
		CommonLibref.scroll(scrollUptoChangeStatus, "scrollToBottomOFPage", "Change Status");
	}

	public void SelectPrelinkFromDropDown() {
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdictionStatus));

		try {
			CommonLibref.click(searchFieldOfJurisdictionStatus, "seleniumClick", "searchFieldOfJurisdictionStatus");
			searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
			searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
			searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
			searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
			// Prelinkedstatus = saveJurisdicionStatusfield.getAttribute("value");
			ObjectRepo.test.log(Status.PASS, "Steps:Prelinked Status is selected");
			System.out.println("Steps:Prelinked Status is selected");
		} catch (Exception ex) {
			actions.moveToElement(searchFieldOfJurisdictionStatus).click().build().perform();
			searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
			searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
			searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
			searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
			// Prelinkedstatus = saveJurisdicionStatusfield.getAttribute("value");
			ObjectRepo.test.log(Status.PASS, "Step :Prelinked Status is selected ");
			System.out.println("Step :PreLinked Status is selected ");
		}
	}
	public void selectPrelinkedStatus() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,150)", headingOfChangeStatus);
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdictionStatus));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
//		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
//		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdiction));
		searchFieldOfJurisdiction.click();
		wait.until(ExpectedConditions.visibilityOf(errorSelectJurisdictionforlinkage));
		String errormessage3 = errorSelectJurisdictionforlinkage.getText();
		Assert.assertEquals(errormessage3, "Select a Jurisdiction for linkage.");
	}
	public void SelectJurisdictions() {
		wait.until(ExpectedConditions.visibilityOf(jurisdictionStatusChangeHistoryTable));
//		JurisdictionStatusTextBox1.sendKeys(status);
		JurisdictionStatusTextBox1.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.visibilityOf(JurisdictionsTextBox1);
//		JurisdictionsTextBox1.sendKeys(Jurisdictionname);
		JurisdictionsTextBox1.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Jurisdiction Entered.");
	}

	public void SelectJurisdictionWithByValue() {
//			JurisdictionStatusTextBox1.sendKeys(status);
		JurisdictionStatusTextBox1.sendKeys(Keys.ENTER);
		ExpectedConditions.visibilityOf(JurisdictionsTextBox1);
//			JurisdictionsTextBox1.sendKeys(Jurisdictionname1);
		JurisdictionsTextBox1.sendKeys(Keys.ENTER);
		System.out.println("Jurisdiction Entered.");
	}

	public void SubmitButton1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton1));
		CommonLibref.click(SubmitButton1, "javascriptClick", "SubmitButton");
		System.out.println("Clicked on Submit Button.");
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Submit Button");
	}

	public void EnterPassphrase1() {
		PassphraseTextBox1.click();
		PassphraseTextBox1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmBtnOnWarningPopup.click();
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		System.out.println(errorMessage.getText());
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Confirm Button");
		ExpectedConditions.elementToBeClickable(popupclosebutton1);
		CommonLibref.click(popupclosebutton1, "javascriptClick", "popupclosebutton");
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed.");
	}

	public void ClickOnJurisdictionfieldAndOutside() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(jurisdictionStatusChangeHistoryTable));
		ObjectRepo.test.log(Status.PASS, "Step : Click on the jurisdiction from drop-down and then click outside");
		System.out.println("Stpes: Click on the jurisdiction from drop-down and then click outside");
		insideJurisdictionField.click();
		insideJurisdictionField.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOf(errorSelectJurisdictionforlinkage));
		String errormessage3 = errorSelectJurisdictionforlinkage.getText();
		Assert.assertEquals(errormessage3, "Select a Jurisdiction for linkage.");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed below field : - " + errormessage3);
		System.out.println("Error message should get displayed below field : - " + errormessage3);
	}

	public void SelectJurisdiction1() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("Test 50");
		System.out.println("Enter Jurisdiction Name =" + "Test 50");
	}

	public void SelectJurisdiction3() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("Jurisdiction 8-5");
		System.out.println("Enter Jurisdiction Name =" + "Jurisdiction 8-5");
	}

	public void SelectJurisdiction4() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("Automation Test One");
		System.out.println("Enter Jurisdiction Name =" + "Automation Test One");
	}

	public void selectManageJurisdictionDetailsPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectManageJurisdictionDetails));
			selectManageJurisdictionDetails.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Jurisdiction Details from Quick Actions");
			System.out.println("Step:Click on Manage Jurisdiction Details from Quick Actions");

		} catch (Exception e) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			wait.until(ExpectedConditions.elementToBeClickable(selectManageJurisdictionDetails));
			selectManageJurisdictionDetails.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Jurisdiction Details from Quick Actions");
			System.out.println("Step:Click on Manage Jurisdiction Details from Quick Actions");
		}
	}

	public void ScrollUptoJurisdictionAccounts() {
		wait.until(ExpectedConditions.visibilityOf(scrollUptoJurisdictionAccounts));
		CommonLibref.scroll(scrollUptoJurisdictionAccounts, "scrollToElement", "scrollUptoJurisdictionAccounts");
	}

	public void navigateBackToHomePage() {
		driver.get().navigate().back();
		System.out.println("Home page is Displayed");
	}

	public void AssertErrorMessage() {
		PassphraseTextBox1.click();
		PassphraseTextBox1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmBtnOnWarningPopup.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageforOneIssuanceAct));
		String errormsgforissuance = ErrorMessageforOneIssuanceAct.getText();
		Assert.assertEquals(errormsgforissuance,
				"There must be at least one Jurisdiction Account other than Issuance added to the Jurisdiction.");
		System.out.println("Error message is displayed as- " + errormsgforissuance);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as- " + errormsgforissuance);
	}

	public void ScrollUptoManageJurisdictionDetails() {
		wait.until(ExpectedConditions.visibilityOf(scrollUptoManageJurisdictionDetails));
		CommonLibref.scroll(scrollUptoManageJurisdictionDetails, "scrollToElement",
				"scrollUptoManageJurisdictionDetails");
		System.out.println("Page is scrolled upto Manage Jurisdiction Details");
	}

	public void SelectManageStatusFromMoreAction() throws InterruptedException {
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Manage Status Option");
		System.out.println("Steps: Click on Manage Status Option");
		wait.until(ExpectedConditions.visibilityOf(manageStatusOptionOnMoreActions));
		// manageStatusOptionOnMoreActions.click();
		CommonLibref.click(manageStatusOptionOnMoreActions, "javascriptClick", "ManageStatus");
		Thread.sleep(3000);
		String ManageStatusPage = headingOfManageStatusPage.getAttribute("Value");
		;
		Assert.assertEquals(ManageStatusPage, "Manage Jurisdiction Status");
		ObjectRepo.test.log(Status.PASS, ManageStatusPage + "- heading is displayed");
		System.out.println(ManageStatusPage + "- heading is displayed");
	}

	public void AssertErrorMessageForIssuanceAct() {
		PassphraseTextBox1.click();
		PassphraseTextBox1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmBtnOnWarningPopup.click();
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		System.out.println(errorMessage.getText());
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Confirm Button");
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageforNoIssuanceAct));
//			String errormsgforNoissuance = ErrorMessageforNoIssuanceAct.getText();
//			Assert.assertEquals(errormsgforNoissuance, "There must be an Issuance Account added to the Jurisdiction.There must be at least one Jurisdiction Account other than Issuance added to the Jurisdiction.");
//			System.out.println("Error message is displayed as- " + errormsgforNoissuance);
//			ObjectRepo.test.log(Status.PASS, "Error message is displayed as- " + errormsgforNoissuance);
		Boolean errorMessage = driver.get()
				.findElement(By
						.xpath("//*[contains(text(),'There must be an Issuance Account added to the Jurisdiction.')]"))
				.isDisplayed();
		Assert.assertTrue(errorMessage);
		System.out.println("Error message is displayed as- " + errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as- " + errorMessage);
		ExpectedConditions.elementToBeClickable(popupclosebutton1);
		CommonLibref.click(popupclosebutton1, "javascriptClick", "popupclosebutton");
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed.");
	}

	public void ScrollUptoPurchaseLimits() {
		wait.until(ExpectedConditions.visibilityOf(scrollUptoPurchaseLimits));
		CommonLibref.scroll(scrollUptoPurchaseLimits, "scrollToElement", "scrollUptoPurchaseLimits");
		System.out.println("Page is scrolled till Purchase Limit");
	}

	public void AssertErrorMessageForPurchaseLimits() {
		PassphraseTextBox1.click();
		PassphraseTextBox1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmBtnOnWarningPopup.click();
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		System.out.println(errorMessage.getText());
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Confirm Button");
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageforPurchaseLimits));
		Boolean errorMessage1 = driver.get().findElement(By.xpath(
				"//*[contains(text(),'Please update the Purchase Limit parameter to Value as per linkage rules.')]"))
				.isDisplayed();
		Assert.assertTrue(errorMessage1);
		System.out.println("Error message is displayed as- " + errorMessage1);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as- " + errorMessage1);
		ExpectedConditions.elementToBeClickable(popupclosebutton1);
		CommonLibref.click(popupclosebutton1, "javascriptClick", "popupclosebutton");
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed.");
	}

	public void ClickOnMoreActionsButtonOnDetailsPage() {
		wait.until(ExpectedConditions.visibilityOf(clickonMoreActionBtnOnDetailsPage));
		CommonLibref.click(clickonMoreActionBtnOnDetailsPage, "javascriptClick", "MoreActionsBTN");
		// clickonMoreActionBtnOnDetailsPage.click();
		ObjectRepo.test.log(Status.PASS, "Steps: Click on More Actions Option");
		System.out.println("Steps: Click on More Actions Option");
	}

	public void EnterValidPassphrase1() {
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid passpharse and click on confirm button");
		System.out.println("Step:Enter valid passpharse and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		passphaseTextField.click();
		passphaseTextField.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Passphrase popup should get accepted");
		System.out.println("Passphrase popup should get accepted");
		confirmBtnOnWarningPopup.click();
//			ExpectedConditions.elementToBeClickable(popupclosebutton1);
//			CommonLibref.click(popupclosebutton1, "javascriptClick", "popupclosebutton");
//			ObjectRepo.test.log(Status.PASS,"Success Message is displayed.");
//			System.out.println("The request to change the status of Automation Test One to Pre-Linked status has been submitted successfully");

	}

	public void ScrollUptoJurisdictionRequestandStatusChangeHistory() {
		wait.until(ExpectedConditions.visibilityOf(jurisdictionStatusChangeHistoryTable));
		// CommonLibref.scroll(jurisdictionStatusChangeHistoryTable,
		// "scrollToBottomOFPage", "Jurisdiction Request and Status Change History");
		CommonLibref.scroll(rowsperpage, "scrollToBottomOFPage", "rowsperpage");
	}

	public void ClickInsideAndOutsideOfPassphraseFiled() throws InterruptedException {
		ObjectRepo.test.log(Status.PASS, "Step : Click inside Passphrase field and then click outside");
		System.out.println("Stpes: Click inside Passphrase field and then click outside");
		clickInsideOutsidePassphrase.click();
		clickInsideOutsidePassphrase.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOf(outsidePassphraseErrorMsg));
		String errormessage4 = outsidePassphraseErrorMsg.getText();
		Assert.assertEquals(errormessage4, "Passphrase is required");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed below field : - " + errormessage4);
		System.out.println("Error message should get displayed below field : - " + errormessage4);
	}

	public void EnterInvalidPassphrase() {
		System.out.println("**********************************************************");
		ObjectRepo.test.log(Status.PASS, "Step:Enter incorrect passphrase and click on confirm button");
		System.out.println("Step:Enter incorrect passphrase and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		CommonLibref.click(passphaseTextField, "seleniumClick", "passphaseTextField");
		passphaseTextField.sendKeys("Wciadmin@");
		confirmBtnOnWarningPopup.click();
		wait.until(ExpectedConditions.elementToBeClickable(invalidPassphraseError));
		String error = invalidPassphraseError.getText();
		Assert.assertEquals(error, "Passphrase is incorrect");
		ObjectRepo.test.log(Status.PASS,
				"Passphrase should not get accepted and Error message should get displayed as -" + error);
		System.out.println("Passphrase should not get accepted and Error message should get displayed as -" + error);

		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void UncheckcheckboxesforValidationofSubmitBtn() {
		System.out.println("Step: Check all CheckBoxes");
		ExpectedConditions.elementToBeClickable(checkboxnewjurisdiction1);
		// checkboxnewjurisdiction1.click();
		CommonLibref.click(checkboxnewjurisdiction1, "javascriptClick", "checkboxnewjurisdiction1");
//				ExpectedConditions.elementToBeClickable(checkboxinitialusers1);
//				//checkboxinitialusers1.click();
//				CommonLibref.click(checkboxinitialusers1, "javascriptClick", "checkboxinitialusers1");
		ExpectedConditions.elementToBeClickable(checkboxjurisdictionaccount1);
		// checkboxjurisdictionaccount1.click();
		CommonLibref.click(checkboxjurisdictionaccount1, "javascriptClick", "checkboxjurisdictionaccount1");
		ExpectedConditions.elementToBeClickable(checkboxjurisdictionbudget1);
		CommonLibref.click(checkboxjurisdictionbudget1, "javascriptClick", "checkboxjurisdictionbudget1");
		ExpectedConditions.elementToBeClickable(checkboxpurchaselimit1);
		CommonLibref.click(checkboxpurchaselimit1, "javascriptClick", "checkboxpurchaselimit1");
		ExpectedConditions.elementToBeClickable(checkboxacknowledgement1);
//				CommonLibref.click(checkboxacknowledgement1, "javascriptClick", "checkboxacknowledgement1");
//				System.out.println("All checkbox checked.");
	}

	public void SubmitButtonForInvalidData() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(SubmitButton1));
		System.out.println("Submit Button should not get enabled");
		ObjectRepo.test.log(Status.PASS, "Submit Button should not get enabled");
	}

	public void navigateBackToManageJurisdictionStatus() {
		driver.get().navigate().back();
		System.out.println("Manage Jurisdiction Status page is Displayed");
		System.out.println("Cancelled Proposed status button should get displayed at top of page");
		ObjectRepo.test.log(Status.PASS, "Cancelled Proposed status button should get displayed at top of page");
	}

	public void ScrollUptoManageJurisdictionStatus() {
		wait.until(ExpectedConditions.visibilityOf(headingOfManageStatusPage));
		CommonLibref.scroll(headingOfManageStatusPage, "scrollToElement", "Manage Jurisdiction Status");
	}

	public void SaveTheSuccessMessageonManageStatusPage1() {
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage1));
		String successMessage = successMessageonStatusPage1.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(Successpopupclosebutton));
		CommonLibref.click(Successpopupclosebutton, "javascriptClick", "Successpopupclosebutton");

	}

	public void ClickOnMoreActionButtonOnDetailsPage1() {
		ExpectedConditions.elementToBeClickable(moreOptionManagedDetailsPage);
		CommonLibref.click(moreOptionManagedDetailsPage, "seleniumClick", "MoreActionBtn");
		System.out.println("Click On More Actions");
		ObjectRepo.test.log(Status.PASS, "Click On More Actions");
//			wait.until(ExpectedConditions.visibilityOf(cancelProposeBtn));
//			System.out.println("Cancelled Proposed status button should get displayed under More Actions option");
//			ObjectRepo.test.log(Status.PASS, "Observe Cancelled Proposed status button");

	}

	public void VisibilityOfCancelProposeBtn() {
		wait.until(ExpectedConditions.visibilityOf(cancelProposeBtn));
		System.out.println("Cancelled Proposed status button should get displayed under More Actions option");
		ObjectRepo.test.log(Status.PASS, "Observe Cancelled Proposed status button");
	}

	public void ClickOnCancelProposeBtn() {
		ExpectedConditions.elementToBeClickable(cancelProposeBtn);
		CommonLibref.click(cancelProposeBtn, "javascriptClick", "Cancel Button");
		System.out.println("Click On Cancel Propose Button");
		ObjectRepo.test.log(Status.PASS, "Click On Cancel Propose Button");
		System.out.println(
				"The 'cancel proposed status' popup should get displayed with 'No' and 'Cancel status' button ");
		ObjectRepo.test.log(Status.PASS,
				"The 'cancel proposed status' popup should get displayed with 'No' and 'Cancel status' button ");
	}

	public void ClickOnNOBtnOfCancelProposePopup() {
		ExpectedConditions.elementToBeClickable(xpathOfNOBtnOnCancelProposePopup);
		CommonLibref.click(xpathOfNOBtnOnCancelProposePopup, "javascriptClick", "No Button On CancelProposePopup");
		System.out.println("Click on 'No' button of popup message");
		ObjectRepo.test.log(Status.PASS, "Click on 'No' button of popup message");
	}

	public void CancelProposal1() {
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelCard));
		CommentonCancelCard.sendKeys("Text");
		// CancelStatusButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
		CommonLibref.click(CancelStatusButton, "javascriptClick", "Cancel Button");
		// wait.until(ExpectedConditions.visibilityOf(ToastMeesageHeader));
		wait.until(ExpectedConditions.visibilityOf(ToastMessageBody));
		// System.out.println(ToastMeesageHeader.getText());
		System.out.println(ToastMessageBody.getText());
		try {
			System.out.println("Selenium Click Close button");
			Successpopupclosebutton.click();
			wait.until(ExpectedConditions.elementToBeClickable(clickDropdownHomePage));
		} catch (NoSuchElementException e) {
			System.out.println("Move To Element Click Close button");
			CommonLibref.click(Successpopupclosebutton, "moveToElementClick", "CancelProposalButton");
			wait.until(ExpectedConditions.elementToBeClickable(clickDropdownHomePage));
		} catch (Exception e) {
			System.out.println("JavaScript Click Close button");
			CommonLibref.click(Successpopupclosebutton, "moveToElementClick", "CancelProposalButton");
			wait.until(ExpectedConditions.elementToBeClickable(clickDropdownHomePage));
		}

	}

	public void LoginWithJSA() {
//			wait.until(ExpectedConditions.elementToBeClickable(userIDField));
//			CommonLibref.click(userIDField, "moveToElementClick", "userIDField");
//			userIDField.sendKeys(Keys.CONTROL, "a");
//			userIDField.sendKeys(Keys.BACK_SPACE);
//			userIDField.sendKeys("jsa.two");
//			ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
//			System.out.println("UserName entered successfully");
//			wait.until(ExpectedConditions.elementToBeClickable(PassphraseField));
//			CommonLibref.click(PassphraseField, "moveToElementClick", "PassphraseField");
//			PassphraseField.sendKeys(Keys.CONTROL, "a");
//			PassphraseField.sendKeys(Keys.BACK_SPACE);
//			PassphraseField.sendKeys("Wciadmin@123");
//			ObjectRepo.test.log(Status.PASS,"Step : User ID or passphrase entered is invalid.");
//			System.out.println("User ID or passphrase entered is invalid.");
//			CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
//			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
//			ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
//			System.out.println("Click on Login button");

		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.typeText(userIDField, prop.getProperty("JSASeededUserID1"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID1"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(PassphraseField, prop.getProperty("JSASeededUserPassphrase1"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

//		public void ScrollUptoJurisdictionManagement() {
//	    	wait.until(ExpectedConditions.visibilityOf(scrollUptoJurisdictionManagement));	
//	    	CommonLibref.scroll(scrollUptoJurisdictionManagement, "scrollToElement", "Jurisdiction Management");
//	    	ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button ");
//			System.out.println("Proposed for Onboarding to Pre Linked change request should get removed from the JSA Pending Request queue");
//	    }

	public void ScrollUptoJurisdictionManagement() {
		wait.until(ExpectedConditions.visibilityOf(scrollUptoJurisdictionManagement));
		CommonLibref.scroll(scrollUptoJurisdictionManagement, "scrollToBottomOFPage", "Jurisdiction Management");
	}

	public void ScrollUptoOnboardingTasks() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(scrollUptoOnboardingtasks));
		CommonLibref.scroll(scrollUptoOnboardingtasks, "scrollToElement", "Onboarding Tasks");
	}

	public void VerifyTheSuccesMessageForOnboardingToPreLinkedStatus() {
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String successMessage = successMessageonStatusPage1.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
		Boolean proposedForPreLinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The request to change the status')]")).isDisplayed();
		Assert.assertTrue(proposedForPreLinkedStatus);

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(crossIcon).click(crossIcon).build().perform();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
			CommonLibref.click(crossIcon, "javascriptClick", "crossIcon");
		}
	}

	public void WaitUntilQuickActionsDisplayed03() {
		Module5_1_Pom ref1 = new Module5_1_Pom();
//			WebElement firstElement = driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]"));
		for (int i = 0; i < 20; i++) {
			try {
				driver.get().navigate().refresh();
				expandAllJurisdictions1();
				ref1.searchNewJurisdiction();
				ref1.scrollHomepageUptoLast();
				Thread.sleep(2000);
				clickOnQuickActions1();
				System.out.println("Onboard the button as it is now enabled.");
				break;
			} catch (Exception e) {
				driver.get().navigate().refresh();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}
			}
		}
	}

	public void fetchValueFromExcel(String FilePath, String SheetName, int rowNum, int cellNum) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		String nameOfJurisdiction = ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionInformation2", 1, 0);
		System.out.println("Fetch Onboarding jurisdiction name from excel sheet -" + nameOfJurisdiction);
	}

	public void verifyTheValidationForSalutation() {
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter numeric data and Special Characters in Salutation field and observe");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter numeric data and Special Characters in Salutation field and observe");
		wait.until(ExpectedConditions.elementToBeClickable(salutation));
		CommonLibref.click(salutation, "javascriptClick", "Salutation");
		salutation.sendKeys(Keys.CONTROL, "a");
		salutation.sendKeys(Keys.BACK_SPACE);
		salutation.sendKeys("1234!@#$^$%^&*(()_");
		String Text = errormsgforSalutation.getText();
		System.out.println("The appropriate error message should get displyed as - " + Text);
		Assert.assertEquals(errormsgforSalutation.getText(), "Invalid Salutation");
		ObjectRepo.test.log(Status.PASS, "The appropriate error message should get displyed as - " + Text);

		System.out.println("*******************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 20 characters in salutation field");
		System.out.println("Steps: Enter more than 20 characters in salutation field");
		salutation.sendKeys(Keys.CONTROL, "a");
		salutation.sendKeys(Keys.BACK_SPACE);
		salutation.sendKeys(
				"Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, "
						+ "optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing."
						+ " You'll see the number of characters and words increase or decrease as you type, delete, and edit them."
						+ " You can also copy and paste text from another program over into the online editor above. "
						+ "The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.");
		wait.until(ExpectedConditions.visibilityOf(errormsgforSalutation));
		String moreThan20char = errormsgforSalutation.getText();
		System.out.println("Error message should get displayed - " + moreThan20char);
		Assert.assertEquals(errormsgforSalutation.getText(), "Salutation must not be more than 20 characters");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed - " + moreThan20char);
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(salutation));
		CommonLibref.click(salutation, "javascriptClick", "Salutation");
		String ValidData = "Test '.-ÝÞß";
		salutation.sendKeys(Keys.CONTROL, "a");
		salutation.sendKeys(Keys.BACK_SPACE);
		salutation.sendKeys(ValidData);
		System.out.println("Data Should get Accepted" + ValidData);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted" + ValidData);
	}

	public void VerifyTheValidationForMiddleNameAndSuffix() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Click on 'Middle Name' and 'Suffix' field respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on 'Middle Name' and 'Suffix' field respectively");
		wait.until(ExpectedConditions.visibilityOf(middleName));
		CommonLibref.click(middleName, "seleniumClick", "middlename");
		wait.until(ExpectedConditions.visibilityOf(suffix));
		CommonLibref.click(suffix, "seleniumClick", "suffix");
		System.out.println("Steps: User should get to click on 'Middle Name' and Suffix field respectively.");
		ObjectRepo.test.log(Status.PASS,
				"Steps: User should get to click on 'Middle Name' and Suffix field respectively.");
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter numeric data in 'Middle Name' and Suffix field respectively field");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter numeric data in 'Middle Name' and Suffix field respectively field");
		wait.until(ExpectedConditions.elementToBeClickable(middleName));
		CommonLibref.click(middleName, "javascriptClick", "middleName");
		middleName.sendKeys("12345");
		String Text1 = errormsgMiddlename.getText();
		System.out.println("The appropriate error message should get displayed as - " + Text1);
		Assert.assertEquals(errormsgMiddlename.getText(), "Invalid Middle Name");
		ObjectRepo.test.log(Status.PASS, "The appropriate error message should get displayed as - " + Text1);

		wait.until(ExpectedConditions.elementToBeClickable(suffix));
		CommonLibref.click(suffix, "javascriptClick", "suffix");
		suffix.sendKeys("6789");
		String Text2 = errormsgforSuffix.getText();
		System.out.println("The appropriate error message should get displayed as - " + Text2);
		Assert.assertEquals(errormsgforSuffix.getText(), "Invalid Suffix");
		ObjectRepo.test.log(Status.PASS, "The appropriate error message should get displayed as - " + Text2);

		System.out.println("*******************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 50 characters in Middle name");
		System.out.println("Steps: Enter more than 50 characters in Middle name");
		middleName.sendKeys(Keys.CONTROL, "a");
		middleName.sendKeys(Keys.BACK_SPACE);
		middleName.sendKeys(
				"Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, "
						+ "optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing."
						+ " You'll see the number of characters and words increase or decrease as you type, delete, and edit them."
						+ " You can also copy and paste text from another program over into the online editor above. "
						+ "The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.");
		wait.until(ExpectedConditions.visibilityOf(errormsgMiddlename));
		String moreThan50char = errormsgMiddlename.getText();
		System.out.println("Error message should get displayed - " + moreThan50char);
		Assert.assertEquals(errormsgMiddlename.getText(), "Middle Name must not be more than 50 characters");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed - " + moreThan50char);
	}


	public void selectManageJurisdictionDetailsFromQuickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionDetailsPage));
		manageJurisdictionDetailsPage.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Details");
		System.out.println("Select Manage Jurisdiction Details");
	}

	public void VerifytheJurisdictionRequestStatusChangehistorytable() {
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Request Status Change history table is display like:");
		System.out.println("The Jurisdiction Request Status Change history table is display like:");
		String StatusTitle = cancelledStatusInHistoryTable.getText();
		Assert.assertEquals(StatusTitle, "Cancelled");
		System.out.println("Request Status: " + StatusTitle);
		ObjectRepo.test.log(Status.PASS, "Request Status: " + StatusTitle);
		String jurisdictionStatus = jurisdictionStatusInHistoryTable.getText();
		Assert.assertEquals(jurisdictionStatus, "Onboarding");
		System.out.println("Jurisdiction Status: " + jurisdictionStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status:" + jurisdictionStatus);
		String updatedBy = updatedByInHistoryTable.getText();
		System.out.println("Updated By: " + updatedBy);
		ObjectRepo.test.log(Status.PASS, "Updated By:" + updatedBy);
		String updatedDate = updateDateInHistoryTable.getText();
		System.out.println("Update Date: " + updatedDate);
		ObjectRepo.test.log(Status.PASS, "Update Date:" + updatedDate);
	}

	public void VerifyTheMoreActionsOptionAfterCancelProposeRequestForOnboardToPrelink() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));
		int size2 = List.size();
		System.out.println("NO of enable More actions option is :" + size2);
//			List<String> Instruments = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			System.out.println("Following More actions option should get displayed like :" + element);
			ObjectRepo.test.log(Status.PASS, "Following More actions option should get displayed like :" + element);
		}
	}

	public void VerifyManageJurisdictionAccountspageAfterCancelProposed() {
		wait.until(ExpectedConditions.elementToBeClickable(moreActionsBtnOnAccountsPage));
		// moreActionsBtnOnAccountsPage.click();
		CommonLibref.click(moreActionsBtnOnAccountsPage, "javascriptClick", "MoreActionBtn");
		ObjectRepo.test.log(Status.PASS, "Step : Verify the Manage Jurisdiction Accounts page");
		System.out.println("Verify the Manage Jurisdiction Accounts page");
		ObjectRepo.test.log(Status.PASS,
				"Step :More Actions option should get enabled on Manage Jurisdiction Accounts page to add Jurisdiction accounts again");
		System.out.println(
				"More Actions option should get enabled on Manage Jurisdiction Accounts page to add Jurisdiction accounts again");
	}

	public void EditBtnUnderMoreActions() {
		wait.until(ExpectedConditions.elementToBeClickable(editBtnUnderMoreActions));
		CommonLibref.click(editBtnUnderMoreActions, "javascriptClick", "MoreActionBtn");
	}

	public void VerifyAddNewAccountBtn() {
		if (addNewActBtnOnDetailsPage.isEnabled()) {
			System.out.println(
					"Add New Account button is enable on Manage Jurisdiction Details page to add Jurisdiction accounts again"
							);
			ObjectRepo.test.log(Status.PASS,
					"Add New Account button is not enable on Manage Jurisdiction Details page to add Jurisdiction accounts again"
							);
		} else {
			System.out.println("Add New Account button is not enable on Manage Jurisdiction Details page to add Jurisdiction accounts again");
		}
		
	}

	public void VerifyManageInitialUsersPageAfterCancelProposed() {
		wait.until(ExpectedConditions.elementToBeClickable(selectSetupInitialUsers));
		// manageJurisdictionDetailsPage.click();
		CommonLibref.click(selectSetupInitialUsers, "javascriptClick", "SETUP INITIAL USERS");
		ObjectRepo.test.log(Status.PASS, "Step :Verify the Manage Initial users page");
		System.out.println("Verify the Manage Initial users page");
	}

	public void AssertAddInitialUserBtn() {
		wait.until(ExpectedConditions.visibilityOf(addInitialUserButton));
		String BtnTitle = addInitialUserButton.getText();
		Assert.assertEquals(BtnTitle, "ADD INITIAL USER");
		System.out.println("Title is displayed as- " + BtnTitle);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as- " + BtnTitle);
	}

	public void AssertQuickActionsOnInitialUsersPage() {
		
		if (quickActionsOption.isEnabled()) {
			System.out.println("Quick Actions is displayed" );
			ObjectRepo.test.log(Status.PASS, "Quick Actions is displayed" );

		} else {
			System.out.println("Quick Actions is not displayed" );
			ObjectRepo.test.log(Status.PASS, "Quick Actions is not displayed" );
		}
	}

	public void VerifyTheEditButtonInOnboardingStatus1() {
		if (editBtnOnManageInitialUserspage.isEnabled()) {
			Assert.assertEquals(editBtnOnManageInitialUserspage.isEnabled(), true);
			System.out.println("The Edit button Should get enable");
			ObjectRepo.test.log(Status.PASS, "The Edit button Should get enable");

		} else {
			Assert.assertEquals(editBtnOnManageInitialUserspage.isEnabled(), false);
			System.out.println("The Edit button Should get disable");
			ObjectRepo.test.log(Status.PASS, "The Edit button Should get disable");

		}
	}

	public void CrossIcon1() {
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(crossIcon).click(crossIcon).build().perform();

		} catch (Exception e) {
			CommonLibref.click(crossIcon, "seleniumClick", "CrossIcon");
			e.printStackTrace();
		}
	}

	public void DeselectACheckbox() {
		if (checkboxnewjurisdiction1.isSelected()) {

			checkboxnewjurisdiction1.click();

			System.out.println("newjurisdiction1 deselected");

		} else {

			System.out.println("newjurisdiction1 is already deselected");

		}
	}
}
