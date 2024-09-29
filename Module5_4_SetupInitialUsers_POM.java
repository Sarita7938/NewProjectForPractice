package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import static constants.ThreadConstants.driver;
import static Utilities.listeners.prop;
import static Utilities.listeners.wait;

public class Module5_4_SetupInitialUsers_POM {

	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();

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
	// String registrarUserId1= "reg.test50";
	// public static String storedEmailIdFiled;
	Create_Participate_Onboarding_Jurisdiction_Pom cp = new Create_Participate_Onboarding_Jurisdiction_Pom();

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement searchJurisdiction;

	@FindBy(xpath = "//*[contains(text(),'SETUP INITIAL USERS')]")
	private WebElement selectSetupInitialUser;

	@FindBy(xpath = "//*[contains(text(),'MANAGE INITIAL USERS')]")
	private WebElement selectManageInitialUser;

	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;

	@FindBy(xpath = "//label[@for='customize-textfield']//..//..//input[@id='firstName']") // input[@id='firstName']
	private WebElement addFirstName;

	@FindBy(xpath = "//label[@for='customize-textfield']//..//..//input[@id='lastName']") // input[@id='lastName']
	private WebElement addlastName;

	@FindBy(xpath = "//input[@name='emailAddress']")
	private WebElement addEmailAddress;

	@FindBy(xpath = "//label[text()='Role']//..//input[@type='text']")
	private WebElement addRole;

	@FindBy(xpath = "//label[text()='Role']//..//*[@data-testid='ArrowDropDownIcon']")
	private WebElement dropdownArrowOnRole;

//	@FindBy(xpath = "//h1[text()='Set Up Initial Users']")
//	private WebElement setUpInitialUsers;

	@FindBy(xpath = "//*[contains(text(),'Set Up Initial Users')]")
	private WebElement headingsetUpInitialUsers;

	@FindBy(xpath = "//label[text()='First Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedFirstName;

	@FindBy(xpath = "//label[text()='Last Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedLastName;

	@FindBy(xpath = "//label[text()='Email Address']//..//.. //input[@id='emailAddress']")
	private WebElement storedEmailId;

	@FindBy(xpath = "//label[text()='Role']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement storedRole;

	@FindBy(xpath = "//*[@for='customize-select']")
	private WebElement roletitle;

	@FindBy(xpath = "(//*[@for='customize-textfield'])[3]")
	private WebElement emailTitle;

	@FindBy(xpath = "(//*[@for='customize-textfield'])[2]")
	private WebElement lastNameTitlexpath;

	@FindBy(xpath = "(//*[@for='customize-textfield'])[1]")
	private WebElement firstNameTitlexpath;

	@FindBy(xpath = "//*[text()='Registrar']")
	private WebElement registarXpath;

	@FindBy(xpath = "//*[text()='Authority']")
	private WebElement authorityXpath;

	@FindBy(xpath = "//*[@data-testid='cancelBtn']")
	private WebElement xpathCancelBtn;

	@FindBy(xpath = "//p[@id='firstName-helper-text']")
	private WebElement errorSpaceForFirstName;

	@FindBy(xpath = "//*[@data-testid='submitBtn']")
	private WebElement saveBtnofSetUPInitalUser;

	@FindBy(xpath = "//p[text()='EDIT']")
	private WebElement editOption;

	@FindBy(xpath = "//p[text()='REMOVE USER']")
	private WebElement removeUserOption1;

	@FindBy(xpath = "//*[text()='ACTIVATE']")
	private WebElement activateOption;

	@FindBy(xpath = "//p[text()='DEACTIVATE']")
	private WebElement deactivateOption;

	@FindBy(xpath = "//h2[text()='Initial Users']//..//..//input[@placeholder='Search…']")
	private WebElement searchFieldOnInitialUsers;

	@FindBy(xpath = "//*[contains(@name,'deactiveProfileReason')]")
	private WebElement deactivateUserReasonfield;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement continueBtnOndeactivatepopup;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement sucessMessageOfDeactivateUserReason;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement continueBtnOfActivateUser;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageOfActivateUserReason;

	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon;

	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossSignOnMessage;
	
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CloseIcon')]")
	private WebElement crossIcon1;

	@FindBy(xpath = "//*[@data-testid='view-all-records-btn']")
	private WebElement addInitialUserButton;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageOfEditInitialUser;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageOfRemoveUser;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement errorMessageOfUnlockUser;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement errorMessageOfPermanentLockUser;

	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement closeIcon;

	@FindBy(xpath = "//*[text()='Error!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement errorcloseIcon;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[1]") // h2[text()='Initial
	private WebElement quickActionsOfFirstUser;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement removeuserBtnOnWarningpopup;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successmessageOfResendLink;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-1hwpmpt']")
	private WebElement xpathOfSideClickAnywhere;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-4cc3qo']//..//..//input[@placeholder='Search…']")
	private WebElement ManageInitialUserspagesearch;

	@FindBy(xpath = "//*[contains(text(),'UNLOCK PERMANENTLY LOCKED USER')]")
	private WebElement unlockPermanentlyLockedUser;

	@FindBy(xpath = "//*[contains(text(),'RESEND ACCOUNT SET UP LINK')]")
	private WebElement resendAccountSetupLink;

	@FindBy(xpath = "/html/body/header/div/div/div/a[2]")
	private WebElement signInButton;

	@FindBy(id = "identifierId")
	private WebElement emailField;
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterEmail;
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	private WebElement passwordField;
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterPassword;
	@FindBy(xpath = "(//tbody//tr[1])[6]")
	private WebElement firstEmail;
	@FindBy(xpath = "//*[@placeholder='Search mail']")
	private WebElement searchEmail;
	@FindBy(xpath = "(//table)[6]//tbody//tr")
	WebElement elementWithId;
	@FindBy(xpath = "((//table)[6]//tbody//tr)[2]")
	WebElement elementWithId2;

	@FindBy(xpath = "//*[text()='View messages']")
	WebElement viewMessages;
	@FindBy(xpath = "//*[contains(@href, 'wci-registry.org/create-user-profile?LinkID=')]")
	List<WebElement> linkContainingHref;

	@FindBy(xpath = "//*[@placeholder='Email Address...']")
	private WebElement emailIdFiled;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	private WebElement fieldEmailAddress;
	@FindBy(xpath = "//*[text()='Email Address']//..//..//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedEmailIdFiled;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CloseIcon')]")
	private WebElement CrossIcon1;

	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	public WebElement Successpopupclosebutton;

	@FindBy(xpath = "//*[text()='Initial Users']//..//..//*[@placeholder=\"Search…\"]")
	public WebElement searchFieldOfInitialUsers;

	@FindBy(xpath = "//a[contains(text(),'https://qa2.wci-registry.org')]")
	private WebElement oldLink;

	@FindBy(xpath = "(//*[@class='lm'])[2]")
	private WebElement selectOldLink;

	@FindBy(xpath = "(//*[@class='lm'])[1]")
	private WebElement removeLink;

	@FindBy(xpath = "//*[text()='This link is no longer valid.']")
	private WebElement linkNoLongarValidText;

	@FindBy(xpath = "//*[@aria-label='Advanced search options']")
	private WebElement filteroptionOngmailpage;

	@FindBy(xpath = "//*[@aria-owns=':p0']")
	private WebElement xpathOfToFieldOnGmail;

	@FindBy(xpath = "//label[text()='Subject']//..//..//*[@class='ZH nr aQd']")
	private WebElement xpathOfSubjectField;

	@FindBy(xpath = "//*[@aria-label='Search Mail']")
	private WebElement xpathOFSearchBtnONGmail;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement userIDField;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement PassphraseField;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxRememberMe;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[contains(text(),'Success!')]//..//*[@data-testid='CloseIcon']")
	private WebElement closeIcon2;

	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter MuiTypography-gutterBottom css-uqt142')]")
	private WebElement oldLinkMessage;

	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[1]")
	private WebElement quickActionOfRegistrarPage;

	@FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')])[1]") // *[text()='Welcome,']
	private WebElement clickOnDropdown;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement logoutOption;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement textBoxPassWord;

//	@FindBy(xpath = "//input[@name='email']")
//	private WebElement userIDField;

	// Service provider selection
	@FindBy(xpath = "//button[@id='/more-options-in-auction']")
	private WebElement MoreOption;

	@FindBy(xpath = "//a[text()='Service Provider Selection And Management']")
	private WebElement ServiceProviderselection;

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root')]//h1[contains(@class,'MuiTypography-root')]")
	private WebElement ServiceProviderselectionheader;

	@FindBy(xpath = "//div[contains(@class,'MuiBox-root')]/h2/following-sibling::button[contains(@class,'MuiButtonBase-root') and contains(text(),'EDIT')]")
	private WebElement EditButton;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-j4m1we'])[7]")
	private WebElement AssignedJU;

	@FindBy(xpath = "(//*[contains(@class,'MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch')])[1]")
	private WebElement searchuser;

	@FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[4]")
	private WebElement firstcheckbox;

	@FindBy(xpath = "//button[2][contains(@data-testid,'priv_btn_Search')]")
	private WebElement yesButton;

	@FindBy(xpath = "//*[contains(text(),'MENU')]")
	private WebElement menuBtnOnRegistarHomePage;

	@FindBy(xpath = "//*[contains(text(),'SAVE')]")
	private WebElement saveBtnOnServiceProviderPage;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement Serviceproviderselectionsucessmsg;

	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement save;

	@FindBy(xpath = "//div[contains(@class,'messageModel MuiBox-root')]//*[contains(@data-testid,'CloseIcon')]")
	private WebElement Successmsg_close1;

	// Xpath of Quick Actions Submenu On Registar Home Page
	@FindBy(xpath = "(//input[@placeholder='Search…'])[1]")
	private WebElement searchField;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement userid;

	@FindBy(xpath = "(//a[@class='link-cell'])[1]")
	private WebElement searchRecordFirstname;

	@FindBy(xpath = "(//*[@data-testid='more-actions'])[1]")
	private WebElement threeDots;

	@FindBy(xpath = "//*[contains(text(),'DEACTIVATE USER LOG-IN')]")
	private WebElement deactivateUserLoginOption;

	@FindBy(xpath = "//*[contains(text(),'Deactivate with profile access')]//..//*[@data-testid='RadioButtonUncheckedIcon']")
	private WebElement deactivateWithProfileAccessRadioButton;

	@FindBy(xpath = "//input[@id='deactiveProfileReason']")
	private WebElement deactivateUserReasons;

	@FindBy(xpath = "//*[contains(text(),'Deactivate without profile access')]//..//*[@data-testid='RadioButtonUncheckedIcon']")
	private WebElement deactivatewithoutprofileaccess;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	private WebElement continueButtonOnDeactivateUserPopup;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterRegistrarDeactivateUserWithoutProfileAccess;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv' and @data-testid='CloseIcon']")
	private WebElement crossButtonOnSuccMessAuthorityApproval;

	@FindBy(xpath = "//*[contains(text(),'INACTIVATE USER - CLOSE ACCOUNT')]")
	private WebElement inactivateUserClosedAccountOption;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement closeUserAccountButtonForInactiveUserCloseAccountPoup;

	@FindBy(xpath = "//input[@id='inctiveReasons']")
	private WebElement commentForInactiveUserCloseAccountPoup;

	@FindBy(xpath = "//*[contains(text(),'UPDATE PHONE AND EMAIL')]")
	private WebElement updateEmailOption;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement userEmailFieldOnEditUserEmailPopup;

	@FindBy(xpath = "//input[@id='telephoneNumber']")
	private WebElement telephonefieldOnPopup;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Continue']")
	private WebElement proposeButtonOnEditUserEmailPopup;

	@FindBy(xpath = "//*[contains(text(),'RESET SECURITY QUESTIONS AND PASSPHRASE')]")
	private WebElement resetSecurityQueAndPassphraseOption;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageForResetPassphrase;

	@FindBy(xpath = "//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossButtonOnErrorMessageAfterLogin2;

	@FindBy(xpath = "//*[text()='ACTIVATE USER LOG-IN']")
	private WebElement activateUserLogin;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterRegistrarActivateUserLogin;

	@FindBy(xpath = "//*[contains(text(),'INACTIVATE USER - PROFILE ACCESS ONLY')]")
	private WebElement inactivateUserLoginWithProfileAccess;

	@FindBy(xpath = "//input[@id='inctiveReasons']")
	private WebElement inactivateUserReasons;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	private WebElement continueButtonOnInactiveUserPopup;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageInactivateUserWithProfileAccess;

	@FindBy(xpath = "//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement closeIcon4;

	@FindBy(xpath = "//*[contains(text(),'USER MANAGEMENT')]")
	private WebElement scrollUptoUSerManagementRegPage;

	@FindBy(xpath = "(//*[@data-testid='ExpandMoreIcon'])[1]")
	private WebElement userManagementexpandarrow;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-gz6s05'])[2]")
	private WebElement hyperlinkOfUser;

	@FindBy(xpath = "//*[contains(text(),'PROPOSED TELEPHONE NUMBER AND/OR EMAIL ADDRESS')]")
	private WebElement proposedTelephoneandEmail;

	@FindBy(xpath = "//*[contains(@name,'Approved')]//..//*[@data-testid='RadioButtonUncheckedIcon']")
	private WebElement radioBtnOfApproveOfPhoneandEmail;

	@FindBy(xpath = "//*[contains(text(),'save')]")
	private WebElement clickOnSaveBtnOFRegistrarPage;

	@FindBy(xpath = "//input[@data-testid='passphrase']")
	public WebElement PassphraseTextBox1;

	@FindBy(xpath = "//*[contains(text(),'SUBMIT')]")
	public WebElement submitBtnOnPopUpOfRegPage;

	@FindBy(xpath = "//*[contains(text(),'SUBMIT')]")
	public WebElement successmsgOfPhoneandemailApproval;
	@FindBy(xpath = "  //*[contains(@class,'hP')]")
	public WebElement titleOfResentAccountSetUpLinke;
	
	@FindBy(xpath = "//a[contains(@href, 'myaccount.google.com/signinoptions/two-step-verification')]")
	WebElement firstElement;

	@FindBy(xpath = "//a[contains(@href, 'accounts.google.com/ServiceLogin?continue=https%')]")
	WebElement secondElement;

	public Module5_4_SetupInitialUsers_POM() {
		PageFactory.initElements(driver.get(), this);
	}

	public static String generateEmailString() {
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		String randomString = ("Test" + generatedString + "@eqanim-qa.wci-validate.org");
		return randomString;
	}

	public void SelectJurisdiction1() {

		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("North Dakota");
		System.out.println("Enter Jurisdiction Name =" + "North Dakota");
	}

	public void SelectJurisdiction3() {

		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("Test 50");
		System.out.println("Enter Jurisdiction Name =" + "Test 50");
	}

	public void selectInitialUserFromQuickAction1() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectSetupInitialUser));
			CommonLibref.click(selectSetupInitialUser, "javascriptClick", "selectSetupInitialUser");

			ObjectRepo.test.log(Status.PASS, "Click on Setup Initial Users from Quick Actions");
			System.out.println("Click on Setup Initial Users from Quick Actions");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(selectSetupInitialUser));
			selectSetupInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Click on Setup Manage Users from Quick Actions");
			System.out.println("Click on Setup Manage Users from Quick Actions");
		}
	}

	public void ScrollUptoCancelButton() {
		wait.until(ExpectedConditions.visibilityOf(xpathCancelBtn));
		CommonLibref.scroll(xpathCancelBtn, "scrollToBottomOFPage", "CancelButton");
	}

	// Add Initial Users
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

//		randomEmailId = RandomStringUtils.randomAlphabetic(8);
//		randomEmailId = randomEmailId + "@eqanim-qa.wci-validate.org";
//		storedEmailId.sendKeys(randomEmailId);
//		StoredEmailAddress = storedEmailId.getAttribute("Value");
//		System.out.println("Email Address displayed - " + StoredEmailAddress);
//		ObjectRepo.test.log(Status.PASS, "Email Address displayed - " + StoredEmailAddress);
//		System.out.println("*****************************************************************");

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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userRole = storedRole.getAttribute("Value");
		SeededUserRegistrar = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void ValidEmail() {
		System.out.println("Steps: Enter valid data in the Email Address  field.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter valid data in the Email Address  field.");
//		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
//		String randomEmailId = RandomStringUtils.randomAlphabetic(8);
//		String randomEmailId01 = "registrar" + randomEmailId + "@eqanim-qa.wci-validate.org";
//		String Lowercase = randomEmailId01.toLowerCase();
//		emailAddress.sendKeys(Lowercase);
//		wait.until(ExpectedConditions.visibilityOf(emailAddress));
//		 ValidEmailField = emailAddress.getText();
//		System.out.println("Enter valid data in the Email Address  field- " + ValidEmailField);
//		ObjectRepo.test.log(Status.PASS, "Enter valid data in the Email Address  field-" + ValidEmailField);

		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "registrar" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		emailIdFiled.sendKeys(Keys.TAB);
		SeededUserRegistrar = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Registrar Email Address displayed - " + SeededUserRegistrar);
		ObjectRepo.test.log(Status.PASS, "Registrar Email Address displayed - " + SeededUserRegistrar);
	}

	/*
	 * System.out.println(
	 * "*****************************************************************");
	 * System.out.println("Steps:Enter Valid data in First Name");
	 * ObjectRepo.test.log(Status.PASS, "Steps:Enter Valid data in First Name ");
	 * wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
	 * CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
	 * addFirstName.sendKeys(Keys.CONTROL, "a");
	 * addFirstName.sendKeys(Keys.BACK_SPACE);
	 * addFirstName.sendKeys("AuthorityOne"); String Text =
	 * errorSpaceForFirstName.getText();
	 * System.out.println("The appropriate error message should get displyed as - "
	 * + Text); // Assert.assertEquals(errorSpaceForFirstName.getText(),
	 * "Please enter valid First Name"); ObjectRepo.test.log(Status.PASS,
	 * "The appropriate error message should get displyed as - " + Text);
	 * 
	 * System.out.println(
	 * "*****************************************************************");
	 * System.out.println("Steps:Enter Valid data in Last Name");
	 * ObjectRepo.test.log(Status.PASS, "Steps:Enter Valid data in Last Name ");
	 * wait.until(ExpectedConditions.elementToBeClickable(addlastName));
	 * CommonLibref.click(addlastName, "javascriptClick", "addLastName");
	 * addlastName.sendKeys(Keys.CONTROL, "a");
	 * addlastName.sendKeys(Keys.BACK_SPACE); addlastName.sendKeys("Fiftyyy");
	 * String Text1 = errorSpaceForFirstName.getText();
	 * System.out.println("The appropriate error message should get displyed as - "
	 * + Text1); // Assert.assertEquals(errorSpaceForFirstName.getText(),
	 * "Please enter valid Last Name"); ObjectRepo.test.log(Status.PASS,
	 * "The appropriate error message should get displyed as - " + Text1);
	 * 
	 * System.out.println(
	 * "*****************************************************************");
	 * System.out.println("Steps:Enter Valid data in Email ");
	 * ObjectRepo.test.log(Status.PASS, "Steps:Enter Valid data in Email  ");
	 * wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress));
	 * CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
	 * addEmailAddress.sendKeys(Keys.CONTROL, "a");
	 * addEmailAddress.sendKeys(Keys.BACK_SPACE);
	 * addEmailAddress.sendKeys("authority51@eqanim-qa.wci-validate.org"); String
	 * Text2 = errorSpaceForFirstName.getText();
	 * System.out.println("The appropriate error message should get displyed as - "
	 * + Text2); // Assert.assertEquals(errorSpaceForFirstName.getText(),
	 * "Please enter valid Email "); ObjectRepo.test.log(Status.PASS,
	 * "The appropriate error message should get displyed as - " + Text2);
	 */

	/*
	 * CommonLibref.click(addRole, "javascriptClick", "addRole");
	 * addRole.sendKeys("Registrar"); registarXpath.click(); userRole =
	 * storedRole.getAttribute("Value"); System.out.println("Role is displayed - " +
	 * userRole); ObjectRepo.test.log(Status.PASS, "Role is displayed - " +
	 * userRole);
	 */

	public void SuccessMessageOfEditInitialUser() {
		wait.until(ExpectedConditions.visibilityOf(successMessageOfEditInitialUser));

		if (successMessageOfEditInitialUser.isDisplayed()) {
			String successsMessage2 = successMessageOfEditInitialUser.getText();
			Assert.assertEquals(successsMessage2, "The user has been successfully assigned to the Jurisdiction.");
			ObjectRepo.test.log(Status.PASS, "The user has been successfully assigned to the Jurisdiction.");
			System.out.println("The user has been successfully assigned to the Jurisdiction.");

		} else {
			System.out.println("Assert Failed");
		}
		wait.until(ExpectedConditions.elementToBeClickable(closeIcon));
		CommonLibref.click(closeIcon, "seleniumClick", "closeIcon");

	}

	public void SuccessMessageOfRemoveUser() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(successMessageOfRemoveUser));

		if (successMessageOfRemoveUser.isDisplayed()) {
			String successsMessage2 = successMessageOfRemoveUser.getText();
			Assert.assertEquals(successsMessage2, "The user has successfully been removed.");
			ObjectRepo.test.log(Status.PASS, successsMessage2 + " - Removed message is display");
			System.out.println(successsMessage2 + " - Removed message is display");

		} else {
			System.out.println("Assert Failed");
		}
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "closeIcon");

	}

	public void clickOnSaveButton1() {
		wait.until(ExpectedConditions.elementToBeClickable(saveBtnofSetUPInitalUser));
		CommonLibref.click(saveBtnofSetUPInitalUser, "javascriptClick", "saveBtnofSetUPInitalUser");
		ObjectRepo.test.log(Status.PASS, "Steps : Click On Save button");
		System.out.println("");
		System.out.println("Steps : Click On Save button");
	}

	public void ClickOntheFirstUserQuickActions() {
		try {

			Actions action = new Actions(driver.get());
			action.moveToElement(quickActionsOfFirstUser).click(quickActionsOfFirstUser).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Manage Initial Users Page");
			System.out.println("Step :Click on Quick Action of Locked User");
		} catch (Exception e) {
			// quickActionsOfFirstUser.click();
			wait.until(ExpectedConditions.elementToBeClickable(quickActionsOfFirstUser));
			CommonLibref.click(quickActionsOfFirstUser, "seleniumClick", "Quick Actions of First User");
			ObjectRepo.test.log(Status.PASS, "Steps: Click on first user of Quick Actions");
			System.out.println("Click on first user of Quick Actions");
		}

	}

	public void verifyTheRemoveOptionDisplayedOrNotInQuickActons1() {
		if (removeUserOption1.isEnabled()) {
			Assert.assertEquals(removeUserOption1.isEnabled(), true);
			ObjectRepo.test.log(Status.PASS, "REMOVE USER option is enable");
			System.out.println("REMOVE USER option is enable");
		} else {
			Assert.assertEquals(removeUserOption1.isEnabled(), false);
			ObjectRepo.test.log(Status.PASS, "REMOVE USER is not enable");
			System.out.println("REMOVE USER is not enable");
		}
	}

	public void ClickOnRemoveUseroption() {
		wait.until(ExpectedConditions.elementToBeClickable(removeUserOption1));
		CommonLibref.click(removeUserOption1, "javascriptClick", "removeUserOption");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Remove user Option From DropDown");
		System.out.println("Click on Remove user Option From DropDown");

	}

	public void RemoveUserBtnOfWarningPopup() {
		ObjectRepo.test.log(Status.PASS, "Steps:Click On Remove User Button");
		System.out.println("Steps:Steps:Click On Remove User Button");
		removeuserBtnOnWarningpopup.click();
		Common.pageLoader();
	}

	/*
	 * wait.until(ExpectedConditions.elementToBeClickable(addlastName));
	 * CommonLibref.click(addlastName, "javascriptClick", "addlastName"); String s1
	 * = RandomStringUtils.randomAlphabetic(6); addlastName.sendKeys(s1); Text1 =
	 * storedLastName.getAttribute("Value");
	 * System.out.println("Last name is displayedas - " + Text1);
	 * CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
	 * System.out.println(
	 * "*****************************************************************");
	 * 
	 * randomEmailId = RandomStringUtils.randomAlphabetic(8); randomEmailId =
	 * randomEmailId + "@eqanim-qa.wci-validate.org";
	 * storedEmailId.sendKeys(randomEmailId); StoredEmailAddress =
	 * storedEmailId.getAttribute("Value");
	 * System.out.println("Email Address displayed - " + StoredEmailAddress);
	 * ObjectRepo.test.log(Status.PASS, "Email Address displayed - " +
	 * StoredEmailAddress); System.out.println(
	 * "*****************************************************************");
	 * 
	 * CommonLibref.click(addRole, "javascriptClick", "addRole");
	 * addRole.sendKeys("Registrar"); registarXpath.click(); userRole =
	 * storedRole.getAttribute("Value"); System.out.println("Role is displayed - " +
	 * userRole); ObjectRepo.test.log(Status.PASS, "Role is displayed - " +
	 * userRole); }
	 */

	public void selectDeactivateFromQuickAction() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
			searchFieldOnInitialUsers.click();

			ObjectRepo.test.log(Status.PASS, "Click on Deactivate from Quick Actions");
			System.out.println("Click on Deactivate from Quick Actions");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(deactivateOption));
			deactivateOption.click();
			ObjectRepo.test.log(Status.PASS, "Click on Deactivate from Quick Actions");
			System.out.println("Click on Deactivate from Quick Actions");
		}
	}

	public void EnterDataInUserReasonPopup() {
		wait.until(ExpectedConditions.visibilityOf(deactivateUserReasonfield));
		CommonLibref.click(deactivateUserReasonfield, "seleniumClick", "addAddress1");
		deactivateUserReasonfield.sendKeys("Testing");
		UserReasonfield = deactivateUserReasonfield.getAttribute("Value");
		System.out.println(UserReasonfield);
	}

	public void ContinueBtnOfUserReasonField() {
		ObjectRepo.test.log(Status.PASS, "Steps:Click On Continue Button");
		System.out.println("Steps:Steps:Click On Continue Button");
		continueBtnOndeactivatepopup.click();
	}

	public void DeactivateUserSuccessMessage() {

//		wait.until(ExpectedConditions.visibilityOf(sucessMessageOfDeactivateUserReason));
			String successsMessage = sucessMessageOfDeactivateUserReason.getText();
		//	Assert.assertEquals(successsMessage, "Deactivated user successfully.");
			ObjectRepo.test.log(Status.PASS, successsMessage);
			System.out.println(successsMessage);
  		    Common.pageLoader();
//		    wait.until(ExpectedConditions.visibilityOf(crossIcon));
//		    wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
//		    CommonLibref.click(crossIcon, "seleniumClick", "CrossIcon");
	}
	public void DeactivateSeededUser() {
//		wait.untilhedConditions.visibilityOf(sucessMessageOfDeactivateUserReason));

		if (sucessMessageOfDeactivateUserReason.isDisplayed()) {
			String successsMessage = sucessMessageOfDeactivateUserReason.getText();
			Assert.assertEquals(successsMessage, "Deactivated user successfully.");
			ObjectRepo.test.log(Status.PASS, "Deactivated user successfully.");
			System.out.println("Deactivated user successfully.");

		} else {
			System.out.println("Assert passed");
		}
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(crossSignOnMessage));
		wait.until(ExpectedConditions.elementToBeClickable(crossSignOnMessage));
		CommonLibref.click(crossSignOnMessage, "seleniumClick", "CrossIcon");
        Common.pageLoader();
	}

	public void selectActivateFromQuickAction() {
		wait.until(ExpectedConditions.elementToBeClickable(activateOption));
		activateOption.click();
		ObjectRepo.test.log(Status.PASS, "Click on Activate from Quick Actions");
		System.out.println("Click on Activate from Quick Actions");
	}

	public void ContinueBtnOfActivateUser() {
		ObjectRepo.test.log(Status.PASS, "Steps:Click On Continue Button");
		System.out.println("Steps:Steps:Click On Continue Button");
		wait.until(ExpectedConditions.visibilityOf(continueBtnOfActivateUser));
		wait.until(ExpectedConditions.elementToBeClickable(continueBtnOfActivateUser));
		continueBtnOfActivateUser.click();
		Common.pageLoader();
	}

	public void ActivateUserSuccessMessage() {
//		wait.until(ExpectedConditions.visibilityOf(successMessageOfActivateUserReason));

		if (successMessageOfActivateUserReason.isDisplayed()) {
			String successsMessage1 = successMessageOfActivateUserReason.getText();
			Assert.assertEquals(successsMessage1,
					"Account status is changed to Active. The user can login to the system.");
			ObjectRepo.test.log(Status.PASS, "Account status is changed to Active. The user can login to the system.");
			System.out.println("Account status is changed to Active. The user can login to the system.");

		} else {
			System.out.println("Assert Failed");
		}
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "CrossIcon");

	}

	// public void UnlockUserPermanentlyLockedUser() {
//		try {
//			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
//			CommonLibref.typeText(textBoxEmail, prop.getProperty("JSASeededUserID1"), "textBoxEmail");
//			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID1"));
//			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase1"), "textBoxPassWord");
//			ObjectRepo.test.log(Status.PASS,
//					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
//			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
//			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
//		} catch (Exception e) {
//			CommonLibref.click(btnLogin2, "moveToElementClick", "btnLogin2");
//			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
//			CommonLibref.typeText(textBoxEmail, prop.getProperty("JSASeededUserID1"), "textBoxEmail");
//			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID1"));
//			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase1"), "textBoxPassWord");
//			ObjectRepo.test.log(Status.PASS,
//					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
//			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
//			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");

	// }

	public void ErrorMessageOfUnlockUser() {
		wait.until(ExpectedConditions.visibilityOf(errorMessageOfUnlockUser));

		if (errorMessageOfUnlockUser.isDisplayed()) {
			String errorMessage = errorMessageOfUnlockUser.getText();
			Assert.assertEquals(errorMessage, "User ID or passphrase entered is invalid.");
			ObjectRepo.test.log(Status.PASS, "User ID or passphrase entered is invalid.");
			System.out.println("User ID or passphrase entered is invalid.");

		} else {
			System.out.println("Assert Failed");
		}
		wait.until(ExpectedConditions.elementToBeClickable(errorcloseIcon));
		CommonLibref.click(errorcloseIcon, "seleniumClick", "errorcloseIcon");
		xpathOfSideClickAnywhere.click();

	}

	public void ErrorMessageOfPermanentLock() {

		if (errorMessageOfPermanentLockUser.isDisplayed()) {
			String errorMessage1 = errorMessageOfPermanentLockUser.getText();
			Assert.assertEquals(errorMessage1, "You are permanently blocked!.");
			ObjectRepo.test.log(Status.PASS, "You are permanently blocked!.");
			System.out.println("You are permanently blocked!.");

		} else {
			System.out.println("Assert Failed");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(errorcloseIcon, "seleniumClick", "errorcloseIcon");

	}

	public void searchUserID() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ManageInitialUserspagesearch));
		CommonLibref.click(ManageInitialUserspagesearch, "javascriptClick", "ManageInitialUserspagesearch");
		searchJurisdiction.sendKeys("auth.55");
		System.out.println("Enter Jurisdiction Name =" + "auth.55");
	}

	public void logOutUser1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(clickOnDropdown));
		CommonLibref.click(clickOnDropdown, "seleniumClick", "clickOnDropdown");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Welcome");
		System.out.println("Click on Welcome");
		wait.until(ExpectedConditions.elementToBeClickable(logoutOption));
		CommonLibref.click(logoutOption, "seleniumClick", "logoutOption");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Log Out Option");
		System.out.println("Click on Log Out Option");
	}

	public void clickOnQuickActionsOfManageInitialUsers() {
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
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Manage Initial Users Page");
			System.out.println("Step :Click on Quick Action of Locked User");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", quickActions2);
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Manage Initial Users Page");
			System.out.println("Step :Click on Quick Action of Locked User");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Manage Initial Users Page");
			System.out.println("Step :Click on Quick Action of Locked User");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ClickOnUnlockPermanentlyLockedUser() {
		wait.until(ExpectedConditions.elementToBeClickable(unlockPermanentlyLockedUser));
		unlockPermanentlyLockedUser.click();

		String successMessage = successmessageOfResendLink.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
		Assert.assertEquals("The user account has been unlocked and status reverted.", successMessage);
	}

	public void ClickOnAddInitialUserButton1() {
		// wait.until(ExpectedConditions.elementToBeClickable(addInitialUserButton));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(addInitialUserButton));
			CommonLibref.click(addInitialUserButton, "moveToElementClick", "addInitialUserButton");

		} catch (NoSuchElementException e) {
			wait.until(ExpectedConditions.elementToBeClickable(addInitialUserButton));
			addInitialUserButton.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Add Initial User");
			System.out.println("Step:Click on Add Initial User");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(addInitialUserButton).click(addInitialUserButton).build().perform();
			System.out.println("Step: Click on Add Initial User");
			ObjectRepo.test.log(Status.PASS, "Step: Click on Add Initial User");
		}
	}

	public void clickOnQuickActions2() {

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
	}

	public void ResendAccountSetUpLink() {
		wait.until(ExpectedConditions.elementToBeClickable(resendAccountSetupLink));
		try {

			wait.until(ExpectedConditions.elementToBeClickable(resendAccountSetupLink));
			Actions action = new Actions(driver.get());
			action.moveToElement(resendAccountSetupLink).click(resendAccountSetupLink).build().perform();
			Common.pageLoader();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on RESEND ACCOUNT SET UP LINK.");
			System.out.println("Steps:Click on RESEND ACCOUNT SET UP LINK.");

		} catch (NoSuchElementException e)

		{
			wait.until(ExpectedConditions.elementToBeClickable(resendAccountSetupLink));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", resendAccountSetupLink);
			Common.pageLoader();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on RESEND ACCOUNT SET UP LINK.");
			System.out.println("Steps:Click on RESEND ACCOUNT SET UP LINK.");
		}
	}

	public void SuccessmessageOfResendLink() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(successmessageOfResendLink));
		String successMessage = successmessageOfResendLink.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(Successpopupclosebutton));
		CommonLibref.click(Successpopupclosebutton, "seleniumClick", "Successpopupclosebutton");

	}

	public void VerifyOldLink(String Email, String Password, String Username) {
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
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			try {
				elementWithId.click();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
			}
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

		// Loop through until we find a new window handle
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
	}

	public void SelectEmailId() {
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfInitialUsers));
		CommonLibref.click(searchFieldOfInitialUsers, "javascriptClick", "SearchUser");
		searchJurisdiction.sendKeys(SeededUserRegistrar);
		System.out.println("Enter Email ID =" + SeededUserRegistrar);
	}

	public void LoginWithRegistrarID() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.click(userIDField, "moveToElementClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		userIDField.sendKeys(cp.registrarUserId);

		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseField));
		CommonLibref.click(PassphraseField, "moveToElementClick", "PassphraseField");
		PassphraseField.sendKeys(Keys.CONTROL, "a");
		PassphraseField.sendKeys(Keys.BACK_SPACE);
		PassphraseField.sendKeys("Wciadmin@123");
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is invalid.");
		System.out.println("User ID or passphrase entered is invalid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void ClickQuickActionsOnRegistrarPage() {
		try {

			Actions action = new Actions(driver.get());
			action.moveToElement(quickActionOfRegistrarPage).click(quickActionOfRegistrarPage).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Registrar Home Page");
			System.out.println("Step :Click on Quick Action Menu of Registrar Home Page");
		} catch (Exception e) {

			wait.until(ExpectedConditions.elementToBeClickable(quickActionOfRegistrarPage));
			CommonLibref.click(quickActionOfRegistrarPage, "seleniumClick", "Quick Actions of First User");
			ObjectRepo.test.log(Status.PASS, "Steps: Click on Quick Action Menu of Registrar Home Page");
			System.out.println("Click on Quick Action Menu of Registrar Home Page");
		}
	}

	public void VerifyOptionsUnderQuickActions() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']"));
		int size5 = List.size();
		System.out.println("No of options available under Quick Actions :" + size5);
		List<String> Submenus = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			System.out.println("No of options available under Quick Actions :" + element);
			ObjectRepo.test.log(Status.PASS, "No of options available under Quick Actions : :" + element);
		}
		ObjectRepo.test.log(Status.PASS, "No of options available under Quick Actions :"
				+ "DEACTIVATE USER LOG-IN, RESET SECURITY QUESTIONS AND PASSPHRASE, UPDATE PHONE AND EMAIL, INACTIVATE USER - PROFILE ACCESS ONLY, INACTIVATE USER - CLOSE ACCOUNT");
	}

	public void clickOnQuickActionsofInitialUsersPage() {
		WebElement quickActions2 = driver.get().findElement(By.xpath(
				"//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']"));
		wait.until(ExpectedConditions.elementToBeClickable(quickActions2));
		CommonLibref.click(quickActions2, "seleniumClick", "Quick Actions");
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActionOfRegistrarPage).click(quickActionOfRegistrarPage).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu ");
			System.out.println("Step :Click on Quick Action ");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", quickActions2);
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu ");
			System.out.println("Step :Click on Quick Action ");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu");
			System.out.println("Step :Click on Quick Action");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

// Verification of Registrar is able to select/deselect service provider

	public void ClickEditButtonAndSearch(Actions action, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(EditButton));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			EditButton.click();
		} catch (Exception e) {
			action.moveToElement(EditButton).click(EditButton).build().perform();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			searchuser.click();
		} catch (Exception e1) {
			action.moveToElement(searchuser).click().perform();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchuser.sendKeys(text);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ClickSaveButton(Actions action) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(firstcheckbox));
		try {
			firstcheckbox.click();
		} catch (Exception e) {
			action.moveToElement(firstcheckbox).click().perform();
		}
		wait.until(ExpectedConditions.visibilityOf(yesButton));
		try {
			yesButton.click();
		} catch (Exception e) {
			action.moveToElement(yesButton).click().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(save));
		((JavascriptExecutor) driver.get()).executeScript("arguments[0].scrollIntoView(true);", save);
		try {
			saveBtnOnServiceProviderPage.click();
		} catch (Exception e) {
			action.moveToElement(save).click().perform();
		}
	}

	public void Selectionofserviceprovider(String JurisdictionID, String FSAName) {
		Actions action = new Actions(driver.get());
		// Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(menuBtnOnRegistarHomePage));
		menuBtnOnRegistarHomePage.click();
		ObjectRepo.test.log(Status.PASS, "Click on ObjectRepo.test Menu ");
		wait.until(ExpectedConditions.elementToBeClickable(MoreOption));
		MoreOption.click();
		wait.until(ExpectedConditions.elementToBeClickable(ServiceProviderselection));
		try {
			ServiceProviderselection.click();
		} catch (Exception e1) {
			action.moveToElement(ServiceProviderselection).build().perform();
			action.click(ServiceProviderselection).build().perform();
		}
		// Thread.sleep(2000);
		Boolean isDisplayServiceProviderselectionheader = ServiceProviderselectionheader.isDisplayed();
		Assert.assertTrue(isDisplayServiceProviderselectionheader);
		System.out.println("Service Provider selection and management page is displayed");
		ObjectRepo.test.log(Status.PASS, "Service Provider selection and management page is displayed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.ClickEditButtonAndSearch(action, FSAName);

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-j4m1we'])[7]")));
		String text = AssignedJU.getText();
		// Check if the text contains the desired string
		if (text.contains(JurisdictionID)) {
			System.out.println("This user already assigned to Test 50 jurisdiction");

			this.ClickSaveButton(action);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[text()='Service Provider Status Updated Successfully']")));
			String text1 = Serviceproviderselectionsucessmsg.getText();
			if (text1.contains("Service Provider Status Updated Successfully")) {
				System.out.println("Service Provider deselect Successfully");
			} else {
				System.out.println("Service Provider Status not Updated Successfully");
			}
			wait.until(ExpectedConditions.elementToBeClickable(Successmsg_close1));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			try {
				Successmsg_close1.click();
			} catch (Exception e) {
				action.moveToElement(Successmsg_close1).click().perform();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			this.ClickEditButtonAndSearch(action, "Financial Service Providers");
			this.ClickSaveButton(action);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[text()='Service Provider Status Updated Successfully']")));
			String text2 = Serviceproviderselectionsucessmsg.getText();
			if (text2.contains("Service Provider Status Updated Successfully")) {
				System.out.println("Service Provider selection and Status Updated Successfully");
			} else {
				System.out.println("Service Provider Status not Updated Successfully");
			}
			wait.until(ExpectedConditions.elementToBeClickable(Successmsg_close1));
			// Thread.sleep(4000);
			try {
				Successmsg_close1.click();
			} catch (Exception e) {
				action.moveToElement(Successmsg_close1).click().perform();
			}

		} else {
			System.out.println("This user not assigned to Test 50 jurisdiction");
			// Thread.sleep(1000);
			this.ClickSaveButton(action);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[text()='Service Provider Status Updated Successfully']")));
			String text3 = Serviceproviderselectionsucessmsg.getText();
			if (text3.contains("Service Provider Status Updated Successfully")) {
				System.out.println("Service Provider select Successfully");
			} else {
				System.out.println("Service Provider Status not Updated Successfully");
			}
			System.out.println("Service Provider select Successfully");
			wait.until(ExpectedConditions.visibilityOf(Successmsg_close1));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Successmsg_close1.click();
			} catch (Exception e) {
				action.moveToElement(Successmsg_close1).click().perform();
			}
		}
	}

	// Quick Actions Submenu On Registar Home Page

	// Deactivate with profile access
	public void registrarDeactivateUserLoginWithProfileAccess() {

		wait.until(ExpectedConditions.elementToBeClickable(deactivateUserLoginOption));
		deactivateUserLoginOption.click();
		System.out.println("Step : Click Deactivate User Login option");
		ObjectRepo.test.log(Status.PASS, "Step : Click Deactivate User Login option");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// wait.until(ExpectedConditions.elementToBeClickable(deactivateWithProfileAccessRadioButton));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(deactivateWithProfileAccessRadioButton).click(deactivateWithProfileAccessRadioButton)
					.build().perform();
//				ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu of Manage Initial Users Page");
//				System.out.println("Step :Click on Quick Action of Locked User");
		} catch (NoSuchElementException e) {
			wait.until(ExpectedConditions.elementToBeClickable(deactivateWithProfileAccessRadioButton));
			deactivateWithProfileAccessRadioButton.click();

		}

		System.out.println("Step : Click Deactivate User Login wuth profile access radio button");
		ObjectRepo.test.log(Status.PASS, "Step : Click Deactivate User Login wuth profile access radio button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		deactivateUserReasons.sendKeys("Deactivate user without profile access");
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDeactivateUserPopup));
		continueButtonOnDeactivateUserPopup.click();
		System.out.println("Step : Enter valid reasons and click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid reasons and click on Continue button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage = successMessageAfterRegistrarDeactivateUserWithoutProfileAccess.getText();
		Assert.assertEquals("Account status is changed to Profile Access Only. The user can login to the system.",
				successMessage);

		System.out.println("Success Message after registrar deactivate user without profile access" + successMessage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.elementToBeClickable(crossIcon);
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		System.out.println("Registrar deactivate user with profile access only");
		ObjectRepo.test.log(Status.PASS, "Registrar deactivate user with profile access only");
	}

//	Deactivate without profile access:
	public void registrarDeactivateUserLoginWithoutProfileAccess() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(deactivateUserLoginOption));
		CommonLibref.click(deactivateUserLoginOption, "moveToElementClick", "deactivateUserLoginOption");
		System.out.println("Step : Click On Deactivate User login option");
		ObjectRepo.test.log(Status.PASS, "Step : Click On Deactivate User login option");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(deactivatewithoutprofileaccess));
		CommonLibref.click(deactivatewithoutprofileaccess, "moveToElementClick", "deactivatewithoutprofileaccess");
		System.out.println("Step : Click On Deactivate User login without profile access radio button");
		ObjectRepo.test.log(Status.PASS, "Step : Click On Deactivate User login without profile access radio button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		deactivateUserReasons.sendKeys("Deactivate user without profile access");
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDeactivateUserPopup));
		continueButtonOnDeactivateUserPopup.click();
		System.out.println("Step : Enter valid reason and Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid reason and Click on Continue button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage = successMessageAfterRegistrarDeactivateUserWithoutProfileAccess.getText();
		System.out.println("Success Message after registrar deactivate user without profile access:" + successMessage);
		Assert.assertEquals("Account status is changed to Inactive. The user can not login to the system.",
				successMessage);
		ObjectRepo.test.log(Status.PASS,
				"Account status is changed to Inactive. The user can not login to the system." + successMessage);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		System.out.println("Registrar set user account status inactive successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar set user account status inactive successfully");
		driver.get().navigate().refresh();
	}

//	INACTIVATE USER - CLOSE ACCOUNT

	public void registrarCloseUserAccountFromUserDetailsPage() throws Exception {
		System.out.println("--------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "---------------------------------------------------");

		wait.until(ExpectedConditions.elementToBeClickable(inactivateUserClosedAccountOption));
		inactivateUserClosedAccountOption.click();
		System.out.println("step : Click on inactivate User Closed Account Option");
		ObjectRepo.test.log(Status.PASS, "step : Click on inactivate User Closed Account Option");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-----------------------------------------------------------");
		commentForInactiveUserCloseAccountPoup.sendKeys("Closed User Account");
		wait.until(ExpectedConditions.visibilityOf(closeUserAccountButtonForInactiveUserCloseAccountPoup));
		WebElement element = closeUserAccountButtonForInactiveUserCloseAccountPoup;
		if (element.isEnabled()) {
			System.out.println("close user account button is enabled");
		} else {
			System.out.println("close user account button is not enabled");
		}
		closeUserAccountButtonForInactiveUserCloseAccountPoup.click();
		System.out.println("step : Enter valid comment and Click on close User Account Button");
		ObjectRepo.test.log(Status.PASS, "step : Enter valid comment and Click on close User Account Button");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage = successMessageAfterRegistrarDeactivateUserWithoutProfileAccess.getText();
		System.out.println("Success Message after registrar deactivate user without profile access" + successMessage);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		System.out.println("Registrar closed user account successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar closed user account successfully");
	}

	// UPDATE PHONE AND EMAIL

	public void registrarUpdateUserMailAddressFromUserDetailsPage() {
//		
//			wait.until(ExpectedConditions.elementToBeClickable(threeDots));
//			threeDots.click();
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(updateEmailOption));
		updateEmailOption.click();

		System.out.println("Step : click on Update Email/Telephone Option");
		ObjectRepo.test.log(Status.PASS, "Step : click on Update Email/Telephone Option");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		telephonefieldOnPopup.click();
		telephonefieldOnPopup.sendKeys("9087654321");
		String email = generateEmailString();
		userEmailFieldOnEditUserEmailPopup.sendKeys(email);
		wait.until(ExpectedConditions.elementToBeClickable(proposeButtonOnEditUserEmailPopup));
		WebElement element = proposeButtonOnEditUserEmailPopup;
		Actions action = new Actions(driver.get());
		action.moveToElement(element).build().perform();
		action.click(element).build().perform();
		System.out.println("Step : click on Propose button");
		ObjectRepo.test.log(Status.PASS, "Step : click on Propose button\"");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage = successMessageAfterRegistrarDeactivateUserWithoutProfileAccess.getText();
		System.out.println("Success Message after registrar update user mail address:" + successMessage);
		Assert.assertEquals("Email / Telephone update request sent.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after registrar update user mail address:" + successMessage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		System.out.println("Registrar update user mail address successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar update user mail address successfully");
		driver.get().navigate().refresh();
	}

	// Reset User’s Passphrase and Security Questions

	public void registrarResetPassphraseAndSecQueToUser() throws Exception {

		String resetPassphraseSecurityOption = resetSecurityQueAndPassphraseOption.getText();
		System.out.println("Registrar is able to view:" + resetPassphraseSecurityOption);
		Assert.assertEquals("RESET SECURITY QUESTIONS AND PASSPHRASE", resetPassphraseSecurityOption);
		ObjectRepo.test.log(Status.PASS, "Registrar is able to view:" + resetPassphraseSecurityOption);
		resetSecurityQueAndPassphraseOption.click();
		System.out.println("step : Click on reset Security Question And Passphrase Option");
		ObjectRepo.test.log(Status.PASS, "step : Click on reset Security Question And Passphrase Option");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		WebElement resetPassphrasePopuptext = driver.get()
				.findElement(By.xpath("//*[text()='Reset User’s Passphrase and Security Questions']"));
		String popupTextTitle = resetPassphrasePopuptext.getText();
		Assert.assertEquals("Reset User’s Passphrase and Security Questions", popupTextTitle);
		System.out.println("Reset passphrase popup title text is :" + popupTextTitle);
		ObjectRepo.test.log(Status.PASS, "Reset passphrase popup title text is :" + popupTextTitle);
		driver.get().findElement(By.xpath("//button[contains(text(),'CANCEL')]")).click();
		System.out.println("step : Click on Cancel button");
		ObjectRepo.test.log(Status.PASS, "step : Click on Cancel button");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(
					By.xpath("//*[text()='Reset User’s Passphrase and Security Questions']")));
			System.out.println("Reset passphrase popup is not display on the webpage after cancelling");
			ObjectRepo.test.log(Status.PASS, "Reset passphrase popup is not display on the webpage after cancelling");
		} catch (NoSuchElementException e) {
			System.out.println("Reset passphrase popup is not display on the webpage after cancelling");
			ObjectRepo.test.log(Status.PASS, "Reset passphrase popup is not display on the webpage after cancelling");
		}
		wait.until(ExpectedConditions.elementToBeClickable(quickActionOfRegistrarPage));
		quickActionOfRegistrarPage.click();
		wait.until(ExpectedConditions.elementToBeClickable(resetSecurityQueAndPassphraseOption));
		resetSecurityQueAndPassphraseOption.click();
//			System.out.println("step : Again Search user in User Search grid and Click on three dots from More action column");
//			ObjectRepo.test.log(Status.PASS, "step : Again Search user in User Search grid and Click on three dots from More action column");
//			System.out.println("-------------------------------------------------------------------------");
//			ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		driver.get().findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		System.out.println("step : Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "step : Click on Continue button");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success Message is:" + successMessage);
		Assert.assertEquals("Successfully initiated reset passphrase and security questions", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message is:" + successMessage);
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void ActivateUserLogin() {
		System.out.println("--------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "---------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(activateUserLogin));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(activateUserLogin)).click();
		// activateUserLogin.click();
		System.out.println("step : Click on Activate User Login Option");
		ObjectRepo.test.log(Status.PASS, "step : Click on Activate User Login Option");

		wait.until(ExpectedConditions.visibilityOf(successMessageAfterRegistrarActivateUserLogin));
		String successMessage = successMessageAfterRegistrarActivateUserLogin.getText();
		System.out.println("Success Message after registrar Activate User Login" + successMessage);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		System.out.println("Account status is changed to Active. The user can login to the system.");
		ObjectRepo.test.log(Status.PASS, "Account status is changed to Active. The user can login to the system.");
	}

	// InActivate with profile access only
	public void InActivateUserLoginWithProfileAccessOnly() {

		wait.until(ExpectedConditions.elementToBeClickable(inactivateUserLoginWithProfileAccess));
		inactivateUserLoginWithProfileAccess.click();
		System.out.println("Step : Click Inactivate User Login With Profile Access Only option");
		ObjectRepo.test.log(Status.PASS, "Step : Click Inactivate User Login With Profile Access Only option");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(inactivateUserReasons));
		inactivateUserReasons.sendKeys("Inactivate user without profile access");
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnInactiveUserPopup));
		continueButtonOnInactiveUserPopup.click();
		System.out.println("Step : Enter valid reasons and click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid reasons and click on Continue button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageInactivateUserWithProfileAccess));
		String successMessage = successMessageInactivateUserWithProfileAccess.getText();
		Assert.assertEquals("Account status is changed to Profile Access Only. The user can login to the system.",
				successMessage);
		System.out.println("Success Message after registrar inactivate user with profile access only" + successMessage);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.elementToBeClickable(crossIcon);
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		System.out.println("Registrar Inactivate user with profile access only");
		ObjectRepo.test.log(Status.PASS, "Registrar Inactivate user with profile access only");
	}

	public void ClearDataOnTheLoginPage1() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		userIDField.click();
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		textBoxPassWord.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);

	}

	public void LoginWithOtherRegistar() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.click(userIDField, "seleniumClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		userIDField.sendKeys("regbuys");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseField));
		CommonLibref.click(PassphraseField, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		PassphraseField.sendKeys(prop.getProperty("WciIncAdminPassphrase11"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is invalid.");
		System.out.println("User ID or passphrase entered is invalid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
		// driver.get().navigate().refresh();
	}

	public void ScrollUptoUserManagement() {
		wait.until(ExpectedConditions.visibilityOf(scrollUptoUSerManagementRegPage));
		CommonLibref.scroll(scrollUptoUSerManagementRegPage, "scrollToElement", "UserManagementOnRegistrarPAge");
		System.out.println("Page is scrolled till User Management");
	}

	public void ExpandArrowOfUserManagement() {
		wait.until(ExpectedConditions.elementToBeClickable(userManagementexpandarrow));
		userManagementexpandarrow.click();
		System.out.println("Step : Click expand arrow of Pending Request Of User Management");
		ObjectRepo.test.log(Status.PASS, "Step : Click expand arrow of Pending Request Of User Management");
	}

	public void ClickOnUserOfPendingRequest() {
		wait.until(ExpectedConditions.elementToBeClickable(hyperlinkOfUser));
		hyperlinkOfUser.click();
		System.out.println("Step : Click expand arrow of Pending Request Of User Management");
		ObjectRepo.test.log(Status.PASS, "Step : Click expand arrow of Pending Request Of User Management");
	}

	public void ScrollUptoProposedTelephoneAndEmail() {
		wait.until(ExpectedConditions.visibilityOf(proposedTelephoneandEmail));
		CommonLibref.scroll(proposedTelephoneandEmail, "scrollToElement", "proposedTelephoneandEmail");
		System.out.println("Page is scrolled till Proposed Telephone and Email");
	}

	public void ClickOnApproveRadioBtn() {
		wait.until(ExpectedConditions.visibilityOf(radioBtnOfApproveOfPhoneandEmail));
		CommonLibref.scroll(radioBtnOfApproveOfPhoneandEmail, "seleniumClick", "radioBtnOfApproveOfPhoneandEmail");
		System.out.println("Step : Click on Approve Radio Button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on Approve Radio Button");
	}

	public void ClickOnSaveBtnOFRegistrarPage() {
		wait.until(ExpectedConditions.visibilityOf(clickOnSaveBtnOFRegistrarPage));
		CommonLibref.scroll(clickOnSaveBtnOFRegistrarPage, "seleniumClick", "clickOnSaveBtnOFRegistrarPage");
		System.out.println("Step : Click on Save Button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on Save Button");
	}

	public void EnterPassphraseOnPopup() {
		PassphraseTextBox1.click();
		PassphraseTextBox1.sendKeys(prop.getProperty("WciIncAdminPassphrase11"));
		submitBtnOnPopUpOfRegPage.click();
		wait.until(ExpectedConditions.visibilityOf(successmsgOfPhoneandemailApproval));
		System.out.println(successmsgOfPhoneandemailApproval.getText());
		ObjectRepo.test.log(Status.PASS, "User request has been approved.");
		ExpectedConditions.elementToBeClickable(crossIcon);
		CommonLibref.click(crossIcon, "javascriptClick", "crossIcon");
		ObjectRepo.test.log(Status.PASS, "User request has been approved.");
	}

	// SetupInitialUSers//

	public void SeedEditRemoveUser() {
		Create_Participate_Onboarding_Jurisdiction_Pom cp = new Create_Participate_Onboarding_Jurisdiction_Pom();
		LoginPom ref = new LoginPom();
		Module5_4_Pom ref1 = new Module5_4_Pom();
		CommonMethods ref2 = new CommonMethods();
		Module5_4_SetupInitialUsers_POM ref3 = new Module5_4_SetupInitialUsers_POM();
		Module5_1_Pom ref4 = new Module5_1_Pom();
		Module5_2_POM ref5 = new Module5_2_POM();
		ref1.expandAllJurisdictions1();
		ref1.SelectJurisdiction();
		ref1.clickOnQuickActions1();
		ref3.selectInitialUserFromQuickAction1();
		ref5.clickOnAddInitialUserButton();
		ref3.ScrollUptoCancelButton();
		ref3.FilldataOnInitialUsersPage();
		ref3.clickOnSaveButton1();
		ref4.saveSucessMessageAfterSaveInitialUserdata();
		// ref3.clickOnQuickActions2();
		// ref3.ClickOntheFirstUserQuickActions();
		ref4.clickOntheFirstUserQuickActions();
		ref1.VerifyTheEditButtonInOnboardingStatus1();
		ref4.clickOnEditButton();
		ref4.clickOnEditButtonAndEditData();
		ref3.ScrollUptoCancelButton();
		ref3.clickOnSaveButton1();
		ref3.SuccessMessageOfEditInitialUser();
		ref4.clickOntheFirstUserQuickActions();
		// ref3.clickOnQuickActions2();
		ref3.verifyTheRemoveOptionDisplayedOrNotInQuickActons1();
		ref3.ClickOnRemoveUseroption();
		ref3.RemoveUserBtnOfWarningPopup();
		try {
			ref3.SuccessMessageOfRemoveUser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Resend New Setup registration link for Not Activated User //
	public void ResendNewSetupregistrationlink() {
		Create_Participate_Onboarding_Jurisdiction_Pom cp = new Create_Participate_Onboarding_Jurisdiction_Pom();
		LoginPom ref = new LoginPom();
		Module5_4_Pom ref1 = new Module5_4_Pom();
		CommonMethods ref2 = new CommonMethods();
		Module5_4_SetupInitialUsers_POM ref3 = new Module5_4_SetupInitialUsers_POM();
		Module5_1_Pom ref4 = new Module5_1_Pom();
		Module5_4_UsersAndAccounts_POM ref6 = new Module5_4_UsersAndAccounts_POM();
		Module5_2_POM ref5 = new Module5_2_POM();
		ref1.expandAllJurisdictions1();
		ref1.SelectJurisdiction();
		ref1.clickOnQuickActions1();
		ref3.selectInitialUserFromQuickAction1();
		ref3.ClickOnAddInitialUserButton1();
		// ref3.ScrollUptoCancelButton();
		ref3.FilldataOnInitialUsersPage();
		ref3.clickOnSaveButton1();
		// ref4.saveSucessMessageAfterSaveInitialUserdata();
		ref1.SaveTheSuccessMessageonManageStatusPage1();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ref3.ClickOntheFirstUserQuickActions();
		ref3.SelectEmailId();
		ref3.clickOnQuickActions2();
		ref3.ResendAccountSetUpLink();
		ref3.SuccessmessageOfResendLink();
//			ref3.verifyResendLink("catch-all@eqanim-qa.wci-validate.org", "7@S699x^j%7ce69FJm2U");
	}

	public void VerifyOldLinkAfterResendLink() {
		Create_Participate_Onboarding_Jurisdiction_Pom cp = new Create_Participate_Onboarding_Jurisdiction_Pom();
		LoginPom ref = new LoginPom();
		Module5_4_Pom ref1 = new Module5_4_Pom();
		CommonMethods ref2 = new CommonMethods();
		Module5_4_SetupInitialUsers_POM ref3 = new Module5_4_SetupInitialUsers_POM();
		Module5_1_Pom ref4 = new Module5_1_Pom();
		Module5_4_UsersAndAccounts_POM ref6 = new Module5_4_UsersAndAccounts_POM();
		Module5_2_POM ref5 = new Module5_2_POM();
		ref1.expandAllJurisdictions1();
		ref1.SelectJurisdiction();
		ref1.clickOnQuickActions1();
		ref3.selectInitialUserFromQuickAction1();
		ref3.ClickOnAddInitialUserButton1();
		// ref3.ScrollUptoCancelButton();
		ref3.FilldataOnInitialUsersPage();
		ref3.clickOnSaveButton1();
		// ref4.saveSucessMessageAfterSaveInitialUserdata();
		ref1.SaveTheSuccessMessageonManageStatusPage1();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ref3.SelectEmailId();
		ref3.clickOnQuickActions2();
		ref3.ResendAccountSetUpLink();
		ref3.SuccessmessageOfResendLink();
		ref3.VerifyOldLink("catch-all@eqanim-qa.wci-validate.org", "7@S699x^j%7ce69FJm2U",
				Module5_4_SetupInitialUsers_POM.SeededUserRegistrar);
	}

	public void verifyTheOldLinkMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(oldLinkMessage));
		String message = oldLinkMessage.getText();
		ObjectRepo.test.log(Status.PASS, "message is displayed like - :" + message);
		System.out.println("message is displayed like - :" + message);
	}

}
