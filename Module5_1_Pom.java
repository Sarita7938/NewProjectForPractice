package pages;

import java.time.Duration;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.WaitStatementLib;
import Utilities.commonLib;
import Utilities.listeners;

import static constants.ThreadConstants.driver;
import static Utilities.listeners.prop;
import static Utilities.listeners.wait;

public class Module5_1_Pom {

	public static String Text;
	public static String Text1;
	public static String StoredEmailAddress;
	public static String userRole;
	public static String SetUpInitialUserTitle;
	public static String jurisdictionName;
	public static String jurisdictionCode;
	public static String address1;
	public static String address2;
	public static String City;
	public static String zipCodeOnJurisdicitonPage;
	public static String langaugeSelect;
	public static String currencySelect;
	public static String homePage;
	public static String UnLinkedstatus;
	public static String linkedstatus;
	public static String selectJurisdiction;
	public static String homePage1;
	public static String setUpInitialSubmenu;
	public static String manageJurisdictionStatusSubmenu;
	public static String setUpJurisdictionAccountsSubmenu;
	public static String manageTransferSubmenu;
	public static String manageJurisdictionAccountsSubmenu;
	public static String setUpNewJurisdictionTitle;
	public static String manageJurisdictionAccountTitle;
	public static String editJurisdictionAccountsTitle;
	public static String jurisdictionIdCoulmn;
	public static String JurisdictionNameCoulmn;
	public static String JurisdictionCodeCoulmn;
	public static String dateofJoiningCoulmn;
	public static String statusUpdateDateCoulmn;
	public static String updateByCoulmnOnHomePage;
	public static String statusCoulmnOnHomePage;
	public static String quickActionsCoulmnOnHomePage;
	public static String editValueForEnglish;
	public static String editValueForFenchtestfaiza01;
	public static String resendAccountSetUpLink;
	public static String saveSuccessMessage;
	public static String randomEmailId;
	public static String storedActiveUserId;
	public static String EditOptionInQuickActions;
	public static String informationCard;
	public static String contactInformationCard;
	public static String emailIdRequired;
	public static String invalidEmailAddress;
	public static String errormessageMoreThan205Char;
	public static String errormessageForDuplicateEmail;
	public static String storedFirstAndLastName;
	public static String DateOfJoining;
	public static String randomJurisdictionName;
	public static String randomJurisdictionCode;
	public static String PrelinkedJurisdictionStatus;
	public static String AccountName;
	public static String AccountName1;
	public static String AccountName2;
	public static String AccountName3;
	public static String issuanceName;
	public static String addValue4;
	public static String beforeStatus;
	public static String afterStatus;
	public static String AuthorityEmail;
	public static String AuthorityUserId;
	public static String StoredAdminEmail;
	public static String StoredJSAStaffEmail;
	public static String accountName2;

	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static WaitStatementLib lib = new WaitStatementLib();
	public static LoginPom login = new LoginPom();
	public static Manage_Jurisdiction_Account_Sanity_Scenarios pom = new Manage_Jurisdiction_Account_Sanity_Scenarios();
	public static Module5_1_Pom ref1 = new Module5_1_Pom();
	public static JavascriptExecutor js = (JavascriptExecutor) driver.get();
	@FindBy(xpath = "//input[@name='email']")
	private WebElement textBoxEmail;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement textBoxPassWord;
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
	@FindBy(xpath = "//*[text()='Answer Security Question']")
	private WebElement securityQueCard;
	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-t MuiInputBase-colorPrimary Mui-error MuiInputBase-formControl css-os0w5k']")
	private WebElement ansField;
	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continueButton;
	@FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary')])[1]") // *[text()='Welcome,']
	private WebElement clickOnDropdown;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutOption;
	@FindBy(xpath = "//h6[text()='Warning!']")
	private WebElement WorningPopupOnIntialPage;
	@FindBy(xpath = "//*[contains(@data-testid,'priv_btn_Reset')]")
	private WebElement cancelButtonOnWarningPopopup;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Reset']")
	private WebElement cancelButtonOnWarningPopopup01;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;
	@FindBy(xpath = "(//input[@placeholder='Search…'])[2]")
	private WebElement homepageSearchOption2;
	@FindBy(xpath = "(//th[text()='Account Type']//..//..//..//..//..//..//..//..//div[@class='MuiDataGrid-cellContent'])[1]")
	private WebElement searchAccountType;
	@FindBy(xpath = "//*[contains(@class,\"MuiAccordionSummary-expandIconWrapper\")]")
	private WebElement expandAllJurisdictions;
	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;
	@FindBy(xpath = "//*[contains(text(),'SET UP INITIAL USERS')]")
	private WebElement selectInitialUser;
	@FindBy(xpath = "(//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')])[4]")
	private WebElement selectInitialUserContainsXpath;
	@FindBy(xpath = "//*[contains(text(),'MANAGE INITIAL USERS')]")
	private WebElement manageInitialUserTextXpath;
	@FindBy(xpath = "//button[text()='Add Initial User']")
	private WebElement addInitialUserButton;
	@FindBy(xpath = "//h1[text()='Manage Initial Users']")
	private WebElement titleOfInitialPage;
	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;
	@FindBy(xpath = "//*[text()='Rows per page']")
	private WebElement rowsPeraPage;
	@FindBy(xpath = "//*[text()='Select Type Of Instruments']")
	private WebElement typeOfInstrumentTitle;

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
	@FindBy(xpath = "//button[text()='CANCEL']")
	private WebElement cancelBTNOnInitialPage;
	@FindBy(xpath = "//*[contains(@data-testid,'priv_btn_Search')]")
	private WebElement continueBTNOnWarningPopup;
	@FindBy(xpath = "//*[contains(@data-testid,'priv_btn_Search')]")
	private WebElement continueBTNOnWarningPopup2;
	@FindBy(xpath = "//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation submitBtn css-')]")
	private WebElement continueBTNOnWarningPopupClassXpath;
	@FindBy(xpath = "//*[text()='Set Up Initial Users']")
	private WebElement setUpInitialUsers;
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
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	private WebElement onBoardNewJurisdictionButton;
	@FindBy(xpath = "//label[text()='Jurisdiction Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement enterJurisdictionName;
	@FindBy(xpath = "//*[text()='Jurisdiction Code']//..//.. //*[@placeholder='Code...']")
	private WebElement enterJurisdictionCode;
	@FindBy(xpath = "//*[text()='Jurisdiction Code']")
	private WebElement jurisdictionCodeTitle;
	@FindBy(xpath = "//*[text()='Date of joining']//..//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement dateDropdownoption;
	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@aria-current='date']")
	private WebElement selectCurrentDate;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]")
	public WebElement EnteredDate;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")
	public WebElement EnteredTime;
	@FindBy(xpath = "//button[@aria-current='date']")
	private WebElement selectDate;
	@FindBy(xpath = "(//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@tabindex='0']/following-sibling::button[@tabindex='-1'])[1]")
	private WebElement selectNextDate;
	@FindBy(xpath = "(//input[@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2\"])[1]")
	private WebElement dateFilledXpath;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]")
	private WebElement selectDateFiled;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")
	private WebElement selectTime;
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
	@FindBy(xpath = "(//p[text()='Language']//..//..//*[@data-testid='CloseIcon'])[1]")
	private WebElement deleteLanguage;
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@placeholder='--Select--']")
	private WebElement addLanguageOnSetUpJurisdiction;
	@FindBy(xpath = "(//p[text()='Language']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[1]")
	private WebElement saveLanguage;
	@FindBy(xpath = "//*[@id='currencyDetailIds-react-hook-form-select-search']") // p[text()='Currency']//..//..//input[@placeholder='--Select--']
	private WebElement addCurrencyOnSetUpJurisdiction;
	@FindBy(xpath = "(//p[text()='Currency']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[1]")
	private WebElement saveCurrency;
	@FindBy(xpath = "//span[text()='(PL Parameter) Percentage %']//..//input[@type='radio']")
	private WebElement selectPurchaseLimit;
	@FindBy(xpath = "(//*[contains(@class,'MuiTypography-root MuiTypography-h2 css-4cc3qo')])[4]")
	private WebElement xPathPurchaseLimitText;
	@FindBy(xpath = "//*[contains(@data-testid,'add_batch_cancel')]")
	private WebElement cancelButtonOnSetUpNewJurisdiction;
	@FindBy(xpath = "//button[text()='CANCEL']")
	private WebElement cancelButtonOnManagedStatus;
	@FindBy(xpath = "//p[text()='Currency']")
	private WebElement currencyTextOnSetUpNewJurisdiction;
	@FindBy(xpath = "//p[text()='Language']")
	private WebElement LanguageTextOnSetUpNewJurisdiction;
	@FindBy(xpath = "//label[text()='Jurisdiction Name']//..//..//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement jurisdictionNameValue;
	@FindBy(xpath = "//label[text()='Jurisdiction Code']//..//..//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement jurisdictionCodeValue;
	@FindBy(xpath = "//span[text()='French']")
	private WebElement storedLanguage;
	@FindBy(xpath = "//span[text()='USD']")
	private WebElement storedCurreny;
	@FindBy(xpath = "//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation su')]")
	private WebElement continueButtonOnWorningPopupOfSetUpNewJurisdiction;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-wdxfmq')]")
	private WebElement manageJurisdictions;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[5]")
	private WebElement manageJurisdictionStatusOption;
	@FindBy(xpath = "//*[text()='MANAGE JURISDICTION STATUS']")
	private WebElement manageJurisdictionStatusTextXpath;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	private WebElement manageJurisdictionDetailsOption;
	@FindBy(xpath = "//*[text()='CANCEL PROPOSED STATUS']")
	private WebElement cancelProposedStatusOptionOnDetailsPage;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[2]")
	private WebElement manageBudgetOption;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	private WebElement managePurchaseLimitOption;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'][6]")
	private WebElement setUpJurisdictionAccountOption;
	@FindBy(xpath = "//*[text()='SET UP JURISDICTION ACCOUNTS']")
	private WebElement setUpJurisdictionAccountTextXpath;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[7]")
	private WebElement manageTransferOption;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement manageTransferOption1;
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	private WebElement AssertCancelonStatusPage;
	@FindBy(xpath = "//*[text()='MANAGE JURISDICTION ACCOUNTS']")
	private WebElement selectManageJurisdictionsAccounts;
	@FindBy(xpath = "//h1[text()='Manage Jurisdiction Status']")
	private WebElement headingOfManageJurisdictionStatusPage;
	@FindBy(xpath = "(//*[text()='User Account Status']//..//..//..//..//..//..//..//*[@title=\"Active\"])[4]")
	private WebElement accountStatus;

	@FindBy(xpath = "//h2[text()='Change Status']")
	private WebElement headingOfChangeStatus;
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
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdictionStatus;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement storedPrelinkedStatus;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Pre-Linked']")
	private WebElement saveJurisdicionStatusfield;
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdiction;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Unlinked']")
	private WebElement saveUnlinkedStatus;
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement storedJurisdictionName;
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement saveJurisdicion;
	@FindBy(xpath = "//*[@name=\"acknowledgement\"]")
	private WebElement acknowledgeCheckbox2;
	@FindBy(xpath = "//*[@name=\"acknowledgement\"]")
	private WebElement acknowledgeCheckbox01;
	@FindBy(xpath = "//h2[text()='Jurisdiction Request and Status Change History']")
	private WebElement statusChangeHistory;
	@FindBy(xpath = "(//h2[@class='MuiTypography-root MuiTypography-h2 css-yj408y'])[1]")
	private WebElement jurisdictionAccountsHeading;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Linked']")
	private WebElement saveLinkedStatus;
	@FindBy(xpath = "//p[text()='Acknowledge that all jurisdictions are ok to proceed with the status change']//..//input[@type='checkbox']")
	private WebElement acknowledgeCheckbox;
	@FindBy(xpath = "//p[text()='All Jurisdictions']")
	private WebElement allJurisdiction;
	@FindBy(xpath = "//div[@aria-label='Without label']//..//*[@data-testid='ArrowDropDownIcon']")
	private WebElement sizeArraowOnHomePage;
	@FindBy(xpath = "//h1[text()='Set Up New Jurisdiction']")
	private WebElement setUpNewJurisdictionTitleXpath;
	@FindBy(xpath = "//h1[text()='Manage Jurisdiction Accounts']")
	private WebElement manageJurisdictionAccountsTitleXpath;
	@FindBy(xpath = "//p[text()='EDIT JURISDICTION ACCOUNT']")
	private WebElement editJurisdictionAccountSubmenuXpath;
	@FindBy(xpath = "//*[text()='Edit Jurisdiction Accounts']")
	private WebElement editJurisdictionAccountsTitleXpath;
	@FindBy(xpath = "//*[@name=\"accountNameLangEnglish\"]")
	private WebElement editAccountNameforEnglishLangOnManageAccount;
	@FindBy(xpath = "(//*[text()='Fenchtestfaiza01']//..//..//input[@type='text'])[2]")
	private WebElement editAccountNameforFenchtestfaiza01Lang;
	@FindBy(xpath = "//*[text()='French']//..//..//input[@name='accountNameLangFrench']")
	private WebElement editAccountNameforFrenchLang;
	@FindBy(xpath = "(//*[text()='French']//..//..//input[@type='text'])[2]")
	private WebElement editAccountNameforFrenchLang02;
	@FindBy(xpath = "(//*[@data-field='english'])[1]")
	private WebElement englishText;
	@FindBy(xpath = "(//*[text()='Jurisdiction ID'])[2]")
	private WebElement jurisdictionIdXpath;
	@FindBy(xpath = "//div[text()='Jurisdiction Name']")
	private WebElement jurisdictionNameXpath;
	@FindBy(xpath = "//div[text()='Jurisdiction Code']")
	private WebElement jurisdictionCodeXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[4]")
	private WebElement dateOfJoiningXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[5]")
	private WebElement statusUpdateDateXpath;
	@FindBy(xpath = "//div[text()='Update By']")
	private WebElement updateByXpath;
	@FindBy(xpath = "//div[text()='Status']")
	private WebElement statusOnHomePageXpath;
	@FindBy(xpath = "//div[text()='Quick Actions']")
	private WebElement quickActionsOnHomePageXpath;
	@FindBy(xpath = "//p[text()='English']//..//..//input[@id=':r29:']")
	private WebElement editAccountnameForEnglishLang;
	@FindBy(xpath = "//p[text()='French']//..//..//input[@id=':r2a:']")
	private WebElement editAccountnameForFenchtestfaiza01Lang;
	@FindBy(xpath = "//h2[text()='Initial Users']//..//..//input[@placeholder='Search…']")
	private WebElement searchFieldOnInitialUsers;
	@FindBy(xpath = "(//input[@placeholder='Search…'])[1]")
	private WebElement searchField;

	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-h2 css-4cc3qo')]//..//..//input[@placeholder='Search…']")
	private WebElement searchFieldOnInitialUsers01;
	@FindBy(xpath = "//div[text()='Not Activated']")
	private WebElement notActivatedUsersStatus;
	@FindBy(xpath = "//p[text()='RESEND ACCOUNT SET UP LINK']")
	private WebElement resendSetUpLinkXpath;
	@FindBy(xpath = "//*[text()='Account Set Up Link has successfully been resent.']")
	private WebElement successMessageAfterResendLink;
	@FindBy(xpath = "//input[@placeholder='Enter your inbox here']")
	private WebElement yopmailSearchFiled;
	@FindBy(xpath = "(//*[@class='lm'])[2]")
	private WebElement selectOldLink;
	@FindBy(xpath = "(//*[@class='lm'])[1]")
	private WebElement removeLink;
	@FindBy(xpath = "//*[text()='This link is no longer valid.']")
	private WebElement linkNoLongarValidText;
	@FindBy(xpath = "//a[contains(text(),'https://qa2.wci-registry.org')]")
	private WebElement wciLinkOnYopmail;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement sucessMessageOfInitialUser;
	@FindBy(xpath = "//*[contains(text(),'Changes made are successfully saved to the system.')]")
	private WebElement editedAccountSuccessMessage;
	@FindBy(xpath = "//*[text()='REMOVE USER']")
	private WebElement removeUserOption;
	@FindBy(xpath = "//button[text()='REMOVE USER']")
	private WebElement removeUserButton;
	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[1]") // h2[text()='Initial
	private WebElement firstQuickActions;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement crossIcon01;
	@FindBy(xpath = "(//*[text()='Language'] //..//..//*[@data-testid='CloseIcon'])[2]")
	private WebElement crossIconOnLanguage;
	@FindBy(xpath = "//*[text()='Registrar']")
	private WebElement registarXpath;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement removeButtonOnWarningPopoup;
	@FindBy(xpath = "//*[text()='The user has successfully been removed.']")
	private WebElement removeSuccessMessage;
	@FindBy(xpath = "//*[text()='EDIT']")
	private WebElement editOption;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")
	private WebElement editRoleTitle;
	@FindBy(xpath = "//p[text()='UNLOCK PERMANENTLY LOCKED USER']")
	private WebElement unblockedPermanentalyLockOption;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	private WebElement deactivateOption;
	@FindBy(xpath = "//p[text()='ACTIVATE']")
	private WebElement activateOption;
	@FindBy(xpath = "(//*[@title='Inactive'])[1]")
	private WebElement inactiveTitle;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement sucessMessageActivateUser;
	@FindBy(xpath = "(//p[normalize-space(text()='Jurisdiction Name is required')])[1]")
	private WebElement nameIsRequiredForJurisdiction;
	@FindBy(xpath = "//*[@id='jurisdictionDisplayName-helper-text']")
	private WebElement errorMessageOnJurisdictionName;
	@FindBy(xpath = "//*[text()='ACTIVATE USER']")
	private WebElement activeUserTile;
	@FindBy(xpath = "//*[@id='shortCode-helper-text']")
	private WebElement errorForJurisdictionCode;
	@FindBy(xpath = "//label[text()='Date of joining']//..//..//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']")
	private WebElement saveDateAndTime;
	@FindBy(xpath = "//h2[text()='Contact Information']")
	private WebElement contactInformationHeading;
	@FindBy(xpath = "//*[@id=\"addressLine1-helper-text\"]")
	private WebElement enterMoreThan255CharInAddressLine;
	@FindBy(xpath = "//*[@id='city-helper-text']")
	private WebElement errorMessageForCity;
	@FindBy(xpath = "//p[text()='Currency']")
	private WebElement currencyName;
	@FindBy(xpath = "(//h2[text()='Language and Currency']//..//p[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[1]")
	private WebElement languageRequiredErrorMessage;
	@FindBy(xpath = "(//*[contains(@class,'MuiTypography-root MuiTypography-h2 css-4cc3qo')])[3]")
	private WebElement languageAndCurrencyHeading;
	@FindBy(xpath = "(//p[text()='Language']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[1]")
	private WebElement seecteEnglishdLanguage;
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@type='text']")
	private WebElement languageFieldXpath;
	@FindBy(xpath = "//p[text()='Currency']//..//..//input[@type='text']")
	private WebElement currencyTextFieldXpath;
	@FindBy(xpath = "(//*[@class='MuiBox-root css-wkov39'])[1]")
	private WebElement allLanguage;
	@FindBy(xpath = "(//p[text()='Language']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[2]")
	private WebElement seecteSpanishLanguage;
	@FindBy(xpath = "(//p[text()='Language']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[4]")
	private WebElement selecteTesterLanguage;
	@FindBy(xpath = "(//p[text()='Language']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[5]")
	private WebElement selecteFrenchTestLanguage;
	@FindBy(xpath = "(//p[text()='Language']//..//..//span[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja'])[3]")
	private WebElement selecteFrenchLanguage;
	@FindBy(xpath = "(//h2[text()='Language and Currency']//..//p[@class='MuiFormHelperText-root Mui-error css-bpd4r6'])[2]")
	private WebElement currencyRequiredErrorMessage;
	@FindBy(xpath = "(//*[contains(@id,\"currencyDetailIds-react-hook-form-select-search-option\")])[1]")
	private WebElement seecteUSDCurrency;
	@FindBy(xpath = "(//*[contains(@id,\"currencyDetailIds-react-hook-form-select-search-option\")])[2]")
	private WebElement seecteAEDCurrency;
	@FindBy(xpath = "(//*[contains(@id,\"currencyDetailIds-react-hook-form-select-search-option\")])[3]")
	private WebElement seecteAFNCurrency;
	@FindBy(xpath = "(//*[contains(@id,\"currencyDetailIds-react-hook-form-select-search-option\")])[4]")
	private WebElement seecteALLCurrency;
	@FindBy(xpath = "(//*[contains(@id,\"currencyDetailIds-react-hook-form-select-search-option\")])[5]")
	private WebElement seecteAOACurrency;
	@FindBy(xpath = "(//*[@class='MuiBox-root css-wkov39'])[2]")
	private WebElement allCurrency;
	@FindBy(xpath = "//label[text()='Country']//.//..//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement valueInCountryField;
	@FindBy(xpath = "//label[text()='State/Province']//..//*[@placeholder='Select State or Province']")
	private WebElement stateAndProvinceField;
	@FindBy(xpath = "//*[@data-testid=\"region\"]")
	private WebElement stateAndProvincetitle;
	@FindBy(xpath = "//label[text()='State/Region']")
	private WebElement stateAndRegionTitle;
	@FindBy(xpath = "//label[text()='State/Region']//..//..//input[@id='region']")
	private WebElement regionFiledValue;
	@FindBy(xpath = "//label[text()='Email Address']")
	private WebElement emailAddress;
	@FindBy(xpath = "//*[text()='Edit Role']")
	private WebElement editRoleHeadline;
	@FindBy(xpath = "//*[text()='User Information']")
	private WebElement userInformation;
	@FindBy(xpath = "//label[text()='First Name']")
	private WebElement firstName;
	@FindBy(xpath = "(//*[text()='User Information']//..//..//..//..//label[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-1nqub2m'])[1]")
	private WebElement firstNameTitle;
	@FindBy(xpath = "(//*[text()='User Information']//..//..//..//..//label[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-1nqub2m'])[2]")
	private WebElement lastNameTitle;
	@FindBy(xpath = "(//*[text()='User Information']//..//..//..//..//label[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-1nqub2m'])[3]")
	private WebElement emailIdeTitle;
	@FindBy(xpath = "//label[text()='Last Name']")
	private WebElement lastName;
	@FindBy(xpath = "//label[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-maesam']")
	private WebElement roleTitle;
	@FindBy(xpath = "//label[text()='Role']")
	private WebElement roleTitle1;
	@FindBy(xpath = "//p[@id='emailAddress-helper-text']")
	private WebElement requiredMailIdErrorMessage;
	@FindBy(xpath = "//*[text()='The E-Mail address entered is already present in the system.']")
	private WebElement duplicateEmailErrorMessage;
	@FindBy(xpath = "//p[@id='firstName-helper-text']")
	private WebElement errorSpaceForFirstName;
	@FindBy(xpath = "(//h2[text()='Initial Users']//..//..//*[@class='MuiDataGrid-cellContent'])[1]")
	private WebElement editedValue;
	@FindBy(xpath = "//p[@id='lastName-helper-text']")
	private WebElement errorSpaceForLastName;
//	@FindBy(xpath = "//span[text()='(PL Parameter) Percentage %']//..//input[@type='radio']")
	@FindBy(xpath = "(//*[contains(@class,'PrivateSwitchBase-input css-1m9pwf3')])[1]")
	private WebElement purchaseParametr;
	@FindBy(xpath = "(//*[contains(@class,'PrivateSwitchBase-input css-1m9pwf3')])[2]")
	private WebElement byValueParameter;

	@FindBy(xpath = "//button[@data-testid='add_batch_save']")
	private WebElement testidSaveButton;
	@FindBy(xpath = "//*[@data-testid='cancelBtn']")
	private WebElement cancelButton;
	@FindBy(xpath = "//*[contains(@data-testid,'cancelBtn')]")
	private WebElement cancelButtonAtEndOfThePage;
	@FindBy(xpath = "//*[contains(@data-testid,'priv_modal_Cancel')]")
	private WebElement cancelButtonOnTheWarningPopup;
	@FindBy(xpath = "(//*[@data-testid='priv_modal_Cancel'])[2]")
	private WebElement cancelButtonOnDtailPage;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement cancelButton2;
	@FindBy(xpath = "//*[@name='(PL Parameter) Percentage %']")
	private WebElement RadioButtonOfPurchaseLimit;
	@FindBy(xpath = "//*[text()='(PL Parameter) Value']//preceding::input[@name='(PL Parameter) Value']")
	private WebElement radioButtonOfByValue;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-body2 css-1eifdk0')]")
	private WebElement SuccessMessage;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[1]")
	private WebElement jurisdictionNameField;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[2]")
	private WebElement jurisdictionCodeField;
	@FindBy(xpath = "(//*[@title='Onboarding'])[2]")
	private WebElement statusField;
	@FindBy(xpath = "//h1")
	private WebElement headingOfThePage;
	@FindBy(xpath = "//*[contains(text(),'Manage Jurisdiction Accounts')]")
	private WebElement headingOfThePage2;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	private WebElement testIdSubmitButton;
	@FindBy(xpath = "(//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-vue0ba'])[5]")
	private WebElement JURISDICTIONMANAGEMENTOnJSAPage;
	@FindBy(xpath = "//a[text()='Jurisidiction Details']")
	private WebElement juirsdictionDetailsOption;
	@FindBy(xpath = "//input[@data-testid='passphrase']")
	private WebElement passphaseTextField;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[1]")
	private WebElement approveRadioButton;
	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[4]")
	private WebElement CheckedapproveRadioButton;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageonStatusPage;
	@FindBy(xpath = "//*[contains(text(),'The request to change the status')]")
	private WebElement successMessageonStatusPage01;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")
	private WebElement approveAndRevisionHeading;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[2]")
	private WebElement RevisionRadioButton;
	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement headingOnJSAPage;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='setRolesAndPrivileges']")
	private WebElement setRolesAndPrivilegesCheckBoxOnJSAPage;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='setConfigurationSettings']")
	private WebElement setConfigurationSettingsCheckBoxOnJSAPage;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='setContent']")
	private WebElement setContentCheckBoxOnJSAPage;
	@FindBy(xpath = "//textarea[@placeholder='Comments...']")
	private WebElement commentSectionOnJSAPage;
	@FindBy(xpath = "(//textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	private WebElement enteredFieldIncommentOnJSAPage;
	@FindBy(xpath = "//h2[text()='Jurisdiction Request and Status Change History']")
	private WebElement jurisdictionRequestTableOnJSAPage;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	private WebElement confirmUpdateStatusOnJSAPage;
	@FindBy(xpath = "//label[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-ad02gb']")
	private WebElement passphraseName;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement invalidPassphraseError;
	@FindBy(xpath = "//label[@class='MuiFormLabel-root MuiFormLabel-colorPrimary css-548vhk']")
	private WebElement decisionHeading;
	@FindBy(xpath = "//p[@id='comment-helper-text']")
	private WebElement errorMessageForComment;
	@FindBy(xpath = "//label[@class='MuiFormLabel-root MuiFormLabel-colorPrimary css-548vhk']//..//..//..//label[@for='customize-textfield']") // //
	private WebElement commentHeading;
	@FindBy(xpath = "//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium')]")
	private WebElement cancelButtonClassXpath;
	@FindBy(xpath = "(//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium')])[2]")
	private WebElement cancelButtonClassXpath02;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']//..//..//button[text()='Cancel']")
	private WebElement cancelButtonOnConfirmUpdateStatusProposal;
	@FindBy(xpath = "//button[@data-testid='priv_modal_Cancel']")
	private WebElement cancelButtonOnManagedJurisdictionDetailsPage;
	@FindBy(xpath = "//button[@data-testid='priv_modal_Continue']")
	private WebElement continueButtonOnManagedJurisdictionDetailsPage;
	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement RadioButton;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-13tw421']")
	private WebElement homepageOption;
	@FindBy(xpath = "//button[@data-testid='more-actions']")
	private WebElement moreOptionManagedDetailsPage;
	@FindBy(xpath = "//p[text()='EDIT']")
	private WebElement editOptionManagedDetailsPage;
	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement editJurisdictionDetailsPage;
	@FindBy(xpath = "//h2[text()='Jurisdiction Information']")
	private WebElement jurisdictionInformationonDetailsPage;
	@FindBy(xpath = "//h2[text()='Jurisdiction Accounts']")
	private WebElement jurisdictionAccountsOnDetailsPage;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement continueButtonOnDetailsPage;
	@FindBy(xpath = "//p[text()='Language']//..//..//*[@class='MuiBox-root css-wkov39']")
	private WebElement classOfLanguageFiled;
	@FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	private WebElement ConfirmationPopupOfSaveButtonONDetailsPage;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1ns9kwv']")
	private WebElement ConfirmationMessageONDetailsPage;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement changeStatusMessageONDetailsPage;
	@FindBy(xpath = "//*[text()='English - System default language']")
	private WebElement englishDeafultLanguage;
	@FindBy(xpath = "//label[text()='Zip Code']//..//..//p[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0']")
	private WebElement zipcodevalueAfterSave;
	@FindBy(xpath = "(//label[@for='customize-textfield'])[7]")
	private WebElement regionFiled;
	@FindBy(xpath = "//*[@id='region-helper-text']")
	private WebElement errorMessageOnRegionField;
	@FindBy(xpath = "// textarea[@data-testid='comment']")
	public WebElement JSAComment;
	@FindBy(xpath = "//*[@id='jurisdictionStatus-react-hook-form-select-search']")
	public WebElement statusInJurisdictionStatusFiled;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-whmdde']//..//*[text()='Unlinked']")
	public WebElement unlinkedStatus;
	@FindBy(xpath = "//*[text()='MANAGE STATUS']")
	public WebElement manageStatusOption;
	@FindBy(xpath = "//p[text()='CANCEL PROPOSED STATUS']")
	public WebElement cancelProposedOption;
	@FindBy(xpath = "//label[text()='Jurisdictions']//..//input[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	public WebElement saveJurisdictionData;
	@FindBy(xpath = "//label[text()='Status']//..//..//*[@class='MuiTypography-root MuiTypography-body2 css-1advxwz']")
	public WebElement statusOnDeatlsPage;
	@FindBy(xpath = "(//*[text()='Change Status']//..//*[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	public WebElement jurisdictionStatusOnManageDetailsPage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")
	public WebElement revisionRequestOnDetailsPage;
	@FindBy(xpath = "(//*[text()='Request Status']//..//..//..//..//..//..//..//*[@class='MuiDataGrid-cellContent'])[1]")
	public WebElement requestStatusCoulum;
	@FindBy(xpath = "//*[text()='ADD NEW ACCOUNT']")
	public WebElement AddNewAccountButtonOnMoreActions;
	@FindBy(xpath = "//button[text()='Add New Account']")
	public WebElement AddNewAccountOnDetailsPage;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	public WebElement titileOfAddNewAccountPage;
	@FindBy(xpath = "//*[@placeholder='Account Type...']")
	public WebElement AccountTypeFiled;
	@FindBy(xpath = "//*[text()='Account Type']//..//..//input[@id='accountType']")
	public WebElement AccountTypeTextBox01;
	@FindBy(xpath = "(//*[text()='Account Name'])[1]")
	public WebElement accountNametitle;
	@FindBy(xpath = "//*[@id='accountType-helper-text']")
	public WebElement errorMessageOnAccountType;
	@FindBy(xpath = "//button[@data-testid='more-actions']")
	public WebElement moreActionButtonOnManageAccountPage;
	@FindBy(xpath = "//input[@id='accountType']")
	private WebElement AccountTypeField;
	@FindBy(xpath = "//button[@data-testid='submitBtn']")
	private WebElement SubmitButton;
	@FindBy(xpath = "//*[text()='CANCEL']")
	private WebElement CancelButton;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")
	private WebElement errorMessageAfterSubmitbutton;
	@FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-1y8hbj']")
	private WebElement errorMessageForAccountName;
	@FindBy(xpath = "//input[@name='accountNameLangEnglish']")
	private WebElement enlishLangaugeFiled;
	@FindBy(xpath = "//*[text()='SET UP JURISDICTION ACCOUNTS']")
	private WebElement SetUpJurisdictionAccountsText;
	@FindBy(xpath = "//*[text()='Add New Account']")
	private WebElement AddNewAccount;
	@FindBy(xpath = "//*[text()='Batch']")
	private WebElement Batch;
	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement CloseSign;
	@FindBy(xpath = "//*[text()='Language']//..//..//*[@data-testid='CloseIcon']")
	private WebElement CloseSignXpath;
	@FindBy(xpath = "//*[text()='Currency']//..//..//*[@data-testid='CloseIcon']")
	private WebElement CloseSignForCurrencyXpath;
	@FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[3]")
	private WebElement ArrowDropDown;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[7]")
	private WebElement RemoveBatchOption;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	private WebElement confirmStatusUpdateTitle;
	@FindBy(xpath = "//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-ad02gb']")
	private WebElement passphraseXpath;
	@FindBy(xpath = "(//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-animated MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-animated css-maesam'])[2]")
	private WebElement jurisdictionTitle;
	@FindBy(xpath = "//*[@class='MuiFormHelperText-root Mui-error css-bpd4r6']")
	private WebElement statusrequiredForJurisdictionStatus;
	@FindBy(xpath = "//*[@id='passphrase-helper-text']")
	private WebElement passphraseisrequirederrorMessage;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]//child::*[local-name()='svg']")
	private WebElement btnWelcomeProfileDD;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement btnWelcomeProfile;
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	public WebElement cancelProposedStatus;
//	@FindBy(xpath = "//*[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation css-mpc1ie')]")
	@FindBy(xpath = "(//*[contains(text(),'Cancel Proposed Status')])[1]")
	public WebElement cancelProposedStatus01;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	public WebElement CancelSuccessMessageButton;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	public WebElement CommentonCancelProposal;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	public WebElement CancelStatusButton;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement PassphraseErrorMessage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	public WebElement PassphraseErrorMessageHeading;
	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-qbgv2a']")
	public WebElement WCIHomePage;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	public WebElement CancelSuccessMessage;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2'])[1]")
	public WebElement prefilledDataInJurisdictionStatus;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2'])[2]")
	public WebElement prefilledDataInJurisdictionStatus01;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement JuriAccountName;
	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary css-1pdxhxj'])[2]")
	private WebElement Filter;
	@FindBy(xpath = "//div[@filename='Initial Users']//button[text()='Filters']")
	private WebElement filterOptionOnUserPage;

	@FindBy(xpath = "//*[@aria-label='Show filters']")
	private WebElement Filter01;
	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	private WebElement Select1;
	@FindBy(xpath = "//*[contains(@placeholder,\"Search\")]")
	private WebElement SearchName;
	@FindBy(xpath = "//*[@placeholder='Filter value']")
	private WebElement searchFilterValue;
	
	@FindBy(xpath = "(//*[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[2]")
	private WebElement SearchOpratorName;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon css-1ylescl']")
	private WebElement QuickActionsOnSetUpInitialUser;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	private WebElement ActivateButton;
	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement ContinueButton;
	@FindBy(xpath = "(//*[text()='Total Rows'])[1]")
	private WebElement totalRowCount;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	private WebElement editOptionInQuickActions;
	@FindBy(xpath = "//*[text()='EDIT JURISDICTION ACCOUNT']")
	private WebElement editOptionTextXpath;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we'])[2]")
	private WebElement AccountNumberLink;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m'])[1]")
	private WebElement disableEditOptionInQuickActions;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m'])[2]")
	private WebElement disableDeleteOptionInQuickActions;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement deleteOptionInQuickActions;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[2]")
	private WebElement enableDeleteOptionInQuickActions;
	@FindBy(xpath = "//*[text()='DELETE JURISDICTION ACCOUNT']")
	private WebElement DeleteOptionXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[1]")
	private WebElement accountNumberXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[2]")
	private WebElement accountTypeXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[3]")
	private WebElement accountNameXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[4]")
	private WebElement typesOfInstrumentXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[5]")
	private WebElement typesOfTransferXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[6]")
	private WebElement accountStatusXpath;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])[7]")
	private WebElement quickActionsXpath;
	@FindBy(xpath = "//*[text()='ADD DEFAULT ACCOUNT']")
	private WebElement addDefaultAccountXpath;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement editJurisdictionAccountXpath;
	@FindBy(xpath = "//input[@name='accountNameLang0']")
	private WebElement firstAccountName;
	@FindBy(xpath = "(//*[contains(@class,'MuiDataGrid-cellContent')]//..//*[contains(@class,'MuiDataGrid-cellContent')])[7]")
	private WebElement storedAccountName;
	@FindBy(xpath = "//*[text()='Account Name']//..//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement addAccountName;
	@FindBy(xpath = "//*[text()='The selected Jurisdiction Account has successfully been deleted.']")
	private WebElement deleteMessage;
	@FindBy(xpath = "//*[text()='MENU']")
	private WebElement MegaMenu;
	@FindBy(xpath = "//*[text()='Jurisdiction Accounts']")
	private WebElement JuriAccount;
	@FindBy(xpath = "(//h2[@class='MuiTypography-root MuiTypography-h2 css-yj408y'])[4]")
	private WebElement statusChangeTable;
	@FindBy(xpath = "(//*[text()='Status Change']//..//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1'])")
	private WebElement statusChangeTableNames;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we'])[1]")
	private WebElement accountNumber001;
	@FindBy(xpath = "//h2[text()='Status Change']")
	private WebElement statusChangeTextXpath;
	@FindBy(xpath = "(//th[text()='Account Status']//..//..//..//..//..//..//..//*[@class='MuiDataGrid-cellContent'])[2]")
	private WebElement saveStatus;
	@FindBy(xpath = "(//th[text()='Account Status']//..//..//..//..//..//..//..//*[@class='MuiDataGrid-cellContent'])[1]")
	private WebElement afterStatusChangeXpath;
	@FindBy(xpath = "(//*[text()='Jurisdiction Accounts']//..//..//*[@data-testid='MoreHorizIcon'])[1]")
	private WebElement accountTypeQuickAcionsOnDetailsPage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")

	private WebElement addNewAccountOnDetailsPage;
	@FindBy(xpath = "//*[@data-testid='cancelBtn']")
	private WebElement cancelDataIdXpath;
	@FindBy(xpath = "//button[text()='Add User']")
	private WebElement addUserXpathOnDetailsPage;
	@FindBy(xpath = "//*[text()='Initial Users']//..//..//*[@placeholder='Search…']")
	private WebElement searchUserFiledOnDetailsPage;
	@FindBy(xpath = "//*[contains(text(),'HOME')]")
	private WebElement homeXpath;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1r56cjq']")
	private WebElement homeOptionXpath;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement searchFiled;
	@FindBy(xpath = "//*[contains(text(),'RESTRICT JURISDICTION ACCOUNT')]")
	private WebElement restrictCannottransferOption;
	@FindBy(xpath = "(//*[contains(text(),'ACTIVATE JURISDICTION ACCOUNT')])[1]")
	private WebElement activateOptionOnJurisdictionStatusPage;
	@FindBy(xpath = "(//*[contains(text(),'Restricted- Cannot Transfer and Receive')])[1]")
	private WebElement restrictedCannotTransferandReceiveDetailsPage;
	@FindBy(xpath = "//*[contains(text(),'Restricted: Cannot Transfer and Receive')]//*[@data-testid='RadioButtonUncheckedIcon']")
	private WebElement restrictedCannotTransferandReceiveRadioButton;
	@FindBy(xpath = "(//*[contains(text(),'Restricted: Cannot Transfer')]//*[@data-testid='RadioButtonUncheckedIcon'])[1]")
	private WebElement restrictedCannotTransferRadioButton;
	@FindBy(xpath = "//*[contains(text(),'Account Status')]//..//*[contains(text(),'Active')]")
	private WebElement activeAccountStatus;
	@FindBy(xpath = "//*[contains(@class,'MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1n6q0hc')]")
	private WebElement restrictionOption;
	@FindBy(xpath = "(//*[contains(text(),'Restricted- Cannot Receive')])[1]")
	private WebElement restrictedCannotReceiveStatusOnDetailsPage;
	@FindBy(xpath = "//*[contains(text(),'Restricted: Cannot Receive')]//*[@data-testid='RadioButtonUncheckedIcon']")
	private WebElement restrictedCannotReceiveRadioOption;
	@FindBy(xpath = "(//*[contains(text(),'Suspended')])[1]")
	private WebElement suspendedStatusOnDetailsPage;
	@FindBy(xpath = "//*[contains(text(),'SUSPEND JURISDICTION ACCOUNT')]")
	private WebElement suspendedOption;
	@FindBy(xpath = "(//*[contains(text(),'Inactive')])[1]")
	private WebElement inactiveStatusOnDetailsPage;
	@FindBy(xpath = "//*[contains(text(),'INACTIVATE JURISDICTION ACCOUNT')]")
	private WebElement inactiveOption;
	@FindBy(xpath = "//*[@id='comment']")
	private WebElement CommentOnAccountStatus;
	@FindBy(xpath = "//*[@id='comment-helper-text']")
	private WebElement CommentisRequiredErrorEXpath;
	@FindBy(xpath = "//*[contains(text(),'CANCEL')]")
	private WebElement cancelButtonConfirmStatusUpdateXpath;
	@FindBy(xpath = "//*[contains(@id,'restrictionType')]")
	private WebElement selectRestrictionClassFieldXpath;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-ju587a')]")
	private WebElement accountNameOnConfirmStatusUpdatePopUp;
	@FindBy(xpath = "//*[@id='passphrase']")
	private WebElement PassphraseOnAccountStatus;
	@FindBy(xpath = "//*[@id='passphrase-helper-text']")
	private WebElement passphraseisrequiredErrorXpath;
	@FindBy(xpath = "//*[contains(text(),'CONFIRM')]")
	private WebElement confirmButtonOnConfirmStatusUpdate;
	@FindBy(xpath = "//*[text()='Error!']//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement errorCrossIcon;
	@FindBy(xpath = "(//*[contains(@class,'MuiTypography-root MuiTypography-h2 css-yj408y')])[1]")
	private WebElement accountInformationTitle;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Proposed for Un-Linked')])[1]")
	private WebElement ProposedForUnlinked;
	@FindBy(xpath = "(//*[contains(text(),'Jurisdiction Status')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[2]")
	private WebElement jurisdictionStatusInHistoryTable;
	@FindBy(xpath = "(//*[contains(text(),'Updated By')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[4]")
	private WebElement updatedByInHistoryTable;
	@FindBy(xpath = "(//*[contains(text(),'Updated Date (ET)')]//..//..//..//..//..//..//..//*[contains(@class,'MuiDataGrid-cellContent')])[5]")
	private WebElement updateDateInHistoryTable;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement EditDetails;
	@FindBy(xpath = "//*[contains(text(),'RETURN TO HOME PAGE')]")
	private WebElement returnToHomePageOption;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement searchJurisdiction;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ErrorMessageforOneIssuanceAct;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	public WebElement errorMessage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement errorMessageForAccount;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Revision Requested')])[1]")
	public WebElement revisionRequestStatus;
	@FindBy(xpath = "//*[contains(text(),'New Jurisdiction Information')]")
	public WebElement newJurisdictionInformation;
	@FindBy(xpath = "//*[contains(text(),'Set Initial Users')]")
	public WebElement setInitialUsers;
	@FindBy(xpath = "//*[contains(text(),'Set Jurisdiction Account')]")
	public WebElement setJurisdictionAccount;
	@FindBy(xpath = "//*[contains(text(),'Set Jurisdiction Budget')]")
	public WebElement setJurisdictionBudget;
	@FindBy(xpath = "//*[contains(text(),'Set Purchase Limits')]")
	public WebElement setPurchaseLimits;
	@FindBy(xpath = "//h4[text()='JURISDICTION MANAGEMENT']//..//a[text()='Configuration Settings']")
	public WebElement settingOptionOnHomePage;
	@FindBy(xpath = "//h3[@class='MuiTypography-root MuiTypography-h3 css-3i8r22']")
	public WebElement configurationSettingPageTitle;
	@FindBy(xpath = "	//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-101t2as']//..//p[text()='Jurisdiction User Emails']")
	public WebElement jurisdicitonUserEmails;
	@FindBy(xpath = "(//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-101t2as'])[2]")
	public WebElement entityAccountSettings;
	@FindBy(xpath = "//*[@title='ADMINISTRATOR']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement adminstratorQuickAcion;
	@FindBy(xpath = "//*[@title='AUTHORITY']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement authorityQuickAcion;
	@FindBy(xpath = "//*[@title='JURISDICTION_PROGRAM_STAFF']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement JurisdictionStaffQuickAcion;
	@FindBy(xpath = "//*[@title='JURISDICTION_SYSTEM_ADMIN']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement JurisdictionSystemAdminQuickAcion;
	@FindBy(xpath = "//*[@title='REGISTRAR']//..//*[@data-testid='MoreHorizIcon']")
	public WebElement registrarQuickAcion;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']")
	public WebElement addToAGroupXpath;
	@FindBy(xpath = "//input[@placeholder='Enter user email…']")
	public WebElement enterEmailXpath;
	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div")
	public WebElement emailAuthFieldXpath;
	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div")
	public WebElement userIdAuthFieldXpath;
	@FindBy(xpath = "(//h4[text()='Notification Settings']//..//*[text()='SAVE'])[2]")
	private WebElement saveButtonConfigurationSetting;
	@FindBy(xpath = "(//*[text()='JURISDICTION MANAGEMENT']//..//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-1d4ad'])[1]")
	private WebElement jurisdictionDeatilsOption;
	@FindBy(xpath = "//*[text()='MANAGE BUDGET']")
	public WebElement managedBugetTextXpath;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[2]")
	public WebElement managedBugetXpath;
	@FindBy(xpath = "//*[@class=\"MuiDataGrid-columnHeaderTitle css-cc8tf1\"]//following::div[text()=\"Onboarding\"]")
	private WebElement JurisdictionStatus;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e'])[1]")
	private WebElement clickOnFirstIDOnApprovalPage;
	@FindBy(xpath = "//*[@placeholder='Search…']")
	private WebElement searchFieldOnMyApproval;
	@FindBy(xpath = "//a[contains(@href, 'myaccount.google.com/signinoptions/two-step-verification')]")
	WebElement firstElement;
	@FindBy(xpath = "//a[contains(@href, 'accounts.google.com/ServiceLogin?continue=https%')]")
	WebElement secondElement;
	@FindBy(xpath = "//*[contains(@href, 'wci-registry.org/create-user-profile?LinkID=')]")
	List<WebElement> linkContainingHref;
	@FindBy(id = "identifierId")
	private WebElement emailField;
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterEmail;
	@FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
	private WebElement passwordField;
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextButtonAfterPassword;
	@FindBy(xpath = "(//table)[6]//tbody//tr")
	WebElement elementWithId;
	@FindBy(xpath = "//*[text()='View messages']")
	WebElement viewMessages;
	@FindBy(xpath = "  //*[contains(@class,'hP')]")
	public WebElement titleOfResentAccountSetUpLinke;
	@FindBy(xpath = "(//*[@for='customize-select'])[2]")
	public WebElement jurisdictionFieldOnStatusPage;
	@FindBy(xpath = "//*[@id='jurisdictionStatus-react-hook-form-select-search']")
	public WebElement jurisdicitionStatusFieldXpath;
	@FindBy(xpath = "//*[@data-testid=\"ExpandMoreIcon\"]")
	private WebElement expandAllJurisdictionsArrow;
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	public WebElement CancelonJurisdictionStatus;
	@FindBy(xpath = "//*[@class=\"MuiAccordionSummary-expandIconWrapper css-1fx8m19\"]")
	public WebElement expandHomePage;
	
	
	public Module5_1_Pom() {
		PageFactory.initElements(driver.get(), this);
	}

	public void loginWithWCIIncAdminUserCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.typeText(userIDField, prop.getProperty("WciIncAdminUserID"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("WciIncAdminUserID"));
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

	public void loginWithIndividualUserCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.typeText(userIDField, prop.getProperty("indUserID"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("indUserID"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(PassphraseField, prop.getProperty("WciIncAdminPassphrase"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("indUserPassphrase"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void loginWithValidCredentialsForWCIIncAdmin() {
		login.selectJurisdictionandLangaugeForCalifornia();
		Common.handlesecurityQuestion();
		loginWithWCIIncAdminUserCredentials();
		expandAllJurisdictionsOnHomePage();
	}

	public void LoginWithValidCredentialsForAuthority() {
		clearDataOnTheLoginPage();
		loginForSeededUserAuthorityCredentials();
	}

	public void loginWithValidCredentialsForRegistrar() {
		clearDataOnTheLoginPage();
	}

	public void LoginWithValidCredentialsForRegistrar() {
		clearDataOnTheLoginPage();

		loginForSeededUserRegistrarCredentials();
	}

	public void loginForSeededUserRegistrarCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.typeText(userIDField,
				ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 3), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :"
				+ ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 3));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(PassphraseField, prop.getProperty("RegistrarSeededUserPassphrase"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("RegistrarSeededUserPassphrase"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void loginForSeededUserAuthorityCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.typeText(userIDField, prop.getProperty("AuthoritySeededUserID"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("AuthoritySeededUserID"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(PassphraseField, prop.getProperty("AuthoritySeededUserPassphrase"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("AuthoritySeededUserPassphrase"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");

	}

	public void loginForSeededUserJSACredentials() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("JSASeededUserID"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			CommonLibref.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("JSASeededUserID"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}

	public void loginForSeededUserJSACredentialsForUnlinkedToPrelinkedStatus() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("JSASeededUserID1"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID1"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase1"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			CommonLibref.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("JSASeededUserID1"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID1"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase1"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}

	public void loginForSeededUserJurisdictionAdmin() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("AdminLogin3"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("AdminLogin3"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase1"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			CommonLibref.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("AdminLogin3"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("AdminLogin3"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("JSASeededUserPassphrase1"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase1"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}

	public void logOutUser() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(clickOnDropdown));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnDropdown));
		CommonLibref.click(clickOnDropdown, "seleniumClick", "clickOnDropdown");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Welcome");
		System.out.println("Click on Welcome");
		wait.until(ExpectedConditions.elementToBeClickable(logoutOption));
		CommonLibref.click(logoutOption, "seleniumClick", "logoutOption");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Log Out Option");
		System.out.println("Click on Log Out Option");
	}

	public void expandAllJurisdictionsOnHomePage() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Registration Application Status:']")));
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

	public void selectJurisdictionOtherThanOnbording() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("Busan");
		System.out.println("Enter Jurisdiction Name =" + "AutomationOklahoma");
	}

	public void selectOnboardingJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("LA1");
		System.out.println("Enter Jurisdiction Name =" + "LA1");
	}

	public void selectSetUpInitialUserOptionFromQuickActions() {
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
		wait.until(ExpectedConditions.elementToBeClickable(selectInitialUserContainsXpath));
		selectInitialUserContainsXpath.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Set up Initial Users");
		System.out.println("Click on Set up Initial Users");
	}

	public void addInitialUsers() {
		wait.until(ExpectedConditions.elementToBeClickable(setUpInitialUsers));
		String acualtext1 = setUpInitialUsers.getText();
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

		randomEmailId = RandomStringUtils.randomAlphabetic(8);
		randomEmailId = randomEmailId + "@eqanim-qa.wci-validate.org";
		storedEmailId.sendKeys(randomEmailId);
		StoredEmailAddress = storedEmailId.getAttribute("Value");
		System.out.println("Email Address displayed - " + StoredEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Email Address displayed - " + StoredEmailAddress);
		System.out.println("*****************************************************************");

		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys("Registrar");
		registarXpath.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void AddUserOnManageJurisdictionDetails() {
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

		String randomEmailId = RandomStringUtils.randomAlphabetic(8);
		String emailIdOnDetailsPage = randomEmailId + "@eqanim-qa.wci-validate.org";
		storedEmailId.sendKeys(emailIdOnDetailsPage);
		StoredEmailAddress = storedEmailId.getAttribute("Value");
		System.out.println("Email Address displayed - " + StoredEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Email Address displayed - " + StoredEmailAddress);
		System.out.println("*****************************************************************");

		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys("Registrar");
		try {
			addRole.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			addRole.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			registarXpath.click();
		}
		userRole = storedRole.getAttribute("Value");
		System.out.println("Role is displayed - " + userRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed - " + userRole);
	}

	public void cancelBTNOnInitialPage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelBTNOnInitialPage));
		CommonLibref.click(cancelBTNOnInitialPage, "javascriptClick", "cancelBTNOnInitialPage");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid data and Click on cancel button");
		System.out.println("Click On Cancel Button");
		wait.until(ExpectedConditions.elementToBeClickable(WorningPopupOnIntialPage));
		String acualtext1 = WorningPopupOnIntialPage.getText();
		Assert.assertEquals(acualtext1, "Warning!");
		ObjectRepo.test.log(Status.PASS, "Warning popup is displayed with cancel and continue button");
		System.out.println("Cancel and Continue is displayed");
	}

	public void ClickOnCancelButtonOnWarningPopup1() {
		CommonLibref.click(cancelButtonOnWarningPopopup, "seleniumClick", "cancelButtonOnWarningPopopup");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
		System.out.println("Click on Cancel button of Warning popup");
	}

	public void verifyTheDataAfterClickOnCancelButton() {
//		CommonLibref.click(cancelButtonOnWarningPopopup, "seleniumClick", "cancelButtonOnWarningPopopup");
//		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
//		System.out.println("Click on Cancel button of Warning popup");
		ObjectRepo.test.log(Status.PASS,
				"Warning pop up is removed and and entered Data selection should not get cleared ");
		System.out.println("Warning pop up is removed and and entered Data selection should not get cleared ");
		String acualtext1 = setUpInitialUsers.getText();
		Assert.assertEquals(acualtext1, "Set Up Initial Users");
		ObjectRepo.test.log(Status.PASS,
				"Warning pop up is removed and and entered Data selection should not get cleared and page displayed is - "
						+ acualtext1);
		System.out.println(
				"Warning pop up is removed and and entered Data selection should not get cleared and page displayed is - "
						+ acualtext1);

		String element = storedFirstName.getAttribute("Value");
		Assert.assertEquals(Text, element);
		ObjectRepo.test.log(Status.PASS, "After click on Cancel First name is displayed as - " + element);
		System.out.println("After click on Cancel First name is displayed as - " + element);

		String element1 = storedLastName.getAttribute("Value");
		Assert.assertEquals(Text1, element1);
		ObjectRepo.test.log(Status.PASS, "After click on Cancel Last name is displayed as - " + element1);
		System.out.println("After click on Cancel Last name is displayed as - " + element1);

		String element2 = storedEmailId.getAttribute("Value");
		Assert.assertEquals(randomEmailId, element2);
		ObjectRepo.test.log(Status.PASS, "After click on Cancel Last name is displayed as - " + element2);
		System.out.println("After click on Cancel Last name is displayed as - " + element2);

		String element3 = storedRole.getAttribute("Value");
		Assert.assertEquals(userRole, element3);
		ObjectRepo.test.log(Status.PASS, "After click on Cancel Last name is displayed as - " + element3);
		System.out.println("After click on Cancel Last name is displayed as - " + element3);
	}

	public void searchStoredEmailId() {
		try {
			searchFieldOnInitialUsers.click();
			wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers));
			searchFieldOnInitialUsers.sendKeys(StoredEmailAddress);
			ObjectRepo.test.log(Status.PASS, "Search Email Id - " + StoredEmailAddress);
			System.out.println("Search Email Id - " + StoredEmailAddress);
		} catch (Exception ex) {
			searchFieldOnInitialUsers.click();
			wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
			searchFieldOnInitialUsers.sendKeys(StoredEmailAddress);
			ObjectRepo.test.log(Status.PASS, "Search Email Id - " + StoredEmailAddress);
			System.out.println("Search Email Id - " + StoredEmailAddress);
		}

	}

	public void verifyEditedDataDisplayedInManageInitialTable() {
//		searchFieldOnInitialUsers.sendKeys("waren@12345");
		String storedEditValue = editedValue.getText();
		System.out.println(storedEditValue);
		ObjectRepo.test.log(Status.PASS, storedEditValue);
		String editdata = Text + " " + Text1;
		System.out.println("Edit Name is displayed in table like :" + editdata);
		ObjectRepo.test.log(Status.PASS, "Edit Name is displayed in table like :" + editdata);
		Assert.assertEquals(storedEditValue, editdata);
	}

	public void continueBTNOnWarningPopUp() {
//		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(continueBTNOnWarningPopup));
			CommonLibref.click(continueBTNOnWarningPopup, "moveToElementClick", "continueBTNOnWarningPopup");
			ObjectRepo.test.log(Status.PASS,
					"Step : Again click on cancel button of Select Juridistion page and click on continue button on warning popup ");
			System.out.println(
					"Again click on cancel button of Select Juridistion page and click on continue button on warning popup  ");
		} catch (NoSuchElementException e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(continueButtonOnDetailsPage).click(continueButtonOnDetailsPage).build().perform();
			ObjectRepo.test.log(Status.PASS,
					"Step : Again click on cancel button of Select Juridistion page and click on continue button on warning popup ");
			System.out.println(
					"Again click on cancel button of Select Juridistion page and click on continue button on warning popup  ");
		} catch (Exception ex) {
			js.executeScript("arguments[0].click();", continueButtonOnDetailsPage);
			ObjectRepo.test.log(Status.PASS,
					"Step : Again click on cancel button of Select Juridistion page and click on continue button on warning popup ");
			System.out.println(
					"Again click on cancel button of Select Juridistion page and click on continue button on warning popup  ");
		}
	}

	public void enterValidDataAndCreateNewJurisdiction() {
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToElement", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(onBoardNewJurisdictionButton));
		CommonLibref.click(onBoardNewJurisdictionButton, "seleniumClick", "onBoardNewJurisdictionButton");
		ObjectRepo.test.log(Status.PASS, "Step :Click on the onboard new jurisdiction button");
		System.out.println(" Click on the onboard new jurisdiction button");
		enterValidDataInJurisdictionName();
		enterValidDataInJurisdictionCode();
		wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption));
		CommonLibref.click(dateDropdownoption, "seleniumClick", "dateDropdownoption");
		wait.until(ExpectedConditions.elementToBeClickable(selectDate));
		CommonLibref.click(selectDate, "seleniumClick", "selectDate");
		CommonLibref.click(addAddress1, "seleniumClick", "addAddress1");
		addAddress1.sendKeys("Street1");
		address1 = addAddress1.getAttribute("Value");
		System.out.println(address1);
		CommonLibref.click(addAddress2, "seleniumClick", "addAddress2");
		addAddress2.sendKeys("Street2");
		address2 = enterJurisdictionName.getAttribute("Value");
		System.out.println(address2);
		CommonLibref.click(addCity, "seleniumClick", "addCity");
		addCity.sendKeys("Colombia");
		City = enterJurisdictionName.getAttribute("Value");
		System.out.println(City);
		CommonLibref.click(zipCode, "seleniumClick", "zipCode");
		zipCode.sendKeys("1425");
		zipCodeOnJurisdicitonPage = zipCode.getAttribute("Value");
		System.out.println(zipCodeOnJurisdicitonPage);
		CommonLibref.scroll(xPathPurchaseLimitText, "scrollToElement", "xPathPurchaseLimitText");
		CommonLibref.click(addLanguageOnSetUpJurisdiction, "javascriptClick", "addLanguageOnSetUpJurisdiction");
		addLanguageOnSetUpJurisdiction.sendKeys("English - System default language");
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.ENTER);
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.ENTER);
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.TAB);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		langaugeSelect = saveLanguage.getText();
		System.out.println("Selected Language is =" + langaugeSelect);
		CommonLibref.click(currencyTextOnSetUpNewJurisdiction, "javascriptClick", "currencyTextOnSetUpNewJurisdiction");
		CommonLibref.click(addCurrencyOnSetUpJurisdiction, "javascriptClick", "addCurrencyOnSetUpJurisdiction");
		addCurrencyOnSetUpJurisdiction.sendKeys("USD");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ENTER);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.TAB);
		currencySelect = saveCurrency.getText();
		CommonLibref.click(xPathPurchaseLimitText, "javascriptClick", "xPathPurchaseLimitText");
		System.out.println("USD");
		CommonLibref.click(selectPurchaseLimit, "javascriptClick", "selectPurchaseLimit");
		System.out.println("Puchase limit is " + "(PL Parameter) Percentage %");

	}

	public void cancelButtonOnSetUpNewJurisdictionPage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnSetUpNewJurisdiction));
		CommonLibref.click(cancelButtonOnSetUpNewJurisdiction, "javascriptClick", "cancelButtonOnSetUpNewJurisdiction");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid data and Click on cancel button");
		System.out.println("Click On Cancel Button");
		wait.until(ExpectedConditions.elementToBeClickable(WorningPopupOnIntialPage));
		String acualtext1 = WorningPopupOnIntialPage.getText();
		Assert.assertEquals(acualtext1, "Warning!");
		ObjectRepo.test.log(Status.PASS, "Warning popup is displayed with cancel and continue button");
		System.out.println("Warning popup is displayed with cancel and continue button");
	}

	public void cancelButtonOnWarningPopUpOfSetUpNewJurisdictionPage() {
		// //Thread.sleep(2000);
		CommonLibref.click(cancelButtonOnWarningPopopup, "seleniumClick", "cancelButtonOnWarningPopopup");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
		System.out.println("Click on Cancel button of Warning popup");
		scollPageUptoTheWelcomText();
		wait.until(ExpectedConditions.visibilityOf(jurisdictionNameValue));
		String value = jurisdictionNameValue.getAttribute("Value");
		Assert.assertEquals(jurisdictionName, value);
		wait.until(ExpectedConditions.visibilityOf(jurisdictionCodeValue));
		String value1 = jurisdictionCodeValue.getAttribute("Value");
		Assert.assertEquals(jurisdictionCode, value1);

		ObjectRepo.test.log(Status.PASS, "Warning pop up is removed and and entered Data selection is cleared ");
		System.out.println("Warning pop up is removed and and entered Data selection is cleared ");
	}

	public void continueButtonOnWarningPopUpOfSetUpNewJurisdictionPage() {
		// //Thread.sleep(2000);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnWorningPopupOfSetUpNewJurisdiction));
			CommonLibref.click(continueButtonOnWorningPopupOfSetUpNewJurisdiction, "seleniumClick",
					"continueButtonOnWorningPopupOfSetUpNewJurisdiction");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
			CommonLibref.click(continueButtonOnDetailsPage, "seleniumClick",
					"continueButtonOnWorningPopupOfSetUpNewJurisdiction");
		}
		ObjectRepo.test.log(Status.PASS,
				"Step : Again click on cancel button of Select Juridistion page and click on continue button on warning popup ");
		System.out.println(
				"Again click on cancel button of Select Juridistion page and click on continue button on warning popup  ");
		String afterContinueBTN = manageJurisdictions.getText();
//		Assert.assertEquals(homePage, afterContinueBTN);
//		ObjectRepo.test.log(Status.PASS, "Home page is displayed");
//		System.out.println("Home page is displayed");
	}

	public void selectManageJurisdictionStatusOptionFromQuickActions() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionStatusTextXpath));
			manageJurisdictionStatusTextXpath.click();
			Common.pageLoader();
			String acualtext1 = headingOfManageJurisdictionStatusPage.getText();
			Assert.assertEquals(acualtext1, "Manage Jurisdiction Status");
			ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
			System.out.println("Step : Click on Manage Jurisdiction Status");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionStatusOption));
			manageJurisdictionStatusOption.click();
			Common.pageLoader();
			String acualtext1 = headingOfManageJurisdictionStatusPage.getText();
			Assert.assertEquals(acualtext1, "Manage Jurisdiction Status");
			ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
			System.out.println("Step : Click on Manage Jurisdiction Status");
		}

	}

	public void assertionOfManageJurisdictionStatus() {
		wait.until(ExpectedConditions.visibilityOf(headingOfManageJurisdictionStatusPage));
		String acualtext1 = headingOfManageJurisdictionStatusPage.getText();
		Assert.assertEquals(acualtext1, "Manage Jurisdiction Status");
		ObjectRepo.test.log(Status.PASS, "heading of Manage Jurisdiction Status page is displayed as-   " + acualtext1);
		System.out.println("heading of Manage Jurisdiction Status page is displayed as-   " + acualtext1);
	}

	public void actionMethodOnManageJurisdictionStatus() throws InterruptedException {
		Module5_1_Pom ref1 = new Module5_1_Pom();
		Module5_4_SetupInitialUsers_POM ref4 = new Module5_4_SetupInitialUsers_POM();
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(accountStatus));
		try {
			String acualtext1 = accountStatus.getText();
			Assert.assertEquals(acualtext1, "Active");
			ref1.searchActiveUserAccountStatusInFilter();
			ref4.selectDeactivateFromQuickAction();
			ref4.EnterDataInUserReasonPopup();
			ref4.ContinueBtnOfUserReasonField();
			ref4.DeactivateSeededUser();
		} catch (Exception e) {
			performBuildAction();
			System.out.println("Inactive account status is display");
		}
	}

	public void selectAllManditoryTaskOnManageJurisdictionStatus() {
		try {
			ObjectRepo.test.log(Status.PASS,
					"Steps:Select appropriate task ,jurisdcition status and click on the submit button");
			System.out.println("\"Steps:Select appropriate task ,jurisdcition status and click on the submit button\"");

			CommonLibref.click(checkBoxOfNewJurisdictionInformation, "javascriptClick",
					"checkBoxOfNewJurisdictionInformation");
			System.out.println("New Jurisdiction Information checkbox is checked ");
			ObjectRepo.test.log(Status.PASS, "New Jurisdiction Information checkbox is checked ");
			CommonLibref.click(checkBoxOfSetInitialUsers, "javascriptClick", "checkBoxOfSetInitialUsers");
			System.out.println("Set Initial Users checkbox is checked");
			ObjectRepo.test.log(Status.PASS, "Set Initial Users checkbox is checked");
			CommonLibref.scroll(headingOfChangeStatus, "scrollToElement", "headingOfChangeStatus");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			CommonLibref.click(checkBoxOfSetJurisdictionAccount, "javascriptClick", "checkBoxOfSetJurisdictionAccount");
			System.out.println("Set Jurisdiction Account checkbox is checked");
			ObjectRepo.test.log(Status.PASS, "Set Jurisdiction Account checkbox is checked");
			CommonLibref.click(checkBoxOfSetJurisdictionBudget, "javascriptClick", "checkBoxOfSetJurisdictionBudget");
			System.out.println("Set Jurisdiction Budget checkbox is checked");

		} catch (Exception e) {
			System.out.println("Set Purchase Limits is not displayed");
		}
	}

	public void selectAllManditoryTaskOnForByValue() {
		wait.until(ExpectedConditions.visibilityOf(JurisdictionStatus));
		ObjectRepo.test.log(Status.PASS,
				"Steps:Select appropriate task ,jurisdcition status and click on the submit button");
		System.out.println("\"Steps:Select appropriate task ,jurisdcition status and click on the submit button\"");

		CommonLibref.click(checkBoxOfNewJurisdictionInformation, "javascriptClick",
				"checkBoxOfNewJurisdictionInformation");
		System.out.println("New Jurisdiction Information checkbox is checked ");

		CommonLibref.click(checkBoxOfSetInitialUsers, "seleniumClick", "checkBoxOfSetInitialUsers");
		System.out.println("Set Initial Users checkbox is checked");

		CommonLibref.scroll(headingOfChangeStatus, "scrollToElement", "headingOfChangeStatus");

		CommonLibref.click(checkBoxOfSetJurisdictionAccount, "javascriptClick", "checkBoxOfSetJurisdictionAccount");
		System.out.println("Set Jurisdiction Account checkbox is checked");

	}

	public void VerifyTheSubmitButtonWhenOneOfTheTaskNotSelect() {
		ObjectRepo.test.log(Status.PASS,
				"Steps:Select appropriate task ,jurisdcition status and click on the submit button");
		System.out.println("Steps:Select appropriate task ,jurisdcition status and click on the submit button");

		CommonLibref.click(checkBoxOfNewJurisdictionInformation, "javascriptClick",
				"checkBoxOfNewJurisdictionInformation");
		System.out.println("New Jurisdiction Information checkbox is checked ");

		CommonLibref.click(checkBoxOfSetInitialUsers, "javascriptClick", "checkBoxOfSetInitialUsers");
		System.out.println("Set Initial Users checkbox is checked");
	}

	public void selectPreLinkedJurisdicitonStatusFromDropDown1() {
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
		System.out.println(preLinkedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status");
		System.out.println("Jurisdiction Status is selected");

		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.click(searchFieldOfJurisdiction, "javascriptClick", "searchFieldOfJurisdiction");
		searchFieldOfJurisdiction.sendKeys("California");
		searchFieldOfJurisdiction.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		selectJurisdiction = saveJurisdicion.getAttribute("value");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Select from Dropdown - " + selectJurisdiction);
		System.out.println("Jurisdiction Select from Dropdown - " + selectJurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToBottomOFPage", "statusChangeHistory");

	}

	public void selectPreLinkedStatusFromDropDownNovaScotiaJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		String preLinkedstatus = saveJurisdicionStatusfield.getAttribute("value");
		System.out.println(preLinkedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status");
		System.out.println("Jurisdiction Status is selected");

		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.click(searchFieldOfJurisdiction, "javascriptClick", "searchFieldOfJurisdiction");
		searchFieldOfJurisdiction.sendKeys("Nova Scotia");
		searchFieldOfJurisdiction.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		selectJurisdiction = saveJurisdicion.getAttribute("value");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Select from Dropdown - " + selectJurisdiction);
		System.out.println("Jurisdiction Select from Dropdown - " + selectJurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));

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
		CommonLibref.scroll(statusChangeHistory, "scrollToBottomOFPage", "statusChangeHistory");

	}

	public void selectUnlinkedJurisdicitonStatusFromDropDown() {
		ObjectRepo.test.log(Status.PASS, "Step :Select Unlinked Status from Dropdown");
		System.out.println("Step :Select Unlinked Status from Dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		searchFieldOfJurisdictionStatus.sendKeys("UnLinked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchFieldOfJurisdictionStatus.sendKeys(Keys.TAB);
//		UnLinkedstatus = saveUnlinkedStatus.getAttribute("value");
//		System.out.println(UnLinkedstatus);
	}

	public void cancelButtonOnManageJurisdictionStatusPage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonClassXpath));
		try {
			CommonLibref.click(cancelButtonClassXpath, "seleniumClick", "cancelButtonClassXpath");
			ObjectRepo.test.log(Status.PASS, "Step : Enter valid data and Click on cancel button");
			System.out.println("Step : Enter valid data and Click on cancel button");
		} catch (Exception e) {
			CommonLibref.click(cancelButtonOnManagedJurisdictionDetailsPage, "seleniumClick",
					"cancelButtonOnManagedJurisdictionDetailsPage");
			ObjectRepo.test.log(Status.PASS, "Step : Enter valid data and Click on cancel button");
			System.out.println("Step : Enter valid data and Click on cancel button");
		}
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmationPopupOfSaveButtonONDetailsPage));
		String acualtext1 = ConfirmationPopupOfSaveButtonONDetailsPage.getText();
		Assert.assertEquals(acualtext1, "Warning!");
		ObjectRepo.test.log(Status.PASS, "Warning popup is displayed with cancel and continue button");
		System.out.println("Warning popup is displayed with cancel and continue button");
	}

	public void cancelButtonOnWarningPopUpOfManageJurisdictionStatusPage() {
		CommonLibref.click(cancelButtonOnWarningPopopup, "javascriptClick", "cancelButtonOnWarningPopopup");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
		System.out.println("Click on Cancel button of Warning popup");
		String value = saveJurisdicionStatusfield.getAttribute("Value");
		String value1 = saveJurisdicion.getAttribute("Value");
		Assert.assertEquals(selectJurisdiction, value1);
		ObjectRepo.test.log(Status.PASS,
				"Warning pop up is removed and and entered Data /selection should not get cleared ");
		System.out.println("Warning pop up is removed and and entered Data /selection should not get cleared ");
	}

	public void continueButtonOnWarningPopUpOfManageJurisdictionStatusPage() {
		wait.until(ExpectedConditions.elementToBeClickable(continueBTNOnWarningPopup));
		CommonLibref.click(continueBTNOnWarningPopup, "javascriptClick", "continueBTNOnWarningPopup");
		ObjectRepo.test.log(Status.PASS,
				"Step :Again click on cancel button of Manage Jurisdiction Status page and click on continue button on warning popup ");
		System.out.println(
				"Again click on cancel button of Manage Jurisdiction Status page and click on continue button on warning popup");

		wait.until(ExpectedConditions.visibilityOf(manageJurisdictions));
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictions));
		String afterContinueBTN = manageJurisdictions.getText();
		Assert.assertEquals(afterContinueBTN, "MANAGE JURISDICTIONS");
		ObjectRepo.test.log(Status.PASS, "Home page is displayed");
		System.out.println("Home page is displayed");
	}

	public void cancelButtonOnWarningPopUpforUnlinkedStatusSelected() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnManagedStatus));
		CommonLibref.click(cancelButtonOnManagedStatus, "javascriptClick", "cancelButtonOnManagedStatus");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
		System.out.println("Click on Cancel button of Warning popup");
		String value = saveUnlinkedStatus.getAttribute("Value");
		Assert.assertEquals(UnLinkedstatus, value);
		ObjectRepo.test.log(Status.PASS,
				"Warning pop up is removed and and entered Data /selection should not get cleared ");
		System.out.println("Warning pop up is removed and and entered Data /selection should not get cleared ");
	}

	public void SearchAndAssertOptionOtherThanOnboadingJurisdiction() {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("Texas");
		System.out.println("Enter Jurisdiction Name =" + "Texas");
	}

	public void selectLinkedFromDropdownOnManageJurisdictionStatus() {
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys("Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		linkedstatus = saveLinkedStatus.getAttribute("value");
		System.out.println(linkedstatus);
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("linked Status is selected");
	}

	public void selectDateofLinkage() {
//		Date dt = new Date();
//		LocalDateTime.from(dt.toInstant()).plusDays(1);
		try {
			wait.until(ExpectedConditions.visibilityOf(dateDropdownoption));
			Actions action = new Actions(driver.get());
			action.moveToElement(dateDropdownoption).click(dateDropdownoption).build().perform();
		} catch (Exception e) {

			WebElement dropdown = driver.get().findElement(By.xpath("//button[@aria-label='Choose date']"));
			CommonLibref.click(dropdown, "moveToElementClick", "dropdown");
		}

//		 js = (JavascriptExecutor) driver.get();
//		CommonLibref.click(dateDropdownoption, "moveToElementClick", "dateDropdownoption");

		wait.until(ExpectedConditions.elementToBeClickable(selectNextDate));
		CommonLibref.click(selectNextDate, "moveToElementClick", "selectDate");
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("Date of Linkage is selected");
		String date = dateFilledXpath.getText();
		System.out.println("Selected date is displayed as -" + date);
		ObjectRepo.test.log(Status.PASS, "Selected date is displayed as -" + date);

	}

	public void acknowledgeCheckBoxOnManageJurisdictionStatus() {
		CommonLibref.click(acknowledgeCheckbox, "seleniumClick", "acknowledgeCheckbox");
		ObjectRepo.test.log(Status.PASS, "Step : Select Acknowledge checkbox");
		System.out.println("Acknowledge checkbox is selected");
	}

	public void cancelButtonOnWarningPopUpforlinkedStatusSelected() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnManagedStatus));
		CommonLibref.click(cancelButtonOnManagedStatus, "javascriptClick", "cancelButtonOnManagedStatus");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
		System.out.println("Click on Cancel button of Warning popup");
		String value = saveLinkedStatus.getAttribute("Value");
		Assert.assertEquals(linkedstatus, value);
		ObjectRepo.test.log(Status.PASS,
				"Warning pop up is removed and and entered Data /selection should not get cleared ");
		System.out.println("Warning pop up is removed and and entered Data /selection should not get cleared ");
	}

	public void assersionOfManageJurisdictionHomePage() {
		String manageJurisdictionTitle = manageJurisdictions.getText();
		Assert.assertEquals(manageJurisdictionTitle, "MANAGE JURISDICTIONS");
		ObjectRepo.test.log(Status.PASS, "WCI, Inc. Admin should get navigated to Manage Jurisdiction page.");
		System.out.println("WCI, Inc. Admin should get navigated to Manage Jurisdiction page.");

//		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
//		String onBoardNewJurisdictionButtonOnHomePage = onBoardNewJurisdictionButton.getText();
//		Assert.assertEquals(onBoardNewJurisdictionButtonOnHomePage, "ONBOARD NEW JURISDICTION");
//		System.out.println(onBoardNewJurisdictionButtonOnHomePage + "- Button name is displayed");
//		ObjectRepo.test.log(Status.PASS, onBoardNewJurisdictionButtonOnHomePage + "- Button name is displayed");

	}

	public void verifyTheManageJurisdictionHomePageOtherThanWCIInc() {
		try {
			if (manageJurisdictions.isDisplayed()) {
				ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Home page is displayed");
				System.out.println("Manage Jurisdiction Home page is displayed ");
				Assert.assertEquals(false, true);
			} else {
				System.out.println("Manage Jurisdiction Home page is displayed");
			}
		} catch (Exception e) {
			ObjectRepo.test.log(Status.PASS,
					"User is logged in successfully and Manage Jurisdiction Home Page should not displayed");
			System.out.println(
					"User is logged in successfully and Manage Jurisdiction Home Page should not displayed");
		}
	}

	public void verifyTheManageAllJurisdictionTable() {

		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(sizeArraowOnHomePage));
		List<WebElement> List = driver.get().findElements(
				By.xpath("//*[contains(@class,'MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable')]"));
		int size2 = List.size();
		System.out.println("No of Instruments available :" + size2);
		for (int i = 0; i < List.size(); i++) {
			
			String element = List.get(i).getText();
			System.out.println("All Jurisdiction column name is displayed as :" + element);
			ObjectRepo.test.log(Status.PASS, "All Jurisdiction column name is displayed as :" + element);
		}
	}

//	public void verifyTheQuickActionsOption() {
//		List<WebElement> List = driver.get()
//				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));
//		int size2 = List.size();
//		System.out.println("No of Instruments available :" + size2);
//		for (int i = 0; i < List.size(); i++) {
//			String element = List.get(i).getText();
//			System.out.println("sub menu  name is displayed as :" + element);
//			ObjectRepo.test.log(Status.PASS, "sub menu name is displayed as :" + element);
//		}
//		try {
//			driver.get()
//					.findElement(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1pr732m')]"))
//					.isDisplayed();
//			System.out.println("Manage transfer is display");
//		} catch (Exception ex) {
//			driver.get().findElements(
//					By.xpath("(//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')])[7]"));
//			System.out.println("Manage transfer option is enable");
//		}
//		String manageJurisdictionDetailSubmenu = manageJurisdictionDetailsOption.getText();
//		Assert.assertEquals(manageJurisdictionDetailSubmenu, "MANAGE JURISDICTION DETAILS");
//		
//		String manageBudgetSubmenu = manageBudgetOption.getText();
//		Assert.assertEquals(manageBudgetSubmenu, "MANAGE BUDGET");
//		
//		String managePurchaseLimitSubmenu = managePurchaseLimitOption.getText();
//		Assert.assertEquals(managePurchaseLimitSubmenu, "MANAGE PURCHASE LIMIT");
//		
//		String manageInitialUserSubmenu = selectInitialUserContainsXpath.getText();
//		try {
//			Assert.assertEquals(manageInitialUserSubmenu, "MANAGE INITIAL USERS");
//		} catch (Exception e) {
//			Assert.assertEquals(manageInitialUserSubmenu, "SETUP INITIAL USERS");
//		}
//		
//		manageJurisdictionStatusSubmenu = manageJurisdictionStatusOption.getText();
//		Assert.assertEquals(manageJurisdictionStatusSubmenu, "MANAGE JURISDICTION STATUS");
//		
//		manageJurisdictionAccountsSubmenu = setUpJurisdictionAccountOption.getText();
//		try {
//			Assert.assertEquals(manageJurisdictionAccountsSubmenu, "MANAGE JURISDICTION ACCOUNTS");
//		} catch (Exception e) {
//			Assert.assertEquals(manageJurisdictionAccountsSubmenu, "SETUP JURISDICTION ACCOUNTS");
//
//		}
//	}
	public void verifyTheQuickActionsOption() {
		List<WebElement> elements = driver.get()
				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));
		int size = elements.size();
		System.out.println("No of Instruments available: " + size);

		for (WebElement element : elements) {
			String text = element.getText();
			System.out.println("Sub menu name is displayed as: " + text);
			ObjectRepo.test.log(Status.PASS, "Sub menu name is displayed as: " + text);
		}

		try {
			WebElement manageTransferElement = driver.get().findElement(
					By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1pr732m')]"));
			if (manageTransferElement.isDisplayed()) {
				System.out.println("Manage transfer is displayed");
			}
		} catch (Exception ex) {
			System.out.println("Manage transfer option is enabled");
		}
		WebElement quickActions2 = driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']"));
		wait.until(ExpectedConditions.elementToBeClickable(quickActions2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActions2).click().perform();
		} catch (NoSuchElementException e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("arguments[0].click();", quickActions2);
		} catch (Exception e) {
			quickActions2.click();
		}
		String manageJurisdictionDetailSubmenu = manageJurisdictionDetailsOption.getText();
		Assert.assertEquals(manageJurisdictionDetailSubmenu, "MANAGE JURISDICTION DETAILS");

		String manageBudgetSubmenu = manageBudgetOption.getText();
		Assert.assertEquals(manageBudgetSubmenu, "MANAGE BUDGET");

		String managePurchaseLimitSubmenu = managePurchaseLimitOption.getText();
		Assert.assertEquals(managePurchaseLimitSubmenu, "MANAGE PURCHASE LIMIT");

		String manageInitialUserSubmenu = selectInitialUserContainsXpath.getText();
		try {
			Assert.assertEquals(manageInitialUserSubmenu, "SET UP INITIAL USERS");
		} catch (Exception e) {
			Assert.assertEquals(manageInitialUserSubmenu, "MANAGE INITIAL USERS");

		}

		String manageJurisdictionStatusSubmenu = manageJurisdictionStatusOption.getText();
		Assert.assertEquals(manageJurisdictionStatusSubmenu, "MANAGE JURISDICTION STATUS");

		String manageJurisdictionAccountsSubmenu = setUpJurisdictionAccountOption.getText();
		try {
			Assert.assertEquals(manageJurisdictionAccountsSubmenu, "SET UP JURISDICTION ACCOUNTS");
		} catch (Exception e) {
			Assert.assertEquals(manageJurisdictionAccountsSubmenu, "MANAGE JURISDICTION ACCOUNTS");
		}

	}

	public void clickOnQuickActionsOtherThanOnboardingStatus() {
		String manageJurisdictionDetailSubmenu = manageJurisdictionDetailsOption.getText();
		Assert.assertEquals(manageJurisdictionDetailSubmenu, "MANAGE JURISDICTION DETAILS");
		ObjectRepo.test.log(Status.PASS, "MANAGE JURISDICTION DETAILS is display");
		System.out.println("MANAGE JURISDICTION DETAILS is display");
		String manageBudgetSubmenu = manageBudgetOption.getText();
		Assert.assertEquals(manageBudgetSubmenu, "MANAGE BUDGET");
		ObjectRepo.test.log(Status.PASS, "MANAGE BUDGET is display");
		System.out.println("MANAGE BUDGET is display");
		String managePurchaseLimitSubmenu = managePurchaseLimitOption.getText();
		Assert.assertEquals(managePurchaseLimitSubmenu, "MANAGE PURCHASE LIMIT");
		ObjectRepo.test.log(Status.PASS, "MANAGE PURCHASE LIMIT is display");
		System.out.println("MANAGE PURCHASE LIMIT is display");
		String manageInitialUserSubmenu = selectInitialUserContainsXpath.getText();
		Assert.assertEquals(manageInitialUserSubmenu, "MANAGE INITIAL USERS");
		ObjectRepo.test.log(Status.PASS, "MANAGE INITIAL USERS is display");
		System.out.println("MANAGE INITIAL USERS is display");
		String manageJurisdictionStatusSubmenu = manageJurisdictionStatusOption.getText();
		Assert.assertEquals(manageJurisdictionStatusSubmenu, "MANAGE JURISDICTION STATUS");
		ObjectRepo.test.log(Status.PASS, "MANAGE JURISDICTION STATUS is display");
		System.out.println("MANAGE JURISDICTION STATUS is display");
		String manageJurisdictionAccountsSubmenu = selectManageJurisdictionsAccounts.getText();
		Assert.assertEquals(manageJurisdictionAccountsSubmenu, "MANAGE JURISDICTION ACCOUNTS");
		ObjectRepo.test.log(Status.PASS, "MANAGE JURISDICTION ACCOUNTS is display");
		System.out.println("MANAGE JURISDICTION ACCOUNTS is display");
		if (manageTransferOption.isEnabled()) {
			Assert.assertEquals(manageTransferOption.isEnabled(), true);
			System.out.println("Mange Transfer option is enable");
		} else {
			Assert.assertEquals(manageTransferOption.isEnabled(), false);
			System.out.println("Mange Transfer option is disable");

		}
	}

	public void verifyOnboardNewJurisdictionButton() {
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		wait.until(ExpectedConditions.visibilityOf(onBoardNewJurisdictionButton));

		onBoardNewJurisdictionButton.isDisplayed();
		String onBoardNewJurisdictionButtonOnHomePage = onBoardNewJurisdictionButton.getText();
		Assert.assertEquals(onBoardNewJurisdictionButtonOnHomePage, "ONBOARD NEW JURISDICTION");
		System.out.println(onBoardNewJurisdictionButtonOnHomePage + " - Button is displayed");
		ObjectRepo.test.log(Status.PASS, onBoardNewJurisdictionButtonOnHomePage + " - Button is displayed");

	}

	public void clickOnQuickActionAndSelectJurisdictionAccount() {
		try {
			setUpJurisdictionAccountOption.click();
		} catch (Exception ex) {
			setUpJurisdictionAccountTextXpath.click();
		}
	}

	public void getAccountName() {
		try {
			accountName2 = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-field=\"accountName\"])[3]")))
					.getText();
		} catch (Exception e) {
			accountName2 = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-field=\"accountName\"])[3]")))
					.getText();
		}

	}

	public void selectAddAccount() {
		try {
			AddNewAccount.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD NEW ACCOUNT\"]"))).click();
		}
	}

	public void clickOnQuickActionAndSelectJurisdictionAccountForByValue() {
		try {
			manageJurisdictionStatusOption.click();

		} catch (Exception ex) {
			setUpJurisdictionAccountTextXpath.click();
		}
	}

	public void assersionOfManageJurisdictionAccountstitle() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(headingOfThePage));
		String manageJurisdictionAccountTitle2 = headingOfThePage.getText();
		try {
//			Assert.assertEquals(manageJurisdictionAccountTitle2, "Set Up Jurisdiction Accounts");
			ObjectRepo.test.log(Status.PASS, manageJurisdictionAccountTitle2 + "- title is displayed");
			System.out.println(manageJurisdictionAccountTitle2 + "- title is displayed");
		} catch (Exception e) {
//			Assert.assertEquals(manageJurisdictionAccountTitle2, "Manage Jurisdiction Accounts");
			ObjectRepo.test.log(Status.PASS, manageJurisdictionAccountTitle2 + "- title is displayed");
			System.out.println(manageJurisdictionAccountTitle2 + "- title is displayed");
		}
	}

	public void assersionOfManageJurisdictionAccountstitle02() throws InterruptedException {
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(headingOfThePage2));
		manageJurisdictionAccountTitle = headingOfThePage2.getText();
		Assert.assertEquals(manageJurisdictionAccountTitle, "Manage Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, manageJurisdictionAccountTitle + "- title is displayed");
		System.out.println(manageJurisdictionAccountTitle + "- title is displayed");

	}

	public void searchAccountNumber() {
		String accountType = searchAccountType.getText();
		ObjectRepo.test.log(Status.PASS, "Account Type is displayed as - " + accountType);
		System.out.println("Account Type is displayed as - " + accountType);
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		CommonLibref.click(searchField, "javascriptClick", "searchField");
		searchField.sendKeys(accountType);
	}

	public void searchAccountNumberWithActionsClass() {
		String accountType = searchAccountType.getText();
		ObjectRepo.test.log(Status.PASS, "Account Type is displayed as - " + accountType);
		System.out.println("Account Type is displayed as - " + accountType);
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver.get());
		action.moveToElement(homepageSearchOption).click(homepageSearchOption).build().perform();
		homepageSearchOption.sendKeys(accountType);
	}

	public void clickOnQuickActionsThreeDot() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
		ObjectRepo.test.log(Status.PASS, "Step :Click On Quick Actions option ");
		System.out.println("Step :Click OnQuick Actions option ");
	}

	public void selectEditJurisdictionAccountSubmenuFromQuickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(editJurisdictionAccountSubmenuXpath));
		CommonLibref.click(editJurisdictionAccountSubmenuXpath, "seleniumClick", "editJurisdictionAccountSubmenuXpath");
		Common.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Step :EDIT JURISDICTION ACCOUNT is displayed");
		System.out.println("EDIT JURISDICTION ACCOUNT is displayed");
	}

	public void assersionOfEditJurisdictionAccountsstitle() {
		editJurisdictionAccountsTitle = editJurisdictionAccountsTitleXpath.getText();
		Assert.assertEquals(editJurisdictionAccountsTitle, "Edit Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Step : Edit Jurisdiction Accounts title is displayed");
		System.out.println("Steps: Edit Jurisdiction Accounts title is displayed");
	}

	public void editAccountNameOnEditJurisdictionAccountPage() {
		String randomAccountName = RandomStringUtils.randomNumeric(5);
		AccountName1 = "Account" + randomAccountName;
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.CONTROL, "a");
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.BACK_SPACE);
		editAccountNameforEnglishLangOnManageAccount.sendKeys(AccountName1);
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.TAB);
		ObjectRepo.test.log(Status.PASS, "Account Name displayed for English -" + AccountName1);
		System.out.println("Account Name displayed for English -" + AccountName1);
	}

	public void clickOnAddInitialUserButton() {
		CommonLibref.click(addInitialUserButton, "javascriptClick", "addInitialUserButton");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		System.out.println("Step: Click on Add Initial User");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Add Initial User");
        Common.pageLoader();
	}

	public void cancelButtonOnThePage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonAtEndOfThePage));
		CommonLibref.click(cancelButtonAtEndOfThePage, "javascriptClick", "cancelButtonAtEndOfThePage");
		ObjectRepo.test.log(Status.PASS, "Step :  Enter valid data and Click on cancel button");
		System.out.println("Step :  Enter valid data and Click on cancel button");

	}

	public void cancelButtonOnTheWarningOfThePopUpCard() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnTheWarningPopup));
		CommonLibref.click(cancelButtonOnTheWarningPopup, "javascriptClick", "cancelButtonOnTheWarningPopup");
		ObjectRepo.test.log(Status.PASS, "Step :Click on Cancel button on Jurisdiction Details page");
		System.out.println("Step :Click on Cancel button on Jurisdiction Details page");
	}

	public void cancelButtonOnDetailPage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnDtailPage));
		CommonLibref.click(cancelButtonOnDtailPage, "javascriptClick", "cancelButtonOnDtailPage");
		ObjectRepo.test.log(Status.PASS, "Step :Click on Cancel button of Warning popup");
		System.out.println("Step :Click on Cancel button of Warning popup");
	}

	public void clickOnCancelButton() {
		try {
			CommonLibref.scroll(cancelButton, "scrollToBottomOFPage", "cancelBTNOnInitialPage");
			wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
			CommonLibref.click(cancelButton, "javascriptClick", "cancelBTNOnInitialPage");
			ObjectRepo.test.log(Status.PASS, "Step : Click on the Cancel button on the Page");
			System.out.println("Click on the Cancel button on the Page");
		} catch (Exception ex) {
			CommonLibref.scroll(cancelButton, "scrollToBottomOFPage", "cancelBTNOnInitialPage");
			wait.until(ExpectedConditions.elementToBeClickable(cancelButton));
			CommonLibref.click(cancelButton, "javascriptClick", "cancelBTNOnInitialPage");
			ObjectRepo.test.log(Status.PASS, "Step : Click on the Cancel button on the Page");
			System.out.println("Click on the Cancel button on the Page");
		}
	}

	public void clickOnCancelButton01() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnWarningPopopup01));
		CommonLibref.click(cancelButtonOnWarningPopopup01, "javascriptClick", "cancelButtonOnWarningPopopup01");
		ObjectRepo.test.log(Status.PASS, "Step : Click on the Cancel button of the Worning popup");
		System.out.println("Click on the Cancel button of the Worning popup");

	}

	public void clickOnCancelButtonWithIndex02() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonClassXpath02));
		CommonLibref.click(cancelButtonOnWarningPopopup01, "javascriptClick", "cancelButtonOnWarningPopopup01");
		ObjectRepo.test.log(Status.PASS, "Step : Click on the Cancel button of the Worning popup");
		System.out.println("Click on the Cancel button of the Worning popup");

	}

	public void clickOnContinueButtonOnWarningPopUpOfEditJurisdcitonPage() {
		wait.until(ExpectedConditions.elementToBeClickable(continueBTNOnWarningPopup2));
		CommonLibref.click(continueBTNOnWarningPopup2, "javascriptClick", "continueBTNOnWarningPopup");
		ObjectRepo.test.log(Status.PASS,
				"Step :Again click on cancel button of Edit Jurisdiction Accounts page and click on continue button on warning popup ");
		System.out.println(
				"Again click on cancel button of Edit Jurisdiction Accounts page and click on continue button on warning popup");
		manageJurisdictionAccountTitle = manageJurisdictionAccountsTitleXpath.getText();
		Assert.assertEquals(manageJurisdictionAccountTitle, "Manage Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Accounts is displayed");
		System.out.println("Manage Jurisdiction Accounts is displayed");
	}

	public void clickOnBoardNewJurisdictionButton() throws InterruptedException {
		Thread.sleep(2000);
		for (int i = 0; i < 1; i++) {
			try {
				ObjectRepo.test.log(Status.PASS, "Step :Click on the ONBOARD NEW JURISDICTION button");
				System.out.println("Click on the ONBOARD NEW JURISDICTION button");
				expandAllJurisdictionsOnHomePage();
				onBoardNewJurisdictionButton.click();
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
		CommonLibref.pageLoader();
	}

	public void assertSetupNewJurisdictionPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(headingOfThePage));
		String setUpNewJurisdictionTitle = headingOfThePage.getText();
		Assert.assertEquals(setUpNewJurisdictionTitle, "Set Up New Jurisdiction");
		ObjectRepo.test.log(Status.PASS, "ONBOARD NEW JURISDICTION button is clickable and" + setUpNewJurisdictionTitle
				+ " " + " page is displayed.");
		System.out.println("ONBOARD NEW JURISDICTION button is clickable and" + setUpNewJurisdictionTitle + " "
				+ " page is displayed.");
	}

	public void accessibilityOfManageInitialUsersPage() {
		wait.until(ExpectedConditions.elementToBeClickable(titleOfInitialPage));
		String manageInitialUserTitle = titleOfInitialPage.getText();
		Assert.assertEquals(manageInitialUserTitle, "Manage Initial Users");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should be redirected to 'Manage Initial Users' Page.");
		System.out.println("WCI Inc Admin should be redirected to 'Manage Initial Users' Page.");
	}

	public void verifyTheFuctionalityOfSetupInitialUsersSubmenu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(headingOfThePage));
		String manageInitialUserTitle = headingOfThePage.getText();
		Assert.assertEquals(manageInitialUserTitle, "Manage Initial Users");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should be redirected to 'Manage Initial Users' Page.");
		System.out.println("WCI Inc Admin should be redirected to 'Manage Initial Users' Page.");
	}

	public void AsserTitleOnManageInitialUsersPage() {
		String manageInitialUserTitle = headingOfThePage.getText();
		Assert.assertEquals(manageInitialUserTitle, "Manage Initial Users");
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin should be redirected to 'Manage Initial Users' Page.");
		System.out.println("WCI Inc Admin should be redirected to 'Manage Initial Users' Page.");

		if (addInitialUserButton.isDisplayed()) {
			ObjectRepo.test.log(Status.PASS, "Add Initial User button is displayed on 'Manage Initial Users' page");
			System.out.println("Add Initial User button is displayed on 'Manage Initial Users' page");
			Boolean addInitialButton = driver.get().findElement(By.xpath("//button[text()='Add Initial User']"))
					.isDisplayed();
			Assert.assertTrue(addInitialButton);

		} else {
			System.out.println("Add Initial User button is displayed on 'Manage Initial Users' page");
		}
	}

	public void clickOnSetUpInitialUserOption() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(selectInitialUserContainsXpath));
			selectInitialUserContainsXpath.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users Menu");
			System.out.println("Step:Click on Setup Initial Users Menu");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(selectInitialUser));
			selectInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users Menu");
			System.out.println("Step:Click on Setup Initial Users Menu");
		}
	}

	public void selectInitialUserOptionFromQuickAction() {
		wait.until(ExpectedConditions.visibilityOf(selectInitialUserContainsXpath));
		wait.until(ExpectedConditions.elementToBeClickable(selectInitialUserContainsXpath));

		try {
			selectInitialUserContainsXpath.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users SubMenu");
			System.out.println("Step:Click on Setup Initial Users SubMenu");

		} catch (Exception e) {
			selectInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users SubMenu");
			System.out.println("Step:Click on Setup Initial Users SubMenu");
		}
		Common.pageLoader();
	}

	public void selectInitialUserOptionFromQuickActionForValuePurchaseLimit() {
		wait.until(ExpectedConditions.visibilityOf(managePurchaseLimitOption));
		wait.until(ExpectedConditions.elementToBeClickable(managePurchaseLimitOption));

		try {
			managePurchaseLimitOption.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users SubMenu");
			System.out.println("Step:Click on Setup Initial Users SubMenu");

		} catch (Exception e) {
			selectInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users SubMenu");
			System.out.println("Step:Click on Setup Initial Users SubMenu");
		}
	}

	public void assersionOfInitialUserInQuickActions() {
		try {
			wait.until(ExpectedConditions.visibilityOf(selectInitialUser));
			setUpInitialSubmenu = selectInitialUser.getText();
			Assert.assertEquals(selectInitialUser.getText(), "SET UP INITIAL USERS");
			ObjectRepo.test.log(Status.PASS, setUpInitialSubmenu + "Option is displayed");
			System.out.println(setUpInitialSubmenu + " - Option is displayed");
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(selectInitialUserContainsXpath));
			String manageInitialUserSubmenu = selectInitialUserContainsXpath.getText();
			Assert.assertEquals(selectInitialUserContainsXpath.getText(), "SET UP INITIAL USERS");
			ObjectRepo.test.log(Status.PASS, manageInitialUserSubmenu + "Option is displayed");
			System.out.println(manageInitialUserSubmenu + " - Option is displayed");
		}
	}

	public void verifyTheManageInitialUserOptionInQucikActions() {
		String manageInitialUserSubmenu;
		try {
			wait.until(ExpectedConditions.visibilityOf(manageInitialUserTextXpath));
			manageInitialUserSubmenu = manageInitialUserTextXpath.getText();
			Assert.assertEquals(manageInitialUserTextXpath.getText(), "MANAGE INITIAL USERS");

		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(selectInitialUserContainsXpath));
			manageInitialUserSubmenu = selectInitialUserContainsXpath.getText();
			Assert.assertEquals(selectInitialUserContainsXpath.getText(), "MANAGE INITIAL USERS");

		}
		ObjectRepo.test.log(Status.PASS, manageInitialUserSubmenu + "Option is displayed");
		System.out.println(manageInitialUserSubmenu + " - Option is displayed");
	}

	public void clickOnQuickActions() {
		try {
			WebElement quickActions2 = driver.get().findElement(By.xpath("(//*[@data-field=\"quickActions\"])[2]"));
			CommonLibref.click(quickActions2, "seleniumClick", "juriAccount");
		} catch (NoSuchElementException e) {
			WebElement quickActions2 = driver.get().findElement(By.xpath("(//*[@data-field=\"quickActions\"])[2]"));
			CommonLibref.click(quickActions2, "javascriptClick", "juriAccount");
		} catch (Exception e) {
			WebElement quickActions2 = driver.get().findElement(By.xpath("(//*[@data-field=\"quickActions\"])[2]"));
			CommonLibref.click(quickActions2, "moveToElementClick", "juriAccount");
		}
	}

	public void clickOnManageJurisdictionAccount() {
		WebElement juriAccount = driver.get().findElement(By.xpath("//*[text()='MANAGE JURISDICTION ACCOUNTS']"));
		wait.until(ExpectedConditions.elementToBeClickable(juriAccount));
		try {
			CommonLibref.click(juriAccount, "javascriptClick", "juriAccount");
		} catch (NoSuchElementException e) {
			CommonLibref.click(juriAccount, "moveToElementClick", "juriAccount");
		} catch (Exception e) {
			juriAccount.click();
		}
	}

	public void storedAccountName() {
		editValueForEnglish = editAccountnameForEnglishLang.getAttribute("value");
		System.out.println(editValueForEnglish);
		ObjectRepo.test.log(Status.PASS, editValueForEnglish);
		editValueForFenchtestfaiza01 = editAccountnameForFenchtestfaiza01Lang.getAttribute("value");
		System.out.println(editValueForFenchtestfaiza01);
		ObjectRepo.test.log(Status.PASS, editValueForFenchtestfaiza01);

	}

	public void verifyTheValueAfterClickOnCancelButton() {
		String actualValue = editAccountnameForEnglishLang.getAttribute("value");
		Assert.assertEquals(actualValue, editValueForEnglish);
		String actualValue1 = editAccountnameForFenchtestfaiza01Lang.getAttribute("value");
		Assert.assertEquals(actualValue1, editValueForFenchtestfaiza01);
	}

	public void verifyResendAccountSetUpLink() {
		if (resendSetUpLinkXpath.isEnabled()) {
			Assert.assertEquals(resendSetUpLinkXpath.isEnabled(), true);
			System.out.println("RESEND ACCOUNT SET UP LINK is enable");
			ObjectRepo.test.log(Status.PASS, "RESEND ACCOUNT SET UP LINK is enable");

		} else {
			Assert.assertEquals(resendSetUpLinkXpath.isEnabled(), false);
			System.out.println("RESEND ACCOUNT SET UP LINK option is disable");
			ObjectRepo.test.log(Status.PASS, "RESEND ACCOUNT SET UP LINK option is disable");
		}
	}

	public void clickOnSetUpAccountLinkOnInitialPage() {
		wait.until(ExpectedConditions.elementToBeClickable(resendSetUpLinkXpath));
		CommonLibref.click(resendSetUpLinkXpath, "seleniumClick", "resedSetUpLinkXpath");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Resend Account Set Up Link option menu");
		System.out.println("Click on Resend Account Set Up Link option menu");
		wait.until(ExpectedConditions.visibilityOf(successMessageAfterResendLink));
		String saveSuccessMessage1 = successMessageAfterResendLink.getText();
		Assert.assertEquals(successMessageAfterResendLink.getText(),
				"Account Set Up Link has successfully been resent.");
		ObjectRepo.test.log(Status.PASS, "Success message is display as - " + saveSuccessMessage1);
		System.out.println("Success message is display as - " + saveSuccessMessage1);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-testid=\"CloseIcon\"])[3]")));
		CommonLibref.click(element, "moveToElementClick", "element");

	}

	public void verifyTheOldLink() {
		driver.get().navigate().to("https://yopmail.com/en/");
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys("elon12389@yopmail.com");
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(Keys.CONTROL, "a");
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(Keys.BACK_SPACE);
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(randomEmailId);
		driver.get().findElement(By.xpath("//*[@id='refreshbut']/button/i")).click();
		WebElement frame1 = driver.get().findElement(By.xpath("//iframe[@id='ifinbox']"));

		driver.get().switchTo().frame(frame1);
		CommonLibref.click(selectOldLink, "javascriptClick", "selectOldLink");
		driver.get().switchTo().defaultContent();
		WebElement frame2 = driver.get().findElement(By.xpath("//iframe[@id='ifmail']"));
		driver.get().switchTo().frame(frame2);

		CommonLibref.click(wciLinkOnYopmail, "javascriptClick", "wciLinkOnYopmail");
		ArrayList<String> tabs = new ArrayList<>(driver.get().getWindowHandles());
		driver.get().switchTo().window(tabs.get(1));
		ObjectRepo.test.log(Status.PASS, "Steps: Verify the link");
		System.out.println("Steps: Verify the link");
		wait.until(ExpectedConditions.visibilityOf(linkNoLongarValidText));
		Assert.assertTrue(linkNoLongarValidText.getText(), true);
		ObjectRepo.test.log(Status.PASS, "Text is displayed like - : This link is no longer valid.");
		System.out.println("Text is displayed like - : This link is no longer valid.");
	}

	public void verifyTheEmailFunctionalityForResendAccountSetUpLink1() {
		getEmail ref = new getEmail();
		ref.getCurrentEmailData(randomEmailId, "Hello,\n" + "\n"
				+ "We received a request to resend the user registration link for your account.\n" + "\n"
				+ "To complete this request, please click the link below:\n" + ref.link + "\n"
				+ "If clicking the above link does not work, please copy and paste the link into your browser or another browser. Please note that this link will expire in 24 hours from the receipt of this email.\n"
				+ "\n"
				+ "If you have received this email in error or have any other questions, please contact us at: WCIincSupport@wci-test.org\n"
				+ "\n" + "Thank You,\n" + "WCI, Inc Support Team", "Resend User Registration link for WCI, Inc");

	}

	public void navigateBackMethod() {
		driver.get().navigate().back();
		driver.get().navigate().back();
	}

	public void addValidDataForSeededUser() {
		wait.until(ExpectedConditions.elementToBeClickable(addInitialUserButton));
		CommonLibref.click(addInitialUserButton, "javascriptClick", "addInitialUserButton");
		addFirstName.sendKeys("Waren");
		Text = storedFirstName.getAttribute("Value");
		System.out.println(Text);
		ObjectRepo.test.log(Status.PASS, "First Name is Added");
		System.out.println("Enter First Name = " + "Waren");
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys("JOj");
		Text1 = storedLastName.getAttribute("Value");
		System.out.println(Text1);
		ObjectRepo.test.log(Status.PASS, "Step : Last Name is Added");
		System.out.println("Enter Last Name = " + "JOj");
		randomEmailId = RandomStringUtils.randomAlphabetic(8);
		randomEmailId = randomEmailId + "catch-all@eqanim-qa.wci-validate.org";
		storedEmailId.sendKeys(randomEmailId);
		System.out.println(randomEmailId);
		ObjectRepo.test.log(Status.PASS, randomEmailId);
		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys("Registrar");
		registarXpath.click();
		System.out.println("User role is selected");
	}

	public void clickOnSaveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		CommonLibref.click(saveButton, "javascriptClick", "saveButton");
		ObjectRepo.test.log(Status.PASS, "Steps : Click On Save button");
		System.out.println("");
		System.out.println("Steps : Click On Save button");
	}

	public void saveSucessMessageAfterSaveInitialUserdata() {
		wait.until(ExpectedConditions.visibilityOf(sucessMessageOfInitialUser));
		if (sucessMessageOfInitialUser.isDisplayed()) {
			String successsMessage = sucessMessageOfInitialUser.getText();
			// Assert.assertEquals(successsMessage, "Account Set Up Link has successfully
			// been resent.");
			ObjectRepo.test.log(Status.PASS, "Success message is displayed as -" + successsMessage);
			System.out.println("Success message is displayed as -" + successsMessage);

		} else {
			System.out.println("Assert Failed");
		}
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");

	}

	public void saveSucessMessageAfterInitialUserCreated() {
		wait.until(ExpectedConditions.visibilityOf(sucessMessageOfInitialUser));
		if (sucessMessageOfInitialUser.isDisplayed()) {
			String successsMessage = sucessMessageOfInitialUser.getText();
			Assert.assertEquals(successsMessage, "The user has been successfully assigned to the Jurisdiction.");
			ObjectRepo.test.log(Status.PASS, "Success message is displayed as -" + successsMessage);
			System.out.println("Success message is displayed as -" + successsMessage);

		} else {
			System.out.println("Assert Failed");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");

	}

	public void searchStoredRandomemailId() {
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
		searchFieldOnInitialUsers.click();
		searchFieldOnInitialUsers.sendKeys(randomEmailId);
		ObjectRepo.test.log(Status.PASS, randomEmailId + "is displayed");
		System.out.println(randomEmailId + "is displayed");
		quickActionsOnHomePage.click();
	}

	public void verifyTheRemoveOptionDisplayedOrNotInQuickActons() {
		if (removeUserOption.isEnabled()) {
			Assert.assertEquals(removeUserOption.isEnabled(), true);
			ObjectRepo.test.log(Status.PASS, "REMOVE USER option is enable");
			System.out.println("REMOVE USER option is enable");
		} else {
			Assert.assertEquals(removeUserOption.isEnabled(), false);
			ObjectRepo.test.log(Status.PASS, "REMOVE USER is not enable");
			System.out.println("REMOVE USER is not enable");

		}
	}

	public void clickOnRemoveButton() {
		wait.until(ExpectedConditions.elementToBeClickable(removeUserOption));
		CommonLibref.click(removeUserOption, "javascriptClick", "removeUserOption");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Remove user Option From DropDown");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(removeUserOption));
			CommonLibref.click(removeUserOption, "javascriptClick", "removeUserOption");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOntheFirstUserQuickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(firstQuickActions));
		if (firstQuickActions.isDisplayed()) {
			firstQuickActions.click();
		} else {
			driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]")).click();
		}
	}

	public void clickOnTheFirstQuickActionsOption() {
		wait.until(ExpectedConditions.elementToBeClickable(firstQuickActions));
		if (firstQuickActions.isDisplayed()) {
			Actions actions = new Actions(driver.get());
			actions.moveToElement(firstQuickActions).click(firstQuickActions).perform();
		} else {
			driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]")).click();
		}
	}

	public void assertRemoveMessage() {
		if (removeSuccessMessage.isDisplayed()) {
			String SuccessMessageValue = removeSuccessMessage.getText();
			Assert.assertEquals(SuccessMessageValue, "The user has successfully been removed.");
			System.out.println("Scuccess message display as - " + SuccessMessageValue);
			ObjectRepo.test.log(Status.PASS, "Scuccess message display as - " + SuccessMessageValue);
		} else {
			String SuccessMessageValue = removeSuccessMessage.getText();
			Assert.assertTrue("The user has successfully been removed.", true);
			System.out.println("Scuccess message display as - " + SuccessMessageValue);
			ObjectRepo.test.log(Status.PASS, "Scuccess message display as - " + SuccessMessageValue);

		}
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void verifyTheRemoveEmailIdResuable() {
		addFirstName.sendKeys("john");
		Text = storedFirstName.getAttribute("Value");
		System.out.println("Enter First Name is - " + Text);
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys("Stiffen");
		Text1 = storedLastName.getAttribute("Value");
		System.out.println(Text1);
		ObjectRepo.test.log(Status.PASS, "Step : Last Name is Added");
		System.out.println("*************************************************");
		System.out.println("Step :Verify the Email id of Removed user");
		ObjectRepo.test.log(Status.PASS, "Step :Verify the Email id of Removed user");
		storedEmailId.sendKeys(randomEmailId);
		ObjectRepo.test.log(Status.PASS, "Email id is removed from System and should be able to reuse.");
		System.out.println("Email id is removed from System and should be able to reuse.");

		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys("Registrar");
		registarXpath.click();
		System.out.println("User role is selected");
	}

	public void verifyThaOldLinkNotAccessibleForRemoverUser(String Email, String Password, String Username) {
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
		wait.until(ExpectedConditions.visibilityOf(linkNoLongarValidText));
		System.out.println("Error message should look like" + linkNoLongarValidText);
		ObjectRepo.test.log(Status.PASS, "Error message should look like" + linkNoLongarValidText);
		Assert.assertTrue("This link is no longer valid.", true);
	}

	public void ClickOnRemoveUserInQuickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(removeUserOption));
		CommonLibref.click(removeUserOption, "javascriptClick", "removeUserOption");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Remove user Option From DropDown");
		System.out.println("Click on Remove user Option From DropDown");

	}

	public void VerifyQuickActionsOptionsForActiveUserOnManageInitialUserPage() {
		if (resendSetUpLinkXpath.isSelected() != false) {
			System.out.println("RESEND ACCOUNT SET UP LINK is enable");
			ObjectRepo.test.log(Status.PASS, "RESEND ACCOUNT SET UP LINK is enable");
			Assert.assertTrue(false);
		} else {
			System.out.println("RESEND ACCOUNT SET UP LINK option is disable");
			ObjectRepo.test.log(Status.PASS, "RESEND ACCOUNT SET UP LINK option is disable");
			Assert.assertTrue(true);
		}

		if (editOption.isSelected() != true) {
			System.out.println("EDIT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT option is disable");
			Assert.assertTrue(true);
		} else {
			System.out.println("EDIT option is disable");
			ObjectRepo.test.log(Status.PASS, "EDIT option is enable");
			Assert.assertTrue(true);
		}

		if (removeUserOption.isSelected() != false) {
			System.out.println("REMOVE USER option is enable");
			ObjectRepo.test.log(Status.PASS, "REMOVE USER option is enable");
			Assert.assertTrue(false);
		} else {
			System.out.println("REMOVE USER option is disable");
			ObjectRepo.test.log(Status.PASS, "REMOVE USER option is disable");
			Assert.assertTrue(true);
		}

		if (deactivateOption.isSelected() != false) {
			System.out.println("DEACTIVATE option is enable");
			ObjectRepo.test.log(Status.PASS, "DEACTIVATE option is enable");
			Assert.assertTrue(false);
		} else {
			System.out.println("DEACTIVATE option is disable");
			ObjectRepo.test.log(Status.PASS, "DEACTIVATE option is disable");
			Assert.assertTrue(true);
		}
		if (unblockedPermanentalyLockOption.isSelected() != false) {
			System.out.println("UNLOCK PERMANENTLY LOCKED USER option is enable");
			ObjectRepo.test.log(Status.PASS, "UNLOCK PERMANENTLY LOCKED USER option is enable");
			Assert.assertTrue(false);
		} else {
			System.out.println("UNLOCK PERMANENTLY LOCKED USER option is disable");
			ObjectRepo.test.log(Status.PASS, "UNLOCK PERMANENTLY LOCKED USER option is disable");
			Assert.assertTrue(true);
		}
		if (activateOption.isSelected() != true) {
			System.out.println("ACTIVATE option is enable");
			ObjectRepo.test.log(Status.PASS, "ACTIVATE option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("ACTIVATE option is disable");
			ObjectRepo.test.log(Status.PASS, "ACTIVATE option is disable");
			Assert.assertTrue(false);
		}

	}

//	public void verifyTheQuickActionsOptionForInActiveUserOnManageInitialUserPage() {
//		if (resendSetUpLinkXpath.isSelected() != false) {
//			System.out.println("RESEND ACCOUNT SET UP LINK is enable");
//			ObjectRepo.test.log(Status.PASS, "RESEND ACCOUNT SET UP LINK is enable");
//			Assert.assertTrue(false);
//		} else {
//			System.out.println("RESEND ACCOUNT SET UP LINK option is disable");
//			ObjectRepo.test.log(Status.PASS, "RESEND ACCOUNT SET UP LINK option is disable");
//			Assert.assertTrue(true);
//		}
//
//		if (editOption.isSelected() != true) {
//			System.out.println("EDIT option is enable");
//			ObjectRepo.test.log(Status.PASS, "EDIT option is disable");
//			Assert.assertTrue(true);
//		} else {
//			System.out.println("EDIT option is disable");
//			ObjectRepo.test.log(Status.PASS, "EDIT option is enable");
//			Assert.assertTrue(true);
//		}
//
//		if (removeUserOption.isSelected() != false) {
//			System.out.println("REMOVE USER option is enable");
//			ObjectRepo.test.log(Status.PASS, "REMOVE USER option is enable");
//			Assert.assertTrue(false);
//		} else {
//			System.out.println("REMOVE USER option is disable");
//			ObjectRepo.test.log(Status.PASS, "REMOVE USER option is disable");
//			Assert.assertTrue(true);
//		}
//
//		if (deactivateOption.isSelected() != true) {
//			System.out.println("DEACTIVATE option is enable");
//			ObjectRepo.test.log(Status.PASS, "DEACTIVATE option is enable");
//			Assert.assertTrue(true);
//		} else {
//			System.out.println("DEACTIVATE option is disable");
//			ObjectRepo.test.log(Status.PASS, "DEACTIVATE option is disable");
//			Assert.assertTrue(false);
//		}
//		if (unblockedPermanentalyLockOption.isSelected() != false) {
//			System.out.println("UNLOCK PERMANENTLY LOCKED USER option is enable");
//			ObjectRepo.test.log(Status.PASS, "UNLOCK PERMANENTLY LOCKED USER option is enable");
//			Assert.assertTrue(false);
//		} else {
//			System.out.println("UNLOCK PERMANENTLY LOCKED USER option is disable");
//			ObjectRepo.test.log(Status.PASS, "UNLOCK PERMANENTLY LOCKED USER option is disable");
//			Assert.assertTrue(true);
//		}
//		if (activateOption.isSelected() != false) {
//			System.out.println("ACTIVATE option is enable");
//			ObjectRepo.test.log(Status.PASS, "ACTIVATE option is enable");
//			Assert.assertTrue(false);
//		} else {
//			System.out.println("ACTIVATE option is disable");
//			ObjectRepo.test.log(Status.PASS, "ACTIVATE option is disable");
//			Assert.assertTrue(true);
//		}
//	}
	public void verifyElementState(WebElement element, String elementName, boolean expectedState) {
		boolean isEnabled = element.isEnabled();
		String state = expectedState ? "enabled" : "disabled";

		if (isEnabled == expectedState) {
			System.out.println(elementName + " option is " + state);
			ObjectRepo.test.log(Status.PASS, elementName + " option is " + state);
			Assert.assertTrue(true);
		} else {
			System.out.println(elementName + " option is not " + state);
			ObjectRepo.test.log(Status.FAIL, elementName + " option is not " + state);
			Assert.assertTrue(false);
		}
	}

	public void verifyTheQuickActionsOptionForInActiveUserOnManageInitialUserPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1pr732m')]"));
		List<WebElement> List1 = driver.get()
				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));
		int size = List.size();
		int size1 = List1.size();
		System.out.println("No of disable option :" + size);
		System.out.println("No of enable option :" + size1);

		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			System.out.println("No of disable option :" + element);
			ObjectRepo.test.log(Status.PASS, "No of disable option :" + element);
		}
		for (int i = 0; i < List1.size(); i++) {
			String element1 = List1.get(i).getText();
			System.out.println("No of enable option :" + element1);
			ObjectRepo.test.log(Status.PASS, "No of enable option :" + element1);
		}
	}

	public void SearchInactiveUserAndclickOnActivateOption() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
		searchFieldOnInitialUsers.click();
		searchFieldOnInitialUsers.sendKeys(Keys.CONTROL, "a");
		searchFieldOnInitialUsers.sendKeys(Keys.BACK_SPACE);
		searchFieldOnInitialUsers.sendKeys("Inactive");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOntheFirstUserQuickActions();

		if (inactiveTitle.isDisplayed()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ClickOnActivateOptionOnInitialUserPage();

			String CANCEL = cancelBTNOnInitialPage.getText();
			Assert.assertEquals(CANCEL, "CANCEL");

			String CONTINUE = continueBTNOnWarningPopup.getText();
			Assert.assertEquals(CONTINUE, "CONTINUE");
			System.out.println("Confirmation pop-up is displayed with Continue and Cancel button.");
			ObjectRepo.test.log(Status.PASS, "Confirmation pop-up is displayed with Continue and Cancel button.");
		} else {
			System.out.println("Deactivate Option is displayed");
		}

	}

	public void ClickOnActivateOptionOnInitialUserPage() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(activateOption));
			Actions action = new Actions(driver.get());
			action.moveToElement(activateOption).click(activateOption).build().perform();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on Activate Option.");
			System.out.println("Steps:Click on Activate Option.");

		} catch (NoSuchElementException e) {
			wait.until(ExpectedConditions.elementToBeClickable(activateOption));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", activateOption);
			ObjectRepo.test.log(Status.PASS, "Steps:Click on Activate Option.");
			System.out.println("Steps:Click on Activate Option.");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("//p[text()='ACTIVATE']')")).click();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on Activate Option.");
			System.out.println("Steps:Click on Activate Option.");
		}
	}

	public void verifyTheActivateUserSucessMessage() {
		wait.until(ExpectedConditions.visibilityOf(sucessMessageActivateUser));
		String sucessMessage = sucessMessageActivateUser.getText();
//			Assert.assertEquals(sucessMessage,"Account status is changed to Active. The user can login to the system.");
		System.out.println("Success message is displayed as- " + sucessMessage);
		ObjectRepo.test.log(Status.PASS, "Success message is displayed as- " + sucessMessage);

		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "javascriptClick", "crossIcon");
	}

	public void verifyTheEmailAfterUserActivate() {
		driver.get().navigate().to("https://yopmail.com/en/");
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(Keys.CONTROL, "a");
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(Keys.BACK_SPACE);
		driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys("jRvvSuKy@yopmail.com");
		driver.get().findElement(By.xpath("//*[@id='refreshbut']/button/i")).click();
		WebElement frame1 = driver.get().findElement(By.xpath("//iframe[@id='ifinbox']"));

		driver.get().switchTo().frame(frame1);
		CommonLibref.click(removeLink, "javascriptClick", "removeLink");
		driver.get().switchTo().defaultContent();
		WebElement frame2 = driver.get().findElement(By.xpath("//iframe[@id='ifmail']"));
		driver.get().switchTo().frame(frame2);

	}

	public void verifyTheValidationForJurisdictionNamefield() {
		wait.until(ExpectedConditions.elementToBeClickable(headingOfThePage));
		String informationCard = headingOfThePage.getText();
		System.out.println(informationCard + " - is display");
		ObjectRepo.test.log(Status.PASS, informationCard + " - is display");
		Assert.assertEquals(informationCard, "Set Up New Jurisdiction");

		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionName));
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		enterJurisdictionName.sendKeys(Keys.TAB);
//		CommonLibref.click(jurisdictionCodeTitle, "seleniumClick", "jurisdictionCodeTitle");
		System.out.println("Step: Click on the Jurisdiction Name field and then click outside");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on the Jurisdiction Name field and then click outside");
		String nameRequired = nameIsRequiredForJurisdiction.getText();
		Assert.assertEquals(nameRequired, "Jurisdiction Name is required");
		System.out.println("Error message is display - " + nameRequired);
		ObjectRepo.test.log(Status.PASS, "Error message is display - " + nameRequired);

		System.out.println("********************************************");
		System.out.println("Enter more than 50 characters");
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		enterJurisdictionName.sendKeys("Character Counter is a 100% free online character count\n"
				+ " calculator that's simple to use. Sometimes users prefer simplicity over\n"
				+ " all of the detailed writing information Word Counter provides, and this is exactly what this tool offers.\n"
				+ " It displays character count and word count which is often the only ");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter more than 50 characters");
		String errorMessage = errorMessageOnJurisdictionName.getText();
		Assert.assertEquals(errorMessage, "Jurisdiction Name must not be more than 50 characters");
		System.out.println("Error message is display- " + errorMessage);
		ObjectRepo.test.log(Status.PASS, "Error message is display- " + errorMessage);

		System.out.println("********************************************");
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		enterJurisdictionName.sendKeys(Keys.CONTROL, "a");
		enterJurisdictionName.sendKeys(Keys.BACK_SPACE);
		enterJurisdictionName.sendKeys("SV");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter less than 3 characters");
		System.out.println("Enter less than 3 characters");
		String lessThan3Char = errorMessageOnJurisdictionName.getText();
		Assert.assertEquals(lessThan3Char, "Jurisdiction Name must not be less than 3 characters");
		ObjectRepo.test.log(Status.PASS, "Error message is display- " + lessThan3Char);
		System.out.println("Error message is display- " + lessThan3Char);

		System.out.println("********************************************");
		ObjectRepo.test.log(Status.PASS,
				"Steps: Enter numbers and special characters at the start of the jurisdiction name field");
		System.out.println("Enter numbers and special characters at the start of the jurisdiction name field");
		CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
		enterJurisdictionName.sendKeys(Keys.CONTROL, "a");
		enterJurisdictionName.sendKeys(Keys.BACK_SPACE);
		enterJurisdictionName.sendKeys("nh12357@#$%^&()");
		String jurisdictionName = enterJurisdictionName.getAttribute("Value");
		ObjectRepo.test.log(Status.PASS, "Data is accepted and display like -  " + jurisdictionName);
		System.out.println("Data is accepted and display like - " + jurisdictionName);
		System.out.println("********************************************");
		ObjectRepo.test.log(Status.PASS,
				"Steps: Enter valid data in Jurisdiction Name field and observe Jurisdiction Name");
		System.out.println("Steps: Enter valid data in Jurisdiction Name field and observe Jurisdiction Name");

		String randomJurisdictionName = RandomStringUtils.randomNumeric(5);
		String Name = "New Jurisdiction" + randomJurisdictionName;
		enterJurisdictionName.sendKeys(Keys.CONTROL, "a");
		enterJurisdictionName.sendKeys(Keys.BACK_SPACE);
		enterJurisdictionName.sendKeys(Name);
		ObjectRepo.test.log(Status.PASS, "Data is accepted and display like -  " + Name);
		System.out.println("Data is accepted and display like -  " + Name);

	}

	public void verifyTheValidationForJurisdictionCode() {
		String informationCard = headingOfThePage.getText();
		System.out.println(informationCard + " - title is display");
		ObjectRepo.test.log(Status.PASS, informationCard + " - title is display");
		System.out.println("********************************************");
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionCode));
		System.out.println("Step: Click on the Jurisdiction Code field and then click outside");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on the Jurisdiction Code field and then click outside");
		CommonLibref.click(enterJurisdictionCode, "seleniumClick", "enterJurisdictionCode");
		enterJurisdictionCode.sendKeys(Keys.TAB);
		String nameRequired = errorForJurisdictionCode.getText();
//		Assert.assertEquals(nameRequired, "Jurisdiction Code is required");
		System.out.println("Error message is display -" + nameRequired);
		ObjectRepo.test.log(Status.PASS, " Error message is display as" + nameRequired);

		System.out.println("********************************************");
		System.out.println("Enter numerical or special characters at the start of the jurisdiction code field");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter numerical or special characters at the start of the jurisdiction code field");
		CommonLibref.click(enterJurisdictionCode, "javascriptClick", "enterJurisdictionCode");
		enterJurisdictionCode.sendKeys("1@#");
		String invalidCode = errorForJurisdictionCode.getText();
		Assert.assertEquals(invalidCode, "Invalid Jurisdiction Code");
		System.out.println("Error message is display -" + invalidCode);
		ObjectRepo.test.log(Status.PASS, "Error message is display -" + invalidCode);

		System.out.println("********************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter more than 3 characters in the jurisdiction code field");
		System.out.println("Step: Enter more than 3 characters in the jurisdiction code field");
		CommonLibref.click(enterJurisdictionCode, "javascriptClick", "enterJurisdictionCode");
		enterJurisdictionCode.sendKeys(Keys.CONTROL, "a");
		enterJurisdictionCode.sendKeys(Keys.BACK_SPACE);
		enterJurisdictionCode.sendKeys("TEST");
		String moreThan3Char = errorForJurisdictionCode.getText();
		Assert.assertEquals(moreThan3Char, "Jurisdiction Code must not be more than 3 characters");
		ObjectRepo.test.log(Status.PASS, "Error message is display -" + moreThan3Char);
		System.out.println("Error message is display -" + moreThan3Char);

		System.out.println("********************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter 3 characters in the jurisdiction code field");
		System.out.println("Enter 3 characters in the jurisdiction code field");
		CommonLibref.click(enterJurisdictionCode, "javascriptClick", "enterJurisdictionCode");
		enterJurisdictionCode.sendKeys(Keys.CONTROL, "a");
		enterJurisdictionCode.sendKeys(Keys.BACK_SPACE);
		String s = RandomStringUtils.randomAlphabetic(3);
		String code = s.toUpperCase();
		enterJurisdictionCode.sendKeys(code);
		String jurisdictionCode = enterJurisdictionCode.getAttribute("Value");
		ObjectRepo.test.log(Status.PASS, "Data is accepted and Display like - " + jurisdictionCode);
		System.out.println("Data is accepted and Display like - " + jurisdictionCode);

	}

	public void verifyTheValidationForAddressLine() {
		contactInformationCard = contactInformationHeading.getText();
		Assert.assertEquals(contactInformationCard, "Contact Information");
		ObjectRepo.test.log(Status.PASS, "Contact Information card is displayed");
		System.out.println("Contact Information card is displayed");

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter more than 255 characters in address(line 1,2)and city");
		System.out.println("Enter more than 255 characters in addressline ");
		CommonLibref.click(addAddress1, "seleniumClick", "addAddress1");
		addAddress1.sendKeys(
				"Character Counter is a 100% free online character count calculator that's simple to use. + \n"
						+ "Sometimes users prefer simplicity over all of the detailed writing information Word Counter provides, and \n"
						+ "this is exactly what this tool offers. It displays character count and word count which is often the only ");
		System.out.println("Character Counter is a 100% free online character count calculator that's simple to use. "
				+ "Sometimes users prefer simplicity over all of the detailed writing information Word Counter provides, "
				+ "and this is exactly what this tool offers. It displays character count and word count which is often the only ");
		ObjectRepo.test.log(Status.PASS,
				"Character Counter is a 100% free online character count calculator that's simple to use. \n"
						+ "				+ \"Sometimes users prefer simplicity over all of the detailed writing information Word Counter provides, \n"
						+ "				+ \"and this is exactly what this tool offers. It displays character count and word count which is often the only ");

		String moreThan255Char = enterMoreThan255CharInAddressLine.getText();
		Assert.assertEquals(moreThan255Char, "Address Line 1 must not be more than 255 characters");
		System.out.println("Error message is display like - " + moreThan255Char);
		ObjectRepo.test.log(Status.PASS, "Error message is display like - " + moreThan255Char);

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter accentuated characters in the address(line 1,2)");
		System.out.println("Enter accentuated characters in the address(line 1,2)");
		CommonLibref.click(addAddress1, "seleniumClick", "addAddress1");
		addAddress1.sendKeys(Keys.CONTROL, "a");
		addAddress1.sendKeys(Keys.BACK_SPACE);
		addAddress1.sendKeys("~g`jli`");
		String addValue1 = addAddress1.getAttribute("Value");
		System.out.println(addValue1);
		System.out.println("Entered data is accepted and display like - " + addValue1
				+ "and error message should not get displayed ");
		ObjectRepo.test.log(Status.PASS, "Entered data is accepted and display like - " + addValue1
				+ "and error message should not get displayed ");
		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter special characters in address(line 1,2)");
		System.out.println("Enter special characters in address(line 1,2)");
		CommonLibref.click(addAddress1, "seleniumClick", "addAddress1");
		addAddress1.sendKeys(Keys.CONTROL, "a");
		addAddress1.sendKeys(Keys.BACK_SPACE);
		addAddress1.sendKeys("!@#$^$%^&*(()_");
		String addValue2 = addAddress1.getAttribute("Value");
		System.out.println(addValue2);
		System.out.println("Entered data is accepted and display like - " + addValue2
				+ " and error message should not get displayed");
		ObjectRepo.test.log(Status.PASS, "Entered data is accepted and display like - " + addValue2
				+ " and error message should not get displayed");
		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter Valid data in address(line 1,2)");
		System.out.println("Enter Valid data in address(line 1,2)");
		CommonLibref.click(addAddress1, "seleniumClick", "addAddress1");
		addAddress1.sendKeys(Keys.CONTROL, "a");
		addAddress1.sendKeys(Keys.BACK_SPACE);
		addAddress1.sendKeys("Street1");
		String addValue3 = addAddress1.getAttribute("Value");
		System.out.println(addValue3);
		System.out.println(
				"Entered data is accepted and display like - " + addValue3 + " and error message is not displayed");
		ObjectRepo.test.log(Status.PASS,
				"Entered data is accepted and display like - " + addValue3 + " and error message is not displayed");
	}

	public void verifyTheValidationForCityFiled() {
		wait.until(ExpectedConditions.elementToBeClickable(contactInformationHeading));
		contactInformationCard = contactInformationHeading.getText();
		Assert.assertEquals(contactInformationCard, "Contact Information");
		ObjectRepo.test.log(Status.PASS, "Contact Information card is displayed");
		System.out.println("Contact Information card is displayed");

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter more than 255 characters in City");
		System.out.println("Enter more than 255 characters in City ");
		wait.until(ExpectedConditions.elementToBeClickable(addCity));
		CommonLibref.click(addCity, "seleniumClick", "addCity");
		addCity.sendKeys("Character Counter is a 100% free online character count calculator that's simple to use. + \n"
				+ "Sometimes users prefer simplicity over all of the detailed writing information Word Counter provides, and \n"
				+ "this is exactly what this tool offers. It displays character count and word count which is often the only ");
		System.out.println("Character Counter is a 100% free online character count calculator that's simple to use. "
				+ "Sometimes users prefer simplicity over all of the detailed writing information Word Counter provides, "
				+ "and this is exactly what this tool offers. It displays character count and word count which is often the only ");
		ObjectRepo.test.log(Status.PASS,
				"Character Counter is a 100% free online character count calculator that's simple to use. \n"
						+ "				+ \"Sometimes users prefer simplicity over all of the detailed writing information Word Counter provides, \n"
						+ "				+ \"and this is exactly what this tool offers. It displays character count and word count which is often the only ");
		wait.until(ExpectedConditions.elementToBeClickable(errorMessageForCity));
		String moreThan255Char = errorMessageForCity.getText();
		Assert.assertEquals(moreThan255Char, "City must not be more than 255 characters");
		System.out.println("Error message displayed like:" + moreThan255Char);
		ObjectRepo.test.log(Status.PASS, "Error message displayed like:" + moreThan255Char);

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter accentuated characters in the City");
		System.out.println("Enter accentuated characters in the City");
		wait.until(ExpectedConditions.elementToBeClickable(addCity));
		CommonLibref.click(addCity, "seleniumClick", "addCity");
		addCity.sendKeys(Keys.CONTROL, "a");
		addCity.sendKeys(Keys.BACK_SPACE);
		addCity.sendKeys("~g`jli`");
		String addValue1 = addCity.getAttribute("Value");
		System.out.println(addValue1);
		System.out.println("Entered data is accepted and error message is not displayed");
		ObjectRepo.test.log(Status.PASS, "Entered data is accepted and error message is not displayed");

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter special characters in City");
		System.out.println("Enter special characters in City");
		CommonLibref.click(addCity, "seleniumClick", "addCity");
		addCity.sendKeys(Keys.CONTROL, "a");
		addCity.sendKeys(Keys.BACK_SPACE);
		addCity.sendKeys("!@#$^$%^&*(()_");
		String addValue2 = addCity.getAttribute("Value");
		System.out.println(addValue2);
		System.out.println("Entered data is accepted and error message is not displayed");
		ObjectRepo.test.log(Status.PASS, "Entered data is accepted and error message is not displayed");

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter Valid data in City");
		System.out.println("Enter Valid data in City");
		CommonLibref.click(addCity, "seleniumClick", "addCity");
		addCity.sendKeys(Keys.CONTROL, "a");
		addCity.sendKeys(Keys.BACK_SPACE);
		addCity.sendKeys("Street1");
		String addValue3 = addCity.getAttribute("Value");
		System.out.println(addValue3);
		System.out.println("Entered data is accepted and error message is not displayed");
		ObjectRepo.test.log(Status.PASS, "Entered data is accepted and error message is not displayed");
	}

	public void verifyTheValidationForzipCode() {
		System.out.println("Step:Enter less than 3 characters in Zip code field.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter less than 3 characters in Zip code field.");
		CommonLibref.click(zipCode, "seleniumClick", "zipCode");
		zipCode.sendKeys("14");
		zipCodeOnJurisdicitonPage = zipCode.getAttribute("Value");
		String error = errorMessageForZipCode.getText();
		Assert.assertEquals(error, "Zip Code must not be less than 3 characters");
		System.out.println("Error Message is displayed like - " + error);
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed like - " + error);

		System.out.println("*****************************************************");

		System.out.println("Enter more than 20 characters in zip code field");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 20 characters in zip code field");
		CommonLibref.click(zipCode, "seleniumClick", "zipCode");
		zipCode.sendKeys("14128645555555555555555555555555555");
		zipCodeOnJurisdicitonPage = zipCode.getAttribute("Value");
		String error1 = errorMessageForZipCode.getText();
		Assert.assertEquals(error1, "Zip Code must not be more than 20 characters");
		System.out.println("Step:Error Message is displayed like - " + error1);
		ObjectRepo.test.log(Status.PASS, "Step: Error Message is displayed like - " + error1);
	}

	public void verifyTheValidationForLanguageField() {
		System.out.println("Step:Enter invalid character in the Language and currency field");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid character in the Language and currency field");
		wait.until(ExpectedConditions.visibilityOf(addLanguageOnSetUpJurisdiction));
		CommonLibref.click(addLanguageOnSetUpJurisdiction, "javascriptClick", "addLanguageOnSetUpJurisdiction");
		addLanguageOnSetUpJurisdiction.sendKeys("enl");
		String invalidLang = addLanguageOnSetUpJurisdiction.getAttribute("value");
		System.out.println(invalidLang);
		ObjectRepo.test.log(Status.PASS, invalidLang);

		System.out.println("Search results is not displayed");
		ObjectRepo.test.log(Status.PASS, "Search results is not displayed");

		System.out.println("*****************************************************");
		System.out.println("Step:Enter valid three character in the Language and currency field");
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid three character in the Language and currency field");
		wait.until(ExpectedConditions.visibilityOf(addLanguageOnSetUpJurisdiction));
		CommonLibref.click(addLanguageOnSetUpJurisdiction, "javascriptClick", "addLanguageOnSetUpJurisdiction");
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.CONTROL, "a");
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.BACK_SPACE);
		addLanguageOnSetUpJurisdiction.sendKeys("English - System default language");
		String validLang = addLanguageOnSetUpJurisdiction.getAttribute("value");
		System.out.println(validLang);
		ObjectRepo.test.log(Status.PASS, validLang);
		wait.until(ExpectedConditions.visibilityOf(xPathPurchaseLimitText));
		CommonLibref.scroll(xPathPurchaseLimitText, "scrollToBottomOFPage", "xPathPurchaseLimitText");
		System.out.println("Search results is displayed and containing search character");
		ObjectRepo.test.log(Status.PASS, "Search results is displayed and containing search character");

	}

	public void verifyTheFunctionalityForLanguage() {

		CommonLibref.scroll(languageAndCurrencyHeading, "scrollToElement", "languageAndCurrencyHeading");
		wait.until(ExpectedConditions.visibilityOf(languageAndCurrencyHeading));

		String actualText = languageAndCurrencyHeading.getText();
		Assert.assertEquals(actualText, "Language and Currency");
		System.out.println("Click on Language dropdown and click outside");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Language dropdown and click outside");
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.TAB);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(languageRequiredErrorMessage));
		String requiredlanguageError = languageRequiredErrorMessage.getText();
		Assert.assertEquals(requiredlanguageError, "Language is required");
		System.out.println("Error message is display- " + requiredlanguageError);
		ObjectRepo.test.log(Status.PASS, "Error message is display- " + requiredlanguageError);

		System.out.println("**************************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Select one language from language dropdown");
		System.out.println("Select one language from language dropdown");
		CommonLibref.click(addLanguageOnSetUpJurisdiction, "javascriptClick", "addLanguageOnSetUpJurisdiction");
		addLanguageOnSetUpJurisdiction.sendKeys("English - System default language");
		addLanguageOnSetUpJurisdiction.sendKeys(Keys.ENTER);
		String englishLang1 = seecteEnglishdLanguage.getText();
		System.out.println(englishLang1);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");
		ObjectRepo.test.log(Status.PASS, englishLang1 + "" + " single language is selected");
		System.out.println(englishLang1 + "" + " single language is selected");

		System.out.println("**************************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Select multiple languages from language  dropdown");
		System.out.println("Select multiple languages from language  dropdown");

		CommonLibref.click(languageFieldXpath, "javascriptClick", "languageFieldXpath");
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");
		String spanishLang = seecteSpanishLanguage.getText();
		System.out.println(spanishLang);
		ObjectRepo.test.log(Status.PASS, spanishLang);

		CommonLibref.click(languageFieldXpath, "javascriptClick", "languageFieldXpath");
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		CommonLibref.click(languageFieldXpath, "javascriptClick", "languageFieldXpath");
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		CommonLibref.click(languageFieldXpath, "javascriptClick", "languageFieldXpath");
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		String testerLang = selecteTesterLanguage.getText();
		System.out.println(testerLang);
		ObjectRepo.test.log(Status.PASS, testerLang);

		String frechTestLang = selecteFrenchTestLanguage.getText();
		System.out.println(frechTestLang);
		ObjectRepo.test.log(Status.PASS, frechTestLang);

		String frenchLang = selecteFrenchLanguage.getText();
		System.out.println(frenchLang);
		ObjectRepo.test.log(Status.PASS, frenchLang);

		ObjectRepo.test.log(Status.PASS, "Multiple languages upto 5 is selected and be seperated by comma.");
		System.out.println("Multiple languages upto 5 is selected and be seperated by comma.");
	}

	public void verifyTheValidatonForcurrency() {
		CommonLibref.scroll(cancelButton, "scrollToBottomOFPage", "cancelButton");
		String actualText = languageAndCurrencyHeading.getText();
		Assert.assertEquals(actualText, "Language and Currency");

		wait.until(ExpectedConditions.elementToBeClickable(addCurrencyOnSetUpJurisdiction));

		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.TAB);
		String requiredCurrencyError = currencyRequiredErrorMessage.getText();
		Assert.assertEquals(requiredCurrencyError, "Currency is required");
		System.out.println("Error message is display- " + requiredCurrencyError);
		ObjectRepo.test.log(Status.PASS, "Error message is display- " + requiredCurrencyError);

		System.out.println("**************************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Select one currency from currency dropdown");
		System.out.println("Steps: Select one currency from currency dropdown");
		CommonLibref.click(addCurrencyOnSetUpJurisdiction, "javascriptClick", "addCurrencyOnSetUpJurisdiction");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.visibilityOf(seecteUSDCurrency));
		String currencyUSD = seecteUSDCurrency.getText();
		System.out.println(currencyUSD);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");
		ObjectRepo.test.log(Status.PASS, currencyUSD);
		System.out.println("Currency is Selected");

		System.out.println("**************************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Select multiple currencies from currency dropdown");
		System.out.println("Select multiple currencies from currency dropdown");

		CommonLibref.click(currencyTextFieldXpath, "javascriptClick", "currencyTextFieldXpath");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		currencyTextFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		CommonLibref.click(currencyTextFieldXpath, "javascriptClick", "currencyTextFieldXpath");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		currencyTextFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		CommonLibref.click(currencyTextFieldXpath, "javascriptClick", "currencyTextFieldXpath");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		currencyTextFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		CommonLibref.click(currencyTextFieldXpath, "javascriptClick", "currencyTextFieldXpath");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		currencyTextFieldXpath.sendKeys(Keys.ENTER);
		CommonLibref.click(languageAndCurrencyHeading, "seleniumClick", "languageAndCurrencyHeading");

		ObjectRepo.test.log(Status.PASS, "Multiple currencies upto 5 is selected and be seperated by comma.");
		System.out.println("Multiple currencies upto 5 is selected and be seperated by comma.");
	}

	public void verifyTheCountryFieldIssearchable() {
		contactInformationCard = contactInformationHeading.getText();
		Assert.assertEquals(contactInformationCard, "Contact Information");
		ObjectRepo.test.log(Status.PASS, "Contact Information card is displayed");
		System.out.println("Contact Information card is displayed");
		System.out.println("**************************************************************");
		System.out.println("Step: Enter invalid character in Country and State/Province field");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid character in Country and State/Province field");

		CommonLibref.click(addCountry, "javascriptClick", "addCountry");
		addCountry.sendKeys("unt");
		String value = valueInCountryField.getAttribute("value");
		System.out.println(value);
		System.out.println("Search results is not display");
		ObjectRepo.test.log(Status.PASS, "Search results is not display");

		System.out.println("**************************************************************");
		System.out.println("Steps:Enter valid three character in Country and State/Province field");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter valid three character in Country and State/Province field");
		CommonLibref.click(addCountry, "javascriptClick", "addCountry");
		addCountry.sendKeys(Keys.CONTROL, "a");
		addCountry.sendKeys(Keys.BACK_SPACE);
		addCountry.sendKeys("Uni");
		addCountry.sendKeys(Keys.ENTER);
		String value1 = valueInCountryField.getAttribute("value");
		System.out.println(value1);
		System.out.println("Search results is display in containing search character");
		ObjectRepo.test.log(Status.PASS, "Search results is display in containing search character");

	}

	public void verifyTheCountryAndStateProvinceDropdownFieldForUnitedState() {

		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", languageAndCurrencyHeading);

		System.out.println("Select the country US or Canada");
		ObjectRepo.test.log(Status.PASS, "Steps:Select the country US or Canada");
		CommonLibref.click(addCountry, "javascriptClick", "addCountry");
		addCountry.sendKeys(Keys.CONTROL, "a");
		addCountry.sendKeys(Keys.BACK_SPACE);
		addCountry.sendKeys("Afghanistan");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addCountry.sendKeys(Keys.ENTER);
		String value = valueInCountryField.getAttribute("value");
		System.out.println(value);
		System.out.println("**************************************************************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(stateAndProvincetitle));
		String text = stateAndProvincetitle.getText();
		System.out.println("If (Us or Canada) Country is selected" + " " + text + " " + "dropdown is displayed.");
		ObjectRepo.test.log(Status.PASS,
				"If (Us or Canada) Country is selected" + " " + text + " " + "dropdown is displayed.");

	}

	public void VerifyTheCountryAndStateProvinceFieldForCanada() {// (hold)
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", languageAndCurrencyHeading);

		System.out.println("Select the country other than US or Canada.");
		ObjectRepo.test.log(Status.PASS, "Steps:Select the country other than US or Canada.");
		CommonLibref.click(addCountry, "javascriptClick", "addCountry");
		addCountry.sendKeys(Keys.CONTROL, "a");
		addCountry.sendKeys(Keys.BACK_SPACE);
		addCountry.sendKeys("Canada");
		addCountry.sendKeys(Keys.ENTER);

		String value = valueInCountryField.getAttribute("value");
		System.out.println(value);
		System.out.println("If (Us or Canada) Country is selected and state and province dropdown is displayed.");
		ObjectRepo.test.log(Status.PASS,
				"If (Us or Canada) Country is selected and state and province dropdown is displayed.");

		System.out.println("**************************************************************");

		System.out.println("Select the state/province");
		ObjectRepo.test.log(Status.PASS, "Select the state/province");
		CommonLibref.click(stateAndProvinceField, "seleniumClick", "stateAndProvinceField");
		stateAndProvinceField.sendKeys("Alabama");
		stateAndProvinceField.sendKeys(Keys.ENTER);
		System.out.println("State/province is selected from dropdown");
		ObjectRepo.test.log(Status.PASS, "State/province is selected from dropdown");
	}

	public void clickOnEditButton() {

		CommonLibref.click(editOption, "seleniumClick", "editOption");
		System.out.println("Click on Edit Button");
		ObjectRepo.test.log(Status.PASS, "Click on Edit Button");
		System.out.println("********************************************************");
		String assertTitle = editRoleTitle.getText();
		System.out.println(assertTitle + "Edit Role");
		System.out.println("Title is display -" + assertTitle);
		ObjectRepo.test.log(Status.PASS, "Title is display -" + assertTitle);
		String firstNameValue = storedFirstName.getAttribute("Value");
		System.out.println("First name is display -" + firstNameValue);
		ObjectRepo.test.log(Status.PASS, firstNameValue);

		wait.until(ExpectedConditions.elementToBeClickable(storedLastName));
		String lastNamevalue = storedLastName.getAttribute("Value");
		System.out.println("Last name is display -" + lastNamevalue);
		ObjectRepo.test.log(Status.PASS, lastNamevalue);

		wait.until(ExpectedConditions.elementToBeClickable(storedEmailId));
		String emailAddressValue = storedEmailId.getAttribute("value");
		System.out.println("Email Address is display - " + emailAddressValue);
		ObjectRepo.test.log(Status.PASS, "Email Address is display - " + emailAddressValue);

		wait.until(ExpectedConditions.visibilityOf(storedRole));
		String preFilledRolevalue = storedRole.getAttribute("value");
		System.out.println("Role is display - " + preFilledRolevalue);
		ObjectRepo.test.log(Status.PASS, "Role is display - " + preFilledRolevalue);
	}

	public void clickOnEditButtonAndEditData() {
		System.out.println("********************************************************");
		Common.pageLoader();
		System.out.println("After Editing the Value is displayed as");
		ObjectRepo.test.log(Status.PASS, "After Editing the Value is displayed as");
		String actualText = editRoleHeadline.getText();
		Assert.assertEquals(actualText, "Edit Role");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		String s = RandomStringUtils.randomAlphabetic(6);
		addFirstName.sendKeys(s);
		Text = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + Text);
		CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		String s1 = RandomStringUtils.randomAlphabetic(6);
		addlastName.sendKeys(s1);
		Text1 = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayedas - " + Text1);
		CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
		String actuaEmailAddressText = storedEmailId.getAttribute("value");
		System.out.println("Email Address is displayed - as " + actuaEmailAddressText);
		ObjectRepo.test.log(Status.PASS, "Email Address is displayed as - " + actuaEmailAddressText);

		String actuaPreFilledRole = storedRole.getAttribute("value");
		System.out.println("Role is displayed as - " + actuaPreFilledRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed as - " + actuaPreFilledRole);

	}

	public void EditDataOnEditRolrPage() {
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);

		String s = RandomStringUtils.randomAlphabetic(6);
		addlastName.sendKeys(s);
		addlastName.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOf(emailAddress));
		wait.until(ExpectedConditions.elementToBeClickable(emailAddress));

		CommonLibref.click(emailAddress, "seleniumClick", "emailAddress");
		
		Text = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as - " + Text);
		Text1 = storedLastName.getAttribute("Value");
		System.out.println("First name is displayed as - " + Text1);
		ObjectRepo.test.log(Status.PASS, "First name is displayed as - " + Text1);
	}

	public void verifyTheEditButtonDisplayInOnboardingStatus() {
		if (editOption.isEnabled()) {
			Assert.assertEquals(editOption.isEnabled(), true);
			System.out.println("The Edit button is displayed only in Onboarding status.");
			ObjectRepo.test.log(Status.PASS, "The Edit button is displayed only in Onboarding status.");

		} else {
			Assert.assertEquals(editOption.isEnabled(), false);
			System.out.println("The Edit button is not display");
			ObjectRepo.test.log(Status.PASS, "The Edit button is not display");

		}
	}

	public void verifyprefilleddataOnManageInitialUserPage() {
		String actualText = firstNameTitlexpath.getText();
		System.out.println("First name is displayed as - " + actualText);
		ObjectRepo.test.log(Status.PASS, "First name is displayed as - " + actualText);

		String actualLastNameText = lastNameTitlexpath.getText();
		System.out.println("Last name is displayed - as " + actualLastNameText);
		ObjectRepo.test.log(Status.PASS, "Last name is displayed as - " + actualLastNameText);

		String actuaEmailAddressText = emailTitle.getText();
		System.out.println("Email Address is displayed - as " + actuaEmailAddressText);
		ObjectRepo.test.log(Status.PASS, "Email Address is displayed as - " + actuaEmailAddressText);

		String actuaPreFilledRole = roletitle.getText();
		System.out.println("Role is displayed as - " + actuaPreFilledRole);
		ObjectRepo.test.log(Status.PASS, "Role is displayed as - " + actuaPreFilledRole);

	}

	public void verifyTheSaveButtonIsDisableOnManageInitialUserPage() {

		if (saveButton.isEnabled()) {
			Assert.assertEquals(saveButton.isEnabled(), true);
			System.out.println("The Save button should be Enabled");
			ObjectRepo.test.log(Status.PASS, "The Save button should be Enabled");

		} else {
			Assert.assertEquals(saveButton.isEnabled(), false);
			System.out.println("Save Button should be disabled until the information is added");
			ObjectRepo.test.log(Status.PASS, "Save Button should be disabled until until the information is added");
		}
	}

	public void verifyTheCancelButtonIsDisableOnManageInitialUserPage() {

		if (cancelButtonAtEndOfThePage.isEnabled()) {
			Assert.assertEquals(cancelButtonAtEndOfThePage.isEnabled(), true);
			System.out.println("Cancel Button should be enabled");
			ObjectRepo.test.log(Status.PASS, "Cancel Button should be enabled");

		} else {
			Assert.assertEquals(cancelButtonAtEndOfThePage.isEnabled(), false);
			System.out.println("Cancel Button should be disabled");
			ObjectRepo.test.log(Status.PASS, "Cancel Button should be disabled");
		}
	}

	public void verifyTheContentPresentOnUserInfromationPage() {
		String actualText = userInformation.getText();
		Assert.assertEquals(actualText, "User Information");
		System.out.println("On Set Up Initial Page table name displayed as - " + actualText);
		ObjectRepo.test.log(Status.PASS, "On Set Up Initial Page table name displayed as - " + actualText);

		String firstNameText = firstName.getText();
		Assert.assertEquals(firstName.getText(), "First Name*");
		System.out.println("First Name is displayed - as " + firstNameText);
		ObjectRepo.test.log(Status.PASS, "First Name is displayed - as " + firstNameText);

		String lastNameText = lastName.getText();
		Assert.assertEquals(lastName.getText(), "Last Name*");
		System.out.println("Last Name is displayed - as " + lastNameText);
		ObjectRepo.test.log(Status.PASS, lastNameText);

		String emailAddressText = emailAddress.getText();
		Assert.assertEquals(emailAddress.getText(), "Email Address*");
		System.out.println("Email Id is displayed - as " + emailAddressText);
		ObjectRepo.test.log(Status.PASS, emailAddressText);

		String roleText = roleTitle1.getText();
		Assert.assertEquals(roleTitle1.getText(), "Role*");
		System.out.println("Email Id is displayed - as " + roleText);
		ObjectRepo.test.log(Status.PASS, roleText);

	}

	public void validationForEmailAddresseOnManageInitialPage() {
		System.out.println("**************************************************************");
		System.out.println("Steps: Remove the prefilled data on Email address field and click outside");
		ObjectRepo.test.log(Status.PASS, "Steps: Remove the prefilled data on Email address field and click outside");

		CommonLibref.click(addEmailAddress, "javascriptClick", "addlastName");
		addEmailAddress.sendKeys(Keys.CONTROL, "a");
		addEmailAddress.sendKeys(Keys.CONTROL.BACK_SPACE);
		emailIdRequired = requiredMailIdErrorMessage.getText();
		Assert.assertEquals(requiredMailIdErrorMessage.getText(), "Email Address is required");
		System.out.println("Steps: Error message is display - " + emailIdRequired);
		ObjectRepo.test.log(Status.PASS, "Steps: Error message is displayed - " + emailIdRequired);
		System.out.println("**************************************************************");

		System.out.println("Steps: Enter special character in the Email Address field");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter special character in the Email Address field");
		CommonLibref.click(addEmailAddress, "javascriptClick", "addlastName");
		addEmailAddress.sendKeys("@#$%");
		invalidEmailAddress = requiredMailIdErrorMessage.getText();
//		Assert.assertEquals(requiredMailIdErrorMessage.getText(), "Please enter valid Email Address");
		System.out.println("Error message is display - " + invalidEmailAddress);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + invalidEmailAddress);

		System.out.println("**************************************************************");
		System.out.println("Steps: Enter more than 205 characters in the Email Address  field");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 205 characters in the Email Address  field");
		CommonLibref.click(addEmailAddress, "javascriptClick", "addlastName");
		addEmailAddress.sendKeys("Apart from counting words and characters, "
				+ "our online editor can help you to improve word choice and writing style, and, optionally, "
				+ "help you to detect grammar mistakes and plagiarism. To check word count, "
				+ "simply place your cursor into the text box above and start typing. "
				+ "You'll see the number of characters and words increase or decrease as you type, delete, and edit them. "
				+ "You can also copy and paste text from another program over into the online editor above. "
				+ "The Auto-Save feature will make sure you won't lose any changes while editing, "
				+ "even if you leave the site and come back later");
		errormessageMoreThan205Char = requiredMailIdErrorMessage.getText();
//		Assert.assertEquals(requiredMailIdErrorMessage.getText(), "Email Address must not be more than 205 characters");
		System.out.println("Error message is display - " + errormessageMoreThan205Char);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + errormessageMoreThan205Char);

		System.out.println("**************************************************************");
		System.out.println("Steps: Enter Email Address which is already present in the System");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter Email Address which is already present in the System");
		CommonLibref.click(addEmailAddress, "javascriptClick", "addlastName");
		addEmailAddress.sendKeys(Keys.CONTROL, "a");
		addEmailAddress.sendKeys(Keys.CONTROL.BACK_SPACE);
		addEmailAddress.sendKeys("Test123@eqanim-qa.wci-validate.org");
		addEmailAddress.sendKeys(Keys.ENTER);
		errormessageForDuplicateEmail = requiredMailIdErrorMessage.getText();
		wait.until(ExpectedConditions.visibilityOf(requiredMailIdErrorMessage));
//		Assert.assertEquals(requiredMailIdErrorMessage.getText(), "The E-Mail address entered is already present in the System.");
		System.out.println("Error message is display - " + errormessageForDuplicateEmail);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + errormessageForDuplicateEmail);

		System.out.println("**************************************************************");
		System.out.println("Steps: Enter valid data in the Email Address field");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter valid data in the Email Address field");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(addEmailAddress, "javascriptClick", "addlastName");
		addEmailAddress.sendKeys(Keys.CONTROL, "a");
		addEmailAddress.sendKeys(Keys.CONTROL.BACK_SPACE);
		randomEmailId = RandomStringUtils.randomAlphabetic(8);
		randomEmailId = randomEmailId + "@yopmail.com";
		storedEmailId.sendKeys(randomEmailId);
		System.out.println("Error message should not get displayed and entered characters is accepted");
		ObjectRepo.test.log(Status.PASS, "Error message should not get displayed and entered characters is accepted");
	}

	public void verifyTheRoleDropdownFieldIsSearchableOrNot() {
		System.out.println("Steps:Enter invalid character");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid character");
		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys("Rec");
		wait.until(ExpectedConditions.elementToBeClickable(storedRole));
		String invalidChar = storedRole.getAttribute("value");
		System.out.println("Search results should not get displayed as - " + invalidChar);
		ObjectRepo.test.log(Status.PASS, "Search results should not get displayed as" + invalidChar);

		System.out.println("**************************************************************");

		System.out.println("Steps:Enter valid character");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid character");
		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys(Keys.CONTROL, "a");
		addRole.sendKeys(Keys.CONTROL.BACK_SPACE);
		addRole.sendKeys("Reg");
		wait.until(ExpectedConditions.elementToBeClickable(storedRole));
		registarXpath.click();
		String validChar = storedRole.getAttribute("value");
		System.out.println("Search results is  displayed containing search character like -" + validChar);
		ObjectRepo.test.log(Status.PASS, "Search results is  displayed containing search character -" + validChar);
	}

	public void enterInvalidDataInFirstName() {
		System.out.println("**************************************************************");
		System.out.println("Steps:Enter invalid data in fields and observe");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid data in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		addFirstName.sendKeys("@#^&*$");
		String Text = errorSpaceForFirstName.getText();
		System.out.println("The appropriate error message is displyed as - " + Text);
//		Assert.assertEquals(errorSpaceForFirstName.getText(), "Please enter valid First Name");
		ObjectRepo.test.log(Status.PASS, "The appropriate error message is displyed as - " + Text);

	}

	public void verifyTheSaveButtonEnableOrNot() {

		if (saveButton.isEnabled()) {
			Assert.assertEquals(saveButton.isEnabled(), true);
			System.out.println("Save button is enable.");
			ObjectRepo.test.log(Status.PASS, "Save button is enable.");

		} else {
			Assert.assertEquals(saveButton.isEnabled(), false);
			System.out.println("Save button is disable");
			ObjectRepo.test.log(Status.PASS, "Save button is disable.");
		}
	}

	public void validationForFirstNameOnManageInitialPage() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Remove the data in First Name field and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Remove the data in First Name field and click outside respectively");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress));
		CommonLibref.click(addEmailAddress, "javascriptClick", "addEmailAddress");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForFirstName));
		String errorMessage1 = errorSpaceForFirstName.getText();
		System.out.println("Error message is displayed - " + errorMessage1);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name is required");
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + errorMessage1);
		System.out.println("*******************************************************");

		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 50 characters in first name");
		System.out.println("Steps: Enter more than 50 characters in first name");
		addFirstName.sendKeys(
				"Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, "
						+ "optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing."
						+ " You'll see the number of characters and words increase or decrease as you type, delete, and edit them."
						+ " You can also copy and paste text from another program over into the online editor above. "
						+ "The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForFirstName));
		String moreThan50char = errorSpaceForFirstName.getText();
		System.out.println("Error message is displayed - " + moreThan50char);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name must not be more than 50 characters");

		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + moreThan50char);
		enterInvalidDataInFirstName();
		System.out.println("*******************************************************");
		verifyTheSaveButtonEnableOrNot();
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		String s = RandomStringUtils.randomAlphabetic(6);
		addFirstName.sendKeys(s);
		String enterValidText = storedFirstName.getAttribute("Value");
		System.out.println("Entered Valid Name - " + enterValidText);
		verifyTheSaveButtonEnableOrNot();

	}

	public void validationForLastNameOnManageInitialPage() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Remove the data in Last Name field and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Remove the data in Last Name field and click outside respectively");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForLastName));
		String lastNameRequiredError = errorSpaceForLastName.getText();
		Assert.assertEquals(errorSpaceForLastName.getText(), "Last Name is required");
		System.out.println("Error message is display - " + lastNameRequiredError);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed" + lastNameRequiredError);
		System.out.println("*******************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 100 characters in Last name");
		System.out.println("Steps: Enter more than 100 characters in Last name");
		addlastName.sendKeys(
				"Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, "
						+ "optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing."
						+ " You'll see the number of characters and words increase or decrease as you type, delete, and edit them."
						+ " You can also copy and paste text from another program over into the online editor above. "
						+ "The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForLastName));
		String moreThan50charInLastName = errorSpaceForLastName.getText();
		System.out.println("Error message is displayed - " + moreThan50charInLastName);
		Assert.assertEquals(errorSpaceForLastName.getText(), "Last Name must not be more than 100 characters");
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + moreThan50charInLastName);
		System.out.println("*******************************************************");

		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		addlastName.sendKeys("@#^&*$");
		String addSpecialChar = errorSpaceForLastName.getText();
		System.out.println("Error message is displyed as - " + addSpecialChar);
//		Assert.assertEquals(errorSpaceForLastName.getText(), "Please enter valid Last Name");
		ObjectRepo.test.log(Status.PASS, "Error message is displyed as - " + addSpecialChar);

		verifyTheSaveButtonEnableOrNot();
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		String s = RandomStringUtils.randomAlphabetic(6);
		addlastName.sendKeys(s);
		String enterValidText = storedLastName.getAttribute("Value");
		System.out.println("Entered Valid Name - " + enterValidText);
		verifyTheSaveButtonEnableOrNot();
	}

	public void enterValidDataInJurisdictionName() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionName));
		try {
			CommonLibref.click(enterJurisdictionName, "javascriptClick", "enterJurisdictionName");
			enterJurisdictionName.sendKeys(Keys.CONTROL, "a");
			enterJurisdictionName.sendKeys(Keys.BACK_SPACE);
		} catch (Exception e) {
			CommonLibref.click(enterJurisdictionName, "seleniumClick", "enterJurisdictionName");
			enterJurisdictionName.sendKeys(Keys.CONTROL, "a");
			enterJurisdictionName.sendKeys(Keys.BACK_SPACE);
		}
		String randomJurisdictionName = RandomStringUtils.randomNumeric(5);
		String Name = "New Jurisdiction" + randomJurisdictionName;
		enterJurisdictionName.sendKeys(Name);
		jurisdictionName = enterJurisdictionName.getAttribute("Value");
		System.out.println("Edited jurisdiction name is display like" + jurisdictionName);
		ObjectRepo.test.log(Status.PASS, "Edited jurisdiction name is display like" + jurisdictionName);
	}

	public void enterValidDataInJurisdictionCode() {
		wait.until(ExpectedConditions.elementToBeClickable(enterJurisdictionCode));
		enterJurisdictionCode.click();
		String s = RandomStringUtils.randomAlphabetic(3);
		String code = s.toUpperCase();
		enterJurisdictionCode.sendKeys(code);
		jurisdictionCode = enterJurisdictionCode.getAttribute("Value");
		System.out.println("jurisdiction Code is displyed like - " + jurisdictionCode);
		ObjectRepo.test.log(Status.PASS, "jurisdiction Code is displyed like - " + jurisdictionCode);
	}

	public void enterValidDataInDateOfJoining() {
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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click on Date of Linkage");
		// js.executeScript("arguments[0].click();", selectDate);
		wait.until(ExpectedConditions.elementToBeClickable(selectCurrentDate));
		CommonLibref.click(selectCurrentDate, "seleniumClick", "selectDate");
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("Date of Linkage is selected");
	}

	public void enterValidDataIntoAddressField() {
		ObjectRepo.test.log(Status.PASS, "Contact Information card is displayed");
		CommonLibref.click(addAddress1, "seleniumClick", "addAddress1");
		addAddress1.sendKeys(Keys.CONTROL, "a");
		addAddress1.sendKeys(Keys.BACK_SPACE);
		addAddress1.sendKeys("Street1");
		String address1 = addAddress1.getAttribute("Value");
		System.out.println("Addres is display like - " + address1);
		ObjectRepo.test.log(Status.PASS, "Addres is display like - " + address1);
		CommonLibref.click(addAddress2, "seleniumClick", "addAddress2");
		addAddress2.sendKeys(Keys.CONTROL, "a");
		addAddress2.sendKeys(Keys.BACK_SPACE);
		addAddress2.sendKeys("Street2");
		String address2 = addAddress1.getAttribute("Value");
		System.out.println("Addres is display like - " + address2);
		ObjectRepo.test.log(Status.PASS, "Addres is display like -" + address2);
		String randomZipCodde = RandomStringUtils.randomNumeric(5);
		String ss = "Us" + randomZipCodde;
		zipCode.sendKeys(Keys.CONTROL, "a");
		zipCode.sendKeys(Keys.BACK_SPACE);
		zipCode.sendKeys(ss);
		wait.until(ExpectedConditions.elementToBeClickable(zipCode));
		String zipCodeOnJurisdicitonPage = zipCode.getAttribute("Value");
		System.out.println("Zip code is display like - " + zipCodeOnJurisdicitonPage);
		ObjectRepo.test.log(Status.PASS, "Zip code is display like - " + zipCodeOnJurisdicitonPage);
	}

	public void selectbyValueParameter() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(byValueParameter));
			CommonLibref.click(purchaseParametr, "javascriptClick", "purchaseParametr");
			System.out.println("Purchase Limits-(PL Parameter) Percentage % is selected");
			ObjectRepo.test.log(Status.PASS, "Purchase Limits-(PL Parameter) Percentage % is selected");
		} catch (NoSuchElementException e) {
			wait.until(ExpectedConditions.elementToBeClickable(radioButtonOfByValue));
			RadioButtonOfPurchaseLimit.click();
			System.out.println("Purchase Limits-(PL Parameter) Percentage % is selected");
			ObjectRepo.test.log(Status.PASS, "Purchase Limits-(PL Parameter) Percentage % is selected");
		} catch (Exception ex) {
			Actions action = new Actions(driver.get());
			action.moveToElement(purchaseParametr).click(byValueParameter).build().perform();
			System.out.println("Purchase Limits-(PL Parameter) Percentage % is selected");
			ObjectRepo.test.log(Status.PASS, "Purchase Limits-(PL Parameter) Percentage % is selected");
		}
	}

	public void selectPurchaseParameter() {
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable(purchaseParametr));
//			CommonLibref.click(purchaseParametr, "javascriptClick", "purchaseParametr");
//			System.out.println("Purchase Limits-(PL Parameter) Percentage % is selected");
//			ObjectRepo.test.log(Status.PASS, "Purchase Limits-(PL Parameter) Percentage % is selected");
//		} catch (NoSuchElementException e) {
//			wait.until(ExpectedConditions.elementToBeClickable(RadioButtonOfPurchaseLimit));
//			RadioButtonOfPurchaseLimit.click();
//			System.out.println("Purchase Limits-(PL Parameter) Percentage % is selected");
//			ObjectRepo.test.log(Status.PASS, "Purchase Limits-(PL Parameter) Percentage % is selected");
//		} catch (Exception ex) {
		Actions action = new Actions(driver.get());
		action.moveToElement(purchaseParametr).click(purchaseParametr).build().perform();
		System.out.println("Purchase Limits-(PL Parameter) Percentage % is selected");
		ObjectRepo.test.log(Status.PASS, "Purchase Limits-(PL Parameter) Percentage % is selected");
//		}
	}

	public void selectTheCurrencyForJurisdiction() {
		CommonLibref.click(addCurrencyOnSetUpJurisdiction, "javascriptClick", "addCurrencyOnSetUpJurisdiction");
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ARROW_DOWN);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.ENTER);
		addCurrencyOnSetUpJurisdiction.sendKeys(Keys.TAB);
	}

	public void selectValidLanguageForJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(languageFieldXpath)).isSelected();
		addLanguageOnSetUpJurisdiction.click();
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

	public void ScrollUptoTheBottomOfThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1000)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnSaveButtonOfSetUpNewJurisdictionButton() {
		wait.until(ExpectedConditions.elementToBeClickable(testidSaveButton));
		CommonLibref.click(testidSaveButton, "javascriptClick", "SaveButton");
	}

	public void VerifyTheValidationForFirstName() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Click on First name and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on First name and click outside respectively");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		wait.until(ExpectedConditions.elementToBeClickable(addEmailAddress));
		CommonLibref.click(emailAddress, "seleniumClick", "emailAddress");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForFirstName));
		String errorMessage1 = errorSpaceForFirstName.getText();
		System.out.println("Error message is displayed - " + errorMessage1);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name is required");
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + errorMessage1);
		System.out.println("*******************************************************");

		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 50 characters in first name");
		System.out.println("Steps: Enter more than 50 characters in first name");
		addFirstName.sendKeys(
				"Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, "
						+ "optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing."
						+ " You'll see the number of characters and words increase or decrease as you type, delete, and edit them."
						+ " You can also copy and paste text from another program over into the online editor above. "
						+ "The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForFirstName));
		String moreThan50char = errorSpaceForFirstName.getText();
		System.out.println("Error message is displayed - " + moreThan50char);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name must not be more than 50 characters");

		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + moreThan50char);
		enterInvalidDataInFirstName();
		System.out.println("*******************************************************");
		verifyTheSaveButtonEnableOrNot();
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		String s = RandomStringUtils.randomAlphabetic(6);
		addFirstName.sendKeys(s);
		String enterValidText = storedFirstName.getAttribute("Value");
		System.out.println("Entered Valid Name - " + enterValidText);
		verifyTheSaveButtonEnableOrNot();
	}

	public void VerifyTheValidationForLastName() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Click on Last name and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Last name and click outside respectively");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		wait.until(ExpectedConditions.elementToBeClickable(emailAddress));
		CommonLibref.click(emailAddress, "seleniumClick", "emailAddress");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForLastName));
		String lastNameRequiredError = errorSpaceForLastName.getText();
		Assert.assertEquals(errorSpaceForLastName.getText(), "Last Name is required");
		System.out.println("Error message is display - " + lastNameRequiredError);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed" + lastNameRequiredError);
		System.out.println("*******************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 100 characters in Last name");
		System.out.println("Steps: Enter more than 100 characters in Last name");
		addlastName.sendKeys(
				"Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, "
						+ "optionally, help you to detect grammar mistakes and plagiarism. To check word count, simply place your cursor into the text box above and start typing."
						+ " You'll see the number of characters and words increase or decrease as you type, delete, and edit them."
						+ " You can also copy and paste text from another program over into the online editor above. "
						+ "The Auto-Save feature will make sure you won't lose any changes while editing, even if you leave the site and come back later.");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForLastName));
		String moreThan50charInLastName = errorSpaceForLastName.getText();
		System.out.println("Error message is displayed - " + moreThan50charInLastName);
		Assert.assertEquals(errorSpaceForLastName.getText(), "Last Name must not be more than 100 characters");
		ObjectRepo.test.log(Status.PASS, "Error message is displayed - " + moreThan50charInLastName);
		System.out.println("*******************************************************");

		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		addlastName.sendKeys("@#^&*$");
		String addSpecialChar = errorSpaceForLastName.getText();
		System.out.println("Error message is displyed as - " + addSpecialChar);
		Assert.assertEquals(errorSpaceForLastName.getText(), "Please enter valid Last Name");
		ObjectRepo.test.log(Status.PASS, "Error message is displyed as - " + addSpecialChar);

		verifyTheSaveButtonEnableOrNot();
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		String s = RandomStringUtils.randomAlphabetic(6);
		addlastName.sendKeys(s);
		String enterValidText = storedLastName.getAttribute("Value");
		System.out.println("Entered Valid Name - " + enterValidText);
	}

	public void verifyTheCancelButtonIsEnableOrNot() {
		if (cancelButton.isEnabled()) {
			Assert.assertEquals(cancelButton.isEnabled(), true);
			System.out.println("Cancel Button should be enabled");
			ObjectRepo.test.log(Status.PASS, "Cancel Button should be enabled");

		} else {
			Assert.assertEquals(cancelButton2.isEnabled(), true);
			System.out.println("Cancel Button should be disabled");
			ObjectRepo.test.log(Status.PASS, "Cancel Button should be enabled");
		}
	}

	public void verifyTheSaveButtonIsDisableOrNot() {

		if (testidSaveButton.isEnabled()) {
			Assert.assertEquals(testidSaveButton.isEnabled(), true);
			System.out.println("The Save button should be Enabled");
			ObjectRepo.test.log(Status.PASS, "The Save button should be Enabled");

		} else {
			Assert.assertEquals(testidSaveButton.isEnabled(), false);
			System.out.println("Save Button should be disabled until the information is added");
			ObjectRepo.test.log(Status.PASS, "Save Button should be disabled until until the information is added");
		}
	}

	public void verifyTheSuccessMessageAfterCreateJurisdiction() {

		String message = SuccessMessage.getText();
		System.out.println("Success message is displayed as - " + message);
		ObjectRepo.test.log(Status.PASS, "Success message is displayed as - " + message);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");

	}

	public void VerifyTheManagedStatusOptionInQuickActions() {
		manageJurisdictionStatusSubmenu = manageJurisdictionStatusOption.getText();
		Assert.assertEquals(manageJurisdictionStatusSubmenu, "MANAGE JURISDICTION STATUS");
		ObjectRepo.test.log(Status.PASS, "MANAGE JURISDICTION STATUS is display");
		System.out.println("MANAGE JURISDICTION STATUS is display");
	}

	public void verifyTheJurisdictionNameInAllJurisdictiontable() {
		wait.until(ExpectedConditions.visibilityOf(jurisdictionNameField));
		String name = jurisdictionNameField.getText();
		System.out.println("Jurisdiciton Name is displayed as - " + name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(jurisdictionName, name);
		ObjectRepo.test.log(Status.PASS, "Jurisdiciton Name is displayed as - " + name);

	}

	public void verifyTheJurisdictionCodeInAllJurisdictiontable() {
		wait.until(ExpectedConditions.visibilityOf(jurisdictionCodeField));
		String code = jurisdictionCodeField.getText();
		System.out.println("Jurisdiciton Code is displayed as - " + code);
		Assert.assertEquals(jurisdictionCode, code);
		ObjectRepo.test.log(Status.PASS, "Jurisdiciton Code is displayed as - " + code);

	}

	public void searchNewJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.scroll(homepageSearchOption, "scrollToBottomOFPage", "homepageSearchOption");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(homepageSearchOption, "javascriptClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(jurisdictionName);
		System.out.println("Enter Jurisdiction Name =" + jurisdictionName);
	}

	public void verifyTheStatusFieldAfterNewJurisdictionCreated() {
		wait.until(ExpectedConditions.visibilityOf(statusField));
		String status = statusField.getText();
		System.out.println("Jurisdiction Status is dispalyed as =" + status);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Status is dispalyed as =" + status);

	}

	public void AssertManageJurisdictionDetailsOption() {
		String manageJurisdictionDetailSubmenu = manageJurisdictionDetailsOption.getText();
		Assert.assertEquals(manageJurisdictionDetailSubmenu, "MANAGE JURISDICTION DETAILS");
		ObjectRepo.test.log(Status.PASS, "MANAGE JURISDICTION DETAILS is display");
		System.out.println("MANAGE JURISDICTION DETAILS is display");
	}

	public void clickOnManageJurisdictionDetailsOption() {
		ObjectRepo.test.log(Status.PASS, "Click on MANAGE JURISDICTION DETAILS Page");
		System.out.println("Click on MANAGE JURISDICTION DETAILS Page");
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionDetailsOption));
		CommonLibref.click(manageJurisdictionDetailsOption, "seleniumClick", "homepageSearchOption");
		Common.pageLoader();
	}

	public void clickOnAddDefaultAccountOption() {
		ObjectRepo.test.log(Status.PASS, "Click on Add Default Account");
		System.out.println("Click on Add Default Account");
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionDetailsOption));
		CommonLibref.click(manageJurisdictionDetailsOption, "seleniumClick", "homepageSearchOption");
		Common.pageLoader();
	}

	public void clickOnSubmitButtonOnManagedStatusPage() {
		ObjectRepo.test.log(Status.PASS, "Step:Click on Submit Button ");
		System.out.println("Step:Click on Submit Button ");
		wait.until(ExpectedConditions.elementToBeClickable(testIdSubmitButton));
		CommonLibref.click(testIdSubmitButton, "javascriptClick", "testIdSaveButton");
		ObjectRepo.test.log(Status.PASS,
				"The 'Confirm Status Update' popup should be displayed with Passphrase field, CANCEL and CONFIRM button");
		System.out.println(
				"The 'Confirm Status Update' popup should be displayed with Passphrase field, CANCEL and CONFIRM button");
	}

	public void VerifyTheSubmitButtonEnableOrNot() {
		if (testIdSubmitButton.isEnabled()) {
			Assert.assertEquals(testIdSubmitButton.isEnabled(), true);
			System.out.println("Submit button is enable");
			ObjectRepo.test.log(Status.PASS, "Submit button is enable");

		} else {
			Assert.assertEquals(testIdSubmitButton.isEnabled(), false);
			System.out.println("Submit button is disable");
			ObjectRepo.test.log(Status.PASS, "Submit button is disable");
		}
	}

	public void ScrollMethodUptoTheSubmitButton() {

		wait.until(ExpectedConditions.visibilityOf(testIdSubmitButton));
		CommonLibref.scroll(testIdSubmitButton, "scrollToBottomOFPage", "testIdSubmitButton");
	}

	public void scrollthePageUptoJURISDICTIONMANAGEMENT() {
//		driver.get().navigate().refresh();
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(JURISDICTIONMANAGEMENTOnJSAPage));
		CommonLibref.scroll(JURISDICTIONMANAGEMENTOnJSAPage, "scrollToBottomOFPage", "JURISDICTIONMANAGEMENTOnJSAPage");

	}

	public void clickonjuirsdictionDetailsOptionOnJSApage() {
		Common.pageLoader();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectRepo.test.log(Status.PASS, "Step:Click on Jurisdiction Details");
		System.out.println("Step:Click on Jurisdiction Details");
		wait.until(ExpectedConditions.elementToBeClickable(juirsdictionDetailsOption));
		CommonLibref.click(juirsdictionDetailsOption, "javascriptClick", "juirsdictionDetailsOption");
	}

	public void enterValidPassphrase() {
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid passpharse and click on confirm button");
		System.out.println("Step:Enter valid passpharse and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		passphaseTextField.click();
		passphaseTextField.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Passphrase Entered Sucessfully");
		System.out.println("Passphrase Entered Sucessfully");

	}

	public void enterInvalidValidPassphrase() {
		System.out.println("**********************************************************");
		ObjectRepo.test.log(Status.PASS, "Step:Enter InValid Data");
		System.out.println("Step:Enter InValid Data");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		CommonLibref.click(passphaseTextField, "seleniumClick", "passphaseTextField");
		passphaseTextField.sendKeys("Wciadmin@");
		clickOnConfirmButton();
		wait.until(ExpectedConditions.elementToBeClickable(invalidPassphraseError));
		String error = invalidPassphraseError.getText();
		Assert.assertEquals(error, "Passphrase is incorrect");
		ObjectRepo.test.log(Status.PASS, "	Passphrase should not get accepted and Error message is display -" + error);
		System.out.println("Passphrase should not get accepted and Error message is display -" + error);

		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void clickOnConfirmButtonOnManagedStatusPage() {
		wait.until(ExpectedConditions.elementToBeClickable(removeButtonOnWarningPopoup));
		CommonLibref.click(removeButtonOnWarningPopoup, "seleniumClick", "removeButtonOnWarningPopoup");
	}

	public void clickOnConfirmButton() {
		wait.until(ExpectedConditions.elementToBeClickable(removeButtonOnWarningPopoup));
		CommonLibref.click(removeButtonOnWarningPopoup, "seleniumClick", "removeButtonOnWarningPopoup");
		Common.pageLoader();
	}

	public void verifyTheConfirmButtonEnableOrNot() {
		if (removeButtonOnWarningPopoup.isEnabled()) {
			Assert.assertEquals(removeButtonOnWarningPopoup.isEnabled(), true);
			System.out.println("Confirm button is enable");
		} else {
			Assert.assertEquals(removeButtonOnWarningPopoup.isEnabled(), false);
			System.out.println("Confirm button is disable");

		}
	}

	public void clickOnApproveButton() {
		wait.until(ExpectedConditions.visibilityOf(approveAndRevisionHeading));
		CommonLibref.scroll(approveAndRevisionHeading, "scrollToBottomOFPage", "approveAndRevisionHeading");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(approveRadioButton).click(approveRadioButton).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Approve' radio button");
			System.out.println("Step:Click on 'Approve' radio button");
		} catch (NoSuchElementException e) {

			// //Thread.sleep(2000);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", approveRadioButton);
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Approve' radio button");
			System.out.println("Step:Click on 'Approve' radio button");

		} catch (Exception e) {
			// //Thread.sleep(2000);
			driver.get().findElement(By.xpath(
					"(//label[text()='Decision']//..//..//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]"))
					.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Approve' radio button");
			System.out.println("Step:Click on 'Approve' radio button");
			
		}
		 Assert.assertEquals(CheckedapproveRadioButton.isSelected() , true);
	       System.out.println("Approve Check box is Selected ");
	}

	public void saveTheSuccessMessageonManageStatusPage() throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);

		System.out.println("Message displayed as -" + successMessage);
		Common.pageLoader();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
			CommonLibref.click(crossIcon, "moveToElementClick", "crossIcon");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void saveSuccessMessageonManageStatusPage01() throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
	}

	public void assertSuccessMessageonAfterTheUnlinkedJurisdiction() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The status of your jurisdiction has been updated')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonAfterTheUnlinkedJurisdiction1() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The status of your jurisdiction has been updated to')]")).isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonAfterTheApprovalOfLinkage() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'Your approval for the linkage')]")).isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonAfterTheUnlinkedStatus() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'Unlinked status has been submitted successfully')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonAfterProposedForUnlinkedToPrelinkedStatus() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'Pre-Linked status has been submitted successfully')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonAfterThePostLinked() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'has been updated to “Post-Linked” successfully')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonAfterTheOffboarded() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'has been updated to “Offboarded” successfully')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageonManageStatusPage() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The request to change the status')]")).isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void assertSuccessMessageForPrelinkedToLinkedonManageStatusPage() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'Your request has been successfully submitted.')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void verifyTheTheSuccessMessageonForInactiveUserOnManageStatusPage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
		Thread.sleep(12000);
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		try {
			CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
		} catch (Exception e) {
			CommonLibref.click(crossIcon, "javascriptClick", "crossIcon");
		}
		Thread.sleep(3000);
	}

	public void verifyTheSuccesMessageForOnboardingToUnlinkedStatus() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Success Message is displayed as - " + successMessage);
		System.out.println("Success Message is displayed as --" + successMessage);
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The request to change the status')]")).isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");

	}

	public void clickOnRevisionButtonOnJSAPage() {
		wait.until(ExpectedConditions.visibilityOf(approveAndRevisionHeading));
		CommonLibref.scroll(approveAndRevisionHeading, "scrollToElement", "approveAndRevisionHeading");
//	  ScrollPageUptoJurisdictionRequestStatusTable();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(RevisionRadioButton).click(RevisionRadioButton).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision Request' radio button");
			System.out.println("Step:Click on 'Revision Request' radio button");
		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", RevisionRadioButton);
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision' radio button");
			System.out.println("Step:Click on 'Revision Request' radio button");

		} catch (Exception e) {
			driver.get().findElement(By.xpath(
					"(//label[text()='Decision']//..//..//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"))
					.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision' radio button");
			System.out.println("Step:Click on 'Revision Request' radio button");
		}
	}

	public void titleOnJSAPage() {

		driver.get().navigate().refresh();
		CommonLibref.pageLoader();
		String title = headingOnJSAPage.getText();
		Assert.assertEquals(title, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, title + "is displayed");
		System.out.println(title + "is displayed");
	}

	public void performBuildAction() {
		String title = headingOnJSAPage.getText();
		Actions actions = new Actions(driver.get());
		actions.moveToElement(headingOnJSAPage).click(headingOnJSAPage).perform();
	}

	public void manditoryTaskOnJSAPage() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(approveAndRevisionHeading));
		CommonLibref.scroll(approveAndRevisionHeading, "scrollToElement", "approveAndRevisionHeading");

		CommonLibref.click(setRolesAndPrivilegesCheckBoxOnJSAPage, "javascriptClick",
				"setRolesAndPrivilegesCheckBoxOnJSAPage");
		System.out.println("Set Roles and Privileges checkbox is checked ");
		ObjectRepo.test.log(Status.PASS, "Set Roles and Privileges checkbox is checked ");

		wait.until(ExpectedConditions.visibilityOf(jurisdictionRequestTableOnJSAPage));
		CommonLibref.scroll(jurisdictionRequestTableOnJSAPage, "scrollToElement", "jurisdictionRequestTableOnJSAPage");

		CommonLibref.click(setConfigurationSettingsCheckBoxOnJSAPage, "javascriptClick",
				"setConfigurationSettingsCheckBoxOnJSAPage");
		System.out.println("Set Configuration Settings checkbox is checked");
		ObjectRepo.test.log(Status.PASS, "Set Configuration Settings checkbox is checked");

		CommonLibref.click(setContentCheckBoxOnJSAPage, "javascriptClick", "setContentCheckBoxOnJSAPage");
		System.out.println("Set Content checkbox is checked");
		ObjectRepo.test.log(Status.PASS, "Set Content checkbox is checked");

	}

	public void CommentBoxOnJSAPage() {
		String commentName = commentHeading.getText();
		Assert.assertEquals(commentName, "Comments*");
		System.out.println("Astrik sign is displayed for comment box");
		ObjectRepo.test.log(Status.PASS, "Astrik sign is displayed for comment box");
		wait.until(ExpectedConditions.elementToBeClickable(commentSectionOnJSAPage));
		commentSectionOnJSAPage.click();
		commentSectionOnJSAPage.sendKeys(Keys.CONTROL, "a");
		commentSectionOnJSAPage.sendKeys(Keys.BACK_SPACE);
		commentSectionOnJSAPage.sendKeys("Test");
		String comment = enteredFieldIncommentOnJSAPage.getText();
		System.out.println("entered comments is -" + comment);
		System.out.println("Comment is accepted and Submit button is enbled");
		ObjectRepo.test.log(Status.PASS, "Comment is accepted and Submit button is enbled");
	}

	public void EnterInValidDataInCommentBoxOnJSAPage() {
		System.out.println("Step:Click on the Revision Request radio button");
		ObjectRepo.test.log(Status.PASS, "Step:Click on the Revision Request radio button");
		wait.until(ExpectedConditions.elementToBeClickable(commentHeading));
		String commentName = commentHeading.getText();
		Assert.assertEquals(commentName, "Comments*");
		System.out.println("Astrik sign is displayed for comment box");
		ObjectRepo.test.log(Status.PASS, "Astrik sign is displayed for comment box");

		wait.until(ExpectedConditions.elementToBeClickable(commentSectionOnJSAPage));
		commentSectionOnJSAPage.click();
		String name = decisionHeading.getText();
		decisionHeading.click();
		System.out.println("Name is displayed as -" + name);
		ObjectRepo.test.log(Status.PASS, "Name is displayed as -" + name);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String errorMessage = errorMessageForComment.getText();
		System.out.println("Name is displayed as -" + errorMessage);
	}

	public void ScrollPageUptoJurisdictionRequestStatusTable() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(jurisdictionRequestTableOnJSAPage));
		CommonLibref.scroll(jurisdictionRequestTableOnJSAPage, "scrollToElement", "jurisdictionRequestTableOnJSAPage");
	}

	public void verifyTheConfirmUpdateStatusProposal() {
		wait.until(ExpectedConditions.visibilityOf(confirmUpdateStatusOnJSAPage));
		String name = confirmUpdateStatusOnJSAPage.getText();
		Assert.assertEquals(name, "Confirm Update Status Proposal");
		System.out.println("Popup Heading is display -" + name);
		ObjectRepo.test.log(Status.PASS, "Popup Heading is display -" + name);

		String passpharaseName = passphraseName.getText();
		Assert.assertEquals(passpharaseName, "Passphrase*");
		System.out.println("Name is display -" + passpharaseName);
		ObjectRepo.test.log(Status.PASS, "Name is display -" + passpharaseName);

	}

	public void clickOnCancelButtononConfirmUpdateStatusProposal() {
		System.out.println("Step: Click on the cancel button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on the cancel button");
		cancelButtonOnConfirmUpdateStatusProposal.click();
	}

	public void ClickOnTheContinueButtonOnManageJurisdictionDetailsPage() {
		System.out.println(
				"Step: Again click on 'Cancel' button of Manage Jurisdiction Details page and click on 'Continue' button on warning popup");
		ObjectRepo.test.log(Status.PASS,
				"Step:Again click on 'Cancel' button of Manage Jurisdiction Details page and click on 'Continue' button on warning popup");
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnManagedJurisdictionDetailsPage));
		continueButtonOnManagedJurisdictionDetailsPage.click();
	}

	public void ScrollUptoManageJurisdictionDetailsPage() {
		String title = headingOnJSAPage.getText();
		Assert.assertEquals(title, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, title + "is displayed");
		System.out.println(title + "is displayed");
		wait.until(ExpectedConditions.visibilityOf(headingOnJSAPage));
		CommonLibref.scroll(headingOnJSAPage, "scrollToElement", "headingOnJSAPage");
	}

	public void assertPrefilledValueAfterRevisionRequest() {

		String checkboxStatus = RadioButton.getAttribute("data-testid");
		if (checkboxStatus == "CheckCircleIcon") {
			System.out.println("Checkbox is unchecked");
		} else {
			System.out.println("Checkbox is checked");
		}
	}

	public void AssertJSAHomepageTableOption() {
		String value = homepageOption.getText();
		Assert.assertEquals(value, "Search Users");
		ObjectRepo.test.log(Status.PASS, value + " -is displayed");
		System.out.println(value + " -is displayed");
	}

	public void clickOnMoreActionsButton() {
		wait.until(ExpectedConditions.visibilityOf(moreOptionManagedDetailsPage));
		wait.until(ExpectedConditions.elementToBeClickable(moreOptionManagedDetailsPage));
		moreOptionManagedDetailsPage.click();
		ObjectRepo.test.log(Status.PASS, "Steps: Click on More Actions Option");
		System.out.println("Steps: Click on More Actions Option");
	}

	public void ClickOnMoreActionsButton01() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(moreOptionManagedDetailsPage));
		moreOptionManagedDetailsPage.click();
	}

	public void SelectEditOptionFromMoreAction() {
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Edit Option");
		System.out.println("Steps: Click on Edit Option");
		editOptionManagedDetailsPage.click();

		String headingOfEditPage = editJurisdictionDetailsPage.getText();
		Assert.assertEquals(headingOfEditPage, "Edit Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, headingOfEditPage + "- heading is displayed");
		System.out.println(headingOfEditPage + "- heading is displayed");

		String infrormationHeading = jurisdictionInformationonDetailsPage.getText();
		Assert.assertEquals(infrormationHeading, "Jurisdiction Information");
		ObjectRepo.test.log(Status.PASS, infrormationHeading + "- heading is displayed");
		System.out.println(infrormationHeading + "- heading is displayed");
	}

	public void ScrollUptoTheLanguageandCurrency() {
		String actualText = languageAndCurrencyHeading.getText();
		Assert.assertEquals(actualText, "Language and Currency");
		CommonLibref.scroll(languageAndCurrencyHeading, "scrollToElement", "languageAndCurrencyHeading");
	}

	public void ScrollUptoThePurchanseLimit() {
		String actualText = xPathPurchaseLimitText.getText();
		Assert.assertEquals(actualText, "Purchase Limits");
		CommonLibref.scroll(xPathPurchaseLimitText, "scrollToElement", "xPathPurchaseLimitText");
	}

	public void ScrollUptoTheJurisdictionAccounts() {
		String jurisdictionAccount = jurisdictionAccountsOnDetailsPage.getText();
		Assert.assertEquals(jurisdictionAccount, "Jurisdiction Accounts");
		CommonLibref.scroll(jurisdictionAccountsOnDetailsPage, "scrollToElement", "jurisdictionAccountsOnDetailsPage");

	}

	public void scrollThePageUptoJurisdictionRequestAndStatusChangeHistory() {
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		String statusHistoryTable = statusChangeHistory.getText();
		Assert.assertEquals(statusHistoryTable, "Jurisdiction Request and Status Change History");
		try {
			CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 1000)");
		}
	}

	public void ScrollThePageUptoJurisdictionAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(jurisdictionAccountsHeading));
		String statusHistoryTable = jurisdictionAccountsHeading.getText();
		Assert.assertEquals(statusHistoryTable, "Jurisdiction Accounts");
		CommonLibref.scroll(jurisdictionAccountsHeading, "scrollToElement", "jurisdictionAccountsHeading");
	}

	public void ContinueButtonOnMangeJurisdictionDetailsPage() {
		ObjectRepo.test.log(Status.PASS,
				"Steps:Click on Cancel button and then CONTINUE button on the confirmation pop-up message");
		System.out.println("Steps:Click on Cancel button and then CONTINUE button on the confirmation pop-up message");
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
		String continueButton = continueButtonOnDetailsPage.getText();
		Assert.assertEquals(continueButton, "CONTINUE");
		continueButtonOnDetailsPage.click();

		clickOnCrossIconOnToastMessage();

	}

	public void ContinueButtonOnSaveButtonOnMangeJurisdictionDetailsPage() {
		ObjectRepo.test.log(Status.PASS,
				"Steps:Click on Cancel button and then CONTINUE button on the confirmation pop-up message");
		System.out.println("Steps:Click on Cancel button and then CONTINUE button on the confirmation pop-up message");
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
		String continueButton = continueButtonOnDetailsPage.getText();
		Assert.assertEquals(continueButton, "CONTINUE");
		continueButtonOnDetailsPage.click();
	}

	public void EditLanguageFilledOnEditJurisdictionDetails() {
		CommonLibref.click(languageFieldXpath, "javascriptClick", "languageFieldXpath");
		languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
		languageFieldXpath.sendKeys(Keys.ENTER);

		String languageField = classOfLanguageFiled.getText();
		ObjectRepo.test.log(Status.PASS, languageField + "Language is displayed");
		System.out.println(languageField + "Language is displayed");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(currencyTextOnSetUpNewJurisdiction, "seleniumClick", "currencyTextOnSetUpNewJurisdiction");

	}

	public void VerifyTheConfirmationPopupOfSaveButton() {
		String popup = ConfirmationPopupOfSaveButtonONDetailsPage.getText();
		Assert.assertEquals(popup, "Confirmation Save");
		ObjectRepo.test.log(Status.PASS, popup + "- is displayed on Confirmation Popup");
		System.out.println(popup + "- is displayed on Confirmation Popup");

		String confirmationMessage = ConfirmationMessageONDetailsPage.getText();
		Assert.assertEquals(confirmationMessage, "Are you sure you would like to save these changes?");
		ObjectRepo.test.log(Status.PASS, confirmationMessage + "- is displayed");
		System.out.println(confirmationMessage + "- is displayed");
	}

	public void SucessMessageAfterTheEditDataOnManageDetailsPage() {
		wait.until(ExpectedConditions.elementToBeClickable(changeStatusMessageONDetailsPage));
		String StatusMessage = changeStatusMessageONDetailsPage.getText();
		Assert.assertEquals(StatusMessage, "Changes have been saved successfully.");
		ObjectRepo.test.log(Status.PASS, "Success Message is displayed as - " + StatusMessage);
		System.out.println("Success Message is displayed as - " + StatusMessage);

		Common.pageLoader();

		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");

	}

	public void AssetDefaultLanguageOnManageJurisdictionDetailsPage() {

		try {
			englishDeafultLanguage.isEnabled();
			System.out.println("English Default Language is added");
		} catch (Exception ex) {
			wait.until(ExpectedConditions.elementToBeClickable(deleteLanguage));
			deleteLanguage.click();
			CommonLibref.click(languageFieldXpath, "javascriptClick", "languageFieldXpath");
			languageFieldXpath.click();
			languageFieldXpath.sendKeys("English - System default language");
			languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
			languageFieldXpath.sendKeys(Keys.ENTER);
			languageFieldXpath.sendKeys(Keys.TAB);

			String testerLang = allLanguage.getText();
			System.out.println(testerLang);
			ObjectRepo.test.log(Status.PASS, testerLang);
		}
	}

	public void EditTheDataOnManageJurisdictionDetailsPage() {
		ObjectRepo.test.log(Status.PASS, "Click on The Zip code");
		System.out.println("Click on The Zip code");
		wait.until(ExpectedConditions.elementToBeClickable(zipCode));
		zipCode.click();
		zipCode.sendKeys(Keys.CONTROL, "a");
		zipCode.sendKeys(Keys.BACK_SPACE);
		String randomZipCodde = RandomStringUtils.randomNumeric(5);
		String ss = "Us" + randomZipCodde;
		zipCode.sendKeys(ss);
		wait.until(ExpectedConditions.elementToBeClickable(zipCode));
		zipCodeOnJurisdicitonPage = zipCode.getAttribute("Value");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(zipCodeOnJurisdicitonPage + "- zipcod is displayed");
		ObjectRepo.test.log(Status.PASS, zipCodeOnJurisdicitonPage + "- zipcod is displayed");
	}

	public void VerifyTheZipCodeAfterSaveTheData() {
		wait.until(ExpectedConditions.visibilityOf(zipcodevalueAfterSave));
		String storedZipcode = zipcodevalueAfterSave.getText();
		System.out.println(storedZipcode + "- Zipcode is displayed");

		if (zipcodevalueAfterSave.isDisplayed()) {
			Assert.assertEquals(zipCodeOnJurisdicitonPage, storedZipcode);
		} else {
			System.out.println(storedZipcode + "Zipcode is displayed");

		}
	}

	public void verifyTheFuctionalityOfRegionField() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", languageAndCurrencyHeading);
		System.out.println("**************************************************************");

		System.out.println("Steps: Enter the character in State/Region more than 255 characters.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter the character in State/Region more than 255 characters.");
		wait.until(ExpectedConditions.elementToBeClickable(regionFiled));
		String titleOfRegionField = regionFiled.getText();
		Assert.assertEquals(titleOfRegionField, "State/Region");

		regionFiledValue.click();
		regionFiledValue.sendKeys(Keys.CONTROL, "a");
		regionFiledValue.sendKeys(Keys.BACK_SPACE);
		regionFiledValue.sendKeys("Character Counter is a 100% free online character count\n"
				+ "calculator that's simple to use. Sometimes users prefer simplicity over\n"
				+ "all of the detailed writing information Word Counter provides, and this is exactly what this tool offers.\n"
				+ " It displays character count and word count which is often the only ");
		String value = regionFiledValue.getAttribute("value");
		System.out.println(value);
		String error = errorMessageOnRegionField.getText();
		System.out.println("Error message is display like -" + error);
		ObjectRepo.test.log(Status.PASS, "Error message is display like -" + error);

		System.out.println("**************************************************************");
		System.out.println("Step: Enter Special Characters in the region field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter Special Characters in the region field");
		regionFiledValue.click();
		regionFiledValue.sendKeys(Keys.CONTROL, "a");
		regionFiledValue.sendKeys(Keys.BACK_SPACE);
		regionFiledValue.sendKeys("@#$^^&^&&*(*%");
		CommonLibref.click(zipcodetitle, "seleniumClick", "zipcodetitle");
		String value1 = regionFiledValue.getAttribute("value");
		System.out.println("Data is accepted and display like -" + value1);
		ObjectRepo.test.log(Status.PASS, "Data is accepted and display like -" + value1);
		System.out.println("**************************************************************");
		System.out.println("Step: Enter accentuated characters in the region field");
		ObjectRepo.test.log(Status.PASS, "Step: Enter accentuated characters in the region field");
		regionFiledValue.click();
		regionFiledValue.sendKeys(Keys.CONTROL, "a");
		regionFiledValue.sendKeys(Keys.BACK_SPACE);
		regionFiledValue.sendKeys("ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØöØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøÿøùúûüýþÿ");
		String value3 = regionFiledValue.getAttribute("value");
		CommonLibref.click(zipcodetitle, "seleniumClick", "zipcodetitle");
		System.out.println("Data is accepted and display like -" + value3);
		ObjectRepo.test.log(Status.PASS, "Data is accepted and display like -" + value3);
	}

	public void selectCountryOtherThanUSAndCanada() {
		System.out.println("Select Country Other than Us And Canada");
		ObjectRepo.test.log(Status.PASS, "Select Country Other than Us And Canada");
		wait.until(ExpectedConditions.elementToBeClickable(addCountry));
		CommonLibref.click(addCountry, "javascriptClick", "addCountry");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addCountry.sendKeys(Keys.ARROW_DOWN);
		addCountry.sendKeys(Keys.ARROW_DOWN);
		addCountry.sendKeys(Keys.ARROW_DOWN);
		addCountry.sendKeys(Keys.ENTER);

		String value = valueInCountryField.getAttribute("value");
		System.out.println("Country filed is selected and like -" + value);
		ObjectRepo.test.log(Status.PASS, "Country filed is selected and like -" + value);
	}

	public void EnterComment() {
		CommonLibref.click(JSAComment, "moveToElementClick", "JSAComment");
		JSAComment.sendKeys("Test");

	}

	public void SelectUnlinkedJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("ARUBA");
		System.out.println("Enter Jurisdiction Name =" + "New Jurisdiction37514");
	}

	public void clickOnTheChangeStatus() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", headingOfChangeStatus);

		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ARROW_DOWN);
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(statusInJurisdictionStatusFiled));
		String option1 = statusInJurisdictionStatusFiled.getAttribute("value");
		System.out.println("Option1 is displayed as- " + option1);
		ObjectRepo.test.log(Status.PASS, "Option1 is displayed as- " + option1);

		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ARROW_DOWN);
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ARROW_DOWN);
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(statusInJurisdictionStatusFiled));
		String option2 = statusInJurisdictionStatusFiled.getAttribute("value");
		System.out.println("Option2 is displayed as- " + option2);
		ObjectRepo.test.log(Status.PASS, "Option2 is displayed as- " + option2);

	}

	public void AssertUnlinkedToPrelinkedStatus() throws InterruptedException {
		System.out.println("WCI Inc Admin is navigated to 'Manage Jurisdiction Status' page with prefilled fields");
		ObjectRepo.test.log(Status.PASS,
				"WCI Inc Admin is navigated to 'Manage Jurisdiction Status' page with prefilled fields");
		Thread.sleep(2000);
		String value = prefilledDataInJurisdictionStatus.getAttribute("value");
		System.out.println("Status is displayed as- " + value);
		ObjectRepo.test.log(Status.PASS, "Status is displayed as- " + value);
		String value1 = prefilledDataInJurisdictionStatus01.getAttribute("value");
		System.out.println("Prelinked Jurisdiction name is displayed as- " + value1);
		ObjectRepo.test.log(Status.PASS, "Prelinked Jurisdiction name is displayed as- " + value1);
	}

	public void selectJurisdictionForPrelinkedStatus() {
		Common.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status");
		System.out.println("Jurisdiction Status is selected");
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		Common.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(statusInJurisdictionStatusFiled));
		PrelinkedJurisdictionStatus = statusInJurisdictionStatusFiled.getAttribute("value");
		System.out.println("Option1 is displayed as- " + PrelinkedJurisdictionStatus);
		ObjectRepo.test.log(Status.PASS, "Option1 is displayed as- " + PrelinkedJurisdictionStatus);
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdiction));
		searchFieldOfJurisdiction.click();
		searchFieldOfJurisdiction.sendKeys("New Jurisdiction65171");
		searchFieldOfJurisdiction.sendKeys(Keys.ENTER);
		selectJurisdiction = saveJurisdicion.getAttribute("value");
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction from Dropdown - " + selectJurisdiction);
		System.out.println("Step : Select Jurisdiction from Dropdown - " + selectJurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
	}

	public void VerifyTheUnlinkedStausOnManangeJurisdictionStatusPage() {
		wait.until(ExpectedConditions.elementToBeClickable(unlinkedStatus));
		if (unlinkedStatus.isDisplayed()) {
			String status = unlinkedStatus.getText();
			Assert.assertEquals(status, "Unlinked");
			System.out.println(status + "- Status is displayed");
			ObjectRepo.test.log(Status.PASS, status + "- Statuis is displayed");

		} else {
			System.out.println("Assert is Failed");

		}
	}

	public void selectManageStatusFromMoreActionsButton() {
		wait.until(ExpectedConditions.elementToBeClickable(manageStatusOption));
		manageStatusOption.click();
		System.out.println("Click on the Manage Status");
		ObjectRepo.test.log(Status.PASS, "Click on the Manage Status");
	}

	public void SelectManageStatusFromMoreActionsButton001() {
		wait.until(ExpectedConditions.elementToBeClickable(manageStatusOption));
		manageStatusOption.click();
	}

	public void AssertPrefilledDataAfterProposedStatus() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", headingOfChangeStatus);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(storedPrelinkedStatus));
		String status1 = storedPrelinkedStatus.getAttribute("value");
		Assert.assertEquals(PrelinkedJurisdictionStatus, status1);
		System.out.println("Status is displayed as- " + status1);
		ObjectRepo.test.log(Status.PASS, "Status is displayed as- " + status1);

		wait.until(ExpectedConditions.visibilityOf(saveJurisdictionData));
		String value = saveJurisdictionData.getAttribute("value");
		Assert.assertEquals(selectJurisdiction, value);
		System.out.println("Jurisdiction is displayed as- " + value);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction is displayed as- " + value);
	}

	public void ScrollMethodUptoChangeStatus() {
		wait.until(ExpectedConditions.visibilityOf(headingOfChangeStatus));
		CommonLibref.scroll(headingOfChangeStatus, "scrollToElement", "headingOfChangeStatus");

	}

	public void AssertStatusOnJurisdictionDetailsPage() {
		wait.until(ExpectedConditions.visibilityOf(statusOnDeatlsPage));
		String statusChecked = statusOnDeatlsPage.getText();
		Assert.assertEquals(statusChecked, "Unlinked");
		System.out.println("Jurisdiction status is displayed like - " + statusChecked);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction status is displayed like - " + statusChecked);
	}

	public void AssertJurisdictionStatusOnChangeStatusCardOfdeatilsPage() {
		String Status3 = jurisdictionStatusOnManageDetailsPage.getText();
		System.out.println("Jurisdiction status is displayed in Change Status - " + Status3);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction status is displayed in Change Status - " + Status3);
	}

	public void RevisionRequestCardForUnlinkedToprelinkedStatus() {

		String revisionRequest = revisionRequestOnDetailsPage.getText();
		Assert.assertEquals(revisionRequest, "Revisions Requested");
		System.out.println("Jurisdiction status is displayed in Change Status - " + revisionRequest);
		ObjectRepo.test.log(Status.PASS, "Jurisdiction status is displayed in Change Status - " + revisionRequest);
	}

	public void VerifyTheStatusAfterRevisionRequested() {
		wait.until(ExpectedConditions.visibilityOf(requestStatusCoulum));
		String checkedStatus = requestStatusCoulum.getText();
//		Assert.assertEquals(checkedStatus, "Revisions Requested");
		System.out.println("Request Status is displayed in table - " + checkedStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status is displayed in table - " + checkedStatus);
	}

	public void clearDataOnTheLoginPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		textBoxEmail.click();
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		textBoxPassWord.click();
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ScrollUptoTopOfTheWelcomOption() {

		wait.until(ExpectedConditions.visibilityOf(clickOnDropdown));
		CommonLibref.scroll(clickOnDropdown, "scrollToTopOFPage", "clickOnDropdown");
	}

	public void clickOnMoreActionsButtonOnManageAccountPage() {
		System.out.println("Click on More Actions Button");
		ObjectRepo.test.log(Status.PASS, "Click on More Actions Button");
		wait.until(ExpectedConditions.visibilityOf(moreActionButtonOnManageAccountPage));
		wait.until(ExpectedConditions.elementToBeClickable(moreActionButtonOnManageAccountPage));
		CommonLibref.click(moreActionButtonOnManageAccountPage, "javascriptClick",
				"moreActionButtonOnManageAccountPage");
	}

	public void assertTitileOnAddNewJurisdictionAccountsPage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(titileOfAddNewAccountPage));
		String title = titileOfAddNewAccountPage.getText();
		Assert.assertEquals(title, "Add New Jurisdiction Accounts");
		System.out.println("Title is displayed as - " + title);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as - " + title);
	}

	public void clickOnAddNewAccountButton() {
		wait.until(ExpectedConditions.visibilityOf(manageBudgetOption));
		wait.until(ExpectedConditions.elementToBeClickable(manageBudgetOption));
		CommonLibref.click(manageBudgetOption, "seleniumClick", "manageBudgetOption");
		System.out.println("Steps: Click on Add New Account page");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Add New Account page");
	}

	public void ClickOnAddNewAccountButtonOnDetailsPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(AddNewAccountOnDetailsPage));
		CommonLibref.click(AddNewAccountOnDetailsPage, "javascriptClick", "AddNewAccountOnDetailsPage");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Steps: Click on Add New Account page");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Add New Account page");
	}

	public void validationForAccountTyepOnAddNewJurisdictionAccountsPage() {

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter special character in Account type field");
		System.out.println("Steps:Enter special character in Account type field");
		wait.until(ExpectedConditions.elementToBeClickable(AccountTypeFiled));
		CommonLibref.click(AccountTypeFiled, "javascriptClick", "AccountTypeTextBox");
		AccountTypeFiled.sendKeys(Keys.CONTROL, "a");
		AccountTypeFiled.sendKeys(Keys.BACK_SPACE);
		AccountTypeFiled.sendKeys("!@#$^$%^&*(()_");
		String addValue2 = AccountTypeFiled.getAttribute("Value");
		System.out.println(addValue2);
		System.out.println("The data is entered in account type field - " + addValue2);
		ObjectRepo.test.log(Status.PASS, "The data is entered in account type field - " + addValue2);

		System.out.println("*****************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter greater than 255 char in 'Account type' field");
		System.out.println("Steps:Enter greater than 255 char in 'Account type' field");
		wait.until(ExpectedConditions.elementToBeClickable(AccountTypeFiled));
		CommonLibref.click(AccountTypeFiled, "javascriptClick", "AccountTypeTextBox");
		AccountTypeFiled.sendKeys(Keys.CONTROL, "a");
		AccountTypeFiled.sendKeys(Keys.BACK_SPACE);
		AccountTypeFiled.sendKeys(
				"dddddddddddddddd\\^\\$\\*\\.\\[\\]\\{\\}\\(\\)?\"\\!@#%&/\\\\,><':;\\|_~\\=+\\-]+{1,255}ddddddddddddddddddddddddddddddddddddddddddddddddd\\^\\$\\*\\.\\[\\]\\{\\}\\(\\)?\"\\!@#%&/\\\\,><':;\\|_~\\=+\\-]+{1,255}ddddddddddddddddddddddd\\^\\$\\*\\.\\[\\]\\{\\}\\(\\)?\"\\!@#%&/\\\\,><':;\\|_~\\`=+\\-]+{1,255}mm");
		String addValue3 = AccountTypeFiled.getAttribute("Value");
		System.out.println(addValue3);
		System.out.println("The error is display - Account Type must not be more than 255 characters.");
		ObjectRepo.test.log(Status.PASS, "The error is display - Account Type must not be more than 255 characters.");

		System.out.println("*****************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(AccountTypeFiled));
		CommonLibref.click(AccountTypeFiled, "javascriptClick", "AccountTypeTextBox");
		AccountTypeFiled.sendKeys(Keys.CONTROL, "a");
		AccountTypeFiled.sendKeys(Keys.BACK_SPACE);
		AccountTypeFiled.sendKeys("Issuance");
		String addValue4 = AccountTypeFiled.getAttribute("Value");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter duplicate account type in Account type field as- " + addValue4);
		System.out.println("Steps:Enter duplicate account type in Account type field as- " + addValue4);
		editAccountNameOnEditJurisdictionAccountPage();
		clickOnSubmitButtonOnAddNewAccountPage1();
		continueButtonOnAccountPage();
		verifyTheErrorMessageAfterClickOnAddAccountPage();
	}

	public void VerifyTheErrorMessageAccountType() {
		String error = errorMessageOnAccountType.getText();
		Assert.assertEquals(error, "Account Type is Required");
		System.out.println("error message is displayed as - " + error);
		ObjectRepo.test.log(Status.PASS, "error message is displayed as - " + error);
	}

	public void clickOnSubmitButtonOnAddNewAccountPage1() {
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		ObjectRepo.test.log(Status.PASS, "Steps:Click On Submit Button");
		System.out.println("Steps:Steps:Click On Submit Button");
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
		ObjectRepo.test.log(Status.PASS, "The warning popup message is displayed with 'Cancel' and 'Continue' button");
		System.out.println("The warning popup message is displayed with 'Cancel' and 'Continue' button");
	}

	public void continueButtonOnAccountPage() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid=\"priv_btn_Search\"]")))
				.click();
	}

	public void assertSuccessMessagefterJurisdictionAccountEdited() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(sucessMessageOfInitialUser));
		String successsMessage = sucessMessageOfInitialUser.getText();
		Assert.assertEquals(successsMessage, "Changes made are successfully saved to the system.");
		System.out.println("A success message is displayed: - " + successsMessage);
		ObjectRepo.test.log(Status.PASS, "A success message is displayed: - " + successsMessage);
	}

	public void clickOnContinueButtonOnAccountPage() {
		wait.until(ExpectedConditions.visibilityOf(continueBTNOnWarningPopupClassXpath));
		try {
			continueBTNOnWarningPopupClassXpath.click();
		} catch (Exception e) {
			continueBTNOnWarningPopup2.click();
		}
		ObjectRepo.test.log(Status.PASS, "Steps:Click On Continue Button");
		System.out.println("Steps:Steps:Click On Continue Button");
		wait.until(ExpectedConditions.elementToBeClickable(sucessMessageOfInitialUser));
//		String successsMessage = sucessMessageOfInitialUser.getText();
//		Assert.assertEquals(successsMessage, "The Jurisdiction Account has been successfully created in the system.");
//		System.out.println("The message is displayed -" + successsMessage);
//		ObjectRepo.test.log(Status.PASS, "The message is displayed -" + successsMessage);
	}

	public void ContinueButtonOnAccountPage() {
//		wait.until(ExpectedConditions.visibilityOf(continueBTNOnWarningPopup2));
		try {
			continueBTNOnWarningPopup.click();
		} catch (Exception e) {
			continueBTNOnWarningPopup2.click();
		}

		ObjectRepo.test.log(Status.PASS, "Steps:Click On Continue Button");
		System.out.println("Steps:Click On Continue Button");
	}

	public void verifyTheErrorMessageAfterClickOnAddAccountPage() {
		wait.until(ExpectedConditions.visibilityOf(errorMessageAfterSubmitbutton));
		String checkError = errorMessageAfterSubmitbutton.getText();
		ObjectRepo.test.log(Status.PASS, "The error is display- " + checkError);
		System.out.println("The error is display- " + checkError);
	}

	public void verifyTheValidationForLanguagesOnAddNewAccountPage() {
		String randomAccountName = RandomStringUtils.randomNumeric(5);
		AccountName1 = "Account" + randomAccountName;
		editAccountNameforEnglishLangOnManageAccount.click();
		editAccountNameforEnglishLangOnManageAccount.sendKeys(AccountName1);
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.TAB);
		ObjectRepo.test.log(Status.PASS, "Account Name displayed as -" + AccountName1);
		System.out.println("Account Name displayed for English -" + AccountName1);
		editAccountNameforEnglishLangOnManageAccount.click();
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.CONTROL, "a");
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.BACK_SPACE);
	}

	public void verifyTheErrorMessageForLanguagesOnAddNewAccountPage() {
		wait.until(ExpectedConditions.visibilityOf(errorMessageForAccountName));
		String checkError = errorMessageForAccountName.getText();
		ObjectRepo.test.log(Status.PASS, "The error is display- " + checkError);
		System.out.println("The error is display- " + checkError);
	}

	public void verifyTheValidationForAccountNameFiledOnManageJurisdictionAccountPage() {
		wait.until(ExpectedConditions.visibilityOf(AccountTypeFiled));
		String randomAccountName = RandomStringUtils.randomNumeric(5);
		String addAccount = "Account" + randomAccountName;
		AccountTypeFiled.click();
		AccountTypeFiled.sendKeys(Keys.CONTROL, "a");
		AccountTypeFiled.sendKeys(Keys.BACK_SPACE);
		AccountTypeFiled.sendKeys(addAccount);
		String addValue = AccountTypeFiled.getAttribute("Value");
		System.out.println("Steps:Account Name is displayed as" + addValue);

		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "SubmitButton");
		wait.until(ExpectedConditions.visibilityOf(CancelButton));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(editAccountNameforEnglishLangOnManageAccount));
		editAccountNameforEnglishLangOnManageAccount.click();
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.TAB);
		verifyTheErrorMessageForLanguagesOnAddNewAccountPage();

		System.out.println("*********************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter greater than 255 char in account name filed");
		System.out.println("Steps: Enter greater than 255 char in account name filed");
		editAccountNameforEnglishLangOnManageAccount.click();
		editAccountNameforEnglishLangOnManageAccount.sendKeys(
				"dddddddddddddddd\\^\\$\\*\\.\\[\\]\\{\\}\\(\\)?\"\\!@#%&/\\\\,><':;\\|_~\\=+\\-]+{1,255}ddddddddddddddddddddddddddddddddddddddddddddddddd\\^\\$\\*\\.\\[\\]\\{\\}\\(\\)?\"\\!@#%&/\\\\,><':;\\|_~\\=+\\-]+{1,255}ddddddddddddddddddddddd\\^\\$\\*\\.\\[\\]\\{\\}\\(\\)?\"\\!@#%&/\\\\,><':;\\|_~\\`=+\\-]+{1,255}mm\n");
		String value = editAccountNameforEnglishLangOnManageAccount.getText();
		ObjectRepo.test.log(Status.PASS,

				"Enter greater than 255 char in account name filed is displayed as- " + value);
		System.out.println("Enter greater than 255 char in account name filed is displayed as- " + value);
		verifyTheErrorMessageForLanguagesOnAddNewAccountPage();
		System.out.println("Enter greater than 255 char in account name filed is display- " + value);
		verifyTheErrorMessageForLanguagesOnAddNewAccountPage();

		System.out.println("*********************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter duplicate account name in 'Account name' field");
		System.out.println("Steps: Enter duplicate account name in 'Account name' field");
		editAccountNameforEnglishLangOnManageAccount.click();
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.CONTROL, "a");
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.BACK_SPACE);
		editAccountNameforEnglishLangOnManageAccount.sendKeys("Invalidation Account");
		editAccountNameforEnglishLangOnManageAccount.sendKeys(Keys.TAB);
		try {
			editAccountNameforFrenchLang.sendKeys(Keys.CONTROL, "a");
			editAccountNameforFrenchLang.sendKeys(Keys.BACK_SPACE);
			editAccountNameforFrenchLang.sendKeys("Invalidation Account");
			editAccountNameforFrenchLang.sendKeys(Keys.TAB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(SubmitButton));
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		clickOnSubmitButtonOnAddNewAccountPage1();
		continueButtonOnAccountPage();
	}

	public void addAccountInAccountType() {
		Common.pageLoader();
		try {
			wait.until(ExpectedConditions.visibilityOf(AccountTypeFiled));
			wait.until(ExpectedConditions.elementToBeClickable(AccountTypeFiled));
			CommonLibref.click(AccountTypeFiled, "seleniumClick", "AccountTypeTextBox");
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String addAccount = "Account" + randomAccountName;
			AccountTypeFiled.click();
			AccountTypeFiled.sendKeys(Keys.CONTROL, "a");
			AccountTypeFiled.sendKeys(Keys.BACK_SPACE);
			AccountTypeFiled.sendKeys(addAccount);
//			AccountTypeFiled.sendKeys(Keys.TAB);
			addValue4 = AccountTypeFiled.getAttribute("Value");
			System.out.println("Steps:Account Name is displayed as -" + addValue4);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(AccountTypeTextBox01));
			wait.until(ExpectedConditions.elementToBeClickable(AccountTypeTextBox01));
			CommonLibref.click(AccountTypeTextBox01, "javascriptClick", "AccountTypeTextBox");
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String addAccount = "Account" + randomAccountName;
			AccountTypeFiled.click();
			AccountTypeTextBox01.sendKeys(Keys.CONTROL, "a");
			AccountTypeTextBox01.sendKeys(Keys.BACK_SPACE);
			AccountTypeTextBox01.sendKeys(addAccount);
//			AccountTypeFiled.sendKeys(Keys.TAB);
			addValue4 = AccountTypeTextBox01.getAttribute("Value");
			System.out.println("Steps:Account Name is displayed as" + addValue4);
		}
	}

	public void verfyTheAddAccountButtonIsEnableOraNot() {
		if (SubmitButton.isEnabled()) {
			System.out.println("Save button is Enabled ");
		} else {
			System.out.println("Save button is Disabled");
		}
	}

	public void scrollUptoTheAddAccountButton() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 1200)");
			Thread.sleep(2000);
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("window.scrollBy(0,850)", CancelButton);
		}

	}

	public void verificationofTypeofInstrumentfieldForManageJurisdictionAccountPage() {
		Actions actions = new Actions(driver.get());
		actions.moveToElement(AddNewAccount).click().perform();

		wait.until(ExpectedConditions.visibilityOf(Batch));
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		int size2 = List.size();
		System.out.println("No of Instruments available :" + size2);
		List<String> Instruments = new ArrayList<>();
		for (int i = 0; i <= size2 - 2; i++) {
			String element = List.get(i).getText();
			System.out.println("No of Instruments is displayed as :" + element);
			ObjectRepo.test.log(Status.PASS, "No of Instruments is displayed as :" + element);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of instrument' field' got displayed with dropdown and pre-selected :\r\n"
						+ "Allowance, Offset, Price Containment/ Reserve Allowance, Early Reduction Credits, and Price Ceiling Unit.");

		boolean isClickable = CloseSign.isSelected();
		if (isClickable) {
			System.out.println("RemoveInstrumentOption is clickable");
			Assert.assertTrue(false);

		} else {

			System.out.println("RemoveInstrumentOption is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of instrument' field' is not Enabled/not getting deselected");

	}

	public void verificationTheFuctionalityTypeoftransfer() {
		ExpectedConditions.elementToBeClickable(AddNewAccount);
		AddNewAccount.click();
		wait.until(ExpectedConditions.visibilityOf(Batch));
		String BatchText = Batch.getText();
		System.out.println(BatchText);
		Assert.assertEquals(BatchText, "Batch");
		ArrowDropDown.isDisplayed();
		System.out.println("Batch is displayed with Dropdown");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of transfer' field' got  displayed with dropdown and pre-selected as Batch transfer");

		boolean isClickable = RemoveBatchOption.isSelected();

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

	public void assertTheTitleOnConfirmStatusUpdate() {
		wait.until(ExpectedConditions.visibilityOf(confirmStatusUpdateTitle));
		String titleOnConfirmStatusUpdate = confirmStatusUpdateTitle.getText();
		Assert.assertEquals(titleOnConfirmStatusUpdate, "Confirm Status Update");
		System.out.println("Title of the popup is display like -" + titleOnConfirmStatusUpdate);
		ObjectRepo.test.log(Status.PASS, "Title of the popup is display like -" + titleOnConfirmStatusUpdate);

		wait.until(ExpectedConditions.visibilityOf(passphraseXpath));
		String passphraseTitle = passphraseXpath.getText();
		Assert.assertEquals(passphraseTitle, "Passphrase*");
		System.out.println("passphrase Title is displayed as -" + passphraseTitle);
		ObjectRepo.test.log(Status.PASS, "passphrase Title is displayed as -" + passphraseTitle);
	}

	public void VerifyTheJurisdictionDropDownDisplayedOrNot() {

		if (jurisdictionTitle.isEnabled()) {
			Assert.assertEquals(jurisdictionTitle.isDisplayed(), true);
			System.out.println("Jurisdiciton dropDown is displayed");
		} else {
			Assert.assertEquals(jurisdictionTitle.isDisplayed(), false);
			System.out.println("Jurisdiciton dropDown is not displayed");

		}
	}

	public void ValidationForInActiveJurisdicitonUsers() {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("AutomationActiveUsers");
		System.out.println("Enter Jurisdiction Name =" + "AutomationActiveUsers");
	}

	public void VerifyTheErrorMessageForInActiveUsers() {
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid passpharse and click on confirm button");
		System.out.println("Step:Enter valid passpharse and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		passphaseTextField.click();
		passphaseTextField.sendKeys(prop.getProperty("Password2"));

		clickOnConfirmButton();

		wait.until(ExpectedConditions.elementToBeClickable(invalidPassphraseError));
		String error = invalidPassphraseError.getText();
		Assert.assertEquals(error,
				"There needs to be at least two active Jurisdiction System Admin, one Jurisdiction Registrar and one Jurisdiction Authority to change the status of the Jurisdiction to Unlinked status.");
		ObjectRepo.test.log(Status.PASS, "Error message displayed as- " + error);
		System.out.println("Error message displayed as- " + error);
	}

	public void VerifyTheErrorMessageForInActiveUsersWhenProposedForPrelinkedStatus() {
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid passpharse and click on confirm button");
		System.out.println("Step:Enter valid passpharse and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		passphaseTextField.click();
		passphaseTextField.sendKeys(prop.getProperty("Password2"));

		clickOnConfirmButton();

		wait.until(ExpectedConditions.elementToBeClickable(invalidPassphraseError));
		String error = invalidPassphraseError.getText();
		Assert.assertEquals(error,
				"There needs to be at least two active Jurisdiction System Admin, one Jurisdiction Registrar and one Jurisdiction Authority to change the status of the Jurisdiction to Pre-Linked status.");
		ObjectRepo.test.log(Status.PASS, "Error message displayed as- " + error);
		System.out.println("Error message displayed as- " + error);
	}

	public void ValidationForOnlyTwoActiveUsersAddedJurisdiction() {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("AutomationTwoActiveUser");
		System.out.println("Enter Jurisdiction Name =" + "AutomationTwoActiveUser");
	}

	public void ValidationForJurisdicitonStatusDropdown() {
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.TAB);
	}

	public void VerifyTheErrorMessageFroJuisdictionStatus() {
		wait.until(ExpectedConditions.visibilityOf(statusrequiredForJurisdictionStatus));
		String error = statusrequiredForJurisdictionStatus.getText();
		Assert.assertEquals(error, "Jurisdiction Status is required");
		System.out.println("Error message is displayed as -" + error);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as -" + error);
	}

	public void SelectPrelinkedOptionFromDropOnMangeStatusPage() {
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status");
		System.out.println("Jurisdiction Status is selected");
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		searchFieldOfJurisdictionStatus.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.elementToBeClickable(statusInJurisdictionStatusFiled));
		String PrelinkedJurisdictionStatus = statusInJurisdictionStatusFiled.getAttribute("value");
		System.out.println("Status is displayed as- " + PrelinkedJurisdictionStatus);
		ObjectRepo.test.log(Status.PASS, "Option1 is displayed as- " + PrelinkedJurisdictionStatus);
	}

	public void SelectJurisdicitionFromFropDown() {
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdiction));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdiction));
		searchFieldOfJurisdiction.click();
		searchFieldOfJurisdiction.sendKeys("Nova Scotia");
		searchFieldOfJurisdiction.sendKeys(Keys.ENTER);
		searchFieldOfJurisdiction.sendKeys(Keys.TAB);
		String Jurisdiction = saveJurisdicion.getAttribute("value");
		ObjectRepo.test.log(Status.PASS,
				"Step : Select linkage Jurisdiction with different purchase limit (PL by Value) - " + Jurisdiction);
		System.out.println(
				"Step : Select linkage Jurisdiction with different purchase limit (PL by Value) - " + Jurisdiction);
	}

	public void VerifyTheErrorMessageForDifferentParameterSelected() {
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		Assert.assertEquals(successMessage,
				"Please update the Purchase Limit parameter to Value as per linkage rules.");
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "javascriptClick", "crossIcon");
	}

	public void VadlidationForPasspharaseFiledManageStatus() {
		ObjectRepo.test.log(Status.PASS, "Step : Click on Passphrase field and click outside");
		System.out.println("Stpes: Click on Passphrase field and click outside");
		passphaseTextField.click();
		passphaseTextField.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOf(passphraseisrequirederrorMessage));
		String passphraseRequiredError = passphraseisrequirederrorMessage.getText();
		Assert.assertEquals(passphraseRequiredError, "Passphrase is required");
		ObjectRepo.test.log(Status.PASS, "Error message is displayed below field : - " + passphraseRequiredError);
		System.out.println("Error message is displayed below field : - " + passphraseRequiredError);

	}

	public void AssertTheCancelButton() {
		String cancelText = cancelButton2.getText();
		Assert.assertEquals(cancelText, "CANCEL");
		System.out.println("Cancel Button is displayed");
		ObjectRepo.test.log(Status.PASS, "Cancel Button is displayed");
	}

	public void ScrollUptopTopOfThePage() {

		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollTo(0, 0)", btnWelcomeProfile);
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfile));
		try {
			CommonLibref.click(btnWelcomeProfileDD, "seleniumClick", "welcome profile button");
		} catch (Exception e) {
			CommonLibref.click(btnWelcomeProfileDD, "moveToElementClick", "welcome profile button");
		}
		wait.until(ExpectedConditions.elementToBeClickable(logoutOption));
		CommonLibref.click(logoutOption, "seleniumClick", "btnLogOut");
	}

	public void editDataOnManageJurisdictionAccountPage001() {
		try {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String EditAccountName = "Account" + randomAccountName;
			editAccountnameForEnglishLang.click();
			editAccountnameForEnglishLang.sendKeys(Keys.CONTROL, "a");
			editAccountnameForEnglishLang.sendKeys(Keys.BACK_SPACE);
			editAccountnameForEnglishLang.sendKeys(EditAccountName);
		} catch (Exception e) {
			scrollUptoTheAddAccountButton();
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String EditAccountName = "Account" + randomAccountName;
			editAccountnameForEnglishLang.click();
			editAccountnameForEnglishLang.sendKeys(Keys.CONTROL, "a");
			editAccountnameForEnglishLang.sendKeys(Keys.BACK_SPACE);
			editAccountnameForEnglishLang.sendKeys(EditAccountName);
		}

	}

	public void CancelProposedStatusOnJurisdictionStatus() {
		cancelProposedStatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
		CancelStatusButton.click();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessageHeading));
		System.out.println(PassphraseErrorMessageHeading.getText());
		System.out.println(PassphraseErrorMessage.getText());
		CommonLibref.click(CancelSuccessMessage, "moveToElementClick", "CancelSuccessMessage");
		// CancelSuccessMessage.click();
		Assert.assertEquals("Welcome!", WCIHomePage.getText());
		System.out.println(WCIHomePage.getText());
		ObjectRepo.test.log(Status.PASS, "Cancel Success Message is displayed.");

	}

	public void ClickOnCancelProposedOption() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelProposedOption));
		cancelProposedOption.click();
	}

	public void EnterCommentOnCancelProposedStatuscommentsBox() {
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
	}

	public void ClickOnCancelStatusButton() {
		wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
		CancelStatusButton.click();
	}

	public void clickOnCancelProposedbuttonOnManageStatusPage() {
		CommonLibref.scroll(CancelonJurisdictionStatus, "scrollToTopOFPage", "CancelonJurisdictionStatus");
		wait.until(ExpectedConditions.visibilityOf(CancelonJurisdictionStatus));
		try {
			CommonLibref.click(CancelonJurisdictionStatus, "moveToElementClick", "CancelonJurisdictionStatus");
			wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
			ObjectRepo.test.log(Status.PASS, "Step :Click on Cancel Proposal Button(MTE)");
			System.out.println("Step :Click on Cancel Proposal Button");

		} catch (NoSuchElementException e) {
			CancelonJurisdictionStatus.click();
			wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
			ObjectRepo.test.log(Status.PASS, "Step :Click on Cancel Proposal Button(Selenium)");
			System.out.println("Step :Click on Cancel Proposal Button");

		} catch (Exception e) {
			CommonLibref.click(CancelonJurisdictionStatus, "javascriptClick", "CancelonJurisdictionStatus");
//			wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
			ObjectRepo.test.log(Status.PASS, "Step :Click on Cancel Proposal Button");
			System.out.println("Step :Click on Cancel Proposal Button");

		}
		CommentonCancelProposal.sendKeys("Test");
		CancelStatusButton.click();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessageHeading));
		System.out.println(PassphraseErrorMessageHeading.getText());
		System.out.println(PassphraseErrorMessage.getText());
		Boolean cancelledStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The request for approval to change the status')]"))
				.isDisplayed();
		Assert.assertTrue(cancelledStatus);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(CancelSuccessMessageButton));
		wait.until(ExpectedConditions.elementToBeClickable(CancelSuccessMessageButton));
		CommonLibref.click(CancelSuccessMessageButton, "seleniumClick", "CancelSuccessMessageButton");
		// CancelSuccessMessage.click();
		Assert.assertEquals("Welcome!", WCIHomePage.getText());
		System.out.println(WCIHomePage.getText());
		ObjectRepo.test.log(Status.PASS, "Cancel Success Message is displayed.");

	}

	public void clickOnCancelProposedbutton() {
		driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set implicit wait
		wait.until(ExpectedConditions.elementToBeClickable(cancelProposedStatus01));
		cancelProposedStatus01.click();
		// Explicit wait for the CommentonCancelProposal element to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");

		// Explicit wait for the CancelStatusButton element to be clickable before
		// clicking
		wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
		CancelStatusButton.click();
	}

	public void clickOnCrossIconOnToastMessage() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void scollPageUptoTheWelcomText() {
		wait.until(ExpectedConditions.visibilityOf(clickOnDropdown));
		CommonLibref.scroll(clickOnDropdown, "scrollToTopOFPage", "clickOnDropdown");
	}

	public void ClickOncancelButton() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnSetUpNewJurisdiction));
		CommonLibref.click(cancelButtonOnSetUpNewJurisdiction, "javascriptClick", "cancelButtonOnSetUpNewJurisdiction");
		wait.until(ExpectedConditions.elementToBeClickable(WorningPopupOnIntialPage));

	}

	public void ClickOnMoreActionButtonOnDetailsPage() {
		if (moreOptionManagedDetailsPage.isEnabled()) {
			ClickOnMoreActionsButton01();
			SelectManageStatusFromMoreActionsButton001();
		} else {
			System.out.println("More Action not displayed");
		}

	}

	public void clickOnActivateOption() {
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(activateOption).click(activateOption).build().perform();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on Remove user button of confirmation pop-up..");
			System.out.println("Click on Remove user button of confirmation pop-up Action");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", activateOption);
			ObjectRepo.test.log(Status.PASS, "Steps:Click on Remove user button of confirmation pop-up..");
			System.out.println("Click on Remove user button of confirmation pop-up java script");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]"))
					.click();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on Remove user button of confirmation pop-up..");
			System.out.println("Click on Remove user button of confirmation pop-up..");
		}
	}

	public void searchInactivateUserAccountStatusInFilter() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		try {
			Filter.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(Filter));
			js.executeScript("arguments[0].click();", Filter);
		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("User Account Status");
		SearchName.sendKeys("Inactive");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOntheFirstUserQuickActions();
	}

	public void searchActiveUserAccountStatusInFilter() {
		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		// Thread.sleep(2000);
		try {
			CommonLibref.click(Filter, "moveToElementClick", "Filter");
		} catch (Exception e) {
			CommonLibref.click(Filter, "seleniumClick", "Filter");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(Select1));
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("User Account Status");
		searchFilterValue.sendKeys("Active");
		try {
			clickOntheFirstUserQuickActions();
		} catch (Exception e) {
			clickOnTheFirstQuickActionsOption();
		}
	}

	public void SearchActiveUserAccountStatusOnInitialUser() {
		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		// Thread.sleep(2000);
		try {
			CommonLibref.click(filterOptionOnUserPage, "moveToElementClick", "filterOptionOnUserPage");
		} catch (Exception e) {
			CommonLibref.click(filterOptionOnUserPage, "seleniumClick", "filterOptionOnUserPage");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(Select1));
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("User Account Status");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOntheFirstUserQuickActions();
	}

	public void SearchNotActiveUserAccountStatusInFilter() {
		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Filter.click();
		} catch (Exception e) {

			wait.until(ExpectedConditions.elementToBeClickable(Filter));
			js.executeScript("arguments[0].click();", Filter);
		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("User Account Status");
		SearchName.sendKeys("Not Activated");
		clickOntheFirstUserQuickActions();
	}

	public void VerifyThatActivateOptionIsEnableOrNot() {
		if (activateOption.isSelected() != false) {
			System.out.println("ACTIVATE option is enable");
			ObjectRepo.test.log(Status.PASS, "ACTIVATE option is enable");
			Assert.assertTrue(false);
		} else {
			System.out.println("ACTIVATE option is disable");
			ObjectRepo.test.log(Status.PASS, "ACTIVATE option is disable");
			Assert.assertTrue(true);
		}
	}

	public void verifyTheTotalRowCountOnManageInitialPage() {
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
		searchFieldOnInitialUsers.click();
		searchFieldOnInitialUsers.sendKeys("Inactive");
		String count = totalRowCount.getText();
		if (count.contains("0")) {
			System.out.println("Inactive user is not present");
		} else {
			System.out.println("Inactive user is not present");
		}
	}

	public void searchIssuanceAccountAndVerifyTheOptions() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys("Issuance");
		clickOnQuickActionsThreeDot();

		if (editOptionInQuickActions.isSelected() != true) {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("EDIT JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		}

		if (deleteOptionInQuickActions.isSelected() != true) {
			System.out.println("DELETE JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(true);
		} else {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(false);
		}
	}

	public void verifyTheQuickActionsOptionOnManageJurisdictionAccountPage() {
		if (editOptionInQuickActions.isSelected() != true) {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("EDIT JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		}
		if (enableDeleteOptionInQuickActions.isSelected() != true) {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("DELETE JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		}
	}

	public void verifyTheQuickActionsOptionForOffboardedJurisdiction() {
		if (disableEditOptionInQuickActions.isSelected() != false) {
			System.out.println("EDIT JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		} else {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		}
		if (disableDeleteOptionInQuickActions.isSelected() != false) {
			System.out.println("DELETE JURISDICTION ACCOUNT option is disable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is disable");
			Assert.assertTrue(false);
		} else {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		}
	}

	public void verifyTheAccountTableOnManageJurisdictionAccountPage() {
		String accountNumber = accountNumberXpath.getText();
		Assert.assertEquals(accountNumber, "Account Number");
		System.out.println("First coulmn name is displayed as- " + accountNumber);
		ObjectRepo.test.log(Status.PASS, "First coulmn name is displayed as- " + accountNumber);

		String accountType = accountTypeXpath.getText();
		Assert.assertEquals(accountType, "Account Type");
		System.out.println("Second coulmn name is displayed as- " + accountType);
		ObjectRepo.test.log(Status.PASS, "Second coulmn name is displayed as- " + accountType);

		String accountName = accountNameXpath.getText();
		Assert.assertEquals(accountName, "Account Name");
		System.out.println("third coulmn name is displayed as- " + accountName);
		ObjectRepo.test.log(Status.PASS, "third coulmn name is displayed as- " + accountName);

		String typeofInstruments = typesOfInstrumentXpath.getText();
		Assert.assertEquals(typeofInstruments, "Type of Instruments");
		System.out.println("fourth coulmn name is displayed as- " + typeofInstruments);
		ObjectRepo.test.log(Status.PASS, "fourth coulmn name is displayed as- " + typeofInstruments);

		String typeoftransfer = typesOfTransferXpath.getText();
		Assert.assertEquals(typeoftransfer, "Type of Transfers");
		System.out.println("Fifth coulmn name is displayed as- " + typeoftransfer);
		ObjectRepo.test.log(Status.PASS, "Fifth coulmn name is displayed as- " + typeoftransfer);

		String accountStatus = accountStatusXpath.getText();
		Assert.assertEquals(accountStatus, "Account Status");
		System.out.println("Six coulmn name is displayed as- " + accountStatus);
		ObjectRepo.test.log(Status.PASS, "Six coulmn name is displayed as- " + accountStatus);

		String quickActions = quickActionsXpath.getText();
		Assert.assertEquals(quickActions, "Quick Actions");
		System.out.println("Seven coulmn name is displayed as- " + quickActions);
		ObjectRepo.test.log(Status.PASS, "Seven coulmn name is displayed as- " + quickActions);
	}

	public void verifyTheOptionsInMoreAction() {
		String addDeafultAccount = addDefaultAccountXpath.getText();
		Assert.assertEquals(addDeafultAccount, "ADD DEFAULT ACCOUNT");
		System.out.println("First Option is displayed as- " + addDeafultAccount);
		ObjectRepo.test.log(Status.PASS, "Seven coulmn name is displayed as- " + addDeafultAccount);

		String addNewAccount = AddNewAccountButtonOnMoreActions.getText();
		Assert.assertEquals(addNewAccount, "ADD NEW ACCOUNT");
		System.out.println("Second option is displayed as- " + addNewAccount);
		ObjectRepo.test.log(Status.PASS, "Seven coulmn name is displayed as- " + addNewAccount);
	}

	public void assertEditJurisdictionAccountTitle() {
		wait.until(ExpectedConditions.visibilityOf(editJurisdictionAccountXpath));
		String editAccountTitle = editJurisdictionAccountXpath.getText();
		Assert.assertEquals(editAccountTitle, "Edit Jurisdiction Accounts");
		System.out.println("Title is displayed as- " + editAccountTitle);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as- " + editAccountTitle);
		CommonLibref.pageLoader();
	}

	public void clickOnEditOptionInQuickActions() {
		try {
			System.out.println("Steps: Click On Edit Option");
			ObjectRepo.test.log(Status.PASS, "Steps: Click On Edit Option");
			wait.until(ExpectedConditions.elementToBeClickable(editOptionTextXpath));
			editOptionTextXpath.click();
			CommonLibref.pageLoader();
		} catch (Exception e) {
			System.out.println("Steps: Click On Edit Option");
			ObjectRepo.test.log(Status.PASS, "Steps: Click On Edit Option");
			wait.until(ExpectedConditions.elementToBeClickable(editOptionInQuickActions));
			editOptionInQuickActions.click();
			CommonLibref.pageLoader();

		}
	}

	public void verifyTheDataInTypeOfInstrumet() {
		wait.until(ExpectedConditions.visibilityOf(Batch));
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		int size2 = List.size();
		System.out.println("No of Instruments available :" + size2);
		List<String> Instruments = new ArrayList<>();
		for (int i = 0; i <= size2 - 2; i++) {
			String element = List.get(i).getText();
			System.out.println("types Of Instruments displayed as :" + element);
			ObjectRepo.test.log(Status.PASS, "types Of Instruments displayed as :" + element);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of instrument' field' got displayed with dropdown and pre-selected :\n"
						+ "Allowance, Offset, Price Containment/ Reserve Allowance, Early Reduction Credits, and Price Ceiling Unit.");

		boolean isClickable = CloseSign.isSelected();
		if (isClickable) {
			System.out.println("Remove InstrumentOption is clickable");
			Assert.assertTrue(false);

		} else {

			System.out.println("Remove InstrumentOption is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of instrument' field' is not Enabled/not getting deselected");
	}

	public void verifyTheDataInTypeOfTransfer() {
		String BatchText = Batch.getText();
		Assert.assertEquals(BatchText, "Batch");
		ArrowDropDown.isDisplayed();
		System.out.println("Batch is displayed with Dropdown");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of transfer' field' got  displayed with dropdown and pre-selected as Batch transfer");

		boolean isClickable = RemoveBatchOption.isSelected();

		// Print the result
		if (isClickable) {
			System.out.println("Remove Batch Option is clickable");
			Assert.assertTrue(false);

		} else {
			System.out.println("Remove Batch Option is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of transfer' field'is not enabled and not getting  deselected");
	}

	public void verifyTheDataOnEditJurisdictionAccountPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[7]"));

		System.out.println("No of Account Name :" + List.size());
		List<String> Instruments = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getAttribute("value");
			System.out.println("No of Account Name" + (i + 1) + ": " + element);
			ObjectRepo.test.log(Status.PASS, "No of Account Name" + (i + 1) + ": " + element);
		}
	}

	public void removeTheFilleddataOnEditJurisdictionAccount() {
		System.out.println("Steps: Remove the prefilled data and observe Save button");
		ObjectRepo.test.log(Status.PASS, "Steps: Remove the prefilled data and observe Save button");
		wait.until(ExpectedConditions.elementToBeClickable(firstAccountName));
		firstAccountName.click();
		firstAccountName.sendKeys(Keys.CONTROL, "a");
		firstAccountName.sendKeys(Keys.BACK_SPACE);
		firstAccountName.sendKeys(Keys.TAB);
	}

	public void addDuplicateAccountName() {
		wait.until(ExpectedConditions.visibilityOf(storedAccountName));
		issuanceName = storedAccountName.getText();
		System.out.println("duplicate account name is" + issuanceName);
	}

	public void addDuplicateAccountNameOnEditJurisdictionAccountPage() {
		System.out.println("Steps: Enter duplicate account name and observe Save button ");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter duplicate account name and observe Save button");
		wait.until(ExpectedConditions.elementToBeClickable(firstAccountName));
		firstAccountName.click();
		firstAccountName.sendKeys(Keys.CONTROL, "a");
		firstAccountName.sendKeys(Keys.BACK_SPACE);
		firstAccountName.sendKeys(issuanceName);
	}

	public void editDataAndClickOnSaveButtonOnEditJurisdictionAccountPage() {
		System.out.println("Steps:  Click on the save button on the Edit jurisdiction accounts page. ");
		ObjectRepo.test.log(Status.PASS, "Steps:  Click on the save button on the Edit jurisdiction accounts page");
		firstAccountName.click();
		firstAccountName.sendKeys(Keys.CONTROL, "a");
		firstAccountName.sendKeys(Keys.BACK_SPACE);
		String randomAccountName = RandomStringUtils.randomNumeric(5);
		String AccountName1 = "Account" + randomAccountName;
		firstAccountName.sendKeys(AccountName1);

	}

	public void clickOnFilterOption() {
		wait.until(ExpectedConditions.elementToBeClickable(Filter01));
		Filter01.click();
	}

	public void searchStatusOnHomePage() {
		wait.until(ExpectedConditions.elementToBeClickable(SearchName));
		SearchName.sendKeys("Offboarded");
		System.out.println("Search Offboarded Jurisdiction");
		ObjectRepo.test.log(Status.PASS, "Search Offboarded Jurisdiction");
	}

	public void scrollHomepageUptoLast() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 1200)");
			Thread.sleep(2000);
		} catch (Exception e) {
			wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
			CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
			wait.until(ExpectedConditions.visibilityOf(rowsPeraPage));
			CommonLibref.scroll(rowsPeraPage, "scrollToBottomOFPage", "rowsPeraPage");
		}
	}

	public void clickOnDeleteJurisidictonOption() {
		System.out.println("Steps: Click on delete jurisdiction account from quick action menu.");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on delete jurisdiction account from quick action menu.");
		wait.until(ExpectedConditions.elementToBeClickable(DeleteOptionXpath));
		DeleteOptionXpath.click();

		String option1 = cancelButtonOnWarningPopopup01.getText();
		System.out.println("Confirmation pop-up is displayed with -" + option1);
		ObjectRepo.test.log(Status.PASS, "Confirmation pop-up is displayed with -" + option1);

		String option2 = continueButtonOnDetailsPage.getText();
		System.out.println("Confirmation pop-up is displayed with -" + option2);
		ObjectRepo.test.log(Status.PASS, "Confirmation pop-up is displayed with -" + option2);
	}

	public void assertDeleteSuccessMessage() {
		Common.pageLoader();
		Boolean addInitialButton = driver.get()
				.findElement(By.xpath("//*[text()='The selected Jurisdiction Account has successfully been deleted.']"))
				.isDisplayed();
		Assert.assertTrue(addInitialButton);
		System.out.println("The message is displayed -" + addInitialButton);
		ObjectRepo.test.log(Status.PASS, "The message is displayed -" + addInitialButton);
	}

	public void AssertDeleteSuccessMessage() {
		wait.until(ExpectedConditions.elementToBeClickable(sucessMessageOfInitialUser));
		String successsMessage = sucessMessageOfInitialUser.getText();
		Assert.assertEquals(successsMessage, "The selected Jurisdiction Account has successfully been deleted.");
		System.out.println("The message is displayed -" + successsMessage);
		ObjectRepo.test.log(Status.PASS, "The message is displayed -" + successsMessage);

	}

	public void addAccountNameOnAddNewAccountPage() {
		List<WebElement> List = driver.get().findElements(By.xpath("//*[contains(@name ,'accountNameLang')]"));

//List<String> Instruments = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			AccountName = "Account" + randomAccountName;
			List.get(i).click();
			List.get(i).sendKeys(Keys.CONTROL, "a");
			List.get(i).sendKeys(Keys.ENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List.get(i).sendKeys(AccountName);
			List.get(i).sendKeys(Keys.TAB);

			System.out.println("account is displayed as - " + AccountName);
			ObjectRepo.test.log(Status.PASS, "account is displayed as - " + AccountName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void searchAccountType() {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(addValue4);

	}

	public void ClickOnSelectTypeOfInstrumet() {

		Actions action = new Actions(driver.get());
		action.moveToElement(typeOfInstrumentTitle).click(typeOfInstrumentTitle).build().perform();

//	 driver.get().findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 radio-select-lbl css-1195g5e'])[1]"));
	}

	public void clickOnDeleteButton() {
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
		CommonLibref.click(continueButtonOnDetailsPage, "seleniumClick", "continueButtonOnDetailsPage");
		Common.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Step : Click On Delete Option");
		System.out.println(" Click On Delete Option");
	}

	public void VerifyThanCrosSignDeselectedOrNOtOnManageJurisidctionDetailsPage() {
		List<WebElement> List = driver.get().findElements(By.xpath(
				"//*[text()='Language']//..//..//*[contains(@class,'MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiChip-deleteIcon MuiChip-deleteIconSmall')]"));
		int size2 = List.size();
		System.out.println("No of Cros Icon available :" + size2);
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			System.out.println("No of Languages displayed as :" + element);
			ObjectRepo.test.log(Status.PASS, "No of Languages displayed as :" + element);
		}
		boolean isClickable = CloseSignXpath.isDisplayed();
		if (isClickable) {
			Actions action = new Actions(driver.get());
			action.moveToElement(CloseSignXpath).click(CloseSignXpath).build().perform();
			System.out.println("Language is clickable");

		} else {

			System.out.println("Existing Language is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of instrument' field' is not Enabled/not getting deselected");
	}

	public void AddLangugaeOnManageJurisdictionDetailsPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//p[text()='Language']//..//..//input[@type='text']"));
		int size2 = List.size();
		for (int i = 0; i < List.size(); i++) {
			List.get(i).click();
			languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
			languageFieldXpath.sendKeys(Keys.ARROW_DOWN);
			languageFieldXpath.sendKeys(Keys.ENTER);
		}
		String checkAllLnag = allLanguage.getText();
		System.out.println("All Languages displayed as -" + checkAllLnag);
		ObjectRepo.test.log(Status.PASS, "All Languages displayed as -" + checkAllLnag);
	}

	public void VerifyThatCurrencyDiselectedOrNotManageJurisidctionDetailsPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[text()='Currency']//..//..//*[@data-testid='CloseIcon']"));
		int size2 = List.size();
		System.out.println("No of Cros Icon available on Currency text :" + size2);
		for (int i = 0; i <= size2 - 2; i++) {
			String element = List.get(i).getText();
			System.out.println("No of available on Currency text :" + element);
			ObjectRepo.test.log(Status.PASS, "No of available on Currency text :" + element);
		}
		boolean isClickable = CloseSignForCurrencyXpath.isSelected();
		if (isClickable) {
			System.out.println("Language is clickable");
			Assert.assertTrue(false);

		} else {

			System.out.println("Existing Language is not clickable");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 2--> The data in 'Type of instrument' field' is not Enabled/not getting deselected");
	}

	public void AddCuurencyOnManageJurisdictionDetailsPage() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[text()='Currency']//..//..//*[@data-testid='CloseIcon']"));
		int size2 = List.size();
		for (int i = 0; i < List.size(); i++) {
			List.get(i).click();
			currencyTextFieldXpath.sendKeys(Keys.ARROW_DOWN);
			currencyTextFieldXpath.sendKeys(Keys.ENTER);
		}
		String checkAllCurrency = allCurrency.getText();
		System.out.println("All Languages displayed as -" + checkAllCurrency);
		ObjectRepo.test.log(Status.PASS, "All Languages displayed as -" + checkAllCurrency);
	}

	public void DiselectCurrenccyOnManageDetailsPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ScrollUptoThePurchanseLimit();
		List<WebElement> List = driver.get()
				.findElements(By.xpath("(//*[text()='Currency']//..//..//*[@data-testid='CloseIcon'])[1]"));
		int size2 = List.size();
		for (int i = 0; i < List.size(); i++) {
			try {
				List.get(i).click();
			} catch (Exception e) {
				Actions actions = new Actions(driver.get());
				actions.moveToElement(List.get(i)).click(List.get(i)).perform();
			}
			break;
		}
	}

	public void click_On_MegaMenu_Option() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		System.out.println("Click On Mega Menu");
		ObjectRepo.test.log(Status.PASS, "Click On Mega Menu");
	}

	public void click_On_Jurisdiction_Account_Option() {
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		System.out.println("Click On Jurisdiction Account");
		ObjectRepo.test.log(Status.PASS, "Click On Jurisdiction Account");
	}

	public void assert_Status_Change_Table() {
		String table = statusChangeTable.getText();
		System.out.println("table heading is displayed as- " + table);
		ObjectRepo.test.log(Status.PASS, "table heading is displayed as- " + table);

		List<WebElement> List = driver.get().findElements(
				By.xpath("//h2[text()='Status Change']//..//*[@class='MuiDataGrid-columnHeaderTitle css-cc8tf1']"));
		int size2 = List.size();
		System.out.println("Table heading is displayed as :" + size2);
		List<String> Instruments = new ArrayList<>();
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			System.out.println("Table name is displayed as - " + element);
		}

	}

	public void click_On_Account_Number_OnRegistrar_Page() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(AccountNumberLink));
		CommonLibref.click(AccountNumberLink, "seleniumClick", "AccountNumberLink");
		System.out.println("Click On Jurisdiction Account Number");
		ObjectRepo.test.log(Status.PASS, "Click On Jurisdiction Account Number");
	}

	public void Click_On_The_Second_Account_Number() {
		wait.until(ExpectedConditions.elementToBeClickable(AccountNumberLink));
		CommonLibref.click(AccountNumberLink, "seleniumClick", "AccountNumberLink");
		System.out.println("Click On Jurisdiction Account Number");
		ObjectRepo.test.log(Status.PASS, "Click On Jurisdiction Account Number");
	}

	public void click_On_The_First_Account_Number() {
		wait.until(ExpectedConditions.visibilityOf(accountNumber001));
		accountNumber001.click();
		System.out.println("Click On Jurisdiction Account Number");
		ObjectRepo.test.log(Status.PASS, "Click On Jurisdiction Account Number");
	}

	public void AssertStatusBeforeStatusChangeOfJurisdictionAccount() {
		wait.until(ExpectedConditions.visibilityOf(saveStatus));
		beforeStatus = saveStatus.getText();
		System.out.println("Before change the status of  Jurisdiction Account displayed as-  " + beforeStatus);
		ObjectRepo.test.log(Status.PASS,
				"Before change the status of  Jurisdiction Account displayed as-  " + beforeStatus);
	}

	public void assertStatusAfterStatusChangeOfJurisdictionAccount() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set implicit wait
		wait.until(ExpectedConditions.visibilityOf(afterStatusChangeXpath));
		afterStatus = afterStatusChangeXpath.getText();
		System.out.println("After change the status of  Jurisdiction Account displayed as-  " + afterStatus);
		ObjectRepo.test.log(Status.PASS,
				"After change the status of  Jurisdiction Account displayed as-  " + afterStatus);
	}

	public void verifyTheStatusChangeTableForWCIIncAdmin() {
		boolean isErrorMessageDisplayed = false;
		try {
			isErrorMessageDisplayed = wait.until(ExpectedConditions.visibilityOf(statusChangeTextXpath)).isDisplayed();
		} catch (Exception e) {
			System.out.println("The 'Status Change Table' is not displayed to WCI Inc Admin");
		}
		Assert.assertFalse(isErrorMessageDisplayed);
	}

	public void ClickOnQuickActionOfJurisdictionAccount() {

		WebElement quickActions2 = driver.get().findElement(
				By.xpath("(//*[text()='Jurisdiction Accounts']//..//..//*[@data-testid='MoreHorizIcon'])[1]"));
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
			driver.get()
					.findElement(By
							.xpath("(//*[text()='Jurisdiction Accounts']//..//..//*[@data-testid='MoreHorizIcon'])[1]"))
					.click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action Menu for Onboarding Jurisdiction");
		}
	}

	public void AssertAddNewAccountTitleOnJurisdictiondetailsPage() {
		String addNewButton = addNewAccountOnDetailsPage.getText();
		System.out.println("Titile is displayed as -" + addNewButton);
		ObjectRepo.test.log(Status.PASS, "Titile is displayed as -" + addNewButton);
	}

	@FindBy(xpath = "/html/body/header/div/div/div/a[2]")
	private WebElement signInButton;

	public void ClickOnQuickActionOfInitialUserSearchFiledOnDetailsPage() {

		WebElement quickActions2 = driver.get()
				.findElement(By.xpath("(//*[text()='Initial Users']//..//..//*[@data-testid='MoreHorizIcon'])[1]"));
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
			driver.get()
					.findElement(By.xpath("(//*[text()='Initial Users']//..//..//*[@data-testid='MoreHorizIcon'])[1]"))
					.click();
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action Menu for Onboarding Jurisdiction");
		}
	}

	@FindBy(xpath = "(//tbody//tr[1])[6]")
	private WebElement firstEmail;

	@FindBy(xpath = "//*[@placeholder=\"Search mail\"]")
	private WebElement searchEmail;

//	public void openMail(String Email, String Password,String Username) {
//		driver.get().navigate().to("https://www.google.com/gmail/about/");
//		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
//		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
//		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
//		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
//		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
//		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Username);
//		wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);
//		
//		
//		//*[text()='View messages']
//		
////	public void AssertAddNewAccountTitleOnJurisdictiondetailsPage() {
//		String addNewButton = addNewAccountOnDetailsPage.getText();
//		System.out.println("Titile is displayed as -" + addNewButton);
//		ObjectRepo.test.log(Status.PASS, "Titile is displayed as -" + addNewButton);
//	}

	public void cancelButtonWithDataIdXpath() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelDataIdXpath));
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("arguments[0].click();", cancelDataIdXpath);
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(cancelDataIdXpath).click(cancelDataIdXpath).build().perform();
		}
		System.out.println("Click On Cancel Button");
		ObjectRepo.test.log(Status.PASS, "Click On Cancel Button");
		String option1 = cancelButtonOnWarningPopopup01.getText();
		System.out.println("Confirmation pop-up is displayed with -" + option1);
		ObjectRepo.test.log(Status.PASS, "Confirmation pop-up is displayed with -" + option1);

		String option2 = continueButtonOnDetailsPage.getText();
		System.out.println("Confirmation pop-up is displayed with -" + option2);
		ObjectRepo.test.log(Status.PASS, "Confirmation pop-up is displayed with -" + option2);
	}

	public void ClickOnAddUserButton() {
		wait.until(ExpectedConditions.elementToBeClickable(addUserXpathOnDetailsPage));
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("arguments[0].click();", addUserXpathOnDetailsPage);
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(addUserXpathOnDetailsPage).click(addUserXpathOnDetailsPage).build().perform();
		}
		System.out.println("Steps: Click on Add User Button");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Add User Button");
	}

	public void VerifyTheQuickActionsOptionsForNotActivateUser() {
		wait.until(ExpectedConditions.elementToBeClickable(searchUserFiledOnDetailsPage));
		Actions action = new Actions(driver.get());
		action.moveToElement(searchUserFiledOnDetailsPage).click(searchUserFiledOnDetailsPage).build().perform();
		searchUserFiledOnDetailsPage.sendKeys(StoredEmailAddress);
	}

	public void SearchPostlinkedStatusOnWCIIncHomePage(String status) {
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Status");
		SearchName.sendKeys(status);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchPrelinkedStatusOnWCIIncHomePage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Status");
		SearchName.sendKeys("Pre-linked");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchOnboardStatusOnWCIIncHomePage() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Status");
		SearchName.sendKeys("Onboarding");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ClickOnHomeOption() {
		wait.until(ExpectedConditions.elementToBeClickable(homeOptionXpath));
		try {
			CommonLibref.click(homeOptionXpath, "javascriptClick", "homeOptionXpath");
		} catch (Exception e) {
			Actions actions = new Actions(driver.get());
			actions.moveToElement(homeOptionXpath).click(homeOptionXpath).perform();
		}
	}

	public void ClickOnHome() {
		wait.until(ExpectedConditions.elementToBeClickable(homeOptionXpath));
		try {
			CommonLibref.click(homeOptionXpath, "javascriptClick", "homeXpath");
		} catch (Exception e) {
			Actions actions = new Actions(driver.get());
			actions.moveToElement(homeOptionXpath).click(homeOptionXpath).perform();
		}
	}

	public void loginWithOnboardingUser() {
		wait.until(ExpectedConditions.elementToBeClickable(userIDField));
		CommonLibref.click(userIDField, "moveToElementClick", "userIDField");
		userIDField.sendKeys(Keys.CONTROL, "a");
		userIDField.sendKeys(Keys.BACK_SPACE);
		userIDField.sendKeys("nj.reg1");
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

	public void verifyTheJurisdictionAccountQuickActionsOptionForOnboardingJurisdiction() {
		try {
			if (quickActionsOnHomePage.isDisplayed()) {
				ObjectRepo.test.log(Status.PASS, "Quick Actions menu is displayed to Registar in Onboarding Status");
				System.out.println("Quick Actions menu is displayed to Registar in Onboarding Status");
				Assert.assertEquals(false, true);
			} else {
				System.out.println("Quick Actions' menu should not be displayed to Registar in Onboarding Status");
			}
		} catch (Exception e) {
			ObjectRepo.test.log(Status.PASS,
					"Quick Actions' menu should not be displayed to Registar in Onboarding Status");
			System.out.println("Quick Actions' menu should not be displayed to Registar in Onboarding Status");

		}
	}

	public void verifyTheJurisdictionAccountQuickActionsOptionForOtherThanOnboardingJurisdiction() {
		if (quickActionsOnHomePage.isDisplayed()) {
			ObjectRepo.test.log(Status.PASS,
					"Quick Actions' menu should be displayed to Registrar for other than Onboarding and Offboarded statuses.");
			System.out.println(
					"Quick Actions' menu should be displayed to Registrar for other than Onboarding and Offboarded statuses.");
			Boolean quickAtions = driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).isDisplayed();
			Assert.assertTrue(quickAtions);

		} else {
			System.out.println("test case pass");
		}
	}

	public void verifyTheQuickActionsOptionForJurisdictionAccountFor() {
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));
		int size2 = List.size();
		System.out.println("No of Option is displayed like- " + size2);
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			ObjectRepo.test.log(Status.PASS, "Submenu option is displayed in Quick Actions like- " + element);
			System.out.println("Submenu option is displayed in Quick Actions like- " + element);
		}
	}

	public void searchAccountNumberOnJuirsdictionAccountPage() {
		wait.until(ExpectedConditions.visibilityOf(AccountNumberLink));
		String accountNumber = AccountNumberLink.getText();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectRepo.test.log(Status.PASS, "Search Account Number" + accountNumber);
		System.out.println("Search Account Number is -" + accountNumber);
		wait.until(ExpectedConditions.visibilityOf(searchFiled));
		searchFiled.click();
		searchFiled.sendKeys(accountNumber);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click_On_The_First_Account_Number();
	}

	public void SearchActiveAccountStaus() {
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		Select objSelect1 = new Select(SearchOpratorName);
		objSelect1.selectByVisibleText("equals");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnTheRestrictCannotTransferOption() {

		if (restrictedCannotTransferandReceiveDetailsPage.isDisplayed()) {
			Boolean status = driver.get()
					.findElement(By.xpath("(//*[contains(text(),'Restricted- Cannot Transfer and Receive')])[1]"))
					.isDisplayed();
			Assert.assertTrue(status);
			ObjectRepo.test.log(Status.PASS, "Restricted- Cannot Transfer and Receive option is dsplayed");
			System.out.println("Restricted- Cannot Transfer and Receive option is dsplayed");
			try {
				ref1.clickOnMoreActionsButton();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				wait.until(ExpectedConditions.elementToBeClickable(restrictCannottransferOption));
				CommonLibref.click(restrictCannottransferOption, "moveToElementClick", "restrictCannottransferOption");
				verifyTherestrictionOption();
			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
		} else {
			try {
				ref1.clickOnMoreActionsButton();
			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
			wait.until(ExpectedConditions.elementToBeClickable(restrictCannottransferOption));
			CommonLibref.click(restrictCannottransferOption, "moveToElementClick", "restrictCannottransferOption");
			clickOnRestrictCannotTransferandReceivedRadioButton();
			verifyTherestrictionOption();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on RESTRICT JURISDICTION ACCOUNT");
			System.out.println("Steps:Click on RESTRICT JURISDICTION ACCOUNT");
			pom.enterCommentAndClickOnConfirmButtonOnConfirmStatusUpdate();
			try {

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void accessibilityoftheRestrictedCannotReceiveStatus() {
		if (restrictedCannotReceiveStatusOnDetailsPage.isDisplayed()) {
			Boolean status = driver.get()
					.findElement(By.xpath("(//*[contains(text(),'Restricted- Cannot Receive')])[1]")).isDisplayed();
			Assert.assertTrue(status);
			ObjectRepo.test.log(Status.PASS, "Restricted: Cannot receive status is dsplayed");
			System.out.println("Restricted: Cannot receive status is dsplayed");
			try {
				ref1.clickOnMoreActionsButton();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				wait.until(ExpectedConditions.elementToBeClickable(restrictCannottransferOption));
				CommonLibref.click(restrictCannottransferOption, "moveToElementClick", "restrictCannottransferOption");
				verifyTherestrictionOption();
			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
		} else {
			try {
				ref1.clickOnMoreActionsButton();
			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
			wait.until(ExpectedConditions.elementToBeClickable(restrictCannottransferOption));
			CommonLibref.click(restrictCannottransferOption, "moveToElementClick", "restrictCannottransferOption");
			ClickOnRestrictedCannotReceiveRadioButton();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on RESTRICT JURISDICTION ACCOUNT");
			System.out.println("Steps:Click on RESTRICT JURISDICTION ACCOUNT");
			pom.enterCommentAndClickOnConfirmButtonOnConfirmStatusUpdate();
			try {

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				wait.until(ExpectedConditions.elementToBeClickable(restrictCannottransferOption));
				CommonLibref.click(restrictCannottransferOption, "moveToElementClick", "restrictCannottransferOption");
				verifyTherestrictionOption();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void verifytheAccessibilityoftheSuspendStatus() {
		if (suspendedStatusOnDetailsPage.isDisplayed()) {
			Boolean status = driver.get().findElement(By.xpath("(//*[contains(text(),'Suspended')])[1]")).isDisplayed();
			Assert.assertTrue(status);
			ObjectRepo.test.log(Status.PASS, "Restricted: Cannot receive status is dsplayed");
			System.out.println("Restricted: Cannot receive status is dsplayed");
			try {
				ref1.clickOnMoreActionsButton();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
		} else {
			ObjectRepo.test.log(Status.PASS, "Suspend status is not displayed on Account page");
			System.out.println("Suspend status is not displayed on Account page");
			try {
				ref1.clickOnMoreActionsButton();
			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
			wait.until(ExpectedConditions.elementToBeClickable(suspendedOption));
			CommonLibref.click(suspendedOption, "moveToElementClick", "suspendedOption");
			pom.enterCommentAndClickOnConfirmButtonOnConfirmStatusUpdate();
			try {

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void verifytheAccessibilityoftheInactiveStatusStatus() {
		try {
			Boolean status = driver.get().findElement(By.xpath("(//*[contains(text(),'Inactive')])[1]")).isDisplayed();
			Assert.assertTrue(status);
			ObjectRepo.test.log(Status.PASS, "Restricted: Cannot receive status is dsplayed");
			System.out.println("Restricted: Cannot receive status is dsplayed");
			try {
				ref1.clickOnMoreActionsButton();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			} catch (Exception e) {
				System.out.println("More Actions Options Already opened");
			}
		} catch (Exception e) {
			ObjectRepo.test.log(Status.PASS, "Inactive status is not dsplayed");
			System.out.println("Inactive status is not dsplayed");

			ref1.clickOnMoreActionsButton();

			wait.until(ExpectedConditions.elementToBeClickable(inactiveOption));
			CommonLibref.click(inactiveOption, "moveToElementClick", "suspendedOption");
			pom.enterCommentAndClickOnConfirmButtonOnConfirmStatusUpdate();
			try {

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				pom.assertSuccessMessageOnbudgetPage();
				ref1.clickOnMoreActionsButton();
				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void clickOnActiveOptionAndEnterTheCommentAndClickOnConfirmButton() {
		try {
			if (activeAccountStatus.isDisplayed()) {

				ObjectRepo.test.log(Status.PASS, "Active status is displayed");
				System.out.println("Active status is displayed");

				ref1.clickOnMoreActionsButton();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

				ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			} else {
				System.out.println("Active status is not displayed");
			}

		} catch (Exception e) {
			ref1.clickOnMoreActionsButton();
			wait.until(ExpectedConditions.visibilityOf(activateOptionOnJurisdictionStatusPage));
			activateOptionOnJurisdictionStatusPage.click();
			ObjectRepo.test.log(Status.PASS, "Steps:Click on ACTIVE JURISDICTION ACCOUNT");
			System.out.println("Steps:Click on ACTIVE JURISDICTION ACCOUNT");
			pom.enterCommentAndClickOnConfirmButtonOnConfirmStatusUpdate();
			try {
				pom.assertSuccessMessageOnbudgetPage();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ref1.clickOnMoreActionsButton();

			ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

			ref1.verifyTheQuickActionsOptionForJurisdictionAccountFor();

		}
	}

	public void clickORestrictjurisdictionAccountOption() {
		wait.until(ExpectedConditions.visibilityOf(restrictCannottransferOption));
		restrictCannottransferOption.click();
		ObjectRepo.test.log(Status.PASS, "Steps:Click on RESTRICT JURISDICTION ACCOUNT");
		System.out.println("Steps:Click on RESTRICT JURISDICTION ACCOUNT");
	}

	public void clickOnRestrictedCannotTransferOption() {
		wait.until(ExpectedConditions.elementToBeClickable(restrictedCannotTransferRadioButton));
		CommonLibref.click(restrictedCannotTransferRadioButton, "moveToElementClick",
				"restrictedCannotTransferandReceiveRadioButton");
		ObjectRepo.test.log(Status.PASS, "Steps:Restricted: Cannot Transfer");
		System.out.println("Steps:Restricted: Cannot Transfer");
	}

	public void clickOnRestrictCannotTransferandReceivedRadioButton() {
		wait.until(ExpectedConditions.elementToBeClickable(restrictedCannotTransferandReceiveRadioButton));
		CommonLibref.click(restrictedCannotTransferandReceiveRadioButton, "moveToElementClick",
				"restrictedCannotTransferandReceiveRadioButton");
		ObjectRepo.test.log(Status.PASS, "Steps:Click on Restricted: Cannot Transfer and Receive");
		System.out.println("Steps:Restricted: Cannot Transfer and Receive");

	}

	public void ClickOnRestrictedCannotReceiveRadioButton() {
		wait.until(ExpectedConditions.elementToBeClickable(restrictedCannotReceiveRadioOption));
		CommonLibref.click(restrictedCannotReceiveRadioOption, "moveToElementClick",
				"restrictedCannotReceiveRadioOption");
		ObjectRepo.test.log(Status.PASS, "Steps:Restricted: Cannot Receive");
		System.out.println("Steps:Restricted: Cannot Receive");

	}

	public void verifyTherestrictionOption() {
		List<WebElement> List = driver.get().findElements(By.xpath(
				"//*[contains(@class,'MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1n6q0hc')]"));
		int size2 = List.size();
		System.out.println("No of Option is displayed like- " + size2);
		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			ObjectRepo.test.log(Status.PASS, "Select any one of the option from the below option:" + element);
			System.out.println("Select any one of the option from the below option:" + element);
		}
	}

	public void clickOnFirstOptionInMoreActionOnJurisdictionAcoountPage() {
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionDetailsOption));
		CommonLibref.click(manageJurisdictionDetailsOption, "moveToElementClick", "manageJurisdictionDetailsOption");
	}

	public void validatethecommentfieldfromConfirmStatusupdatepopup() {
		System.out.println("*********************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Click in the comment field and click outside");
		System.out.println("Steps:Click in the comment field and click outside");
		wait.until(ExpectedConditions.elementToBeClickable(CommentOnAccountStatus));
		CommonLibref.click(CommentOnAccountStatus, "moveToElementClick", "CommentOnAccountStatus");
		CommentOnAccountStatus.sendKeys(Keys.TAB);

		String commenetError = CommentisRequiredErrorEXpath.getText();
		ObjectRepo.test.log(Status.PASS, "Error message is display -" + commenetError);
		System.out.println("Error message is display - " + commenetError);

		System.out.println("*********************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter more than 8000 characters in the comment field");
		System.out.println("Steps:Enter more than 8000 characters in the comment field");
		CommentOnAccountStatus
				.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
						+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus "
						+ "pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget. "
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
						+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus "
						+ "pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.Lorem ipsum dolor sit amet, "
						+ "consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
						+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. N"
						+ "am fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
						+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet."
						+ " Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
						+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, "
						+ "nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
						+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, "
						+ "nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
						+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
						+ " Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
						+ "Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor."
						+ " Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
						+ "Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
						+ " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. "
						+ "Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
						+ "Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "
						+ "Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
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
						+ " nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet, "
						+ "consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo."
						+ " Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus."
						+ " Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet"
						+ " lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis "
						+ "dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, "
						+ "sed rhoncus pronin sapien nunc accuan eget. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum"
						+ " laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. "
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
		String errorFor8000Char = CommentisRequiredErrorEXpath.getText();
		ObjectRepo.test.log(Status.PASS, "Error message is display - " + errorFor8000Char);
		System.out.println("Error message is display -" + errorFor8000Char);
		System.out.println("*********************************************************");
		ObjectRepo.test.log(Status.PASS, "Enter valid data in the comment field");
		System.out.println("Enter valid data in the comment field");
		wait.until(ExpectedConditions.elementToBeClickable(CommentOnAccountStatus));
		CommonLibref.click(CommentOnAccountStatus, "moveToElementClick", "CommentOnAccountStatus");
		CommentOnAccountStatus.sendKeys(Keys.CONTROL, "a");
		CommentOnAccountStatus.sendKeys(Keys.BACK_SPACE);
		CommentOnAccountStatus.sendKeys("text");
		String textInCommnet = CommentOnAccountStatus.getText();
		ObjectRepo.test.log(Status.PASS, "Valid data gets accepted is display -" + textInCommnet);
		System.out.println("Valid data gets accepted is display -" + textInCommnet);
	}

	public void clickOnCancelButtonOnConfirmStatusUpdate() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonConfirmStatusUpdateXpath));
		CommonLibref.click(cancelButtonConfirmStatusUpdateXpath, "moveToElementClick",
				"cancelButtonConfirmStatusUpdateXpath");
		ObjectRepo.test.log(Status.PASS, "Click On Cancel button");
		System.out.println("Click On Cancel button");
	}

	public void assertAstrikSignOnSelectRestriction() {
		wait.until(ExpectedConditions.visibilityOf(selectRestrictionClassFieldXpath));
		String signMark = selectRestrictionClassFieldXpath.getText();
		ObjectRepo.test.log(Status.PASS, "Asterisk sign is displayed in the Select Restrictions -" + signMark);
		System.out.println("Asterisk sign is displayed in the Select Restrictions - " + signMark);
	}

	public void assertJurisdictionAccouneName() {
		wait.until(ExpectedConditions.visibilityOf(accountNameOnConfirmStatusUpdatePopUp));
		String accountNameInConfirmPopup = accountNameOnConfirmStatusUpdatePopUp.getText();
		ObjectRepo.test.log(Status.PASS, "Account name is displayed on confirm popup - " + accountNameInConfirmPopup);
		System.out.println("Account name is displayed on confirm popup - " + accountNameInConfirmPopup);
	}

	public void validationForThePassphrasefieldOnConfirmStatusupdatepopup() {
		pom.enterCommentOnConfirmStatusUpdatePopup();
		System.out.println("*********************************************************");
		ObjectRepo.test.log(Status.PASS, "Steps:Click in the passphrase field and click outside");
		System.out.println("Steps:Click in the passphrase field and click outside");
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseOnAccountStatus));
		CommonLibref.click(PassphraseOnAccountStatus, "moveToElementClick", "CommentOnAccountStatus");
		PassphraseOnAccountStatus.sendKeys(Keys.TAB);

		String passPhraseError = passphraseisrequiredErrorXpath.getText();
		ObjectRepo.test.log(Status.PASS, "Error message is display -" + passPhraseError);
		System.out.println("Error message is display - " + passPhraseError);
		System.out.println("*********************************************************");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys("Wciadmin");
		ClickOnConfirmButtonOnConfirmStatusUpdate();
		AssertErrorMessageForIncorrectPassphrase();

	}

	public void ClickOnConfirmButtonOnConfirmStatusUpdate() {
		wait.until(ExpectedConditions.elementToBeClickable(confirmButtonOnConfirmStatusUpdate));
		CommonLibref.click(confirmButtonOnConfirmStatusUpdate, "moveToElementClick",
				"confirmButtonOnConfirmStatusUpdate");
		System.out.println("Click On Conifrm Button");
		ObjectRepo.test.log(Status.PASS, "Click On Conifrm Button");
	}

	public void AssertErrorMessageForIncorrectPassphrase() {
		String passPhraseIncorrectError = sucessMessageOfInitialUser.getText();
		ObjectRepo.test.log(Status.PASS, "Error message is display -" + passPhraseIncorrectError);
		System.out.println("Error message is display - " + passPhraseIncorrectError);

		wait.until(ExpectedConditions.elementToBeClickable(errorCrossIcon));
		CommonLibref.click(errorCrossIcon, "moveToElementClick", "errorCrossIcon");
	}

	public void AssertJurisdictionHistory() {
		System.out.println("The Jurisdiction Request Status Change history table is updated with");
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Request Status Change history table is updated with");
		CommonLibref.scroll(ProposedForUnlinked, "scrollToBottomOFPage", "ProposedForPrelinked");
		wait.until(ExpectedConditions.elementToBeClickable(ProposedForUnlinked));
		String StatusTitle = ProposedForUnlinked.getText();
		Assert.assertEquals(StatusTitle, "Proposed for Un-Linked");
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

	public void assertJurisdictionHistoryTableAfterStatusChange() {
		System.out.println("The Jurisdiction Request Status Change history table is updated with");
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Request Status Change history table is updated with");
//		CommonLibref.scroll(ProposedForUnlinked, "scrollToBottomOFPage", "ProposedForPrelinked");
		VerifyTheStatusOfRevisionRequestStatusAfterRevisionRequested();
		String jurisdictionStatus = jurisdictionStatusInHistoryTable.getText();
		System.out.println("Jurisdiction Status: " + jurisdictionStatus);
		ObjectRepo.test.log(Status.PASS, "Request Status:" + jurisdictionStatus);
		String updatedBy = updatedByInHistoryTable.getText();
		System.out.println("Updated By: " + updatedBy);
		ObjectRepo.test.log(Status.PASS, "Updated By:" + updatedBy);
		String updatedDate = updateDateInHistoryTable.getText();
		System.out.println("Update Date: " + updatedDate);
		ObjectRepo.test.log(Status.PASS, "Update Date:" + updatedDate);
	}

	public void assertaccountInformationTitle() {
		String accountInformation = accountInformationTitle.getText();
		Assert.assertEquals(accountInformation, "Account Information");
		ObjectRepo.test.log(Status.PASS, "Account title is display -" + accountInformation);
		System.out.println("Account title is display - " + accountInformation);
	}

	public void VerifYTheMoreActionsOptionAfterTheProposedForUnlinked() {
//		List<WebElement> List = driver.get()
//				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));
//		int size2 = List.size();
//		System.out.println("NO of enable More actions option is :" + size2);
////	List<String> Instruments = new ArrayList<>();
//		for (int i = 0; i <= List.size(); i++) {
//			String element = List.get(i).getText();
//			System.out.println("Following More actions option is displayed like :" + element);
//			ObjectRepo.test.log(Status.PASS, "Following More actions option is displayed like :" + element);
//		}
		List<WebElement> elements = driver.get()
				.findElements(By.xpath("//*[contains(@class,'MuiTypography-root MuiTypography-body1 css-1yfaah8')]"));

		// Get the size of the list
		int numberOfElements = elements.size();
		System.out.println("Number of 'More actions' options displayed: " + numberOfElements);

		// Iterate through the list and log the text of each element
		for (int i = 0; i < numberOfElements; i++) {
			WebElement element = elements.get(i);
			String text = element.getText();
			System.out.println("Displayed 'More actions' option: " + text);
			ObjectRepo.test.log(Status.PASS, "Displayed 'More actions' option: " + text);
		}
	}

	public void VerifyTheEditDisabledAfterTheProposedForUnlinked() {
		try {

			Assert.assertEquals(manageTransferOption1.isEnabled(), true);
			System.out.println("Mange Transfer option is enable");
		} catch (Exception ex) {
			Assert.assertEquals(manageTransferOption1.isEnabled(), false);
			System.out.println("Mange Transfer option is disable");

		}
	}

	public void verifyTheEditOptionisDisabledOrNot() {
		try {
			Assert.assertEquals(manageTransferOption1.isEnabled(), true);
			System.out.println("Edit option is disable");
		} catch (Exception ex) {
			Assert.assertEquals(editOption.isEnabled(), true);
			System.out.println("The Edit button is displayed only in Onboarding status.");
			ObjectRepo.test.log(Status.PASS, "The Edit button is displayed only in Onboarding status.");

		}
	}

	public void AssertCancelProposedStatusOnStatus() {
		wait.until(ExpectedConditions.elementToBeClickable(AssertCancelonStatusPage));
		if (AssertCancelonStatusPage.isEnabled()) {
			System.out.println("CANCEL Proposed Status option is enabled");
			ObjectRepo.test.log(Status.PASS, "CANCEL Proposed Status option is enabled is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("CANCEL Proposed Status option is disabled");
			Assert.assertTrue(false);
		}
	}

	public void ClickOnReturnToBackHomePage() {
		Common.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(returnToHomePageOption));
		CommonLibref.click(returnToHomePageOption, "seleniumClick", "returnToHomePageOption");
		System.out.println("Step:Click on Return to Home option under More Actions");
		ObjectRepo.test.log(Status.PASS, "Step:Click on Return to Home option under More Actions" );
	}

	public void SelectJurisdiction1() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("Test 50");
		System.out.println("Enter Jurisdiction Name =" + "Test 50");
	}

	public void SelectJurisdictionWithoutIssuaceAccountAdded() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchJurisdiction));
		CommonLibref.click(searchJurisdiction, "javascriptClick", "searchJurisdiction");
		searchJurisdiction.sendKeys("Jurisdiction 8-5");
		System.out.println("Enter Jurisdiction Name =" + "Jurisdiction 8-5");
	}

	public void AssertErrorMessageForIssuanceAccountNotAdded() {
		wait.until(ExpectedConditions.visibilityOf(errorMessageForAccount));
		String errormsgforNoissuance = errorMessageForAccount.getText();
		System.out.println("Error message is displayed as- " + errormsgforNoissuance);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as- " + errormsgforNoissuance);
		Assert.assertEquals(errormsgforNoissuance, "There must be an Issuance Account added to the Jurisdiction.");
		ExpectedConditions.elementToBeClickable(errorCrossIcon);
		CommonLibref.click(errorCrossIcon, "seleniumClick", "popupclosebutton");

	}

	public void AsserErrorMessageForOtherThanIssuanceAccountNotSelected() {
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageforOneIssuanceAct));
		String errormsgforissuance = ErrorMessageforOneIssuanceAct.getText();
		Assert.assertEquals(errormsgforissuance,
				"There must be at least one Jurisdiction Account other than Issuance added to the Jurisdiction.");
		System.out.println("Error message is displayed as- " + errormsgforissuance);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as- " + errormsgforissuance);
	}

	public void VerifyTheStatusOfRevisionRequestStatusAfterRevisionRequested() {
		wait.until(ExpectedConditions.elementToBeClickable(revisionRequestStatus));
		String StatusTitle = revisionRequestStatus.getText();
		System.out.println("The request and status change history card is updated with the status change request as - "
				+ StatusTitle);
		ObjectRepo.test.log(Status.PASS,
				"The request and status change history card is updated with the status change request as - "
						+ StatusTitle);
	}

	public void VerifyTheNavigationOfNewJurisdictionInformationMandatoryTask() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Content management system task");
		System.out.println("Click on Set Content management system task");
		wait.until(ExpectedConditions.visibilityOf(newJurisdictionInformation));
		CommonLibref.scroll(newJurisdictionInformation, "scrollToBottomOFPage", "newJurisdictionInformation");
		wait.until(ExpectedConditions.elementToBeClickable(newJurisdictionInformation));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(newJurisdictionInformation).click(newJurisdictionInformation).build().perform();

		} catch (Exception e) {
			CommonLibref.click(newJurisdictionInformation, "seleniumClick", "newJurisdictionInformation");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

//	wait.until(ExpectedConditions.elementToBeClickable(headingOfManageJurisdictionDetails));
//	try {
//		Thread.sleep(7000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	CommonLibref.click(PrivlageManagementTitle, "seleniumClick", "PrivlageManagementTitle");
		String Hyperlink3Title = headingOfThePage.getText();
		Assert.assertEquals(Hyperlink3Title, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, "JSA is navigated to  " + Hyperlink3Title);
		System.out.println("JSA is navigated to  " + Hyperlink3Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}

	public void VerifyTheNavigationOfSetInitialUsersMandatoryTask() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Content management system task");
		System.out.println("Click on Set Content management system task");
		wait.until(ExpectedConditions.visibilityOf(setInitialUsers));
		CommonLibref.scroll(setInitialUsers, "scrollToBottomOFPage", "setInitialUsers");
		wait.until(ExpectedConditions.elementToBeClickable(setInitialUsers));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(setInitialUsers).click(setInitialUsers).build().perform();

		} catch (Exception e) {
			CommonLibref.click(setInitialUsers, "seleniumClick", "setInitialUsers");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

//	wait.until(ExpectedConditions.elementToBeClickable(headingOfManageJurisdictionDetails));
//	try {
//		Thread.sleep(7000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	CommonLibref.click(PrivlageManagementTitle, "seleniumClick", "PrivlageManagementTitle");
		String Hyperlink3Title = titleOfInitialPage.getText();
		Assert.assertEquals(Hyperlink3Title, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, "JSA is navigated to  " + Hyperlink3Title);
		System.out.println("JSA is navigated to  " + Hyperlink3Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}

	public void VerifyTheNavigationOfSetJurisdictionAccountMandatoryTask() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Content management system task");
		System.out.println("Click on Set Content management system task");
		wait.until(ExpectedConditions.visibilityOf(setJurisdictionAccount));
		CommonLibref.scroll(setJurisdictionAccount, "scrollToBottomOFPage", "setInitialUsers");
		wait.until(ExpectedConditions.elementToBeClickable(setInitialUsers));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(setJurisdictionAccount).click(setJurisdictionAccount).build().perform();

		} catch (Exception e) {
			CommonLibref.click(setJurisdictionAccount, "seleniumClick", "setJurisdictionAccount");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

//	wait.until(ExpectedConditions.elementToBeClickable(headingOfManageJurisdictionDetails));
//	try {
//		Thread.sleep(7000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	CommonLibref.click(PrivlageManagementTitle, "seleniumClick", "PrivlageManagementTitle");
		String Hyperlink3Title = manageJurisdictionAccountsTitleXpath.getText();
		Assert.assertEquals(Hyperlink3Title, "Manage Jurisdiction Details");
		ObjectRepo.test.log(Status.PASS, "JSA is navigated to  " + Hyperlink3Title);
		System.out.println("JSA is navigated to  " + Hyperlink3Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}

	public void AddEmailForAdministrartor() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(adminstratorQuickAcion));
		CommonLibref.click(adminstratorQuickAcion, "seleniumClick", "jurisdicitonUserEmails");

		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();

		enterEmailXpath.click();
		String adminEmailId = RandomStringUtils.randomAlphabetic(8);
		StoredAdminEmail = adminEmailId + "@eqanim-qa.wci-validate.org";
		enterEmailXpath.sendKeys(StoredAdminEmail);
	}

	public void StoredAuthorityEmail() {
		AuthorityEmail = emailAuthFieldXpath.getText();
		System.out.println("Email id of Authority" + AuthorityEmail);
		ObjectRepo.test.log(Status.PASS, "Email id of Authority" + AuthorityEmail);
		AuthorityUserId = userIdAuthFieldXpath.getText();

		System.out.println("User id of Authority" + AuthorityUserId);
		ObjectRepo.test.log(Status.PASS, "User id of Authority" + AuthorityUserId);
	}

	public void ClickOnSettingsOptionOnHomePage() {
		wait.until(ExpectedConditions.elementToBeClickable(settingOptionOnHomePage));
		CommonLibref.click(settingOptionOnHomePage, "javascriptClick", "settingOptionOnHomePage");
		System.out.println("Click On Setting option On Home Page");
		ObjectRepo.test.log(Status.PASS, "Click On Setting option On Home Page");

		wait.until(ExpectedConditions.visibilityOf(configurationSettingPageTitle));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = configurationSettingPageTitle.getText();
		Assert.assertEquals(title, "Configuration Settings");
	}

	public void ClickOnJurisdictionUser() {
		wait.until(ExpectedConditions.elementToBeClickable(jurisdicitonUserEmails));
		CommonLibref.click(jurisdicitonUserEmails, "javascriptClick", "jurisdicitonUserEmails");
		System.out.println("Click On Jurisdiction Users Emails");
		ObjectRepo.test.log(Status.PASS, "Click On Jurisdiction Users Emails");
	}

	public void ScrollPageUptoTheEntityAccountSettings() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", entityAccountSettings);
	}

	public void AddEmailForAuthority() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(authorityQuickAcion));
		CommonLibref.click(authorityQuickAcion, "seleniumClick", "jurisdicitonUserEmails");

		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();

		enterEmailXpath.click();
		enterEmailXpath.sendKeys();
	}

	public void AddEmailForJurisdictionProgramStaff(String FilePath, String SheetName, int rowNum, int cellNum) {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionStaffQuickAcion));
		CommonLibref.click(JurisdictionStaffQuickAcion, "seleniumClick", "jurisdicitonUserEmails");

		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();

		enterEmailXpath.click();
		String JSAStaffEmailId = RandomStringUtils.randomAlphabetic(8);
		StoredJSAStaffEmail = JSAStaffEmailId + "@eqanim-qa.wci-validate.org";
		enterEmailXpath.sendKeys(StoredJSAStaffEmail);
	}

	public void AddEmailForJurisdictionSystemAdmin() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionSystemAdminQuickAcion));
		CommonLibref.click(JurisdictionSystemAdminQuickAcion, "seleniumClick", "jurisdicitonUserEmails");

		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();

		enterEmailXpath.click();
		enterEmailXpath.sendKeys("jsaasx@eqanim-qa.wci-validate.org");
	}

	public void AddEmailForRegistrar() {
		System.out.println("Click On Administrator Quick Actions");
		ObjectRepo.test.log(Status.PASS, "Click On Administrator Quick Actions");
		wait.until(ExpectedConditions.elementToBeClickable(registrarQuickAcion));
		CommonLibref.click(registrarQuickAcion, "seleniumClick", "jurisdicitonUserEmails");

		System.out.println("Click On Add to a Group Option");
		ObjectRepo.test.log(Status.PASS, "Click On Add to a Group Option");
		addToAGroupXpath.click();

		enterEmailXpath.click();
		enterEmailXpath.sendKeys("jsaasx@eqanim-qa.wci-validate.org");
	}

	public void ClickOnSaveButtonOnConfigurationSettingPage() {
		System.out.println("Click on Save Button");
		ObjectRepo.test.log(Status.PASS, "Click on Save Button");
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonConfigurationSetting));
		saveButtonConfigurationSetting.click();
	}

	public void PrintDataInJurisdictionUsersEmail() {
		List<WebElement> List2 = driver.get()
				.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelMedium css-11lqbxm']"));
		int size2 = List2.size();

		for (int i = 0; i <= size2 - 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String element = List2.get(i).getText();
			System.out.println("User and Mail displayed as :" + element);
		}
	}

	public void AssertSuccessMessageForStatusChange() {

		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String message = SuccessMessage.getText();
		System.out.println("Success message displayed as - " + message);
		ObjectRepo.test.log(Status.PASS, "Success message displayed as - " + message);
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//
//			CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
//		} catch (Exception e) {
//			CommonLibref.click(crossIcon, "javascriptClick", "crossIcon");
//
//		}
//	}
	}

	public void assertSuccessMessageAfterEmailAddedInNottificationSetting() {
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'Notification Settings Updated')]")).isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void clickOnSubmitButtonOnAddNewAccountPage() {
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid=\"submitBtn\"]")));
		element.click();

	}

	public void WaitUntilQuickActionsDisplayed01() {
		Module5_1_Pom ref1 = new Module5_1_Pom();
//		WebElement firstElement = driver.get().findElement(By.xpath("(//*[@data-testid='MoreHorizIcon'])[1]"));
		for (int i = 0; i < 20; i++) {

			driver.get().navigate().refresh();
			expandAllJurisdictionsOnHomePage();
			ref1.searchNewJurisdiction();
			ref1.scrollHomepageUptoLast();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickOnQuickActions();
			System.out.println("Onboard button is now enabled.");
			break;

		}
	}

	public void fetchJurisdictionNameFromExcelSheet() {
		CommonLibref.pageLoader();
		CommonLibref.scroll(homepageSearchOption, "scrollToBottomOFPage", "homepageSearchOption");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		try {
			CommonLibref.click(homepageSearchOption, "javascriptClick", "homepageSearchOption");
		} catch (Exception e) {
			CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		}
		homepageSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(0));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchJurisdictionNameFromExcelSheet1() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValueForSheet1("JurisdictionInfromation1", 0));
	}

	public void fetchValueFromExcelSheet(String FilePath, String SheetName, int rowNum, int cellNum) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
	}

	public void fetchSeededUserRegistrar() {

		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
//		CommonLibref.click(searchFieldOnInitialUsers01, "seleniumClick", "searchFieldOnInitialUsers01");
//		searchFieldOnInitialUsers01.sendKeys(Keys.CONTROL,"a");
//		searchFieldOnInitialUsers01.sendKeys(Keys.BACK_SPACE);
		searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(2));
	}

	public void verifyTheActiveButtonIsDislayAndClickOnButton() {
		Module5_1_Pom ref01 = new Module5_1_Pom();
		Module5_4_SetupInitialUsers_POM sp = new Module5_4_SetupInitialUsers_POM();
		try {
			ref01.clickOntheFirstUserQuickActions();
			sp.selectActivateFromQuickAction();
			sp.ContinueBtnOfActivateUser();
			sp.ActivateUserSuccessMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTheCancelProposeOptionOnDetailsPage() {
		String option = manageJurisdictionDetailsOption.getText();
		Assert.assertEquals(option, "CANCEL PROPOSED STATUS");
		System.out.println(option + " - button should get displayed under More Actions option");
		ObjectRepo.test.log(Status.PASS, option + "- button should get displayed under More Actions option");
	}

	public void clickOnTheCancelProposeOptionOnDetailsPage() {
		// manageJurisdictionDetailsOption.click();
		cancelProposedStatusOptionOnDetailsPage.click();

		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");

		wait.until(ExpectedConditions.elementToBeClickable(CancelStatusButton));
		CancelStatusButton.click();
		System.out.println("click on 'cancel proposed status' option");
		ObjectRepo.test.log(Status.PASS, "click on 'cancel proposed status' option");

		Common.pageLoader();

		String successsMessage = sucessMessageOfInitialUser.getText();
		Boolean cancelledStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'The request for approval to change the status')]"))
				.isDisplayed();
		Assert.assertTrue(cancelledStatus);
		ObjectRepo.test.log(Status.PASS, "Success message is displayed as -" + successsMessage);
		System.out.println("Success message is displayed as -" + successsMessage);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void verifyThePendingRequestOptionAfterTheCancelProposedStatus() {

		String option = jurisdictionDeatilsOption.getText();
		System.out.println(option + " - Only the Option is display");
		ObjectRepo.test.log(Status.PASS, option + " - Only the Option is display");
	}

	public void ClickOnManageBudgetOption() {
		try {

			managedBugetTextXpath.click();
			ObjectRepo.test.log(Status.PASS, "Click on Bugdet Option");
			System.out.println("Click on Bugdet Option");

		} catch (Exception e) {

			managedBugetXpath.click();
			ObjectRepo.test.log(Status.PASS, "Click on Bugdet Option");
			System.out.println("Click on Bugdet Option");
		}
	}

	public void clickOnTheHoldingLimitId() {
		wait.until(ExpectedConditions.visibilityOfAllElements(clickOnFirstIDOnApprovalPage));
		wait.until(ExpectedConditions.elementToBeClickable(clickOnFirstIDOnApprovalPage));

		String id = clickOnFirstIDOnApprovalPage.getText();
		searchFieldOnMyApproval.sendKeys(id);

		ObjectRepo.test.log(Status.PASS, "First Id of holding limit is " + id);
		System.out.println("First Id of holding limit is " + id);
		clickOnFirstIDOnApprovalPage.click();

	}

	public void searchUserEmailIdOnInitialPage() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOfAllElements(searchFieldOnInitialUsers));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
		searchField.click();
		searchField.sendKeys(Create_Participate_Onboarding_Jurisdiction_Pom.SeededUserAuthorityEmailAddress);
	}

	public void scrollPageUptoTopOfThePage() {
		wait.until(ExpectedConditions.visibilityOfAllElements(btnWelcomeProfileDD));
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfileDD));
		CommonLibref.scroll(btnWelcomeProfileDD, "scrollToTopOFPage", "btnWelcomeProfile DD");
	}

//	public void fetchValueFromExcelSheet(String FilePath, String SheetName, int rowNum, int cellNum) {
//		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
//		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
//		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
//		homepageSearchOption.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//	}

	public void clickOnContinueButton() {
		wait.until(ExpectedConditions.visibilityOf(continueButtonOnDetailsPage));
		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
		try {
			CommonLibref.click(continueButtonOnDetailsPage, "seleniumClick", "continueButtonOnDetailsPage");
		} catch (NoSuchElementException e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(continueButtonOnDetailsPage).click(continueButtonOnDetailsPage).build().perform();
		} catch (Exception ex) {
			CommonLibref.click(continueButtonOnDetailsPage, "javascriptClick", "continueButtonOnDetailsPage");
		}
		ObjectRepo.test.log(Status.PASS,
				"Step : Again click on cancel button of Select Juridistion page and click on continue button on warning popup ");
		System.out.println(
				"Again click on cancel button of Select Juridistion page and click on continue button on warning popup  ");
	}

//	public void assertSuccessMessageonAfterTheUnlinkedJurisdiction() throws InterruptedException {
//		CommonLibref.pageLoader();
//		Boolean proposedForUnlinkedStatus = driver.get()
//				.findElement(By.xpath("//*[contains(text(),'The status of your jurisdiction has been updated.')]"))
//				.isDisplayed();
//		Assert.assertTrue(proposedForUnlinkedStatus);
//
//		wait.until(ExpectedConditions.visibilityOf(crossIcon));
//		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
//	}

	public void selectUnlinkedJurisdiction2ForPrelinkedStatus(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		Common.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction Status");
		System.out.println("Jurisdiction Status is selected");
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		CommonLibref.click(searchFieldOfJurisdictionStatus, "javascriptClick", "searchFieldOfJurisdictionStatus");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.CONTROL, "a");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.BACK_SPACE);
		searchFieldOfJurisdictionStatus.sendKeys("Pre-Linked");
		searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
		Common.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(statusInJurisdictionStatusFiled));
		PrelinkedJurisdictionStatus = statusInJurisdictionStatusFiled.getAttribute("value");
		System.out.println("Option1 is displayed as- " + PrelinkedJurisdictionStatus);
		ObjectRepo.test.log(Status.PASS, "Option1 is displayed as- " + PrelinkedJurisdictionStatus);
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdiction));
		searchFieldOfJurisdiction.click();
		searchFieldOfJurisdiction.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		searchFieldOfJurisdiction.sendKeys(Keys.ENTER);
		selectJurisdiction = saveJurisdicion.getAttribute("value");
		ObjectRepo.test.log(Status.PASS, "Step : Select Jurisdiction from Dropdown - " + selectJurisdiction);
		System.out.println("Step : Select Jurisdiction from Dropdown - " + selectJurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
	}

	public void assertSuccessMessageAfterCancelProposedStatus() throws InterruptedException {
		CommonLibref.pageLoader();
		Boolean proposedForUnlinkedStatus = driver.get()
				.findElement(By.xpath("//*[contains(text(),'to “Linked” has been cancelled successfully')]"))
				.isDisplayed();
		Assert.assertTrue(proposedForUnlinkedStatus);

		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}
//
//	public void clickOnContinueButton() {
//		wait.until(ExpectedConditions.visibilityOf(continueButtonOnDetailsPage));
//		wait.until(ExpectedConditions.elementToBeClickable(continueButtonOnDetailsPage));
//		try {
//			CommonLibref.click(continueButtonOnDetailsPage, "seleniumClick", "continueButtonOnDetailsPage");
//		} catch (NoSuchElementException e) {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(continueButtonOnDetailsPage).click(continueButtonOnDetailsPage).build().perform();
//		} catch (Exception ex) {
//			CommonLibref.click(continueButtonOnDetailsPage, "javascriptClick", "continueButtonOnDetailsPage");
//		}
//		ObjectRepo.test.log(Status.PASS,
//				"Step : Again click on cancel button of Select Juridistion page and click on continue button on warning popup ");
//		System.out.println(
//				"Again click on cancel button of Select Juridistion page and click on continue button on warning popup  ");
//	}

	public void verifyTheJurisdictionFiledDisplayOrNot() {
//		jurisdictionFieldOnStatusPage
		try {
			Boolean jurisdictionField = driver.get().findElement(By.xpath("(//*[@for='customize-select'])[2]"))
					.isDisplayed();
			Assert.assertTrue(jurisdictionField);
		} catch (Exception e) {
			ObjectRepo.test.log(Status.PASS,
					"Un-Linked option is selected and Jurisdictions dropdown is not displayed.");
			System.out.println("Un-Linked option is selected and Jurisdictions dropdown is not displayed.");
		}
	}

	public void verifyTheActivateOption() {
		Boolean jurisdictionField = driver.get().findElement(By.xpath("//p[text()='ACTIVATE']")).isDisplayed();
		Assert.assertTrue(jurisdictionField);
	}

	public void assertJurisdictionStatusFieldAfterTheProposedForStatusChange() {
		wait.until(ExpectedConditions.visibilityOf(jurisdicitionStatusFieldXpath));
		wait.until(ExpectedConditions.elementToBeClickable(jurisdicitionStatusFieldXpath));
		String value = jurisdicitionStatusFieldXpath.getText();
		ObjectRepo.test.log(Status.PASS,
				"Wci inc admin should get navigated to the Manage Jurisdiction Status page and jurisdiction status is display like "
						+ value + " in read only without cancel and save option.");
		System.out.println(
				"Wci inc admin should get navigated to the Manage Jurisdiction Status page and jurisdiction status is display like "
						+ value + " in read only without cancel and save option.");
	}

	public void assertSuccessMessageAfterTheRevisionRequested() throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);

		System.out.println("Message displayed as -" + successMessage);
//		Boolean proposedForUnlinkedStatus = driver.get()
//				.findElement(By.xpath("//*[contains(text(),'Your request for revisions has been submitted successfully')]"))
//				.isDisplayed();
//		Assert.(proposedForUnlinkedStatus);
		Thread.sleep(4000);
		Assert.assertEquals(successMessage, "Your request for revisions has been submitted successfully");
		wait.until(ExpectedConditions.visibilityOf(crossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void addNewAccount() {
		wait.until(ExpectedConditions.visibilityOf(testIdSubmitButton));
		wait.until(ExpectedConditions.elementToBeClickable(testIdSubmitButton));
		CommonLibref.click(testIdSubmitButton, "seleniumClick", "testIdSubmitButton");
		ObjectRepo.test.log(Status.PASS, "Click On Add New Account Button");
		System.out.println("Click On Add New Account Button");
	}

	public void addAccountName() {
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

	public void searchActiveUserFromTable(String FilePath, String SheetName, int rowNum, int cellNum) {
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers));
		searchFieldOnInitialUsers.click();
		searchFieldOnInitialUsers.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
	}
	public void verifyTheMoreAcionsButtonEnableOrNot() {
			if (moreOptionManagedDetailsPage.isEnabled()) {
				System.out.println("More Actions option is enabled on Manage Jurisdiction Accounts page to add Jurisdiction accounts again");
			} else {
				System.out.println("More Actions option is not enable on Manage Jurisdiction Accounts page to add Jurisdiction accounts again");
			}
	}
}
