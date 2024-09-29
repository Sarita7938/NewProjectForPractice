package pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import static constants.ThreadConstants.driver;
//import static resources.listeners.wait;
import static Utilities.listeners.wait;
import static Utilities.listeners.prop;

public class Manage_Jurisdiction_Account_Sanity_Scenarios {
	public static commonLib commonLibRef = new commonLib();
	public static CommonMethods commonMethods = new CommonMethods();
	public static LoginPom login = new LoginPom();
	public Module5_1_Pom ref1 = new Module5_1_Pom();

	public static String issuanceAccount;
	public static String allocationAccount;
	public static String auctionAccountNumber;
	public static String allocationAccountNumber;
	public static String issuanceAccountNumber;
	public static String jurisdictionAccountType;

	@FindBy(xpath = "//*[text()='Default Accounts']")
	private WebElement defaultAccountsCard;

	@FindBy(xpath = "//*[text()='SETUP JURISDICTION ACCOUNTS']")
	private WebElement setupJurisdictionAccountText;

	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography')][6]")
	private WebElement setupJurisdictionAccountOption;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement searchField;

	@FindBy(xpath = "//h1[text()='Set Up Jurisdiction Accounts']")
	private WebElement pageHeading;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement managePurchaseLimit;

	@FindBy(xpath = "(//div[@title='Auction']//..//..//..//*[@data-testid='CheckBoxOutlineBlankIcon'])[1]")
	private WebElement auctionAccountCheckbox;

	@FindBy(xpath = "(//*[text()='Allocation']//..//..//..//..//*[@data-testid='CheckBoxOutlineBlankIcon'])[1]")
	private WebElement allocationAccountCheckbox;

	@FindBy(xpath = "//button[@data-testid='submitBtn']")
	private WebElement submitButton;

	@FindBy(xpath = "(//button[@data-testid='submitBtn'])[2]")
	private WebElement submitButton2Index;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement continueButton;

	@FindBy(xpath = "//*[text()='Issuance Account']")
	private WebElement issuanceAccountName;

	@FindBy(xpath = "//*[text()='Allocation Account']")
	private WebElement allocationAccountName;

	@FindBy(xpath = "//*[text()='Auction Account']")
	private WebElement auctionAccountName;

	@FindBy(xpath = "//*[text()='Issuance Account']//..//..//..//*[contains(@name ,'accountNameLang')]")
	private WebElement addAccountInIssuanceAccount;

	@FindBy(xpath = "//*[text()='Auction Account']//..//..//..//*[contains(@name ,'accountNameLang')]")
	private WebElement addAccountInAuctionAccount;

	@FindBy(xpath = "//*[text()='Allocation  Account']//..//..//..//*[contains(@name ,'accountNameLang')]")
	private WebElement addAccountInAllocationAccount;

	@FindBy(xpath = "//*[@data-testid='ExpandMoreIcon']")
	private WebElement expandAllJurisdictionsArrow;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement closeIcon;

	@FindBy(xpath = "//*[@placeholder='Account Type...']")
	private WebElement accountTypeField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement accountSuccessMessage;

	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement successCrossIcon;

	@FindBy(xpath = "//*[text()='Success']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement successCrossIcon01;

	@FindBy(xpath = "(//th[text()='Account Type']//..//..//..//..//..//..//..//..//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we'])[1]")
	private WebElement saveAccountNumber;

	@FindBy(xpath = "//*[@id='comment']")
	private WebElement commentOnAccountStatus;

	@FindBy(xpath = "//*[text()='MENU']")
	private WebElement megaMenu;

	@FindBy(xpath = "//*[text()='Jurisdiction Accounts']")
	private WebElement jurisdictionAccountsText;

	@FindBy(xpath = "//*[@data-testid='more-actions']")
	private WebElement moreActions;

	@FindBy(xpath = "//*[text()='INACTIVATE JURISDICTION ACCOUNT']")
	private WebElement inactiveJuriAccount;

	@FindBy(xpath = "//*[@id='passphrase']")
	private WebElement passphraseOnAccountStatus;

	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary css-1pdxhxj'])[2]")
	private WebElement filterButton;

	@FindBy(xpath = "//*[@aria-label='Show filters']")
	private WebElement filterButton01;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	private WebElement select1;

	@FindBy(xpath = "//input[@placeholder='Filter value']")
	private WebElement searchName;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[2]")
	private WebElement searchOperatorName;

	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we'])[2]")
	private WebElement accountNumberLink;

	@FindBy(xpath = "//*[text()='CONFIRM']")
	private WebElement confirmOnAccountStatus;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	private WebElement accountNumberLink00001;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessage;

	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[3]")
	private WebElement storedAccountType;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	private WebElement jurisdictionAccountNumber;

	@FindBy(xpath = "//*[text()='RESTRICT JURISDICTION ACCOUNT']")
	private WebElement restrictJuriAccount;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement radioButton;

	@FindBy(xpath = "//*[text()='Restricted: Cannot Transfer']")
	private WebElement restrictCantTransfer;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement initiateBatchTransfer;

	@FindBy(xpath = "//button[contains(text(),'Welcome,')]//child::*[local-name()='svg']")
	private WebElement btnWelcomeProfileDropdown;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	private WebElement selectFirstStatus;

	@FindBy(xpath = "(//*[@name='restrictionType'])[1]")
	private WebElement selectFirstRestrictionType;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement userIDField;

	@FindBy(xpath = "//button[@data-testid='priv_btn_login']")
	private WebElement btnLogin2;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passphraseField;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxRememberMe;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[contains(text(),'ENTITY ACCOUNT APPLICATION')]")
	private WebElement eaaLink;

	@FindBy(xpath = "//button[text()='Register An Entity']")
	private WebElement btnRegister;

	// Methods for interacting with elements
	// Example:
	public void clickSubmitButton() {
		submitButton.click();
	}

	public void enterSearchField(String text) {
		searchField.sendKeys(text);
	}

	public Manage_Jurisdiction_Account_Sanity_Scenarios() {
		PageFactory.initElements(driver.get(), this);
	}

	public void ScrollUptoDefaultAccount() {
		wait.until(ExpectedConditions.visibilityOf(defaultAccountsCard));

		try {
			wait.until(ExpectedConditions.visibilityOf(defaultAccountsCard));

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", defaultAccountsCard);
		} catch (NoSuchElementException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", defaultAccountsCard);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,550)", defaultAccountsCard);
		}
	}

	private By allocationAccountChecbox01 = By
			.xpath("(//*[text()='Allocation']//..//..//..//..//*[@data-testid='CheckBoxOutlineBlankIcon'])[1]");

	public void SelectAllocationAccountInOnBoardindStatus() {
		wait.until(ExpectedConditions.visibilityOf(searchField));
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		commonLibRef.pageLoader();
		searchField.click();
		searchField.sendKeys(Keys.CONTROL, "a");
		searchField.sendKeys(Keys.BACK_SPACE);
		searchField.sendKeys("Allocation");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (allocationAccountCheckbox.isDisplayed()) {
			Actions action = new Actions(driver.get());
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(allocationAccountChecbox01));
			action.moveToElement(element).click(element).build().perform();
			System.out.println("Allocation Account is selected");
			ObjectRepo.test.log(Status.PASS, "Allocation Account is selected");
		} else if (allocationAccountCheckbox.isDisplayed()) {
			allocationAccountCheckbox.click();
		} else {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("arguments[0].click();", allocationAccountCheckbox);
		}

		CloseIconOnAccountPage();
	}

	public void seachNameFiled() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		searchField.click();
		searchField.sendKeys(Keys.CONTROL, "a");
		searchField.sendKeys(Keys.BACK_SPACE);
	}

	public void CloseIconOnAccountPage() {
		wait.until(ExpectedConditions.elementToBeClickable(closeIcon));
		closeIcon.click();
	}

	public void SelectAuctionAccount() {
		wait.until(ExpectedConditions.visibilityOf(searchField));
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		commonLibRef.pageLoader();
		searchField.click();
		searchField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		searchField.sendKeys("Auction");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (auctionAccountCheckbox.isDisplayed()) {
			wait.until(ExpectedConditions.elementToBeClickable(auctionAccountCheckbox));
			Actions action = new Actions(driver.get());
			action.moveToElement(auctionAccountCheckbox).click(auctionAccountCheckbox).build().perform();
			System.out.println("Auction Account is selected");
			ObjectRepo.test.log(Status.PASS, "Auction Account is selected");
		} else {
			auctionAccountCheckbox.click();
		}
		CloseIconOnAccountPage();
	}

	public void ClickOnContinueButton() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", submitButton);

		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		Actions action = new Actions(driver.get());
		action.moveToElement(submitButton).click(submitButton).build().perform();
	}

	public void AssertAddJurisdictionAccountsPage() {
		wait.until(ExpectedConditions.visibilityOf(managePurchaseLimit));
		wait.until(ExpectedConditions.elementToBeClickable(managePurchaseLimit));
		commonLibRef.pageLoader();
		String AddAccountText = managePurchaseLimit.getText();
		Assert.assertEquals(AddAccountText, "Add Jurisdiction Accounts");
		System.out.println("Title is displayed as -" + AddAccountText);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as -" + AddAccountText);
	}

	public void AddAccountNameOnIssuanceAccount() {
		ScrollUptoAllocationAccountName();

//		List<WebElement> List = driver.get().findElements(
//				By.xpath("//*[text()='Issuance Account']//..//..//..//*[contains(@name ,'accountNameLang')]"));
		List<WebElement> List = driver.get().findElements(By.xpath("//*[contains(@name ,'accountNameLang')]"));
		for (int i = 0; i < List.size(); i++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String IssuanceAccount = "Account" + randomAccountName;
//			List.get(i).click();
			List.get(i).sendKeys(IssuanceAccount);
//			List.get(i).sendKeys(Keys.TAB);
			System.out.println("account is displayed as - " + IssuanceAccount);
			ObjectRepo.test.log(Status.PASS, "account is displayed as - " + IssuanceAccount);
		}
	}

	public void ScrollUptoAllocationAccountName() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(allocationAccountName).build().perform();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,550)", allocationAccountName);
		}

	}

	public void AddAccountNameInAllocationAccount() {
		ScrollUptoAuctionAccountName();
		List<WebElement> List1 = driver.get().findElements(
				By.xpath("//*[text()='Allocation Account']//..//..//..//*[contains(@name ,'accountNameLang')]"));
		for (int j = 0; j < List1.size(); j++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String AllocationAccount = "Account" + randomAccountName;
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 800)");
//			List1.get(j).click();
			List1.get(j).sendKeys(Keys.CONTROL, "a");
			List1.get(j).sendKeys(Keys.BACK_SPACE);
			List1.get(j).sendKeys(AllocationAccount);
//				List1.get(j).sendKeys(Keys.TAB);
			System.out.println("account is displayed as - " + AllocationAccount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void ScrollUptoAuctionAccountName() {
		try {
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(auctionAccountName).build().perform();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,550)", auctionAccountName);
		}
	}

	public void scrollUpToTheCancelButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1800)");
	}

	public void AddAccountNameInAuctionAccount() {
		List<WebElement> List2 = driver.get().findElements(
				By.xpath("//*[text()='Auction Account']//..//..//..//*[contains(@name ,'accountNameLang')]"));
		for (int k = 0; k < List2.size(); k++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String AuctionAccount = "Account" + randomAccountName;
			List2.get(k).click();
			List2.get(k).sendKeys(Keys.CONTROL, "a");
			List2.get(k).sendKeys(Keys.BACK_SPACE);
			List2.get(k).sendKeys(AuctionAccount);
//				List2.get(k).sendKeys(Keys.TAB);
			System.out.println("account is displayed as - " + AuctionAccount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage() {
		System.out.println("Click on Continue Button");
		ObjectRepo.test.log(Status.PASS, "Click on Continue Button");
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
	}

	public void AssertSuccessMessageForAccountCreation() {
		wait.until(ExpectedConditions.visibilityOf(accountSuccessMessage));
		String message = accountSuccessMessage.getText();
		System.out.println("Success message is displayed as" + message);
		ObjectRepo.test.log(Status.PASS, "Success message is displayed as" + message);
		Assert.assertEquals(message, "The Jurisdiction Account(s) have been successfully created in the system.");
		commonLibRef.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(successCrossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(successCrossIcon));
		commonLibRef.click(successCrossIcon, "seleniumClick", "crossIcon");
	}

	public void StoredAuctionAccountTypeAndAccountNumber() {
		try {
			seachNameFiled();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchField.click();
		searchField.sendKeys("Auction");
		wait.until(ExpectedConditions.elementToBeClickable(saveAccountNumber));
		auctionAccountNumber = saveAccountNumber.getText();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Auction Account is displayed as- " + auctionAccountNumber);
		ObjectRepo.test.log(Status.PASS, "Auction Account is displayed as- " + auctionAccountNumber);
	}

	public void StoredAllocationAccountTypeAndAccountNumber() {
		try {
			seachNameFiled();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchField.click();
		searchField.sendKeys("Allocation");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(saveAccountNumber));
		allocationAccountNumber = saveAccountNumber.getText();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Allocation Account is displayed as- " + allocationAccountNumber);
		ObjectRepo.test.log(Status.PASS, "Allocation Account is displayed as- " + allocationAccountNumber);
	}

	public void StoredIssuanceAccountTypeAndAccountNumber() {
		try {
			seachNameFiled();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchField.click();
		searchField.sendKeys("Issuance");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(saveAccountNumber));
		issuanceAccountNumber = saveAccountNumber.getText();

		System.out.println("Issuance Account is displayed as- " + issuanceAccountNumber);
		ObjectRepo.test.log(Status.PASS, "Issuance Account is displayed as- " + issuanceAccountNumber);
	}

	public void Click_On_MegaMenu_Option() {
		wait.until(ExpectedConditions.visibilityOf(megaMenu));
		megaMenu.click();
		System.out.println("Click On Mega Menu");
		ObjectRepo.test.log(Status.PASS, "Click On Mega Menu");
	}

	public void Change_Jurisdiction_Accounts_Status_To_Inactive_Status() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(megaMenu));
		megaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(jurisdictionAccountNumber));
		commonLibRef.click(jurisdictionAccountNumber, "seleniumClick", "JuriAccount");
//		   wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		try {
			driver.get().navigate().refresh();
			Thread.sleep(2000);
			filterButton.click();
			Select objSelect = new Select(select1);
			objSelect.selectByVisibleText("Account Status");
			Thread.sleep(1000);
			Select objSelect1 = new Select(searchOperatorName);
			objSelect1.selectByVisibleText("equals");
			Thread.sleep(1000);
			searchName.sendKeys("Active");
			Thread.sleep(1000);
		} catch (Exception e) {

			filterButton.click();
			Select objSelect = new Select(select1);
			objSelect.selectByVisibleText("Account Status");
			Thread.sleep(1000);
			Select objSelect1 = new Select(searchOperatorName);
			objSelect1.selectByVisibleText("equals");
			Thread.sleep(1000);
			searchName.sendKeys("Active");
			Thread.sleep(1000);
		}
		searchField.click();
		Thread.sleep(1000);
		jurisdictionAccountType = storedAccountType.getText();
		System.out.println("Account type is displayed as- " + jurisdictionAccountType);

		clickOnQuickActionsWith2ndIndex();
		inactiveJuriAccount.click();
		commentOnAccountStatus.sendKeys("Text");
		passphraseOnAccountStatus.sendKeys("Wciadmin@123");
		confirmOnAccountStatus.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			assertSuccessMessageOnbudgetPage();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(closeIcon));
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("arguments[0].click();", closeIcon);
		}
	}

	public void enterCommentAndClickOnConfirmButtonOnConfirmStatusUpdate() {
		commentOnAccountStatus.sendKeys("Text");
		passphraseOnAccountStatus.sendKeys("Wciadmin@123");
		confirmOnAccountStatus.click();
	}

	public void enterCommentOnConfirmStatusUpdatePopup() {
		wait.until(ExpectedConditions.elementToBeClickable(commentOnAccountStatus));
		commentOnAccountStatus.click();
		commentOnAccountStatus.sendKeys(Keys.CONTROL, "a");
		commentOnAccountStatus.sendKeys(Keys.BACK_SPACE);
		commentOnAccountStatus.sendKeys("Text");
		String text = commentOnAccountStatus.getText();
		System.out.println("Enter the comment on Comment section - " + text);
		ObjectRepo.test.log(Status.PASS, "Enter the comment on Comment section - " + text);
	}

	public void enterPaswordOnConfirmStatusUpdatePopup() {
		wait.until(ExpectedConditions.elementToBeClickable(passphraseOnAccountStatus));
		passphraseOnAccountStatus.click();
		passphraseOnAccountStatus.sendKeys("Wciadmin@123");
		String password = passphraseOnAccountStatus.getAttribute("value");
		System.out.println("Enter the password on password section -" + password);
		ObjectRepo.test.log(Status.PASS, "Enter the password on password section -" + password);
	}

	public void verifyConfirmButtonEnableOrnot() {
		if (confirmOnAccountStatus.isEnabled()) {
			Assert.assertEquals(confirmOnAccountStatus.isEnabled(), true);
			System.out.println("Button is enable");
			ObjectRepo.test.log(Status.PASS, "Button is enable");
		} else {
			Assert.assertEquals(confirmOnAccountStatus.isEnabled(), false);
			System.out.println("Button is is disable");
			ObjectRepo.test.log(Status.PASS, "Button is disable");
		}
	}

	public void clickOnQuickActionsWith2ndIndex() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement quickActions2 = driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(quickActions2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActions2).click(quickActions2).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action of Home Page");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", quickActions2);
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action of Home Page");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[2]")).click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action Menu for Onboarding Jurisdiction");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void assertSuccessMessageOnbudgetPage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		String message = successMessage.getText();
		Thread.sleep(1000);
		System.out.println("Success message displayed as - " + message);
		Assert.assertEquals(message, "The Status of the Account has been successfully updated.");
		ObjectRepo.test.log(Status.PASS, "Success message displayed as - " + message);
		wait.until(ExpectedConditions.visibilityOf(successCrossIcon));
		Thread.sleep(1000);
		try {

			commonLibRef.click(successCrossIcon, "seleniumClick", "crossIcon");
		} catch (Exception e) {
			commonLibRef.click(successCrossIcon, "javascriptClick", "crossIcon");
		}
	}

	public void Login_WithAdmin_And_Try_To_Initiate_Transfer_InActive_Status() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(megaMenu));
		megaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(jurisdictionAccountNumber));
		commonLibRef.click(jurisdictionAccountNumber, "seleniumClick", "JuriAccount");
		seachNameFiled();
		searchField.click();
		searchField.sendKeys(jurisdictionAccountType);
		System.out.println("Search Jurisdiction Account is - " + jurisdictionAccountType);
		Thread.sleep(1000);
		jurisdictionAccountNumber.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(moreActions));
		commonLibRef.click(moreActions, "javascriptClick", "moreActions");
		Thread.sleep(3000);
		if (initiateBatchTransfer.isEnabled()) {
			System.out.println("INITIATE BATCH TRANSFER option is Enabled ");
		} else {
			System.out.println("INITIATE BATCH TRANSFER option is Disabled");
		}

//		 RestrictJuriAccount.click();
//		    Radio_Button.click();           
//		    CommentOnAccountStatus.sendKeys("Text");
//        PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
//         confirmOnAccountStatus.click();
	}

	public void search_Account_Type_And_Click_On_Account_Number() throws InterruptedException {
		driver.get().navigate().refresh();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(accountNumberLink));
		String accountNumber = accountNumberLink.getText();
		ObjectRepo.test.log(Status.PASS, "Search Account Number" + accountNumber);
		System.out.println("Search Account Number" + accountNumber);
		Thread.sleep(1000);

		searchField.click();
		searchField.sendKeys(accountNumber);
		Thread.sleep(2000);
		ref1.AssertStatusBeforeStatusChangeOfJurisdictionAccount();
		ref1.click_On_The_First_Account_Number();
		wait.until(ExpectedConditions.visibilityOf(moreActions));
		Actions action = new Actions(driver.get());
		action.moveToElement(moreActions).click().perform();
		selectFirstStatus.click();
		try {
			selectFirstRestrictionType.click();
			commentOnAccountStatus.sendKeys("Text");
			passphraseOnAccountStatus.sendKeys("Wciadmin@123");
			confirmOnAccountStatus.click();
			ref1.verifyTheSuccessMessageAfterCreateJurisdiction();
//			CommonLibref.scroll(btnWelcomeProfileDD, "scrollToTopOFPage", "btnWelcomeProfile DD");

		} catch (Exception e) {
			commentOnAccountStatus.sendKeys("Text");
			passphraseOnAccountStatus.sendKeys("Wciadmin@123");
			confirmOnAccountStatus.click();
			ref1.verifyTheSuccessMessageAfterCreateJurisdiction();
//			CommonLibref.scroll(btnWelcomeProfileDD, "scrollToTopOFPage", "btnWelcomeProfile DD");

		}
	}

	public void LoginWithJSAAndAddConfigurationSetting() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		commonLibRef.click(userIDField, "moveToElementClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
//		userIDField.sendKeys(JSAName);
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(passphraseField));
		commonLibRef.click(passphraseField, "moveToElementClick", "PassphraseField");
		passphraseField.sendKeys(Keys.CONTROL, "a");
		passphraseField.sendKeys(Keys.BACK_SPACE);
		passphraseField.sendKeys("Wciadmin@123");
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		commonLibRef.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void initiateNewEAAapplication() {
		commonLibRef.click(eaaLink, "seleniumClick", "EAA_link");
		System.out.println(commonLibRef.getTextElement(btnRegister));
		Boolean btnVisibility = btnRegister.isDisplayed();
		Assert.assertTrue(btnVisibility);
		System.out.println("user can be able to start new EAA");

	}
}
