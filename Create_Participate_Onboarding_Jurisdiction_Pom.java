package pages;

import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;
import static Utilities.listeners.prop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;
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
import static Utilities.listeners.prop;
import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

public class Create_Participate_Onboarding_Jurisdiction_Pom {
	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	private Set<String> visitedWindows = new HashSet<>();
	public static String SeededUserRegistrarEmailAddress;
	private static String onboardJurisdiction;
	private static JavascriptExecutor js;

	public static String RegistrarEmailAddress;
	public static String registraEmailIdName;
	public static String SeededUserJSA1EmailAddress;
	public static String jsaEmailName;
	public static String SeededUserJSA2EmailAddress;
	public static String SeededUserAuthorityEmailAddress;
	public static String firstNameRegistrar;
	public static String lastNameRegistrar;
	public static String registrarUserId;
	public static String JSA1UserId;
	public static String RegistrarReferencecode;
	public static String JSA1Referencecode;
	public static String JSA2Referencecode;
	public static String AuthorityReferencecode;
	public static String firstNameJsa1;
	public static String lastNameJsa1;
	public static String JSA2UserId;
	public static String AuthorityUserId;
	public static String firstNameJsa2;
	public static String lastNameJsa2;
	public static String authorityFirstName;
	public static String authorityLastName;
	public static String Text;
	public static String Text1;
	public static String Text2;
	public static String StoredEmailAddress;
	public static String userRole;
	public static String userRole1;
	public static String manageInitialUserTitle;
	public static String SetUpInitialUserTitle;
	public static String randomEmailId;
	public static String UserReasonfield;
	public static String SeededUserRegistrar;
	public static String SubjectOfEmail;
	public static String generateEmailString;
	public static String user1referencecode;

	@FindBy(xpath = "//a[contains(@href, 'myaccount.google.com/signinoptions/two-step-verification')]")
	WebElement firstElement;

	@FindBy(xpath = "//a[contains(@href, 'accounts.google.com/ServiceLogin?continue=https%')]")
	WebElement secondElement;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement userIDField;

	@FindBy(xpath = "//button[@data-testid='priv_btn_login']")
	private WebElement btnLogin2;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement PassphraseField;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxRememberMe;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	private WebElement dateDropdownoption;

	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@tabindex='0']/following-sibling::button[@tabindex='-1']")
	private WebElement selectDate;

	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@aria-current='date']")
	private WebElement selectCurrentDate;

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]")
	public WebElement EnteredDate;

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")
	public WebElement EnteredTime;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;

	@FindBy(xpath = "/html/body/header/div/div/div/a[2]")
	private WebElement signInButton;

	@FindBy(xpath = "//*[text()='Add Initial User']")
	private WebElement addInitialUserButton02;

	@FindBy(xpath = "//input[@placeholder='First Name...']") // input[@id='firstName']
	private WebElement addFirstName;

	@FindBy(xpath = "//label[text()='First Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedFirstName;

	@FindBy(xpath = "//input[@name='emailAddress']")
	private WebElement addEmailAddress;

	@FindBy(xpath = "//input[@placeholder='Last Name...']") // input[@id='lastName']
	private WebElement addlastName;

	@FindBy(xpath = "//input[@placeholder='Role...']")
	private WebElement addRole;

	@FindBy(xpath = "//label[text()='Role']//..//*[@data-testid='ArrowDropDownIcon']")
	private WebElement dropdownArrowOnRole;

	@FindBy(xpath = "//button[text()='CANCEL']")
	private WebElement cancelBTNOnInitialPage;

	@FindBy(xpath = "//label[text()='Last Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedLastName;

	@FindBy(xpath = "//*[@placeholder='Email Address...']")
	private WebElement emailIdFiled;

	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	private WebElement onBoardNewJurisdictionButton;

	@FindBy(xpath = "//*[text()='Email Address']//..//..//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedEmailIdFiled;

	@FindBy(xpath = "//label[text()='Role']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement storedRole;

	@FindBy(xpath = "//*[text()='Registrar']")
	private WebElement registarXpath;

	@FindBy(xpath = "//*[text()='Jurisdiction System Admin']")
	private WebElement jSAXpath;

	@FindBy(xpath = "//*[text()='Authority']")
	private WebElement authorityXpath;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//*[text()='User Information']")
	private WebElement userInformation;

	@FindBy(id = "identifierId")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id='firstName']")
	private WebElement firstNameOnRegistrationLink;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement headingOnThePage;

	@FindBy(xpath = "//*[@id='lastName']")
	private WebElement LastNameOnRegistrationLink;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement emailOnRegistrationLink;

	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterEmail;

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

	@FindBy(xpath = "//input[@name='employer.0.title']")
	private WebElement employer;

	@FindBy(xpath = "//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	private WebElement calendarHeaderLabel;

	@FindBy(xpath = "//*[contains(text(),'HOME')]")
	private WebElement homeXpath;

	@FindBy(xpath = "//button[text()='1975']")
	private WebElement button1975;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement searchFiled;

	@FindBy(xpath = "//button[@aria-colindex='6']")
	private WebElement buttonWithColIndex6;

	@FindBy(xpath = "(//div[@title='Auction']//..//..//..//*[@data-testid='CheckBoxOutlineBlankIcon'])[1]")
	private WebElement auctionAccountChecbox;

	@FindBy(xpath = "(//*[text()='Allocation']//..//..//..//..//*[@data-testid='CheckBoxOutlineBlankIcon'])[1]")
	private WebElement allocationAccountChecbox;

	@FindBy(xpath = "//input[@id='jobTitle']")
	private WebElement jobTitle;

	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon;

	@FindBy(xpath = "//input[@id='faxNumber']")
	private WebElement faxNumber;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement CloseIcon;

	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement perInfoContButton;

	@FindBy(xpath = "//input[@name='primaryResidence.street1']")
	private WebElement street1PrimResi;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement continueButton;

	@FindBy(xpath = "//input[@name='primaryResidence.street2']")
	private WebElement street2PrimResi;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement accountSuccessMessage;

	@FindBy(xpath = "//input[@name='primaryResidence.city']")
	private WebElement cityPrimResi;

	@FindBy(xpath = "(//*[text()='State or Province']//following::input[@id=\"country-select-demo\"])[1]")
	private WebElement stateAndProvincePrimResi;

	@FindBy(xpath = "//*[text()='Alabama']")
	private WebElement selectStatePrimResi;

	@FindBy(xpath = "//input[@name='primaryResidence.region']")
	private WebElement regionPrimResi;

	@FindBy(xpath = "//input[@name='primaryResidence.postalCode']")
	private WebElement postalCodePrimResi;

	@FindBy(xpath = "(//input[@id='country-select-demo'])[1]")
	private WebElement countryPrimResi;

	@FindBy(xpath = "(//input[@id='country-select-demo'])[1]")
	private WebElement countryPrimResiEditAndReviewPage;

	@FindBy(xpath = "//*[text()='United States']")
	private WebElement selectCountryUSPrimResi;

	@FindBy(xpath = "//*[text()='Albania']")
	private WebElement selectCountryAlbaniaPrimResi;

	@FindBy(xpath = "//input[@data-testid='mailingAddress.street1']")
	private WebElement street1MailAdd;

	@FindBy(xpath = "//input[@id='mailingAddress.street2']")
	private WebElement street2MailAdd;

	@FindBy(xpath = "//input[@id='mailingAddress.city']")
	private WebElement cityMailAdd;

	@FindBy(xpath = "//input[@id='mailingAddress.postalCode']")
	private WebElement postalCodeMailAdd;

	@FindBy(xpath = "//input[@id='mailingAddress.region']")
	private WebElement regionMailAdd;

	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private WebElement checkBox;

	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement primResiContButton;

	@FindBy(xpath = "//span[contains(text(),'I accept the Jurisdiction')]")
	private WebElement checkBoxEditAndReview;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	private WebElement editAndReviewContButton;

	@FindBy(xpath = "//*[@id='createUserID-helper-text']")
	private WebElement errorMessageForUserId;

	@FindBy(xpath = "//*[contains(text(),'Set Up Initial Users')]")
	private WebElement headingsetUpInitialUsers;

	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;

	@FindBy(xpath = "//input[@name='passphrase']")
	private WebElement passphrase11;

	@FindBy(xpath = "//div[contains(text(),'Selected Jurisdiction')]")
	private WebElement selectedJurisdictionDiv;

	@FindBy(xpath = "//input[@id='confirmPassphrase']")
	private WebElement confirmPassphrase;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion1']")
	private WebElement secQuestion1;

	@FindBy(xpath = "//li[@data-value='What was the last name of your third-grade teacher?']")
	private WebElement selSecQue1;

	@FindBy(xpath = "//label[text()='Jurisdiction Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement enterJurisdictionName;

	@FindBy(xpath = "//input[@id='answer1']")
	private WebElement answer1;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion2']")
	private WebElement secQuestion2;

	@FindBy(xpath = "//li[@data-value='In which year did you get your first credit card?']")
	private WebElement selSecQue2;

	@FindBy(xpath = "//*[text()='Answer 3']//following::input[@id='answer3']")
	private WebElement securityQuestion3;

	@FindBy(xpath = "//input[@id='answer2']")
	private WebElement answer2;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion3']")
	private WebElement secQuestion3;

	@FindBy(xpath = "//li[@data-value='What was the model of your first car?']")
	private WebElement selSecQue3;

	@FindBy(xpath = "//input[@id='answer3']")
	private WebElement answer3;

	@FindBy(xpath = "//*[@type=\"checkbox\"]")
	private WebElement termsOfUseCheckBox;

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

	@FindBy(xpath = "(//*[@class='MuiBox-root css-mj6avj'])[2]")
	private WebElement refCode;

	@FindBy(xpath = "//input[@name='createUserID']")
	private WebElement createUserId;

	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement passphrase1;

	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterPassword;

	@FindBy(xpath = "(//tbody//tr[1])[6]")
	private WebElement firstEmail;

	@FindBy(xpath = "//*[@placeholder=\"Search mail\"]")
	private WebElement searchEmail;

	@FindBy(xpath = "//*[@placeholder='Search mail']")
	private WebElement searchEmailFiled;

	@FindBy(xpath = "(//table)[6]//tbody//tr")
	WebElement elementWithId;

	@FindBy(xpath = "  //*[contains(@class,'hP')]")
	public WebElement titleOfResentAccountSetUpLinke;

	@FindBy(xpath = "//*[text()='View messages']")
	WebElement viewMessages;

	@FindBy(xpath = "//*[contains(text(),'catch-all@eqanim-qa.wci-validate.org')]")
	WebElement catchAllAccount;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']")
	public WebElement addToAGroupXpath;

	@FindBy(xpath = "//input[@placeholder='Enter user email…']")
	public WebElement enterEmailXpath;

	@FindBy(xpath = "//*[@title='AUTHORITY']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement authorityQuickAcion;

	@FindBy(xpath = "//*[@title='REGISTRAR']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement registrarQuickAcion;

	@FindBy(xpath = "//*[@title='JURISDICTION_SYSTEM_ADMIN']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement JurisdictionSystemAdminQuickAcion;

	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;

	@FindBy(xpath = "//*[text()='Default Accounts']")
	private WebElement Default_Accounts_Card;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	public WebElement managePurchaseLimit;

	@FindBy(xpath = "//*[text()='Allocation Account']")
	private WebElement allocationAccountNameXpath;

	@FindBy(xpath = "//*[text()='Auction Account']")
	private WebElement AuctionAccountNameXpath;

	@FindBy(xpath = "//*[contains(text(),'Use another account')]")
	private WebElement addAnotherUserAccount;

	@FindBy(xpath = "//*[text()='Initial Users']//..//..//*[@placeholder=\"Search…\"]")
	public WebElement searchFieldOfInitialUsers;

	@FindBy(xpath = "//*[contains(@href, 'wci-registry.org/create-user-profile?LinkID=')]")
	List<WebElement> linkContainingHref;

	@FindBy(xpath = "(//h4[text()='Notification Settings']//..//*[text()='SAVE'])[2]")
	private WebElement saveButtonConfigurationSetting;

	public Create_Participate_Onboarding_Jurisdiction_Pom() {
		PageFactory.initElements(driver.get(), this);
	}

	public void selectCurrentfLinkage() {
		wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 100)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption)).click();
		} catch (NoSuchElementException e) {
			js.executeScript("arguments[0].click();", dateDropdownoption);
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", dateDropdownoption);
		}
		wait.until(ExpectedConditions.elementToBeClickable(selectCurrentDate)).click();
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("Date of Linkage is selected");
	}

	public void searchCraetedNewJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption)).click();
		homepageSearchOption.sendKeys(Keys.CONTROL, "a");
		homepageSearchOption.sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(homepageSearchOption)).sendKeys(onboardJurisdiction);
		System.out.println("Enter Jurisdiction Name =" + onboardJurisdiction);
	}

	public void LoginWithEmailRegistrar(String Email, String Password, String Username) {
		driver.get().navigate().to("https://www.google.com/gmail/about/");
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(viewMessages)).click();
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		}
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)");
		wait.until(ExpectedConditions.visibilityOfAllElements(linkContainingHref));
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Set<String> allWindows = driver.get().getWindowHandles();
		while (allWindows.size() == 1) {
			allWindows = driver.get().getWindowHandles();
		}
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void UserRegistrationForRegistrar() {
		LoginWithEmailRegistrar("catch-all@eqanim-qa.wci-validate.org", "7@S699x^j%7ce69FJm2U", RegistrarEmailAddress);
	}

	public void UserRegistrationForSeededUserJSA1() {
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		searchEmail.sendKeys(Keys.CONTROL, "a");
		searchEmail.sendKeys(Keys.BACK_SPACE);
		searchEmail.sendKeys(SeededUserJSA1EmailAddress);
		searchEmail.sendKeys(Keys.ENTER);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		} catch (Exception ex) {
			wait.until(ExpectedConditions.elementToBeClickable(viewMessages)).click();
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		}
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,350)");
		wait.until(ExpectedConditions.visibilityOfAllElements(linkContainingHref));
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Set<String> allWindows = driver.get().getWindowHandles();
		while (allWindows.size() == 1) {
			allWindows = driver.get().getWindowHandles();
		}
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void UserRegistrationForSeededUserJSA2() {
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		searchEmail.sendKeys(Keys.CONTROL, "a");
		searchEmail.sendKeys(Keys.BACK_SPACE);
		searchEmail.sendKeys(SeededUserJSA2EmailAddress);
		searchEmail.sendKeys(Keys.ENTER);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		} catch (Exception ex) {
			wait.until(ExpectedConditions.elementToBeClickable(viewMessages)).click();
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		}
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,550)");
		wait.until(ExpectedConditions.visibilityOfAllElements(linkContainingHref));
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Set<String> allWindows = driver.get().getWindowHandles();
		while (allWindows.size() == 1) {
			allWindows = driver.get().getWindowHandles();
		}
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void UserRegistrationForSeededUserAuthority() {
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		searchEmail.sendKeys(Keys.CONTROL, "a");
		searchEmail.sendKeys(Keys.BACK_SPACE);
		searchEmail.sendKeys(SeededUserAuthorityEmailAddress);
		searchEmail.sendKeys(Keys.ENTER);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		} catch (Exception ex) {
			wait.until(ExpectedConditions.elementToBeClickable(viewMessages)).click();
			wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		}
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,550)", SeededUserAuthorityEmailAddress);
		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.cssSelector("a[href*='" + SeededUserAuthorityEmailAddress + "']"), 0));
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Set<String> allWindows = driver.get().getWindowHandles();
		while (allWindows.size() == 1) {
			allWindows = driver.get().getWindowHandles();
		}
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void searchEmailId() {
		CommonLibref.pageLoader();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid=\"CloseIcon\"])[3]")))
//					.click();
//		} catch (Exception e) {
//			// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid='CloseIcon'])[3]"))).click();
//			Actions action = new Actions(driver.get());
//			action.moveToElement(crossIcon).click(crossIcon).build().perform();
//		}
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfInitialUsers));
		CommonLibref.click(searchFieldOfInitialUsers, "seleniumClick", "SearchUser");
		searchFieldOfInitialUsers.sendKeys(Create_Participate_Onboarding_Jurisdiction_Pom.RegistrarEmailAddress);
		System.out.println("Enter Email ID =" + Create_Participate_Onboarding_Jurisdiction_Pom.RegistrarEmailAddress);
	}

	public void CreateRegistrarSeededUser() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(userInformation));
		String actualText = userInformation.getText();
		Assert.assertEquals(actualText, "User Information");
		System.out.println("On Set Up Initial Page table name displayed as - " + actualText);
		ObjectRepo.test.log(Status.PASS, "On Set Up Initial Page table name displayed as - " + actualText);
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName)).click();
		String s = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		String ss = "registrar" + s + "-";
		addFirstName.sendKeys(ss);
		firstNameRegistrar = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameRegistrar);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addlastName)).click();
		String s1 = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		addlastName.sendKeys(s1);
		lastNameRegistrar = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameRegistrar);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		String emailId = RandomStringUtils.randomAlphabetic(3);
		registraEmailIdName = "registrar" + emailId.toLowerCase();
		String registrarEmailId = registraEmailIdName + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		emailIdFiled.sendKeys(Keys.TAB);
		System.out.println("Registrar Email Address name - " + registraEmailIdName);
		RegistrarEmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Registrar Email Address displayed - " + RegistrarEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Registrar Email Address displayed - " + RegistrarEmailAddress);
		wait.until(ExpectedConditions.elementToBeClickable(addRole)).click();
		addRole.sendKeys("Registrar");
		registarXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateJSA1SeededUser() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName)).click();
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "jsa" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		firstNameJsa1 = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameJsa1);
		ObjectRepo.test.log(Status.PASS, "First name is displayed as - " + firstNameJsa1);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addlastName)).click();
		String s1 = RandomStringUtils.randomAlphabetic(6);
		String s2 = "-" + s1.toLowerCase();
		addlastName.sendKeys(s2);
		lastNameJsa1 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameJsa1);
		ObjectRepo.test.log(Status.PASS, "Last name is displayedas - " + lastNameJsa1);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		String emailId = RandomStringUtils.randomAlphabetic(3);
		jsaEmailName = "jsa" + emailId.toLowerCase();
		System.out.println("JSA1 Email Address name - " + jsaEmailName);
		String registrarEmailId = jsaEmailName + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		SeededUserJSA1EmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("JSA1 Email Address displayed - " + SeededUserJSA1EmailAddress);
		ObjectRepo.test.log(Status.PASS, "JSA1 Email Address displayed - " + SeededUserJSA1EmailAddress);
		wait.until(ExpectedConditions.elementToBeClickable(addRole)).click();
		addRole.sendKeys("Jurisdiction System Admin");
		jSAXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateJSA2SeededUser() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName)).click();
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "jsa-" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		firstNameJsa2 = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameJsa2);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addlastName)).click();
		String s3 = RandomStringUtils.randomAlphabetic(6);
		String s4 = s3.toLowerCase();
		addlastName.sendKeys(s4);
		lastNameJsa2 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameJsa2);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String JSA2EmailId = "jsa" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(JSA2EmailId);
		SeededUserJSA2EmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("JSA2 Email Address displayed - " + SeededUserJSA2EmailAddress);
		ObjectRepo.test.log(Status.PASS, "JSA2 Email Address displayed - " + SeededUserJSA2EmailAddress);
		wait.until(ExpectedConditions.elementToBeClickable(addRole)).click();
		addRole.sendKeys("Jurisdiction System Admin");
		jSAXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateAuthoritySeededUser() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName)).click();
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "authority" + "-" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		authorityFirstName = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + authorityFirstName);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addlastName)).click();
		String s6 = RandomStringUtils.randomAlphabetic(6);
		String s7 = s6.toLowerCase();
		addlastName.sendKeys(s7);
		authorityLastName = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + authorityLastName);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress)).click();
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String AuthorityEmailId = "authority" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(AuthorityEmailId);
		SeededUserAuthorityEmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Authority Email Address displayed - " + SeededUserAuthorityEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Authority Email Address displayed - " + SeededUserAuthorityEmailAddress);
		wait.until(ExpectedConditions.elementToBeClickable(addRole)).click();
		addRole.sendKeys("Authority");
		authorityXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void AssertSeededUserRegistrarDetails() throws InterruptedException {
		Common.pageLoader();
		String name1 = firstNameOnRegistrationLink.getAttribute("value");
		System.out.println("First Name OnRegistration link - " + name1);
		ObjectRepo.test.log(Status.PASS, "First Name OnRegistration link - " + name1);
		String name2 = LastNameOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + name2);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + name2);
		String email = emailOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + email);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + email);
		Thread.sleep(2000);
		Assert.assertEquals(firstNameRegistrar, name1);
		Assert.assertEquals(lastNameRegistrar, name2);
		Assert.assertEquals(RegistrarEmailAddress, email);
	}

	public void AssertSeededUserJSA1Details() throws InterruptedException {
		String nameJsa1 = firstNameOnRegistrationLink.getAttribute("value");
		System.out.println("First Name OnRegistration link - " + nameJsa1);
		ObjectRepo.test.log(Status.PASS, "First Name OnRegistration link - " + nameJsa1);
		String lastNameJsa1 = LastNameOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + lastNameJsa1);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + lastNameJsa1);
		String emailJsa1 = emailOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + emailJsa1);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + emailJsa1);
		Thread.sleep(2000);
		Assert.assertEquals(firstNameJsa1, nameJsa1);
		Assert.assertEquals(lastNameJsa1, lastNameJsa1);
		Assert.assertEquals(SeededUserJSA1EmailAddress, emailJsa1);
	}

	public void AssertSeededUserJSA2Details() throws InterruptedException {
		String nameJsa2 = firstNameOnRegistrationLink.getAttribute("value");
		System.out.println("First Name OnRegistration link - " + nameJsa2);
		ObjectRepo.test.log(Status.PASS, "First Name OnRegistration link - " + nameJsa2);
		String lastnameJsa2 = LastNameOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + lastnameJsa2);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + lastnameJsa2);
		String emailJsa3 = emailOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + emailJsa3);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + emailJsa3);
		Thread.sleep(2000);
		Assert.assertEquals(firstNameJsa2, nameJsa2);
		Assert.assertEquals(lastNameJsa2, lastnameJsa2);
		Assert.assertEquals(SeededUserJSA2EmailAddress, emailJsa3);
	}

	public void AssertSeededUserAuthorityDetails() throws InterruptedException {
		String nameAuth = firstNameOnRegistrationLink.getAttribute("value");
		System.out.println("First Name OnRegistration link - " + nameAuth);
		ObjectRepo.test.log(Status.PASS, "First Name OnRegistration link - " + nameAuth);
		String lastnameAuth = LastNameOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + lastnameAuth);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + lastnameAuth);
		String emailAuth = emailOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + emailAuth);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + emailAuth);
		Thread.sleep(2000);
		Assert.assertEquals(authorityFirstName, nameAuth);
		Assert.assertEquals(authorityLastName, lastnameAuth);
		Assert.assertEquals(SeededUserAuthorityEmailAddress, emailAuth);
	}

	public void AddvalidaOnPersonalInformation() {
		salutation.sendKeys("Mr");
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "javascriptClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		CommonLibref.click(button1975, "javascriptClick", "button1975");
//		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
		langugaeFiledOnRegistrationLink.click();
		selLangEng.click();
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

	public void AddvalidaPrimaryResidence() throws InterruptedException {
		street1PrimResi.sendKeys("Street1");
		street2PrimResi.sendKeys("Street2");
		cityPrimResi.sendKeys("City");
		wait.until(ExpectedConditions.elementToBeClickable(countryPrimResi)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectCountryUSPrimResi)).click();
		Common.pageLoader();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(stateAndProvincePrimResi)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectStatePrimResi)).click();
		postalCodePrimResi.sendKeys("123456");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		Thread.sleep(3000);
		CommonLibref.click(checkBox, "javascriptClick", "checkBox");
//		wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
		try {
			CommonLibref.click(perInfoContButton, "javascriptClick", "perInfoContButton");
		} catch (Exception e) {
			CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		}
		System.out.println(
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
	}

	public void AddValidDataOneditAndReview() {
		wait.until(ExpectedConditions.elementToBeClickable(selectedJurisdictionDiv));
		WebElement element3 = checkBoxEditAndReview;
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", element3);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(checkBoxEditAndReview)).click();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element4 = editAndReviewContButton;
		try {
			js.executeScript("arguments[0].click()", element4);
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(editAndReviewContButton)).click();
		}
	}

	public static String generateUserIdForRegistrar() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);
		String randomString = ("Reg" + generatedString);
		return randomString;
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

	public void CreateUserIdForRegistrarUser() {
		CommonLibref.pageLoader();
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
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='What was the last name of your third-grade teacher?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='In which year did you get your first credit card?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()=\"What is your maternal grandmother's maiden name?\"]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
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
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void saveSuccessMessageAfterSaveInitialUserdata() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		if (SuccessMessage.isDisplayed()) {
			String successMessage = SuccessMessage.getText();
			Thread.sleep(2000);
			Assert.assertEquals(successMessage, "The user has been successfully assigned to the Jurisdiction.");
			ObjectRepo.test.log(Status.PASS, "Success Message is displayed as - " + successMessage);
			System.out.println("Success Message is displayed as - " + successMessage);
		} else {
			System.out.println("Assert Failed");
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void createUserIdForJSA1User() throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA1UserId = generateUserIdForJSA1();
		System.out.println("Jsa1UserId :" + JSA1UserId);
		createUserId.sendKeys(JSA1UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		
		System.out
				.println("Step: Select valid security questions and enter valid answers for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='What was the last name of your third-grade teacher?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='In which year did you get your first credit card?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()=\"What is your maternal grandmother's maiden name?\"]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
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
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void createUserIdForSeesdedJSA2User() throws InterruptedException {
		CommonLibref.pageLoader();
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
				.println("Step: Select valid security questions and enter valid answers for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='What was the last name of your third-grade teacher?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='In which year did you get your first credit card?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()=\"What is your maternal grandmother's maiden name?\"]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox));
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
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

	public void CreateUserIdForSeesdedAuthorityUser() throws InterruptedException {
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
		System.out
				.println("Step: Select valid security questions and enter valid answers for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='What was the last name of your third-grade teacher?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='In which year did you get your first credit card?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()=\"What is your maternal grandmother's maiden name?\"]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
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
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void EnterValidDataInJurisdictionName() {
		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionName));
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		String randomJurisdictionName = RandomStringUtils.randomNumeric(5);
		String Name = "New Jurisdiction" + randomJurisdictionName;
		enterJurisdictionName.sendKeys(Name);
		onboardJurisdiction = enterJurisdictionName.getAttribute("Value");
		System.out.println("jurisdiction Name is display - " + onboardJurisdiction);
		ObjectRepo.test.log(Status.PASS, "jurisdiction Name is display - " + onboardJurisdiction);
	}

	public void LoginWithJSASeededUser() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.click(userIDField, "moveToElementClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		userIDField.sendKeys(JSA1UserId);
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseField));
		CommonLibref.click(PassphraseField, "moveToElementClick", "PassphraseField");
		PassphraseField.sendKeys(Keys.CONTROL, "a");
		PassphraseField.sendKeys(Keys.BACK_SPACE);
		PassphraseField.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void EnterJurisdictionName() {
		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionName));
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		String randomJurisdictionName = RandomStringUtils.randomNumeric(5);
		String Name = "New Jurisdiction" + randomJurisdictionName;
		enterJurisdictionName.sendKeys(Name);
		onboardJurisdiction = enterJurisdictionName.getAttribute("Value");
		System.out.println("jurisdiction Name is display - " + onboardJurisdiction);
		ObjectRepo.test.log(Status.PASS, "jurisdiction Name is display - " + onboardJurisdiction);
	}

	public void LoginWithJSA1AndAddConfigurationSetting() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.click(userIDField, "moveToElementClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		userIDField.sendKeys(JSA1UserId);
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseField));
		CommonLibref.click(PassphraseField, "moveToElementClick", "PassphraseField");
		PassphraseField.sendKeys(Keys.CONTROL, "a");
		PassphraseField.sendKeys(Keys.BACK_SPACE);
		PassphraseField.sendKeys("Wciadmin@123");
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void SelectAuctionAccount() {
		try {
			seachNameFiled();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchFiled.click();
		searchFiled.sendKeys("Auction");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (auctionAccountChecbox.isDisplayed()) {
			wait.until(ExpectedConditions.elementToBeClickable(auctionAccountChecbox));
			Actions action = new Actions(driver.get());
			action.moveToElement(auctionAccountChecbox).click(auctionAccountChecbox).build().perform();
			System.out.println("Auction Account is selected");
			ObjectRepo.test.log(Status.PASS, "Auction Account is selected");
		} else {
			auctionAccountChecbox.click();
		}
	}

	public void seachNameFiled() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(searchFiled));
		searchFiled.click();
		searchFiled.sendKeys(Keys.CONTROL, "a");
		searchFiled.sendKeys(Keys.BACK_SPACE);
	}

	public void SelectAllocationAccount() {
		try {
			seachNameFiled();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchFiled.click();
		searchFiled.sendKeys("Allocation");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (allocationAccountChecbox.isDisplayed()) {
			Actions action = new Actions(driver.get());
			action.moveToElement(allocationAccountChecbox).click(allocationAccountChecbox).build().perform();
			System.out.println("Allocation Account is selected");
			ObjectRepo.test.log(Status.PASS, "Allocation Account is selected");
		} else {
			allocationAccountChecbox.click();
		}
		CloseIconOnAccountPage();
	}

	public void CloseIconOnAccountPage() {
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		CloseIcon.click();
	}

	public void Create_New_Jurisdiction() throws InterruptedException {
		LoginPom ref = new LoginPom();
		Module5_2_POM ref1 = new Module5_2_POM();
		CommonMethods ref2 = new CommonMethods();
		ref.selectJurisdictionandLangaugeForCalifornia();
		ref1.loginWithValidCredentialMethod();
		ref2.handlesecurityQuestion();
		ref1.allJurisdictions();
	}

	public void clickOnTheOnBoardButton() {
		for (int i = 0; i < 20; i++) {
			try {
				Module5_2_POM ref1 = new Module5_2_POM();
				driver.get().navigate().refresh();
				Thread.sleep(3000);
				ref1.allJurisdictions();
				onBoardNewJurisdictionButton.click();
				ObjectRepo.test.log(Status.PASS, "Step :Click on the ONBOARD NEW JURISDICTION button");
				System.out.println("Click on the ONBOARD NEW JURISDICTION button");
				break;
			} catch (Exception e) {
				driver.get().navigate().refresh();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public void ClickOnHomeOption() {
		wait.until(ExpectedConditions.elementToBeClickable(homeXpath));
		Actions action = new Actions(driver.get());
		action.moveToElement(homeXpath).build().perform();
		homeXpath.click();
	}

	public void NavigateBackToHOme() {
		if (headingOnThePage.isDisplayed()) {
			ClickOnHomeOption();
		} else {
			System.out.println("Already present on Home page");
		}
	}

	public void ClickOnCatchAllAccountOnEmail() {
		wait.until(ExpectedConditions.elementToBeClickable(catchAllAccount));
		CommonLibref.click(catchAllAccount, "seleniumClick", "PassphraseField");
	}

	public void AddEmailForAuthorityInConfigurationSettings(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		System.out.println("Click On Authority Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Authority Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(authorityQuickAcion));
		CommonLibref.click(authorityQuickAcion, "seleniumClick", "jurisdicitonUserEmails");
		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();
		enterEmailXpath.click();
		enterEmailXpath.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
	}

	public void ClickOnContinueButton() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		Actions action = new Actions(driver.get());
		action.moveToElement(SubmitButton).click(SubmitButton).build().perform();
		System.out.println("Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Click on Continue button");
		Common.pageLoader();
	}

	public void AddEmailForRegistrarInConfigurationSettings(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		System.out.println("Click On Registrar Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Registrar Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(registrarQuickAcion));
		CommonLibref.click(registrarQuickAcion, "seleniumClick", "jurisdicitonUserEmails");
		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();
		enterEmailXpath.click();
		enterEmailXpath.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
	}

	public void AddEmailForJurisdictionSystemAdminInConfigurationSettings(String FilePath, String SheetName, int rowNum, int cellNum) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click On JSA Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On JSA Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionSystemAdminQuickAcion));
		CommonLibref.click(JurisdictionSystemAdminQuickAcion, "seleniumClick", "jurisdicitonUserEmails");
		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();
		enterEmailXpath.click();
		enterEmailXpath.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
	}

	public void WaitUntilQuickActionsDisplayed() {
		WebElement firstElement = driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]"));
		boolean isEnabled = false;
		isEnabled = firstElement.isEnabled();
		do {
			Module5_2_POM ref1 = new Module5_2_POM();
			try {
				driver.get().navigate().refresh();
				ref1.allJurisdictions();
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (isEnabled) {
				break;
			}
		} while (!isEnabled);
		Module5_1_Pom ref3 = new Module5_1_Pom();
		Module5_2_POM ref1 = new Module5_2_POM();
		Create_Participate_Onboarding_Jurisdiction_Pom test = new Create_Participate_Onboarding_Jurisdiction_Pom();
		ref3.scrollHomepageUptoLast();
		test.searchCraetedNewJurisdiction();
		ref1.clickOnQuickActions();
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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void ScrollUptoAuctionAccountName() {
		try {
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(AuctionAccountNameXpath).build().perform();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,550)", AuctionAccountNameXpath);
		}
	}

	public void AddAccountNameInAllocationAccount() {
		ScrollUptoAuctionAccountName();
		List<WebElement> List1 = driver.get().findElements(
				By.xpath("//*[text()='Allocation Account']//..//..//..//*[contains(@name ,'accountNameLang')]"));
		for (int j = 0; j < List1.size(); j++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String AllocationAccount = "Account" + randomAccountName;
			List1.get(j).click();
			List1.get(j).sendKeys(AllocationAccount);
			System.out.println("account is displayed as - " + AllocationAccount);
		}
	}

	public void scrollUpToTheCancelButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void ScrollUptoDefaultAccount() {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Default_Accounts_Card);
		} catch (NoSuchElementException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Default_Accounts_Card);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,550)", Default_Accounts_Card);
		}
	}

	public void AssertAddJurisdictionAccountsPage() {
		wait.until(ExpectedConditions.elementToBeClickable(managePurchaseLimit));
		String AddAccountText = managePurchaseLimit.getText();
		Assert.assertEquals(AddAccountText, "Add Jurisdiction Accounts");
		System.out.println("Title is displayed as -" + AddAccountText);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as -" + AddAccountText);
	}

	public void ScrollUptoAllocationAccountName() {
		try {
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(allocationAccountNameXpath).build().perform();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,550)", allocationAccountNameXpath);
		}
	}

	public void AddAccountNameInAuctionAccount() {
		List<WebElement> List2 = driver.get().findElements(
				By.xpath("//*[text()='Auction Account']//..//..//..//*[contains(@name ,'accountNameLang')]"));
		for (int k = 0; k < List2.size(); k++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String AuctionAccount = "Account" + randomAccountName;
			List2.get(k).click();
			List2.get(k).sendKeys(AuctionAccount);
			System.out.println("account is displayed as - " + AuctionAccount);
		}
	}

	public void AddAccountNameOnIssuanceAccount() {
		ScrollUptoAllocationAccountName();
		List<WebElement> List = driver.get().findElements(
				By.xpath("//*[text()='Issuance Account']//..//..//..//*[contains(@name ,'accountNameLang')]"));
		for (int i = 0; i < List.size(); i++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String IssuanceAccount = "Account" + randomAccountName;
			List.get(i).click();
			List.get(i).sendKeys(IssuanceAccount);
			System.out.println("account is displayed as - " + IssuanceAccount);
		}
	}

	public void WaitUntilQuickActionsDisplayed01() {
		WebElement firstElement = driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]"));
		for (int i = 0; i < 20; i++) {
			try {
				Module5_1_Pom ref3 = new Module5_1_Pom();
				Module5_2_POM ref1 = new Module5_2_POM();
				Create_Participate_Onboarding_Jurisdiction_Pom test = new Create_Participate_Onboarding_Jurisdiction_Pom();
				driver.get().navigate().refresh();
				ref1.allJurisdictions();
				ref3.scrollHomepageUptoLast();
				test.searchCraetedNewJurisdiction();
				ref1.clickOnQuickActions();
				System.out.println("Clicked the button as it is now enabled.");
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

	public void Creat_Seeded_Inital_Users_In_Onboarding_Status() throws InterruptedException {
		Module5_1_Pom ref3 = new Module5_1_Pom();
		Module5_2_POM ref1 = new Module5_2_POM();
		Create_Participate_Onboarding_Jurisdiction_Pom test = new Create_Participate_Onboarding_Jurisdiction_Pom();
		ref3.clickOnQuickActions();
		ref3.selectInitialUserOptionFromQuickAction();
		ref1.clickOnAddInitialUserButton();
		System.out.println("**********************Create Registrar User*********************************");
		test.CreateRegistrarSeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterInitialUserCreated();
		test.NavigateToNextWindow("catch-all@eqanim-qa.wci-validate.org", "7@S699x^j%7ce69FJm2U",
				RegistrarEmailAddress);
		try {
			test.openMail02("catch-all@eqanim-qa.wci-validate.org", "7@S699x^j%7ce69FJm2U",
					Create_Participate_Onboarding_Jurisdiction_Pom.SeededUserJSA1EmailAddress);
		} catch (Exception e) {
			try {
				test.ClickOnCatchAllAccountOnEmail();
				test.EnterEmailAndClickOnRegistrationLinked(
						Create_Participate_Onboarding_Jurisdiction_Pom.SeededUserJSA1EmailAddress);
			} catch (Exception e1) {
			}
		}
	}

	public void Creat_Seeded_Inital_Users_In_Onboarding_Status01() throws InterruptedException {
		Module5_1_Pom ref3 = new Module5_1_Pom();
		Module5_2_POM ref1 = new Module5_2_POM();
		Create_Participate_Onboarding_Jurisdiction_Pom test = new Create_Participate_Onboarding_Jurisdiction_Pom();
		test.searchCraetedNewJurisdiction();
		ref1.clickOnQuickActions();
		ref1.selectInitialUserOptionFromQuickAction();
		ref3.AsserTitleOnManageInitialUsersPage();
		System.out.println("**********************Create Registrar User*********************************");
		ref1.clickOnAddInitialUserButton();
		test.CreateRegistrarSeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		ref1.clickOnAddInitialUserButton();
		test.CreateJSA1SeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		ref1.clickOnAddInitialUserButton();
		test.CreateJSA2SeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		ref1.clickOnAddInitialUserButton();
		test.CreateAuthoritySeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		test.UserRegistrationForRegistrar();
		test.AssertSeededUserRegistrarDetails();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.CreateUserIdForRegistrarUser();
		driver.get().close();
		test.UserRegistrationForSeededUserJSA1();
		test.AssertSeededUserJSA1Details();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.createUserIdForJSA1User();
		driver.get().close();
		test.UserRegistrationForSeededUserAuthority();
		test.AssertSeededUserAuthorityDetails();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.CreateUserIdForSeesdedAuthorityUser();
	}

	public void create_Jurisdiction_Account_In_Onboarding_Status() throws InterruptedException {
		Module5_1_Pom ref3 = new Module5_1_Pom();
		Create_Participate_Onboarding_Jurisdiction_Pom test = new Create_Participate_Onboarding_Jurisdiction_Pom();
		ref3.scrollHomepageUptoLast();
		test.searchCraetedNewJurisdiction();
		ref3.clickOnQuickActions();
		ref3.clickOnQuickActionAndSelectJurisdictionAccount();
		ref3.assersionOfManageJurisdictionAccountstitle();
		test.ScrollUptoDefaultAccount();
		test.SelectAllocationAccount();
		test.SelectAuctionAccount();
		test.ClickOnContinueButton();
		test.AssertAddJurisdictionAccountsPage();
		test.AddAccountNameOnIssuanceAccount();
		test.AddAccountNameInAllocationAccount();
		test.scrollUpToTheCancelButton();
		test.AddAccountNameInAuctionAccount();
		test.ClickOnContinueButton();
		test.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
		test.AssertSuccessMessageForAccountCreation();
	}

	public void Add_Email_In_Configuration_Settings() {
		Manage_Jurisdiction_Account_Sanity_Scenarios pom = new Manage_Jurisdiction_Account_Sanity_Scenarios();
		Module5_1_Pom ref1 = new Module5_1_Pom();
		Create_Participate_Onboarding_Jurisdiction_Pom test = new Create_Participate_Onboarding_Jurisdiction_Pom();
		ref1.scrollthePageUptoJURISDICTIONMANAGEMENT();
		ref1.ClickOnSettingsOptionOnHomePage();
		ref1.ClickOnJurisdictionUser();
		ref1.ScrollPageUptoTheEntityAccountSettings();
		try {
			List<WebElement> elements = driver.get()
					.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelMedium css-11lqbxm']"));
			if (elements.isEmpty()) {
				ref1.AddEmailForAdministrartor();
				pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
				test.AddEmailForAuthorityInConfigurationSettings(listeners.filePath, "JurisdictionInfromation", 0, 8);
				pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
				ref1.AddEmailForJurisdictionProgramStaff(listeners.filePath, "JurisdictionInfromation", 0, 4);
				pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
				test.AddEmailForJurisdictionSystemAdminInConfigurationSettings(listeners.filePath,
						"JurisdictionInfromation", 0, 4);
				pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
				test.AddEmailForRegistrarInConfigurationSettings(listeners.filePath, "JurisdictionInfromation", 0, 1);
				pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
			} else {
				System.out.println("Elements are present, proceeding with validation.");
				for (WebElement element : elements) {
					System.out.println("Element text: " + element.getText());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		test.ClickOnSaveButtonOnConfigurationSettingPage();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button//*[@data-testid=\"CloseIcon\"])[5]")))
				.click();
	}

	public void ClickOnSaveButtonOnConfigurationSettingPage() {
		CommonLibref.scroll(saveButtonConfigurationSetting, "scrollToTopOFPage", "btnWelcomeProfile DD");
		System.out.println("Click on Save Button");
		ObjectRepo.test.log(Status.PASS, "Click on Save Button");
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonConfigurationSetting));
		try {
			saveButtonConfigurationSetting.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(saveButtonConfigurationSetting).click(saveButtonConfigurationSetting).build()
					.perform();
		}
	}

	public void ClickOnUseAnotherAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(addAnotherUserAccount));
		CommonLibref.click(addAnotherUserAccount, "seleniumClick", "addAnotherUserAccount");
	}

	public void openMail02(String Email, String Password, String Username) {
		driver.get().navigate().to("https://www.google.com/gmail/about/");
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		ClickOnUseAnotherAccount();
		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			elementWithId.click();
		} catch (Exception e) {
			viewMessages.click();
			elementWithId.click();
		}
	}

	public void EnterEmailAndClickOnRegistrationLinked(String Username) {
		try {
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			CommonLibref.click(searchEmail, "seleniumClick", "searchEmail");
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
			wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		}
		try {
			Thread.sleep(10000);
			elementWithId.click();
		} catch (Exception e) {
			viewMessages.click();
			elementWithId.click();
		}
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Set<String> allWindows = driver.get().getWindowHandles();
		while (allWindows.size() == 1) {
			allWindows = driver.get().getWindowHandles();
		}
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void NavigateToNextWindow(String Email, String Password, String Username) throws InterruptedException {
		driver.get().navigate().to("https://www.google.com/gmail/about/");
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
		try {
			wait.until(ExpectedConditions.visibilityOf(firstElement));
			if (firstElement.isDisplayed()) {
				secondElement.click();
			}
		} catch (Exception e) {
			System.out.println("First element is not displayed or not found: " + e.getMessage());
		}
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			try {
				elementWithId.click();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
			}
		} catch (Exception e) {
//			viewMessages.click();
//			elementWithId.click();
			driver.get().findElement(By.xpath("(//*[@email='noreply@qa2.wci-test.org'])[2]")).click();
		}
		String titile = titleOfResentAccountSetUpLinke.getText();
		System.out.println("Title of the email is display like -:" + titile);
		ObjectRepo.test.log(Status.PASS, "Title of the email is display like -:" + titile);
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", registraEmailIdName);
		Thread.sleep(3000);
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);
	}

	public void verifyResendLink(String Email, String Password, String Username) {
		System.out.println("Click on the save button&verify the “Set Up” user account link");
		ObjectRepo.test.log(Status.PASS, "Click on the save button&verify the “Set Up” user account link");
		driver.get().navigate().to("https://www.google.com/gmail/about/");
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
		try {
			wait.until(ExpectedConditions.visibilityOf(firstElement));
			if (firstElement.isDisplayed()) {
				secondElement.click();
			}
		} catch (Exception e) {
			System.out.println("First element is not displayed or not found: " + e.getMessage());
		}
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			elementWithId.click();
		} catch (Exception e) {
			viewMessages.click();
			elementWithId.click();
		}
		String titile = titleOfResentAccountSetUpLinke.getText();
		System.out.println("Title of the email is display like -:" + titile);
		ObjectRepo.test.log(Status.PASS, "Title of the email is display like -:" + titile);
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		int noOfLinksFound = linkContainingHref.size();
		if (noOfLinksFound > 0) {
			linkContainingHref.get(noOfLinksFound - 1).click();
		} else {
			System.out.println("No links found!");
		}
		Common.pageLoader();
		Set<String> allWindows = driver.get().getWindowHandles();
		while (allWindows.size() == 1) {
			allWindows = driver.get().getWindowHandles();
		}
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
		System.out.println("Resend Link must get activated.");
		ObjectRepo.test.log(Status.PASS, "Resend Link must get activated.");
	}

	public void FilldataOnInitialUsersPage() {
		wait.until(ExpectedConditions.elementToBeClickable(headingsetUpInitialUsers));
		String acualtext1 = headingsetUpInitialUsers.getText();
		Assert.assertEquals(acualtext1, "Set Up Initial Users");
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(6);
		addFirstName.sendKeys(s);
		Text = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + Text);
		CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		String s1 = RandomStringUtils.randomAlphabetic(6);
		addlastName.sendKeys(s1);
		Text1 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + Text1);
		CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "registrar" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		emailIdFiled.sendKeys(Keys.TAB);
		SeededUserRegistrar = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Registrar Email Address displayed - " + SeededUserRegistrar);
		ObjectRepo.test.log(Status.PASS, "Registrar Email Address displayed - " + SeededUserRegistrar);
		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys("Registrar");
		registarXpath.click();
		userRole = storedRole.getAttribute("Value");
		SeededUserRegistrar = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void verifyThePermanentlyUnlockFunctionality() {
		Module5_4_Pom ref1 = new Module5_4_Pom();
		Module5_4_SetupInitialUsers_POM ref3 = new Module5_4_SetupInitialUsers_POM();
		for (int i = 0; i < 20; i++) {
			try {
				ref1.LoginWithWrongPassword();
				ref3.ErrorMessageOfPermanentLock();
				break;
			} catch (Exception e) {
				ref1.LoginWithWrongPassword();
				ref3.ErrorMessageOfPermanentLock();
				driver.get().navigate().refresh();
			}
		}
	}

	public void searchEmailIdOfSeededUser() {
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfInitialUsers));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfInitialUsers));
		CommonLibref.click(searchFieldOfInitialUsers, "seleniumClick", "SearchUser");
		searchFieldOfInitialUsers.sendKeys(Create_Participate_Onboarding_Jurisdiction_Pom.RegistrarEmailAddress);
		System.out.println("Enter Email ID =" + Create_Participate_Onboarding_Jurisdiction_Pom.RegistrarEmailAddress);
	}

	public void createJSA2User() throws InterruptedException {
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
				.println("Step: Select valid security questions and enter valid answers for these security questions.");
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1)).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[text()='What was the last name of your third-grade teacher?']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='In which year did you get your first credit card?']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"What is your maternal grandmother's maiden name?\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
//wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox)).click();
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
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}
	public void createdRegistrarUserId() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId)).sendKeys(generateUserIdForRegistrar());
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role='option'])[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer1)).sendKeys("teacher");
		CommonLibref.scroll(answer1, "scrollToBottomOFPage", "answer1");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(secQuestion2, "moveToElementClick", "secQuestion2");
//wait.until(ExpectedConditions.elementToBeClickable(secQuestion2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role='option'])[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer2)).sendKeys("card");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@role='option'])[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(answer3)).sendKeys("name");
		CommonLibref.scroll(termsOfUseCheckBox, "scrollToBottomOFPage", "termsOfUseCheckBox");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
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
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}
}
