package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import java.util.List;
import java.util.Random;
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

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

public class Create_Participating_Jurisdiction_Pom {

	public static commonLib CommonLibref = new commonLib();

	JavascriptExecutor js;
	public static String homePage;
	public static String setUpNewJurisdictionTitle;
	public static String commentName;
	public static String selectJurisdiction;
	public static String onboardJurisdiction;
	public static String SeededUserRegistrarEmailAddress;
	public static String SeededUserJSA1EmailAddress;
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
	public static String PostLinkedstatus;
	public static String Unlinkedstatus;
	public static String Offboardedstatus;
	public String GHGID;
	public String entityID;

	@FindBy(xpath = "//div[text()='Select Jurisdiction']")
	private WebElement selectJurisdictionDropDown;
	
	@FindBy(xpath = "//*[text()='California']")
	private WebElement selectOptionCalifornia;
	
	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement textBoxEmail;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement textBoxPassWord;
	
	@FindBy(xpath = "//*[@id='select-jurisdiction']")
	private WebElement selectJurisdictionDropDown2;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-o2reyj']")
	private WebElement AllJurisdictions;
	
	@FindBy(xpath = "//div[@role='combobox']")
	private WebElement RowsPerPage;
	
	@FindBy(xpath = "//div[@class=\"footerMain MuiBox-root css-0\"]")
	private WebElement manageCornJobsSection;
	
	@FindBy(xpath = "//p[text()='MANAGE STATUS']")
	private WebElement TextmanageStatusOption;
	
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[5]")
	private WebElement ClassManageStatusOption;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//..//input[@placeholder='--Select--']")
	private WebElement SearchFieldOfJurisdictionStatus;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Post-Linked']")
	private WebElement saveJurisdicionStatusfield;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Unlinked']")
	private WebElement saveJurisdicionStatusfieldUnlinked;

	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Offboarded']")
	private WebElement OffboardJurisdicionStatusfield;
	
	@FindBy(xpath = "//h2[text()='Change Status']//..//p[contains(@class,'MuiTypography-root MuiTypography-body2 css-1fr8lnd')]")
	private WebElement JurisdictionInLinkage;
	
	@FindBy(xpath = "//*[text()='Change Status']//..//*[@data-testid='CheckBoxOutlineBlankIcon']")
	private WebElement acknowledgeCheckbox2;
	
	@FindBy(xpath = "//input[@name='acknowledgement']")
	private WebElement acknowledgeCheckbox01;
	
	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	private WebElement TestIdSubmitButton;
	
	@FindBy(xpath = "//*[text()='Confirm']")
	private WebElement continueBTNOnWarningPopup;
	
	@FindBy(xpath = "//h4[text()='Manage Jurisdictions']")
	private WebElement passphaseTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement ConfirmButtonOnWarningPopoup;
	
	@FindBy(xpath = "//*[text()='Rows per page']")
	private WebElement rowPage;
	
	@FindBy(xpath = "//button[@data-testid='more-actions']")
	private WebElement MoreActions;
	
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[2]")
	private WebElement ManageStatus;
	
	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement ManageJurisdictionStatusTitle;
	
	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	public WebElement ClickonDateofLinkage;
	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"]")
	private WebElement GetDate;
	
	@FindBy(xpath = "(//*[@data-testid=\"ArrowDropDownIcon\"])[6]")
	public WebElement SelectArrowFutureYear;
	
	@FindBy(xpath = "//div[@class=\"MuiPickersYear-root css-j9zntq\"]//..//button[(text()='2025')]")
	public WebElement SelectFutureYear;
	
	@FindBy(xpath = "//textarea[@id='comments']")
	public WebElement Comments;
	
	@FindBy(xpath = " //input[contains(@id,'jurisdictionStatus-react-hook-form-select-search-option-0')]")
	public WebElement Options;
	
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

	@FindBy(xpath = "//button[@aria-colindex='6']")
	private WebElement buttonWithColIndex6;

	@FindBy(xpath = "//input[@id='jobTitle']")
	private WebElement jobTitle;
	
	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon1;
	
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

	@FindBy(xpath = "//span[contains(text(),'Check if same as Primary Residence')]")
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
	
	@FindBy(xpath = "//div[contains(text(),'Selected Jurisdiction')]")
	private WebElement selectedJurisdictionDiv;
	
	@FindBy(xpath = "//input[@id='confirmPassphrase']")
	private WebElement confirmPassphrase;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion1']")
	private WebElement secQuestion1;

	@FindBy(xpath = "//li[@data-value='In which city or town was your first job?']")
	private WebElement selSecQue1;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement enterJurisdictionName;
	
	@FindBy(xpath = "//input[@id='answer1']")
	private WebElement answer1;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion2']")
	private WebElement secQuestion2;

	@FindBy(xpath = "//li[@data-value='What was the last name of your third-grade teacher?']")
	private WebElement selSecQue2;

	@FindBy(xpath = "//input[@id='answer2']")
	private WebElement answer2;

	@FindBy(xpath = "//*[@id='mui-component-select-securityQuestion3']")
	private WebElement secQuestion3;

	@FindBy(xpath = "//li[@data-value='In which year did you get your first credit card?']")
	private WebElement selSecQue3;

	@FindBy(xpath = "//input[@id='answer3']")
	private WebElement answer3;

	@FindBy(xpath = "//*[contains(text(),'I accept the WCI, Inc.')]")
	private WebElement termsOfUseCheckBox;

	@FindBy(xpath = "//*[contains(text(),'REGISTER')]")
	private WebElement creUserProfRegBut;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement crossButtonAfterRegistration;
	
	@FindBy(xpath = "(//p[text()='User Reference Code:'])[1]")
	private WebElement userReferenceCode;
	
	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement finishButton;
	
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
	
	@FindBy(xpath = "//*[contains(@href, 'https://qa2.wci-registry.org/create-user-profile?LinkID=')]")
	List<WebElement> linkContainingHref;
	
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement continueButtonOnWorningPopupOfSetUpNewJurisdiction;
	
	@FindBy(xpath = "//h4[text()='Manage Jurisdictions']")
	private WebElement manageJurisdictions;
	
	@FindBy(xpath = "//*[text()='Success!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon;
	
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement SuccessMessage;
	
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@placeholder='--Select--']")
	private WebElement addLanguageOnSetUpJurisdiction;
	
	@FindBy(xpath = "//input[@id=\"languageDetailsIds-react-hook-form-select-search\"]")
	private WebElement ClickOnLanguage;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement SaveDisabled;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement UserId;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@name='remember']")
	private WebElement RememberMe;
	
	@FindBy(xpath = "//button[@id='login_btn']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//textarea[@placeholder='Comments...']")
	private WebElement commentSectionOnJSAPage;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']//..//..//..//*[@for='customize-textfield']") // label[@class='MuiFormLabel-root
	private WebElement commentHeading;
	
	@FindBy(xpath = "(//textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	private WebElement enteredFieldIncommentOnJSAPage;
	
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[2]")
	private WebElement RevisionRadioButton;
	
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdiction;
	
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement saveJurisdicion;
	
	@FindBy(xpath = "//h2[@class='MuiTypography-root MuiTypography-h2 css-yj408y']//..//h2[text()='Jurisdiction Request and Status Change History']")
	private WebElement statusChangeHistory;
	
	@FindBy(xpath = "((//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	private WebElement manageJurisdictionDetailsOption;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement headingOfManageJurisdictionDetails;
	
	@FindBy(xpath = "(//*[text()='Request Status']//..//..//..//..//..//..//..//*[@class='MuiDataGrid-cellContent'])[1]")
	public WebElement requestStatusCoulum;
	
	@FindBy(xpath = "//h2[text()='Change Status']")
	private WebElement headingOfChangeStatus;
	
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdictionStatus;
	
	@FindBy(xpath = "//*[@id='jurisdictionStatus-react-hook-form-select-search']")
	public WebElement statusInJurisdictionStatusFiled;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//..//*[contains(text(),'MANAGE TRANSFERS')]")
	public WebElement manageJurisdictionTransferOption;
	
	@FindBy(xpath = "//*[@name='ij_approved_status_within_entity']")
	public WebElement checkBoc_Icon;
	
	@FindBy(xpath = "//*[@name='ij_approved_status_within_entity']")
	public WebElement allowTransfersFromApprovedStatusCheckBox1;
	
	@FindBy(xpath = "//*[@name='ij_proposed_status_within_entity']")
	public WebElement allowTransfersProposedStatusUncheckedCheckBox1;
	
	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	public WebElement StopAllFutureTransfer;
	
	@FindBy(xpath = "//input[@name='ij_stop_all_transfers_in_progress']")
	public WebElement StopAllInProgressTransfer;
	
	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	public WebElement UnCheckedStopAllFutureTransfer;
	
	@FindBy(xpath = "//button[@data-testid='submitBtn']//..//*[contains(text(),'MANAGE ALL TRANSFERS')]")
	public WebElement ManageAllTransfers;
	
	@FindBy(xpath = "//*[@data-testid='submitBtn']//..//*[contains(text(),'Save')]")
	public WebElement SubmitButton;
	
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CalendarIcon')]")
	public WebElement DateIcon;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-1guc83g']")
	public WebElement CurrentDateTime;
	
	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	public WebElement UnCheckedStopAllInProgressTransfer;
	
	@FindBy(xpath = "(//button[@data-testid='submitBtn'])[2]")
	private WebElement SubmitButton2Index;
	
	@FindBy(xpath = "(//*[@class=\"MuiDataGrid-cellContent\"])[1]")
	private WebElement StoredJurisdiction;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchJurisdiction;
	
	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//..//*[contains(text(),'MANAGE TRANSFERS')]")
	private WebElement ManageTransfer;
	
	@FindBy(xpath = "//input[@name='cj_stop_all_future_transfers']")
	public WebElement CrossJurisdictionStopFutureTransfer;
	
	@FindBy(xpath = "//input[@name='cj_stop_all_future_transfers']")
	public WebElement UnCheckedCrossJurisdictionStopFutureTransfer;
	
	@FindBy(xpath = "//input[@name='cj_stop_all_transfers_in_progress']")
	public WebElement CrossJurisdictionInProgressTransfer;
	
	@FindBy(xpath = "//input[@name='cj_stop_all_transfers_in_progress']")
	public WebElement CrossJurisdictionAllFutureTransfer;
	
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//*[contains(@name,'ij_proposed_status_within_entity')]")
	public WebElement Blanck;
	
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	private WebElement AssertCancelonStatusPage;

	public Create_Participating_Jurisdiction_Pom() {
		PageFactory.initElements(driver.get(), this);
	}

	public void selectCurrentfLinkage() {
		wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 100)");
		try {
			CommonLibref.click(dateDropdownoption, "seleniumClick", "dateDropdownoption");
		} catch (NoSuchElementException e) {
			CommonLibref.click(dateDropdownoption, "javascriptClick", "dateDropdownoption");
		} catch (Exception e) {
			CommonLibref.click(dateDropdownoption, "moveToElementClick", "dateDropdownoption");
		}
		System.out.println("Click on Date of Linkage");
		wait.until(ExpectedConditions.elementToBeClickable(selectCurrentDate));
		CommonLibref.click(selectCurrentDate, "seleniumClick", "selectDate");
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("Date of Linkage is selected");
	}

	public void SearchCraetedNewJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(Keys.CONTROL, "a");
		homepageSearchOption.sendKeys(Keys.BACK_SPACE);
		homepageSearchOption.sendKeys(onboardJurisdiction);
		System.out.println("Enter Jurisdiction Name =" + onboardJurisdiction);
	}

	public void LoginWithEmail(String Email, String Password, String Username) {
		driver.get().navigate().to("https://www.google.com/gmail/about/");
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
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

	public void SearchJSA1EmailAdressClickOnRegistrationLink() {
		wait.until(ExpectedConditions.visibilityOf(searchEmailFiled)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmailFiled)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmailFiled)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmailFiled)).sendKeys(SeededUserJSA1EmailAddress);
		wait.until(ExpectedConditions.visibilityOf(searchEmailFiled)).sendKeys(Keys.ENTER);
		try {
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

	public void UserRegistrationForSeededUserRegistrar() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LoginWithEmail("catch-all@eqanim-qa.wci-validate.org", "7@S699x^j%7ce69FJm2U", SeededUserRegistrarEmailAddress);
	}

	public void UserRegistrationForSeededUserJSA1() {
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(SeededUserJSA1EmailAddress);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			elementWithId.click();
		} catch (Exception ex) {
			viewMessages.click();
			elementWithId.click();
		}
		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
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

	public void UserRegistrationForSeededUserJSA2() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(SeededUserJSA2EmailAddress);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			elementWithId.click();
		} catch (Exception ex) {
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

	public void UserRegistrationForSeededUserAuthority() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.CONTROL, "a");
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(SeededUserAuthorityEmailAddress);
		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
		try {
			elementWithId.click();
		} catch (Exception ex) {
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

	public void CreateRegistrarSeededUser() throws InterruptedException {
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOf(userInformation));
		String actualText = userInformation.getText();
		Assert.assertEquals(actualText, "User Information");
		System.out.println("On Set Up Initial Page table name displayed as - " + actualText);
		ObjectRepo.test.log(Status.PASS, "On Set Up Initial Page table name displayed as - " + actualText);
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		String ss = "registrar" + s + "-";
		addFirstName.sendKeys(ss);
		firstNameRegistrar = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameRegistrar);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s1 = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		addlastName.sendKeys(s1);
		lastNameRegistrar = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameRegistrar);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "registrar" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		emailIdFiled.sendKeys(Keys.TAB);
		SeededUserRegistrarEmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Registrar Email Address displayed - " + SeededUserRegistrarEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Registrar Email Address displayed - " + SeededUserRegistrarEmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Registrar");
		registarXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateJSA1SeededUser() throws InterruptedException {
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "jsa" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		firstNameJsa1 = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameJsa1);
		ObjectRepo.test.log(Status.PASS, "First name is displayed as - " + firstNameJsa1);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s1 = RandomStringUtils.randomAlphabetic(6);
		String s2 = "-" + s1.toLowerCase();
		addlastName.sendKeys(s2);
		lastNameJsa1 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameJsa1);
		ObjectRepo.test.log(Status.PASS, "Last name is displayedas - " + lastNameJsa1);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "jsa" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		SeededUserJSA1EmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("JSA1 Email Address displayed - " + SeededUserJSA1EmailAddress);
		ObjectRepo.test.log(Status.PASS, "JSA1 Email Address displayed - " + SeededUserJSA1EmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Jurisdiction System Admin");
		jSAXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateJSA2SeededUser() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "jsa-" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		firstNameJsa2 = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameJsa2);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s3 = RandomStringUtils.randomAlphabetic(6);
		String s4 = s3.toLowerCase();
		addlastName.sendKeys(s4);
		lastNameJsa2 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameJsa2);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String JSA2EmailId = "jsa" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(JSA2EmailId);
		SeededUserJSA2EmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("JSA2 Email Address displayed - " + SeededUserJSA2EmailAddress);
		ObjectRepo.test.log(Status.PASS, "JSA2 Email Address displayed - " + SeededUserJSA2EmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Jurisdiction System Admin");
		jSAXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateAuthoritySeededUser() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "authority" + "-" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		authorityFirstName = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + authorityFirstName);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s6 = RandomStringUtils.randomAlphabetic(6);
		String s7 = s6.toLowerCase();
		addlastName.sendKeys(s7);
		authorityLastName = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + authorityLastName);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String AuthorityEmailId = "authority" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(AuthorityEmailId);
		SeededUserAuthorityEmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Authority Email Address displayed - " + SeededUserAuthorityEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Authority Email Address displayed - " + SeededUserAuthorityEmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Authority");
		authorityXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void AssertSeededUserRegistrarDetails() {
		String name1 = firstNameOnRegistrationLink.getAttribute("value");
		System.out.println("First Name OnRegistration link - " + name1);
		ObjectRepo.test.log(Status.PASS, "First Name OnRegistration link - " + name1);
		String name2 = LastNameOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + name2);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + name2);
		String email = emailOnRegistrationLink.getAttribute("value");
		System.out.println("Last Name OnRegistration link - " + email);
		ObjectRepo.test.log(Status.PASS, "Last Name OnRegistration link - " + email);
		Assert.assertEquals(firstNameRegistrar, name1);
		Assert.assertEquals(lastNameRegistrar, name2);
		Assert.assertEquals(SeededUserRegistrarEmailAddress, email);
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
		CommonLibref.click(calendarHeaderLabel, "seleniumClick", "calendarHeaderLabel");
		ExpectedConditions.elementToBeClickable(button1975);
		button1975.click();
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
		CommonLibref.click(perInfoContButton, "moveToElementClick", "perInfoContButton");
		System.out.println("Step: Enter valid data in all fields and click on continue button");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid data in all fields and click on continue button");
	}

	public void AddvalidaPrimaryResidence() {
		street1PrimResi.sendKeys("Street1");
		street2PrimResi.sendKeys("Street2");
		cityPrimResi.sendKeys("City");
		ExpectedConditions.elementToBeClickable(countryPrimResi);
		CommonLibref.click(countryPrimResi, "seleniumClick", "countryPrimResi");
		ExpectedConditions.elementToBeClickable(selectCountryUSPrimResi);
		CommonLibref.click(selectCountryUSPrimResi, "moveToElementClick", "selectCountryUSPrimResi");
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
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", perInfoContButton);
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(perInfoContButton).click(perInfoContButton).build().perform();
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
			CommonLibref.click(checkBoxEditAndReview, "seleniumClick", "checkBoxEditAndReview");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		WebElement element4 = editAndReviewContButton;
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", element4);
		} catch (Exception e) {
			CommonLibref.click(editAndReviewContButton, "seleniumClick", "editAndReviewContButton");
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
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		registrarUserId = generateUserIdForRegistrar();
		System.out.println("Registrar1Uesrid :" + registrarUserId);
		createUserId.sendKeys(registrarUserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
		ExpectedConditions.elementToBeClickable(secQuestion1);
		CommonLibref.click(secQuestion1, "seleniumClick", "secQuestion1");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue1);
			selSecQue1.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			WebElement que1 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que1, "seleniumClick", "que1");
		}
		CommonLibref.click(answer1, "seleniumClick", "answer1");
		answer1.sendKeys(prop.getProperty("Answer1"));
		answer1.sendKeys(Keys.TAB);
		CommonLibref.click(secQuestion2, "seleniumClick", "secQuestion2");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue2);
			selSecQue2.click();
		} catch (Exception ex) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
		}
		CommonLibref.click(answer2, "seleniumClick", "answer2");
		answer2.sendKeys(prop.getProperty("Answer2"));
		answer2.sendKeys(Keys.TAB);
		JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
		js2.executeScript("window.scrollBy(0,1200)");
		CommonLibref.click(secQuestion3, "seleniumClick", "secQuestion3");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue3);
			selSecQue3.click();
		} catch (Exception exx) {
			WebElement que3 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que3, "seleniumClick", "que3");
		}
		CommonLibref.click(answer3, "seleniumClick", "answer3");
		answer3.click();
		answer3.sendKeys(prop.getProperty("Answer3"));
		WebElement element1 = termsOfUseCheckBox;
		JavascriptExecutor js3 = (JavascriptExecutor) driver.get();
		js3.executeScript("arguments[0].click()", element1);
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", creUserProfRegBut);
		} catch (Exception e) {
			CommonLibref.click(creUserProfRegBut, "seleniumClick", "creUserProfRegBut");
		}
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
		WebElement userReferenceCodeText = userReferenceCode;
		if (userReferenceCodeText.isDisplayed()) {
			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
		}
		JavascriptExecutor js02 = (JavascriptExecutor) driver.get();
		js02.executeScript("window.scrollBy(0,1200)");
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

	public void ClickOnContinueButton() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		Actions action = new Actions(driver.get());
		action.moveToElement(SubmitButton).click(SubmitButton).build().perform();
		System.out.println("Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Click on Continue button");
	}

	public void saveSucessMessageAfterSaveInitialUserdata() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		if (SuccessMessage.isDisplayed()) {
			String successsMessage = SuccessMessage.getText();
			Thread.sleep(2000);
			Assert.assertEquals(successsMessage, "The user has been successfully assigned to the Jurisdiction.");
			ObjectRepo.test.log(Status.PASS, "Success Message is displayed as - " + successsMessage);
			System.out.println("Success Message is displayed as - " + successsMessage);
		} else {
			System.out.println("Assert Failed");
		}
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon1));
		CommonLibref.click(crossIcon1, "seleniumClick", "crossIcon");
	}

	public void CreateUserIdForJSA1User() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA1UserId = generateUserIdForJSA1();
		System.out.println("Jsa1Uesrid :" + JSA1UserId);
		createUserId.sendKeys(JSA1UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciAdminPassword"));
		confirmPassphrase.sendKeys(prop.getProperty("WciAdminPassword"));
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
		ExpectedConditions.elementToBeClickable(secQuestion1);
		CommonLibref.click(secQuestion1, "seleniumClick", "secQuestion1");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue1);
			selSecQue1.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			WebElement que1 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que1, "seleniumClick", "que1");
		}
		CommonLibref.click(answer1, "seleniumClick", "answer1");
		answer1.sendKeys(prop.getProperty("Answer1"));
		answer1.sendKeys(Keys.TAB);
		CommonLibref.click(secQuestion2, "seleniumClick", "secQuestion2");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue2);
			selSecQue2.click();
		} catch (Exception ex) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
		}
		CommonLibref.click(answer2, "seleniumClick", "answer2");
		answer2.sendKeys(prop.getProperty("Answer2"));
		answer2.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
		js2.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(1000);
		CommonLibref.click(secQuestion3, "seleniumClick", "secQuestion3");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue3);
			selSecQue3.click();
		} catch (Exception exx) {
			WebElement que3 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que3, "seleniumClick", "que3");
		}
		Thread.sleep(1000);
		CommonLibref.click(answer3, "seleniumClick", "answer3");
		answer3.click();
		answer3.sendKeys(prop.getProperty("Answer3"));
		WebElement element1 = termsOfUseCheckBox;
		JavascriptExecutor js3 = (JavascriptExecutor) driver.get();
		js3.executeScript("arguments[0].click()", element1);
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", creUserProfRegBut);
		} catch (Exception e) {
			CommonLibref.click(creUserProfRegBut, "seleniumClick", "creUserProfRegBut");
		}
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
		WebElement userReferenceCodeText = userReferenceCode;
		if (userReferenceCodeText.isDisplayed()) {
			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
		}
		JavascriptExecutor js4 = (JavascriptExecutor) driver.get();
		js4.executeScript("window.scrollBy(0,1000)");
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
		ExpectedConditions.elementToBeClickable(finishButton);
		try {
			CommonLibref.click(finishButton, "moveToElementClick", "finishButton");
		} catch (Exception e) {
			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
		}
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void CreateUserIdForSeesdedJSA2User() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA2UserId = generateUserIdForJSA2User();
		System.out.println("Jsa1Uesrid :" + JSA2UserId);
		createUserId.sendKeys(JSA2UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciAdminPassword"));
		confirmPassphrase.sendKeys(prop.getProperty("WciAdminPassword"));
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
		ExpectedConditions.elementToBeClickable(secQuestion1);
		CommonLibref.click(secQuestion1, "seleniumClick", "secQuestion1");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue1);
			selSecQue1.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			WebElement que1 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que1, "seleniumClick", "que1");
		}
		CommonLibref.click(answer1, "seleniumClick", "answer1");
		answer1.sendKeys(prop.getProperty("Answer1"));
		answer1.sendKeys(Keys.TAB);
		CommonLibref.click(secQuestion2, "seleniumClick", "secQuestion2");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue2);
			selSecQue2.click();
		} catch (Exception ex) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
		}
		CommonLibref.click(answer2, "seleniumClick", "answer2");
		answer2.sendKeys(prop.getProperty("Answer2"));
		answer2.sendKeys(Keys.TAB);
		JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
		js2.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(1000);
		CommonLibref.click(secQuestion3, "seleniumClick", "secQuestion3");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue3);
			selSecQue3.click();
		} catch (Exception exx) {
			WebElement que3 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que3, "seleniumClick", "que3");
		}
		CommonLibref.click(answer3, "seleniumClick", "answer3");
		answer3.click();
		answer3.sendKeys(prop.getProperty("Answer3"));
		WebElement element1 = termsOfUseCheckBox;
		JavascriptExecutor js3 = (JavascriptExecutor) driver.get();
		js3.executeScript("arguments[0].click()", element1);
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", creUserProfRegBut);
		} catch (Exception e) {
			CommonLibref.click(creUserProfRegBut, "seleniumClick", "creUserProfRegBut");
		}
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
		WebElement userReferenceCodeText = userReferenceCode;
		if (userReferenceCodeText.isDisplayed()) {
			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
		}
		JavascriptExecutor js4 = (JavascriptExecutor) driver.get();
		js4.executeScript("window.scrollBy(0,1000)");
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
		ExpectedConditions.elementToBeClickable(finishButton);
		try {
			CommonLibref.click(finishButton, "moveToElementClick", "finishButton");
		} catch (Exception e) {
			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
		}
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void CreateUserIdForSeesdedAuthorityUser() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		AuthorityUserId = generateUserIdForAuthority();
		System.out.println("Authority Uesrid :" + AuthorityUserId);
		createUserId.sendKeys(AuthorityUserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciAdminPassword"));
		confirmPassphrase.sendKeys(prop.getProperty("WciAdminPassword"));
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1000)");
		ExpectedConditions.elementToBeClickable(secQuestion1);
		CommonLibref.click(secQuestion1, "seleniumClick", "secQuestion1");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue1);
			selSecQue1.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			WebElement que1 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que1, "seleniumClick", "que1");
		}
		CommonLibref.click(answer1, "seleniumClick", "answer1");
		answer1.sendKeys(prop.getProperty("Answer1"));
		answer1.sendKeys(Keys.TAB);
		CommonLibref.click(secQuestion2, "seleniumClick", "secQuestion2");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue2);
			selSecQue2.click();
		} catch (Exception ex) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
		}
		CommonLibref.click(answer2, "seleniumClick", "answer2");
		answer2.sendKeys(prop.getProperty("Answer2"));
		answer2.sendKeys(Keys.TAB);
		JavascriptExecutor js2 = (JavascriptExecutor) driver.get();
		js2.executeScript("window.scrollBy(0,1200)");
		CommonLibref.click(secQuestion3, "seleniumClick", "secQuestion3");
		try {
			ExpectedConditions.elementToBeClickable(selSecQue3);
			selSecQue3.click();
		} catch (Exception exx) {
			WebElement que3 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que3, "seleniumClick", "que3");
		}
		CommonLibref.click(answer3, "seleniumClick", "answer3");
		answer3.click();
		answer3.sendKeys(prop.getProperty("Answer3"));
		WebElement element1 = termsOfUseCheckBox;
		JavascriptExecutor js3 = (JavascriptExecutor) driver.get();
		js3.executeScript("arguments[0].click()", element1);
		try {
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("arguments[0].click()", creUserProfRegBut);
		} catch (Exception e) {
			CommonLibref.click(creUserProfRegBut, "seleniumClick", "creUserProfRegBut");
		}
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
		ExpectedConditions.visibilityOf(successMessageForResetPassphrase);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
		WebElement userReferenceCodeText = userReferenceCode;
		if (userReferenceCodeText.isDisplayed()) {
			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
		}
		JavascriptExecutor js4 = (JavascriptExecutor) driver.get();
		js4.executeScript("window.scrollBy(0,1000)");
		System.out.println("Step: Click on Finish button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
		ExpectedConditions.elementToBeClickable(finishButton);
		try {
			CommonLibref.click(finishButton, "moveToElementClick", "finishButton");
		} catch (Exception e) {
			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
		}
		System.out.println("New User Created Successfully.");
		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
	}

	public void enterValidDataInJurisdictionName() {
		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionName));
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		String randomJurisdictionName = RandomStringUtils.randomNumeric(5);
		String Name = "New Jurisdiction" + randomJurisdictionName;
		enterJurisdictionName.sendKeys(Name);
		onboardJurisdiction = enterJurisdictionName.getAttribute("Value");
		System.out.println("jurisdiction Name is display - " + onboardJurisdiction);
		ObjectRepo.test.log(Status.PASS, "jurisdiction Name is display - " + onboardJurisdiction);
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

	public void VerifyTheSuccessMessageAfterCreateJurisdiction() {
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String message = SuccessMessage.getText();
		System.out.println("Success message displayed as - " + message);
		ObjectRepo.test.log(Status.PASS, "Success message displayed as - " + message);
		Assert.assertEquals(message,
				"The Jurisdiction creation has been initiated successfully and may take up to 30 minutes to complete. You will not have access to the Jurisdiction until completion. You will be notified via email when the creation is complete.");
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon1));
		CommonLibref.click(crossIcon1, "seleniumClick", "crossIcon");
	}

	public void EnterInvalidLanguage() {
		CommonLibref.click(ClickOnLanguage, "seleniumClick", "ClickOnLanguage");
		ClickOnLanguage.sendKeys(Keys.BACK_SPACE);
	}

	public void VerifyTheSubmitButtonEnableOrNot() {
		if (SaveDisabled.isEnabled()) {
			Assert.assertEquals(SaveDisabled.isEnabled(), true);
			System.out.println("Submit button is enable");
			ObjectRepo.test.log(Status.PASS, "Submit button is enable");
		} else {
			Assert.assertEquals(SaveDisabled.isEnabled(), false);
			System.out.println("Submit button is disable");
			ObjectRepo.test.log(Status.PASS, "Submit button is disable");
		}
	}

	public void JSALoginWithValidCredentialMethod() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(3));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}
	public void LoginWithValidUser(String FilePath, String SheetName,int rowNum,int cellNum) {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void LoginWithValidRegistrarCredentialMethod() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(1));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void loginWithAuthorityValidCredentialMethod() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(7));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void LoginWithValidJuriAdmin() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(24));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}
	public void LoginWithValidAR() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(20));
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
		System.out.println("UserName entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
		System.out.println("User ID or passphrase entered is valid.");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}
	public void CommentBoxOnJSAPage() {
		wait.until(ExpectedConditions.visibilityOf(commentHeading));
		System.out.println("Astrik sign should get displayed for comment box");
		ObjectRepo.test.log(Status.PASS, "Astrik sign should get displayed for comment box");
		wait.until(ExpectedConditions.elementToBeClickable(commentSectionOnJSAPage));
		commentSectionOnJSAPage.click();
		commentSectionOnJSAPage.sendKeys(Keys.CONTROL, "a");
		commentSectionOnJSAPage.sendKeys(Keys.BACK_SPACE);
		commentSectionOnJSAPage.sendKeys("Test");
		String comment = enteredFieldIncommentOnJSAPage.getText();
		System.out.println("entered comments is -" + comment);
		System.out.println("Comment should get accepted and Submit button should get enbled");
		ObjectRepo.test.log(Status.PASS, "Comment should get accepted and Submit button should get enbled");
	}

	public void Deselect_Jurisdiction() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", headingOfChangeStatus);
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(statusInJurisdictionStatusFiled));
		String option2 = statusInJurisdictionStatusFiled.getAttribute("value");
		System.out.println("Option2 is displayed as- " + option2);
		ObjectRepo.test.log(Status.PASS, "Option2 is displayed as- " + option2);
	}

	public void ClickOnManageJurisdictionDetailsOption() throws InterruptedException {
		ObjectRepo.test.log(Status.PASS, "Click on MANAGE JURISDICTION DETAILS Page");
		System.out.println("Click on MANAGE JURISDICTION DETAILS Page");
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionDetailsOption));
		CommonLibref.click(manageJurisdictionDetailsOption, "seleniumClick", "homepageSearchOption");
		driver.get().navigate().refresh();
		driver.get().navigate().refresh();
		wait.until(ExpectedConditions.visibilityOf(headingOfManageJurisdictionDetails));
		String detailsPage = headingOfManageJurisdictionDetails.getText();
		Assert.assertEquals(detailsPage, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, detailsPage);
		System.out.println(detailsPage);
	}

	public void VerifyTheStatusAfterRevisionRequested() {
		wait.until(ExpectedConditions.visibilityOf(requestStatusCoulum));
		String checkedStatus = requestStatusCoulum.getText();
		Assert.assertEquals(checkedStatus, "Revisions Requested");
		System.out.println("Request Status is displayed in table - " + checkedStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status is displayed in table - " + checkedStatus);
	}

	public void ScrolltoStatusHistory() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 800)");
	}

	public void loginWithValidCredentialOfWashingtonAuthorityMethod(String FilePath, String SheetName,int rowNum,int cellNum) {
		
			wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
			CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
			textBoxEmail.sendKeys(Keys.CONTROL, "a");
			textBoxEmail.sendKeys(Keys.BACK_SPACE);
			textBoxEmail.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
			System.out.println("UserName entered successfully");
			wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
			CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
			textBoxPassWord.sendKeys(Keys.CONTROL, "a");
			textBoxPassWord.sendKeys(Keys.BACK_SPACE);
			textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
			ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
			System.out.println("User ID or passphrase entered is valid.");
			CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
			System.out.println("Click on Login button");
		}

	public void loginWithValidCredentialOfWashingtonRegistrarMethod() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("WashingtonRegistrarUserName"), "userIDField");
		ObjectRepo.test.log(Status.PASS,
				"UserName entered successfully :" + prop.getProperty("WashingtonRegistrarUserName"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("WashingtonRegistrarPassword"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("WashingtonRegistrarPassword"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void loginWithValidCredentialOfNovaScotiaAuthorityMethod() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("NoviaScotiaAuthorityUserName"), "userIDField");
		ObjectRepo.test.log(Status.PASS,
				"UserName entered successfully :" + prop.getProperty("NoviaScotiaAuthorityUserName"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("NoviaScotiaAuthorityPassword"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("NoviaScotiaAuthorityPassword"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void ClickonManageAllTransfers() {
		wait.until(ExpectedConditions.elementToBeClickable(ManageAllTransfers));
		ManageAllTransfers.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage All Transfers option");
		System.out.println("Select Manage All Transfers option");
	}

	public void selectManageJurisdictionTransferOptionFromQuickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionTransferOption));
		manageJurisdictionTransferOption.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
		System.out.println("Select Manage Jurisdiction Status");
	}

	public void SelectCheckBoxStopAllFutureTransfer() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		StopAllFutureTransfer.click();
		boolean isChecked = StopAllFutureTransfer.isSelected();
		if (isChecked) {
			System.out.println("Stop All Future Transfer CheckBox is checked");
		} else {
			System.out.println("Stop All Future Transfer CheckBox is un-checked");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(UnCheckedStopAllFutureTransfer).click(UnCheckedStopAllFutureTransfer).build()
					.perform();
		}
	}

	public void CurrentDate() {
		DateIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDateTime));
		CurrentDateTime.click();
	}

	public void SelectCheckBoxStopAllInProgressTransfer() {
		StopAllInProgressTransfer.click();
		boolean isChecked = StopAllInProgressTransfer.isSelected();
		if (isChecked) {
			System.out.println("Stop All Transfers In Progress CheckBox is checked");
		} else {
			System.out.println("Stop All Transfers In Progress CheckBox is un-checked");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(UnCheckedStopAllInProgressTransfer).click(UnCheckedStopAllInProgressTransfer).build()
					.perform();
		}
	}

	public void SelectCheckBoxForAllowTransfersFromProposedStatus() throws InterruptedException {
		ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1);
		boolean isChecked = allowTransfersProposedStatusUncheckedCheckBox1.isSelected();
		if (isChecked) {
			System.out.println("Proposed Checkbox is checked.");
		} else {
			System.out.println("Proposed Checkbox is not checked.");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(allowTransfersProposedStatusUncheckedCheckBox1)
					.click(allowTransfersProposedStatusUncheckedCheckBox1).build().perform();
		}
	}

	public void SelectCheckBoxForAllowTransfersFromApprovedStatus() throws InterruptedException {
		ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1);
		boolean isChecked = allowTransfersFromApprovedStatusCheckBox1.isSelected();
		if (isChecked) {
			System.out.println("Approved Checkbox is checked.");
		} else {
			System.out.println("Approved Checkbox is not checked.");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(allowTransfersFromApprovedStatusCheckBox1)
					.click(allowTransfersFromApprovedStatusCheckBox1).build().perform();
		}
	}

	public void ClickOnContinueButton2Index() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton2Index);
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton2Index));
		Actions action = new Actions(driver.get());
		action.moveToElement(SubmitButton2Index).click(SubmitButton2Index).build().perform();
		System.out.println("Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Click on Continue button");
	}

	public void continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage() {
		System.out.println("Click on Continue Button");
		ObjectRepo.test.log(Status.PASS, "Click on Continue Button");
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
	}

	public void SearchSelectedJurisdiction() {
		String Jurisdiction = StoredJurisdiction.getText();
		System.out.println(Jurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(SearchJurisdiction));
		CommonLibref.click(SearchJurisdiction, "seleniumClick", "SearchJurisdiction");
		SearchJurisdiction.sendKeys(Jurisdiction);
	}

	public void clickOnQuickActionsThreeDot() {
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
		ObjectRepo.test.log(Status.PASS, "Step :Click On Quick Actions option ");
		System.out.println("Step :Click OnQuick Actions option ");
		wait.until(ExpectedConditions.elementToBeClickable(ManageTransfer));
		ManageTransfer.click();
	}

	public void CrossJurisdictionStopAllFutureTransfer() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,1000)", SubmitButton);
		CrossJurisdictionStopFutureTransfer.click();
		boolean isChecked = CrossJurisdictionStopFutureTransfer.isSelected();
		if (isChecked) {
			System.out.println("Stop All Future Transfer CheckBox is checked");
		} else {
			System.out.println("Stop All Future Transfer CheckBox is un-checked");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(UnCheckedCrossJurisdictionStopFutureTransfer)
					.click(UnCheckedCrossJurisdictionStopFutureTransfer).build().perform();
		}
	}

	public void CrossJurisdictionStopAllInProgressTransfer() {
		CrossJurisdictionInProgressTransfer.click();
		boolean isChecked = CrossJurisdictionInProgressTransfer.isSelected();
		if (isChecked) {
			System.out.println("Stop All Transfers In Progress CheckBox is checked");
		} else {
			System.out.println("Stop All Transfers In Progress CheckBox is un-checked");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(CrossJurisdictionAllFutureTransfer).click(CrossJurisdictionAllFutureTransfer).build()
					.perform();
		}
	}

	public void CrossJurisdictionWithAllStopAllFutureTransfer() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		CrossJurisdictionStopFutureTransfer.click();
		boolean isChecked = CrossJurisdictionStopFutureTransfer.isSelected();
		if (isChecked) {
			System.out.println("Stop All Future Transfer CheckBox is checked");
		} else {
			System.out.println("Stop All Future Transfer CheckBox is un-checked");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(UnCheckedCrossJurisdictionStopFutureTransfer)
					.click(UnCheckedCrossJurisdictionStopFutureTransfer).build().perform();
		}
	}

	public void UnCheckBoxForAllowTransfersFromProposedStatus() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,1000)", SubmitButton);
		ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1);
		try {
			allowTransfersProposedStatusUncheckedCheckBox1.click();
		} catch (Exception e) {
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(allowTransfersProposedStatusUncheckedCheckBox1)
					.click(allowTransfersProposedStatusUncheckedCheckBox1).build().perform();
			e.printStackTrace();
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

	public void AddEmailForAuthorityInConfigurationSettings() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(authorityQuickAcion));
		CommonLibref.click(authorityQuickAcion, "seleniumClick", "jurisdicitonUserEmails");
		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();
		enterEmailXpath.click();
		enterEmailXpath.sendKeys(Module5_1_Pom.AuthorityEmail);
	}

	public void AddEmailForRegistrarInConfigurationSettings() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(registrarQuickAcion));
		CommonLibref.click(registrarQuickAcion, "seleniumClick", "jurisdicitonUserEmails");
		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();
		enterEmailXpath.click();
		enterEmailXpath.sendKeys(SeededUserJSA2EmailAddress);
	}

	public void AddEmailForJurisdictionSystemAdminInConfigurationSettings() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionSystemAdminQuickAcion));
		CommonLibref.click(JurisdictionSystemAdminQuickAcion, "seleniumClick", "jurisdicitonUserEmails");
		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();
		enterEmailXpath.click();
		enterEmailXpath.sendKeys();
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
		Create_Participating_Jurisdiction_Pom test = new Create_Participating_Jurisdiction_Pom();
		ref3.scrollHomepageUptoLast();
		test.SearchCraetedNewJurisdiction();
		ref1.clickOnQuickActions();
	}

	public void WaitUntilQuickActionsDisplayed01() {
		WebElement firstElement = driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]"));
		for (int i = 0; i < 20; i++) {
			try {
				Module5_1_Pom ref3 = new Module5_1_Pom();
				Module5_2_POM ref1 = new Module5_2_POM();
				Create_Participating_Jurisdiction_Pom test = new Create_Participating_Jurisdiction_Pom();
				driver.get().navigate().refresh();
				ref1.allJurisdictions();
				ref3.scrollHomepageUptoLast();
				test.SearchCraetedNewJurisdiction();
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

	public void PostLink() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", statusChangeHistory);
		wait.until(ExpectedConditions.visibilityOf(JurisdictionInLinkage));
		CommonLibref.click(SearchFieldOfJurisdictionStatus, "seleniumClick", "searchFieldOfJurisdictionStatus");
		SearchFieldOfJurisdictionStatus.sendKeys("Post-Linked");
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		PostLinkedstatus = saveJurisdicionStatusfield.getAttribute("value");
		System.out.println(PostLinkedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status as Post-Linked");
		System.out.println("Jurisdiction Status is selected as Post-Linked");
	}

	public void Unlinked() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", statusChangeHistory);
		CommonLibref.click(SearchFieldOfJurisdictionStatus, "seleniumClick", "searchFieldOfJurisdictionStatus");
		SearchFieldOfJurisdictionStatus.sendKeys("Unlinked");
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		Unlinkedstatus = saveJurisdicionStatusfieldUnlinked.getAttribute("value");
		System.out.println(Unlinkedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status as Un-Linked");
		System.out.println("Jurisdiction Status is selected as Un-Linked");
	}

	public void selectAcknowledgeCheckBox() {
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(acknowledgeCheckbox2).click(acknowledgeCheckbox2).build().perform();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on the Acknowledge checkbox");
			System.out.println("Steps:Click on the Acknowledge checkbox");
		} catch (Exception ex) {
			wait.until(ExpectedConditions.elementToBeClickable(acknowledgeCheckbox01));
			CommonLibref.click(acknowledgeCheckbox01, "seleniumClick", "acknowledgeCheckbox2");
			ObjectRepo.test.log(Status.PASS, "Steps:Click on the Acknowledge checkbox");
			System.out.println("Steps:Click on the Acknowledge checkbox");
		}

	}

	public void ScrollMethodUptoTheSubmitButton() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", TestIdSubmitButton);
	}

	public void ClickOnSubmitButtonOnManagedStatusPage() {
		ObjectRepo.test.log(Status.PASS, "Step:Click on Submit Button ");
		System.out.println("Step:Click on Submit Button ");
		wait.until(ExpectedConditions.elementToBeClickable(TestIdSubmitButton));
		Actions action = new Actions(driver.get());
		action.moveToElement(TestIdSubmitButton).click(TestIdSubmitButton).build().perform();
		ObjectRepo.test.log(Status.PASS, "Passphrase pop-up should get displayed with a passphrase field");
		System.out.println("Passphrase pop-up should get displayed with a passphrase field");
	}

	public void EnterValidPassphrase() {
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid passpharse and click on confirm button");
		System.out.println("Step:Enter valid passpharse and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		passphaseTextField.click();
		passphaseTextField.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Passphrase popup should get accepted");
		System.out.println("Passphrase popup should get accepted");
	}

	public void SelectUnlinkedJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("Test error");
		System.out.println("Enter Jurisdiction Name =" + "Test error");
	}

	public void continueButtonOnWarningPopUpOfManageJurisdictionStatusPage() {
		wait.until(ExpectedConditions.elementToBeClickable(continueBTNOnWarningPopup));
		Actions action = new Actions(driver.get());
		action.moveToElement(continueBTNOnWarningPopup).click(continueBTNOnWarningPopup).build().perform();
		ObjectRepo.test.log(Status.PASS,
				"Step :Again click on cancel button of Manage Jurisdiction Status page and click on continue button on warning popup ");
		System.out.println(
				"Again click on cancel button of Manage Jurisdiction Status page and click on continue button on warning popup");
		String afterContinueBTN = manageJurisdictions.getText();
		Assert.assertEquals(homePage, afterContinueBTN);
		ObjectRepo.test.log(Status.PASS, "Home page should get displayed");
		System.out.println("Home page should get displayed");
	}

	public void ClickOnConfirmButton() {
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmButtonOnWarningPopoup));
		CommonLibref.click(ConfirmButtonOnWarningPopoup, "seleniumClick", "removeButtonOnWarningPopoup");
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		driver.get().navigate().refresh();
	}

	public void ClickOnMoreActions() {
		System.out.println("Click on the 'More action' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'More action' option");
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
	}

	public void ClickOnManageStatusOption() {
		System.out.println("Click on the 'Manage Status' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Manage Status' option");
		wait.until(ExpectedConditions.elementToBeClickable(ManageStatus));
		CommonLibref.click(ManageStatus, "seleniumClick", "ManageStatus");
		String ManageStatusTitle = ManageJurisdictionStatusTitle.getText();
		wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionStatusTitle));
		Assert.assertEquals(ManageStatusTitle, "Manage Jurisdiction Status");
		System.out.println("Manage Jurisdiction Status page is visible");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Status is visible");
	}

	public void Offboard() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,250)", statusChangeHistory);
		CommonLibref.click(SearchFieldOfJurisdictionStatus, "seleniumClick", "searchFieldOfJurisdictionStatus");
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		SearchFieldOfJurisdictionStatus.sendKeys("Offboarded");
		driver.get().findElement(By.xpath("//*[text()='Offboarded']")).click();
		SearchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(statusChangeHistory));
		Offboardedstatus = OffboardJurisdicionStatusfield.getAttribute("value");
		System.out.println(Offboardedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status as Offboarded");
		System.out.println("Jurisdiction Status is selected as Offboarded");
		System.out.println("Click on Date Of Linkage");
		ObjectRepo.test.log(Status.PASS, "Click on Date Of Linkage");
	//	wait.until(ExpectedConditions.visibilityOf(ClickonDateofLinkage));
//	//	CommonLibref.click(ClickonDateofLinkage, "seleniumClick", "ClickonDateofLinkageText");
//		System.out.println("Enter Date&Time");
//		ObjectRepo.test.log(Status.PASS, "Enter Date&Time");
//	//	CommonLibref.click(SelectArrowFutureYear, "seleniumClick", "SelectArrowFutureYear");
//		System.out.println("Select Date");
//		ObjectRepo.test.log(Status.PASS, "Select Year");
//	//	CommonLibref.click(SelectFutureYear, "seleniumClick", "SelectFutureYear");
//		System.out.println("Future Year Selected");
//		ObjectRepo.test.log(Status.PASS, "Future Year Selected");
//		wait.until(ExpectedConditions.elementToBeClickable(Comments));
//		CommonLibref.click(Comments, "seleniumClick", "Comments");
//		Comments.sendKeys("Offboard");
	}

	public void ScrollHomePageUptoTheBottomOfThePage() {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rowPage);
		} catch (NoSuchElementException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", manageCornJobsSection);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,350)", manageCornJobsSection);
		}

	}

	public void selectDateofLinkage() {
		wait.until(ExpectedConditions.elementToBeClickable(GetDate));
		js = (JavascriptExecutor) driver.get();
		try {
			CommonLibref.click(GetDate, "seleniumClick", "ClickonDateofLinkage");
			wait.until(ExpectedConditions.elementToBeClickable(GetDate));
		} catch (NoSuchElementException e) {
			CommonLibref.click(GetDate, "javascriptClick", "ClickonDateofLinkage");
			wait.until(ExpectedConditions.elementToBeClickable(GetDate));
		} catch (Exception e) {
			CommonLibref.click(GetDate, "moveToElementClick", "ClickonDateofLinkage");
			wait.until(ExpectedConditions.elementToBeClickable(GetDate));
		}
		System.out.println("Click on Date of Linkage");
		
        Random random = new Random();
		int year = 2025 + random.nextInt(21); // Random year between 2000 and 2020
		int month = 1 + random.nextInt(12); // Random month between 1 and 12
		int day = 1 + random.nextInt(28); // Random day between 1 and 28
		String randomDate = String.format("%02d/%02d/%04d", year, month, day);
		GetDate.sendKeys(randomDate);
        System.out.println(randomDate);
		//CommonLibref.click(selectDate, "moveToElementClick", "selectDate");
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("Date of Linkage is selected");
		CommonLibref.scroll(acknowledgeCheckbox2, "moveToElementClick", "acknowledgeCheckbox2");
	}

	public void EnterComments() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 200)");
		wait.until(ExpectedConditions.elementToBeClickable(Comments));
		CommonLibref.click(Comments, "seleniumClick", "Comments");
		Comments.sendKeys("Offboard");
	}

	public void Create_Seeded_Inital_Users_In_Onboarding_Status() throws InterruptedException {
		LoginPom ref = new LoginPom();
		Module5_2_POM ref1 = new Module5_2_POM();
		CommonMethods ref2 = new CommonMethods();
		Module5_1_Pom ref3 = new Module5_1_Pom();
		Create_Participating_Jurisdiction_Pom test = new Create_Participating_Jurisdiction_Pom();
		ref.selectJurisdictionandLangaugeForCalifornia();
		ref1.loginWithValidCredentialMethod();
		ref2.handlesecurityQuestion();
		ref1.allJurisdictions();
		ref1.searchJurisdiction();
		ref1.searchJurisdiction();
		ref1.clickOnQuickActions();
		ref1.selectInitialUserOptionFromQuickAction();
		ref3.AsserTitleOnManageInitialUsersPage();
		ref1.clickOnAddInitialUserButton();
		System.out.println("**********************Create Registrar User*********************************");
		test.CreateRegistrarSeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		test.UserRegistrationForSeededUserRegistrar();
		test.AssertSeededUserRegistrarDetails();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.CreateUserIdForRegistrarUser();
		System.out.println("************************Create JSA1 User*******************************");
		ref1.allJurisdictions();
		ref3.scrollHomepageUptoLast();
		ref1.searchJurisdiction();
		// test.SearchCraetedNewJurisdiction();
		ref1.clickOnQuickActions();
		ref1.selectInitialUserOptionFromQuickAction();
		ref1.clickOnAddInitialUserButton();
		test.CreateJSA1SeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		driver.get().close();
		try {
			test.ClickOnCatchAllAccountOnEmail();
		} catch (Exception e) {
			test.UserRegistrationForSeededUserJSA1();
		}
		test.AssertSeededUserJSA1Details();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.CreateUserIdForJSA1User();
		System.out.println("***************************Create JSA2 User******************************");
		ref1.allJurisdictions();
		ref3.scrollHomepageUptoLast();
		ref1.searchJurisdiction();
		ref1.clickOnQuickActions();
		ref1.selectInitialUserOptionFromQuickAction();
		ref1.clickOnAddInitialUserButton();
		test.CreateJSA2SeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		driver.get().close();
		try {
			test.ClickOnCatchAllAccountOnEmail();
		} catch (Exception e) {
			test.UserRegistrationForSeededUserJSA2();
		}
		test.AssertSeededUserJSA2Details();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.CreateUserIdForSeesdedJSA2User();
		System.out.println("********************Create Authority User********************************");
		ref1.allJurisdictions();
		ref3.scrollHomepageUptoLast();
		ref1.searchJurisdiction();
		ref1.clickOnQuickActions();
		ref1.selectInitialUserOptionFromQuickAction();
		ref1.clickOnAddInitialUserButton();
		test.CreateAuthoritySeededUser();
		test.ClickOnContinueButton();
		ref3.saveSucessMessageAfterSaveInitialUserdata();
		driver.get().close();
		try {
			test.ClickOnCatchAllAccountOnEmail();
		} catch (Exception e) {
			test.UserRegistrationForSeededUserAuthority();
		}
		test.AssertSeededUserAuthorityDetails();
		test.AddvalidaOnPersonalInformation();
		test.AddvalidaPrimaryResidence();
		test.AddValidDataOneditAndReview();
		test.CreateUserIdForSeesdedAuthorityUser();
	}

	public void Create_Jurisdiction_Account_In_Onboarding_Status() throws InterruptedException {
		Module5_1_Pom ref3 = new Module5_1_Pom();
		Module5_2_POM ref1 = new Module5_2_POM();
		Create_Participating_Jurisdiction_Pom test = new Create_Participating_Jurisdiction_Pom();
		ref3.ClickOnHomeOption();
		ref3.expandAllJurisdictionsOnHomePage();
		ref3.scrollHomepageUptoLast();
		test.SearchCraetedNewJurisdiction();
		ref3.clickOnQuickActions();
		ref3.clickOnQuickActionAndSelectJurisdictionAccount();
		ref3.assersionOfManageJurisdictionAccountstitle();
		ref1.addDefaultAccounts();
		ref1.clickOnContinue();
		ref3.addAccountNameOnAddNewAccountPage();
		ref1.enterValidDataAndClickonSave();
		ref1.crossIcononPopUp();
	}

	public void Add_Email_In_Configuration_SettingsJSA() {
		Manage_Jurisdiction_Account_Sanity_Scenarios pom = new Manage_Jurisdiction_Account_Sanity_Scenarios();
		Module5_1_Pom ref1 = new Module5_1_Pom();
		LoginPom ref2 = new LoginPom();
		CommonMethods ref3 = new CommonMethods();
		Create_Participating_Jurisdiction_Pom test = new Create_Participating_Jurisdiction_Pom();
		ref2.selectJurisdictionandLangaugeForCalifornia();
		test.LoginWithJSA1AndAddConfigurationSetting();
		ref3.handlesecurityQuestion();
		ref1.scrollthePageUptoJURISDICTIONMANAGEMENT();
		ref1.ClickOnSettingsOptionOnHomePage();
		ref1.ClickOnJurisdictionUser();
		ref1.ScrollPageUptoTheEntityAccountSettings();
		ref1.AddEmailForAdministrartor();
		pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
		test.AddEmailForAuthorityInConfigurationSettings();
		pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
//		ref1.AddEmailForJurisdictionProgramStaff();
		pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
		test.AddEmailForJurisdictionSystemAdminInConfigurationSettings();
		pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
		test.AddEmailForRegistrarInConfigurationSettings();
		pom.continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage();
		ref1.ClickOnSaveButtonOnConfigurationSettingPage();
		ref1.PrintDataInJurisdictionUsersEmail();
		ref1.AssertSuccessMessageForStatusChange();
	}

	public void CreateRegistrar() {
		wait.until(ExpectedConditions.visibilityOf(userInformation));
		String actualText = userInformation.getText();
		Assert.assertEquals(actualText, "User Information");
		System.out.println("On Set Up Initial Page table name displayed as - " + actualText);
		ObjectRepo.test.log(Status.PASS, "On Set Up Initial Page table name displayed as - " + actualText);
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		String ss = "registrar" + s;
		addFirstName.sendKeys(ss);
		firstNameRegistrar = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameRegistrar);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s1 = RandomStringUtils.randomAlphabetic(6).toLowerCase();
		addlastName.sendKeys(s1);
		lastNameRegistrar = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameRegistrar);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "registrar" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		emailIdFiled.sendKeys(Keys.TAB);
		SeededUserRegistrarEmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Registrar Email Address displayed - " + SeededUserRegistrarEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Registrar Email Address displayed - " + SeededUserRegistrarEmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Registrar");
		registarXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateJSA() {
		wait.until(ExpectedConditions.visibilityOf(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "jsa" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		firstNameJsa1 = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameJsa1);
		ObjectRepo.test.log(Status.PASS, "First name is displayed as - " + firstNameJsa1);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s1 = RandomStringUtils.randomAlphabetic(6);
		String s2 = s1.toLowerCase();
		addlastName.sendKeys(s2);
		lastNameJsa1 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameJsa1);
		ObjectRepo.test.log(Status.PASS, "Last name is displayedas - " + lastNameJsa1);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "jsa" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		SeededUserJSA1EmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("JSA1 Email Address displayed - " + SeededUserJSA1EmailAddress);
		ObjectRepo.test.log(Status.PASS, "JSA1 Email Address displayed - " + SeededUserJSA1EmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Jurisdiction System Admin");
		jSAXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateAuthority() {
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "authority" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		authorityFirstName = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + authorityFirstName);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s6 = RandomStringUtils.randomAlphabetic(6);
		String s7 = s6.toLowerCase();
		addlastName.sendKeys(s7);
		authorityLastName = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + authorityLastName);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String AuthorityEmailId = "authority" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(AuthorityEmailId);
		SeededUserAuthorityEmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Authority Email Address displayed - " + SeededUserAuthorityEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Authority Email Address displayed - " + SeededUserAuthorityEmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Authority");
		authorityXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void CreateJSA2() {
		wait.until(ExpectedConditions.visibilityOf(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		String s = RandomStringUtils.randomAlphabetic(3);
		String ss = "jsa" + s.toLowerCase();
		addFirstName.sendKeys(ss);
		firstNameJsa2 = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + firstNameJsa2);
		ObjectRepo.test.log(Status.PASS, "First name is displayed as - " + firstNameJsa2);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		String s1 = RandomStringUtils.randomAlphabetic(6);
		String s2 = s1.toLowerCase();
		addlastName.sendKeys(s2);
		lastNameJsa2 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + lastNameJsa2);
		ObjectRepo.test.log(Status.PASS, "Last name is displayedas - " + lastNameJsa2);
		CommonLibref.click(addEmailAddress, "seleniumClick", "addEmailAddress");
		System.out.println("*****************************************************************");
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "jsa" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		SeededUserJSA2EmailAddress = storedEmailIdFiled.getAttribute("Value");
		System.out.println("JSA1 Email Address displayed - " + SeededUserJSA2EmailAddress);
		ObjectRepo.test.log(Status.PASS, "JSA1 Email Address displayed - " + SeededUserJSA2EmailAddress);
		System.out.println("*****************************************************************");
		CommonLibref.click(addRole, "seleniumClick", "addRole");
		addRole.sendKeys("Jurisdiction System Admin");
		jSAXpath.click();
		String userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}
//	public void LoginUsingWithRegistrarUser(int cell) {
//		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
//		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
//		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
//		textBoxEmail.sendKeys(Keys.CONTROL, "a");
//		textBoxEmail.sendKeys(Keys.BACK_SPACE);
//		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValueForSheet1("JurisdictionInfromation1",cell));
//		ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
//		System.out.println("UserName entered successfully");
//		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
//		CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
//		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
//		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
//		textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
//		ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
//		System.out.println("User ID or passphrase entered is valid.");
//		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
//		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
//		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
//		System.out.println("Click on Login button");
//	}
	
}
