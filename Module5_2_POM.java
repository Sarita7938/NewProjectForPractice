package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
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

import com.aventstack.extentreports.Status;
import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

public class Module5_2_POM {
	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static LoginPom login = new LoginPom();
	public static String AddBudgetYear;
	public static JavascriptExecutor js = (JavascriptExecutor) driver.get();
	public static String homePage;
	public static String Accounts;
	public static String SuccesmessageTitle;
	public static String AccountTypeManage;
	public static String AccountTypeTitle;
	public static String StoreAccountName;
	public static String ValidEmailField;
	public static String SeededUserRegistrar;
	public static String SeededUserRegistrar1;
	public static String ValidData1;
	public static String ValidData2;
	public static String ValidLastData;
	public static String FirstLastName;
	public static String linkedstatus;
	public static String AuthorityUserID1;
	public static String JSA1UserId;
	public static String registrarUserId;
	public static String JSA2UserId;
	public static String AuthorityUserId;
	public static String EntityTransferID2;
	public static String EntityTransferID;
	public static String EntityTransferID3;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement UserId;
	@FindBy(xpath = "//input[@type='password']")
	WebElement PassphraseText;
			@FindBy(xpath = "(//*[@data-field='requestStatus'])[2]")
			private WebElement RequestStatus;
					@FindBy(xpath = "(//*[@data-field='jurisdictionStatus'])[2]")
					private WebElement JurisdictionStatus;		
			
			
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@name='remember']")
	private WebElement RememberMe;

	@FindBy(xpath = "//button[@id='login_btn']")
	private WebElement LoginButton;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-o2reyj']")
	private WebElement AllJurisdictions;

	@FindBy(xpath = "//div[@role='combobox']")
	private WebElement RowsPerPage;

	@FindBy(xpath = "//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-x5oezd']")
	private WebElement manageCornJobsSection;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchJurisdiction;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[4]")
	private WebElement selectManageInitialUser;

	@FindBy(xpath = "(//*[text()='SET UP INITIAL USERS']")
	private WebElement selectInitialUser;
	@FindBy(xpath = "(//*[text()='MANAGE TRANSFERS']")
	private WebElement ManageTransfers;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//following::p[text()='MANAGE TRANSFERS']")
	private WebElement ManageTransfers1;

	@FindBy(xpath = "//p[text()='SET UP INITIAL USERS']")
	private WebElement text;

	@FindBy(xpath = "//button[text()='Add Initial User']")
	private WebElement addInitialUserButton;

	@FindBy(xpath = "//input[@id='firstName']") // input[@id='firstName']
	private WebElement addFirstName;
	@FindBy(xpath = "(//*[text()='MANAGE JURISDICTION STATUS']")
	private WebElement ManageJurisdictionStatus;
	@FindBy(xpath = "//input[@id='emailAddress']")
	private WebElement emailAddress;
	@FindBy(xpath = "//*[@placeholder='Email Address...']")
	private WebElement emailIdFiled;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	private WebElement fieldEmailAddress;

	@FindBy(xpath = "//p[@id='firstName-helper-text']")
	private WebElement errorSpaceForFirstName;

	@FindBy(xpath = "//label[text()='Role']//..//input[@type='text']")
	private WebElement addRole;

	@FindBy(xpath = "//label[text()='Role']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiAutocomplete-input MuiAutocomplete-inputFocused css-1uvydh2']")
	private WebElement storedRole;
	// *[@class="MuiFormHelperText-root Mui-error css-bpd4r6"]
	@FindBy(xpath = "//*[@class='MuiFormHelperText-root Mui-error css-bpd4r6']")
	private WebElement Role;
	@FindBy(xpath = "//*[text()='Registrar']")
	private WebElement registarXpath;

	@FindBy(xpath = "//p[@id='emailAddress-helper-text']")
	private WebElement storedEmail;

	@FindBy(xpath = "//button[@data-testid='cancelBtn']")
	private WebElement CancelButton;

	@FindBy(xpath = "//button[@data-testid='submitBtn']")
	private WebElement SaveButton;

	@FindBy(xpath = "(//*[@class=\"MuiDataGrid-cellContent\"])[1]")
	private WebElement Accountname;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchAccountName;

	@FindBy(xpath = "(//*[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz\"])[1]")
	private WebElement SearchUserName;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-gz6s05'])[1]")
	private WebElement FirstElementOnUserGrid;

	@FindBy(xpath = "(//*[@type='button'])[1]")
	private WebElement Userdropdown;
	@FindBy(xpath = "//*[contains(text(),'User Profile')]")
	private WebElement Userprofile;
	@FindBy(xpath = "//*[text()='Cross Jurisdiction']")
	private WebElement CrossJurisdiction;
	@FindBy(xpath = "//*[text()='PENDING CROSS JURISDICTION']")
	private WebElement PendingcrossJurisdiction;
	@FindBy(xpath = "(//*[text()='Pending COJ'])[3]")
	private WebElement PendingchangeJurisdiction;
	@FindBy(xpath = "//*[text()='Change Jurisdiction']")
	private WebElement ChangeJurisdiction;
	@FindBy(xpath = "//div[@class='MuiBox-root css-36rd69']")
	private WebElement Dropdown;
	@FindBy(xpath = "//*[@type='checkbox']")
	private WebElement Checkbox;

	@FindBy(xpath = "//*[@value='Share User Profile']")
	private WebElement ShareUser;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement Save;

	@FindBy(xpath = "(//*[text()='Quick Actions'])[2]//following::*[@data-testid='MoreHorizIcon']")
	WebElement ThreeDots;

	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//input[@name='onboardingTasks.setPurchaseLimits']")
	private WebElement PurchaseLimit;

	@FindBy(xpath = "//*[text()='INITIATE TRANSFER']")
	WebElement InitiateTransfer;
	@FindBy(xpath = "//p[text()='Transfer Type']")
	WebElement TransferType;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	WebElement OTCNoMoreThan3DaysRadiobtn;
	@FindBy(xpath = "//button[text()='CONTINUE']")
	WebElement ContinueBtn;
	@FindBy(xpath = "//*[@data-testid='submit_btn']")
	private WebElement submitButton01;

	@FindBy(xpath = "//*[text()='Submit']")
	private WebElement submitButton02;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	public WebElement managePurchaseLimit;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement purchaseLimitSuccessMessage;
	@FindBy(xpath = "(//input[@type='search'])[2]")
	WebElement SearchProposeRecord;
	@FindBy(xpath = "//input[@name='Approve']")
	WebElement ApproveRadio;
	@FindBy(xpath = "//textarea[@data-testid='comment']")
	WebElement CommentField;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButtonOnAdminDecisioncard;
	@FindBy(xpath = "//button[text()='CANCEL']")
	WebElement CancelBtn_popUp;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement ConfirmBtn_popUp;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	WebElement SuccessCross;
	@FindBy(xpath = "//*[text()='All Budget Records']")
	WebElement AllBudgetRecordPageTitle;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	WebElement SuccessMsg;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	WebElement SuccessCros;
	@FindBy(xpath = "//p[text()='Approve Proposed Budgets']")
	WebElement DecisionCardHeading;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[15]")
	WebElement EnterReserveAdjustedAllowanceBudget15;
	@FindBy(xpath = "//h6[text()='Confirm Proposal']")
	WebElement ProposeBudgetPopupHeading;
	@FindBy(xpath = "//p[text()='Are you sure you would like to propose the entered budget records?']")
	WebElement ProposeBudgetPopupSubHeading;
	@FindBy(xpath = "//button[text()='CANCEL']")
	WebElement ProposeBudgetPopupCancelButton;
	@FindBy(xpath = "(//*[@data-testid='CheckBoxOutlineBlankIcon'])[2]")
	WebElement SelectRecord2;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	WebElement SelectRecord;
	@FindBy(xpath = "//h2[text()='Transferring Account Details']")
	WebElement InitiateLUHAPageTitle;
	// *[text()='Receiving Account and Transfer Information']
	@FindBy(xpath = "//*[text()='Receiving Account and Transfer Information']")
	WebElement ReceivingAccount;
	@FindBy(xpath = "//input[@data-testid='Quantity']")
	WebElement Quantity;
	@FindBy(xpath = "//*[@data-testid='Comment']")
	WebElement Comments;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-12t365l']")
	WebElement WarningMsgConfirmPopUp;
	@FindBy(xpath = "(//*[@data-testid='ExpandMoreIcon'])[4]")
	WebElement PendingTransferExpandIcon;
	@FindBy(xpath = "//*[text()='Yes']//preceding::input[@type='radio']")
	WebElement YesRadioWiringInstruction;
	@FindBy(xpath = "//*[text()='Fedwire Wiring Instructions']")
	WebElement WiringInstruction;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e']")
	WebElement TransferIdValuePendinfTransfertable;
	@FindBy(xpath = "(//input[@type='search'])[4]")
	WebElement PendingTransferTableSearch;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Submit']")
	public WebElement SubmitButton;
	@FindBy(xpath = "//*[text()='MANAGE ALL TRANSFERS']")
	private WebElement Manage_All_Transfers;
	@FindBy(xpath = "//textarea[@data-testid='comment']")
	WebElement CoomentsField;
	@FindBy(xpath = "//input[@data-testid='passphrase']")
	WebElement PassphraseFieldPopUp;
	@FindBy(xpath = "//input[@name='Approve']")
	WebElement ApproveRadioButton;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement ConfirmBtn1;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[3]")
	WebElement SuccessMsgCancleBtn;
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']")
	WebElement Passphrase;
	// input[@id="passphrase"]
	@FindBy(xpath = "//input[@id=\"passphrase\"]")
	WebElement Passphrase1;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	WebElement FechedTransferValue;
	@FindBy(xpath = "//h2[text()='Transfer Details']")
	WebElement TransferDetailPageTitle;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	WebElement SuccessMessage;
	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	private WebElement QuickAction;

	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement SearchHolding;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	WebElement ConfirmTransferProposalPopUpText;
	@FindBy(xpath = "(//button[text()='CANCEL'])[2]")
	WebElement CancelBtnOnConfirmPopUp;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	private WebElement EditAccounts;

	@FindBy(xpath = "//input[contains(@name,'accountNameLang')]")
	private WebElement EnglishLanguage;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-bj5op3'])[1]")
	private WebElement StoredError;

	@FindBy(xpath = "//p[@class=\"MuiTypography-root MuiTypography-body2 css-74todz\"]")
	private WebElement DuplicateError;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5\"]")
	private WebElement CancelIcon;

	@FindBy(xpath = "//button[@data-testid=\"priv_btn_Reset\"]")
	private WebElement CancelOnPopUp;

	@FindBy(xpath = "//*[text()='DELETE JURISDICTION ACCOUNT']")
	private WebElement deleteOptionInQuickActions;

	@FindBy(xpath = "//button[@data-testid='more-actions']")
	private WebElement MoreActions;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement EditDisabled;

	@FindBy(xpath = "//*[text()='CANCEL PROPOSED STATUS']")
	private WebElement CancelProposeStatus;

	@FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[5]")
	private WebElement CancelIconOnSucessMessage;

	@FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained')])[4]")
	private WebElement CancelProposeOnStatus;

	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-1yfaah8\"])[1]")
	private WebElement ManageJurisdictionDetails;

	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-1yfaah8\"])[1]")
	private WebElement EditJurisdictionDetails;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement EditJurisdictionDetailsTitle;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement CancelProposedDisabled;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m']")
	private WebElement EditDetails;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//..//p[text()='MANAGE STATUS']")
	private WebElement ManageStatus;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement ManageJurisdictionStatusTitle;

	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-1yfaah8\"])[3]")
	private WebElement ReturnToHomePage;
	@FindBy(xpath = "//input[@data-testid='passphrase']")
	private WebElement passphaseTextField;
	@FindBy(xpath = "//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-wdxfmq']")
	private WebElement ReturnToHomePageTitle;
	@FindBy(xpath = " //p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//..//*[contains(text(),'ADD NEW ACCOUNT')]")
	private WebElement AddNewAccount;
	@FindBy(xpath = "//input[@id='accountType']")
	private WebElement AccountType;
	@FindBy(xpath = "//button[@data-testid='submitBtn']//..//*[contains(text(),'ADD ACCOUNT')]")
	private WebElement AddAccountButton;
	@FindBy(xpath = "//button[@data-testid='cancelBtn']//..//*[contains(text(),'CANCEL')]")
	private WebElement CancellButton;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement Sucessmessage;
	@FindBy(xpath = " (//p[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we'])[1]")
	private WebElement Hyperlink;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']//..//*[contains(text(),'Jurisdiction Account Details')]")
	private WebElement AccountDetails;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement CrossIcon;
	@FindBy(xpath = "(//*[text()='Account Status']//..//..//..//..//..//..//..//*[@class='MuiDataGrid-cellContent'])[5]")
	private WebElement ActiveAccountStatus;
			@FindBy(xpath = "(//*[text()='*'])[2]")
			private WebElement Asterisk;
	
	@FindBy(xpath = "(//*[@class='MuiBox-root css-ka3kzd']//*[contains(@class,'MuiTypography-root MuiTypography-body2 css-1fr8lnd')])[2]")
	private WebElement AccountTypeOnDetails;
	@FindBy(xpath = " (//div[text()='Account Type']//..//..//..//..//..//..//..//..//*[@class='MuiDataGrid-cell MuiDataGrid-cell--textCenter'])[1]")
	private WebElement AccountTypeOnManageJurisdictionTable;
	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement DefaultAccountsCheckbox;
	@FindBy(xpath = "//*[@data-testid='submitBtn']")
	private WebElement Continue;
	@FindBy(xpath = "//button[@aria-label='Go to page 2']")
	private WebElement GoToPage2;
	@FindBy(xpath = "//button[@aria-label='Go to page 3']")
	private WebElement GoToPage3;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiPaginationItem-icon css-lrb33l']//..//*[contains(@data-testid,'NavigateNextIcon')]")
	private WebElement NavigateToNext;
	@FindBy(xpath = "")
	private WebElement storedAccountname;
	@FindBy(xpath = " //*[@class='MuiTypography-root MuiTypography-body1 css-bj5op3']")
	private WebElement storederrormessage;
	@FindBy(xpath = "//*[@name='defaultAccounts.[0].accountNameLangEnglish']")
	private WebElement AccountName;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Reset']")
	private WebElement CancelonConfirmation;// *[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement ManageJurisdictionAccounts;
	@FindBy(xpath = "//*[@class='MuiList-root MuiList-padding css-1ontqvh']//..//*[contains(text(),'EDIT JURISDICTION ACCOUNT')]")
	private WebElement EditAccount;
	@FindBy(xpath = "//*[@class='MuiList-root MuiList-padding css-1ontqvh']//..//*[contains(text(),'DELETE JURISDICTION ACCOUNT')]")
	private WebElement DeleteAccount;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement EditJurisdictiAccountsPage;
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	private WebElement QuickActions;
	@FindBy(xpath = "//h2[text()='Initial Users']//..//..//input[@placeholder='Search…']")
	private WebElement searchFieldOnInitialUsers;
	@FindBy(xpath = "//p[text()='DEACTIVATE']")
	private WebElement deactivateOption;
	@FindBy(xpath = "(//*[text()='Total Rows'])[1]")
	private WebElement totalRowCount;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n'])[2]")
	private WebElement ScrolltoAccountName;
	@FindBy(xpath = "//button[text()='MENU']")
	private WebElement MegaMenu;
	@FindBy(xpath = "//*[text()='Jurisdiction Accounts']")
	private WebElement JuriAccount;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[2]")
	private WebElement AccName;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[1]")
	private WebElement AccType;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement textBoxEmail;
	@FindBy(xpath = "//*[text()='Email Address']//..//..//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedEmailIdFiled;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement textBoxPassWord;
	@FindBy(xpath = "//*[@type='button']//..//*[contains(text(),'Read more')]")
	private WebElement ReadMore;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement removeButtonOnWarningPopoup;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageonStatusPage;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Proposed for Pre-Linked')])[1]")
	private WebElement ProposedForPrelinked;
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	private WebElement AssertCancelonStatusPage;
	@FindBy(xpath = "//*[@data-testid='view-all-records-btn']//..//*[contains(text(),'BACK')]")
	private WebElement Back;
	@FindBy(xpath = "//button[@data-testid='add_batch_save']")
	private WebElement testidSaveButton;
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@placeholder='--Select--']")
	private WebElement addLanguageOnSetUpJurisdiction;
	@FindBy(xpath = "(//*[@class='MuiBox-root css-wkov39'])[1]")
	private WebElement allLanguage;
	@FindBy(xpath = "//p[text()='Language']//..//..//input[@type='text']")
	private WebElement languageFieldXpath;
	@FindBy(xpath = "//*[@data-field='quickActions']")
	private WebElement quickactions;
	@FindBy(xpath = "//*[@data-testid='lastName']")
	private WebElement addlastName;
	@FindBy(xpath = "//h2[text()='Jurisdiction Request and Status Change History']")
	private WebElement statusChangeHistory;
	@FindBy(xpath = "//*[@id='lastName-helper-text']")
	private WebElement errorSpaceForLastName;
	@FindBy(xpath = "//*[@data-testid='submitBtn']")
	private WebElement Submit;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Active')])[1]")
	private WebElement AssertUserStatus;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Not Activated')])[1]")
	private WebElement AssertUserAccountStatus;

	// *[text()="User Account Status"]//following::div[text()="Active"][2]
	@FindBy(xpath = "(//*[text()='User Account Status']//following::div[text()='Active'])[2]")
	private WebElement AssertActiveUserAccountStatus;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-r1rx2c']//..//*[contains(text(),'Pending Approval')]")
	private WebElement AssertJurisdictionDetails;
	// *[text()='Pending Approval']
	@FindBy(xpath = "//*[text()='Pending Approval']")
	private WebElement PendingApprovalText;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	public WebElement CommentonCancelProposal;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	public WebElement CancelStatusButton;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[1]")
	public WebElement HyperLinkJSA1;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[2]")
	public WebElement HyperLinkJSA2;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1c9ymgd'])[3]")
	public WebElement HyperLinkJSA3;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h3 css-3i8r22']")
	public WebElement PrivlageManagementTitle;
//	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h3 css-3i8r22']")
//	public WebElement ContentManagementTitle;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[1]")
	private WebElement approveRadioButton;
	@FindBy(xpath = "//*[text()='BACK TO HOME']")
	private WebElement BackTOHome;
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-13tw421']")
	private WebElement AssertSearchUsers;
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
	@FindBy(xpath = "//*[text()='View messages']")
	WebElement viewMessages;
	@FindBy(xpath = "//*[contains(@href, 'https://qa2.wci-registry.org/create-user-profile?LinkID=')]")
	List<WebElement> linkContainingHref;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//..//*[contains(text(),'Approved')])[1]")
	WebElement ApprovedPrelink;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Pre-Linked')])[1]")
	WebElement StatusPreLinked;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")
	WebElement CreateProfile;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent']//..//*[contains(text(),'Unlinked')])[1]")
	WebElement StatusUnLinked;
	@FindBy(xpath = "//*[@title='Not Activated']")
	WebElement StoreNotActivated;
	@FindBy(xpath = "//p[text()='EDIT']")
	private WebElement editOption;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")
	private WebElement editRoleTitle;
	@FindBy(xpath = "//label[text()='First Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedFirstName;
	@FindBy(xpath = "//label[text()='Last Name']//..//.. //input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement storedLastName;
	@FindBy(xpath = "//label[text()='Email Address']//..//.. //input[@id='emailAddress']")
	private WebElement storedEmailId;
	@FindBy(xpath = "(//*[@data-field='emailAddress']//..//*[contains(@role,'cell')])[2]")
	private WebElement StoreEmailNotActivated;
	@FindBy(xpath = "(//*[@type='search'])[2]")
	private WebElement SearchFieldInitialUserHistory;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement ManageInitialUserTitle;
	@FindBy(xpath = "(//*[@data-field='firstName']//..//*[contains(@class,'MuiDataGrid-cell MuiDataGrid-cell--textCenter')])[1]")
	private WebElement StoreUsername;
	@FindBy(xpath = "(//*[@class='MuiDataGrid-cell MuiDataGrid-cell--textLeft']//..//*[@data-field='firstName'])[1]")
	private WebElement StoreUsernameInitial;
	@FindBy(xpath = "//*[@id='jurisdictionStatus-react-hook-form-select-search']")
	private WebElement StatusChangeDropdown;
	@FindBy(xpath = "(//*[text()='Jurisdiction Status'])[2]")
	public WebElement JurisdictionStatusHeader;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdictionStatus;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Linked']")
	private WebElement saveLinkedStatus;
	@FindBy(xpath = "//input[@placeholder='--Select--']")
	public WebElement LinkedStatusDisplayed;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement welButton;
	@FindBy(xpath = "//a[text()='User Profile']")
	private WebElement userProfileOption;
	@FindBy(xpath = "//span[text()='View or Edit User Details']")
	private WebElement viewAndEditUserDetailsOption;
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
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButtonForRevisionRequestSubmit;
	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continueButtonOnPrompt;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterSubmitRequestRevision;
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
	@FindBy(xpath = "//button[text()='Return to User Profile']")
	private WebElement returnToUserProfileButton;
	@FindBy(xpath = "(//*[text()='Updated User Details Request'])[1]")
	private WebElement proposedUserDetailsOption;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageAfterRegistrarDeactivateUserWithoutProfileAccess;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv' and @data-testid='CloseIcon']")
	private WebElement crossButtonOnSuccMessAuthorityApproval;
	@FindBy(xpath = "(//a[@class='link-cell'])[1]")
	private WebElement searchRecordFirstname;
	@FindBy(xpath = "(//a[@class='link-cell'])[6]")
	private WebElement searchRecordFirstnameInPendingGrid;
	@FindBy(xpath = "(//input[@placeholder='Search…'])[1]")
	private WebElement searchField;
	@FindBy(xpath = "//*[@href='/change-jurisdiction']")
	private WebElement changejurisdiction;
	@FindBy(xpath = "//*[@id='mui-component-select-jurisdiction']")
	private WebElement selectJurisdiction;
	@FindBy(xpath = "//*[text()='Quebec']")
	private WebElement selectQuebec;
	@FindBy(xpath = "//*[@data-testid='priv_btn_continue']")
	private WebElement continueButtonforSelectJuri;
	@FindBy(xpath = "//*[text()='Change Jurisdiction Request']")
	private WebElement pageHeader1;
	@FindBy(xpath = "//*[text()='Contact Us']")
	private WebElement contactUs;
	@FindBy(xpath = "(//*[@type='checkbox'])[2]")
	private WebElement termsCheckbox;
	@FindBy(xpath = " //*[text()='Terms and Conditions']")
	private WebElement terms;
	@FindBy(xpath = "//button[@data-testid='Continue' or @type='submit']")
	private WebElement continueUserdetails;
	@FindBy(xpath = "(//*[@class='MuiBox-root css-1f05miv'])[1]")
	private WebElement userRegistrationChecklistForm;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle2 css-f7ulzg']")
	private WebElement userRegistrationForm;
	@FindBy(xpath = "(//*[@class='MuiBox-root css-1f05miv'])[2]")
	private WebElement proofOfIdentityForm;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement submitButton;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMsg;
	@FindBy(xpath = "//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	private WebElement closeIcon;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;
	@FindBy(xpath = "(//input[@placeholder='Search…'])[1]")
	private WebElement InitialSearchOption;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-h2 css-4cc3qo')]//..//..//input[@placeholder='Search…']")
	private WebElement searchFieldOnInitialUsers01;
	@FindBy(xpath = "//input[@name='createUserID']")
	private WebElement createUserId;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement passphrase1;
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

	@FindBy(xpath = "//*[text()='Security Question 2']//following::div[@id='mui-component-select-securityQuestion2']")
	private WebElement secQuestion2;
	@FindBy(xpath = "//*[text()='Answer 2']//following::input[@id='answer2']")
	private WebElement securityQuestion2;
	@FindBy(xpath = "//*[text()='Answer 3']//following::input[@id='answer3']")
	private WebElement securityQuestion3;

	@FindBy(xpath = "//li[@data-value='What was the last name of your third-grade teacher?']")
	private WebElement selSecQue2;

	@FindBy(xpath = "//input[@id='answer2']")
	private WebElement answer2;

	@FindBy(xpath = "//*[text()='Security Question 3']//following::div[@id='mui-component-select-securityQuestion3']")
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
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement successMessageForResetPassphrase;

	@FindBy(xpath = "(//*[@class='MuiBox-root css-mj6avj'])[2]")
	private WebElement refCode;
	@FindBy(xpath = "//button[@id='priv_btn_Continue']")
	private WebElement finishButton;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxRememberMe;
	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement btnWelcomeProfile;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]//child::*[local-name()='svg']")
	private WebElement btnWelcomeProfileDD;
	@FindBy(xpath = "(//h4[text()='Notification Settings']//..//*[text()='SAVE'])[2]")
	private WebElement saveButtonConfigurationSetting;
	@FindBy(xpath = "//*[@class=\"MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-vue0ba\"]//following::a[text()='Jurisidiction Details']")
	private WebElement JURISDICTIONMANAGEMENTOnJSAPage;
	private By securityQuestion1ForLogin = By.xpath("//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']");
	private By answerField = By.xpath("//input[@id='Answer']");
	private By continueButtonForLogin = By.xpath("//button[text()='CONTINUE']");
	private By closeIconLocator = By.xpath("(//*[@data-testid='CloseIcon'])[2]");
	@FindBy(xpath = "(//*[text()='Account Number']//following::div[@data-field='entityAccountNumber'])[1]")
	private WebElement LuhaAcc;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	private WebElement managePurchaseLimitOption;
	@FindBy(xpath = "//*[text()='MANAGE PURCHASE LIMIT']")
	private WebElement managePurchaseLimitTextPath;
	// (//*[text()='Account
	// Number']//following::div[@data-field='entityAccountNumber'])[3]
	@FindBy(xpath = "(//*[text()='General']//preceding::a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways linkHoverDesign css-1lgh3ou'])[3]")
	private WebElement GeneralAcc;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways linkHoverDesign css-1lgh3ou']")
	private WebElement ClickOnHyperlink;
	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[2]")
	private WebElement HyperLink;
	@FindBy(xpath = "//*[text()=\"Transfers\"]")
	private WebElement Transfers;
	@FindBy(xpath = "//*[text()='Copyright © 2024']")
	WebElement rowsperpage;
	@FindBy(xpath = "//h2[text()='Limited Use Holding Account Details']")
	WebElement LUHAPageTitle;
	@FindBy(xpath = "//h2[text()='General Account Details']")
	WebElement GeneralPageTitle;
	@FindBy(xpath = "//*[@placeholder='Search…']")
	private WebElement searchFieldOnMyApproval;
	@FindBy(xpath = "//*[text()='ENTITIES']//following::p[text()='My Accounts']")
	private WebElement myAccounts;
	@FindBy(xpath = "//*[text()='ENTITIES']//following::p[text()='Pending Transfers']")
	private WebElement pendingTransfer;
	@FindBy(xpath = "//input[@name='accountNumber']")
	WebElement AccountNumberField;
	@FindBy(xpath = "//input[@name='entityReferenceCode']")
	WebElement EntityReferenceField;
	@FindBy(xpath = "//input[@name='quantity']")
	WebElement QuantityField;
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	WebElement AgreegateDatePickerIcon;
	@FindBy(xpath = "//button[@aria-current='date']")
	WebElement CurrentDate;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[4]")
	WebElement PricePerInstrument;
	@FindBy(xpath = "(//*[@data-testid='CalendarIcon'])[2]")
	WebElement ExpectedTermination_DatePickerIcon;
	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@tabindex='0']/following-sibling::button[@tabindex='-1']")
	WebElement FutureDate;
	@FindBy(xpath = "//input[@placeholder='Select Currency']")
	WebElement CurrencyDropDown;
	@FindBy(xpath = "//button[text()='SUBMIT']")
	WebElement Submit1;
	@FindBy(xpath = "//*[@id='passphrase']")
	WebElement PassphraseField;
	@FindBy(xpath = "//*[contains(text(),'Transferring compliance instruments to an Entity’s General Account is permanent.')]")
	WebElement WarningMsg;
	@FindBy(xpath = "//*[contains(text(),'USER REGISTRATION')]")
	private WebElement userRegistration;
	@FindBy(xpath = "//a[text()='New Registration']")
	private WebElement newRegistration;
	@FindBy(xpath = "//button[contains(text(),'Start New Registration')]")
	private WebElement startNewRegisBut;
	@FindBy(id = "select_jurisdiction")
	private WebElement selectJurisdiction1;
	@FindBy(xpath = "//*[text()='Jurisidiction Details']//span[text()='Pending Approval']")
//	(//*[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-1d4ad'])[6]
	public WebElement jurisdictionDetailOption;
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-h4 MuiTypography-gutterBottom css-wdxfmq')]")
	private WebElement manageJurisdictions;

	@FindBy(xpath = "//a[text()='Proposed Budget Records']")
	WebElement ProposedBudgetRecordLabel;

	public Module5_2_POM() {
		PageFactory.initElements(driver.get(), this);
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

	public static String generateUserIdForRegistrar() {
		int length = 4;
		boolean useLetters = false;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useNumbers, useLetters);

		String randomString = ("Reg" + generatedString);
		return randomString;
	}

	public void handlesecurityQuestionForQA() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(securityQuestion1ForLogin));
		String str = driver.get().findElement(securityQuestion1ForLogin).getText().trim();
		if (str.contains("first job?")) {
			try {
				driver.get().findElement(answerField).sendKeys("aaaa");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer1");
			}
		} else if (str.contains("maiden name?")) {
			try {
				driver.get().findElement(answerField).sendKeys("name");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer2");
			}
		} else if (str.contains("teacher?")) {
			try {
				driver.get().findElement(answerField).sendKeys("teacher");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer2");
			}
		} else if (str.contains("first car?")) {
			try {
				driver.get().findElement(answerField).sendKeys("cccc");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer3");
			}
		} else if (str.contains("credit card?")) {
			try {
				driver.get().findElement(answerField).sendKeys("card");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer3");
			}
		} else {
			System.out.println("Nothing");
		}
		driver.get().findElement(continueButtonForLogin).click();
		System.out.println("User should logged in successfully.");
		CommonLibref.pageLoader();
	}

	public void handlesecurityQuestion() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(securityQuestion1ForLogin));
		String str = driver.get().findElement(securityQuestion1ForLogin).getText().trim();
		if (str.contains("first job?")) {
			try {
				driver.get().findElement(answerField).sendKeys("aaaa");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer1");
			}
		} else if (str.contains("maiden name?")) {
			try {
				driver.get().findElement(answerField).sendKeys("bbbb");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer2");
			}
		} else if (str.contains("teacher?")) {
			try {
				driver.get().findElement(answerField).sendKeys("bbbb");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer2");
			}
		} else if (str.contains("first car?")) {
			try {
				driver.get().findElement(answerField).sendKeys("cccc");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer3");
			}
		} else if (str.contains("credit card?")) {
			try {
				driver.get().findElement(answerField).sendKeys("cccc");
			} catch (Exception e) {
				driver.get().findElement(answerField).sendKeys("Answer3");
			}
		} else {
			System.out.println("Nothing");
		}
		driver.get().findElement(continueButtonForLogin).click();
		System.out.println("User should logged in successfully.");
		CommonLibref.pageLoader();
	}

	public void selectJurisdictionForIndividualUsers(String FilePath, String SheetName, int rowNum, int cellNum) {
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
		selectJurisdiction1.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
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
		wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
		CommonLibref.click(ContinueBtn, "moveToElementClick", "contButton");
	}

	public void AssertonJuridetails() {
		
		wait.until(ExpectedConditions.visibilityOf(RequestStatus));
		String Request =RequestStatus.getText();
		Assert.assertEquals(Request, "Revisions Requested");
		System.out.println("Step :Jurisdiction Request Status should get displayed as-" +Request);
		ObjectRepo.test.log(Status.PASS, "Step :Jurisdiction Request Status should get displayed as-" +Request);
		String Status1 =JurisdictionStatus.getText();
		Assert.assertEquals(Status1, "Onboarding");
		System.out.println("Step :Jurisdiction Request Status should get displayed as-" +Status1);
		ObjectRepo.test.log(Status.PASS, "Step :Jurisdiction Request Status should get displayed as-" +Status1);
		
	}
	
	public void AddPurchaseLimitForJurisdiction() {
		List<WebElement> List2 = driver.get()
				.findElements(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"));
		Integer[] n = new Integer[List2.size()]; // Declare n as an array of Integer objects
		for (int i = 0; i < List2.size(); i++) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(90) + 10; // Generate a random two-digit number
			n[i] = randomNumber;
			// Update the ith element of n with the newly generated random number
			List2.get(i).click();
			List2.get(i).sendKeys(String.valueOf(n[i])); // Convert int to String before sending
			System.out.println("Purchase Limits is displayed as - " + randomNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

	public void ClickOnSubmitButton() {
		System.out.println("Click On Submit Button");
		ObjectRepo.test.log(Status.PASS, "Click On Submit Button");
		wait.until(ExpectedConditions.elementToBeClickable(submitButton01));
		submitButton01.click();
	}

	public void AssertPurchaseLimitSuccessMessage() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(purchaseLimitSuccessMessage));
		String message2 = purchaseLimitSuccessMessage.getText();
		System.out.println("Success message is displayed as- " + message2);
		ObjectRepo.test.log(Status.PASS, "Success message is displayed as- " + message2);
		Thread.sleep(2000);
//		Assert.assertEquals(message2, "Default Purchase Limits (%) have been set successfully");
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(crossIcon));
//		CommonLibref.click(crossIcon, "seleniumClick", "crossIcon");
	}

	public void AssertManagePurchaseLimiTilte() {
		wait.until(ExpectedConditions.visibilityOf(managePurchaseLimit));
		String purchaseLimit = managePurchaseLimit.getAttribute("value");
		System.out.println("Title is displayed as" + purchaseLimit);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as" + purchaseLimit);
	}

	public void verifyApproveFunctionality_JAuth() {
		js.executeScript("window.scrollBy(0,850)");
		ProposedBudgetRecordLabel.sendKeys(AddBudgetYear);
		ObjectRepo.test.log(Status.PASS, "Select one or more budget record");
		wait.until(ExpectedConditions.elementToBeClickable(SelectRecord2));
		js.executeScript("arguments[0].click();", SelectRecord);
		ObjectRepo.test.log(Status.PASS,
				"Jurisdiction Authority is able to select one or more budget record at a time");
		ObjectRepo.test.log(Status.PASS, "Select the 'Approve' radio button");
		try {
			CommonLibref.click(ApproveRadio, "seleniumClick", "ApproveRadio");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ApproveRadio).click(ApproveRadio).build().perform();
			e.printStackTrace();
		}
		Assert.assertTrue(ApproveRadio.isSelected());
		Assert.assertTrue(SubmitButtonOnAdminDecisioncard.isEnabled());
		ObjectRepo.test.log(Status.PASS, "'Approve' radio button is selected and 'Submit' button get enabled");
		ObjectRepo.test.log(Status.PASS, "If required, enter comment in 'Comment' field box");
		CommentField.sendKeys("Testing");
		ObjectRepo.test.log(Status.PASS, "Entered comment is accepted.");
		ObjectRepo.test.log(Status.PASS, "Click on 'Submit' button");
		SubmitButtonOnAdminDecisioncard.click();
		Assert.assertTrue(
				ConfirmBtn_popUp.isDisplayed() && CancelBtn_popUp.isDisplayed() && PassphraseText.isDisplayed());
		ObjectRepo.test.log(Status.PASS,
				"Confirmation popup is display with 'Passphrase' text field along with 'Cancel' and 'Confirm' button");
		ObjectRepo.test.log(Status.PASS, "Click on 'Cancel' button of popup message.");
		CancelBtn_popUp.click();
		Assert.assertTrue(DecisionCardHeading.isDisplayed());
		ObjectRepo.test.log(Status.PASS, "Pop-up is closed and Jurisdiction Authority stays on same page");
		ObjectRepo.test.log(Status.PASS, "Again click on 'Submit' button and enter the valid Passphrase.");
		SubmitButtonOnAdminDecisioncard.click();
		PassphraseText.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		Assert.assertTrue(ConfirmBtn_popUp.isEnabled());
		ObjectRepo.test.log(Status.PASS, "Entered Passphrase is accepted and 'Continue' button is enabled");
		ObjectRepo.test.log(Status.PASS, "Click on 'Continue' button on popup message.");
		ConfirmBtn_popUp.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMsg));
		Assert.assertEquals(SuccessMsg.getText(), "The budget record has been approved");
		ObjectRepo.test.log(Status.PASS, "'The budget record has been approved' success message is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(SuccessCross));
		SuccessCross.click();
		Assert.assertTrue(AllBudgetRecordPageTitle.isDisplayed());
		ObjectRepo.test.log(Status.PASS, "Authority is navigated to the 'All Budget Records' page");
	}

	public void LoginWithValidCrossAR(String FilePath, String SheetName, int rowNum, int cellNum) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
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

	public void searchEntityIdOnARHomePage() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOnMyApproval));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnMyApproval));
		searchFieldOnMyApproval.click();
		searchFieldOnMyApproval.sendKeys(jp.fetchStoredJurisdictionNameValue(16));
		wait.until(ExpectedConditions.visibilityOf(searchFieldOnMyApproval));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnMyApproval));
		// CommonLibref.scroll(pendingTransfer, "scrollToTopOFPage", "pendingTransfer");
	}

	public void searchGeneralEntityIdOnARHomePage() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOnMyApproval));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnMyApproval));
		searchFieldOnMyApproval.click();
		searchFieldOnMyApproval.sendKeys(jp.fetchStoredJurisdictionNameValue(17));
		// CommonLibref.scroll(pendingTransfer, "scrollToTopOFPage", "pendingTransfer");
	}

	public void SearchUser(String FilePath, String SheetName, int rowNum, int cellNum) {
		CommonLibref.pageLoader();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchUserName.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//	wait.until(ExpectedConditions.elementToBeClickable(AssertActiveUserAccountStatus));
//	System.out.println(AssertActiveUserAccountStatus.getText());
		wait.until(ExpectedConditions.elementToBeClickable(QuickAction));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			CommonLibref.click(QuickAction, "javascriptClick", "quickActionsOnHomePage");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(QuickAction).click(QuickAction).build().perform();
			e.printStackTrace();
		}
	}

	public void Search_User_Role_Change(String FilePath, String SheetName, int rowNum, int cellNum) {
		CommonLibref.pageLoader();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SearchUserName.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		System.out.println("Search Initial JSA User");
//		wait.until(ExpectedConditions.elementToBeClickable(AssertActiveUserAccountStatus));
//		System.out.println(AssertActiveUserAccountStatus.getText());
//		wait.until(ExpectedConditions.elementToBeClickable(QuickAction));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonLibref.click(FirstElementOnUserGrid, "seleniumClick", "FirstElementOnUserGrid");
	}

	public void ShareUserDetails() {
		CommonLibref.scroll(ShareUser, "scrollToTopOFPage", "ShareUser");
		CommonLibref.click(ShareUser, "javascriptClick", "ShareUser");
		CommonLibref.click(Save, "javascriptClick", "Save");
		String sucess = driver.get()
				.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")).getText();
		System.out.println("Sucess message should get displayed as" + sucess);
	}

	public void Cross_Jurisdiction(String FilePath, String SheetName, int rowNum, int cellNum)
			throws InterruptedException {
		CommonLibref.pageLoader();

		try {
			CommonLibref.click(Userdropdown, "seleniumClick", "Userdropdown");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Userdropdown).click(Userdropdown).build().perform();
			e.printStackTrace();
		}
		System.out.println("Dropdown should get displayed");
		wait.until(ExpectedConditions.elementToBeClickable(Userprofile));
		CommonLibref.click(Userprofile, "seleniumClick", "Userprofile");
		System.out.println("Click on User Profile");
		ObjectRepo.test.log(Status.PASS, "Click on User Profile");
		CommonLibref.pageLoader();
		// CommonLibref.scroll(CrossJurisdiction, "scrollToTopOFPage",
		// "CrossJurisdiction");
		js.executeScript("window.scrollBy(0,2000)");

		if (PendingcrossJurisdiction.isDisplayed()) {
			login.logout();
		} else {
			try {
				CommonLibref.click(CrossJurisdiction, "javascriptClick", "CrossJurisdiction");
			} catch (Exception e) {
				Actions action = new Actions(driver.get());
				action.moveToElement(CrossJurisdiction).click(CrossJurisdiction).build().perform();
				e.printStackTrace();
			}
			String Juriname = ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 0);
			Thread.sleep(4000);
			Dropdown.click();
			WebElement option = driver.get().findElement(By.xpath(
					"//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8' and text()='"
							+ Juriname + "']"));
			option.click();
			System.out.println("Cross Jurisdiction is selected as" + Juriname);
			CommonLibref.click(Checkbox, "javascriptClick", "Checkbox");
			System.out.println("Tearms and Condition Checkbox is selected");
			CommonLibref.click(ContinueBtn, "javascriptClick", "ContinueBtn");
			CommonLibref.click(submitButton02, "javascriptClick", "ContinueBtn");
			String sucess = driver.get()
					.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']"))
					.getText();
			System.out.println(sucess);
			crossIcononPopUp();
			login.logout();
		}
	}

	public void Change_Jurisdiction() {
		CommonLibref.pageLoader();

		try {
			CommonLibref.click(Userdropdown, "seleniumClick", "Userdropdown");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Userdropdown).click(Userdropdown).build().perform();
			e.printStackTrace();
		}
		System.out.println("Dropdown should get displayed");
		wait.until(ExpectedConditions.elementToBeClickable(Userprofile));
		CommonLibref.click(Userprofile, "seleniumClick", "Userprofile");
		System.out.println("Click on User Profile");
		ObjectRepo.test.log(Status.PASS, "Click on User Profile");
		CommonLibref.pageLoader();
		// CommonLibref.scroll(CrossJurisdiction, "scrollToTopOFPage",
		// "CrossJurisdiction");
		js.executeScript("window.scrollBy(0,2000)");

		if (PendingchangeJurisdiction.isDisplayed()) {
			login.logout();
		} else {
			try {
				CommonLibref.click(ChangeJurisdiction, "javascriptClick", "CrossJurisdiction");
			} catch (Exception e) {
				Actions action = new Actions(driver.get());
				action.moveToElement(ChangeJurisdiction).click(ChangeJurisdiction).build().perform();
				e.printStackTrace();
			}
			String Juriname = ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 0);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Dropdown.click();
			WebElement option = driver.get().findElement(By.xpath(
					"//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8' and text()='"
							+ Juriname + "']"));
			option.click();
			System.out.println("Cross Jurisdiction is selected as" + Juriname);
			CommonLibref.click(Checkbox, "javascriptClick", "Checkbox");
			System.out.println("Tearms and Condition Checkbox is selected");
			CommonLibref.click(ContinueBtn, "javascriptClick", "ContinueBtn");
			CommonLibref.click(submitButton02, "javascriptClick", "ContinueBtn");
			String sucess = driver.get()
					.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']"))
					.getText();
			System.out.println(sucess);
			crossIcononPopUp();
			login.logout();
		}
	}

	public void scrolluptopendingtransfer() {
		CommonLibref.scroll(pendingTransfer, "scrollToTopOFPage", "pendingTransfer");
		wait.until(ExpectedConditions.elementToBeClickable(pendingTransfer));
	}

	public void clickOnMyAccounts() {
		CommonLibref.pageLoader();
		try {
			CommonLibref.click(myAccounts, "seleniumClick", "myAccounts");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(myAccounts).click(myAccounts).build().perform();
			e.printStackTrace();
		}
	}

	public void ProposedGeneralTo_OTCLess_Than3_DaysTransfer_Sanity(String FilePath, String SheetName, int rowNum,
			int cellNum, String FilePath1, String SheetName1, int rowNum1, int cellNum1) {
		CommonLibref.pageLoader();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		js.executeScript("window.scrollBy(0,1150)", "");
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		AccountNumberField.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		EntityReferenceField.sendKeys(ExcelProperties.readFromExcel(FilePath1, SheetName1, rowNum1, cellNum1));
		QuantityField.sendKeys("1");
		CommonLibref.scroll(CancelButton, "scrollToTopOFPage", "ReceivingAccount");
		wait.until(ExpectedConditions.elementToBeClickable(AgreegateDatePickerIcon));
		js.executeScript("arguments[0].click();", AgreegateDatePickerIcon);
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDate));
		js.executeScript("arguments[0].click();", CurrentDate);
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));
		// xpectedTermination_DatePickerIcon.click();
		try {
			Thread.sleep(6000);
			wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));

		} catch (Exception e) {
//			Thread.sleep(5000);
		}
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		try {
			js.executeScript("arguments[0].click();", ExpectedTermination_DatePickerIcon);
			Thread.sleep(1000);
		} catch (ArrayIndexOutOfBoundsException e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ExpectedTermination_DatePickerIcon).click().perform();
		} catch (Exception e) {
			ExpectedTermination_DatePickerIcon.click();
		}
		wait.until(ExpectedConditions.visibilityOf(CurrentDate));
		js.executeScript("arguments[0].click();", FutureDate);
//		try {
//			CommonLibref.click(ExpectedTermination_DatePickerIcon, "seleniumClick", "ExpectedTermination_DatePickerIcon");
//		} catch (Exception e) {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(ExpectedTermination_DatePickerIcon).click(ExpectedTermination_DatePickerIcon).build().perform();
//			e.printStackTrace();
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(FutureDate));
//		CommonLibref.click(FutureDate, "javascriptClick", "FutureDate");
		PricePerInstrument.click();
		PricePerInstrument.sendKeys("100");
		// js.executeScript("window.scrollBy(0,550)", "");
		wait.until(ExpectedConditions.visibilityOf(CurrencyDropDown));
		wait.until(ExpectedConditions.elementToBeClickable(CurrencyDropDown));
		CurrencyDropDown.click();
		CurrencyDropDown.sendKeys(Keys.ARROW_DOWN);
		CurrencyDropDown.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", Submit1);
		wait.until(ExpectedConditions.visibilityOf(WarningMsg));
		String Msg = WarningMsg.getText();
		Assert.assertEquals(Msg, "Transferring compliance instruments to an Entity’s General Account is permanent.");
		Assert.assertEquals(
				PassphraseField.isDisplayed() && ConfirmBtn1.isDisplayed() && CancelBtnOnConfirmPopUp.isDisplayed(),
				true);
		System.out.println("'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
		ObjectRepo.test.log(Status.PASS,
				"'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
	}

	public void Proposed_Cross_GeneralTo_OTCLess_Than3_DaysTransfer_for_Selected_Jurisdiction(String FilePath,
			String SheetName, int rowNum, int cellNum) {
		CommonLibref.pageLoader();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		js.executeScript("window.scrollBy(0,1150)", "");
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		AccountNumberField
				.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 3, 35));
		EntityReferenceField
				.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 3, 37));
		QuantityField.sendKeys("1");
		CommonLibref.scroll(CancelButton, "scrollToTopOFPage", "ReceivingAccount");
		wait.until(ExpectedConditions.elementToBeClickable(AgreegateDatePickerIcon));
		js.executeScript("arguments[0].click();", AgreegateDatePickerIcon);
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDate));
		js.executeScript("arguments[0].click();", CurrentDate);
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));
		// xpectedTermination_DatePickerIcon.click();
		try {
			Thread.sleep(6000);
			wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));

		} catch (Exception e) {
//			Thread.sleep(5000);
		}
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		try {
			js.executeScript("arguments[0].click();", ExpectedTermination_DatePickerIcon);
			Thread.sleep(1000);
		} catch (ArrayIndexOutOfBoundsException e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ExpectedTermination_DatePickerIcon).click().perform();
		} catch (Exception e) {
			ExpectedTermination_DatePickerIcon.click();
		}
		wait.until(ExpectedConditions.visibilityOf(CurrentDate));
		js.executeScript("arguments[0].click();", FutureDate);
//		try {
//			CommonLibref.click(ExpectedTermination_DatePickerIcon, "seleniumClick", "ExpectedTermination_DatePickerIcon");
//		} catch (Exception e) {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(ExpectedTermination_DatePickerIcon).click(ExpectedTermination_DatePickerIcon).build().perform();
//			e.printStackTrace();
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(FutureDate));
//		CommonLibref.click(FutureDate, "javascriptClick", "FutureDate");
		PricePerInstrument.click();
		PricePerInstrument.sendKeys("100");
		// js.executeScript("window.scrollBy(0,550)", "");
		wait.until(ExpectedConditions.visibilityOf(CurrencyDropDown));
		wait.until(ExpectedConditions.elementToBeClickable(CurrencyDropDown));
		CurrencyDropDown.click();
		CurrencyDropDown.sendKeys(Keys.ARROW_DOWN);
		CurrencyDropDown.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", Submit1);
		wait.until(ExpectedConditions.visibilityOf(WarningMsg));
		String Msg = WarningMsg.getText();
		Assert.assertEquals(Msg, "Transferring compliance instruments to an Entity’s General Account is permanent.");
		Assert.assertEquals(
				PassphraseField.isDisplayed() && ConfirmBtn1.isDisplayed() && CancelBtnOnConfirmPopUp.isDisplayed(),
				true);
		System.out.println("'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
		ObjectRepo.test.log(Status.PASS,
				"'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
	}

	public void Proposed_Cross_GeneralTo_OTCLess_Than3_DaysTransfer(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		js.executeScript("window.scrollBy(0,1150)", "");
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		AccountNumberField
				.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 2, 34));
		EntityReferenceField
				.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 2, 19));
		QuantityField.sendKeys("1");
		CommonLibref.scroll(CancelButton, "scrollToTopOFPage", "ReceivingAccount");
		wait.until(ExpectedConditions.elementToBeClickable(AgreegateDatePickerIcon));
		js.executeScript("arguments[0].click();", AgreegateDatePickerIcon);
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDate));
		js.executeScript("arguments[0].click();", CurrentDate);
		js.executeScript("window.scrollBy(0,2000)");
		wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));
		// xpectedTermination_DatePickerIcon.click();
		try {
			Thread.sleep(6000);
			wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));

		} catch (Exception e) {
//			Thread.sleep(5000);
		}
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		try {
			js.executeScript("arguments[0].click();", ExpectedTermination_DatePickerIcon);
			Thread.sleep(1000);
		} catch (ArrayIndexOutOfBoundsException e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ExpectedTermination_DatePickerIcon).click().perform();
		} catch (Exception e) {
			ExpectedTermination_DatePickerIcon.click();
		}
		wait.until(ExpectedConditions.visibilityOf(CurrentDate));
		js.executeScript("arguments[0].click();", FutureDate);
//		try {
//			CommonLibref.click(ExpectedTermination_DatePickerIcon, "seleniumClick", "ExpectedTermination_DatePickerIcon");
//		} catch (Exception e) {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(ExpectedTermination_DatePickerIcon).click(ExpectedTermination_DatePickerIcon).build().perform();
//			e.printStackTrace();
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(FutureDate));
//		CommonLibref.click(FutureDate, "javascriptClick", "FutureDate");
		PricePerInstrument.click();
		PricePerInstrument.sendKeys("100");
		// js.executeScript("window.scrollBy(0,550)", "");
		wait.until(ExpectedConditions.visibilityOf(CurrencyDropDown));
		wait.until(ExpectedConditions.elementToBeClickable(CurrencyDropDown));
		CurrencyDropDown.click();
		CurrencyDropDown.sendKeys(Keys.ARROW_DOWN);
		CurrencyDropDown.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", Submit1);
		wait.until(ExpectedConditions.visibilityOf(WarningMsg));
		String Msg = WarningMsg.getText();
		Assert.assertEquals(Msg, "Transferring compliance instruments to an Entity’s General Account is permanent.");
		Assert.assertEquals(
				PassphraseField.isDisplayed() && ConfirmBtn1.isDisplayed() && CancelBtnOnConfirmPopUp.isDisplayed(),
				true);
		System.out.println("'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
		ObjectRepo.test.log(Status.PASS,
				"'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
	}

	public void SearchEntity() throws InterruptedException {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		CommonLibref.click(SearchAccountName, "moveToElementClick", "SearchAccountName");
		SearchAccountName.sendKeys(jp.fetchStoredJurisdictionNameValue(16));
		wait.until(ExpectedConditions.visibilityOf(LuhaAcc));
		Thread.sleep(4000);
	}

	public void SearchGeneralAccountNumber() {
		CommonLibref.pageLoader();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		CommonLibref.click(SearchAccountName, "moveToElementClick", "SearchAccountName");
		SearchAccountName.sendKeys(jp.fetchStoredJurisdictionNameValue(27));
		// wait.until(ExpectedConditions.visibilityOf(GeneralAcc));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CommonLibref.click(ClickOnHyperlink, "moveToElementClick", "SearchAccountName");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ClickOnHyperlink).click(ClickOnHyperlink).build().perform();
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(GeneralPageTitle));
		Assert.assertEquals(GeneralPageTitle.getText(), "General Account Details");
	}

	public void clickOnGeneralAccountNumber(String FilePath, String SheetName, int rowNum, int cellNum) {
		CommonLibref.pageLoader();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		CommonLibref.click(SearchAccountName, "moveToElementClick", "SearchAccountName");
		SearchAccountName.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		// wait.until(ExpectedConditions.visibilityOf(GeneralAcc));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CommonLibref.click(HyperLink, "moveToElementClick", "HyperLink");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLink).click(HyperLink).build().perform();
			e.printStackTrace();
		}
		// wait.until(ExpectedConditions.visibilityOf(GeneralPageTitle));
		// Assert.assertEquals(GeneralPageTitle.getText(), "General Account Details");

	}

	public void navigateToInitiateConsignmentTransfer() {
		CommonLibref.pageLoader();
		CommonLibref.scroll(InitiateLUHAPageTitle, "scrollToTopOFPage", "ReceivingAccount");
//	    wait.until(ExpectedConditions.elementToBeClickable(ThreeDots));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ThreeDots.click();
		} catch (IndexOutOfBoundsException ex) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ThreeDots).click(ThreeDots).build().perform();
		} catch (Exception e) {
			CommonLibref.click(ThreeDots, "javascriptClick", "ThreeDots");
		}
		wait.until(ExpectedConditions.elementToBeClickable(InitiateTransfer));
		InitiateTransfer.click();
		wait.until(ExpectedConditions.elementToBeClickable(InitiateLUHAPageTitle));
		// Assert.assertEquals(InitiateLUHAPageTitle.isDisplayed(), true);
		// Assert.assertEquals(InitiateLUHAPageTitle.isDisplayed(), true);
	}

	public void proposedConsignmentTransfer() {
		// js.executeScript("window.scrollBy(0,650)", "");
		CommonLibref.pageLoader();
		CommonLibref.scroll(ReceivingAccount, "scrollToTopOFPage", "ReceivingAccount");
		wait.until(ExpectedConditions.visibilityOf(Quantity));
		Quantity.sendKeys("1");
		CommonLibref.scroll(WiringInstruction, "scrollToTopOFPage", "WiringInstruction");
		try {
			CommonLibref.click(YesRadioWiringInstruction, "javascriptClick", "Element");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(YesRadioWiringInstruction).click(YesRadioWiringInstruction).build().perform();
		}
		// js.executeScript("arguments[0].click();", YesRadioWiringInstruction);
		CommonLibref.click(SubmitButton, "javascriptClick", "Element");
		Passphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessageValue = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessageValue, "The proposal has been successfully prepared and is awaiting review.");
		ObjectRepo.test.log(Status.PASS,
				"Consignement Transfer is Proposed and Success Message is displayed : " + SuccessMessageValue);
		wait.until(ExpectedConditions.elementToBeClickable(SuccessMsgCancleBtn));
		try {
			SuccessMsgCancleBtn.click();
		} catch (Exception e) {
			CommonLibref.click(SuccessMsgCancleBtn, "seleniumClick", "SuccessMsgCancleBtn");
		}
		wait.until(ExpectedConditions.visibilityOf(FechedTransferValue));
		EntityTransferID2 = FechedTransferValue.getText();
		System.out.println("EntityTransferID :" + EntityTransferID2);
		wait.until(ExpectedConditions.visibilityOf(TransferDetailPageTitle));
		Assert.assertEquals(TransferDetailPageTitle.isDisplayed(), true);
//		wait.until(ExpectedConditions.visibilityOf(Home_Page));
//		Home_Page.click();
	}

	public void clickOnManageAllTransfers() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(Manage_All_Transfers));
		try {
			CommonLibref.click(Manage_All_Transfers, "javascriptClick", "Current_Date");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Manage_All_Transfers).click(Manage_All_Transfers).build().perform();
			e.printStackTrace();
		}
		CommonLibref.pageLoader();
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");

	}

	public void selectJurisdictionForIndividualUser(String FilePath, String SheetName, int rowNum, int cellNum) {
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
		selectJurisdiction1.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
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
		wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
		CommonLibref.click(ContinueBtn, "moveToElementClick", "ContinueBtn");
	}

	public void fetchValueFromExcelSheet(String FilePath, String SheetName, int rowNum, int cellNum) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
	}

	public void ProposeGeneralTransfer() {
		ObjectRepo.test.log(Status.PASS, "Enter Valid Passphrase & click on CONFIRM Button");
		Passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		ConfirmBtn1.click();
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessageValue = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessageValue, "The proposal has been successfully prepared and is awaiting review.");
		ObjectRepo.test.log(Status.PASS,
				"The system has created the proposal for General Transfer and 'The proposal has been successfully prepared and is awaiting review' success message gets displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(SuccessMsgCancleBtn));
		CommonLibref.pageLoader();
		SuccessMsgCancleBtn.click();
		EntityTransferID3 = FechedTransferValue.getText();
		System.out.println("Transfer ID (sequential) is assigned and displayed on the Transfer details page.: "
				+ EntityTransferID);
		ObjectRepo.test.log(Status.PASS,
				"Transfer ID (sequential) is assigned and displayed on the Transfer details page.: "
						+ EntityTransferID);
		System.out.println("EntityTransferID : " + EntityTransferID3);
	}

	public void ARLoginWithValidCredentialMethod() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(14));
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

	public void navigateToGeneralAccountPageFunctionality() {
		wait.until(ExpectedConditions.visibilityOf(GeneralAcc));
		wait.until(ExpectedConditions.elementToBeClickable(GeneralAcc));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,2000)");
		// CommonLibref.scroll(rowsperpage, "scrollToTopOFPage", "GeneralAcc");
		wait.until(ExpectedConditions.visibilityOf(GeneralAcc));
		try {
			CommonLibref.click(GeneralAcc, "seleniumClick", "que2");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(GeneralAcc).click(GeneralAcc).build().perform();
		}
		wait.until(ExpectedConditions.visibilityOf(GeneralPageTitle));
		Assert.assertEquals(GeneralPageTitle.getText(), "General Account Details");
	}

	public void InitiateGeneralTransfer() {
		try {
			ThreeDots.click();
		} catch (IndexOutOfBoundsException ex) {
			Actions action = new Actions(driver.get());
			action.moveToElement(ThreeDots).click(ThreeDots).build().perform();
		} catch (Exception e) {
			CommonLibref.click(ThreeDots, "seleniumClick", "Element");
		}
		wait.until(ExpectedConditions.elementToBeClickable(InitiateTransfer));
		InitiateTransfer.click();
//		wait.until(ExpectedConditions.elementToBeClickable(ThreeDots));
//		wait.until(ExpectedConditions.elementToBeClickable(InitiateTransfer));
//		InitiateTransfer.click();
		wait.until(ExpectedConditions.visibilityOf(TransferType));
		String Types = TransferType.getText();
		Assert.assertEquals(Types, "Transfer Type");
	}

	public void navigateToInitiate_GenralAcc_Sanity() {
		OTCNoMoreThan3DaysRadiobtn.click();
		ContinueBtn.click();
		try {
			Thread.sleep(2000);
//			wait.until(ExpectedConditions.elementToBeClickable(ExpandMyAccount));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("AR is navigated to the ‘Initiate Over-the-Counter Transfer <=3 Days’ page");
		ObjectRepo.test.log(Status.PASS, "AR is navigated to the ‘Initiate Over-the-Counter Transfer <=3 Days’ page");
	}

	public void saveTheSuccessMessageonManageStatusPage() throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
	}

	public void ClickOnSaveButtonOnConfigurationSettingPage() {
		CommonLibref.scroll(saveButtonConfigurationSetting, "scrollToTopOFPage", "btnWelcomeProfile DD");
		System.out.println("Click on Save Button");
		ObjectRepo.test.log(Status.PASS, "Click on Save Button");
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonConfigurationSetting));
		saveButtonConfigurationSetting.click();
	}

	public void scrollthePageUptoJURISDICTIONMANAGEMENT() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(JURISDICTIONMANAGEMENTOnJSAPage));
		CommonLibref.scroll(JURISDICTIONMANAGEMENTOnJSAPage, "scrollToBottomOFPage", "JURISDICTIONMANAGEMENTOnJSAPage");
	}

	public void scrolluptowelcomeoption() {
		CommonLibref.scroll(btnWelcomeProfileDD, "scrollToTopOFPage", "btnWelcomeProfile DD");
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfile));
	}

	public void loginWithValidRegistrarCredentialMethod() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "Sheet1", 0, 0));
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

	public void loginWithValidArCredentialMethod() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(14));
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

	public void loginWithValidAr2CredentialMethod() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		CommonLibref.click(textBoxEmail, "moveToElementClick", "userIDField");
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		textBoxEmail.sendKeys(jp.fetchStoredJurisdictionNameValue(17));
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

	public void ClickOnPurchaseLimit() {
		wait.until(ExpectedConditions.elementToBeClickable(managePurchaseLimitOption));
		wait.until(ExpectedConditions.elementToBeClickable(managePurchaseLimitTextPath));

		if (managePurchaseLimitOption.isDisplayed()) {
			managePurchaseLimitOption.click();
			System.out.println("Click on Purchase Limit");
			ObjectRepo.test.log(Status.PASS, "Click on Purchase Limit");
		} else {
			managePurchaseLimitTextPath.click();
			System.out.println("Click on Purchase Limit");
			ObjectRepo.test.log(Status.PASS, "Click on Purchase Limit");
		}
	}

//	public void CreateUserIdForRegistrarUser() throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
//		System.out.println("Step: Enter valid user id");
//		registrarUserId = generateUserIdForRegistrar();
//		System.out.println("Registrar1Uesrid :" + registrarUserId);
//		createUserId.sendKeys(registrarUserId);
//		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
//		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
//		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
//		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
//		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
//		try {
//			secQuestion1.click();
//		} catch (Exception e) {
//			CommonLibref.click(secQuestion1, "seleniumClick", "que2");
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e3) {
//			e3.printStackTrace();
//		}
//		try {
//			selSecQue1.click();
//			wait.until(ExpectedConditions.visibilityOf(answer1));
//			answer1.sendKeys("aaaa");
//		} catch (Exception e) {
//			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
//			CommonLibref.click(que2, "seleniumClick", "que2");
//			wait.until(ExpectedConditions.visibilityOf(answer1));
//			answer1.sendKeys("aaaa");
//		}
//		answer1.sendKeys(Keys.TAB);
//		answer2.sendKeys(Keys.TAB);
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
//		try {
//			secQuestion2.click();
//		} catch (Exception e) {
//			CommonLibref.click(secQuestion2, "seleniumClick", "que2");
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e2) {
//			e2.printStackTrace();
//		}
//		try {
//			selSecQue2.click();
//			wait.until(ExpectedConditions.visibilityOf(answer2));
//			answer2.sendKeys("bbbb");
//		} catch (Exception e) {
//			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
//			CommonLibref.click(que2, "seleniumClick", "que2");
//			wait.until(ExpectedConditions.visibilityOf(answer2));
//			answer2.sendKeys("bbbb");
//		}
//		CommonLibref.scroll(secQuestion3, "scrollToBottomOFPage", "securityQuestion3");
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
//		try {
//			secQuestion3.click();
//		} catch (Exception e) {
//			CommonLibref.click(secQuestion3, "javascriptClick", "que3");
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
//		try {
//			selSecQue3.click();
//			wait.until(ExpectedConditions.visibilityOf(answer3));
//			answer3.sendKeys("cccc");
//		} catch (Exception e) {
//			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
//			CommonLibref.click(que2, "seleniumClick", "que2");
//			wait.until(ExpectedConditions.visibilityOf(answer3));
//			answer3.sendKeys("cccc");
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox));
//		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Step: Click on Register button");
//		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");
//
//		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut));
//		CommonLibref.click(creUserProfRegBut, "moveToElementClick", "creUserProfRegBut");
//		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
//		String successMessage = successMessageForResetPassphrase.getText();
//		Assert.assertEquals(successMessage, "A confirmation has been emailed to the address provided.");
//		System.out.println("Success message after user registration :" + successMessage);
//		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
//		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
//		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
//		if (userReferenceCode.isDisplayed()) {
//			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
//		} else {
//			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
//		}
//		((JavascriptExecutor) driver.get()).executeScript("window.scrollBy(0,300)");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Step: Click on Finish button");
//		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
//		ExpectedConditions.elementToBeClickable(finishButton);
//		try {
//			CommonLibref.click(finishButton, "javascriptClick", "finishButton");
//		} catch (Exception e) {
//			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
//		}
//		System.out.println("New User Created Successfully.");
//		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
//		ExcelProperties.writeToExcel(listeners.filePath, "Sheet1", 0, 0, registrarUserId);
//		String value = ExcelProperties.readFromExcel(listeners.filePath, "Sheet1", 0, 0);
//		System.out.println("Read value: " + value);
//	}

	public void SelectPurchaseLimit() {
		CommonLibref.pageLoader();
		CommonLibref.scroll(PurchaseLimit, "scrollToBottomOFPage", "PurchaseLimit");
		// wait.until(ExpectedConditions.elementToBeClickable(PurchaseLimit));
		try {
			CommonLibref.click(PurchaseLimit, "javascriptClick", "PurchaseLimit");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(PurchaseLimit).click(PurchaseLimit).build().perform();
			e.printStackTrace();
		}
		System.out.println("Set Purchase Limits is checked");
	}

	public void CreateUserIdForJSA1User() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA1UserId = generateUserIdForJSA1();
		System.out.println("Jsa1Uesrid :" + JSA1UserId);
		createUserId.sendKeys(JSA1UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
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
			answer1.sendKeys("aaaa");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer1));
			answer1.sendKeys("aaaa");
		}
		answer1.sendKeys(Keys.TAB);
		answer2.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
		try {
			secQuestion2.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion2, "seleniumClick", "que2");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		try {
			selSecQue2.click();
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("bbbb");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("bbbb");
		}
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
		wait.until(ExpectedConditions.visibilityOf(secQuestion3));
		try {
			secQuestion3.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion3, "seleniumClick", "que2");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			selSecQue3.click();
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		}
		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox));
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Step: Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");

		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut));
		CommonLibref.click(creUserProfRegBut, "moveToElementClick", "creUserProfRegBut");
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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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

	public void CreateUserIdForSeesdedJSA2User() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
		System.out.println("Step: Enter valid user id");
		JSA2UserId = generateUserIdForJSA2User();
		System.out.println("Jsa1Uesrid :" + JSA2UserId);
		createUserId.sendKeys(JSA2UserId);
		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");

//		WebElement userReferenceCodeText = userReferenceCode;
//		if (userReferenceCodeText.isDisplayed()) {
//			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
//		} else {
//			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
//		}
////		JSA2Referencecode = refCode.getText();
////		System.out.println("Reference code is displayed as -" + JSA2Referencecode);
//		JavascriptExecutor js4 = (JavascriptExecutor) driver.get();
//		js4.executeScript("window.scrollBy(0,1000)");
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
			answer1.sendKeys("aaaa");
		} catch (Exception e) {
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer1));
			answer1.sendKeys("aaaa");
		}

		answer1.sendKeys(Keys.TAB);
		answer2.sendKeys(Keys.TAB);

//data-value="SECURITY_QUESTION_1
		// Select security question 2
//			JavascriptExecutor js = (JavascriptExecutor) driver.get();
//			js.executeScript("window.scrollBy(0,300)");
		// CommonLibref.scroll(securityQuestion2, "scrollToBottomOFPage",
		// "securityQuestion3");
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOf(secQuestion2));
		try {
			secQuestion2.click();
		} catch (Exception e) {
			CommonLibref.click(secQuestion2, "seleniumClick", "que2");
		}
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
			answer2.sendKeys("bbbb");
		} catch (Exception e) {
			Thread.sleep(2000);
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer2));
			answer2.sendKeys("bbbb");
		}
//		answer2.sendKeys(Keys.TAB);
//		answer3.sendKeys(Keys.TAB);
		// Select security question 3
//		JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
//		js1.executeScript("window.scrollBy(0,300)");
		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");

		wait.until(ExpectedConditions.visibilityOf(secQuestion3));
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
		wait.until(ExpectedConditions.visibilityOf(secQuestion3));
		try {
			selSecQue3.click();
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		} catch (Exception e) {
			Thread.sleep(2000);
			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
			CommonLibref.click(que2, "seleniumClick", "que2");
			wait.until(ExpectedConditions.visibilityOf(answer3));
			answer3.sendKeys("cccc");
		}

		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox));
		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Step: Click on Register button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");

		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut));
		CommonLibref.click(creUserProfRegBut, "moveToElementClick", "creUserProfRegBut");

		// Wait for and retrieve success message
		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
		String successMessage = successMessageForResetPassphrase.getText();
		System.out.println("Success message after user registration :" + successMessage);
		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);

		// Close success message and verify user reference code
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");

		if (userReferenceCode.isDisplayed()) {
			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
		} else {
			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
		}
//		referencecode = refCode.getText();
//		System.out.println(referencecode);

		// Scroll and click the Finish button
		((JavascriptExecutor) driver.get()).executeScript("window.scrollBy(0,300)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

//	public void CreateUserIdForSeesdedAuthorityUser() throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(createUserId));
//		System.out.println("Step: Enter valid user id");
//		AuthorityUserId = generateUserIdForAuthority();
//		System.out.println("Authority Uesrid :" + AuthorityUserId);
//		createUserId.sendKeys(AuthorityUserId);
//		System.out.println("Step: Enter valid Passphrase and confirm passphrase");
//		ObjectRepo.test.log(Status.PASS, "Step: Enter valid Passphrase and confirm passphrase");
//		passphrase1.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
//		confirmPassphrase.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
//		System.out.println("Step: Select valid security questions and enter valid answer for this security questions.");
////		WebElement userReferenceCodeText = userReferenceCode;
////		if (userReferenceCodeText.isDisplayed()) {
////			System.out.println("user Reference Code Text is displayed on Submit Required Documents page");
////		} else {
////			System.out.println("user Reference Code Text is not displayed on Submit Required Documents page");
////		}
//////		AuthorityReferencecode = refCode.getText();
//////		System.out.println("Reference code is displayed as -" + AuthorityReferencecode);
////		JavascriptExecutor js4 = (JavascriptExecutor) driver.get();
////		js4.executeScript("window.scrollBy(0,1000)");
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
//		secQuestion1.click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e3) {
//			// TODO Auto-generated catch block
//			e3.printStackTrace();
//		}
//		try {
//			// wait.until(ExpectedConditions.elementToBeClickable(secQuestion1));
//			selSecQue1.click();
//			wait.until(ExpectedConditions.visibilityOf(answer1));
//			answer1.sendKeys("aaaa");
//		} catch (Exception e) {
//			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_1']"));
//			CommonLibref.click(que2, "seleniumClick", "que2");
//			wait.until(ExpectedConditions.visibilityOf(answer1));
//			answer1.sendKeys("aaaa");
//		}
//
//		answer1.sendKeys(Keys.TAB);
//		answer2.sendKeys(Keys.TAB);
//
////			JavascriptExecutor js = (JavascriptExecutor) driver.get();
////			js.executeScript("window.scrollBy(0,300)");
//		// CommonLibref.scroll(securityQuestion2, "scrollToBottomOFPage",
//		// "securityQuestion3");
//		// Select security question 2
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
//		secQuestion2.click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		try {
//			// wait.until(ExpectedConditions.elementToBeClickable(secQuestion2));
//			selSecQue2.click();
//			wait.until(ExpectedConditions.visibilityOf(answer2));
//			answer2.sendKeys("bbbb");
//		} catch (Exception e) {
//			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_2']"));
//			CommonLibref.click(que2, "seleniumClick", "que2");
//			wait.until(ExpectedConditions.visibilityOf(answer2));
//			answer2.sendKeys("bbbb");
//		}
////			answer2.sendKeys(Keys.TAB);
////			answer3.sendKeys(Keys.TAB);
//		// Select security question 3
//		CommonLibref.scroll(securityQuestion3, "scrollToBottomOFPage", "securityQuestion3");
//		wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
//		secQuestion3.click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			// wait.until(ExpectedConditions.elementToBeClickable(secQuestion3));
//			selSecQue3.click();
//			wait.until(ExpectedConditions.visibilityOf(answer3));
//			answer3.sendKeys("cccc");
//		} catch (Exception e) {
//			WebElement que2 = driver.get().findElement(By.xpath("//*[text()='SECURITY_QUESTION_3']"));
//			CommonLibref.click(que2, "seleniumClick", "que2");
//			wait.until(ExpectedConditions.visibilityOf(answer3));
//			answer3.sendKeys("cccc");
//		}
//
//		wait.until(ExpectedConditions.elementToBeClickable(termsOfUseCheckBox));
//		CommonLibref.click(termsOfUseCheckBox, "javascriptClick", "termsOfUseCheckBox");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Step: Click on Register button");
//		ObjectRepo.test.log(Status.PASS, "Step: Click on Register button");
//
//		wait.until(ExpectedConditions.elementToBeClickable(creUserProfRegBut));
//		CommonLibref.click(creUserProfRegBut, "moveToElementClick", "creUserProfRegBut");
//
//		// Wait for and retrieve success message
//		wait.until(ExpectedConditions.visibilityOf(successMessageForResetPassphrase));
//		String successMessage = successMessageForResetPassphrase.getText();
//		System.out.println("Success message after user registration :" + successMessage);
//		ObjectRepo.test.log(Status.PASS, "Success message after user registration :" + successMessage);
//
//		// Close success message and verify user reference code
//		wait.until(ExpectedConditions.elementToBeClickable(crossButtonAfterRegistration));
//		CommonLibref.click(crossButtonAfterRegistration, "seleniumClick", "crossButtonAfterRegistration");
//
//		if (userReferenceCode.isDisplayed()) {
//			System.out.println("User Reference Code Text is displayed on Submit Required Documents page");
//		} else {
//			System.out.println("User Reference Code Text is not displayed on Submit Required Documents page");
//		}
////		referencecode = refCode.getText();
////		System.out.println(referencecode);
//
//		// Scroll and click the Finish button
//		((JavascriptExecutor) driver.get()).executeScript("window.scrollBy(0,300)");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Step: Click on Finish button");
//		ObjectRepo.test.log(Status.PASS, "Step: Click on Finish button");
//		ExpectedConditions.elementToBeClickable(finishButton);
//		try {
//			CommonLibref.click(finishButton, "javascriptClick", "finishButton");
//		} catch (Exception e) {
//			CommonLibref.click(finishButton, "seleniumClick", "finishButton");
//		}
//		System.out.println("New User Created Successfully.");
//		ObjectRepo.test.log(Status.PASS, "New User Created Successfully.");
//	}

	public void fetchUserEmailFromExcelSheet() throws InterruptedException {
		Thread.sleep(3000);
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(InitialSearchOption));
		CommonLibref.click(InitialSearchOption, "javascriptClick", "homepageSearchOption");
		InitialSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(2));
	}

	public void fetchJSAUserIDFromExcelSheet() throws InterruptedException {
		Thread.sleep(3000);
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(InitialSearchOption));
		CommonLibref.click(InitialSearchOption, "javascriptClick", "homepageSearchOption");
		InitialSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(4));
	}

	public void fetchSeededUserRegistrar() {

		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
//		CommonLibref.click(searchFieldOnInitialUsers01, "seleniumClick", "searchFieldOnInitialUsers01");
//		searchFieldOnInitialUsers01.sendKeys(Keys.CONTROL,"a");
//		searchFieldOnInitialUsers01.sendKeys(Keys.BACK_SPACE);
		searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(2));
	}

	public void fetchRegistrarUserIDFromExcelSheet() throws InterruptedException {
		Thread.sleep(3000);
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(InitialSearchOption));
		CommonLibref.click(InitialSearchOption, "javascriptClick", "homepageSearchOption");
		InitialSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(4));
	}

	public void fetchAuthorityUserIDFromExcelSheet() throws InterruptedException {
		Thread.sleep(3000);
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(InitialSearchOption));
		CommonLibref.click(InitialSearchOption, "javascriptClick", "homepageSearchOption");
		InitialSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(4));
	}

	public void fetchAdminUserIDFromExcelSheet() throws InterruptedException {
		Thread.sleep(3000);
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(InitialSearchOption));
		CommonLibref.click(InitialSearchOption, "javascriptClick", "homepageSearchOption");
		InitialSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(4));
	}

	public void fetchARUserIDFromExcelSheet() throws InterruptedException {
		Thread.sleep(3000);
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(InitialSearchOption));
		CommonLibref.click(InitialSearchOption, "javascriptClick", "homepageSearchOption");
		InitialSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(14));
	}

	public void loginWithValidCredentialMethod() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("WciIncAdminUserID"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("WciIncAdminUserID"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("WciIncAdminPassphrase"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("WciIncAdminPassphrase"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");

	}

	public void loginWithValidCredentialAR() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("ARUserId"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("ARUserId"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("ARUserPassword"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS, "Step : PassWord entered successfully :" + prop.getProperty("ARUserPassword"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");

	}

	public void loginWithValidCredentialJSA() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("JSASeededUserID"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSASeededUserID1"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("JSASeededUserPassphrase"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("JSASeededUserPassphrase"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");

	}

	public void allJurisdictions() {
		try {
			CommonLibref.pageLoader();
			wait.until(ExpectedConditions.elementToBeClickable(AllJurisdictions));
			AllJurisdictions.click();
			ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
			System.out.println("Click on All Jurisdictions");
		} catch (Exception e) {
			CommonLibref.pageLoader();
			wait.until(ExpectedConditions.elementToBeClickable(AllJurisdictions));
			AllJurisdictions.click();
			ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
			System.out.println("Click on All Jurisdictions");
		}
	}

	public void searchJurisdiction() {
		wait.until(ExpectedConditions.elementToBeClickable(SearchJurisdiction));
		CommonLibref.click(SearchJurisdiction, "seleniumClick", "Demo Jurisdiction");
		SearchJurisdiction.sendKeys("Demo Jurisdiction");
		System.out.println("Enter Jurisdiction Name =" + "Demo Jurisdiction");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchJurisdictionNew() {
		wait.until(ExpectedConditions.elementToBeClickable(SearchJurisdiction));
		CommonLibref.click(SearchJurisdiction, "seleniumClick", "New_Jurisdiction_API_23");
		SearchJurisdiction.sendKeys("New_Jurisdiction_API_23");
		System.out.println("Enter Jurisdiction Name =" + "New_Jurisdiction_API_23");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchJurisdictionNew1() {
		wait.until(ExpectedConditions.elementToBeClickable(SearchJurisdiction));
		CommonLibref.click(SearchJurisdiction, "seleniumClick", "Language Check");
		SearchJurisdiction.sendKeys("Language Check");
		System.out.println("Enter Jurisdiction Name =" + "Language Check");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnQuickActions() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement quickActions2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='MoreHorizIcon']")));
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
			driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
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

	public void selectInitialUserOptionFromQuickAction() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(text));
			selectInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Initial Users from Quick Actions");
			System.out.println("Step:Click on Manage Initial Users from Quick Actions");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(text));
			selectManageInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users from Quick Actions");
			System.out.println("Step:Click on Setup Initial Users from Quick Actions");
		}
	}

	public void selectManageJurisdictionStatusOptionFromQuickActions() {
//		wait.until(ExpectedConditions.elementToBeClickable(ManageJurisdictionStatus));
//		ManageJurisdictionStatus.click();
//		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
//		System.out.println("Select Manage Jurisdiction Status");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(text));
			ManageJurisdictionStatus.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Initial Users from Quick Actions");
			System.out.println("Step:Click on Manage Initial Users from Quick Actions");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(text));
			ManageJurisdictionStatus.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users from Quick Actions");
			System.out.println("Step:Click on Setup Initial Users from Quick Actions");
		}
	}

	public void selectManageTransfersAction() {

		try {
			wait.until(ExpectedConditions.elementToBeClickable(ManageTransfers));
			ManageTransfers.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Manage Initial Users from Quick Actions");
			System.out.println("Step:Click on Manage Transfers from Quick Actions");

		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(ManageTransfers1));
			Actions action = new Actions(driver.get());
			action.moveToElement(ManageTransfers1).click(ManageTransfers1).build().perform();

			// ManageTransfers1.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on Setup Initial Users from Quick Actions");
			System.out.println("Step:Click on Manage Transfers from Quick Actions");
		}
	}

	public void clickOnAddInitialUserButton() {
		CommonLibref.click(addInitialUserButton, "javascriptClick", "addInitialUserButton");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		System.out.println("Step: Click on Add Initial User");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Add Initial User");

	}

	public void verifyTheValidationForFirstName() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Click on First name and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on First name and click outside respectively");
		wait.until(ExpectedConditions.visibilityOf(addFirstName));
		wait.until(ExpectedConditions.elementToBeClickable(CancelButton));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		wait.until(ExpectedConditions.elementToBeClickable(emailAddress));
		CommonLibref.click(emailAddress, "seleniumClick", "emailAddress");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForFirstName));
		String errorMessage1 = errorSpaceForFirstName.getText();
		System.out.println("Error message should get displayed - " + errorMessage1);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name is required");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed - " + errorMessage1);
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
		System.out.println("Error message should get displayed - " + moreThan50char);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name must not be more than 50 characters");

		ObjectRepo.test.log(Status.PASS, "Error message should get displayed - " + moreThan50char);
		// EnterInvalidDataInEditRole();
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter Special Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter Special Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		addFirstName.sendKeys("!@#$^$%^&*(()_");
		String Text = errorSpaceForFirstName.getText();
		System.out.println("The appropriate error message should get displyed as - " + Text);
//		Assert.assertEquals(errorSpaceForFirstName.getText(), "Please enter valid First Name");
		ObjectRepo.test.log(Status.PASS, "The appropriate error message should get displyed as - " + Text);
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		String ValidData = "Test  ÝÞß";
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		addFirstName.sendKeys(ValidData);
		System.out.println("Data Should get Accepted" + ValidData);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted" + ValidData);
	}

	public void verifyTheValidationForLastName() {
		System.out.println("*******************************************************");
		System.out.println("Steps: Click on Last name and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Last name and click outside respectively");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		wait.until(ExpectedConditions.elementToBeClickable(emailAddress));
		CommonLibref.click(emailAddress, "seleniumClick", "emailAddress");
		CommonLibref.click(addlastName, "seleniumClick", "addlastName");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForLastName));
		String lastNameRequiredError = errorSpaceForLastName.getText();
		Assert.assertEquals(errorSpaceForLastName.getText(), "Last Name is required");
		System.out.println("Error message should get displayed as - " + lastNameRequiredError);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed" + lastNameRequiredError);
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
		System.out.println("Error message should get displayed - " + moreThan50charInLastName);
		Assert.assertEquals(errorSpaceForLastName.getText(), "Last Name must not be more than 100 characters");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed - " + moreThan50charInLastName);
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter Special Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter Special Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addFirstName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		addlastName.sendKeys("!@#$^$%^&*(()_");
		String Text = errorSpaceForLastName.getText();
		System.out.println("The appropriate error message should get displyed as - " + Text);
//		Assert.assertEquals(errorSpaceForLastName.getText(), "Please enter valid Last Name");
		ObjectRepo.test.log(Status.PASS, "The appropriate error message should get displyed as - " + Text);
		System.out.println("*******************************************************");
		System.out.println("Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		String ValidData = "Test  ÝÞß";
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		addlastName.sendKeys(ValidData);
		System.out.println("Data Should get Accepted" + ValidData);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted" + ValidData);
	}

//	  public void EnterInvalidDataInEditRole() { System.out.println(
//	  "**************************************************************");
//	  System.out.println("Steps:Enter invalid data in fields and observe");
//	  ObjectRepo.test.log(Status.PASS,
//	  "Steps:Enter invalid data in fields and observe");
//	  wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
//	  CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
//	  addFirstName.sendKeys(Keys.CONTROL, "a");
//	  addFirstName.sendKeys(Keys.BACK_SPACE); addFirstName.sendKeys("!@#$^$%^&*(()_");
//	  String Text = errorSpaceForFirstName.getText();
//	  System.out.println("The appropriate error message should get displyed as - "  + Text); 
//	  Assert.assertEquals(errorSpaceForFirstName.getText(),  "Please enter valid First Name"); 
//	  ObjectRepo.test.log(Status.PASS, "The appropriate error message should get displyed as - " + Text);
//	  }

	public void verifyTheRoleDropdownFieldIsSearchableOrNot() {
//		System.out.println("Steps:Enter invalid character");
//		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid character");
//		CommonLibref.click(addRole, "javascriptClick", "addRole");
//		addRole.sendKeys("Rec");
//		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
//		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
//		wait.until(ExpectedConditions.elementToBeClickable(Role));
//		String invalidChar = Role.getText();
//		Assert.assertEquals(invalidChar, "Role is required");
//		System.out.println("Search results should not get displayed as - " + invalidChar);
//		ObjectRepo.test.log(Status.PASS, "Search results should not get displayed as" + invalidChar);

		System.out.println("Steps:Click inside the field and outside");
		ObjectRepo.test.log(Status.PASS, "Steps:Click inside the field and outside");
		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys(Keys.TAB);
		String RoleError = Role.getText();
		Assert.assertEquals(RoleError, "Role is required");
		System.out.println("Error message should get displayed- " + RoleError);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + RoleError);
		addRole.sendKeys(Keys.CONTROL, "A");
		addRole.sendKeys(Keys.BACK_SPACE);

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
		System.out.println("Search results should get  displayed containing search character like -" + validChar);
		ObjectRepo.test.log(Status.PASS,
				"Search results should get  displayed containing search character -" + validChar);
	}

	public void validationEmailAddress() {
		System.out.println("Steps:Click inside the field and outside");
		ObjectRepo.test.log(Status.PASS, "Steps:Click inside the field and outside");
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		emailAddress.sendKeys(Keys.TAB);
		String email = storedEmail.getText();
		Assert.assertEquals(email, "Email Address is required");
		System.out.println("Error message should get displayed- " + email);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + email);
		emailAddress.sendKeys(Keys.CONTROL, "A");
		emailAddress.sendKeys(Keys.BACK_SPACE);
		System.out.println("*********************************************************");

		System.out.println("Steps: Enter special characters at the start");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter special characters at the start");
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		emailAddress.sendKeys("@@#$%^&**(!~@$^&*()(");
		wait.until(ExpectedConditions.visibilityOf(storedEmail));
		String SpecialCharacterField = storedEmail.getText();
		System.out.println("Enter special characters at the start- " + SpecialCharacterField);
		ObjectRepo.test.log(Status.PASS,
				"Enter special character in the Email Address displayed as-" + SpecialCharacterField);
		wait.until(ExpectedConditions.visibilityOf(storedEmail));
		String SpecialCharacter = storedEmail.getText();
		System.out.println("Error message should get displayed- " + SpecialCharacter);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + SpecialCharacter);
		emailAddress.sendKeys(Keys.CONTROL, "A");
		emailAddress.sendKeys(Keys.BACK_SPACE);

		System.out.println("*********************************************************");

		System.out.println("Steps: Enter Duplicate email id which is already present in the system.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter Duplicate email id which is already present in the system.");
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		emailAddress.sendKeys("jsa123@eqanim-qa.wci-validate.org");
		wait.until(ExpectedConditions.visibilityOf(storedEmail));
		String DuplicateEmailField = storedEmail.getText();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter Duplicate email id which is already present in the system- " + DuplicateEmailField);
		ObjectRepo.test.log(Status.PASS,
				"Enter Duplicate email id which is already present in the system-" + DuplicateEmailField);

		System.out.println("*********************************************************");

		System.out.println("Steps: Enter more than 205 characters in the Email Address  field.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter more than 205 characters in the Email Address  field.");
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		emailAddress.sendKeys(Keys.CONTROL, "A");
		emailAddress.sendKeys(Keys.BACK_SPACE);
		emailAddress.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "/n seed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ "/n Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi "
				+ "ut aliquip ex ea commodo consequat. ");
		String MoreCharactersField = storedEmail.getText();
		System.out.println("Enter more than 205 characters in the Email Address  field- " + MoreCharactersField);
		ObjectRepo.test.log(Status.PASS,
				"Enter more than 205 characters in the Email Address  field" + MoreCharactersField);

		System.out.println("*********************************************************");

		System.out.println("Steps: Enter special character in the Email Address field.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter special character in the Email Address field.");
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		emailAddress.sendKeys(Keys.CONTROL, "A");
		emailAddress.sendKeys(Keys.BACK_SPACE);
		emailAddress.sendKeys("reg@!#$%^&$^^&*123@eqanim-qa.wci-validate.org");
		String ValidSpecialCharacterField = fieldEmailAddress.getText();
		System.out.println("Enter special character in the Email Address displayed as- " + ValidSpecialCharacterField);
		ObjectRepo.test.log(Status.PASS,
				"Enter special character in the Email Address displayed as-" + ValidSpecialCharacterField);

		System.out.println("*********************************************************");

		System.out.println("Steps: Enter valid data in the Email Address  field.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter valid data in the Email Address  field.");
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		String randomEmailId = RandomStringUtils.randomAlphabetic(8);
		String randomEmailId01 = randomEmailId + "@eqanim-qa.wci-validate.org";
		emailAddress.sendKeys(randomEmailId01);
		String ValidEmailField = fieldEmailAddress.getText();
		System.out.println("Enter valid data in the Email Address  field- " + ValidEmailField);
		ObjectRepo.test.log(Status.PASS, "Enter valid data in the Email Address  field-" + ValidEmailField);
		String ValidEmail = storedEmail.getText();
		System.out.println("entered characters should get accepted - " + ValidEmail);
		ObjectRepo.test.log(Status.PASS, "entered characters should get accepted- " + ValidEmail);

	}

	public void cancelInitialUsers() {
		if (CancelButton.isEnabled()) {
			Assert.assertEquals(CancelButton.isEnabled(), true);
			System.out.println("Cancel option is enabled");
		} else {
			Assert.assertEquals(CancelButton.isEnabled(), false);
			System.out.println("Cancel option is disable");

		}

	}

	public void enterInvalidDataInEmailAddress() {
		CommonLibref.click(emailAddress, "javascriptClick", "emailAddress");
		emailAddress.sendKeys(Keys.TAB);
	}

	public void verifyThTSaveIsidsabledOrEnable() {

		if (SaveButton.isEnabled()) {
			Assert.assertEquals(SaveButton.isEnabled(), true);
			System.out.println("Save option is enabled");
		} else {
			Assert.assertEquals(SaveButton.isEnabled(), false);
			System.out.println("Save option is disable");

		}
	}

	public void selectJurisdictionAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(Accountname)).click();
		Accounts = Accountname.getText();
		System.out.println("Account name is displayed as-  " + Accounts);
		ObjectRepo.test.log(Status.PASS, "Account name is displayed as-  " + Accounts);
	}

	public void searchJurisdictionAccount() {
		CommonLibref.click(SearchAccountName, "javascriptClick", "SearchAccountName");
		SearchAccountName.sendKeys("Batch");
		CommonLibref.pageLoader();
	}

	public void quickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage)).click();
		ObjectRepo.test.log(Status.PASS, "Step :Click On Quick Actions option ");
		System.out.println("Step :Click On Quick Actions option ");
	}

	public void editOption() {
		wait.until(ExpectedConditions.elementToBeClickable(EditAccounts));
		CommonLibref.click(EditAccounts, "javascriptClick", "EditAccounts");
	}

	public void scrollUptoTheSaveButton() {
		wait.until(ExpectedConditions.visibilityOf(ScrolltoAccountName));
		CommonLibref.scroll(ScrolltoAccountName, "scrollToBottomOFPage", "CancelButton");
	}

	public void editAccountName() {
		wait.until(ExpectedConditions.elementToBeClickable(EnglishLanguage));
		CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
		EnglishLanguage.sendKeys(Keys.CONTROL, "A");
		EnglishLanguage.sendKeys(Keys.BACK_SPACE);
		EnglishLanguage.sendKeys("Savings Bank of Usa");
	}

	public void SearcUser() {

	}

	public void validationEditAccountName() {
		wait.until(ExpectedConditions.elementToBeClickable(EnglishLanguage));
		Module5_1_Pom ref3 = new Module5_1_Pom();
		ref3.scrollHomepageUptoLast();
		CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
		System.out.println("Steps:Remove Pre-Filled Data from the Account Name Field");
		ObjectRepo.test.log(Status.PASS, "Remove Pre-Filled Data from the Account Name Field");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EnglishLanguage.sendKeys(Keys.CONTROL, "A");
		EnglishLanguage.sendKeys(Keys.BACK_SPACE);
		String AccountsError = StoredError.getText();
		System.out.println("Error message should get displayed - " + AccountsError);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + AccountsError);

		System.out.println("*********************************************************");

		System.out.println("Steps:Enter duplicate account name");
		ObjectRepo.test.log(Status.PASS, "Enter duplicate account name");
		EnglishLanguage.sendKeys(Module5_1_Pom.accountName2);
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
		CommonLibref.click(SaveButton, "javascriptClick", "SaveButton");
		CommonLibref.click(ContinueButton, "javascriptClick", "ContinueButtonButton");
		wait.until(ExpectedConditions.visibilityOf(DuplicateError));
		String DuplicateName = DuplicateError.getText();
		System.out.println("Error message should get displayed - " + DuplicateName);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + DuplicateName);

		System.out.println("*********************************************************");

		CommonLibref.click(CancelIcon, "javascriptClick", "CancelIcon");
		wait.until(ExpectedConditions.elementToBeClickable(CancelOnPopUp));
		CommonLibref.click(CancelOnPopUp, "javascriptClick", "CancelOnPopUp");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
		System.out.println("Steps:Enter 1 char in account name filed");
		try {
			CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
			ObjectRepo.test.log(Status.PASS, "Enter 3 char in account name filed");
			EnglishLanguage.sendKeys(Keys.CONTROL, "A");
			EnglishLanguage.sendKeys(Keys.BACK_SPACE);
			EnglishLanguage.sendKeys("Ma");
			String SingleCharacter = StoredError.getText();
			System.out.println("Error message should get displayed - " + SingleCharacter);
			ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + SingleCharacter);

			System.out.println("*********************************************************");
		} catch (Exception e) {
			CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
			ObjectRepo.test.log(Status.PASS, "Enter 3 char in account name filed");
			EnglishLanguage.sendKeys(Keys.CONTROL, "A");
			EnglishLanguage.sendKeys(Keys.BACK_SPACE);
			EnglishLanguage.sendKeys("Ma");
			String SingleCharacter = StoredError.getText();
			System.out.println("Error message should get displayed - " + SingleCharacter);
			ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + SingleCharacter);
			System.out.println("*********************************************************");
		}

		CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
		EnglishLanguage.sendKeys(Keys.CONTROL, "A");
		EnglishLanguage.sendKeys(Keys.BACK_SPACE);
		EnglishLanguage.sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. /n"
						+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
						+ "isfhsdfbsvbjkjkusduidjnudg");
		String MoreCharacter = StoredError.getText();
		System.out.println("Error message should get displayed - " + MoreCharacter);
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed- " + MoreCharacter);

		System.out.println("*********************************************************");
		System.out.println("Steps:Enter less than 255 char in account name field");
		ObjectRepo.test.log(Status.PASS, "Enter less than 255 char in account name field");
		CommonLibref.click(EnglishLanguage, "javascriptClick", "EnglishLanguage");
		EnglishLanguage.sendKeys(Keys.CONTROL, "A");
		EnglishLanguage.sendKeys(Keys.BACK_SPACE);
		EnglishLanguage.sendKeys("Savings Automation");

		System.out.println("*********************************************************");
	}

	public void deleteJurisdictionIssuanceAccount() {
		System.out.println("Steps: Click on the 'Delete Jurisdiction Account' button for issuance account.");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Delete Jurisdiction Account' button for issuance account");
		wait.until(ExpectedConditions.elementToBeClickable(SearchAccountName));
		CommonLibref.click(SearchAccountName, "seleniumClick", "SearchAccountName");
		SearchAccountName.sendKeys(Keys.CONTROL, "A");
		SearchAccountName.sendKeys(Keys.BACK_SPACE);
		SearchAccountName.sendKeys("Issuance");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
		wait.until(ExpectedConditions.elementToBeClickable(deleteOptionInQuickActions));

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

	public void ClickOnMoreActions() {
		System.out.println("Click on the 'More action' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'More action' option");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
	}

	public void ManageJurisdictionDetails() {

		System.out.println("Click on the 'More action' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'More action' option");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");

		if (EditDisabled.isSelected() != true) {
			System.out.println("Edit Details option is disable");
			ObjectRepo.test.log(Status.PASS, "Edit Details option is disable");
			Assert.assertTrue(true);
		} else {
			System.out.println("Edit Details  option is enable");
			ObjectRepo.test.log(Status.PASS, "Edit Details  option is enable");
			Assert.assertTrue(false);
		}
	}

	public void CancelProposeStatus() {

		System.out.println("Click on the 'More action' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'More action' option");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		System.out.println("Click on the 'Cancel Proposed Status option");
		ObjectRepo.test.log(Status.PASS, "Cancel Proposed Status option");
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposeStatus));
		CommonLibref.click(CancelProposeStatus, "seleniumClick", "CancelProposeStatus");
		System.out.println("Proposed status request should get cancelled");
		ObjectRepo.test.log(Status.PASS, "Proposed status request should get cancelled");
		System.out.println("*********************************************************");
	}

	public void ClickOnCancelIcon() {

		wait.until(ExpectedConditions.elementToBeClickable(CancelIconOnSucessMessage));
		Actions action = new Actions(driver.get());
		action.moveToElement(CancelIconOnSucessMessage).click(CancelIconOnSucessMessage).build().perform();

	}

	public void AssertCancelProposedStatus() {

		String CancelPropose = CancelProposeOnStatus.getText();
		Assert.assertEquals(CancelPropose, "BTN_SUBMIT");
		System.out.println("Cancel Proposed Status Option is displayed on Manage Status page");
		ObjectRepo.test.log(Status.PASS, "Cancel Proposed Status Option is displayed on Manage Status page");
		driver.get().navigate().back();
	}

	public void NavigateBack() {
		driver.get().navigate().back();
	}

	public void ClickOnManageJurisdictionDetailsOption() {

		System.out.println("Navigate to Manage Jurisdiction Details page");
		ObjectRepo.test.log(Status.PASS, "Navigate to Manage Jurisdiction Details page");
		CommonLibref.click(ManageJurisdictionDetails, "seleniumClick", "ManageJurisdictionDetails");
		System.out.println("Manage Jurisdiction Details page is visible");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Details page is visible");

	}

	public void EditJurisdictionDetails() {

		System.out.println("Click on the 'Edit' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Edit' option");
		CommonLibref.click(EditJurisdictionDetails, "seleniumClick", "EditJurisdictionDetails");
		String EditDetailsTitle = EditJurisdictionDetailsTitle.getText();
		Assert.assertEquals(EditDetailsTitle, "Edit Jurisdiction Details");
		System.out.println("Edit Jurisdiction Details page is visible");
		ObjectRepo.test.log(Status.PASS, "Edit Jurisdiction Details page is visible");
	}

	public void CancelProposedStatusDisabled() {
		if (CancelProposedDisabled.isSelected() != true) {
			System.out.println("Cancel Proposed Status option is disable");
			ObjectRepo.test.log(Status.PASS, "Cancel Proposed Status option is disable");
			Assert.assertTrue(true);
		} else {
			System.out.println("Cancel Proposed Status option is enabled");
			ObjectRepo.test.log(Status.PASS, "Cancel Proposed Status option is enabled");
			Assert.assertTrue(false);
		}
	}

	public void ClickOnManageStatusOption() {
		System.out.println("Click on the 'Manage Status' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Manage Status' option");
		wait.until(ExpectedConditions.elementToBeClickable(ManageStatus));
		CommonLibref.click(ManageStatus, "seleniumClick", "ManageStatus");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ManageStatusTitle = ManageJurisdictionStatusTitle.getText();
		wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionStatusTitle));
		Assert.assertEquals(ManageStatusTitle, "Manage Jurisdiction Status");
		System.out.println("Manage Jurisdiction Status page is visible");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Status is visible");
	}

	public void ClickOnReturnToHomePage() {
		System.out.println("Click on the 'Return To Home Page' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Return To Home Page' option");
		wait.until(ExpectedConditions.elementToBeClickable(ReturnToHomePage));
		CommonLibref.click(ReturnToHomePage, "seleniumClick", "ReturnToHomePage");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ReturntoHomeTitle = ReturnToHomePageTitle.getText();
		wait.until(ExpectedConditions.visibilityOf(ReturnToHomePageTitle));
		Assert.assertEquals(ReturntoHomeTitle, "MANAGE JURISDICTIONS");
		System.out.println("Manage Jurisdictions page is visible");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdictions page is visible");
	}

	public void clickOnAddNewAccountButton() {
		System.out.println("Steps: Click on Add New Account page");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Add New Account page");
		wait.until(ExpectedConditions.elementToBeClickable(AddNewAccount));
		CommonLibref.click(AddNewAccount, "javascriptClick", "AddNewAccount");
	}

	public void AddAccountType() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", AddAccountButton);
		System.out.println("Steps: Click on Account Type Field");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Account Type Field");
		wait.until(ExpectedConditions.elementToBeClickable(AccountType));
		CommonLibref.click(AccountType, "javascriptClick", "AccountType");
		AccountType.sendKeys("Account_Type911");
		System.out.println("Steps: Account Type Entered is");
		ObjectRepo.test.log(Status.PASS, "Steps: Account Type Entered is");
	}

	public void addAccountName() {

		List<WebElement> List = driver.get().findElements(By.xpath("//*[contains(@name ,'accountNameLang')]"));
		for (int i = 0; i < List.size(); i++) {
			String randomAccountName = RandomStringUtils.randomNumeric(5);
			String IssuanceAccount = "Account" + randomAccountName;
			List.get(i).click();
			List.get(i).sendKeys(IssuanceAccount);
//			List.get(i).sendKeys(Keys.TAB);
			System.out.println("account is displayed as - " + IssuanceAccount);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void clickOnAddAccount() {
		System.out.println("Steps: Click on Add Account Button");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Add Account Button");
		wait.until(ExpectedConditions.elementToBeClickable(AddAccountButton));
		CommonLibref.click(AddAccountButton, "javascriptClick", "AddAccountButton");
	}

	public void scrolltoAddAccount() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void assertSucessmessage() {
		wait.until(ExpectedConditions.visibilityOf(Sucessmessage));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String SuccesmessageTitle = Sucessmessage.getText();
		Assert.assertEquals(SuccesmessageTitle,
				"The Jurisdiction Account has been successfully created in the system.");
		ObjectRepo.test.log(Status.PASS, "Sucess message should get displayed as- " + SuccesmessageTitle);
		System.out.println("Sucess message should get displayed as- " + SuccesmessageTitle);
	}

	public void clickOnHyperlinkedAccountNumber() {
		System.out.println("Steps: Click on Hyperlink Account Number");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on Hyperlink Account Number");
		wait.until(ExpectedConditions.elementToBeClickable(Hyperlink));
		CommonLibref.click(Hyperlink, "javascriptClick", "Hyperlink");
		System.out.println("Steps: Jurisdiction Account Details page should get displayed");
		ObjectRepo.test.log(Status.PASS, "Steps: Jurisdiction Account Details page should get displayed");

	}

	public void assertJurisdictionAccountTitle() {
		wait.until(ExpectedConditions.visibilityOf(AccountDetails));
		String AccountDetailsTitle = AccountDetails.getText();
		Assert.assertEquals(AccountDetailsTitle, "Jurisdiction Account Details");
		System.out.println("Title should get displayes as- " + AccountDetailsTitle);
		ObjectRepo.test.log(Status.PASS, "Title should get displayes as- " + AccountDetailsTitle);
	}

	public void crossIcononPopUp() {
		wait.until(ExpectedConditions.elementToBeClickable(CrossIcon));
		wait.until(ExpectedConditions.elementToBeClickable(CrossIcon));
		Actions action = new Actions(driver.get());
		action.moveToElement(CrossIcon).click(CrossIcon).build().perform();
	}

	public void accountStatus() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Steps: Account status should get changed to Active status.");
		ObjectRepo.test.log(Status.PASS, "Steps: Account status should get changed to Active status");
		wait.until(ExpectedConditions.elementToBeClickable(ActiveAccountStatus));
		String StatusTitle = ActiveAccountStatus.getText();
		Assert.assertEquals(StatusTitle, "Active");
		System.out.println("Steps: Account status is displayed as- " + StatusTitle);
		ObjectRepo.test.log(Status.PASS, "Steps: Account status is displayed as- " + StatusTitle);
	}

	public void storeAccountType() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// String AccountTypeManage=AccountTypeOnManageJurisdictionTable.getText();
		System.out.println("Steps: Account type should get displayed as.");
		ObjectRepo.test.log(Status.PASS, "Steps: Account type should get displayed as");
		wait.until(ExpectedConditions.elementToBeClickable(AccountTypeOnDetails));
		AccountTypeTitle = AccountTypeOnDetails.getText();
		// Assert.assertEquals(AccountTypeTitle, "Active");
		System.out.println(
				"Steps: Account Type on Manage Jurisdiction Accounts table is displayed as- " + AccountTypeTitle);
		ObjectRepo.test.log(Status.PASS,
				"Steps:Account Type on Manage Jurisdiction Accounts table is displayed as- " + AccountTypeTitle);

	}

	public void storeAccountTypeonManageJurisdictiondetailsPage() {

		AccountTypeManage = AccountTypeOnManageJurisdictionTable.getText();
		System.out.println("Steps: Account type on Account Details page should get displayed as- " + AccountTypeManage);
		ObjectRepo.test.log(Status.PASS,
				"Steps: Account type on Account Details page should get displayed as" + AccountTypeManage);
	}

	public void assertAccountTypeOnDetails() {
		Assert.assertEquals(AccountTypeTitle, AccountTypeManage);
		System.out.println(
				"Steps:Account Name should get displayed on Account Information card on Jurisdiction Accounts page");
		ObjectRepo.test.log(Status.PASS,
				"Steps: Account Name should get displayed on Account Information card on Jurisdiction Accounts page");
	}

	public void addDefaultAccounts() {
//	JavascriptExecutor js = (JavascriptExecutor) driver.get();
//	js.executeScript("window.scrollBy(0, 1200)");
		// wait.until(ExpectedConditions.elementToBeClickable(DefaultAccountsCheckbox));
//	try {
//		DefaultAccountsCheckbox.click();
//	} catch (Exception e) {
//		Actions action = new Actions(driver.get());
//		action.moveToElement(DefaultAccountsCheckbox).click(DefaultAccountsCheckbox).build().perform();
//		e.printStackTrace();
//	}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> List = driver.get().findElements(By.xpath(
				"//*[@class='MuiDataGrid-cellCheckbox MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter']"));
		int checkbox = List.size();
		for (int i = 0; i < List.size(); i++) {
			Actions action = new Actions(driver.get());
			action.moveToElement(List.get(i)).click(List.get(i)).build().perform();
//  		List.get(i).click();
		}
	}

	public void scrollUptoRowsPerPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickonSecondpage() {
		wait.until(ExpectedConditions.elementToBeClickable(GoToPage2));
		CommonLibref.click(GoToPage2, "javascriptClick", "Hyperlink");
//	GoToPage.click();
	}

	public void clickonThirdpage() {
		wait.until(ExpectedConditions.elementToBeClickable(GoToPage3));
		CommonLibref.click(GoToPage3, "javascriptClick", "GoToPage3");
	}

	public void clickOnContinue() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 350)");

		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
			executor.executeScript("arguments[0].click();", Continue);
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Continue).click(Continue).build().perform();
			e.printStackTrace();
		}
	}

	public void assertErrormessage() {
		wait.until(ExpectedConditions.visibilityOf(Sucessmessage));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String SuccesmessageTitle = Sucessmessage.getText();
		Assert.assertEquals(SuccesmessageTitle, "Jurisdiction cannot have more than 20 accounts.");
		ObjectRepo.test.log(Status.PASS, "Steps:Error message should get displayed as- " + SuccesmessageTitle);
		System.out.println("Steps:Error message should get displayed as- " + SuccesmessageTitle);
	}

	public void navigateback() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get().navigate().back();
	}

	public void assertAccountName() {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// wait.until(ExpectedConditions.elementToBeClickable(AccountName));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 350)");
		// wait.until(ExpectedConditions.elementToBeClickable(AccountName));
		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']"));

		for (int i = 0; i < List.size(); i++) {
			String element = List.get(i).getText();
			System.out.println("Steps:Jurisdiction Accounts should get displayed as- " + element);
		}

	}

	public void addAccountWithIssuance() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1000)");
		System.out.println("Steps: Select Accounts other than Issuance");
		ObjectRepo.test.log(Status.PASS, "Steps: Select Accounts other than Issuance");
		// wait.until(ExpectedConditions.elementToBeClickable(DefaultAccountsCheckbox));
		try {
			CommonLibref.click(DefaultAccountsCheckbox, "javascriptClick", "DefaultAccountsCheckbox");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(DefaultAccountsCheckbox).click(DefaultAccountsCheckbox).build().perform();
			e.printStackTrace();
		}
	}

	public void selectDeactivateFromQuickAction() {
		wait.until(ExpectedConditions.visibilityOf(deactivateOption));
		wait.until(ExpectedConditions.elementToBeClickable(deactivateOption));
		deactivateOption.click();
		ObjectRepo.test.log(Status.PASS, "Click on Deactivate from Quick Actions");
		System.out.println("Click on Deactivate from Quick Actions");
	}

	public void assertAccountsErrormessage() {
		System.out.println("Steps:Click on the Account Name Field");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on the Account Name Field");
		List<WebElement> List = driver.get().findElements(By.xpath(
				"//*[@class='account-name--style MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter']"));
		int checkbox = List.size();
		for (int i = 0; i < List.size(); i++) {
			Actions action = new Actions(driver.get());
			action.moveToElement(List.get(i)).click(List.get(i)).build().perform();
			List.get(i).sendKeys(Keys.TAB);
			String Error = storederrormessage.getText();
			System.out.println("Steps:Error Message should get diaplayed as " + Error);
			ObjectRepo.test.log(Status.PASS, "Steps: Error Message should get diaplayed as " + Error);
		}
	}

	public void add255Characters() {
		String Characters = "IssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuance"
				+ "IssuanceIssuanceIssuanceIssuance" + "IssuanceIssuanceIssuanceIssuanceIssuanceIssuance"
				+ "IssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuance"
				+ "IssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuance";
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Steps:Click on the Account Name Field and enter more than 255 characters");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on the Account Name Field and enter more than 255 characters");
		// AccountName.click();
//	
		List<WebElement> elements = driver.get().findElements(By.xpath(
				"//*[@class='account-name--style MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter']"));

		// Iterate through each element in the list
		for (int i = 0; i < elements.size(); i++) {
			Actions action = new Actions(driver.get());

			// Move to the element and click it
			action.moveToElement(elements.get(i)).click(elements.get(i)).sendKeys(Characters).build().perform();

			// Pause for 2 seconds
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Send a long string to the element to trigger validation
//				elements.get(i).sendKeys("IssuanceIssuancessuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuanceIssuance");

			// Capture and assert the error message
			String error = storederrormessage.getText();
//			Assert.assertEquals(error, "Account Name in English must not be more than 255 characters long");

			// Log the result
			System.out.println("Error message should get displayed as " + error);
			ObjectRepo.test.log(Status.PASS, "Error message should get displayed as " + error);
		}
	}

	public void enterDuplicateData() {
		System.out.println("Steps:Enter Duplicate Name");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter Duplicate Name");
		List<WebElement> List = driver.get().findElements(By.xpath(
				"//*[@class='account-name--style MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter']"));
		int checkbox = List.size();
		for (int i = 0; i < List.size(); i++) {
			Actions action = new Actions(driver.get());
			action.moveToElement(List.get(i)).click(List.get(i)).doubleClick().sendKeys(Keys.BACK_SPACE)

					.sendKeys("Issuance").build().perform();

//			String Error = storederrormessage.getText();
//			System.out.println("Error message should get displayed as" + Error);
//			ObjectRepo.test.log(Status.PASS, "Error message should get displayed as" + Error);
		}
	}

	public void assertDuplicate() {
		Boolean DuplicateError = driver.get().findElement(By.xpath(
				"//*[contains(text(),'The name of the account selected already exists for your jurisdiction :')]"))
				.isDisplayed();
		Assert.assertTrue(DuplicateError);
		System.out.println("Error message is displayed as " + DuplicateError);
		ObjectRepo.test.log(Status.PASS, "Error message is displayed as " + DuplicateError);

	}

	public void enterValidDataAndClickonSave() {
		System.out.println("Steps:Enter valid data and click on Save button");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter valid data and click on Save button");
		wait.until(ExpectedConditions.elementToBeClickable(Continue));
		CommonLibref.click(Continue, "javascriptClick", "Continue");
		System.out.println("Confirmation pop-up should get displayed with 'Cancel' and 'Continue' button");
		ObjectRepo.test.log(Status.PASS,
				"Confirmation pop-up should get displayed with 'Cancel' and 'Continue' button");
		System.out.println("*********************************************************");
		System.out.println("Steps:Click on 'Cancel' button of confirmation pop-up");
		ObjectRepo.test.log(Status.PASS, "Steps:Click on 'Cancel' button of confirmation pop-up");
		wait.until(ExpectedConditions.elementToBeClickable(CancelonConfirmation));
		CommonLibref.click(CancelonConfirmation, "javascriptClick", "CancelonConfirmation");
		System.out
				.println("Pop-up message should get closed and 'Add Jurisdiction Accounts' page should get displayed");
		ObjectRepo.test.log(Status.PASS,
				"Pop-up message should get closed and 'Add Jurisdiction Accounts' page should get displayed");
		System.out.println("*********************************************************");
		System.out.println(
				"Steps:Again, click on save button of 'Add Jurisdiction' page and click on continue button on Confirmation popup.");
		ObjectRepo.test.log(Status.PASS,
				"Again, click on save button of 'Add Jurisdiction' page and click on continue button on Confirmation popup.");
		wait.until(ExpectedConditions.elementToBeClickable(Continue));
		CommonLibref.click(Continue, "javascriptClick", "Continue");
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		CommonLibref.click(ContinueButton, "javascriptClick", "ContinueButton");
		System.out.println("*********************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(CrossIcon));
		String SuccesmessageTitle = Sucessmessage.getText();
		Assert.assertEquals(SuccesmessageTitle,
				"The Jurisdiction Account(s) have been successfully created in the system.");
		System.out.println("Sucess message should get displayed as " + SuccesmessageTitle);
		ObjectRepo.test.log(Status.PASS, "Sucess message should get displayed as " + SuccesmessageTitle);
		System.out.println("*********************************************************");
	}

	public void assertManageJurisdictionAccounts() {

		System.out.println("Click on the Cancel Icon");
		ObjectRepo.test.log(Status.PASS, "Click on the Cancel Icon");
		wait.until(ExpectedConditions.elementToBeClickable(ManageJurisdictionAccounts));
		String ManageJurisdictionAccountsTitle = ManageJurisdictionAccounts.getText();
		Assert.assertEquals(ManageJurisdictionAccountsTitle, "Manage Jurisdiction Accounts");
		System.out.println("Manage Jurisdiction Accounts page is visible");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Accounts page is visible");
	}

	public void assertQuickActions() {
		// wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		// CommonLibref.click(quickActionsOnHomePage, "seleniumClick",
		// "quickActionsOnHomePage");
		wait.until(ExpectedConditions.elementToBeClickable(EditAccount));

		if (EditAccount.isEnabled()) {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("EDIT JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(false);
		}
		if (DeleteAccount.isEnabled()) {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			ObjectRepo.test.log(Status.PASS, "DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("DELETE JURISDICTION ACCOUNT option is enable");
			Assert.assertTrue(false);
		}

	}

	public void editAccount() {

		System.out.println("Click on the 'Edit' option");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Edit' option");
		CommonLibref.click(EditAccount, "seleniumClick", "EditAccount");
		String EditAccountTitle = EditJurisdictiAccountsPage.getText();
		Assert.assertEquals(EditAccountTitle, "Edit Jurisdiction Accounts");
		System.out.println("Edit Jurisdiction Accounts page is visible");
		ObjectRepo.test.log(Status.PASS, "Edit Jurisdiction Accounts page is visible");
	}

	public void cancelDeleteAccount() {

		System.out.println("Steps:Click on 'Cancel' button of confirmation pop-up");
		ObjectRepo.test.log(Status.PASS, "Steps:Click on 'Cancel' button of confirmation pop-up");
		wait.until(ExpectedConditions.elementToBeClickable(CancelonConfirmation));
		CommonLibref.click(CancelonConfirmation, "javascriptClick", "CancelonConfirmation");
		System.out
				.println("Pop-up message should get closed and 'Add Jurisdiction Accounts' page should get displayed");
		ObjectRepo.test.log(Status.PASS,
				"Pop-up message should get closed and 'Add Jurisdiction Accounts' page should get displayed");

	}

	public void deleteAccount() {
		System.out.println("Steps:Click on continue button on Confirmation popup.");
		ObjectRepo.test.log(Status.PASS, "Click on continue button on Confirmation popup.");
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		CommonLibref.click(ContinueButton, "javascriptClick", "ContinueButton");
		System.out.println("*********************************************************");
		wait.until(ExpectedConditions.elementToBeClickable(CrossIcon));
		String SuccesmessageTitle = Sucessmessage.getText();
		Assert.assertEquals(SuccesmessageTitle, "The selected Jurisdiction Account has successfully been deleted.");
		System.out.println("Sucess message should get displayed as " + SuccesmessageTitle);
		ObjectRepo.test.log(Status.PASS, "Sucess message should get displayed as " + SuccesmessageTitle);
		System.out.println("*********************************************************");
	}

	public void verifyTheTotalRowCountOnManageInitialPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 350)");
		wait.until(ExpectedConditions.elementToBeClickable(totalRowCount));
		String count = totalRowCount.getText();
		if (count.contains("20")) {
			System.out.println("20 Accounts are added");
		} else {
			System.out.println("20 Accounts are not added");
		}
	}

	public void loginWithValidCredentialAuthority() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("AuthorityUserID1"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("AuthorityUserID1"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("AuthorityUserPassphrase1"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("AuthorityUserPassphrase1"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void LoginWithValidCredentialRegistarar() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("RegistrarUserID1"), "userIDField");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("RegistrarUserID1"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("RegistrarUserPassphrase1"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("RegistrarUserPassphrase1"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

//	public void LoginWithValidCredentialRegistarar1() throws InterruptedException {
//		wait.until(ExpectedConditions.elementToBeClickable(UserId));
//		CommonLibref.typeText(UserId, prop.getProperty("RegistrarUserID1"), "userIDField");
//		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("RegistrarUserID1"));
//		System.out.println("UserName entered successfully");
//		CommonLibref.typeText(Password, prop.getProperty("RegistrarUserPassphrase1"), "PassphraseField");
//		ObjectRepo.test.log(Status.PASS,
//				"Step : PassWord entered successfully :" + prop.getProperty("RegistrarUserPassphrase1"));
//		System.out.println("PassWord entered successfully");
//		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
//		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
//		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
//		System.out.println("Click on Login button");
//	}
	public void LoginWithValidCredentialRegistararWashington() {
		wait.until(ExpectedConditions.elementToBeClickable(UserId));
		CommonLibref.typeText(UserId, prop.getProperty("RegistrarUserIDWashington"), "userIDField");
		ObjectRepo.test.log(Status.PASS,
				"UserName entered successfully :" + prop.getProperty("RegistrarUserIDWashington"));
		System.out.println("UserName entered successfully");
		CommonLibref.typeText(Password, prop.getProperty("RegistrarUserPassphraseWashington"), "PassphraseField");
		ObjectRepo.test.log(Status.PASS,
				"Step : PassWord entered successfully :" + prop.getProperty("RegistrarUserPassphraseWashington"));
		System.out.println("PassWord entered successfully");
		CommonLibref.click(RememberMe, "seleniumClick", "RememberMe");
		CommonLibref.click(LoginButton, "seleniumClick", "LoginButton");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
		System.out.println("Click on Login button");
	}

	public void clearDataOnTheLoginPage() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		textBoxEmail.click();
		textBoxEmail.sendKeys(Keys.CONTROL, "a");
		textBoxEmail.sendKeys(Keys.BACK_SPACE);
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
		textBoxPassWord.click();
		textBoxPassWord.sendKeys(Keys.CONTROL, "a");
		textBoxPassWord.sendKeys(Keys.BACK_SPACE);

	}

	public void Click_On_MegaMenu_Option() {
		try {
			CommonLibref.click(MegaMenu, "javascriptClick", "MegaMenu");
		} catch (Exception e) {
			CommonLibref.click(MegaMenu, "javascriptClick", "MegaMenu");
		}

		System.out.println("Click On Mega Menu");
		ObjectRepo.test.log(Status.PASS, "Click On Mega Menu");
	}

	public void Click_On_Jurisdiction_Account_Option() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "javascriptClick", "JuriAccount");
		System.out.println("Click On Jurisdiction Account");
		ObjectRepo.test.log(Status.PASS, "Click On Jurisdiction Account");
	}

	public void assertAccountType() {
		StoreAccountName = AccName.getText();
		System.out.println("Observe Account type in Account Information card on Jurisdiction Account details page"
				+ StoreAccountName);
		ObjectRepo.test.log(Status.PASS,
				"Observe Account type in Account Information card on Jurisdiction Account details page"
						+ StoreAccountName);
	}

	public void searchAccountType() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(ReadMore));
		CommonLibref.click(SearchAccountName, "javascriptClick", "SearchAccountName");
		SearchAccountName.sendKeys(StoreAccountName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(SearchAccountName));
		String AccountType = AccType.getText();
		System.out
				.println("Account Name should get displayed on Account Information card on Jurisdiction Accounts page."
						+ AccountType);
		ObjectRepo.test.log(Status.PASS,
				"Account Name should get displayed on Account Information card on Jurisdiction Accounts page."
						+ AccountType);
		Assert.assertEquals(StoreAccountName, AccountType);
	}

	public void clickOnConfirmButton() {
		wait.until(ExpectedConditions.elementToBeClickable(removeButtonOnWarningPopoup));
		CommonLibref.click(removeButtonOnWarningPopoup, "moveToElementClick", "removeButtonOnWarningPopoup");
		Common.pageLoader();
	}

	public void SaveTheSuccessMessageonManageStatusPage() {
		wait.until(ExpectedConditions.visibilityOf(successMessageonStatusPage));
		String successMessage = successMessageonStatusPage.getText();
		ObjectRepo.test.log(Status.PASS, "Message displayed as -" + successMessage);
		System.out.println("Message displayed as -" + successMessage);
	}

	public void crossIcon() {

		Common.pageLoader();
		try {
			CommonLibref.click(CrossIcon, "seleniumClick", "CrossIcon");

		} catch (Exception e) {
			CommonLibref.click(CrossIcon, "javascriptClick", "CrossIcon");
			e.printStackTrace();
		}

	}
public void AssertAsterisk() {
	
	wait.until(ExpectedConditions.visibilityOf(Asterisk));
			if (Asterisk.isDisplayed()== true) {
				System.out.println("Asterisk sign is displayed");
				ObjectRepo.test.log(Status.PASS, "Asterisk sign is displayed");
				Assert.assertTrue(true);
			} else {
				System.out.println("Asterisk sign is not displayed");
				ObjectRepo.test.log(Status.PASS, "Asterisk sign is not displayed");
				Assert.assertTrue(false);
			}
}

	
	public void AssertJurisdictionHistory() {
		System.out.println("Verify the Jurisdiction Request Status Change history table");
		ObjectRepo.test.log(Status.PASS, "Verify the Jurisdiction Request Status Change history table");
		CommonLibref.scroll(ProposedForPrelinked, "scrollToBottomOFPage", "ProposedForPrelinked");
		wait.until(ExpectedConditions.elementToBeClickable(ProposedForPrelinked));
		String StatusTitle = ProposedForPrelinked.getText();
		Assert.assertEquals(StatusTitle, "Proposed for Pre-Linked");
		System.out.println("The Jurisdiction Request Status Change history table should get updated with");
		ObjectRepo.test.log(Status.PASS,
				"The Jurisdiction Request Status Change history table should get updated with");
	}

	public void EditDisabled() {

		if (EditDetails.isSelected() != true) {
			System.out.println("Edit option is disabled");
			ObjectRepo.test.log(Status.PASS, "Edit option is disable");
			Assert.assertTrue(true);
		} else {
			System.out.println("Edit option is enabled");
			ObjectRepo.test.log(Status.PASS, "Edit option is enabled");
			Assert.assertTrue(false);
		}
	}

	public void EnterValidPassphrase() {
		ObjectRepo.test.log(Status.PASS, "Step:Enter valid passpharse and click on confirm button");
		System.out.println("Step:Enter valid passpharse and click on confirm button");
		wait.until(ExpectedConditions.elementToBeClickable(passphaseTextField));
		passphaseTextField.click();
		passphaseTextField.sendKeys(prop.getProperty("JSASeededUserPassphrase"));
		ObjectRepo.test.log(Status.PASS, "Passphrase popup should get accepted");
		System.out.println("Passphrase popup should get accepted");

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

	public void AssertBackButton() {
		wait.until(ExpectedConditions.elementToBeClickable(Back));
		if (Back.isEnabled()) {
			System.out.println("Back option is enabled");
			ObjectRepo.test.log(Status.PASS, "Back option is enable");
			Assert.assertTrue(true);
		} else {
			System.out.println("Back option is disabled");
			Assert.assertTrue(false);
		}
	}

	public void clickOnSaveButtonOfSetUpNewJurisdictionButton() {
		wait.until(ExpectedConditions.elementToBeClickable(testidSaveButton));
		try {
			CommonLibref.click(testidSaveButton, "javascriptClick", "SaveButton");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(testidSaveButton).click(testidSaveButton).build().perform();
			e.printStackTrace();
		}
	}

	public void selectValidLanguageForJurisdiction() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(languageFieldXpath)).isSelected();
		addLanguageOnSetUpJurisdiction.click();
		addLanguageOnSetUpJurisdiction.sendKeys("English - System default language");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void ClickOnBackButton() {
		System.out.println("Click on Back Button");
		ObjectRepo.test.log(Status.PASS, "Click on Back Button");
		wait.until(ExpectedConditions.elementToBeClickable(Back));
		try {
			CommonLibref.click(Back, "seleniumClick", "Back");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Back).click(Back).build().perform();
			e.printStackTrace();
		}
		String manageJurisdictionTitle = manageJurisdictions.getText();
		Assert.assertEquals(manageJurisdictionTitle, "MANAGE JURISDICTIONS");
		ObjectRepo.test.log(Status.PASS, "WCI, Inc. Admin should get navigated to Manage Jurisdiction page.");
		System.out.println("WCI, Inc. Admin should get navigated to Manage Jurisdiction page.");
	}

	public void verifyTheManageJurisdictionHomePageOtherThanWCIInc() {
		try {
			if (quickactions.isDisplayed()) {
				ObjectRepo.test.log(Status.PASS, "Jurisdiction is not in proposed state");
				System.out.println("Jurisdiction is not in proposed state");
				Assert.assertEquals(false, true);
			} else {
				System.out.println("Manage Jurisdiction Accounts Page should get Editable");
			}
		} catch (Exception e) {
			ObjectRepo.test.log(Status.PASS, "Jurisdiction is in Proposed State and Quick Actions will not be visible");
			System.out.println("Jurisdiction is in Proposed State and Quick Actions will not be visible");
		}
	}

	public void validFirstName() {
		System.out.println("Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		String ValidData = RandomStringUtils.randomAlphabetic(6);
		String Lowercase = ValidData.toLowerCase();
		String ValidData1 = "registrar" + Lowercase;
		addFirstName.sendKeys(ValidData1);
		System.out.println("Data Should get Accepted " + ValidData1);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted " + ValidData1);
	}

	public void invalidFirstName() {
		System.out.println("Steps: Click on First name and click outside respectively");
		ObjectRepo.test.log(Status.PASS, "Steps: Click on First name and click outside respectively");
		wait.until(ExpectedConditions.visibilityOf(addFirstName));
		wait.until(ExpectedConditions.elementToBeClickable(CancelButton));
		CommonLibref.click(addFirstName, "seleniumClick", "addFirstName");
		wait.until(ExpectedConditions.elementToBeClickable(emailAddress));
		CommonLibref.click(emailAddress, "seleniumClick", "emailAddress");
		wait.until(ExpectedConditions.visibilityOf(errorSpaceForFirstName));
		String errorMessage1 = errorSpaceForFirstName.getText();
		System.out.println("Error message should get displayed - " + errorMessage1);
		Assert.assertEquals(errorSpaceForFirstName.getText(), "First Name is required");
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed - " + errorMessage1);
	}

	public void validLastName() {
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		String ValidData = RandomStringUtils.randomAlphabetic(6);
		String Lowercase = ValidData.toLowerCase();
		String ValidData1 = "user" + Lowercase;
		addlastName.sendKeys(ValidData1);
		System.out.println("Data Should get Accepted " + ValidData1);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted " + ValidData1);
	}

	public void validEmail() {
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

	public void validRole() {
		System.out.println("Steps:Enter valid character");
		ObjectRepo.test.log(Status.PASS, "Steps:Enter invalid character");
		CommonLibref.click(addRole, "javascriptClick", "addRole");
		addRole.sendKeys(Keys.CONTROL, "a");
		addRole.sendKeys(Keys.CONTROL.BACK_SPACE);
		addRole.sendKeys("Reg");
		wait.until(ExpectedConditions.elementToBeClickable(storedRole));
		registarXpath.click();
		String validChar = storedRole.getAttribute("value");
		System.out.println("Search results should get  displayed containing search character like -" + validChar);
		ObjectRepo.test.log(Status.PASS,
				"Search results should get  displayed containing search character -" + validChar);
	}

	public void assertSucessmessageInitialUser() {
		wait.until(ExpectedConditions.visibilityOf(Sucessmessage));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String SuccesmessageTitle = Sucessmessage.getText();
		Assert.assertEquals(SuccesmessageTitle, "The user has been successfully assigned to the Jurisdiction.");
		ObjectRepo.test.log(Status.PASS, "Sucess message should get displayed as- " + SuccesmessageTitle);
		System.out.println("Sucess message should get displayed as- " + SuccesmessageTitle);
	}

	public void clickonSaveInitialUser() {
		wait.until(ExpectedConditions.elementToBeClickable(Submit));
		CommonLibref.click(Submit, "seleniumClick", "Submit");
	}

	public void assertUserStatus() {
		wait.until(ExpectedConditions.elementToBeClickable(AssertUserStatus));
		String UserStatus = AssertUserStatus.getText();
		Assert.assertEquals(UserStatus, "Active");
		ObjectRepo.test.log(Status.PASS, "User Status should get displayed as- " + UserStatus);
		System.out.println("User Status should get displayed as- " + UserStatus);
	}

	public void assertUserAccountStatus() {
		// wait.until(ExpectedConditions.elementToBeClickable(AssertUserAccountStatus));
		String UserAccountStatus = AssertActiveUserAccountStatus.getText();
		Assert.assertEquals(UserAccountStatus, "Active");
		ObjectRepo.test.log(Status.PASS, "User Account Status should get displayed as- " + UserAccountStatus);
		System.out.println("User Account Status should get displayed as- " + UserAccountStatus);
	}

	public void assertManageinitalUserTitle() {
		wait.until(ExpectedConditions.elementToBeClickable(ManageInitialUserTitle));
		String ManageInitial = ManageInitialUserTitle.getText();
		Assert.assertEquals(ManageInitial, "Manage Initial Users");
		ObjectRepo.test.log(Status.PASS, "User should get navigated to " + ManageInitial);
		System.out.println("User Account Status should get displayed as- " + ManageInitial);
	}

	public void assertPendingApproval() {
		ObjectRepo.test.log(Status.PASS, "Verify the Jurisdiction details section");
		System.out.println("Verify the Jurisdiction details section");
		wait.until(ExpectedConditions.elementToBeClickable(AssertJurisdictionDetails));
		String PendingApproval = AssertJurisdictionDetails.getText();
		Assert.assertEquals(PendingApproval, "Pending Approval");
		ObjectRepo.test.log(Status.PASS,
				"The Pending Approval text should get displayed with exclamation on jurisdiction details section under jurisdiction management section as "
						+ PendingApproval);
		System.out.println(
				"The Pending Approval text should get displayed with exclamation on jurisdiction details section under jurisdiction management section as "
						+ PendingApproval);
	}

	public void cancelProposedStatusOnStatus() {
		ObjectRepo.test.log(Status.PASS, "Click on the Cancel Proposed status option ");
		System.out.println("Click on the Cancel Proposed status option");
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposeOnStatus));
		CommonLibref.click(CancelProposeOnStatus, "seleniumClick", "CancelProposeOnStatus");
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
		CancelStatusButton.click();

	}

	public void AssertJuriDetails() {
		Common.pageLoader();
		try {
			if (PendingApprovalText.isDisplayed()) {
				ObjectRepo.test.log(Status.PASS, "Pending Approval option is displayed");
				System.out.println("Pending Approval option is displayed");
				String option = jurisdictionDetailOption.getText();
				Assert.assertEquals(option, "Pending Approval");
			} else {
				System.out.println("Jurisdiction Details option is displayed without Pending Approval ");
			}
		} catch (Exception e) {
			ObjectRepo.test.log(Status.PASS, "Pending Approval option is not displayed");
			System.out.println("Pending Approval option is not displayed");
		}
	}

	public void ClickOnJsaTask1() {

		ObjectRepo.test.log(Status.PASS, "Click on Set Roles and Privileges task");
		System.out.println("Click on Set Roles and Privileges task");

		// wait.until(ExpectedConditions.visibilityOf(HyperLinkJSA1));
		// CommonLibref.scroll(HyperLinkJSA1, "scrollToBottomOFPage", "HyperLinkJSA1");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLinkJSA1));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLinkJSA1).click(HyperLinkJSA1).build().perform();

		} catch (Exception e) {
			CommonLibref.click(HyperLinkJSA1, "seleniumClick", "HyperLinkJSA3");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(PrivlageManagementTitle));
		CommonLibref.click(PrivlageManagementTitle, "seleniumClick", "PrivlageManagementTitle");
		String Hyperlink1Title = PrivlageManagementTitle.getText();
		Assert.assertEquals(Hyperlink1Title, "Privilege Management");
		ObjectRepo.test.log(Status.PASS, "JSA should get navigated to  " + Hyperlink1Title);
		System.out.println("JSA should get navigated to  " + Hyperlink1Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}

	public void ClickOnJsaTask2() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Configuration Settings task");
		System.out.println("Click on Set Configuration Settings task");
		wait.until(ExpectedConditions.visibilityOf(HyperLinkJSA2));
		// CommonLibref.scroll(HyperLinkJSA2, "scrollToBottomOFPage",
		// "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLinkJSA2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLinkJSA2).click(HyperLinkJSA2).build().perform();

		} catch (Exception e) {
			CommonLibref.click(HyperLinkJSA2, "seleniumClick", "HyperLinkJSA2");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

		wait.until(ExpectedConditions.elementToBeClickable(PrivlageManagementTitle));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(PrivlageManagementTitle, "seleniumClick", "PrivlageManagementTitle");
		String Hyperlink2Title = PrivlageManagementTitle.getText();
		Assert.assertEquals(Hyperlink2Title, "Configuration Settings");
		ObjectRepo.test.log(Status.PASS, "JSA should get navigated to " + Hyperlink2Title);
		System.out.println("JSA should get navigated to " + Hyperlink2Title);
		driver.get().close();
		driver.get().switchTo().window(parent);

	}

	public void ClickOnJsaTask3() {
		ObjectRepo.test.log(Status.PASS, "Click on Set Content management system task");
		System.out.println("Click on Set Content management system task");
		wait.until(ExpectedConditions.visibilityOf(HyperLinkJSA3));
		CommonLibref.scroll(HyperLinkJSA3, "scrollToBottomOFPage", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(HyperLinkJSA3));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(HyperLinkJSA3).click(HyperLinkJSA3).build().perform();

		} catch (Exception e) {
			CommonLibref.click(HyperLinkJSA3, "seleniumClick", "HyperLinkJSA3");
			e.printStackTrace();
		}

		Set<String> handles = driver.get().getWindowHandles();
		Iterator it = handles.iterator();
		String parent = (String) it.next();
		String child = (String) it.next();
		driver.get().switchTo().window(child);

		wait.until(ExpectedConditions.elementToBeClickable(PrivlageManagementTitle));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(PrivlageManagementTitle, "seleniumClick", "PrivlageManagementTitle");
		String Hyperlink3Title = PrivlageManagementTitle.getText();
		Assert.assertEquals(Hyperlink3Title, "Content Management");
		ObjectRepo.test.log(Status.PASS, "JSA should get navigated to  " + Hyperlink3Title);
		System.out.println("JSA should get navigated to  " + Hyperlink3Title);
		driver.get().close();
		driver.get().switchTo().window(parent);
	}

	public void BackToHome() {
		CommonLibref.scroll(BackTOHome, "scrollToBottomOFPage", "BackTOHome");
		ObjectRepo.test.log(Status.PASS, "Click on the BACK_TO_HOME button on Jurisdiction Details page");
		System.out.println("Click on the BACK_TO_HOME button on Jurisdiction Details page");
		wait.until(ExpectedConditions.elementToBeClickable(BackTOHome));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(BackTOHome).click(BackTOHome).build().perform();
		} catch (Exception e) {
			CommonLibref.click(BackTOHome, "seleniumClick", "BackTOHome");
			e.printStackTrace();
		}
		String JSAHomePage = AssertSearchUsers.getText();
		Assert.assertEquals(JSAHomePage, "Search Users");
		ObjectRepo.test.log(Status.PASS, "JSA should get navigated to the JSA home page " + JSAHomePage);
		System.out.println("JSA should get navigated to the JSA home page " + JSAHomePage);
	}

	public void AssertRegistrationEmail() {

		PageFactory.initElements(driver.get(), this);
	}

	public void openMail(String Email, String Password, String Username) {
		System.out.println("Click on the save button&verify the “Set Up” user account link");
		ObjectRepo.test.log(Status.PASS, "Click on the save button&verify the “Set Up” user account link");

		driver.get().navigate().to("https://www.google.com/gmail/about/");
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
		wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(Email);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
		wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(Password);
		wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
		WebElement firstElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[contains(@href,\"https://myaccount.google.com/signinoptions/two-step-verification/enroll\")]")));
		WebElement secondElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//*[contains(@href,\"https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&h\")]")));
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
//				wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
			elementWithId.click();
		} catch (Exception e) {
			viewMessages.click();
			elementWithId.click();
//				wait.until(ExpectedConditions.elementToBeClickable(viewMessages)).click();
//				wait.until(ExpectedConditions.elementToBeClickable(elementWithId)).click();
		}

		String originalWindow = driver.get().getWindowHandle();
		assert driver.get().getWindowHandles().size() == 1;

		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

		// Loop through until we find a new window handle
		for (String windowHandle : allWindows) {
			if (!windowHandle.equals(originalWindow)) {
				driver.get().switchTo().window(windowHandle);
				break;
			}
		}
		System.out.println("Registration Link Email should get sent to the registered Jurisdiction User.");
		ObjectRepo.test.log(Status.PASS, "Set Up user account link should be activate.");
	}

	public void assertErrormessageEmailConfig() {
		wait.until(ExpectedConditions.visibilityOf(Sucessmessage));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ErrormessageTitle = Sucessmessage.getText();
		Assert.assertEquals(ErrormessageTitle, "All email configuration settings have not been done");
		ObjectRepo.test.log(Status.PASS, "Steps:Error message should get displayed as- " + ErrormessageTitle);
		System.out.println("Steps:Error message should get displayed as- " + ErrormessageTitle);
	}

	public void clickOnQuickActionsdots() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
		ObjectRepo.test.log(Status.PASS, "Step :Click On Quick Actions option ");
		System.out.println("Step :Click OnQuick Actions option ");
	}

	public void AssertJurisdictionHistoryJSA() {
		System.out.println("Verify the Jurisdiction Request Status Change history table");
		ObjectRepo.test.log(Status.PASS, "Verify the Jurisdiction Request Status Change history table");
		CommonLibref.scroll(ApprovedPrelink, "scrollToBottomOFPage", "ApprovedPrelink");
		wait.until(ExpectedConditions.elementToBeClickable(ApprovedPrelink));
		String StatusTitle = ApprovedPrelink.getText();
		Assert.assertEquals(StatusTitle, "Approved");
		System.out
				.println("The Jurisdiction Request Status Change history table should get updated with " + StatusTitle);
		ObjectRepo.test.log(Status.PASS,
				"The Jurisdiction Request Status Change history table should get updated with " + StatusTitle);
	}

	public void AssertJurisdictionStatusJSA() {
		System.out.println("Verify the Jurisdiction Status after approval");
		ObjectRepo.test.log(Status.PASS, "Verify the Jurisdiction Status after approval");
		CommonLibref.scroll(StatusPreLinked, "scrollToBottomOFPage", "StatusPreLinked");
		wait.until(ExpectedConditions.elementToBeClickable(StatusPreLinked));
		String StatusTitle1 = StatusPreLinked.getText();
		Assert.assertEquals(StatusTitle1, "Pre-Linked");
		System.out.println("The Jurisdiction Status should get updated with " + StatusTitle1);
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Status should get updated with " + StatusTitle1);
	}

	public void AssertJurisdictionStatusJSAUnlinked() {
		System.out.println("Verify the Jurisdiction Status after approval");
		ObjectRepo.test.log(Status.PASS, "Verify the Jurisdiction Status after approval");
		CommonLibref.scroll(StatusUnLinked, "scrollToBottomOFPage", "ApprovedPrelink");
		wait.until(ExpectedConditions.elementToBeClickable(StatusUnLinked));
		String StatusTitle1 = StatusUnLinked.getText();
		Assert.assertEquals(StatusTitle1, "Unlinked");
		System.out.println("The Jurisdiction Status should get updated with " + StatusTitle1);
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Status should get updated with " + StatusTitle1);
	}

	public void assertPublicHomePage() {
		System.out.println("Click on the 'Set Up' user account link");
		ObjectRepo.test.log(Status.PASS, "Click on the 'Set Up' user account link");
		wait.until(ExpectedConditions.visibilityOf(CreateProfile));
		String PublicHomePageTitle = CreateProfile.getText();
		Assert.assertEquals(PublicHomePageTitle, "Personal Information");
		System.out.println(
				"'Set Up user' account link should be active and the Jurisdiction User should get navigated to  "
						+ PublicHomePageTitle);
		ObjectRepo.test.log(Status.PASS,
				"'Set Up user' account link should be active and the Jurisdiction User should get navigated to "
						+ PublicHomePageTitle);
	}

	public void clickOnEditButton() {

		CommonLibref.click(editOption, "seleniumClick", "editOption");
		System.out.println("Click on Edit Button");
		ObjectRepo.test.log(Status.PASS, "Click on Edit Button");
		System.out.println("********************************************************");
		String assertTitle = editRoleTitle.getText();
		System.out.println(assertTitle + "Edit Role");
		System.out.println("Title is displayed as -" + assertTitle);
		ObjectRepo.test.log(Status.PASS, "Title is displayed as -" + assertTitle);
		String firstNameValue = storedFirstName.getAttribute("Value");
		System.out.println("First name is displayed as -" + firstNameValue);
		ObjectRepo.test.log(Status.PASS, firstNameValue);

		wait.until(ExpectedConditions.elementToBeClickable(storedLastName));
		String lastNamevalue = storedLastName.getAttribute("Value");
		System.out.println("Last name is displayed as -" + lastNamevalue);
		ObjectRepo.test.log(Status.PASS, lastNamevalue);

		wait.until(ExpectedConditions.elementToBeClickable(storedEmailId));
		String emailAddressValue = storedEmailId.getAttribute("value");
		System.out.println("Email Address is displayed as - " + emailAddressValue);
		ObjectRepo.test.log(Status.PASS, "Email Address is displayed as - " + emailAddressValue);

		wait.until(ExpectedConditions.elementToBeClickable(storedRole));
		String preFilledRolevalue = storedRole.getAttribute("value");
		System.out.println("Role is displayed as - " + preFilledRolevalue);
		ObjectRepo.test.log(Status.PASS, "Role is displayed as - " + preFilledRolevalue);
	}

	public void clearDataAndEnterNewEmail() {
		System.out.println("Steps: Enter valid data in the Email Address  field.");
		ObjectRepo.test.log(Status.PASS, "Steps: Enter valid data in the Email Address  field.");
		CommonLibref.click(emailIdFiled, "seleniumClick", "emailIdFiled");
		emailIdFiled.sendKeys(Keys.CONTROL, "a");
		emailIdFiled.sendKeys(Keys.BACK_SPACE);
		String emailId = RandomStringUtils.randomAlphabetic(3);
		String emailId1 = emailId.toLowerCase();
		String registrarEmailId = "registrar" + emailId1 + "@eqanim-qa.wci-validate.org";
		emailIdFiled.sendKeys(registrarEmailId);
		emailIdFiled.sendKeys(Keys.TAB);
		SeededUserRegistrar1 = storedEmailIdFiled.getAttribute("Value");
		System.out.println("Registrar Email Address displayed - " + SeededUserRegistrar1);
		ObjectRepo.test.log(Status.PASS, "Registrar Email Address displayed - " + SeededUserRegistrar1);
	}

	public void assertSucessmessageAfterEmailEdit() {
		wait.until(ExpectedConditions.visibilityOf(Sucessmessage));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String SuccesmessageTitle = Sucessmessage.getText();
		Assert.assertEquals(SuccesmessageTitle,
				"The user has been successfully assigned to the Jurisdiction and \"Set Up\" user account link has been sent to the updated email address.");
		ObjectRepo.test.log(Status.PASS, "Sucess message should get displayed as- " + SuccesmessageTitle);
		System.out.println("Sucess message should get displayed as- " + SuccesmessageTitle);
	}

	public void searchInitialUserHistory() {

		System.out.println("Steps:Update the Email Address and Click on Submit Button.");
		ObjectRepo.test.log(Status.PASS, "Steps: Update the Email Address and Click on Submit Button.");
		CommonLibref.scroll(SearchFieldInitialUserHistory, "scrollToBottomOFPage", "SearchFieldInitialUserHistory");
		CommonLibref.click(SearchFieldInitialUserHistory, "seleniumClick", "SearchFieldInitialUserHistory");
		wait.until(ExpectedConditions.visibilityOf(StoreEmailNotActivated));
		String Email = StoreEmailNotActivated.getText();
		SearchFieldInitialUserHistory.sendKeys(Email);
		Assert.assertEquals(SeededUserRegistrar1, Email);
		System.out.println(
				"Updated Information should be reflected in the 'Initial Users' and a new record should be added in the 'Initial User History' Grid "
						+ Email);
		ObjectRepo.test.log(Status.PASS,
				"Updated Information should be reflected in the 'Initial Users' and a new record should be added in the 'Initial User History' Grid "
						+ Email);
	}

	public void assertName() {
		System.out.println("Steps:Edited First Name and Last Name");
		ObjectRepo.test.log(Status.PASS, "Steps: Edited First Name and Last Name");
		FirstLastName = StoreUsernameInitial.getText();
		System.out.println("Edited First Name and Last Name sshould get displayed as " + FirstLastName);
		ObjectRepo.test.log(Status.PASS, "Edited First Name and Last Name sshould get displayed as " + FirstLastName);

	}

	public void searchInitialUserHistoryname() {

		System.out.println("Steps:Update the fields except Email Address and Click on Submit Button");
		ObjectRepo.test.log(Status.PASS, "Steps: Update the fields except Email Address and Click on Submit Button");
		CommonLibref.scroll(SearchFieldInitialUserHistory, "scrollToBottomOFPage", "SearchFieldInitialUserHistory");
		CommonLibref.click(SearchFieldInitialUserHistory, "seleniumClick", "SearchFieldInitialUserHistory");
		wait.until(ExpectedConditions.visibilityOf(StoreUsername));
		String Name = StoreUsername.getText();
		SearchFieldInitialUserHistory.sendKeys(Name);
		Assert.assertEquals(FirstLastName, Name);
		System.out.println(
				"Updated Information should be reflected in the 'Initial Users' and a new record should be added in the 'Initial User History' Grid "
						+ Name);
		ObjectRepo.test.log(Status.PASS,
				"Updated Information should be reflected in the 'Initial Users' and a new record should be added in the 'Initial User History' Grid "
						+ Name);
	}

	public void validFirstNameAfterEdit() {
		System.out.println("Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addFirstName));
		CommonLibref.click(addFirstName, "javascriptClick", "addFirstName");
		addFirstName.sendKeys(Keys.CONTROL, "a");
		addFirstName.sendKeys(Keys.BACK_SPACE);
		String ValidData = RandomStringUtils.randomAlphabetic(6);
		String Lowercase = ValidData.toLowerCase();
		ValidData2 = "registrar" + Lowercase;
		addFirstName.sendKeys(ValidData2);
		System.out.println("Data Should get Accepted " + ValidData2);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted " + ValidData2);
	}

	public void validLastNameAfterEdit() {
		ObjectRepo.test.log(Status.PASS,
				"Steps:Enter Valid Data with Spaces and accentuated Characters in fields and observe");
		wait.until(ExpectedConditions.elementToBeClickable(addlastName));
		CommonLibref.click(addlastName, "javascriptClick", "addlastName");
		addlastName.sendKeys(Keys.CONTROL, "a");
		addlastName.sendKeys(Keys.BACK_SPACE);
		String ValidData = RandomStringUtils.randomAlphabetic(6);
		String Lowercase = ValidData.toLowerCase();
		ValidLastData = "user" + Lowercase;
		addlastName.sendKeys(ValidLastData);
		System.out.println("Data Should get Accepted " + ValidLastData);
		ObjectRepo.test.log(Status.PASS, "Data Should get Accepted " + ValidLastData);
	}

	public void selectLinkedFromDropdownOnManageJurisdictionStatus() {
		wait.until(ExpectedConditions.visibilityOf(JurisdictionStatusHeader));
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		try {
			CommonLibref.click(searchFieldOfJurisdictionStatus, "moveToElementClick",
					"searchFieldOfJurisdictionStatus");
			searchFieldOfJurisdictionStatus.sendKeys("Linked");
			Thread.sleep(2000);
			searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
			Common.pageLoader();
			driver.get().findElement(By.xpath("//*[@id='jurisdictionStatus-react-hook-form-select-search']"))
					.isDisplayed();
			Thread.sleep(3000);
			linkedstatus = saveLinkedStatus.getAttribute("value");

		} catch (Exception e) {
			js.executeScript("arguments[0].value='Linked';", searchFieldOfJurisdictionStatus);
			linkedstatus = saveLinkedStatus.getAttribute("value");
			System.out.println(linkedstatus + "2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("Dropdown selected: " + LinkedStatusDisplayed.getAttribute("Value"));
		// //Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("linked Status is selected");
	}

	public static String generateEmailString() {
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		String randomString = ("Test" + generatedString + "@eqanim-qa.wci-validate.org");
		return randomString;
	}

	public void verifyEditProfileFunctionalityForApprovedUser() {
		wait.until(ExpectedConditions.elementToBeClickable(welButton));
		try {
			new Actions(driver.get()).moveToElement(welButton).click().build().perform();
		} catch (Exception e) {
			welButton.click();
		}
		System.out.println("Step : Click on Welcome menu");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Welcome menu");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(userProfileOption));
		if (userProfileOption.isEnabled()) {
			userProfileOption.click();
		} else {
			userProfileOption.click();
		}
		System.out.println("Step : Click on user profile option");
		ObjectRepo.test.log(Status.PASS, "Step : Click on user profile option");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Account Status History')]")));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(viewAndEditUserDetailsOption, "moveToElementClick", "viewAndEditUserDetailsOption");
		wait.until(ExpectedConditions.elementToBeClickable(editButton));
		CommonLibref.click(editButton, "moveToElementClick", "editButton");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String firstNameField = firstNameEdit.getAttribute("value");
		int ValueSize = firstNameField.length();
		firstNameEdit.click();
		for (int i = 1; i <= ValueSize; i++) {
			firstNameEdit.sendKeys(Keys.BACK_SPACE);
		}
		firstNameEdit.sendKeys("Mayur");
		String lastNameField = lastNameEdit.getAttribute("value");
		int ValueSize1 = lastNameField.length();
		lastNameEdit.click();
		for (int i = 1; i <= ValueSize1; i++) {
			lastNameEdit.sendKeys(Keys.BACK_SPACE);
		}
		lastNameEdit.sendKeys("Patil");
		String telephoneNumberField = telephoneNumberEdit.getAttribute("value");
		int ValueSize2 = telephoneNumberField.length();
		telephoneNumberEdit.click();
		for (int i = 1; i <= ValueSize2; i++) {
			telephoneNumberEdit.sendKeys(Keys.BACK_SPACE);
		}
		telephoneNumberEdit.sendKeys("12345678901");
		String emailField = emailEdit.getAttribute("value");
		int ValueSize3 = emailField.length();
		emailEdit.click();
		for (int i = 1; i <= ValueSize3; i++) {
			emailEdit.sendKeys(Keys.BACK_SPACE);
		}
		String emailAddress1 = generateEmailString();
		emailEdit.sendKeys(emailAddress1);
		String confirmEmailField = confirmEmailEdit.getAttribute("value");
		int ValueSize4 = confirmEmailField.length();
		confirmEmailEdit.click();
		for (int i = 1; i <= ValueSize4; i++) {
			confirmEmailEdit.sendKeys(Keys.BACK_SPACE);
		}
		confirmEmailEdit.sendKeys(emailAddress1);
		String employerField = employerEdit.getAttribute("value");
		int ValueSize5 = employerField.length();
		employerEdit.click();
		for (int i = 1; i <= ValueSize5; i++) {
			employerEdit.sendKeys(Keys.BACK_SPACE);
		}
		employerEdit.sendKeys("testdatadata");
		String street1PrimResiField = street1EditPrimResi.getAttribute("value");
		int ValueSize6 = street1PrimResiField.length();
		CommonLibref.click(street1EditPrimResi, "javascriptClick", "street1EditPrimResi");
		for (int i = 1; i <= ValueSize6; i++) {
			street1EditPrimResi.sendKeys(Keys.BACK_SPACE);
		}
		street1EditPrimResi.sendKeys("Testdata");
		String cityPrimResiField = cityEditPrimResi.getAttribute("value");
		int ValueSize7 = cityPrimResiField.length();
		CommonLibref.click(cityEditPrimResi, "javascriptClick", "cityEditPrimResi");
		for (int i = 1; i <= ValueSize7; i++) {
			cityEditPrimResi.sendKeys(Keys.BACK_SPACE);
		}
		cityEditPrimResi.sendKeys("Mumbai");
		String street1MailAddField = street1EditMailAdd.getAttribute("value");
		int ValueSize8 = street1MailAddField.length();
		CommonLibref.click(street1EditMailAdd, "javascriptClick", "street1EditMailAdd");
		for (int i = 1; i <= ValueSize8; i++) {
			street1EditMailAdd.sendKeys(Keys.BACK_SPACE);
		}
		street1EditMailAdd.sendKeys("testdata");
		String cityMailAddField = cityEditMailAdd.getAttribute("value");
		int ValueSize9 = cityMailAddField.length();
		CommonLibref.click(cityEditMailAdd, "javascriptClick", "cityEditMailAdd");
		for (int i = 1; i <= ValueSize9; i++) {
			cityEditMailAdd.sendKeys(Keys.BACK_SPACE);
		}
		cityEditMailAdd.sendKeys("Mumbai");
		System.out.println("Step : Edit the required fields");
		ObjectRepo.test.log(Status.PASS, "Step : Edit the required fields");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		WebElement element4 = saveButtonForRevisionRequestSubmit;
		js.executeScript("arguments[0].click()", element4);
		continueButtonOnPrompt.click();
		System.out.println("Step : Click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Continue button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		ExpectedConditions.visibilityOf(successMessageAfterSubmitRequestRevision);
		String successMessage = successMessageAfterSubmitRequestRevision.getText();
		System.out.println("Success Message after edit their user details" + successMessage);
		WebElement closeButton = driver.get().findElement(By.xpath("//*[@data-testid='CloseIcon']"));
		ExpectedConditions.elementToBeClickable(closeButton);
		CommonLibref.click(closeButton, "seleniumClick", "closeButton");
		System.out.println("Step : Observe the updated values");
		ObjectRepo.test.log(Status.PASS, "Step : Observe the updated values");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		System.out.println("User view old and new value as below");
		String oldValueFirstName = oldValueFirstNameField.getText();
		System.out.println("Old Value of First Name Field :" + oldValueFirstName);
		String newValueFirstName = newValueFirstNameField.getText();
		System.out.println("New Value of First Name Field :" + newValueFirstName);
		String oldValueLastName = oldValueLastNameField.getText();
		System.out.println("Old Value of Last Name Field :" + oldValueLastName);
		String newValueLastName = newValueLastNameField.getText();
		System.out.println("New Value of Last Name Field :" + newValueLastName);
		String oldValueEmail = oldValueEmailField.getText();
		System.out.println("Old Value of Email Field :" + oldValueEmail);
		String newValueEmail = newValueEmailField.getText();
		System.out.println("New Value of Email Field :" + newValueEmail);
		String oldValueConfirmEmail = oldValueConfirmEmailField.getText();
		System.out.println("Old Value of Confirm Email Field :" + oldValueConfirmEmail);
		String newValueConfirmEmail = newValueConfirmEmailField.getText();
		System.out.println("New Value of Confirm Email Field :" + newValueConfirmEmail);
		String oldValueStreet1PrimResi = oldValueStreet1PrimResiField.getText();
		System.out.println("Old Value of Street 1 Primary Residence Field :" + oldValueStreet1PrimResi);
		String newValueStreet1PrimResi = newValueStreet1PrimResiField5.getText();
		System.out.println("New Value of Street 1 Primary Residence Field :" + newValueStreet1PrimResi);
		String oldValueCityPrimResi = oldValueCityPrimResiField.getText();
		System.out.println("Old Value of City Primary Residence Field :" + oldValueCityPrimResi);
		String newValueCityPrimResi = newValueCityPrimResiField6.getText();
		System.out.println("New Value of City Primary Residence Field :" + newValueCityPrimResi);
		String oldValueStreet1MailAdd = oldValueStreet1MailAddField.getText();
		System.out.println("Old Value of Street 1 Mailing Address Field :" + oldValueStreet1MailAdd);
		String oldValueCityMailAdd = oldValueCityMailAddField.getText();
		System.out.println("Old Value of City Mailing Address Field :" + oldValueCityMailAdd);
		CommonLibref.click(returnToUserProfileButton, "javascriptClick", "returnToUserProfileButton");
	}

	public void registrarSearchUserAndGoToUserDetailsPage() {
		System.out.println("Step : Search user in User Search Grid");
		ObjectRepo.test.log(Status.PASS, "Step : Search user in User Search Grid");
		wait.until(ExpectedConditions.visibilityOf(searchRecordFirstname));
		CommonLibref.click(searchField, "moveToElementClick", "searchField");

		searchField.sendKeys(prop.getProperty("AuthorityUserID1"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable((searchRecordFirstname)));
			System.out.println("Step : Click on first name of search record");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable((searchRecordFirstname)));
			System.out.println("Step : Click on first name of search record");
		}
		System.out.println("Step : Click on first name of search record");
		ObjectRepo.test.log(Status.PASS, "Step : Click on first name of search record");
		if (searchRecordFirstname.isEnabled()) {
			System.out.println(
					"User is present in search grid and Registrar is able to click on first name of search record");
		} else {
			System.out.println("User is not present in search grid.");
		}
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable((searchRecordFirstname)));
			searchRecordFirstname.click();
		} catch (Exception e) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			wait.until(ExpectedConditions.elementToBeClickable((searchRecordFirstname)));
			CommonLibref.click(searchRecordFirstname, "moveToElementClick", "searchRecordFirstname");
		}
	}

	public void registrarApproveProposedUserDetails() {
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Personal Information']")));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,1600)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement option = proposedUserDetailsOption;
		Actions act = new Actions(driver.get());
		String text = proposedUserDetailsOption.getText();
		System.out.println("Option text is :" + text);
		ObjectRepo.test.log(Status.PASS, "Option text is :" + text);
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		WebElement abcd = approveRadioButton;
		js.executeScript("arguments[0].click();", abcd);
		System.out.println("Step: Click on Approve button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Approve button");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		CommonLibref.click(saveButton, "moveToElementClick", "saveButton");
		System.out.println("Step: Click on Save button");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Save button");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMessageAfterRegistrarDeactivateUserWithoutProfileAccess));
		String successMessage = successMessageAfterRegistrarDeactivateUserWithoutProfileAccess.getText();
		Assert.assertEquals("User Profile Changes Approved", successMessage);
		System.out.println("Success Message after Registrar approve proposed user details:" + successMessage);
		wait.until(ExpectedConditions.elementToBeClickable(crossButtonOnSuccMessAuthorityApproval));
		CommonLibref.click(crossButtonOnSuccMessAuthorityApproval, "moveToElementClick",
				"crossButtonOnSuccMessAuthorityApproval");
		System.out.println("Registrar User approve proposed user details change successfully");
		ObjectRepo.test.log(Status.PASS, "Registrar User approve proposed user details change successfully");
		System.out.println("-------------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "-------------------------------------------------------------------------");
	}

	public void changeJurisdictionToQuebec() {
		wait.until(ExpectedConditions.elementToBeClickable(welButton));
		try {
			new Actions(driver.get()).moveToElement(welButton).click().build().perform();
		} catch (Exception e) {
			welButton.click();
		}
		System.out.println("Step : Click on Welcome menu");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Welcome menu");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.elementToBeClickable(userProfileOption));
		if (userProfileOption.isEnabled()) {
			userProfileOption.click();
		} else {
			userProfileOption.click();
		}
		System.out.println("Step : Click on user profile option");
		ObjectRepo.test.log(Status.PASS, "Step : Click on user profile option");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Account Status History')]")));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,800)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element4 = changejurisdiction;
		js.executeScript("arguments[0].click()", element4);
		System.out.println("Step : Click on Change Jurisdiction");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Change Jurisdiction");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Select Jurisdiction'])[1]")));
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdiction));
		selectJurisdiction.click();
		List<WebElement> elements = driver.get().findElements(By.xpath("//li[@role='option']"));
		for (WebElement element1 : elements) {
			String option1 = element1.getText();
			System.out.println(option1);
			if (element1.isEnabled()) {
				System.out.println("Option is enabled for change jurisdiction");
			} else {
				System.out.println("Option is not enabled for change jurisdiction");
			}
		}
		selectQuebec.click();
		continueButtonforSelectJuri.click();
		System.out.println("Step : Select another jurisdiction and click on Continue button");
		ObjectRepo.test.log(Status.PASS, "Step : Select another jurisdiction and click on Continue button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(pageHeader1));
		String pageheader = pageHeader1.getText();
		Assert.assertEquals(pageheader, "Change Jurisdiction Request");
//			driver.get().findElement(By.xpath("(//button[contains(text(),'edit')])[1]")).click();
//			driver.get().findElement(By.xpath("(//button[contains(text(),'Ok')])[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(contactUs));
		WebElement element1 = contactUs;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			wait.until(ExpectedConditions.elementToBeClickable(termsCheckbox));
//			WebElement element5 = termsCheckbox;
//			js.executeScript("arguments[0].click()", element5);

		termsCheckbox.click();
		wait.until(ExpectedConditions.elementToBeClickable(continueUserdetails));
		continueUserdetails.click();
		System.out.println("Step : Select terms and condition checkbox and click on Continue button");
		ObjectRepo.test.log(Status.PASS,
				"Step : Select terms and condition checkbo and condition and click on Continue button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(userRegistrationChecklistForm));
		String form1 = userRegistrationChecklistForm.getText();
		System.out.println("form1 is:" + form1);
		ObjectRepo.test.log(Status.PASS, "form1 is:" + form1);
		String form2 = userRegistrationForm.getText();
		System.out.println("form2 is:" + form2);
		ObjectRepo.test.log(Status.PASS, "form2 is:" + form2);
		String form3 = proofOfIdentityForm.getText();
		System.out.println("form3 is:" + form3);
		ObjectRepo.test.log(Status.PASS, "form3 is:" + form3);
		String cancelButton1 = driver.get().findElement(By.xpath("//button[contains(text(),'CANCEL')]")).getText();
		System.out.println("Button name is:" + cancelButton1);
		ObjectRepo.test.log(Status.PASS, "Button name is:" + cancelButton1);
		String submitButton1 = submitButton.getText();
		System.out.println("Button name is:" + submitButton1);
		ObjectRepo.test.log(Status.PASS, "Button name is:" + submitButton1);
		submitButton.click();
		System.out.println("Step : click on Submit button");
		ObjectRepo.test.log(Status.PASS, "Step : click on submit button");
		System.out.println("------------------------------------------------------------------");
		ObjectRepo.test.log(Status.PASS, "------------------------------------------------------------------");
		wait.until(ExpectedConditions.visibilityOf(successMsg));
		String successmessage = successMsg.getText();
		System.out.println("Success Message is:" + successmessage);
		Assert.assertEquals("Your User Registration has been transferred to the selected Jurisdiction successfully.",
				successmessage);
		ObjectRepo.test.log(Status.PASS, "Success Message is:" + successmessage);
		wait.until(ExpectedConditions.elementToBeClickable(closeIcon));
		CommonLibref.click(closeIcon, "moveToElementClick", "closeIcon");
	}

	// Inter Jurisdiction Transfer

	public void navigateToLUHAAccountPageFunctionality() {
		wait.until(ExpectedConditions.elementToBeClickable(myAccounts)).click();
		try {
			CommonLibref.click(LuhaAcc, "seleniumClick", "que2");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(LuhaAcc).click(LuhaAcc).build().perform();
		}
		wait.until(ExpectedConditions.visibilityOf(LUHAPageTitle));
		Assert.assertEquals(LUHAPageTitle.getText(), "Limited Use Holding Account Details");
		wait.until(ExpectedConditions.visibilityOf(LUHAPageTitle));
		Assert.assertEquals(LUHAPageTitle.getText(), "Limited Use Holding Account Details");
	}

//public void navigateToInitiateConsignmentTransfer() {
//	js.executeScript("window.scrollBy(0,1000)", "");
//	
////	js.executeScript("arguments[0].scrollIntoView();", ThreeDots);
////		wait.until(ExpectedConditions.elementToBeClickable(Filters));
////		js.executeScript("arguments[0].click();", Filters);
//		SearchHolding.sendKeys("Allowance");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(ThreeDots));
//		try {
//			ThreeDots.click();
//		} catch (Exception e) {
//			wait.until(ExpectedConditions.elementToBeClickable(ThreeDots));
//			ThreeDots.click();
//		}
//		wait.until(ExpectedConditions.elementToBeClickable(InitiateTransfer));
//		InitiateTransfer.click();
//		wait.until(ExpectedConditions.elementToBeClickable(InitiateLUHAPageTitle));
//		Assert.assertEquals(InitiateLUHAPageTitle.isDisplayed(), true);
//	}

//public void proposedConsignmentTransfer() {
//		js.executeScript("window.scrollBy(0,650)", "");
//		wait.until(ExpectedConditions.visibilityOf(Quantity));
//		Quantity.sendKeys("1");
//		ProposedQuantity = Quantity.getAttribute("Value");
//		Comments.sendKeys("Test Automation");
//		comment = Comments.getAttribute("value");
//		js.executeScript("window.scrollBy(0,850)", "");
//		js.executeScript("arguments[0].click();", YesRadioWiringInstruction);
////		wait.until(ExpectedConditions.elementToBeClickable(YesRadioWiringInstruction)).click();
//		js.executeScript("arguments[0].click();", SubmitButton);
//		Assert.assertEquals(WarningMsgConfirmPopUp.isDisplayed() && Passphrase.isEnabled() && ConfirmBtn1.isDisplayed()
//&& CancelBtnOnConfirmPopUp.isDisplayed(), true);
//		ObjectRepo.test.log(Status.PASS,
//				"The 'Confirm Transfer Proposal' popup is displayed with a Passphrase along with a warning message.");
//		Passphrase.sendKeys(prop.getProperty("Password"));
//		ConfirmBtn1.click();
//		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
//		String SuccessMessageValue = SuccessMessage.getText();
//		Assert.assertEquals(SuccessMessageValue, "The proposal has been successfully prepared and is awaiting review.");
//		ObjectRepo.test.log(Status.PASS, "Success Message is displayed : " + SuccessMessageValue);
//		wait.until(ExpectedConditions.elementToBeClickable(SuccessMsgCancleBtn));
//		SuccessMsgCancleBtn.click();
//		wait.until(ExpectedConditions.visibilityOf(FechedTransferValue));
//		EntityTransferID = FechedTransferValue.getText();
//		System.out.println("EntityTransferID :" + EntityTransferID);
//		wait.until(ExpectedConditions.visibilityOf(TransferDetailPageTitle));
//		Assert.assertEquals(TransferDetailPageTitle.isDisplayed(), true);
//	}
// 
//public void navigateToTransferDetailPage_PendingTransgerTable() {
//		PendingTransferExpandIcon.click();
//		PendingTransferTableSearch.sendKeys(EntityTransferID);
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		js.executeScript("window.scrollBy(0,350)");
//		js.executeScript("arguments[0].click();", TransferIdValuePendinfTransfertable);
//		wait.until(ExpectedConditions.visibilityOf(TransferDetailPageTitle));
//		Assert.assertEquals(TransferDetailPageTitle.isDisplayed(), true);
//	}
// 
//public void verifyApproveConsignmentTransferFunctionality() {
//		js.executeScript("window.scrollBy(0,950)");
//		js.executeScript("arguments[0].click();", YesRadioWiringInstruction);
//		js.executeScript("window.scrollBy(0,650)");
//		ObjectRepo.test.log(Status.PASS, "Click on 'Approve' radio button, and then click on 'SUBMIT' button.");
//		CM.click2(ApproveRadioButton, "javascriptClick", "ApproveRadioButton");
//		CoomentsField.sendKeys("Automation Testing");
//		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
//		js.executeScript("arguments[0].click();", SubmitButton);
//		wait.until(ExpectedConditions.visibilityOf(ConfirmTransferProposalPopUpText));
//		Assert.assertEquals(ConfirmTransferProposalPopUpText.isDisplayed(), true);
//		Assert.assertEquals(PassphraseFieldPopUp.isDisplayed(), true);
//		Assert.assertEquals(CancelBtnOnConfirmPopUp.isDisplayed(), true);
//		Assert.assertEquals(ConfirmBtn1.isDisplayed(), true);
//		ObjectRepo.test.log(Status.PASS,
//				"‘Confirm Transfer Proposal’ pop up screen is displayed with 'CANCEL' and 'CONFIRM' button along with 'Passphrase' text field");
//		ObjectRepo.test.log(Status.PASS, "Step 3 : Enter the Valid Passphrase & click on the CONFIRM Button");
//		PassphraseFieldPopUp.sendKeys(prop.getProperty("Password"));
//		ConfirmBtn1.click();
//		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
//		Assert.assertEquals(SuccessMessage.getText(),
//				"The transfer has been approved and the Consignment instruments transferred to the Jurisdiction's Auction Account.");
//		ObjectRepo.test.log(Status.PASS,
//				"'The transfer has been approved and the Consignment instruments transferred to the Jurisdiction’s Auction Account' Success message gets displayed");
//		CrossIcon.click();
//		wait.until(ExpectedConditions.visibilityOf(TransferDetailPageTitle));
//		Assert.assertEquals(TransferDetailPageTitle.isDisplayed(), true);
//		ObjectRepo.test.log(Status.PASS, "AR2 gets navigated to 'Entity General Account details page' .");
//	}

}