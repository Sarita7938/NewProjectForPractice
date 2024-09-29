package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
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
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

public class kuldipti_pom {

	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static String JSA1UserId;
	public static String RegistrarReferencecode;
	public static String JSA1Referencecode;
	public static String registrarUserId;
	public static String JSA2UserId;
	public static String AuthorityUserId;
	
	private JavascriptExecutor js = (JavascriptExecutor) driver.get();
	
	@FindBy(xpath = "//h2[text()='Language and Currency']")
	private WebElement languageandCurrency;
	
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@type='text']")
	private WebElement languageFieldXpath;
	
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@placeholder='--Select--']")
	private WebElement addLanguageOnSetUpJurisdiction;
	
	@FindBy(xpath = "(//*[@class='MuiBox-root css-wkov39'])[1]")
	private WebElement allLanguage;
	
	@FindBy(xpath = "//input[@id='salutation']")
	private WebElement salutation;

	@FindBy(xpath = "//input[@id='suffix']")
	private WebElement suffix;

	@FindBy(xpath = "//input[@name='telephoneNumber']")
	private WebElement telephoneNumber;

	@FindBy(xpath = "//input[@id='ext']")
	private WebElement extension;

	@FindBy(xpath = "//input[@id='mobilePhone']")
	private WebElement mobilePhone;

	@FindBy(xpath = "//ul//li[text()='English']")
	private WebElement selLangEng;

	@FindBy(xpath = "//*[@id='emailLanguagePreference']")
	private WebElement langugaeFiledOnRegistrationLink;

	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	private WebElement calendarIcon;
	

	@FindBy(xpath = "//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	private WebElement calendarHeaderLabel;

	@FindBy(xpath = "//*[contains(text(),'HOME')]")
	private WebElement homeXpath;

	@FindBy(xpath = "//button[text()='1975']")
	private WebElement button1975;
	
	@FindBy(xpath = "//button[@aria-colindex='6']")
	private WebElement buttonWithColIndex6;
	
	@FindBy(xpath = "//input[@name='employer.0.title']")
	private WebElement employer;
	
	@FindBy(xpath = "//input[@id='jobTitle']")
	private WebElement jobTitle;

	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon;

	@FindBy(xpath = "//input[@id='faxNumber']")
	private WebElement faxNumber;
	
	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement perInfoContButton;
	
	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;
	
	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;
	
	@FindBy(xpath = "//*[text()='SET UP INITIAL USERS']")
	private WebElement selectInitialUserContainsXpath;
	
	@FindBy(xpath = "//*[contains(text(),'SET UP INITIAL USERS')]")
	private WebElement selectInitialUser;
	
	@FindBy(xpath = "//input[@id='answer2']")
	private WebElement answer2;
	
	@FindBy(xpath = "//input[@id='answer1']")
	private WebElement answer1;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion2']")
	private WebElement secQuestion2;

	@FindBy(xpath = "//li[@data-value='In which year did you get your first credit card?']")
	private WebElement selSecQue2;
	
	@FindBy(xpath = "//input[@name='createUserID']")
	private WebElement createUserId;

	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement passphrase1;

	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterPassword;
	
	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion1']")
	private WebElement secQuestion1;

	@FindBy(xpath = "//input[@id='confirmPassphrase']")
	private WebElement confirmPassphrase;
	
	@FindBy(xpath = "//*[text()='Answer 3']//following::input[@id='answer3']")
	private WebElement securityQuestion3;
	
	@FindBy(xpath = "(//*[contains(@id,'addressLine1')])[1]")
	private WebElement addAddress1;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//li[@data-value='What was the model of your first car?']")
	private WebElement selSecQue3;

	@FindBy(xpath = "//input[@id='answer3']")
	private WebElement answer3;

	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']")
	private WebElement termsOfUseCheckBox;
	
	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion3']")
	private WebElement secQuestion3;
	
	@FindBy(xpath = "//*[contains(text(),'REGISTER')]")
	private WebElement creUserProfRegBut;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement crossButtonAfterRegistration;

	@FindBy(xpath = "(//p[text()='User Reference Code:'])[1]")
	private WebElement userReferenceCode;

	@FindBy(xpath = "//button[@data-testid='submitBtn']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement finishButton;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement SuccessMessage;
	

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageForResetPassphrase;
	
	@FindBy(xpath = "//p[text()='MANAGE JURISDICTION STATUS']")
	private WebElement headingOfManageJurisdictionStatusPage;
	
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='onboardingTasks.newJurisdictionInformation']")
	private WebElement checkBoxOfNewJurisdictionInformation;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='onboardingTasks.setInitialUsers']")
	private WebElement checkBoxOfSetInitialUsers;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='onboardingTasks.setJurisdictionAccount']")
	private WebElement checkBoxOfSetJurisdictionAccount;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='onboardingTasks.setJurisdictionBudget']")
	private WebElement checkBoxOfSetJurisdictionBudget;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='onboardingTasks.setPurchaseLimits']")
	private WebElement checkBoxOfSetPurchaseLimits;
	
	@FindBy(xpath = "//h2[text()='Change Status']")
	private WebElement headingOfChangeStatus;
	
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[1]")
	public WebElement HyperLink1;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Jurisdiction Details')]")
	public WebElement NewJurisdictionInformation;
	
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[2]")
	public WebElement HyperLink2;
	
	//*[text()='Set Initial Users']
//	(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[2]
	
	@FindBy(xpath = "//*[contains(text(),'Manage Initial Users')]")
	public WebElement ManageInitialUsers;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Jurisdiction Accounts')]")
	public WebElement ManageJurisdictionAccounts;
	
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[3]")
	public WebElement HyperLink3;
	
	@FindBy(xpath = "//*[@class=\"MuiInputBase-input MuiOutlinedInput-input Mui-disabled MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2\"]")
	public WebElement prefilledDataInJurisdictionStatus;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Jurisdiction Budget')]")
	public WebElement ManageJurisdictionBudget;
	
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[4]")
	public WebElement HyperLink4;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Purchase Limits')]")
	public WebElement ManagePurchaseLimits;
	
	
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[5]")
	public WebElement HyperLink5;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdictionStatus;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Pre-Linked']")
	private WebElement saveJurisdicionStatusfield;
	 
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Unlinked']")
	private WebElement unlinkedJurisdicionStatusfield;
	
	@FindBy(xpath = "//h2[text()='Jurisdiction Request and Status Change History']")
	private WebElement statusChangeHistory;
	
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdiction;
	
	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement crossiconofjuristatus;
	
	@FindBy(xpath = "//li[@data-value='What was the last name of your third-grade teacher?']")
	private WebElement selSecQue1;
	
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	public WebElement CancelStatusButton;
	
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	public WebElement CommentonCancelProposal;
	
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	public WebElement CancelProposalButton;
	
	@FindBy(xpath = "//*[@data-testid='comments']")
	public WebElement commentofstatus;
	
	@FindBy(xpath = "//*[@id='comments-helper-text']")
	private WebElement CommentisRequiredErrorEXpath;
	
	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement Cancel_Status;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Jurisdiction Details')]")
	private WebElement clickonmanagejuridetailtitle;
	
	@FindBy(xpath = "(//*[contains(text(),'Jurisdiction Status')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[2]")
	private WebElement jurisdictionStatusInHistoryTable;
	
	//*[contains(text(),'Updated By')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[4]
	
	@FindBy(xpath = "//*[text()='Updated Date (ET)']//following::div[@class='MuiDataGrid-cellContent'])[5]")
	private WebElement updatedByInHistoryTable;
	
	@FindBy(xpath = "(//*[contains(text(),'Update Date (ET)')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[5]")
	private WebElement updateDateInHistoryTable;
	
	@FindBy(xpath = "(//*[contains(text(),'Proposed for Pre-Linked')])[4]")
	private WebElement requestStatusInHistoryTable;
	
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	private WebElement CancelproposedStatusButton;
	

	@FindBy(xpath = "//*[contains(text(),'CANCEL PROPOSED STATUS')]")
	private WebElement cancelProposedStatusOptionOnDetailsPagek;
	
	public kuldipti_pom() {
		PageFactory.initElements(driver.get(), this);
	}
	
	public void ScrollUptoLanguageandCurrency() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 500)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CommonLibref.scroll(languageandCurrency, "scrollToElement", "languageandCurrency");
 
	}
	
	public static String generateUserIdForJSA1() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);
		String randomString = ("Jsa01" + generatedString);
		return randomString;
	}
	public static String generateUserIdForJSA2User() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);
		String randomString = ("Jsa02" + generatedString);
		return randomString;
	}
	public static String generateUserIdForAuthority() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);
		String randomString = ("Auth" + generatedString);
		return randomString;
	}
	
	public void selectValidLanguageForJurisdiction1() {
//		wait.until(ExpectedConditions.elementToBeClickable(languageFieldXpath)).isSelected();
	    
	    try {
	    	addLanguageOnSetUpJurisdiction.click();
		} catch (Exception e) {
			CommonLibref.click(addLanguageOnSetUpJurisdiction, "javascriptClick", "addLanguageOnSetUpJurisdiction");

		}
       Actions action = new Actions(driver.get());
    	action.moveToElement(addLanguageOnSetUpJurisdiction).click(addLanguageOnSetUpJurisdiction).build().perform();
		addLanguageOnSetUpJurisdiction.sendKeys("English - System default language");
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.ENTER);
 
//		wait.until(ExpectedConditions.elementToBeClickable(languageFieldXpath));
//		languageFieldXpath.click();
//		addLanguageOnSetUpJurisdiction.sendKeys("French");
//		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
//		languageFieldXpath.sendKeys(Keys.ENTER);
		languageFieldXpath.sendKeys(Keys.TAB);
		String checkAllLnag = allLanguage.getText();
		System.out.println("All Languages is display like -" + checkAllLnag);
		ObjectRepo.test.log(Status.PASS, "All Languages is display like -" + checkAllLnag);
}
	public void AddvalidaOnPersonalInformation1 (){
		salutation.sendKeys("Mr");
		suffix.sendKeys("Suffix");
		//calendarIcon.click();
		Actions action = new Actions(driver.get());
	    action.moveToElement(calendarIcon).click(calendarIcon).build().perform();	
		//wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "javascriptClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		CommonLibref.click(button1975, "javascriptClick", "button1975");
//		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
		CommonLibref.scroll(jobTitle, "scrollToElement", "jobTitle");
		//langugaeFiledOnRegistrationLink.click();
		//CommonLibref.click(langugaeFiledOnRegistrationLink, "javascriptClick", "langugaeFiledOnRegistrationLink");
		
		//Actions action = new Actions(driver.get());
	    action.moveToElement(langugaeFiledOnRegistrationLink).click(langugaeFiledOnRegistrationLink).build().perform();	
		selLangEng.click();
		//CommonLibref.click(selLangEng, "javascriptClick", "selLangEng");
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}
	
	public void selectSetUpInitialUserOptionFromQuickActions1()  {
		try {
			//selectInitialUser.click();
			CommonLibref.click(selectInitialUserContainsXpath, "javascriptClick", "selectInitialUserContainsXpath");
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users SubMenu");
			System.out.println("Step:Click on Setup Initial Users SubMenu");

		} catch (Exception e) {
			selectInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users SubMenu");
			System.out.println("Step:Click on Setup Initial Users SubMenu");
		}
	}
	public void createUserIdForJSA1User1() throws InterruptedException {
		CommonLibref.pageLoader();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA1UserId = generateUserIdForJSA1();
		System.out.println("Jsa1UserId :" + JSA1UserId);
		createUserId.sendKeys(JSA1UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		CommonLibref.scroll(answer1, "scrollToElement", "answer1");
		System.out
				.println("Step: Select valid security questions and enter valid answers for these security questions.");
		//wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();\
		Actions action = new Actions(driver.get());
	    action.moveToElement(secQuestion1).click(secQuestion1).build().perform();	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		//CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		//Actions action = new Actions(driver.get());
	    action.moveToElement(securityQuestion3).click(securityQuestion3).build().perform();	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("cccc");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
		//Actions action = new Actions(driver.get());
	    action.moveToElement(termsOfUseCheckBox).click(termsOfUseCheckBox).build().perform();
		System.out.println("Step: Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");
		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut)).click();
		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration: " + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration: " + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration)).click();
		if (userReferenceCode.isDisplayed()) {
			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
		}
		((JavascriptExecutor) driver.get()).executeScript("window.scrollBy(0,300)");
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
		//wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		 action.moveToElement(finishButton).click(finishButton).build().perform();	
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}
	public void createUserIdForSeesdedJSA2Userk() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA2UserId = generateUserIdForJSA2User();
		System.out.println("Jsa2UserId :" + JSA2UserId);
		createUserId.sendKeys(JSA2UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		System.out
				.println("Step: Select valid security questions and enter valid answer for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
		try {
			secQuestion1.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion1, "seleniumClick", "que2");
		}
		Thread.sleep(2000);
		try {
			selSecQue1.click();
			wait.until(ExpectedConditions.visibilityOf(answer1));
			answer1.sendKeys("teacher");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer1));
			answer1.sendKeys("teacher");
		}
		answer1.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
		try {
			secQuestion2.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion2, "seleniumClick", "que2");
		}
		Thread.sleep(2000);
		try {
			selSecQue2.click();
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("card");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("card");
		}
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
		try {
			secQuestion3.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion3, "seleniumClick", "que2");
		}
		Thread.sleep(2000);
		try {
			selSecQue3.click();
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_7']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		}
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox));
		//CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
		Actions action = new Actions(driver.get());
	    action.moveToElement(termsOfUseCheckBox).click(termsOfUseCheckBox).build().perform();	
		Thread.sleep(2000);
		System.out.println("Step: Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");
		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut));
		CommonLibref.click(creUserProfRegBut, "javascriptClick", "creUserProfRegBut");
		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
		if (userReferenceCode.isDisplayed()) {
			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
		}
		((JavascriptExecutor) driver.get()).executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
		ExpectedConditions.elementToBeClickable(finishButton);
		try {
			CommonLibref.click(finishButton, "javascriptClick", "finishButton");
		} catch (Exception e) {
			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
		}
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}
	
	public void CreateUserIdForSeesdedAuthorityUserk() throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		AuthorityUserId = generateUserIdForAuthority();
		System.out.println("Authority UserId: " + AuthorityUserId);
		createUserId.sendKeys(AuthorityUserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		CommonLibref.scroll(secQuestion1, "scrollToBottomOFPage", "secQuestion1");
		System.out.println("Step: Select valid security questions and enter valid answers for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();
		//Actions action = new Actions(driver.get());
		//action.moveToElement(secQuestion1).click(secQuestion1).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(secQuestion3, "scrollToBottomOFPage", "secQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
      //  wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
        Actions action = new Actions(driver.get());
		action.moveToElement(secQuestion2).click(secQuestion2).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[2]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(secQuestion3, "scrollToElement", "secQuestion3");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[2]"))).click();
		//CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("cccc");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
		//Actions action = new Actions(driver.get());
	    action.moveToElement(termsOfUseCheckBox).click(termsOfUseCheckBox).build().perform();
		System.out.println("Step: Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");
		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut)).click();
		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration: " + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration: " + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration)).click();
		if (userReferenceCode.isDisplayed()) {
			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
		}
		((JavascriptExecutor) driver.get()).executeScript("window.scrollBy(0,300)");
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
	//	wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		//Actions action = new Actions(driver.get());
		action.moveToElement(finishButton).click(finishButton).build().perform();
		try {
			CommonLibref.click(finishButton, "javascriptClick", "finishButton");
		} catch (Exception e) {
			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
		}
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}
	public void scrollPagetobottom() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 3000)");
	
	}
	public void refreshEditPage() {
		System.out.println("Step: Refresh the Edit Jurisdiction Details page");
		ObjectRepo.test.log(Status.PASS, "Step: Refresh the Edit Jurisdiction Details page");
		driver.get().navigate().refresh();
		System.out.println("Step: WCI INC admin should remain on Edit Jurisdiction Details page");
		ObjectRepo.test.log(Status.PASS, "Step: WCI INC admin should remain on Edit Jurisdiction Details page");
	}
	public void observeSAVEbutton() {
		System.out.println("Step: Observe SAVE button");
		ObjectRepo.test.log(Status.PASS, "Step: Observe SAVE button");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 3000)");
		System.out.println("Step: Data should be Prefilled and the \"SAVE\" button should be Disable.");
		ObjectRepo.test.log(Status.PASS, "Step: Data should be Prefilled and the \"SAVE\" button should be Disable.e");
	}
	public void observeSAVEbutton2() {
		System.out.println("Step: Observe the \"SAVE\" button before all mandatory fields to be filled");
		ObjectRepo.test.log(Status.PASS, "Step: Observe the \"SAVE\" button before all mandatory fields to be filled");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 3000)");
		System.out.println("Step: The \"SAVE\" button should be disabled");
		ObjectRepo.test.log(Status.PASS, "Step: The \"SAVE\" button should be disabled");
	}
	public void enterValidDataIntoAddressField1() {
		ObjectRepo.test.log(Status.PASS, "Contact Information card is displayed");
		CommonLibref.click(addAddress1, "javascriptClick", "addAddress1");
		addAddress1.sendKeys(Keys.CONTROL, "a");
		addAddress1.sendKeys(Keys.BACK_SPACE);
		addAddress1.sendKeys("Test");
		String address1 = addAddress1.getAttribute("Value");
		System.out.println("Addres is display like - " + address1);
		ObjectRepo.test.log(Status.PASS, "Addres is display like - " + address1);
	}
	public void clickOnSaveButton1() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		CommonLibref.click(saveButton, "javascriptClick", "saveButton");
		System.out.println("Step: Edit data and click on the \\\"SAVE\\\" button after all mandatory fields are filled");
		ObjectRepo.test.log(Status.PASS, "Steps : Edit data and click on the \"SAVE\" button after all mandatory fields are filled");
		System.out.println("Steps : The \"SAVE\" button should get enabled and clickable after all mandatory fields are filled");
		ObjectRepo.test.log(Status.PASS, "Step: The \\\"SAVE\\\" button should get enabled and clickable after all mandatory fields are filled");
	}
	public void checkboxofuser() {
		System.out.println("Step: Enter the valid data and Click on the checkbox");
		ObjectRepo.test.log(Status.PASS, "Step: Enter the valid data and Click on the checkbox");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 3000)");
		System.out.println("Step: 'REGISTER' button should get enable.");
		ObjectRepo.test.log(Status.PASS, "Step: 'REGISTER' button should get enable.");
	}
	public void registerbutton() {
		System.out.println("Step: Click on the 'REGISTER' button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on the 'REGISTER' button");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 3000)");
		System.out.println("Step: User Reference code and User ID should get displayed and 'Submit Required Documents' page should get displayed");
		ObjectRepo.test.log(Status.PASS, "Step: User Reference code and User ID should get displayed and 'Submit Required Documents' page should get displayed.");
	}
	public void CreateRegistrarUser() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		registrarUserId = generateUserIdForRegistrar();
		System.out.println("Registrar1UserId: " + registrarUserId);
		createUserId.sendKeys(registrarUserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		System.out
				.println("Step: Select valid security questions and enter valid answers for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[4]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role=\"option\"])[5]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Step: Enter the valid data and Click on the checkbox");
		ObjectRepo.test.log(Status.PASS, "Step: Enter the valid data and Click on the checkbox");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 3000)");
		System.out.println("Step: 'REGISTER' button should get enable.");
		ObjectRepo.test.log(Status.PASS, "Step: 'REGISTER' button should get enable.");
		
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
//		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox)).click();
		System.out.println("Step: Click on the 'REGISTER' button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on the 'REGISTER' button");
		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut)).click();
		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Step: User Reference code and User ID should get displayed and 'Submit Required Documents' page should get displayed");
		ObjectRepo.test.log(Status.PASS, "Step: User Reference code and User ID should get displayed and 'Submit Required Documents' page should get displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration)).click();
}
	public static String generateUserIdForRegistrar() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);
		String randomString = ("Reg" + generatedString);
		return randomString;
	}
	public void selectAllManditoryTaskOnManageJurisdictionStatus1() {
		try {
			ObjectRepo.test.log(Status.PASS,
					"Steps:Select appropriate task ,jurisdcition status and click on the submit button");
			System.out.println("\"Steps:Select appropriate task ,jurisdcition status and click on the submit button\"");

			System.out.println("Step: Select all the mandatory tasks.");
			ObjectRepo.test.log(Status.PASS, "Step: Select all the mandatory tasks.");

			CommonLibref.click(checkBoxOfNewJurisdictionInformation, "javascriptClick",
					"checkBoxOfNewJurisdictionInformation");
			System.out.println("New Jurisdiction Information checkbox is checked ");

			CommonLibref.click(checkBoxOfSetInitialUsers, "javascriptClick", "checkBoxOfSetInitialUsers");
			System.out.println("Set Initial Users checkbox is checked");

			CommonLibref.scroll(headingOfChangeStatus, "scrollToElement", "headingOfChangeStatus");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			CommonLibref.click(checkBoxOfSetJurisdictionAccount, "javascriptClick", "checkBoxOfSetJurisdictionAccount");
			System.out.println("Set Jurisdiction Account checkbox is checked");
			
			System.out.println("Step: Mandatory task should get selected.");
			ObjectRepo.test.log(Status.PASS, "Step:Mandatory task should get selected.");
			
			System.out.println("Step:Select optional tasks");
			ObjectRepo.test.log(Status.PASS, "Step:Select optional tasks");

			CommonLibref.click(checkBoxOfSetJurisdictionBudget, "javascriptClick", "checkBoxOfSetJurisdictionBudget");
			System.out.println("Set Jurisdiction Budget checkbox is checked");

			try {
				CommonLibref.click(checkBoxOfSetPurchaseLimits, "javascriptClick", "checkBoxOfSetPurchaseLimits");
				System.out.println("Set Purchase Limits is checked");
				
				System.out.println("Step:Optional tasks should get selected.");
				ObjectRepo.test.log(Status.PASS, "Step:Optional tasks should get selected.");

			} catch (Exception ex) {
				System.out.println("Set Purchase Limits is not displayed");
			}
		} catch (Exception e) {
			System.out.println("Set Purchase Limits is not displayed");
		}
	}
		public void assertPrefilledData() throws InterruptedException {
			System.out.println("WCI Inc Admin is navigated to 'Manage Jurisdiction Status' page with prefilled fields");
			ObjectRepo.test.log(Status.PASS,
					"WCI Inc Admin is navigated to 'Manage Jurisdiction Status' page with prefilled fields");
			Thread.sleep(2000);
			String value = prefilledDataInJurisdictionStatus.getAttribute("value");
			System.out.println("Status is displayed as- " + value);
			ObjectRepo.test.log(Status.PASS, "Status is displayed as- " + value);
		
}
	public void ClickNewJurisdictionInformationTask1() {
		ObjectRepo.test.log(Status.PASS, "Click on Create jurisdiction mandatory task");
		System.out.println("Click on Create jurisdiction mandatory task");
		wait.until(ExpectedConditions.visibilityOf(HyperLink1));
		CommonLibref.scroll(HyperLink1, "scrollToElement", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLink1));
		try {
			CommonLibref.click(HyperLink1, "javascriptClick", "HyperLink1");

		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLink1).click(HyperLink1).build().perform();
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

		wait.until(ExpectedConditions.elementToBeClickable(NewJurisdictionInformation));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	CommonLibref.click(NewJurisdictionInformation, "seleniumClick", "NewJurisdictionInformation");
		String Hyperlink1Title = NewJurisdictionInformation.getText();
		Assert.assertEquals(Hyperlink1Title, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, "WCI inc admin should get navigated to the Manage Jurisdiction Details page.  " + Hyperlink1Title);
		System.out.println("WCI inc admin should get navigated to the Manage Jurisdiction Details page.  " + Hyperlink1Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}
	
	public void ClickSetInitialUsersTask2() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Initial users mandatory task");
		System.out.println("Click on Set Initial users mandatory task");
		wait.until(ExpectedConditions.visibilityOf(HyperLink2));
		CommonLibref.scroll(HyperLink2, "scrollToElement", "HyperLink2");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLink2));
		try {
			CommonLibref.click(HyperLink2, "javascriptClick", "HyperLink2");

		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLink2).click(HyperLink2).build().perform();
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

	//	wait.until(ExpectedConditions.elementToBeClickable(ManageInitialUsers));
//		try {
//			Thread.sleep(7000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		CommonLibref.click(ManageInitialUsers, "seleniumClick", "ManageInitialUsers");
		String Hyperlink2Title = ManageInitialUsers.getText();
		Assert.assertEquals(Hyperlink2Title, "Manage Initial Users");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should get navigated to the Setup initial user page.  " + Hyperlink2Title);
		System.out.println("WCI Inc Admin should get navigated to the Setup initial user page.  " + Hyperlink2Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}
	public void ClickSetJurisdictionAccountTask3() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Jurisdiction Accounts mandatory task.");
		System.out.println("Click on Set Jurisdiction Accounts mandatory task.");
		wait.until(ExpectedConditions.visibilityOf(HyperLink3));
		CommonLibref.scroll(HyperLink3, "scrollToElement", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLink3));
		try {
			CommonLibref.click(HyperLink3, "javascriptClick", "HyperLink3");

		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLink3).click(HyperLink3).build().perform();
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

		wait.until(ExpectedConditions.elementToBeClickable(ManageJurisdictionAccounts));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		CommonLibref.click(ManageJurisdictionAccounts, "seleniumClick", "ManageJurisdictionAccounts");
		String Hyperlink3Title = ManageJurisdictionAccounts.getText();
		Assert.assertEquals(Hyperlink3Title, "Manage Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should get navigated to the Setup jurisdiction account page.  " + Hyperlink3Title);
		System.out.println("WCI Inc Admin should get navigated to the Setup jurisdiction account page.  " + Hyperlink3Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}
	public void ClickSetJurisdictionBudgetTask4() {
		Common.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Click on Set jurisdiction budget optional task");
		System.out.println("Click on Set jurisdiction budget optional task");
		wait.until(ExpectedConditions.visibilityOf(HyperLink4));
		CommonLibref.scroll(HyperLink4, "scrollToElement", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLink4));
		try {
			CommonLibref.click(HyperLink4, "javascriptClick", "HyperLink4");

		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLink4).click(HyperLink4).build().perform();
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

		wait.until(ExpectedConditions.elementToBeClickable(ManageJurisdictionBudget));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		CommonLibref.click(ManageJurisdictionBudget, "seleniumClick", "ManageJurisdictionBudget");
		String Hyperlink4Title = ManageJurisdictionBudget.getText();
		Assert.assertEquals(Hyperlink4Title, "Manage Jurisdiction Budget");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should get navigated to the Set jurisdiction budget page. " + Hyperlink4Title);
		System.out.println("WCI Inc Admin should get navigated to the Set jurisdiction budget page.  " + Hyperlink4Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}
	public void ClickSetPurchaseLimitsTask5() {
		ObjectRepo.test.log(Status.PASS, "Click on Set purchase limit optional task");
		System.out.println("Click on Set purchase limit optional task");
		wait.until(ExpectedConditions.visibilityOf(HyperLink5));
		CommonLibref.scroll(HyperLink5, "scrollToElement", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLink4));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLink5).click(HyperLink5).build().perform();

		} catch (Exception e) {
			CommonLibref.click(HyperLink5, "seleniumClick", "HyperLink5");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

		wait.until(ExpectedConditions.elementToBeClickable(ManagePurchaseLimits));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   CommonLibref.click(ManagePurchaseLimits, "seleniumClick", "ManagePurchaseLimits");
		String Hyperlink5Title = ManagePurchaseLimits.getText();
		Assert.assertEquals(Hyperlink5Title, "Manage Purchase Limits");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should get navigated to the Set purchase limit page. " + Hyperlink5Title);
		System.out.println("WCI Inc Admin should get navigated to the Set purchase limit page.  " + Hyperlink5Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}
	
	public void selectPreLinkedJurisdicitonStatusFromDropDown2() {
		ObjectRepo.test.log(Status.PASS, "Step : Select the pre-linked option");
		System.out.println("Select the pre-linked option");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);

		String preLinkedstatus = saveJurisdicionStatusfield.getAttribute("value");
		//System.out.println(preLinkedstatus);
		

		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.click(searchFieldOfJurisdiction, "javascriptClick", "searchFieldOfJurisdiction");
		ObjectRepo.test.log(Status.PASS, "Step : Pre-Linked option should get selected and Jurisdictions dropdown should get displayed without any prefilled data.");
		System.out.println("Pre-Linked option should get selected and Jurisdictions dropdown should get displayed without any prefilled data.");
}
	public void clickonJurisdiction1() {
		
		Common.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Jurisdictions field on Manage Jurisdiction Status page");
		System.out.println("Click on Jurisdictions field on Manage Jurisdiction Status page");
		//CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		Common.pageLoader();
		searchFieldOfJurisdiction.click();
		//searchFieldOfJurisdiction.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		ObjectRepo.test.log(Status.PASS, "Step :Jurisdictions list should get displayed:Unlinked and Linked");
		System.out.println("Jurisdictions list should get displayed:Unlinked and Linked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickonJurisdicitonStatus() {
		ObjectRepo.test.log(Status.PASS, "Step :Click on the jurisdiction status dropdown menu");
		System.out.println("Click on the jurisdiction status dropdown menu");
		
		//wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		ObjectRepo.test.log(Status.PASS, "Step :Two status option should get displayed:1.Pre -Linked  2.Un-Linked");
		System.out.println("Two status option should get displayed:1.Pre -Linked 2.Un-Linked");		 
}
	public void selectUnLinkedJurisdicitonStatusFromDropDown() {
		ObjectRepo.test.log(Status.PASS, "Step : Select Unlinked Jurisdiction Status");
		System.out.println("Select Unlinked Jurisdiction Status");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys("Unlinked");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);

		String UnLinkedstatus = unlinkedJurisdicionStatusfield.getAttribute("value");
		//System.out.println(UnLinkedstatus);
		
//		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
//		CommonLibref.click(searchFieldOfJurisdiction, "javascriptClick", "searchFieldOfJurisdiction");
		ObjectRepo.test.log(Status.PASS, "Step : Un-Linked option should get selected and Jurisdictions dropdown should not get displayed.");
		System.out.println("Unlinked option should get selected and Jurisdictions dropdown should not get displayed.");
}
	public void selectLinkedJurisdicitonFromjuriDropDown() {
		ObjectRepo.test.log(Status.PASS, "Step : Select a jurisdiction already in linkage.");
		System.out.println("Select a jurisdiction already in linkage.");
//		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
       CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
//		CommonLibref.click(searchFieldOfJurisdiction, "javascriptClick", "searchFieldOfJurisdiction");
		searchFieldOfJurisdiction.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		searchFieldOfJurisdiction.sendKeys("California, Quebec");
		try {
			Thread.sleep(2000);
		} catch (Exception e) 
		{
		}
		searchFieldOfJurisdiction.sendKeys(Keys.ENTER);

		String jurisdiction = searchFieldOfJurisdiction.getAttribute("value");
		//System.out.println(preLinkedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Selected jurisdiction should get selected and all the linking jurisdiction should get selected and be separated by comma");
		System.out.println("Selected jurisdiction should get selected and all the linking jurisdiction should get selected and be separated by comma");
	}
	public void clickoncrossiconjuristatusDropDown() {
		ObjectRepo.test.log(Status.PASS, "Step : Click on the Cross (x) icon on the Jurisdiction Status dropdown");
		System.out.println("Click on the Cross (x) icon on the Jurisdiction Status dropdown");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
	//	CommonLibref.click(crossiconofjuristatus, "seleniumClick", "crossiconofjuristatus");
		//crossiconofjuristatus.sendKeys("Pre-Linked");
		ObjectRepo.test.log(Status.PASS, "Step : Jurisdiction field should get disappear.");
		System.out.println("Jurisdiction field should get disappear.");
	}
	public void clickonmoreactionaccount() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
}
	public void clickonadddefaultaccount() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'ADD DEFAULT ACCOUNT')]"))).click();
}
	public void clickonmanagestatus() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'MANAGE STATUS')]")));
	}
	public void clickoncancelstatusbutton() {
	wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
	CommonLibref.click(CancelStatusButton, "javascriptClick", "CancelStatusButton");
	}
	
	public void clickoncancelproposedstatusbutton() {
		wait.until(ExpectedConditions.elementToBeClickable(CancelproposedStatusButton));
		CommonLibref.click(CancelproposedStatusButton, "javascriptClick", "CancelproposedStatusButton");
		
		CommentonCancelProposal.sendKeys("Test");
		wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
		CommonLibref.click(CancelStatusButton, "javascriptClick", "CancelStatusButton");
		ObjectRepo.test.log(Status.PASS, "Step : Proposed status change request is cancelled");
		System.out.println("Proposed status change request is cancelled");
		}
	
	public void clickonmanagejuridetailtitlek() {
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Manage Jurisdiction Details')]")));
		//clickonmanagejuridetailtitle.click();
		Actions action = new Actions(driver.get());
    	action.moveToElement(clickonmanagejuridetailtitle).click(clickonmanagejuridetailtitle).build().perform();
	}
	
	public void scrolluptosearchFieldOfJurisdictionStatus() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 500)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickoncancelstatus() {
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
		CancelProposalButton.click();
	}
	
	public void NoButtononCancelProposalkk() {
		ObjectRepo.test.log(Status.PASS, "Step : Click on 'CANCEL STATUS' button of popup message");
		System.out.println("Click on 'CANCEL STATUS' button of popup message");
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
		CancelProposalButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
		wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
		CommonLibref.click(CancelStatusButton, "javascriptClick", "CancelStatusButton");
		ObjectRepo.test.log(Status.PASS, "Step : Proposed for Un-Linked  to Pre Linked change request should get cancelled");
		System.out.println("Proposed for Un-Linked  to Pre Linked change request should get cancelled");
		
		// MoreActions.click();
		//wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
//		CancelProposalButton.click();
//		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
//		CommentonCancelProposal.sendKeys("Test");
//		NoonCancelPopup.click();
	}
	public void validations_for_Comments_fieldk() {
		//wait.until(ExpectedConditions.visibilityOf(MoreActions));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
//           MoreActions.click();
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
		CancelProposalButton.click();
		wait.until(ExpectedConditions.visibilityOf(commentofstatus));
		commentofstatus.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOf(CommentisRequiredErrorEXpath));
		String CommentText = CommentisRequiredErrorEXpath.getText();
		System.out.println("Error message is display like: "+ CommentText);
		ObjectRepo.test.log(Status.PASS, "Error message is display like: "+ CommentText);
		Assert.assertEquals(CommentText, "Comment is required");
		

//		String randomString = generateRandomString(8001);
		commentofstatus.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet."
	+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
				+"Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus"
									+ "pharetr vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget." 
										+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
										+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
									+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus "
										+ "pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.Lorem ipsum dolor sit amet, "
										+ "consectetur adipiscing elit. Aenean euismod bibendum laoreet."
									+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
									+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. N"
									+ "am fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet."
										+" Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
										+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, "
										+ "nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
									+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
										+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, "
									+"nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
									+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
								+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
										+ " Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
									+ "Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
										+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
										+ " Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus."
										+ "Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
									+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
										+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
										+"Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet."
										+ " Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
										+ " Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus."
									+ " Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
									+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
									+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
										+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, "
										+ "nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
									+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
										+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
										+ " Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
										+ "Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
										+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
										+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, "
										+ "nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.Lorem ipsum dolor sit amet,"
									+ " consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo."
										+ " Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum,"
									+ " nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet,"
										+ "consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo."
										+ " Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus."
										+ " Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet"
										+ " lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis "
										+ "dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, "
										+ "sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum"
									+ " laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
										+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate,"
										+ " felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
										+ "Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales "
										+ "pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet."
										+ " Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
									+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur rcaccuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor"
									+ ". Sociis natoque penatibus et magnis dis parturient montes, nascetur rc"
										+ " Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
										+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur rcaccuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor"
										+ ". Sociis natoque penatibus et magnis dis parturient montes, nascetur rc");
		wait.until(ExpectedConditions.visibilityOf(CommentisRequiredErrorEXpath));
		String Comment_Error1 = CommentisRequiredErrorEXpath.getText();
		System.out.println("Error message is display like - "+ Comment_Error1);
		ObjectRepo.test.info("Error message is display like - "+ Comment_Error1);
		Assert.assertEquals(Comment_Error1, "Comments must not be more than 8000 characters");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 2:- 'Comments must not be more than 8000 characters' error message is displayed");
		System.out.println("Comments must not be more than 8000 characters' error message is displayed");
		
		//commentofstatus.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		commentofstatus.click();
		commentofstatus.sendKeys(Keys.CONTROL, "a");
		commentofstatus.sendKeys(Keys.BACK_SPACE);
		commentofstatus.sendKeys("Test Comment");
		//PassphraseOnAccountStatus.click();
		//PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Assert.assertEquals(Cancel_Status.isEnabled(), true);
		ObjectRepo.test.log(Status.PASS, "Result Step 3:-Entered comment is accepted.");
		System.out.println("Entered comment is accepted");
	}
	private static String generateRandomString(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(characters.length());
			char randomChar = characters.charAt(randomIndex);
			sb.append(randomChar);
		}

		return sb.toString();
	}
	
	public void requeststatuschangehistorytable() {
		
	System.out.println("The Jurisdiction Request Status Change history table is updated with");
	ObjectRepo.test.log(Status.PASS, "The Jurisdiction Request Status Change history table is updated with");
//	CommonLibref.scroll(ProposedForUnlinked, "scrollToBottomOFPage", "ProposedForPrelinked");
//	VerifyTheStatusOfRevisionRequestStatusAfterRevisionRequested();
	String RequestStatus = requestStatusInHistoryTable.getText();
	System.out.println("Request Status: " + RequestStatus);
	ObjectRepo.test.log(Status.PASS, "requset Status:" + RequestStatus);
	String jurisdictionStatus = jurisdictionStatusInHistoryTable.getText();
	System.out.println("Jurisdiction Status: " + jurisdictionStatus);
	ObjectRepo.test.log(Status.PASS, "jurisdiction Status:" + jurisdictionStatus);
	String updatedBy = updatedByInHistoryTable.getText();
	System.out.println("Updated By: " + updatedBy);
	ObjectRepo.test.log(Status.PASS, "Updated By:" + updatedBy);
	String updatedDate = updateDateInHistoryTable.getAttribute("value");
	System.out.println("Update Date: " + updatedDate);
	ObjectRepo.test.log(Status.PASS, "Update Date:" + updatedDate);
}
	public void AssertCancelProposedStatusOndetailspage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelProposedStatusOptionOnDetailsPagek));
		if (cancelProposedStatusOptionOnDetailsPagek.isEnabled()) {
			System.out.println("CANCEL Proposed Status option is enabled ");
			ObjectRepo.test.log(Status.PASS, "CANCEL Proposed Status option is enabled is enabled");
			Assert.assertTrue(false);
		} else {
			System.out.println("CANCEL Proposed Status option is disabled");
			Assert.assertTrue(true);
		}
	}
}