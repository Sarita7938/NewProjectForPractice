package pages;

import static constants.ThreadConstants.driver;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.lang3.RandomStringUtils;
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
import org.testng.Assert;
import static Utilities.listeners.prop;
import com.aventstack.extentreports.Status;
import static Utilities.listeners.wait;

import Utilities.CommonMethods;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;
import static constants.ThreadConstants.driver;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sanity_User_Pom {

	public static Actions actions;
	private JavascriptExecutor js = (JavascriptExecutor) driver.get();
	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static String userId1;
	public static String userId2;
	public static String indUserForNewJuri;
	public static String userId4;
	public static String juriAdmin1;
	public static String userId6;
	public static String UserID1;
	public static String emailaddress;
	public static String emailId1;
	public static String newemail;
	public static String questionsList1;
	public static String user1referencecode;
	public static String userIDOfUser;
	public static String passphraseOfUser;
//	public static String emailaddress1;
	public static String individualUser_UserID;
	public static String individualUser_Passphrase;
	public static String individualUser_ReferenceCode;

	@FindBy(xpath = "//*[@class='MuiFormLabel-root MuiFormLabel-colorPrimary css-118ux31']")
	private WebElement Regitration_Approval;

	@FindBy(xpath = "//*[@name='Approved']")
	private WebElement ApprovByAuth;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement Save_Butn;

	@FindBy(xpath = "(//*[text()='Log In'])[1]")
	private WebElement loginButton1;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[4]")
	private WebElement crossButtonOnErrorMessageAfterLogin;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[4]")
	private WebElement closeButton;

	@FindBy(xpath = "//div[text()='Select Jurisdiction']")
	private WebElement selectJurisdiction;

	@FindBy(id = "select_jurisdiction")
	private WebElement selectJurisdiction1;

	@FindBy(xpath = "//*[text()='Quebec']")
	private WebElement selectQubec;

	@FindBy(xpath = "(//*[text()='Quebec'])[2]")
	private WebElement selectQubec2;

	@FindBy(xpath = "//span[text()='California']")
	private WebElement selectCalifornia;

	@FindBy(xpath = "//*[text()='Nova Scotia']")
	private WebElement selectNovaScotia;

	@FindBy(xpath = "//*[text()='Washington']")
	private WebElement selectWashington;

	@FindBy(xpath = "//div[text()='Select Language']")
	private WebElement selectLanguage;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement contButton;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement userId;

	@FindBy(xpath = "//label[text()='User ID']")
	private WebElement userIdWithLabel;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passphrase;

	@FindBy(xpath = "//label[text()='Passphrase']")
	private WebElement passphraseWithLabel;

	@FindBy(xpath = "//span[text()='Remember me']")
	private WebElement rememberMeCheckbox;

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@id='Answer']")
	private WebElement answerField;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continueButtonForLogin;

	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement welButton;

	@FindBy(xpath = "//a[contains(text(),'User Profile')]")
	private WebElement userProfileOption;

	@FindBy(xpath = "//p[@class='text']")
	private WebElement lastLoginText;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")
	private WebElement securityQuestion1ForLogin;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logoutButton;

	@FindBy(xpath = "//a[text()='Forgot User ID?']")
	private WebElement forgotUserIdLink;

	@FindBy(xpath = "//input[@id='emailId']")
	private WebElement emailAddress;

	@FindBy(xpath = "//h6[text()='Please enter a valid email address:']")
	private WebElement emailAddressWithLabel;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement forgotUserContButton;

	@FindBy(xpath = "//a[text()='Forgot Passphrase?']")
	private WebElement forgotPassphraseLink;

	@FindBy(xpath = "//h6[text()='Please enter your User ID:']")
	private WebElement userIDWithLabel;

	@FindBy(xpath = "//*[@name='emailId']")
	private WebElement userAddress;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement forgotPassphraseContButton;

	@FindBy(xpath = "//p[text()='Email with User ID information is sent to your registered email address.']")
	private WebElement sucMessageForUseID;

	@FindBy(xpath = "//span[text()='Enter valid Email Address']")
	private WebElement errorMessageForUserID;

	@FindBy(xpath = "//p[text()='Email with instruction to reset passphrase will be sent to registered email address.']")
	private WebElement sucMessageForPass;

	@FindBy(xpath = "//p[text()='Enter valid User ID']")
	private WebElement loginErrorMessField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement loginErrorMess;

	@FindBy(xpath = "//div[text()='ANNOUNCEMENTS']")
	private WebElement announBar;

	@FindBy(xpath = "//div[text()='Jurisdiction']")
	private WebElement jurisSelDropdown;

	@FindBy(xpath = "//div[text()='Language']")
	private WebElement langSelDropdown;

	@FindBy(xpath = "//a[text()='HOME']")
	private WebElement home;

	@FindBy(xpath = "//*[contains(text(),'USER REGISTRATION')]")
	private WebElement userRegistration;

	@FindBy(xpath = "//button[text()='FAQs & RESOURCES']")
	private WebElement fAQAndResources;

	@FindBy(xpath = "//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-1hwdpu2']")
	private WebElement noticeSection;

	@FindBy(xpath = "//p[text()='About WCI, Inc.']")
	private WebElement aboutWCI;

	@FindBy(xpath = "//p[text()='Copyright © 2019']")
	private WebElement copyright;

	@FindBy(xpath = "//p[text()='WCI, Inc. Terms of Use']")
	private WebElement termsAndCondi;

	@FindBy(xpath = "//*[text()='Contact Us']")
	private WebElement contactUs;

	@FindBy(xpath = "//h4[text()='Log In']")
	private WebElement loginModule;

	@FindBy(xpath = "//h3[text()='Welcome!']")
	private WebElement welcomeText;

	@FindBy(xpath = "//h2[text()='WCI, Inc. Registry Platform']")
	private WebElement wciIncRegistryPlatformText;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continueBtn;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement passphrase1;

	@FindBy(xpath = "//*[text()='Contact Us']")
	private WebElement contactUsLink;

	@FindBy(xpath = "//div[@id='jurisdiction']")
	private WebElement jurisDropdown;

	@FindBy(xpath = "//li[text()='California']")
	private WebElement selectCalifor;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement emailAddressCont;

	@FindBy(xpath = "//body[@id='tinymce']")
	private WebElement message;

	@FindBy(xpath = "//button[text()='Send']")
	private WebElement sendButtonContactUsPage;

	@FindBy(xpath = "//*[@id=\"email_message_ifr\"]")
	private WebElement iframe;

	@FindBy(xpath = "//h1[text()='Contact Us']")
	private WebElement contactUsText;

	@FindBy(xpath = "//label[text()='Jurisdiction']")
	private WebElement jurisdictionLabelContactUsPage;

	@FindBy(xpath = "//label[text()='Name']")
	private WebElement nameLabelContactUsPage;

	@FindBy(xpath = "//label[text()='Mobile Phone']")
	private WebElement mobilePhoneLabelContactUsPage;

	@FindBy(xpath = "//label[text()='Message']")
	private WebElement messageLabelContactUsPage;

	@FindBy(xpath = "//button[text()='Discard']")
	private WebElement discardButtonContactUsPage;

	@FindBy(xpath = "//p[text()='Jurisdiction is required']")
	private WebElement errorMessageForJurisdictionOnContactUs;

	@FindBy(xpath = "//*[@id='name-helper-text']")
	private WebElement errorMessageForNameOnContactUs;

	@FindBy(xpath = "//p[@id='phone-helper-text']")
	private WebElement errorMessageForMobilePhoneOnContactUs;

	@FindBy(xpath = "//p[@id='email_address-helper-text']")
	private WebElement errorMessageForEmailOnContactUs;

	@FindBy(xpath = "//span[text()='Message is required']")
	private WebElement errorMessageForMessageOnContactUs;

	@FindBy(xpath = "//button[@data-testid='contact_us_save']")
	private WebElement sendButtonOnContactUsPage;

	@FindBy(xpath = "//span[@style='font-size: 12px; font-weight: 500;']")
	private WebElement lastloginDate;

	@FindBy(xpath = "//div[@class='MuiBox-root css-knkskr']")
	private WebElement postLoginStatusPending;

	@FindBy(xpath = "//p[text()='WCI, Inc. Terms of Use']")
	private WebElement wCIIncTermsOfUseLinkInFooter;

	@FindBy(xpath = "(//p[text()='User Reference Code:'])[1]")
	private WebElement userReferenceCode;

	@FindBy(xpath = "(//button[@aria-label='Export'])[1]")
	private WebElement exportBtn;

	@FindBy(xpath = "//*[text()='Download as CSV']")
	private WebElement csvFileExcel;

	@FindBy(xpath = "//*[text()='Download as Excel']")
	private WebElement fileExcel;

	@FindBy(xpath = "//h6[text()='In which city or town was your first job?']")
	private WebElement securityQue1;

	@FindBy(xpath = "//input[@id='Answer']")
	private WebElement ansSecurityQue1;

	@FindBy(xpath = "//input[@id='answer2']")
	private WebElement ansSecurityQue2;

	@FindBy(xpath = "//input[@id='answer3']")
	private WebElement ansSecurityQue3;

	@FindBy(xpath = "//a[contains(text(),'HOME')]")
	private WebElement homeTextOnMenuBar;

	@FindBy(xpath = "//button[contains(text(),'SETTINGS')]")
	private WebElement settingsTextOnMenuBar;

	@FindBy(xpath = "//button[contains(text(),'SEARCH')]")
	private WebElement searchTextOnMenuBar;

	@FindBy(xpath = "//button[contains(text(),'Search Users')]")
	private WebElement searchUsersSection;

	@FindBy(xpath = "(//button[contains(text(),'Columns')])[1]")
	private WebElement columnsInGrid;

	@FindBy(xpath = "(//button[contains(text(),'Filters')])[1]")
	private WebElement filtersInGrid;

	@FindBy(xpath = "(//button[contains(text(),'Export')])[1]")
	private WebElement exportInGrid;

	@FindBy(xpath = "//*[contains(text(),'USER MANAGEMENT')]")
	private WebElement userManagementSection;

	@FindBy(xpath = "//*[contains(text(),'Search All Users')]")
	private WebElement searchAllUserSubSection;

	@FindBy(xpath = "//*[contains(text(),'Pending Requests')]")
	private WebElement pendingRequestGrid;

	@FindBy(xpath = "//span[contains(text(),'Cancel User Registration')]")
	private WebElement cancelUserRegistrationOption;

	@FindBy(xpath = "//button[contains(text(),'Yes, I want to cancel the application')]")
	private WebElement yesIWantToCancelApplicationPopupButton;

	@FindBy(xpath = "//button[contains(text(),'Search Users')]")
	private WebElement searchUseresSection;

	@FindBy(xpath = "//a[text()='New Registration']")
	private WebElement newRegistration;

	@FindBy(xpath = "//button[contains(text(),'Start New Registration')]")
	private WebElement startNewRegisBut;

	@FindBy(xpath = "//span[contains(text(),'California')]")
	private WebElement selectoptionCal;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	private WebElement selectJurisdictionContButton;

	// =======================================
	@FindBy(xpath = "//input[@id='salutation']")
	private WebElement salutation;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='middleName']")
	private WebElement middleName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='suffix']")
	private WebElement suffix;

	@FindBy(xpath = "//input[@name='telephoneNumber']")
	private WebElement telephoneNumber;

	@FindBy(xpath = "//input[@id='ext']")
	private WebElement extension;

	@FindBy(xpath = "//input[@id='mobilePhone']")
	private WebElement mobilePhone;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='confirmEmail']")
	private WebElement confirmEmail;

	@FindBy(xpath = "//a[text()='reset of passphrase and/or security questions and answers for a User']")
	private WebElement resetPassphraseLink;

	@FindBy(xpath = "//div[@id='emailLanguagePreference']")
	private WebElement emailLangPref;

	@FindBy(xpath = "//ul//li[text()='English']")
	private WebElement selLangEng;

	@FindBy(xpath = "//input[@name='employer.0.title']")
	private WebElement employer;

	@FindBy(xpath = "//input[@id='jobTitle']")
	private WebElement jobTitle;

	@FindBy(xpath = "//input[@id='faxNumber']")
	private WebElement faxNumber;

	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement perInfoContButton;

	@FindBy(xpath = "//input[@name='primaryResidence.street1']")
	private WebElement street1PrimResi;

	@FindBy(xpath = "//input[@name='primaryResidence.street2']")
	private WebElement street2PrimResi;

	@FindBy(xpath = "//input[@name='primaryResidence.city']")
	private WebElement cityPrimResi;

	@FindBy(xpath = "(//input[@id='country-select-demo'])[2]")
	private WebElement stateAndProvincePrimResi;

	@FindBy(xpath = "//*[@id='country-select-demo-option-1']")
	private WebElement FirstElement;

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

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;

	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement primResiContButton;

	@FindBy(xpath = "//span[contains(text(),'I accept the Jurisdiction')]")
	private WebElement checkBoxEditAndReview;

	@FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
	private WebElement editAndReviewContButton;

	@FindBy(xpath = "//*[@id='createUserID-helper-text']")
	private WebElement errorMessageForUserId;

	@FindBy(xpath = "//input[@name='passphrase']")
	private WebElement passphrase11;

	@FindBy(xpath = "//input[@id='confirmPassphrase']")
	private WebElement confirmPassphrase;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion1']")
	private WebElement secQuestion1;
	@FindBy(xpath = "//*[contains(text(),'third-grade teacher?')]")
	private WebElement SecurityQuestion1;
	@FindBy(xpath = "//li[@data-value='What was the last name of your third-grade teacher?']")
	private WebElement selSecQue1;

	@FindBy(xpath = "//input[@name='answer1']")
	private WebElement answer1;

	@FindBy(xpath = "//div[@id='mui-component-select-securityQuestion2']")
	private WebElement secQuestion2;

	@FindBy(xpath = "//li[@data-value='In which year did you get your first credit card?']")
	private WebElement selSecQue2;

	@FindBy(xpath = "//input[@id='answer2']")
	private WebElement answer2;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion3']")
	private WebElement secQuestion3;

	@FindBy(xpath = "//li[@data-value='What was the model of your first car?']")
	private WebElement selSecQue3;

	@FindBy(xpath = "//input[@name='answer3']")
	private WebElement answer3;

	@FindBy(xpath = "//span[contains(text(),'I accept the WCI, Inc.')]")
	private WebElement termsOfUseCheckBox;

	@FindBy(xpath = "//button[contains(text(),'REGISTER')]")
	private WebElement creUserProfRegBut;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement crossButtonAfterRegistration;

	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement finishButton;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageForResetPassphrase;

	@FindBy(xpath = "(//*[@class='MuiBox-root css-mj6avj'])[2]")
	private WebElement refCode;

	@FindBy(xpath = "//input[@name='createUserID']")
	private WebElement createUserId;

	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement TermCheckbox;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv' and @data-testid='CloseIcon']")
	private WebElement CloseButtonOnTerms;

	@FindBy(xpath = "//*[@data-testid='priv_btn_ContinueBtn']")
	private WebElement UpdateTermConditionsContinewButton;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement loginbutton;

	@FindBy(xpath = "  //*[@data-testid='priv_modal_Continue']")
	private WebElement continuebutton;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passphraseOnLoginPage;

	@FindBy(xpath = "(//a[@class='link-cell'])[1]")
	private WebElement searchRecordFirstname;

	@FindBy(xpath = "(//input[@placeholder='Search…'])[1]")
	private WebElement searchField;

	@FindBy(xpath = "//input[@name='Approved']")
	private WebElement approveRadioButton;

	@FindBy(xpath = "//input[@name='Approved']")
	private WebElement approveRadioButtonForUpdatemail;

	@FindBy(xpath = "//input[@id='RoleType']")
	private WebElement selectRoleTypeDropdown;

	@FindBy(xpath = "//span[contains(text(),'Service Providers')]")
	private WebElement selectServiceProviderRoleType;

	@FindBy(xpath = "//span[contains(text(),'Individual Users')]")
	private WebElement selectIndividualUsersRolType;

	@FindBy(xpath = "//span[contains(text(),'Jurisdiction Users')]")
	private WebElement selectJurisdictionUserRoleType;

	@FindBy(xpath = "//span[contains(text(),'Technical Admin')]")
	private WebElement selectTechnicalAdminAndSytemUsersRoleType;

	@FindBy(xpath = "//div[@id='mui-component-select-Roles']")
	private WebElement roleDropdown;

	@FindBy(xpath = "//span[contains(text(),'Market Monitor')]")
	private WebElement selectMarketMonitorRole;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8']")
	private WebElement selectIndividualUsersRole;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[3]")
	private WebElement selectJurisdictionUsersRole;

	@FindBy(xpath = "(//*[text()='Individual Users'])[2]")
	private WebElement selectIndividualUsersRole2;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[2]")
	private WebElement selectAuctionAdministratorRole;

	@FindBy(xpath = "//span[contains(text(),'Registrar')]")
	private WebElement selectRegistrarRole;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[1]")
	private WebElement selectSystemAdminRole;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[1]")
	private WebElement selectMarketMonitorRole1;

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[2]")
	private WebElement selectFinancialServiceProvidersRole;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv' and @data-testid='CloseIcon']")
	private WebElement crossButtonOnSuccMessAuthorityApproval;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterRegistrarApproveUser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	@FindBy(xpath = "//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossButtonOnErrorMessageAfterLogin2;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8'])[5]")
	private WebElement CrossIconUser;

	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz']")
	private WebElement SearchUserName;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-gz6s05'])[1]")
	private WebElement FirstElementOnUserGrid;

	@FindBy(xpath = "//input[@id='ReasonForDenial']")
	private WebElement reasonForDenialDropdown;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	private WebElement selectFilter;

	@FindBy(xpath = "//input[@placeholder='Filter value']")
	private WebElement filterValueField1;

	@FindBy(xpath = "//span[text()='Request Revisions']")
	private WebElement requestRevisionRadioButton;

	@FindBy(xpath = "//textarea[@id='Comments']")
	private WebElement commentField;

	@FindBy(xpath = "//*[@id='Comments-helper-text']")
	private WebElement errorMessageForCommentField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageForRevisionRequestedByRegistrar;

	// ==========================================================
	@FindBy(xpath = "//div[@class='MuiBox-root css-knkskr']")
	private WebElement requestRevisionTextOnHomepage;

	@FindBy(xpath = "//button[text()='Make Revisions']")
	private WebElement makeRevisionButton;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement editButton;

	@FindBy(xpath = "//input[@id='Name']")
	private WebElement firstNameEdit;

	@FindBy(xpath = "//input[@name='MiddleName']")
	private WebElement middleNameEdit;

	@FindBy(xpath = "//input[@name='FamilyName']")
	private WebElement lastNameEdit;

	@FindBy(xpath = "//input[@name='Suffix']")
	private WebElement suffixEdit;

	@FindBy(xpath = "//input[@name='Date']")
	private WebElement dateOfBirthEdit;

	@FindBy(xpath = "//input[@name='Email']")
	private WebElement emailEdit;

	@FindBy(xpath = "//input[@name='ConfirmEmail']")
	private WebElement confirmEmailEdit;

	@FindBy(xpath = "//input[@name='Employer.0.title']")
	private WebElement employerEdit;

	@FindBy(xpath = "//input[@id='TelephoneNumber']")
	private WebElement telephoneNumberEdit;

	@FindBy(xpath = "//input[@id='ResStreet1']")
	private WebElement street1EditPrimResi;

	@FindBy(xpath = "//input[@id='ResStreet2']")
	private WebElement street2EditPrimResi;

	@FindBy(xpath = "//input[@name='ResCity']")
	private WebElement cityEditPrimResi;

	@FindBy(xpath = "//input[@id='ResPinCode']")
	private WebElement postalCodeEditPrimResi;

	@FindBy(xpath = "//input[@name='MailStreet1']")
	private WebElement street1EditMailAdd;

	@FindBy(xpath = "//input[@name='MailStreet2']")
	private WebElement street2EditMailAdd;

	@FindBy(xpath = "//input[@id='MailCity']")
	private WebElement cityEditMailAdd;

	@FindBy(xpath = "//input[@id='MailCity']")
	private WebElement postalCodeEditMailAdd;

	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement saveButtonForRevisionRequestSubmit;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continueButtonOnPrompt;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterSubmitRequestRevision;

	@FindBy(xpath = "//button[text()='Return to User Profile']")
	private WebElement returnToUserProfileButton;

	@FindBy(xpath = "//a[text()='HOME']")
	private WebElement homeMenu;

	@FindBy(xpath = "//div[@class='MuiBox-root css-knkskr']")
	private WebElement pendingStatusTextOnHomePage;

	@FindBy(xpath = "//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-zs9zxr']")
	private WebElement pendingStatusTextOnUserProfilePage;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[2]")
	private WebElement oldValueFirstNameField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[3]")
	private WebElement oldValueMiddleNameField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[4]")
	private WebElement oldValueLastNameField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[5]")
	private WebElement oldValueSuffixField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[6]")
	private WebElement oldValueDateOfBirthField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[7]")
	private WebElement oldValueTelephoneField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[7]")
	private WebElement oldValueTelephoneFieldForQuebec;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[10]")
	private WebElement oldValueEmailField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[11]")
	private WebElement oldValueConfirmEmailField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[15]")
	private WebElement oldValueStreet1PrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[16]")
	private WebElement oldValueStreet2PrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[17]")
	private WebElement oldValueCityPrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[18]")
	private WebElement oldValuePostalCodePrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[19]")
	private WebElement oldValueStreet1MailAddField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[20]")
	private WebElement oldValueStreet2MailAddField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[21]")
	private WebElement oldValueCityMailAddField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[22]")
	private WebElement oldValuePostalCodeMailAddField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[1]")
	private WebElement newValueFirstNameField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]")
	private WebElement newValueMiddleNameField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[3]")
	private WebElement newValueLastNameField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[2]")
	private WebElement newValueLastNameFieldDoubleRequest;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[4]")
	private WebElement newValueSuffixField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[4]")
	private WebElement newValueTelephoneFieldForQuebec;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[5]")
	private WebElement newValueEmailField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[6]")
	private WebElement newValueConfirmEmailField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[7]")
	private WebElement newValueStreet1PrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[5]")
	private WebElement newValueStreet1PrimResiField5;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[8]")
	private WebElement newValueStreet2PrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[9]")
	private WebElement newValueCityPrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[6]")
	private WebElement newValueCityPrimResiField6;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[10]")
	private WebElement newValuePostalCodePrimResiField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[11]")
	private WebElement newValueStreet1MailAddField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[12]")
	private WebElement newValueStreet2MailAddField;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-7vo5ly'])[3]")
	private WebElement newValueCityMailAddField;

	@FindBy(xpath = "//span[text()='View or Edit User Details']")
	private WebElement viewAndEditUserDetailsOption;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement errorMessageAfterLogin1;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement closeErrorMessage;

	@FindBy(xpath = "//*[@href='/change-jurisdiction']")
	private WebElement changejurisdiction;

	@FindBy(xpath = "//button[text()='CANCEL']")
	private WebElement cancelButtonForCancellingchangejurisdiction;

	@FindBy(xpath = "//div[@class='formContent MuiBox-root css-0']")
	private WebElement textcancelButtonForCancellingchangejurisdiction;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")
	private WebElement textOnPrompt;

	@FindBy(xpath = "(//*[text()='CANCEL'])[2]")
	private WebElement cancelButtonOnPrompt;

	@FindBy(xpath = "//button[text()='Welcome,']")
	private WebElement welcomeDropdown;

	@FindBy(xpath = "(//*[text()='Updated User Details Request'])[1]")
	private WebElement proposedUserDetailsOption;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterRegistrarDeactivateUserWithoutProfileAccess;

	@FindBy(xpath = "//*[contains(text(),'Cross Jurisdiction')]")
	private WebElement crossJurisdictionOption;

	@FindBy(xpath = "//span[contains(text(),'PENDING CROSS JURISDICTION')]")
	private WebElement pendingCrossJurisdictionOption;

	@FindBy(xpath = "//div[@id='mui-component-select-jurisdiction']")
	private WebElement selectJurisdictionDropdownForCrossJurisdiction;

	@FindBy(xpath = "//span[contains(text(),'Quebec')]")
	private WebElement selectQuebecOptionForCrossJurisdiction;

	@FindBy(xpath = "//span[contains(text(),'I accept the Jurisdiction')]")
	private WebElement checkboxIAcceptForCrossJurisdiction;

	@FindBy(xpath = "//button[@data-testid='priv_btn_continue']")
	private WebElement continueButtonForCrossJurisdiction;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement submitButtonForCrossJurisdiction;

	@FindBy(xpath = "(//*[text()='Cross Jurisdiction Request'])[1]")
	private WebElement crossJurisdictionRequestOption;

	@FindBy(xpath = "//input[@value='Share User Profile']")
	private WebElement shareUserProfileRadioButton;

	@FindBy(xpath = "//input[@value='Unshare User Profile']")
	private WebElement unshareUserProfileRadioButton;

	@FindBy(xpath = "//span[text()='Unshare User Profile']")
	private WebElement unshareUserProfileText;

	@FindBy(xpath = "//span[contains(text(),'Available to Share with')]")
	private WebElement avialableToShareWithText;

	@FindBy(xpath = "//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement closeIcon;

	@FindBy(xpath = "//*[@id='mui-component-select-jurisdiction']")
	private WebElement selectJurisdiction2;

	@FindBy(xpath = "//*[text()='California']")
	private WebElement selectCalifornia2;

	@FindBy(xpath = "//*[text()='Quebec']")
	private WebElement selectQuebec;

	@FindBy(xpath = "//*[text()='Washington State']")
	private WebElement selectWasington;

	@FindBy(xpath = "//*[@data-testid='priv_btn_continue']")
	private WebElement continueButtonforSelectJuri;

	@FindBy(xpath = "//button[contains(text(),'CANCEL')]")
	private WebElement cancelButtonforSelectJuri;

	@FindBy(xpath = "//*[text()='Change Jurisdiction Request']")
	private WebElement pageHeader1;

	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement termsCheckbox;

	@FindBy(xpath = "//span[text()='I accept the Jurisdiction']")
	private WebElement iAcceptTheJurisdictionTextForChangeJurisdiction;

	@FindBy(xpath = "//a[text()='Terms and Conditions']")
	private WebElement termsAndConditionsTextForChangeJurisdiction;

	@FindBy(xpath = "//button[@data-testid='Continue' and @type='submit']")
	private WebElement continueUserdetails;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement submitButton;

	@FindBy(xpath = "//*[text()='User Registration Checklist']")
	private WebElement userRegistrationChecklistForm;

	@FindBy(xpath = "//*[text()='User Registration Form']")
	private WebElement userRegistrationForm;

	@FindBy(xpath = "//*[text()='Identification Verification Form']")
	private WebElement proofOfIdentityForm;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMsg;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameInput;

	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	private WebElement calendarIcon;

	@FindBy(xpath = "//div[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	private WebElement calendarHeaderLabel;

	@FindBy(xpath = "//button[text()='1975']")
	private WebElement button1975;

	@FindBy(xpath = "//button[@aria-colindex='6']")
	private WebElement buttonWithColIndex6;

	@FindBy(id = "priv_btn_Continue")
	private WebElement continueButton;

	@FindBy(xpath = "//div[contains(text(),'Selected Jurisdiction')]")
	private WebElement selectedJurisdictionDiv;

	@FindBy(xpath = "//*[text()='SECURITY_QUESTION_1']")
	private WebElement securityQuestion1Element;

	@FindBy(xpath = "//*[text()='SECURITY_QUESTION_2']")
	private WebElement securityQuestion2Element;

	@FindBy(xpath = "(//*[text()='Select Jurisdiction'])[1]")
	private WebElement selectJurisdictionElement;

	@FindBy(xpath = "//li[@role='option']")
	private List<WebElement> optionsList;

	@FindBy(xpath = "(//button[contains(text(),'edit')])[1]")
	private WebElement editButton1;

	@FindBy(xpath = "(//button[contains(text(),'Ok')])[1]")
	private WebElement okButton;

	@FindBy(xpath = "//button[contains(text(),'CANCEL')]")
	private WebElement cancelButton;

	@FindBy(xpath = "//input[@id='RoleType']")
	private WebElement roleTypeInput;

	@FindBy(xpath = "//div[@class='MuiBox-root css-wkov39']")
	private WebElement muiBoxRootDiv;

	@FindBy(xpath = "//*[text()='Answer 3']//following::input[@id='answer3']")
	private WebElement securityQuestion3;

	public Sanity_User_Pom() {
		PageFactory.initElements(driver.get(), this);
		actions = new Actions(driver.get());
	}

	public void AR1_personalInformation() {
		salutation.sendKeys("Mr");
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		String s = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		String ss = "ar" + s + "-";
		firstName.sendKeys(ss);
		String s1 = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		String ss1 = "Test" + s1 + "-";
		middleName.sendKeys("user");
		lastName.sendKeys(ss1);
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
//		mobilePhone.sendKeys("9146458558");
		email.clear();
		emailId1 = generateEmailString();
		email.sendKeys(emailId1);
		confirmEmail.clear();
		confirmEmail.sendKeys(emailId1);
		emailLangPref.click();
		selLangEng.click();
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		js.executeScript("window.scrollBy(0,2500)", "");
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void AR2_personalInformation() {
		salutation.sendKeys("Mr");
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		firstName.sendKeys("AR");
		middleName.sendKeys("Test");
		lastName.sendKeys("Automation");
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
//		mobilePhone.sendKeys("9146458558");
		email.clear();
		emailId1 = generateEmailString();
		email.sendKeys(emailId1);
		confirmEmail.clear();
		confirmEmail.sendKeys(emailId1);
		emailLangPref.click();
		selLangEng.click();
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		js.executeScript("window.scrollBy(0,2500)", "");
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void AR3_personalInformation() {
		salutation.sendKeys("Mr");
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		firstName.sendKeys("AR3");
		middleName.sendKeys("Test");
		lastName.sendKeys("Automation");
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
//		mobilePhone.sendKeys("9146458558");
		email.clear();
		emailId1 = generateEmailString();
		email.sendKeys(emailId1);
		confirmEmail.clear();
		confirmEmail.sendKeys(emailId1);
		emailLangPref.click();
		selLangEng.click();
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		js.executeScript("window.scrollBy(0,2500)", "");
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void AR4_personalInformation() {
		salutation.sendKeys("Mr");
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		firstName.sendKeys("AR4");
		middleName.sendKeys("Test");
		lastName.sendKeys("Automation");
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
//		mobilePhone.sendKeys("9146458558");
		email.clear();
		emailId1 = generateEmailString();
		email.sendKeys(emailId1);
		confirmEmail.clear();
		confirmEmail.sendKeys(emailId1);
		emailLangPref.click();
		selLangEng.click();
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		js.executeScript("window.scrollBy(0,2500)", "");
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void JuriAdmin1_personalInformation() {
		salutation.sendKeys("Mr");
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		firstName.sendKeys("JuriAdmin");
		middleName.sendKeys("Test");
		lastName.sendKeys("Automation");
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
//		mobilePhone.sendKeys("9146458558");
		email.clear();
		emailId1 = generateEmailString();
		email.sendKeys(emailId1);
		confirmEmail.clear();
		confirmEmail.sendKeys(emailId1);
		emailLangPref.click();
		selLangEng.click();
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		js.executeScript("window.scrollBy(0,2500)", "");
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void JuriAdmin2_personalInformation() {
		salutation.sendKeys("Mr");
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		firstName.sendKeys("JuriAdmin2");
		middleName.sendKeys("Test");
		lastName.sendKeys("Automation");
		suffix.sendKeys("Suffix");
		calendarIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(calendarHeaderLabel));
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
		buttonWithColIndex6.click();
		telephoneNumber.sendKeys("9855855677");
		extension.sendKeys("0123");
//		mobilePhone.sendKeys("9146458558");
		email.clear();
		emailId1 = generateEmailString();
		email.sendKeys(emailId1);
		confirmEmail.clear();
		confirmEmail.sendKeys(emailId1);
		emailLangPref.click();
		selLangEng.click();
		employer.sendKeys("Employer");
		jobTitle.sendKeys("JobTitle");
		faxNumber.sendKeys("9146458558");
		js.executeScript("window.scrollBy(0,2500)", "");
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void selectJurisdictionStep() {
		wait.until(ExpectedConditions.elementToBeClickable(userRegistration));
		clickElementWithFallback(userRegistration, "userRegistration");

		wait.until(ExpectedConditions.elementToBeClickable(newRegistration));
		clickElementWithFallback(newRegistration, "newRegistration");
		System.out.println("Step: Click on new registration option");
		ObjectRepo.test.log(Status.PASS, "Step: Click on new registration option");

		clickElementWithFallback(startNewRegisBut, "startNewRegisBut");
		System.out.println("Step: Click on start new registration button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on start new registration button");

		selectJurisdiction1.click();
		selectJurisdiction1.sendKeys("Washington");
		selectJurisdiction1.sendKeys(Keys.ARROW_DOWN);
		selectJurisdiction1.sendKeys(Keys.ENTER);
		System.out.println("Step: Click on select jurisdiction dropdown");
		ObjectRepo.test.log(Status.PASS, "Step: Click on select jurisdiction dropdown");

		wait.until(ExpectedConditions.elementToBeClickable(contButton));
		CommonLibref.click(contButton, "moveToElementClick", "contButton");
	}

	private void clickElementWithFallback(WebElement element, String elementName) {
		try {
			CommonLibref.click(element, "seleniumClick", elementName);
		} catch (Exception e) {
			try {
				js.executeScript("arguments[0].scrollIntoView();", element);
				CommonLibref.click(element, "seleniumClick", elementName);
			} catch (Exception ex) {
				CommonLibref.click(element, "moveToElementClick", elementName);
			}
		}
	}

	public void selectJurisdictionForIndividualUser() {
		wait.until(ExpectedConditions.elementToBeClickable(userRegistration));
		try {
			CommonLibref.click(userRegistration, "seleniumClick", "userRegistration");
		} catch (Exception e) {
			js.executeScript("arguments[0].scrollIntoView();", userRegistration);
		}
		wait.until(ExpectedConditions.elementToBeClickable(newRegistration));
		try {
			CommonLibref.click(newRegistration, "seleniumClick", "newRegistration");
		} catch (Exception e) {
			CommonLibref.click(newRegistration, "moveToElementClick", "newRegistration");
		}
		System.out.println("Step :Click on new registration option");
		ObjectRepo.test.log(Status.PASS, "Step :Click on new registration option");
		try {
			CommonLibref.click(startNewRegisBut, "seleniumClick", "startNewRegisBut");
		} catch (Exception e) {
			CommonLibref.click(startNewRegisBut, "moveToElementClick", "startNewRegisBut");
		}
		System.out.println("Step :Click on start new registration button");
		ObjectRepo.test.log(Status.PASS, "Step :Click on start new registration button");
		selectJurisdiction1.click();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		selectJurisdiction1.sendKeys(jp.fetchStoredJurisdictionNameValue(0));
		selectJurisdiction1.sendKeys(Keys.ARROW_DOWN);
		selectJurisdiction1.sendKeys(Keys.ENTER);
		System.out.println("Step :Click on select jurisdiction dropdown");
		ObjectRepo.test.log(Status.PASS, "Step :Click on select jurisdiction dropdown");
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable(selectQubec2));
//			CommonLibref.click(selectQubec2, "moveToElementClick", "selectQubec2");
//		} catch (Exception e) {
//			CommonLibref.click(selectQubec2, "moveToElementClick", "selectQubec2");
//		}
		wait.until(ExpectedConditions.elementToBeClickable(contButton));
		CommonLibref.click(contButton, "moveToElementClick", "contButton");
	}

	public void residenceAndMailing() {
		street1PrimResi.sendKeys("Street1");
		street2PrimResi.sendKeys("Street2");
		cityPrimResi.sendKeys("City");
		ExpectedConditions.elementToBeClickable(countryPrimResi);
		wait.until(ExpectedConditions.elementToBeClickable(countryPrimResi));
		CommonLibref.click(countryPrimResi, "seleniumClick", "countryPrimResi");
		ExpectedConditions.elementToBeClickable(selectCountryUSPrimResi);
		CommonLibref.click(selectCountryUSPrimResi, "moveToElementClick", "selectCountryUSPrimResi");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.elementToBeClickable(stateAndProvincePrimResi);
		CommonLibref.click(stateAndProvincePrimResi, "seleniumClick", "stateAndProvincePrimResi");
		ExpectedConditions.elementToBeClickable(selectStatePrimResi);
		CommonLibref.click(selectStatePrimResi, "moveToElementClick", "selectStatePrimResi");
		postalCodePrimResi.sendKeys("123456");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		ExpectedConditions.elementToBeClickable(checkBox);
		WebElement element = checkBox;
		js.executeScript("arguments[0].click()", element);
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		WebElement element2 = primResiContButton;
		js.executeScript("arguments[0].click()", element2);
		System.out.println(
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step : Enter valid data in all fields of residence and mailing step page and click on continue button");
	}

	public void editAndReview() {
		wait.until(ExpectedConditions.elementToBeClickable(selectedJurisdictionDiv));
		WebElement element3 = checkBoxEditAndReview;
		js.executeScript("arguments[0].click()", element3);
		WebElement element4 = editAndReviewContButton;
		js.executeScript("arguments[0].click()", element4);
	}

	public void createUserLogin_For_AR1() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		userId1 = generateUserIdString_For_AR1();
		System.out.println("Uesrid :" + userId1);
		createUserId.sendKeys(userId1);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys("Wciadmin@123");
		confirmPassphrase.sendKeys("Wciadmin@123");
		userIDOfUser = createUserId.getAttribute("Value");
		passphraseOfUser = passphrase1.getAttribute("Value");
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void createUserLogin_For_AR2() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		userId2 = generateUserIdString_For_AR2();
		System.out.println("Uesrid :" + userId2);
		createUserId.sendKeys(userId2);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		userIDOfUser = createUserId.getAttribute("Value");
		passphraseOfUser = passphrase1.getAttribute("Value");
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void createIndividualUserForNewJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		indUserForNewJuri = generateUserIdString_For_AR3();
		System.out.println("Uesrid :" + indUserForNewJuri);
		createUserId.sendKeys(indUserForNewJuri);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		userIDOfUser = createUserId.getAttribute("Value");
		passphraseOfUser = passphrase1.getAttribute("Value");
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

	public void createUserLogin_For_AR4() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		userId4 = generateUserIdString_For_AR4();
		System.out.println("Uesrid :" + userId4);
		createUserId.sendKeys(userId4);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		userIDOfUser = createUserId.getAttribute("Value");
		passphraseOfUser = passphrase1.getAttribute("Value");
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void createUserLogin_For_JuriAdmin1() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		juriAdmin1 = generateUserIdString_For_JuriAdmin1();
		System.out.println("Uesrid :" + juriAdmin1);
		createUserId.sendKeys(juriAdmin1);
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

	public void createUserLogin_For_JuriAdmin2() {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		userId6 = generateUserIdString_For_JuriAdmin2();
		System.out.println("Uesrid :" + userId6);
		createUserId.sendKeys(userId6);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		userIDOfUser = createUserId.getAttribute("Value");
		passphraseOfUser = passphrase1.getAttribute("Value");
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void SecurityQuestions() {
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
		CommonLibref.click(secQuestion1, "seleniumClick", "secQuestion1");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selSecQue1));
			selSecQue1.click();
		} catch (Exception e) {
			WebElement que1 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que1, "seleniumClick", "que1");
		}

		CommonLibref.click(answer1, "seleniumClick", "answer1");
		answer1.sendKeys("aaaa");
		answer1.sendKeys(Keys.TAB);

		js.executeScript("window.scrollBy(0,200)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
		CommonLibref.click(secQuestion2, "seleniumClick", "secQuestion2");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selSecQue2));
			selSecQue2.click();
		} catch (Exception ex) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
		}

		js.executeScript("arguments[0].click();", answer2);
		answer2.sendKeys("teacher");
		answer2.sendKeys(Keys.TAB);

		js.executeScript("window.scrollBy(0,1200)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
		CommonLibref.click(secQuestion3, "seleniumClick", "secQuestion3");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(selSecQue3));
			selSecQue3.click();
		} catch (Exception exx) {
			WebElement que3 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que3, "seleniumClick", "que3");
		}

		CommonLibref.click(answer3, "seleniumClick", "answer3");
		answer3.sendKeys("card");

		js.executeScript("arguments[0].click()", termsOfUseCheckBox);

		try {
			js.executeScript("arguments[0].click()", creUserProfRegBut);
		} catch (Exception e) {
			CommonLibref.click(creUserProfRegBut, "seleniumClick", "creUserProfRegBut");
		}

		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration: " + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration: " + successMessage);

		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");

		if (userReferenceCode.isDisplayed()) {
			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
		}

		user1referencecode = refCode.getText();
		System.out.println("Reference code is displayed as: " + user1referencecode);

		js.executeScript("window.scrollBy(0,1800)");
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");

		wait.until(ExpectedConditions.elementToBeClickable(finishButton));
		try {
			CommonLibref.click(finishButton, "javascriptClick", "finishButton");
		} catch (Exception e) {
			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
		}

		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void SecurityQuestions2() {
		waitUntilClickableAndClick(secQuestion1, "secQuestion1");
		clickWithRetries(selSecQue1, "SECURITY_QUESTION_1");

		CommonLibref.click(answer1, "seleniumClick", "answer1");
		answer1.sendKeys("aaaa");
		answer1.sendKeys(Keys.TAB);
		js.executeScript("window.scrollBy(0,300)");
		sleepFor(3000);
		waitUntilClickableAndClick(secQuestion2, "secQuestion2");
		clickWithRetries(selSecQue2, "SECURITY_QUESTION_2");

		js.executeScript("arguments[0].click();", answer2);
		answer2.sendKeys("teacher");
		answer2.sendKeys(Keys.TAB);

		js.executeScript("window.scrollBy(0,1200)");
		sleepFor(3000);

		waitUntilClickableAndClick(secQuestion3, "secQuestion3");
		clickWithRetries(selSecQue3, "SECURITY_QUESTION_3");

		CommonLibref.click(answer3, "seleniumClick", "answer3");
		answer3.sendKeys("card");

		js.executeScript("arguments[0].click()", termsOfUseCheckBox);

		clickWithRetries(creUserProfRegBut, "creUserProfRegBut", true);

		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration: " + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration: " + successMessage);

		waitUntilClickableAndClick(crossButtonAfterRegistration, "crossButtonAfterRegistration");

		if (userReferenceCode.isDisplayed()) {
			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
		}

		user1referencecode = refCode.getText();
		System.out.println("Reference code is displayed as: " + user1referencecode);

		js.executeScript("window.scrollBy(0,1800)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");

		waitUntilClickableAndClick(finishButton, "finishButton");

		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	private void waitUntilClickableAndClick(WebElement element, String elementName) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		CommonLibref.click(element, "seleniumClick", elementName);
	}

	private void clickWithRetries(WebElement element, String fallbackText) {
		clickWithRetries(element, fallbackText, false);
	}

	private void clickWithRetries(WebElement element, String fallbackText, boolean useJavaScript) {
		int retries = 3;
		while (retries > 0) {
			try {
				if (useJavaScript) {
					js.executeScript("arguments[0].click()", element);
				} else {
					element.click();
				}
				return;
			} catch (Exception e) {
				retries--;
				if (retries == 0) {
					WebElement fallbackElement = driver.get()
							.findElement(By.xpath("//*[text()='" + fallbackText + "']"));
					CommonLibref.click(fallbackElement, "seleniumClick", fallbackText);
				} else {
					sleepFor(500);
				}
			}
		}
	}

	private void waitUntilVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	private void sleepFor(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void registrarApproveAndAssignIndividualUsersRole() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Personal Information']")));
		js.executeScript("window.scrollBy(0,1800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(approveRadioButton, "moveToElementClick", "approveRadioButton");
		CommonLibref.click(selectRoleTypeDropdown, "moveToElementClick", "selectRoleTypeDropdown");
		selectRoleTypeDropdown.sendKeys(Keys.ARROW_DOWN);
		selectRoleTypeDropdown.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(roleDropdown));
		CommonLibref.click(roleDropdown, "seleniumClick", "roleDropdown");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(selectIndividualUsersRole));
		CommonLibref.click(selectIndividualUsersRole, "seleniumClick", "selectIndividualUsersRole");
		Actions action = new Actions(driver.get());
		action.moveToElement(selectRoleTypeDropdown).build().perform();
		js.executeScript("window.scrollBy(0,2650)");
		js.executeScript("arguments[0].click();", saveButton);
		ExpectedConditions.visibilityOf(successMessageAfterRegistrarApproveUser);
		String successMessage = successMessageAfterRegistrarApproveUser.getText();
		Assert.assertEquals("User request has been approved.", successMessage);
		System.out.println("Success Message after Registrar Approve and assign individual role :" + successMessage);
		ExpectedConditions.elementToBeClickable(crossButtonOnErrorMessageAfterLogin2);
		CommonLibref.click(crossButtonOnErrorMessageAfterLogin2, "moveToElementClick",
				"crossButtonOnErrorMessageAfterLogin2");
	}

	public void registrarApproveAndAssignJuriAdminUsersRole() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Personal Information']")));
		js.executeScript("window.scrollBy(0,1800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(approveRadioButton, "moveToElementClick", "approveRadioButton");
		CommonLibref.click(selectRoleTypeDropdown, "moveToElementClick", "selectRoleTypeDropdown");
//		selectRoleTypeDropdown.sendKeys(Keys.ARROW_DOWN);
		selectRoleTypeDropdown.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(roleDropdown));
		CommonLibref.click(roleDropdown, "seleniumClick", "roleDropdown");
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionUsersRole));
		CommonLibref.click(selectJurisdictionUsersRole, "seleniumClick", "selectIndividualUsersRole");
		Actions action = new Actions(driver.get());
		action.moveToElement(selectRoleTypeDropdown).build().perform();
		js.executeScript("window.scrollBy(0,2650)");
		js.executeScript("arguments[0].click();", saveButton);
		ExpectedConditions.visibilityOf(successMessageAfterRegistrarApproveUser);
		String successMessage = successMessageAfterRegistrarApproveUser.getText();
		System.out.println(
				"Success Message after Registrar Approve and assign Jurisdiction Admin role :" + successMessage);
		Assert.assertEquals("User has sent for Authority Approval", successMessage);
		ExpectedConditions.elementToBeClickable(crossButtonOnErrorMessageAfterLogin2);
		CommonLibref.click(crossButtonOnErrorMessageAfterLogin2, "moveToElementClick",
				"crossButtonOnErrorMessageAfterLogin2");
	}
	public void registrarAssignJuriAdminUsersRole1() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Personal Information']")));
		js.executeScript("window.scrollBy(0,1800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.pageLoader();
	//	CommonLibref.click(selectRoleTypeDropdown, "moveToElementClick", "selectRoleTypeDropdown");
		CommonLibref.click(roleDropdown, "seleniumClick", "roleDropdown");
		CommonLibref.scroll(CrossIconUser, "scrollToTopOFPage", "CrossIconUser");
		CommonLibref.click(CrossIconUser, "seleniumClick", "CrossIconUser");
	//	CommonLibref.click(approveRadioButton, "moveToElementClick", "approveRadioButton");
	//	CommonLibref.click(selectRoleTypeDropdown, "moveToElementClick", "selectRoleTypeDropdown");
//		selectRoleTypeDropdown.sendKeys(Keys.ARROW_DOWN);
//		selectRoleTypeDropdown.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(roleDropdown));
	//	CommonLibref.click(roleDropdown, "seleniumClick", "roleDropdown");
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionUsersRole));
		CommonLibref.click(selectJurisdictionUsersRole, "seleniumClick", "selectIndividualUsersRole");
		Actions action = new Actions(driver.get());
		action.moveToElement(selectRoleTypeDropdown).build().perform();
		js.executeScript("window.scrollBy(0,2650)");
		js.executeScript("arguments[0].click();", saveButton);
		ExpectedConditions.visibilityOf(successMessageAfterRegistrarApproveUser);
		String successMessage = successMessageAfterRegistrarApproveUser.getText();
		System.out.println(successMessage);
	//	Assert.assertEquals("User has sent for Authority Approval", successMessage);
		ExpectedConditions.elementToBeClickable(crossButtonOnErrorMessageAfterLogin2);
		CommonLibref.click(crossButtonOnErrorMessageAfterLogin2, "moveToElementClick",
				"crossButtonOnErrorMessageAfterLogin2");
	}
	
	
	
	public static String generateEmailString() {
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		String randomString = ("Test" + generatedString + "@eqanim-qa.wci-validate.org");
		return randomString;
	}

	public static String generateUserIdString_For_AR1() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("AR1" + generatedString);
		return randomString;
	}

	public static String generateUserIdString_For_AR2() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("ar2" + generatedString.toLowerCase());
		return randomString;
	}

	public static String generateUserIdString_For_AR3() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("ar1" + generatedString.toLowerCase());
		return randomString;
	}

	public static String generateUserIdString_For_AR4() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("AR4" + generatedString);
		return randomString;
	}

	public static String generateUserIdString_For_JuriAdmin1() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("Admin1" + generatedString.toLowerCase());
		return randomString;
	}

	public static String generateUserIdString_For_JuriAdmin2() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("JuriAdmin2" + generatedString);
		return randomString;
	}

	public void authorityApproveUser() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Personal Information']")));
		js.executeScript("window.scrollBy(0,1600)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement abcd = approveRadioButton;
		Actions act = new Actions(driver.get());
		act.moveToElement(abcd).build().perform();
		act.click(abcd).build().perform();
		String roleType = driver.get().findElement(By.xpath("//*[@id='mui-component-select-Roles']")).getText();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Role type is :" + roleType);
		js.executeScript("window.scrollBy(0,2650)");
		WebElement abc = saveButton;
		js.executeScript("arguments[0].click();", abc);
		wait.until(ExpectedConditions.elementToBeClickable((successMessageAfterRegistrarApproveUser)));
		String successMessage = successMessageAfterRegistrarApproveUser.getText();
		System.out.println("Success Message after Authority Approve user :" + successMessage);
	//	Assert.assertEquals("User request has been approved.", successMessage);
		ObjectRepo.test.log(Status.PASS, "Success Message after Authority Approve user :" + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable((crossButtonOnErrorMessageAfterLogin2)));
		CommonLibref.click(crossButtonOnErrorMessageAfterLogin2, "moveToElementClick",
				"crossButtonOnErrorMessageAfterLogin2");
	}

	public void UserApprovalPage_For_AR1() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf((SearchUserName)));
		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
		SearchUserName.sendKeys(userIDOfUser);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		wait.until(ExpectedConditions.visibilityOf((FirstElementOnUserGrid)));
		wait.until(ExpectedConditions.elementToBeClickable((FirstElementOnUserGrid)));
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}

	public void UserApprovalPage_For_AR2() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
		SearchUserName.sendKeys(userId2);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}

	public void UserApprovalPage_For_AR3() {
		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
		SearchUserName.sendKeys(indUserForNewJuri);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}

	public void UserApprovalPage_For_AR4() {
		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
		SearchUserName.sendKeys(userId4);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}

	public void UserApprovalPage_For_JuriAdmin1() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
		SearchUserName.sendKeys(juriAdmin1);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}
	
	public void UserApprovalPage_For_JuriAdmin12() {
		CommonLibref.pageLoader();
//		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
//		SearchUserName.sendKeys(juriAdmin1);
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
		System.out.println("User Should get navigated to User Details Page");
	}
	
	
	
	
	
	

	public void UserApprovalPage_For_JuriAdmin2() {
		wait.until(ExpectedConditions.elementToBeClickable((SearchUserName)));
		SearchUserName.sendKeys(userId6);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}

	public void selectSecurityQuestionsForIndividualUser01() {
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
		try {
			secQuestion1.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion1, "seleniumClick", "que2");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			// wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
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
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,300)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
		try {
			secQuestion2.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion2, "seleniumClick", "que2");
		}
		js.executeScript("window.scrollBy(0,300)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			// wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
			selSecQue2.click();
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("card");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("card");
		}

		// Select security question 3
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
		try {
			secQuestion3.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion3, "seleniumClick", "que2");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			// wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
			selSecQue3.click();
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_7']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		}
		WebElement element1 = termsOfUseCheckBox;
		JavascriptExecutor js3 = (JavascriptExecutor) driver.get();
		js3.executeScript("arguments[0].click()", element1);

		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", creUserProfRegBut);
		} catch (Exception e) {
			CommonLibref.click(creUserProfRegBut, "seleniumClick", "creUserProfRegBut");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		String successMessage = successMessageForResetPassphrase.getText();

//		Assert.assertEquals("A confirmation has been emailed to the address provided.", successMessage);
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
		ExpectedConditions.visibilityOf(crossButtonAfterRegistration);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
		WebElement userReferenceCodeText = userReferenceCode;
		if (userReferenceCodeText.isDisplayed()) {
			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
		}
		user1referencecode = refCode.getText();
		System.out.println("Reference code is displayed as - " + user1referencecode);
		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
		js1.executeScript("window.scrollBy(0,1800)");
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
}
