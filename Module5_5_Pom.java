package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static Utilities.listeners.prop;
import com.aventstack.extentreports.Status;

import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

import static constants.ThreadConstants.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import static Utilities.listeners.wait;

//import static Utilities.listeners.actions;
public class Module5_5_Pom {

//	JavascriptExecutor js;
	Select dropdown;
	String UserId1;
	private JavascriptExecutor js = (JavascriptExecutor) driver.get();

	public static commonLib CommonLibref = new commonLib();
	public static String homePage;

	public static Actions actions;

//	@FindBy(xpath="//p[text()='All Jurisdictions']")
//	WebElement AllJurisdiction;
//	
//	@FindBy(xpath="//input[@type='search']")
//	WebElement Search;
//	
//	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
//	WebElement ThreeDots;
//	
//	@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-11npd1'])[3]")
//	WebElement SetInitialUsers;
//	
//	@FindBy(xpath="//button[@data-testid='view-all-records-btn']")
//	WebElement AddInitialUsers;
//	
//	@FindBy(xpath="(//input[@type=\"text\"])[1]")
//	WebElement FirstName;
//	
//	@FindBy(xpath="(//input[@type=\"text\"])[2]")
//	WebElement LastName;
//	
//	@FindBy(xpath="(//input[@type=\"text\"])[3]")
//	WebElement EmailAdress;
//	
//
//	@FindBy(xpath="(//input[@type=\"text\"])[4]")
//	WebElement Role;
//	
//	@FindBy(xpath="//button[@data-testid=\"cancelBtn\"]")
//	WebElement Cancel;
//	
//	@FindBy(xpath="//h6[@class=\"MuiTypography-root MuiTypography-subtitle1 css-w9jsk0\"]")
//	WebElement CancelPopUpText;
//	
//	@FindBy(xpath="//button[@data-testid=\"priv_modal_Cancel\"]")
//	WebElement Cancel2;
//	
//	@FindBy(xpath="//h1[@class=\"MuiTypography-root MuiTypography-h1 css-1l7rfk3\"]")
//	WebElement Text;
//	
//	
//	@FindBy(xpath="//button[@data-testid=\"priv_modal_Continue\"]")
//	WebElement Continue;
//	
//	@FindBy(xpath="//h1[@class=\"MuiTypography-root MuiTypography-h1 css-1l7rfk3\"]")
//	WebElement Text2;
//	//h1[@class="MuiTypography-root MuiTypography-h1 css-1l7rfk3"]

	@FindBy(xpath = "//input[@name='email']")
	private WebElement textBoxEmail;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement textBoxPassWord;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//button[@data-testid='priv_btn_login']")
	private WebElement btnLogin2;

	@FindBy(xpath = "//h4[text()='Manage Jurisdictions']")
	private WebElement manageJurisdictions;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//..//p[text()='All Jurisdictions']")
	private WebElement expandAllJurisdictions;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement SearchBox;

	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;

	@FindBy(xpath = "//*[@data-testid=\"MoreHorizIcon\"]")
	private WebElement QuickActions;

//	@FindBy(xpath = "//*[text()='Manage Initial Users']")
//	private WebElement selectManageInitialUser;

	@FindBy(xpath = "//*[text()='SET UP INITIAL USERS']")
	private WebElement selectManageInitialUser;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[5]")
	private WebElement selectInitialUser;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[2]")
	private WebElement Manage_Jurisdiction_Details;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	private WebElement MANAGE_BUDGET;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[4]")
	private WebElement MANAGE_PURCHASE_LIMIT;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[5]")
	private WebElement Setup_Initial_Users;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[6]")
	private WebElement Manage_Jurisdiction_Status;

	@FindBy(xpath = "//*[text()='SET UP JURISDICTION ACCOUNTS']")
	private WebElement Setup_Jurisdiction_Accounts;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m'])")
	private WebElement MANAGE_TRANSFERS;

	@FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]")
	private WebElement Filter;

	@FindBy(xpath = "//input[@placeholder='Filter value']")
	private WebElement SearchName;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon css-1ylescl']")
	private WebElement QuickActionsOnSetUpInitialUser;

	@FindBy(xpath = "//*[text()='DEACTIVATE']")
	private WebElement DeactivateButton;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1pr732m'])[2]")
	private WebElement DeactivateButton1;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']")
	private WebElement EnabledElement;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	private WebElement ActivateButton;

	@FindBy(xpath = "//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe']")
	private WebElement Columns;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	private WebElement DeactivateUserPopUpTitle;

	@FindBy(xpath = "//*[text()='Deactivate User Reasons']")
	private WebElement DeactivateUserReasons;

	@FindBy(xpath = "//*[text()='CANCEL']")
	private WebElement CancelOnDeactivateUserPopUp;

	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//input[@id='deactiveProfileReason']")
	private WebElement EnterReason;

	@FindBy(xpath = "//*[text()='Manage Initial Users']")
	private WebElement PageName;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement ContinueDectivate;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement SuccessMessage;

	@FindBy(xpath = "(//div[text()='Inactive'])[2]")
	private WebElement TextUserAccountStatus;

	@FindBy(xpath = "(//div[text()='Inactive'])[1]")
	private WebElement TextUserStatus;

	@FindBy(xpath = "((//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	private WebElement FirstColumn;

	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz']")
	private WebElement SerachGrid;

	@FindBy(xpath = "//*[text()='MANAGE JURISDICTION STATUS']")
	private WebElement Manage_Jurisdiction_Accounts;

	@FindBy(xpath = "(//*[@data-testid='MoreHorizIcon'])[2]")
	private WebElement QuickActions1;

	@FindBy(xpath = "//*[text()='Manage Jurisdiction Accounts']")
	private WebElement ManageJurisdictionAccountsText;

	@FindBy(xpath = "//*[text()='SETUP JURISDICTION ACCOUNTS']")
	private WebElement Setup_Jurisdiction_Accounts_Text;

	@FindBy(xpath = "//*[@data-testid='more-actions']")
	private WebElement MoreActions;

	@FindBy(xpath = "//*[text()='ADD DEFAULT ACCOUNT']")
	private WebElement AddDefaultAccountOnMoreActions;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement SearchBoxOnGrid;

	@FindBy(xpath = "//div[@class='MuiDataGrid-cellCheckbox MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter']")
	private WebElement GreadOutCheckBoxOfIssuance;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement Cross_Sign_On_Search;

	@FindBy(xpath = "	//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']\r\n"
			+ "")
	private WebElement UserIDEnter;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement EnterPass;

	@FindBy(xpath = "//*[text()='Add New Account']")
	private WebElement AddNewAccount1;
	// *[text()='Add New Account']

	@FindBy(xpath = "(//div[@class='MuiDataGrid-cellCheckbox MuiDataGrid-cell--withRenderer MuiDataGrid-cell MuiDataGrid-cell--textCenter'])[1]")
	private WebElement CheckBox1;

	@FindBy(xpath = "//button[@data-testid='submitBtn']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//*[text()='Default Accounts']")
	private WebElement Default_Accounts_Card;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	private WebElement SelectAllCheckBox;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Submit']")
	private WebElement AddNewAccount;

	@FindBy(xpath = "//*[text()='Allowance']")
	private WebElement Allowance;

	@FindBy(xpath = "//*[text()='Offset']")
	private WebElement Offset;

	@FindBy(xpath = "//*[text()='Price Containment/Reserve Allowance']")
	private WebElement Price_Containment_Reserve_Allowance;

	@FindBy(xpath = "//*[text()='Early Reduction Credits']")
	private WebElement Early_Reduction_Credits;

	@FindBy(xpath = "//*[text()='Price Ceiling Unit']")
	private WebElement Price_Ceiling_Unit;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement CloseSign;

	@FindBy(xpath = "//*[text()='Add New Jurisdiction Accounts']")
	private WebElement AddNewJurisdictionAccountText;

	@FindBy(xpath = "//*[text()='EDIT JURISDICTION ACCOUNT']")
	private WebElement EditJurisdictionAccount;

	@FindBy(xpath = "//*[text()='Batch']")
	private WebElement Batch;

	@FindBy(xpath = "//*[text()='Replenishment']")
	private WebElement Replenishment;

	@FindBy(xpath = "//*[text()='Issuance']")
	private WebElement Issuance;

	@FindBy(xpath = "//*[text()='Batch PCRA']")
	private WebElement Batch_PCRA;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiChip-deleteIcon MuiChip-deleteIconSmall MuiChip-deleteIconColorDefault MuiChip-deleteIconFilledColorDefault css-1d9kqzu']\r\n"
			+ "	")
	private WebElement Close_Transfer;

	@FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiChip-deleteIcon MuiChip-deleteIconSmall MuiChip-deleteIconColorDefault MuiChip-deleteIconFilledColorDefault css-1d9kqzu'])[2]")
	private WebElement Close_TransferAllocation;

	@FindBy(xpath = "//input[@id='defaultAccounts.[0].typeOfTransfers-react-hook-form-select-search']")
	private WebElement Search_Transfers;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement Page_Heading;

	@FindBy(xpath = "//*[text()='Set Up Jurisdiction Accounts']")
	private WebElement Page_Heading1;
	// *[text()='Set Up Jurisdiction Accounts']

	@FindBy(xpath = "//*[text()='Allocation Account']")
	private WebElement Allocation_Account;

	@FindBy(xpath = "(//input[@id='defaultAccounts.[1].typeOfTransfers-react-hook-form-select-search'])")
	private WebElement Search_Transfers_For_Allocation;

	@FindBy(xpath = "//*[text()='Forest Buffer Account']")
	private WebElement Forest_Buffer;

	@FindBy(xpath = "(//*[text()='Batch'])[2]")
	private WebElement BatchOnForestBuffer;

	@FindBy(xpath = "(//*[text()='Account Name'])[1]")
	private WebElement AccountNameText;

	@FindBy(xpath = "//*[@data-testid=\"cancelBtn\"]")
	private WebElement CancelButton;

	@FindBy(xpath = "//*[@data-testid='priv_modal_Cancel']")
	private WebElement Cancel_On_Cancel_Button;

	@FindBy(xpath = "//button[@data-testid='priv_modal_Continue']")
	private WebElement Continue_On_Cancel_Button;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	private WebElement WarningMessageTextOnAddDefaultAccount;

	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement EnterAccountName;

	// input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']

	@FindBy(xpath = "//*[@class=\"MuiTypography-root MuiTypography-h1 css-1l7rfk3\"]")
	private WebElement SetUpJurisdictionAccounttext;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-ia2x2h']")
	private WebElement ErrorForAccountName;

	@FindBy(xpath = "//*[text()='Add New Jurisdiction Accounts']")
	private WebElement AddNewJuriAccountText;

	@FindBy(xpath = "//input[@id='accountType']")
	private WebElement AccountTypeField;

	@FindBy(xpath = "//*[text()='Account Type is required']")
	private WebElement ErrorMessageOfAccountTypeField;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[2]")
	private WebElement AccountNameOnAddNewAccount;

	@FindBy(xpath = "//*[text()='The account type already exists. Please enter a unique name.']")
	private WebElement ErrorMessageOnDuplicateAccountType;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	private WebElement CrossSignToClose;

	@FindBy(xpath = "(//*[text()='Account Name'])[2]")
	private WebElement AccountNameText1;

	@FindBy(xpath = "(//*[text()='CANCEL'])[2]")
	private WebElement CancelOnCancelButtonOnAddNewAccount;

	@FindBy(xpath = "(//*[@data-testid='ArrowDropDownIcon'])[3]")
	private WebElement ArrowDropDown;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[7]")
	private WebElement RemoveBatchOption;

	@FindBy(xpath = "//*[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']")
	private WebElement TypeOfInstrument;

	@FindBy(xpath = "//*[text()='MENU']")
	private WebElement MegaMenu;

	@FindBy(xpath = "//*[text()='Jurisdiction Accounts']")
	private WebElement JuriAccount;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	private WebElement Select1;

	@FindBy(xpath = "(//*[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[2]")
	private WebElement Select2;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']")
	private WebElement AccountStatusList;

	@FindBy(xpath = "//*[text()='RESTRICT JURISDICTION ACCOUNT']")
	private WebElement RestrictJuriAccount;

	@FindBy(xpath = "//*[text()='Restricted: Cannot Transfer']")
	private WebElement Restrict_Cant_Transfer;

	@FindBy(xpath = "//*[text()='Restricted: Cannot Receive']")
	private WebElement Restrict_Cant_Receive;

	@FindBy(xpath = "//*[text()='Restricted: Cannot Transfer and Receive']")
	private WebElement Restrict_Cant_Transfer_and_Receive;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement Radio_Button;

	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement Radio_Button1_Restricted_Cannot_Receive;

	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")
	private WebElement Radio_Button2_Restricted_Cannot_Transfer_and_Receive;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we'])[2]")
	private WebElement AccountNumberLink;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	private WebElement AccountNumberLink1;

	@FindBy(xpath = "//*[@id='comment']")
	private WebElement CommentOnAccountStatus;

	@FindBy(xpath = "//*[@id='passphrase']")
	private WebElement PassphraseOnAccountStatus;

	@FindBy(xpath = "//*[text()='Jurisdiction Accounts']")
	private WebElement Jurisdiction_Accounts_Text;

	@FindBy(xpath = "//*[text()='CONFIRM']")
	private WebElement Confirm_On_Account_Status;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[4]")
	private WebElement CloseIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement JuriAccountName;

	@FindBy(xpath = "//*[text()='CLOSE JURISDICTION ACCOUNT']")
	private WebElement CloseJuriAccount;

	@FindBy(xpath = "//*[text()='The Account cannot be Closed now as it may hold instruments or has pending transfers.']")
	private WebElement ErrorMessageOnCloseJuriAccount;

	@FindBy(xpath = "//*[text()='Passphrase is required']")
	private WebElement PassphraseRequired;

	@FindBy(xpath = "//*[text()='Passphrase is incorrect']")
	private WebElement PassphraseIncorrect;

	@FindBy(xpath = "//*[text()='ACTIVATE JURISDICTION ACCOUNT']")
	private WebElement Activate_Juri_Account;

	@FindBy(xpath = "//*[@id='comment-helper-text']")
	private WebElement CommentError;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-yj408y']")
	private WebElement Account_Information_card;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	private WebElement ConfirmStausPopUp;

	@FindBy(xpath = "//*[text()='SUSPEND JURISDICTION ACCOUNT']")
	private WebElement SuspendJuriAccount;

	@FindBy(xpath = "//*[text()='INACTIVATE JURISDICTION ACCOUNT']")
	private WebElement InactiveJuriAccount;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-h2 css-yj408y'])[4]")
	private WebElement StatusChangeTable;

	@FindBy(xpath = "//div[@title='Suspended']")
	private WebElement ChanegdStatus_Suspend;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[2]")
	private WebElement CloseIcon1;

	@FindBy(xpath = "//*[text()='INITIATE BATCH TRANSFER']")
	private WebElement InitiateBatchTransfer;

	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement SecondCheckBox;

	@FindBy(xpath = "//*[text()='Batch Transfer']")
	private WebElement BatchTransferText;

	@FindBy(xpath = "//*[text()='Batch Transfer Information']")
	private WebElement Batch_Transfer_Information_card;

	@FindBy(xpath = "//*[@id='batchName']")
	private WebElement EnterBatchName;

	@FindBy(xpath = " (//*[@class='MuiTypography-root MuiTypography-h2 css-4cc3qo'])[2]")
	private WebElement SelectHoldingsText;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[2]")
	private WebElement AddReceivingAccount;

	@FindBy(xpath = " //*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	private WebElement EnterAccountNumber;

	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	private WebElement EnterQuantity;

	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	private WebElement AddtoBatch;

	@FindBy(xpath = "//button[contains(text(),'Welcome,')]//child::*[local-name()='svg']")
	private WebElement btnWelcomeProfileDD;

	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement btnWelcomeProfile;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement btnLogOut;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-bj5op3']")
	private WebElement ErrorMessageOFAccountStatus;

	@FindBy(xpath = "//button[@data-testid='add_batch_save']")
	private WebElement SaveBatch;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	private WebElement BatchTransferTitle;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[3]")
	private WebElement CloseIconOnActivateDeactivateUser;

	@FindBy(xpath = "(//*[@class='MuiDataGrid-cellContent'])[6]")
	private WebElement UserID;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	private WebElement UserErrorMessage;

	@FindBy(xpath = " //*[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation rc customBtn-margin css-1twgk8f']")
	private WebElement AddReceivingAccountBtn;
	@FindBy(xpath = "//h2[text()='Default Accounts']")
	private WebElement DefaultAccounts;

	@FindBy(xpath = " //*[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']")
	private WebElement RowsPerPage;

	// *[text()='Add Receiving Account']

	public Module5_5_Pom() {
		PageFactory.initElements(driver.get(), this);
		actions = new Actions(driver.get());
	}

	public void jurisdiction_Accounts() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(Filter));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SearchName.sendKeys("Active");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();

	}

	public void logout() {
		CommonLibref.scroll(btnWelcomeProfileDD, "scrollToTopOFPage", "btnWelcomeProfile DD");
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfile));
		try {
			CommonLibref.click(btnWelcomeProfileDD, "seleniumClick", "welcome profile button");
		} catch (Exception e) {
			CommonLibref.click(btnWelcomeProfileDD, "moveToElementClick", "welcome profile button");
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnLogOut));
		CommonLibref.click(btnLogOut, "seleniumClick", "btnLogOut");
	}

	public void jurisdiction_Accounts_Status_Change_Suspend() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		String AccountNumber = AccountNumberLink.getText();
		System.out.println(AccountNumber);
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
//	       MoreActions.click();

		actions.moveToElement(MoreActions).click().perform();
		SuspendJuriAccount.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			CloseIcon.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			js.executeScript("arguments[0].click();", CloseIcon);
		}
//            CrossSignToClose.click();          
	}

	public void jurisdiction_Accounts_Status_Change_Inactive() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		String AccountNumber = AccountNumberLink.getText();
		System.out.println(AccountNumber);
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
//	       MoreActions.click();

		actions.moveToElement(MoreActions).click().perform();
		InactiveJuriAccount.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			CloseIcon.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			js.executeScript("arguments[0].click();", CloseIcon);
		}
	}

	public void jurisdiction_Accounts_Status_Change_Restricted_Cannot_transfer() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		String AccountNumber = AccountNumberLink.getText();
		System.out.println(AccountNumber);
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions));
////	       MoreActions.click();
//	       
//		    actions.moveToElement(MoreActions).click().perform();
		RestrictJuriAccount.click();
		Radio_Button.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		try {
			CloseIcon.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			js.executeScript("arguments[0].click();", CloseIcon);
		}
	}

	public void jurisdiction_Accounts_Status_Change_Restricted_Cannot_Transfer_and_Receive() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		String AccountNumber = AccountNumberLink.getText();
		System.out.println(AccountNumber);
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
//		    CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions));
////	       MoreActions.click();

		actions.moveToElement(MoreActions).click().perform();
		RestrictJuriAccount.click();

		actions.moveToElement(Radio_Button2_Restricted_Cannot_Transfer_and_Receive).click().perform();

		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		try {
			CloseIcon.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			js.executeScript("arguments[0].click();", CloseIcon);
		}
	}

	public void jurisdiction_Accounts_Status_Change_Restricted_Cannot_Receive() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		String AccountNumber = AccountNumberLink.getText();
		System.out.println(AccountNumber);
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
//		    CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		MoreActions.click();
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions));
////	       MoreActions.click();
//	       
//		    actions.moveToElement(MoreActions).click().perform();
		RestrictJuriAccount.click();
		Radio_Button1_Restricted_Cannot_Receive.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		CloseIcon.click();

	}

//            CrossSignToClose.click();          
	public void jurisdiction_Accounts_Status_Change_From_Suspend_To_Active() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));

		try {
			MegaMenu.click();
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Suspended");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
//	       String AccountNumber = AccountNumberLink.getText();
//	       System.out.println(AccountNumber);
		QuickActions.click();
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions)); 
//        MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon1.click();

	}

	public void jurisdiction_Accounts_Status_Change_From_Inactive_To_Active() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));

		try {
			MegaMenu.click();
		} catch (Exception e) {

		}

		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		wait.until(ExpectedConditions.elementToBeClickable(Filter));
		Filter.click();
		wait.until(ExpectedConditions.elementToBeClickable(Select1));
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		wait.until(ExpectedConditions.elementToBeClickable(SearchName));
		SearchName.sendKeys("Inactive");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
//	       String AccountNumber = AccountNumberLink.getText();
//	       System.out.println(AccountNumber);
		QuickActions.click();
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions)); 
//        MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon1.click();
	}

	public void jurisdiction_Accounts_Status_Change_From_Restricted_Cannot_Receive_To_Active() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));

		try {
			MegaMenu.click();
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		SearchName.sendKeys("Restricted- Cannot Receive");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
//	       String AccountNumber = AccountNumberLink.getText();
//	       System.out.println(AccountNumber);
		QuickActions.click();
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions)); 
//        MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon1.click();
	}

	public void jurisdiction_Accounts_Status_Change_From_Restricted_Cannot_Transfer_To_Active() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));

		try {
			MegaMenu.click();
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		SearchName.sendKeys("Restricted- Cannot Transfer");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
//	       String AccountNumber = AccountNumberLink.getText();
//	       System.out.println(AccountNumber);
		QuickActions.click();
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions)); 
//        MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon1.click();
	}

	public void jurisdiction_Accounts_Status_Change_From_Restricted_Cannot_Transfer_and_Receive_To_Active() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));

		try {
			MegaMenu.click();
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Restricted- Cannot Transfer and Receive");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
//	       String AccountNumber = AccountNumberLink.getText();
//	       System.out.println(AccountNumber);
		QuickActions.click();
//	       wait.until(ExpectedConditions.visibilityOf(MoreActions)); 
//        MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon1.click();
	}

	public void expandAllJurisdictionsOnHomePage() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(expandAllJurisdictions));
		expandAllJurisdictions.click();
		ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
		System.out.println("Click on All Jurisdictions");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void searchJurisdictionNameOnHomePage() {
		CommonLibref.click(SearchBox, "seleniumClick", "SearchBox");
		SearchBox.sendKeys("Automation@Eqa_Onboarding");
		System.out.println("Enter Jurisdiction Name =" + "Automation@Eqa_Onboarding");
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void searchJurisdictionNameOnHomePage1() {
		CommonLibref.click(SearchBox, "seleniumClick", "SearchBox");
		SearchBox.sendKeys("AutomationJuriForSetNewJuriAccount");
		System.out.println("Enter Jurisdiction Name =" + "AutomationJuriForSetNewJuriAccount");
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void clickOnQuickActions() {
		CommonLibref.pageLoader();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(QuickActions));
			CommonLibref.click(QuickActions, "seleniumClick", "QuickActions");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(QuickActions)).click();
			CommonLibref.click(QuickActions, "javascriptClick", "QuickActions");
		}
	}

	public void selectInitialUserOptionFromQuickAction() {
		try {
			Thread.sleep(1000);
			selectManageInitialUser.click();
			ObjectRepo.test.log(Status.PASS,
					"Step : Click on Quick Action Menu for other than Onboarding Jurisdiction");
			System.out.println("Click on Quick Action Menu for other than Onboarding Jurisdiction");
		} catch (Exception e) {
			selectInitialUser.click();
			ObjectRepo.test.log(Status.PASS, "Step : Click on Set up Initial Users");
			System.out.println("Click on Set up Initial Users");
		}
	}

	public void activateAccountFunctionality() {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(Filter));
		CommonLibref.click(Filter, "seleniumClick", "Filter");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("User Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SearchName.sendKeys("Inactive");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
//			  SearchName.sendKeys("Inactive");
		wait.until(ExpectedConditions.visibilityOf(QuickActionsOnSetUpInitialUser));
		QuickActionsOnSetUpInitialUser.click();
		wait.until(ExpectedConditions.visibilityOf(ActivateButton));
		ActivateButton.click();
		ContinueButton.click();
	}

	public void SetUpJurisdictionAccounts() {
		wait.until(ExpectedConditions.visibilityOf(Setup_Jurisdiction_Accounts));
		CommonLibref.click(Setup_Jurisdiction_Accounts, "seleniumClick", "Setup_Jurisdiction_Accounts");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		ObjectRepo.test.log(Status.PASS, "Step : Click on Set Up Jurisdiction Accounts");
		System.out.println("Click on Set Up Jurisdiction Accounts");
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

	public void checkForDeactivate() {
		boolean isDeactivateEnabled = wait.until(ExpectedConditions.visibilityOf(DeactivateButton)).isEnabled();
		Assert.assertEquals(isDeactivateEnabled, true, "DEACTIVATE option should be enabled");
		if (isDeactivateEnabled) {
			System.out.println("DEACTIVATE option is enabled");
		} else {
			System.out.println("DEACTIVATE option is disabled");
		}
		ObjectRepo.test.log(Status.PASS, "Expected: Deactivate submenu got displayed and is Enabled");
	}

	public void searchUser() {
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(@placeholder,'Search')])[1]")));
		CommonLibref.click(element, "javascriptClick", "searchuser");
		element.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 4));
	}

	public void checkForOtherThanDeactivate() {
		boolean isDisabled = !DeactivateButton1.isEnabled();
		if (isDisabled) {
			System.out.println("The Deactivate Button is disabled.");
			Assert.assertTrue(true);
		} else {
			System.out.println("The element is enabled.");
		}
		ObjectRepo.test.log(Status.PASS, "Expected: Deactivate option did not get displayed");
	}

	public void deactivateAccountFunctionality() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(Filter));
		CommonLibref.click(Filter, "seleniumClick", "Filter");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("User Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(QuickActionsOnSetUpInitialUser));
		CommonLibref.click(QuickActionsOnSetUpInitialUser, "seleniumClick", "QuickActionsOnSetUpInitialUser");

		DeactivateButton.click();

		String PopUpTitle = DeactivateUserPopUpTitle.getText();
		Assert.assertEquals(PopUpTitle, "DEACTIVATE USER");

		String DeactivateReasons = DeactivateUserReasons.getText();
		System.out.println(DeactivateReasons);
		Assert.assertEquals(DeactivateReasons, "Deactivate User Reasons*");

		String CANCEL = CancelOnDeactivateUserPopUp.getText();
		Assert.assertEquals(CANCEL, "CANCEL");

		String CONTINUE = ContinueButton.getText();
		Assert.assertEquals(CONTINUE, "CONTINUE");

		ObjectRepo.test.log(Status.PASS,
				"Confirmation pop-up is displayed with Cancel, CONTINUE buttons and Deactivate User Reasons field");

		EnterReason.sendKeys("Test Reason");
		CancelOnDeactivateUserPopUp.click();
		String PageTitle = PageName.getText();
		Assert.assertEquals(PageTitle, "Manage Initial Users");

		ObjectRepo.test.log(Status.PASS, "Pop-up message got closed and Manage initial user page is displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(QuickActionsOnSetUpInitialUser));
		CommonLibref.click(QuickActionsOnSetUpInitialUser, "seleniumClick", "QuickActionsOnSetUpInitialUser");
//		QuickActionsOnSetUpInitialUser.click();
		wait.until(ExpectedConditions.visibilityOf(DeactivateButton));

		DeactivateButton.click();
		EnterReason.sendKeys("Test Reason");
		ContinueDectivate.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));

		String Message = SuccessMessage.getText();
		System.out.println(Message);
		Assert.assertEquals(Message, "Deactivated user successfully.");

		wait.until(ExpectedConditions.visibilityOf(CloseIconOnActivateDeactivateUser));
		try {
			CloseIconOnActivateDeactivateUser.click();
		} catch (Exception e) {
			CommonLibref.click(CloseIconOnActivateDeactivateUser, "seleniumClick", "CloseIconOnActivateDeactivateUser");
		}

		wait.until(ExpectedConditions.visibilityOf(UserID));
		UserId1 = UserID.getText();
		System.out.println(UserId1);
		CommonLibref.scroll(JuriAccountName, "scrollToTopOFPage", "JuriAccountName");
		logout();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, UserId1, "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserId1"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS,
					"Step 8 : PassWord entered successfully :" + prop.getProperty("LoginPassWord3"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");

		} catch (Exception e) {
			CommonLibref.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			CommonLibref.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			CommonLibref.typeText(textBoxPassWord, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		String ErrorMessage = UserErrorMessage.getText();
		System.out.println(ErrorMessage);
		UserErrorMessage.isDisplayed();
		ObjectRepo.test.log(Status.PASS,
				"Sucess message is displayed ,User got Deactivated and the User Account Status changed to Inactive and User is not be able to login.");
		Cross_Sign_On_Search.click();
		UserIDEnter.clear();
		EnterPass.clear();

	}

	public void userAccountStatus() {
		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		wait.until(ExpectedConditions.elementToBeClickable(QuickActionsOnSetUpInitialUser));
		CommonLibref.click(Filter, "seleniumClick", "Filter");
		wait.until(ExpectedConditions.elementToBeClickable(Select1));
		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("User Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		wait.until(ExpectedConditions.elementToBeClickable(SearchName));
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(QuickActionsOnSetUpInitialUser));
		CommonLibref.click(QuickActionsOnSetUpInitialUser, "seleniumClick", "QuickActionsOnSetUpInitialUser");
		DeactivateButton.click();
		EnterReason.sendKeys("Test Reason");
		ContinueDectivate.click();
//				wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		wait.until(ExpectedConditions.visibilityOf(CloseIconOnActivateDeactivateUser));
		CommonLibref.click(CloseIconOnActivateDeactivateUser, "seleniumClick", "CloseIconOnActivateDeactivateUser");
		String Message1 = TextUserAccountStatus.getText();
		System.out.println(Message1);
		Assert.assertEquals(Message1, "Inactive");
		String Message2 = TextUserStatus.getText();
		System.out.println(Message2);
		Assert.assertEquals(Message2, "Inactive");
		ObjectRepo.test.log(Status.PASS, "User Status And User Account Status got displayed as Inactive");

		wait.until(ExpectedConditions.elementToBeClickable(QuickActionsOnSetUpInitialUser));
		CommonLibref.click(QuickActionsOnSetUpInitialUser, "seleniumClick", "QuickActionsOnSetUpInitialUser");
		wait.until(ExpectedConditions.visibilityOf(ActivateButton));
		ActivateButton.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(CloseIconOnActivateDeactivateUser));
		CommonLibref.click(CloseIconOnActivateDeactivateUser, "seleniumClick", "CloseIconOnActivateDeactivateUser");
	}

	public void set_Up_Jurisdiction_Account() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
		if (Manage_Jurisdiction_Details.isEnabled()) {
			Assert.assertEquals(Manage_Jurisdiction_Details.isEnabled(), true);
			System.out.println("Manage_Jurisdiction_Details option is displayed and is  enabled");
		} else {
			Assert.assertEquals(Manage_Jurisdiction_Details.isEnabled(), false);
			System.out.println("Manage_Jurisdiction_Details option is displayed and is  disabled");

		}

		if (MANAGE_BUDGET.isEnabled()) {
			Assert.assertEquals(MANAGE_BUDGET.isEnabled(), true);
			System.out.println("MANAGE_BUDGET option is displayed and is  enabled");
		} else {
			Assert.assertEquals(MANAGE_BUDGET.isEnabled(), false);
			System.out.println("MANAGE_BUDGET option is displayed and is  disabled");

		}

		if (MANAGE_BUDGET.isEnabled()) {
			Assert.assertEquals(MANAGE_PURCHASE_LIMIT.isEnabled(), true);
			System.out.println("MANAGE_PURCHASE_LIMIT option is displayed and is  enabled");
		} else {
			Assert.assertEquals(MANAGE_PURCHASE_LIMIT.isEnabled(), false);
			System.out.println("MANAGE_PURCHASE_LIMIT option is displayed and is  disabled");

		}

		if (Setup_Initial_Users.isEnabled()) {
			Assert.assertEquals(Setup_Initial_Users.isEnabled(), true);
			System.out.println("Setup_Initial_Users option is displayed and is  enabled");
		} else {
			Assert.assertEquals(Setup_Initial_Users.isEnabled(), false);
			System.out.println("Setup_Initial_Users option is displayed and is  disabled");

		}

		if (Manage_Jurisdiction_Status.isEnabled()) {
			Assert.assertEquals(Manage_Jurisdiction_Status.isEnabled(), true);
			System.out.println("Manage_Jurisdiction_Status option is displayed and is  enabled");
		} else {
			Assert.assertEquals(Manage_Jurisdiction_Status.isEnabled(), false);
			System.out.println("Manage_Jurisdiction_Status option is displayed and is  disabled");

		}

		if (Setup_Jurisdiction_Accounts.isEnabled()) {
			Assert.assertEquals(Setup_Jurisdiction_Accounts.isEnabled(), true);
			System.out.println("Setup_Jurisdiction_Accounts option is displayed and is  enabled");
		} else {
			Assert.assertEquals(Setup_Jurisdiction_Accounts.isEnabled(), false);
			System.out.println("Setup_Jurisdiction_Accounts option is displayed and is  disabled");

		}

		if (MANAGE_TRANSFERS.isDisplayed()) {
			System.out.println("MANAGE_TRANSFERS option is displayed and is disabled");
			Assert.assertTrue(true);

		} else {
			System.out.println("MANAGE_TRANSFERS option is displayed and is enabled");
			Assert.assertTrue(false);
		}
		// Note X-path(class) is unique for Disabled and Enabled Element hence it is
		// easy to validate.

		ObjectRepo.test.log(Status.PASS,
				"Sub menu got displayed with following options" + "Manage jurisdiction details" + "Manage budget"
						+ "Manage purchase limit" + "Set up Initial users" + "Manage Status"
						+ "Set up Jurisdiction accounts" + "Manage Transfers (disabled form)");

	}

	public void setUpJurisdictionAccountForOtherThanOnboardingStatus() {
		CommonLibref.click(SearchBox, "javascriptClick", "SearchBox");
		SearchBox.sendKeys("California");
		System.out.println("Enter Jurisdiction Name =" + "California");
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(QuickActions1));
		CommonLibref.click(QuickActions1, "seleniumClick", "QuickActions1");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
//	  		String Text10=Manage_Jurisdiction_Accounts.getText();
//	  		Assert.assertEquals(Text10, "MANAGE JURISDICTION ACCOUNTS");
//	  		ObjectRepo.test.log(Status.PASS, "Set Up Jurisdiction Accounts option should not get displayed in Quick Actions");

		if (!Manage_Jurisdiction_Accounts.getText().equals("SET UP JURISDICTION ACCOUNTS")) {
			System.out.println("SET UP JURISDICTION ACCOUNTS is not Available");
			String Manage_Jurisdiction_AccountsText = Manage_Jurisdiction_Accounts.getText();
			System.out.println("Option Available is :- " + Manage_Jurisdiction_AccountsText);
		} else {
			System.out.println("SET UP JURISDICTION ACCOUNTS is  Available");
		}
		ObjectRepo.test.log(Status.PASS, "Set Up Jurisdiction Accounts option did not get displayed in Quick Actions");

	}

	public void functionalityOfSetUpJurisdictionAccountForOnboardingstatus() {
		wait.until(ExpectedConditions.elementToBeClickable(Setup_Jurisdiction_Accounts)).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		String SetUpJuriAccount = Page_Heading.getText();
		System.out.println(SetUpJuriAccount);
//		Assert.assertEquals(SetUpJuriAccount, "Set Up Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Set Up Jurisdiction Account page got displayed.");

	}

	public void functionalityOfIssuanceAccountCheckBoxIsDisabled() {
		Setup_Jurisdiction_Accounts.click();
		CommonLibref.pageLoader();
		SearchBoxOnGrid.sendKeys("Issuance");
		try {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			if (GreadOutCheckBoxOfIssuance.isEnabled()) {
				System.out.println("Issuance Account checkbox is Enabled");
			} else {
				System.out.println("Issuance Account checkbox is greayed out and Disabled");
			}
			ObjectRepo.test.log(Status.PASS,
					"Result of Step 1 :- Issuance Account type is greyed out and is not get clickable on Set Up Jurisdiction Account Page.");
		} catch (Exception e) {
			Module5_5_Pom src = new Module5_5_Pom();
			src.clickOnQuickActions();
			WebElement editaccount = wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='EDIT JURISDICTION ACCOUNT']")));
			if (editaccount.isDisplayed()) {
				System.out.println("issueance account already added");
			}
		}

	}

	public void verification_Of_Continue_Button() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Cross_Sign_On_Search.click();
		SearchBoxOnGrid.sendKeys("Forest Buffer");
		CheckBox1.click();
		if (SubmitButton.isEnabled()) {
			System.out.println("CONTINUE Button is enabled.");
		} else {
			System.out.println("CONTINUE Button is Disabled");
		}

		ObjectRepo.test.log(Status.PASS, "Result of Step 2 :- CONTINUE Button is enabled.");

		CheckBox1.click();
		if (SubmitButton.isEnabled()) {
			System.out.println("CONTINUE Button is enabled");
		} else {
			System.out.println("CONTINUE Button is Disabled");
		}

		ObjectRepo.test.log(Status.PASS, "Result of Step 3 : -CONTINUE Button is Disabled");

	}

	public void verication_Of_Column_Header_CheckBox() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
		}

		List<WebElement> checBoxList = driver.get().findElements(By.xpath("//*[@type='checkbox']"));
		int size = checBoxList.size();
		System.out.println("No of checkboxes available :" + size);

		for (int i = 0; i <= size - 2; i++) {
			String checkboxStatus = checBoxList.get(i).getAttribute("aria-label");
//			System.out.println(checkboxStatus);
			if (checkboxStatus.equals("Select row")) {
				System.out.println("Checkbox is unchecked");
			} else {
				System.out.println("Checkbox is checked");
			}
		}

		CommonLibref.scroll(Default_Accounts_Card, "scrollToElement", "Default_Accounts_Card");

		ExpectedConditions.elementToBeClickable(SelectAllCheckBox);
		SelectAllCheckBox.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		List<WebElement> checBoxList2 = driver.get().findElements(By.xpath("//*[@type='checkbox']"));
		int size2 = checBoxList2.size();
		System.out.println("No of checkboxes available :" + size2);

		for (int i = 1; i <= size2 - 2; i++) {
			String checkboxStatus2 = checBoxList2.get(i).getAttribute("aria-label");
//			System.out.println(checkboxStatus2);
			if (checkboxStatus2.equals("Unselect row")) {
				System.out.println("Checkbox is checked");
			} else {
				System.out.println("Checkbox is Unchecked");
				Assert.assertTrue(false);
			}
		}

		ObjectRepo.test.info(
				"Step 1:- Checkbox got selected and all the accounts on the Set Up Jurisdiction Account page are selected.");

	}

	public void typeOfComplianceInstrument() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		ExpectedConditions.elementToBeClickable(CheckBox1);
		ExpectedConditions.elementToBeClickable(AddNewAccount);
		try {
			AddNewAccount.click();
		} catch (Exception e) {

		}

		List<WebElement> checBoxList2 = driver.get().findElements(By.xpath(
				"//*[@class='MuiButtonBase-root MuiChip-root MuiChip-filled Mui-disabled MuiChip-sizeSmall MuiChip-colorDefault MuiChip-deletable MuiChip-deletableColorDefault MuiChip-filledDefault MuiAutocomplete-tag MuiAutocomplete-tagSizeSmall css-6jsr9u']"));
		int size2 = checBoxList2.size();
		System.out.println("No of Instruments available :" + (size2 - 1));
		List<String> Instruments = new ArrayList<>();

		List<String> stringList = new ArrayList<>();
		stringList.add("Allowance");
		stringList.add("Offset");
		stringList.add("Price Containment/Reserve Allowance");
		stringList.add("Early Reduction Credits");
		stringList.add("Price Ceiling Unit");

		System.out.println(stringList);

		for (int i = 0; i <= size2 - 2; i++) {
			String element = checBoxList2.get(i).getText();
			System.out.println(element);
			Instruments.add(element);
		}
		System.out.println(Instruments);
		if (Instruments.equals(stringList)) {
			System.out.println("Instruments displayed are correct");
		} else {
			System.out.println("Instruments displayed are Incorrect");
//			Assert.assertTrue(false);
		}

		ObjectRepo.test.info(
				"Step 1:- Type Of Instruments got displayed like Allowance ,Offset, Price Containment/Reserve Allowance, Early Reduction Credits, Price Ceiling Unit");

	}

	public void type_Of_Transfer_For_Issuance_Account() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(AddNewAccount));
		System.out.println(Page_Heading.getText());
		CommonLibref.pageLoader();
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox1));
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		SubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading.getText());

		Batch.isDisplayed();
		System.out.println("Batch is Displayed");
		Issuance.isDisplayed();
		System.out.println("Issuance is Displayed");
		Batch_PCRA.isDisplayed();
		System.out.println("Batch_PCRA is Displayed");
		ObjectRepo.test.log(Status.PASS, "Result of Step 1 : - Batch , Batch PCRA and Issuance is displayed");

		Close_Transfer.click();
		ObjectRepo.test.log(Status.PASS, "Result of Step 3 : - Batch PCRA got deselected");

		Search_Transfers.click();
		Search_Transfers.sendKeys("PCRA");
		Search_Transfers.sendKeys(Keys.ENTER);
		ObjectRepo.test.log(Status.PASS, "Result of Step 4 : - Batch PCRA is get added");
	}

	public void type_Of_Transfer_For_Allocation_Account() {
		Setup_Jurisdiction_Accounts.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
//		CommonLibref.click(Page_Heading, "seleniumClick", "Page_Heading");
		System.out.println(Page_Heading.getText());
		SearchBoxOnGrid.sendKeys("Allocation");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		CheckBox1.click();
		wait.until(ExpectedConditions.visibilityOf(SubmitButton));
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading.getText());

		wait.until(ExpectedConditions.visibilityOf(Allocation_Account));
		CommonLibref.scroll(Allocation_Account, "scrollToBottomOFPage", "Allocation_Account");
		System.out.println(Allocation_Account.getText());

		Batch.isDisplayed();
		String B = Batch.getText();
		Assert.assertEquals(B, "Batch");
		System.out.println("Batch is Displayed");
		Replenishment.isDisplayed();
		String R = Replenishment.getText();
		Assert.assertEquals(R, "Replenishment");
		System.out.println("Replenishment is Displayed");
		ObjectRepo.test.log(Status.PASS, "Result of Step 1 : - Batch and Replenishment is displayed");

		Close_TransferAllocation.click();
		ObjectRepo.test.log(Status.PASS, "Result of Step 3 : - Replenishment got deselected");

		Search_Transfers_For_Allocation.click();
		Search_Transfers_For_Allocation.sendKeys("Replenishment");
		Search_Transfers_For_Allocation.sendKeys(Keys.ENTER);
		ObjectRepo.test.log(Status.PASS, "Result of Step 4 : - Replenishment got added");

	}

	public void type_Of_Transfer_For_Other_Than_Issunace_And_Allocation_Account() {
		Setup_Jurisdiction_Accounts.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading);
		SearchBoxOnGrid.sendKeys("Forest Buffer");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}

		CheckBox1.click();
		wait.until(ExpectedConditions.visibilityOf(SubmitButton));
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		SubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading);

		wait.until(ExpectedConditions.visibilityOf(Forest_Buffer));
		CommonLibref.scroll(Forest_Buffer, "scrollToBottomOFPage", "Forest_Buffer");
		System.out.println(Forest_Buffer);

		BatchOnForestBuffer.isDisplayed();
		System.out.println("Batch is Displayed");
		ObjectRepo.test.log(Status.PASS, "Result of Step 1 : - Batch is displayed");

	}

	public void functionality_of_Cancel_Button() {
		wait.until(ExpectedConditions.elementToBeClickable(Setup_Jurisdiction_Accounts)).click();
		wait.until(ExpectedConditions.elementToBeClickable(AddNewAccount));
		System.out.println(Page_Heading);
		wait.until(ExpectedConditions.visibilityOf(Default_Accounts_Card));
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			SubmitButton.click();
		} catch (NoSuchElementException e) {
			CommonLibref.click(SubmitButton, "moveToElementClick", "SubmitButton");
		} catch (Exception e) {
			CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
		}
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EnterAccountName.sendKeys("Test");
		wait.until(ExpectedConditions.elementToBeClickable(CancelButton));
		try {
			CancelButton.click();
			wait.until(ExpectedConditions.visibilityOf(WarningMessageTextOnAddDefaultAccount));
		} catch (NoSuchElementException e) {
			CommonLibref.click(CancelButton, "moveToElementClick", "CancelButton");
			wait.until(ExpectedConditions.visibilityOf(WarningMessageTextOnAddDefaultAccount));
		} catch (Exception e) {
			CommonLibref.click(CancelButton, "javascriptClick", "CancelButton");
			wait.until(ExpectedConditions.visibilityOf(WarningMessageTextOnAddDefaultAccount));
		}
		String WarnMessage = WarningMessageTextOnAddDefaultAccount.getText();
		System.out.println(WarnMessage);
		Assert.assertEquals(WarnMessage, "WARNING!");
		String CancelButtonText = Cancel_On_Cancel_Button.getText();
		System.out.println(CancelButtonText);
		Assert.assertEquals(CancelButtonText, "CANCEL");
		String ContinueButton = Continue_On_Cancel_Button.getText();
		System.out.println(ContinueButton);
		Assert.assertEquals(ContinueButton, "CONTINUE");
		ObjectRepo.test.log(Status.PASS,
				"Result of Step 1 : - Warning popup is displayed with 'Cancel' and 'Continue' button");
		Cancel_On_Cancel_Button.click();
		String AddAccountText = Page_Heading.getText();
		Assert.assertEquals(AddAccountText, "Add Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS,
				"Result of Step 2 : - Confirmation pop-up message got closed and Add Jurisdiction Accounts page is displayed");
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CancelButton.click();
		Continue_On_Cancel_Button.click();
		String Page_Heading = SetUpJurisdictionAccounttext.getText();
		Assert.assertEquals(Page_Heading, "Set Up Jurisdiction Accounts");
		ObjectRepo.test.log(Status.PASS, "Result of Step 3 : - Set Up Jurisdiction Accounts page is displayed");
	}

	public void behaviour_of_Continue_Button() {

		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(AddNewAccount));
		wait.until(ExpectedConditions.visibilityOf(DefaultAccounts));
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
//		
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		actions.moveToElement(SubmitButton).click().perform();
//		SubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading.getText());
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");

		if (SubmitButton.isEnabled()) {
			System.out.println("Save button is Enabled ");
		} else {
			System.out.println("Save button is Disabled");
		}

		ObjectRepo.test.log(Status.PASS, "Result of Step 1 : - Save button is not enabled");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(EnterAccountName));
		EnterAccountName.sendKeys("Test");

		if (SubmitButton.isEnabled()) {
			System.out.println("Save button is Enabled ");
		} else {
			System.out.println("Save button is Disabled");
		}

		ObjectRepo.test.log(Status.PASS, "Result of Step 2 : - Save button is enabled");

	}

	public void accountNameFieldValidation() {

		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		String Text1 = Page_Heading.getText();
////		CommonLibref.click(Page_Heading, "seleniumClick", "Page_Heading");
		System.out.println(Text1);

		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");

		actions.moveToElement(SubmitButton).click().perform();
//		ExpectedConditions.elementToBeClickable(SubmitButton);
//		CommonLibref.click(SubmitButton, "seleniumClick", "SubmitButton");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading);
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");

		if (SubmitButton.isEnabled()) {
			System.out.println("Save button is Enabled ");
		} else {
			System.out.println("Save button is Disabled");
		}

		ObjectRepo.test.log(Status.PASS, "Result of Step 1 : - Save button is not enabled");

		ExpectedConditions.elementToBeClickable(EnterAccountName);
		EnterAccountName.sendKeys(Keys.TAB);
		ErrorForAccountName.isDisplayed();
		ObjectRepo.test.log(Status.PASS, "Result of Step 2 : - Error message is displayed");

		EnterAccountName.sendKeys("Test");

		if (SubmitButton.isEnabled()) {
			System.out.println("Save button is Enabled ");
		} else {
			System.out.println("Save button is Disabled");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result of Step 3 : - Account Name got accepted for selected language and Save button is enabled");

	}

	public void account_Type_Field_On_Add_New_Jurisdiction_Account() {
		Setup_Jurisdiction_Accounts.click();
		wait.until(ExpectedConditions.visibilityOf(Page_Heading));
		System.out.println(Page_Heading.getText());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			AddNewAccount.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD NEW ACCOUNT\"]"))).click();
		}
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(AddNewJuriAccountText));
		System.out.println(AddNewJuriAccountText.getText());

		ExpectedConditions.elementToBeClickable(AccountTypeField);

//	    actions.moveToElement(AccountTypeField).click().perform();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		driver.get().findElement(By.id("accountType")).sendKeys(Keys.TAB);
//        AccountNameText1.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		String ErrorMessage = ErrorMessageOfAccountTypeField.getText();
		Assert.assertEquals(ErrorMessage, "Account Type is required");

		ObjectRepo.test.log(Status.PASS, "Result of Step 1 : - The error is displayed that Account Type is Required");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		AccountTypeField.sendKeys("Issuance");
		AccountNameOnAddNewAccount.sendKeys("Issuance");

		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");

		actions.moveToElement(SubmitButton).click().perform();
		ContinueButton.click();
		ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[text()='The account type already exists. Please enter a unique name.']"));
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		String ErrorMessage1 = driver.get()
				.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")).getText();
		System.out.println("Error is -->" + ErrorMessage1);
		try {
			Assert.assertEquals(ErrorMessage1, "The account type already exists. Please enter a unique name.");
		} catch (Exception e) {
		}
		ObjectRepo.test.log(Status.PASS,
				"Result of Step 2 : - The error is displayed that The account type already exists. Please enter a unique name");
		CrossSignToClose.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		ExpectedConditions.elementToBeClickable(AccountTypeField);
		AccountTypeField.clear();
		AccountTypeField.sendKeys("Automation@123");
		ExpectedConditions.elementToBeClickable(AccountNameOnAddNewAccount);
		AccountNameOnAddNewAccount.clear();
		AccountNameOnAddNewAccount.sendKeys("AutoLang");
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
		SubmitButton.isEnabled();

		ObjectRepo.test.log(Status.PASS,
				"Result of Step 3 : - The input data should got accepted Add Account button should got Enabled.");

	}

	public void cancel_button_on_Add_new_jurisdiction_account_page() {
	    Setup_Jurisdiction_Accounts.click();
	    wait.until(ExpectedConditions.visibilityOf(Page_Heading));
	    System.out.println(Page_Heading.getText());
	    try {
			AddNewAccount.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD NEW ACCOUNT\"]"))).click();
		}
	    wait.until(ExpectedConditions.visibilityOf(AddNewJuriAccountText));
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(AccountTypeField)).sendKeys("Issuance");
	        AccountNameOnAddNewAccount.sendKeys("Issuance");
	        CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
	        wait.until(ExpectedConditions.elementToBeClickable(CancelButton)).click();
	        wait.until(ExpectedConditions.visibilityOf(WarningMessageTextOnAddDefaultAccount));
	    } catch (NoSuchElementException e) {
	        CommonLibref.click(CancelButton, "moveToElementClick", "CancelButton");
	        wait.until(ExpectedConditions.visibilityOf(WarningMessageTextOnAddDefaultAccount));
	    } catch (Exception e) {
	        CommonLibref.click(CancelButton, "javascriptClick", "CancelButton");
	        wait.until(ExpectedConditions.visibilityOf(WarningMessageTextOnAddDefaultAccount));
	    }
	    String WarnMessage = WarningMessageTextOnAddDefaultAccount.getText();
	    System.out.println(WarnMessage);
	    Assert.assertEquals(WarnMessage, "WARNING!");
	    String CancelButtonText = CancelOnCancelButtonOnAddNewAccount.getText();
	    System.out.println(CancelButtonText);
	    Assert.assertEquals(CancelButtonText, "CANCEL");
	    String ContinueOnCancelButton = ContinueButton.getText();
	    System.out.println(ContinueOnCancelButton);
	    Assert.assertEquals(ContinueOnCancelButton, "CONTINUE");
	    ObjectRepo.test.log(Status.PASS,
	            "Result of Step 1 : - Warning popup is displayed with 'Cancel' and 'Continue' button");
	    CancelOnCancelButtonOnAddNewAccount.click();
	    wait.until(ExpectedConditions.visibilityOf(AddNewJuriAccountText));
	    String Add_New_Juri_Accoun_Text = AddNewJuriAccountText.getText();
	    Assert.assertEquals(Add_New_Juri_Accoun_Text, "Add New Jurisdiction Accounts");
	    ObjectRepo.test.log(Status.PASS,
	            "Result of Step 2 : - Confirmation pop-up message got closed and Add New Jurisdiction Accounts page is displayed");
	    wait.until(ExpectedConditions.elementToBeClickable(CancelButton)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();
	    String Page_Heading = SetUpJurisdictionAccounttext.getText();
//	    Assert.assertEquals(Page_Heading, "Set Up Jurisdiction Accounts");
	    ObjectRepo.test.log(Status.PASS, "Result of Step 3 : - Set Up Jurisdiction Accounts page is displayed");
	}


	public void verification_of_Type_of_transfer() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			AddNewAccount.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD NEW ACCOUNT\"]"))).click();
		}
		wait.until(ExpectedConditions.visibilityOf(Batch));
		String BatchText = Batch.getText();
		System.out.println(BatchText);
		Assert.assertEquals(BatchText, "Batch");
		ArrowDropDown.isDisplayed();
		System.out.println("Batch is displayed with Dropdown");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of transfer' field' got  displayed with dropdown and pre-selected as Batch transfer");
	}

	public void behaviour_of_Add_New_Account_Button() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			AddNewAccount.click();
			wait.until(ExpectedConditions.visibilityOf(AddNewJuriAccountText));
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD NEW ACCOUNT\"]"))).click();
			wait.until(ExpectedConditions.visibilityOf(AddNewJuriAccountText));
		}
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
		if (SubmitButton.isEnabled()) {
			System.out.println("Add Account Button is Enabled");
		} else {
			System.out.println("Add Account Button is Disabled");
		}
		ObjectRepo.test.log(Status.PASS, "Result of Step 1 :- 'Add Account' button should is not enabled.");
		AccountTypeField.sendKeys("Issuance");
		AccountNameOnAddNewAccount.sendKeys("Issuance");
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
		if (SubmitButton.isEnabled()) {
			System.out.println("Add Account Button is Enabled");
		} else {
			System.out.println("Add Account Button is Disabled");
		}
		ObjectRepo.test.log(Status.PASS, "Result of Step 1 :- 'Add Account' button is not enabled.");
	}

	public void verification_of_Type_of_Instrument_field() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		try {
			AddNewAccount.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='MORE ACTIONS']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"ADD NEW ACCOUNT\"]"))).click();
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Batch));

		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		int size2 = List.size();
		System.out.println("No of Instruments available :" + (size2 - 1));
		List<String> Instruments = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		stringList.add("Allowance");
		stringList.add("Offset");
		stringList.add("Price Containment/Reserve Allowance");
		stringList.add("Early Reduction Credits");
		stringList.add("Price Ceiling Unit");
		System.out.println(stringList);
		for (int i = 0; i <= size2 - 2; i++) {
			String element = List.get(i).getText();
			System.out.println(element);
			Instruments.add(element);
		}
		if (Instruments.equals(stringList)) {
			System.out.println("Instruments displayed are correct");

		} else {
			System.out.println("Instruments displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of instrument' field' got displayed with dropdown and pre-selected :\r\n"
						+ "Allowance, Offset, Price Containment/ Reserve Allowance, Early Reduction Credits, and Price Ceiling Unit.");
	}

	public void verification_of_Type_of_Instrument_fieldByEditingJurisdiction() {
		Setup_Jurisdiction_Accounts.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(AddNewAccount));
		js.executeScript("arguments[0].click();", AddNewAccount);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Batch));

		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiChip-label MuiChip-labelSmall css-1pjtbja']"));
		int size2 = List.size();
		System.out.println("No of Instruments available :" + (size2 - 1));
		List<String> Instruments = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		stringList.add("Allowance");
		stringList.add("Offset");
		stringList.add("Price Containment/Reserve Allowance");
		stringList.add("Early Reduction Credits");
		stringList.add("Price Ceiling Unit");
		System.out.println(stringList);
		for (int i = 0; i <= size2 - 2; i++) {
			String element = List.get(i).getText();
			System.out.println(element);
			Instruments.add(element);
		}
		if (Instruments.equals(stringList)) {
			System.out.println("Instruments displayed are correct");

		} else {
			System.out.println("Instruments displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1--> The 'Type of instrument' field' got displayed with dropdown and pre-selected :\r\n"
						+ "Allowance, Offset, Price Containment/ Reserve Allowance, Early Reduction Credits, and Price Ceiling Unit.");
	}

	public void verification_Of_Active_Account_Status() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
//		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		wait.until(ExpectedConditions.visibilityOf(AccountNumberLink));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		wait.until(ExpectedConditions.elementToBeClickable(SearchName));
		SearchName.sendKeys("Active");
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		MoreActions.click();

		List<WebElement> List = driver.get()
				.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']"));
		int Size = List.size();
		System.out.println("No of Status other than Active available :" + (Size - 1));
//	String Instruments = null;
//    List<String> AccountStatus = new ArrayList<>();

		for (int i = 1; i <= Size - 1; i++) {
			String element = List.get(i).getText();
			System.out.println(element);

			if (element.equals("ACTIVATE JURISDICTION ACCOUNT")) {
				System.out.println("ACTIVATE JURISDICTION ACCOUNT is displayed in the list of statuses ");
				Assert.assertTrue(false);
			} else {
				System.out.println("ACTIVATE JURISDICTION ACCOUNT is not displayed in the list of statuses ");

			}
			ObjectRepo.test.log(Status.PASS, "ACTIVATE JURISDICTION ACCOUNT is not displayed in the list of statuses ");

		}
	}

	public void verification_Of_Restrict_Juri_Account_PopUp() {
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
		MoreActions.click();
		RestrictJuriAccount.click();

		List<WebElement> List = driver.get().findElements(
				By.xpath("//*[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1n6q0hc']"));
		int Size = List.size();
//	    List<String> AccountStatus = new ArrayList<>();
//		   list comment 
		for (int i = 0; i <= Size - 1; i++) {
			String element = List.get(i).getText();
			System.out.println(element);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1 :- Restrict Jurisdiction Account Popup got displayed with below options\r\n"
						+ "'Restricted: Cannot tansfer'\r\n" + "'Restricted: Cannot receive'\r\n"
						+ "'Restricted: Cannot transfer and receive'");

		Radio_Button.click();
		if (Radio_Button.isSelected()) {
			System.out.println("Radio button is selected.");

		} else {
			System.out.println("Radio button is not selected.");
			Assert.assertTrue(false);
		}

		ObjectRepo.test.log(Status.PASS, "Result Step 2 :-Restricted: Cannot tansfer got clicked");

	}

	public void verification_Of_Quick_Actions_For_Registrar() {

		if (MoreActions.isDisplayed() && MoreActions.isEnabled()) {
			System.out.println("MoreActions is displayed and enabled.");
		} else {
			System.out.println("MoreActions is not displayed or not enabled.");
		}

		ObjectRepo.test.log(Status.PASS,
				"Result Step 1 :- The Quick Actions button is displayed and enabled for the Registrar.");
	}

	public void verification_Of_Restricted_can_not_Receive_status() {
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
//	   MoreActions
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		RestrictJuriAccount.click();
		Radio_Button1_Restricted_Cannot_Receive.click();
		CommentOnAccountStatus.sendKeys("Test");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		try {
			CloseIcon.click();
		} catch (Exception e) {
			CommonLibref.click(CloseIcon, "seleniumClick", "CloseIcon");
		}
		MoreActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		List<WebElement> List1 = driver.get()
				.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']"));
		int Size = List1.size();
		List<String> AccountStatus = new ArrayList<>();

		List<String> stringList = new ArrayList<>();
		stringList.add("ACTIVATE JURISDICTION ACCOUNT");
		stringList.add("RESTRICT JURISDICTION ACCOUNT");
		stringList.add("SUSPEND JURISDICTION ACCOUNT");
		stringList.add(" JURISDICTION ACCOUNT");
		stringList.add("CLOSE JURISDICTION ACCOUNT");

		for (int i = 1; i <= Size - 1; i++) {
			String element = List1.get(i).getText();
			AccountStatus.add(element);
			System.out.println(element);
		}
		System.out.println(stringList);
		System.out.println(AccountStatus);

		if (AccountStatus.equals(stringList)) {
			System.out.println("Statuses displayed are correct");
		} else {
			System.out.println("Statuses displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step ->1-Following Statuses are displayed" + "1.ACTIVATE JURISDICTION ACCOUNT"
						+ "2.RESTRICT JURISDICTION ACCOUNT" + "3.SUSPEND JURISDICTION ACCOUNT"
						+ "4. JURISDICTION ACCOUNT" + "5.CLOSE JURISDICTION ACCOUNT");

		RestrictJuriAccount.click();
		List<WebElement> List2 = driver.get().findElements(
				By.xpath("//*[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1n6q0hc']"));
		int Size1 = List2.size();
		List<String> AccountStatus1 = new ArrayList<>();
		List<String> Str = new ArrayList<>();
		Str.add("Restricted: Cannot Transfer");
		Str.add("Restricted: Cannot Transfer and Receive");

		for (int i = 0; i <= Size1 - 1; i++) {
			String element = List2.get(i).getText();
			AccountStatus1.add(element);
			System.out.println(element);
		}
		System.out.println(Str);
		System.out.println(AccountStatus1);

		if (AccountStatus1.equals(AccountStatus1)) {
			System.out.println("Statuses displayed are correct");
		} else {
			System.out.println("Statuses displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step ->2-Restrict Jurisdiction Account Popup got displayed with below options:\r\n"
						+ "'Restricted: Cannot transfer and receive' status\r\n"
						+ "'Restricted: Cannot transfer' status");
		CommonLibref.scroll(CancelButton, "scrollToBottomOFPage", "CancelButton");
		CancelButton.click();
	}

	public void verification_Of_Restricted_can_not_Transfer_status() {
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
		MoreActions.click();
		RestrictJuriAccount.click();
		Radio_Button.click();
		CommentOnAccountStatus.sendKeys("Test");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		CloseIcon.click();
		MoreActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		List<WebElement> List1 = driver.get()
				.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']"));
		int Size = List1.size();
		List<String> AccountStatus = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		stringList.add("ACTIVATE JURISDICTION ACCOUNT");
		stringList.add("RESTRICT JURISDICTION ACCOUNT");
		stringList.add("SUSPEND JURISDICTION ACCOUNT");
		stringList.add(" JURISDICTION ACCOUNT");
		stringList.add("CLOSE JURISDICTION ACCOUNT");

		for (int i = 1; i <= Size - 1; i++) {
			String element = List1.get(i).getText();
			AccountStatus.add(element);
			System.out.println(element);
		}
		System.out.println(stringList);
		System.out.println(AccountStatus);

		if (AccountStatus.equals(stringList)) {
			System.out.println("Statuses displayed are correct");
		} else {
			System.out.println("Statuses displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step ->1-Following Statuses are displayed" + "1.ACTIVATE JURISDICTION ACCOUNT"
						+ "2.RESTRICT JURISDICTION ACCOUNT" + "3.SUSPEND JURISDICTION ACCOUNT"
						+ "4. JURISDICTION ACCOUNT" + "5.CLOSE JURISDICTION ACCOUNT");

		RestrictJuriAccount.click();
		List<WebElement> List2 = driver.get().findElements(
				By.xpath("//*[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1n6q0hc']"));
		int Size1 = List2.size();
		List<String> AccountStatus1 = new ArrayList<>();
		List<String> Str = new ArrayList<>();
		Str.add("Restricted: Cannot Receive");
		Str.add("Restricted: Cannot Transfer and Receive");

		for (int i = 0; i <= Size1 - 1; i++) {
			String element = List2.get(i).getText();
			AccountStatus1.add(element);
			System.out.println(element);
		}
		System.out.println(Str);
		System.out.println(AccountStatus1);

		if (AccountStatus1.equals(AccountStatus1)) {
			System.out.println("Statuses displayed are correct");
		} else {
			System.out.println("Statuses displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step ->2-Restrict Jurisdiction Account Popup got displayed with below options:\r\n"
						+ "'Restricted: Cannot transfer and receive' status\r\n"
						+ "'Restricted: Cannot Receive' status");

		CancelButton.click();

	}

	public void verification_of_Restricted_Cannot_receive_or_transfer_Status() {
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
		MoreActions.click();
		RestrictJuriAccount.click();
		Radio_Button2_Restricted_Cannot_Transfer_and_Receive.click();
		CommentOnAccountStatus.sendKeys("Test");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		CloseIcon.click();
		MoreActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		List<WebElement> List1 = driver.get()
				.findElements(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']"));
		int Size = List1.size();
		List<String> AccountStatus = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		stringList.add("ACTIVATE JURISDICTION ACCOUNT");
		stringList.add("RESTRICT JURISDICTION ACCOUNT");
		stringList.add("SUSPEND JURISDICTION ACCOUNT");
		stringList.add(" JURISDICTION ACCOUNT");
		stringList.add("CLOSE JURISDICTION ACCOUNT");

		for (int i = 1; i <= Size - 1; i++) {
			String element = List1.get(i).getText();
			AccountStatus.add(element);
			System.out.println(element);
		}
		System.out.println(stringList);
		System.out.println(AccountStatus);

		if (AccountStatus.equals(stringList)) {
			System.out.println("Statuses displayed are correct");
		} else {
			System.out.println("Statuses displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step ->1-Following Statuses are displayed" + "1.ACTIVATE JURISDICTION ACCOUNT"
						+ "2.RESTRICT JURISDICTION ACCOUNT" + "3.SUSPEND JURISDICTION ACCOUNT"
						+ "4. JURISDICTION ACCOUNT" + "5.CLOSE JURISDICTION ACCOUNT");

		RestrictJuriAccount.click();
		List<WebElement> List2 = driver.get().findElements(
				By.xpath("//*[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1n6q0hc']"));
		int Size1 = List2.size();
		List<String> AccountStatus1 = new ArrayList<>();
		List<String> Str = new ArrayList<>();
		Str.add("Restricted: Cannot Receive");
		Str.add("Restricted: Cannot Transfer");

		for (int i = 0; i <= Size1 - 1; i++) {
			String element = List2.get(i).getText();
			AccountStatus1.add(element);
			System.out.println(element);
		}
		System.out.println(Str);
		System.out.println(AccountStatus1);

		if (AccountStatus1.equals(AccountStatus1)) {
			System.out.println("Statuses displayed are correct");
		} else {
			System.out.println("Statuses displayed are Incorrect");
			Assert.assertTrue(false);
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step ->2-Restrict Jurisdiction Account Popup got displayed with below options:\r\n"
						+ "'Restricted: Cannot Transfer' status\r\n" + "'Restricted: Cannot Receive' status");

		CancelButton.click();

	}

	public void verification_of_All_Jurisdiction_Accounts_page() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		AccountNumberLink.click();
		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		JuriAccountName.isDisplayed();
		String JuriAccountNameText = JuriAccountName.getText();
		System.out.println(JuriAccountNameText);

		ObjectRepo.test.info("Result Step 1:- Jurisdiction Accounts Details page got displayed");

	}

	public void validations_for_the_Confirm_button() {

		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		MoreActions.click();
		CloseJuriAccount.click();

		if (Confirm_On_Account_Status.isSelected()) {
			System.out.println("Confirm button is enabled");
			Assert.assertTrue(false);
		} else {
			System.out.println("Confirm button is Disabled");

		}

		ObjectRepo.test.info("Result Step 1:- 'Confirm' button is disabled.");

	}

	public void functional_verification_of_Closed_account_status() {

		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		MoreActions.click();
		CloseJuriAccount.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(UserErrorMessage));
		String ErrorMessage = UserErrorMessage.getText();
		System.out.println(ErrorMessage);
		Assert.assertEquals(ErrorMessage,
				"The Account cannot be Closed now as it may hold instruments or has pending transfers.");
		ObjectRepo.test.info(
				"Result Step 1:- The appropriate  Error message is displayed  - The account can not be closed now as it may hold instruments or has pending transfers");
	}

	public void validations_for_Passphrase_field() {
//    	   wait.until(ExpectedConditions.visibilityOf(MegaMenu));
//   		   MegaMenu.click();
//   		   wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
//   		   CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
//   		   Thread.sleep(2000);
//   		   wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
//   		   SearchBox.sendKeys("GGHJ877-92");
//   		   Thread.sleep(2000);
//   		   AccountNumberLink1.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		CloseJuriAccount.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys(Keys.TAB);
		String PassText = PassphraseRequired.getText();
		System.out.println(PassText);
		Assert.assertEquals(PassText, "Passphrase is required");
		ObjectRepo.test.info("Result Step 1:- Error message got displayed as - Passphrase is required");
		PassphraseOnAccountStatus.sendKeys("WciAdmin@123654");
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(PassphraseIncorrect));
		String PassNotCorrect = PassphraseIncorrect.getText();
		System.out.println(PassNotCorrect);
		Assert.assertEquals(PassNotCorrect, "Passphrase is incorrect");
		ObjectRepo.test.info("Result Step 2:- Error message got displayed as - Passphrase is incorrect");
		CloseIcon.click();

		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
//           PassphraseOnAccountStatus.sendKeys(Password2);
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Success = SuccessMessage.getText();
		System.out.println(Success);
		Assert.assertEquals(Success, "The Status of the Account has been successfully updated.");
		ObjectRepo.test.info("Result Step 3:- Passphrase got accepted and Success message got displayed.");

		CloseIcon.click();
		MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();

	}

	public void validations_for_Comments_field() {
		wait.until(ExpectedConditions.visibilityOf(MoreActions));

		actions.moveToElement(MoreActions).click().perform();
//           MoreActions.click();
		CloseJuriAccount.click();
		CommentOnAccountStatus.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOf(CommentError));
		String CommentText = CommentError.getText();
		System.out.println(CommentText);
		Assert.assertEquals(CommentText, "Comments is required");
		ObjectRepo.test.info("Result Step 1:- Error message got displayed as - Comments is required");

		String randomString = generateRandomString(8001);
		CommentOnAccountStatus.sendKeys(randomString);
		wait.until(ExpectedConditions.visibilityOf(CommentError));
		String Comment_Error1 = CommentError.getText();
		System.out.println(Comment_Error1);
		Assert.assertEquals(Comment_Error1, "Comment must not be more than 8000 characters long");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 2:- 'Comment must not be more than 8000 characters long' error message is displayed");
		js.executeScript("arguments[0].value = '';", CommentOnAccountStatus);
		CommentOnAccountStatus.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		CommentOnAccountStatus.sendKeys("Test Comment");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Assert.assertEquals(Confirm_On_Account_Status.isEnabled(), true);
		ObjectRepo.test.log(Status.PASS, "Result Step 3:-Entered comment is accepted.");
	}

	public void verification_of_Cancel_button_for_Jurisdiction_Account_Details_Screen() {

		wait.until(ExpectedConditions.visibilityOf(JuriAccountName));
		MoreActions.click();
		wait.until(ExpectedConditions.elementToBeClickable(CloseJuriAccount));
		CommonLibref.click(CloseJuriAccount, "seleniumClick", "CloseJuriAccount");
		wait.until(ExpectedConditions.elementToBeClickable(CommentOnAccountStatus));
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		CancelButton.click();
		Account_Information_card.isDisplayed();
		String Account_Information_card_Heading = Account_Information_card.getText();
		System.out.println(Account_Information_card_Heading);
		Assert.assertEquals(Account_Information_card_Heading, "Account Information");
		ObjectRepo.test.info(
				"Result Step 1:- The Confirmation Status Update Pop-up got closed and Registrar  remained on the same page i.e Jurisdiction Accounts Details Screen");

	}

	public void verification_of_Cancel_button_for_Jurisdiction_Account_Screen() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		QuickActions1.click();
		CloseJuriAccount.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		CancelButton.click();
		Jurisdiction_Accounts_Text.isDisplayed();
		String Jurisdiction_Text = Jurisdiction_Accounts_Text.getText();
		System.out.println(Jurisdiction_Text);
		Assert.assertEquals(Jurisdiction_Text, "Jurisdiction Accounts");
		ObjectRepo.test.info(
				"Result Step 1:- The Confirmation Status Update Pop-up got closed and Registrar remained on same page i.e Jurisdiction Accounts Screen");

	}

	public void verification_for_Confirm_Button_On_Popup() {
		wait.until(ExpectedConditions.visibilityOf(MoreActions));

		actions.moveToElement(MoreActions).click().perform();
//           MoreActions.click();
		SuspendJuriAccount.click();
		ConfirmStausPopUp.isDisplayed();
		System.out.println(ConfirmStausPopUp);
		String Cancel_Button = CancelButton.getText();
		System.out.println(Cancel_Button);
		Assert.assertEquals(Cancel_Button, "CANCEL");

		String Confirm_Account_Status = Confirm_On_Account_Status.getText();
		System.out.println(Confirm_Account_Status);
		Assert.assertEquals(Confirm_Account_Status, "CONFIRM");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1 :- Confirm Status update popup is displayed with CANCEL and CONFIRM button.");
		CommentOnAccountStatus.sendKeys("Test Comment");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Success = SuccessMessage.getText();
		System.out.println(Success);
		Assert.assertEquals(Success, "The Status of the Account has been successfully updated.");
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
		ObjectRepo.test.log(Status.PASS,
				"Result Step 2 :- Success message is displayed as - The Status of the Account has been successfully updated.");
		CloseIcon.click();
		MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon.click();

	}

	public void verify_the_accessibility_for_Status_change_table() {

		wait.until(ExpectedConditions.visibilityOf(MoreActions));
//        	   wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		MoreActions.click();
		SuspendJuriAccount.click();
		wait.until(ExpectedConditions.visibilityOf(ConfirmStausPopUp));
		CommentOnAccountStatus.sendKeys("Test Comment");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		try {
			CloseIcon.click();
			;
		} catch (Exception e) {

		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		CommonLibref.scroll(StatusChangeTable, "scrollToBottomOFPage", "StatusChangeTable");
		String ChanegdStatus1 = ChanegdStatus_Suspend.getText();
//               PasspharseEnter.sendKeys(prop.getProperty("Password"));
		System.out.println(ChanegdStatus1);
		Assert.assertEquals(ChanegdStatus1, "Suspended");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1 :- A record for the updated status should got created in the Status Change table.");
		js.executeScript("window.scrollTo(0, 0);");
		wait.until(ExpectedConditions.visibilityOf(MoreActions));
		MoreActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		try {
			CloseIcon.click();
			;
		} catch (Exception e) {

		}

	}

	public void status_Updation_of_the_Account_On_Jurisdiction_Accounts_Page() {

		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		String AccountNumber = AccountNumberLink.getText();
		System.out.println(AccountNumber);
		QuickActions1.click();
		SuspendJuriAccount.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.sendKeys("Wciadmin@123");
		Confirm_On_Account_Status.click();
		CloseIcon1.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		SearchBox.sendKeys(AccountNumber);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		String Status1 = ChanegdStatus_Suspend.getText();
		System.out.println(Status1);
		Assert.assertEquals(Status1, "Suspended");
		ObjectRepo.test.log(Status.PASS,
				"Result Step 1 :- Success Toast message is  displayed --> The Status of the Account has been successfully updated. and the Updated status is displayed in the Account Status column.");
		SearchBox.clear();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		QuickActions.click();
		Activate_Juri_Account.click();
		CommentOnAccountStatus.sendKeys("Text");
		PassphraseOnAccountStatus.click();
		PassphraseOnAccountStatus.sendKeys(prop.getProperty("Password2"));
		Confirm_On_Account_Status.click();
		CloseIcon1.click();

	}

	public void active_Status_for_transferring_and_receiving_instruments() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("Account Status");
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		SearchName.sendKeys("Active");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		String AccountNum = AccountNumberLink.getText();
		System.out.println(AccountNum);
		AccountNumberLink.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		InitiateBatchTransfer.isEnabled();
		System.out.println(
				"INITIATE BATCH TRANSFER is Enabled hence Jurisdiction user is able to Send the Compliance Instrument ");
		ObjectRepo.test.info(
				"Result of Step 1:- Jurisdiction Admin is able to initiate Batch/Replenishment Transfer from the Jurisdiction account whose status is active.");

		Actions actions1 = new Actions(driver.get());
		actions1.sendKeys(Keys.ESCAPE).build().perform();
//       		 Actions actions1 = new Actions((WebDriver) driver);
//            actions1.sendKeys(Keys.ESCAPE).build().perform();
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		AccountNumberLink1.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		wait.until(ExpectedConditions.elementToBeClickable(InitiateBatchTransfer));
		CommonLibref.click(InitiateBatchTransfer, "seleniumClick", "InitiateBatchTransfer");
//       		  InitiateBatchTransfer.click();
		Radio_Button.click();
		ContinueButton.click();
		SecondCheckBox.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(BatchTransferText));
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToElement", "Batch_Transfer_Information_card");
		EnterBatchName.sendKeys("Testbatch2024");
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToBottomOFPage", "Batch_Transfer_Information_card");
		wait.until(ExpectedConditions.elementToBeClickable(ContinueDectivate));
//       		actions1.moveToElement(ContinueDectivate).click().build().perform();
//       		  ContinueDectivate.click();
		js.executeScript("arguments[0].click();", ContinueDectivate);
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		CloseIcon.click();
		CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
		QuickActions.click();
		wait.until(ExpectedConditions.elementToBeClickable(AddReceivingAccount));
		actions1.moveToElement(AddReceivingAccount).click().build().perform();

//       		AddReceivingAccount.click();
		EnterAccountNumber.sendKeys(AccountNum);
		EnterQuantity.sendKeys("1");
		CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(AddtoBatch));
			actions1.moveToElement(AddtoBatch).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception e) {
			driver.get().navigate().refresh();
			CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
			QuickActions.click();
			wait.until(ExpectedConditions.elementToBeClickable(AddReceivingAccount));
			actions1.moveToElement(AddReceivingAccount).click().build().perform();

//         		AddReceivingAccount.click();
			EnterAccountNumber.sendKeys(AccountNum);
			EnterQuantity.sendKeys("1");
			CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");

			wait.until(ExpectedConditions.elementToBeClickable(AddtoBatch));
			actions1.moveToElement(AddtoBatch).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		}

		SuccessMessage.isDisplayed();
		ObjectRepo.test.info(
				"Result of Step 2:- Jurisdiction account whose status is active ,is able to receive the Compliance Instrument.");
		CloseIcon.click();

	}

	public void suspended_Status_for_transferring_and_receiving_instruments() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Select objSelect = new Select(Select1);
			objSelect.selectByVisibleText("Account Status");
			SearchName.sendKeys("Suspended");
		} catch (Exception e) {

		}

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		String AccountNum = AccountNumberLink1.getText();
		System.out.println(AccountNum);
		AccountNumberLink1.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		if (InitiateBatchTransfer.isSelected()) {
			Assert.assertTrue(false);
			System.out.println(
					"INITIATE BATCH TRANSFER is Enabled hence Jurisdiction user is able to Send the Compliance Instrument ");
		} else {
			System.out.println(
					"INITIATE BATCH TRANSFER is Disabled hence Jurisdiction user is not able to Send the Compliance Instrument");
		}

		ObjectRepo.test.info(
				"Result of Step 1:- Jurisdiction Admin is not able to initiate Batch/Replenishment Transfer from the Jurisdiction account whose status is Suspended.");

		Actions actions1 = new Actions(driver.get());
		actions1.sendKeys(Keys.ESCAPE).build().perform();
//       		 Actions actions1 = new Actions((WebDriver) driver);
//            actions1.sendKeys(Keys.ESCAPE).build().perform();
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		AccountNumberLink1.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		InitiateBatchTransfer.click();
		Radio_Button.click();
		ContinueButton.click();
		SecondCheckBox.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(BatchTransferText));
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToElement", "Batch_Transfer_Information_card");
		EnterBatchName.sendKeys("Testbatch2024");
		CommonLibref.scroll(SaveBatch, "scrollToBottomOFPage", "SaveBatch");
		try {
			SaveBatch.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(SaveBatch));
			js.executeScript("arguments[0].click();", SaveBatch);
		}

		wait.until(ExpectedConditions.visibilityOf(CloseIcon));
		CloseIcon.click();
		CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
		QuickActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		AddReceivingAccount.click();
		EnterAccountNumber.sendKeys(AccountNum);
		EnterQuantity.sendKeys("1");
		CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");
		AddtoBatch.click();
		ErrorMessageOFAccountStatus.isDisplayed();
		ObjectRepo.test.info(
				"Result of Step 2:- Jurisdiction account whose status is Suspended, is not be able to receive the Compliance Instrument.");
		CancelOnDeactivateUserPopUp.click();
		CommonLibref.scroll(BatchTransferTitle, "scrollToTopOFPage", "BatchTransferTitle");

	}

	public void inactive_Status_for_transferring_and_receiving_instruments() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		wait.until(ExpectedConditions.elementToBeClickable(Select1));
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		wait.until(ExpectedConditions.elementToBeClickable(SearchName));
		SearchName.sendKeys("Inactive");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		String AccountNum = AccountNumberLink1.getText();
		System.out.println(AccountNum);
		AccountNumberLink1.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		if (InitiateBatchTransfer.isSelected()) {
			Assert.assertTrue(false);
			System.out.println(
					"INITIATE BATCH TRANSFER is Enabled hence Jurisdiction user is able to Send the Compliance Instrument ");
		} else {
			System.out.println(
					"INITIATE BATCH TRANSFER is Disabled hence Jurisdiction user is not able to Send the Compliance Instrument");
		}

		ObjectRepo.test.info(
				"Result of Step 1:- Jurisdiction Admin is not able to initiate Batch/Replenishment Transfer from the Jurisdiction account whose status is Inactive");

		Actions actions1 = new Actions(driver.get());
		actions1.sendKeys(Keys.ESCAPE).build().perform();
//       		 Actions actions1 = new Actions((WebDriver) driver);
//            actions1.sendKeys(Keys.ESCAPE).build().perform();
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		AccountNumberLink1.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		InitiateBatchTransfer.click();
		Radio_Button.click();
		ContinueButton.click();
		SecondCheckBox.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(BatchTransferText));
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToElement", "Batch_Transfer_Information_card");
		EnterBatchName.sendKeys("Testbatch2024");
		CommonLibref.scroll(SaveBatch, "scrollToBottomOFPage", "SaveBatch");
		try {
			SaveBatch.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(SaveBatch));
			js.executeScript("arguments[0].click();", SaveBatch);
		}

		wait.until(ExpectedConditions.visibilityOf(CloseIcon));
		CloseIcon.click();
		CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
		QuickActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		AddReceivingAccount.click();
		EnterAccountNumber.sendKeys(AccountNum);
		EnterQuantity.sendKeys("1");
		CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");
		AddtoBatch.click();
		ErrorMessageOFAccountStatus.isDisplayed();
		ObjectRepo.test.info(
				"Result of Step 2:- Jurisdiction account whose status is Inactive, is not be able to receive the Compliance Instrument.");
		CancelOnDeactivateUserPopUp.click();
		CommonLibref.scroll(BatchTransferTitle, "scrollToTopOFPage", "BatchTransferTitle");

	}

	public void restricted_Cannot_Receive_Status_for_transferring_and_receiving_instruments() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Select objSelect1 = new Select(Select1);
		objSelect1.selectByVisibleText("Account Status");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Select objSelect2 = new Select(Select2);
		objSelect2.selectByVisibleText("equals");
		wait.until(ExpectedConditions.elementToBeClickable(SearchName));
		SearchName.sendKeys("Restricted- Cannot Receive");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		String AccountNum = AccountNumberLink1.getText();
		System.out.println(AccountNum);
		AccountNumberLink1.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
//       		   CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		MoreActions.click();
//       		
//		    actions.moveToElement(MoreActions).click().perform();

		if (InitiateBatchTransfer.isEnabled()) {

			System.out.println(
					"INITIATE BATCH TRANSFER is Enabled hence Jurisdiction user is able to Send the Compliance Instrument ");
		} else {
			System.out.println(
					"INITIATE BATCH TRANSFER is Disabled hence Jurisdiction user is not able to Send the Compliance Instrument");
			Assert.assertTrue(false);
		}

		ObjectRepo.test.info(
				"Result of Step 1:- Jurisdiction Admin is able to initiate Batch/Replenishment Transfer from the Jurisdiction account whose status is Restricted- Cannot Receive");

		Actions actions1 = new Actions(driver.get());
		actions1.sendKeys(Keys.ESCAPE).build().perform();
//       		 Actions actions1 = new Actions((WebDriver) driver);
//            actions1.sendKeys(Keys.ESCAPE).build().perform();
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		AccountNumberLink1.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		InitiateBatchTransfer.click();
		Radio_Button.click();
		ContinueButton.click();
		SecondCheckBox.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(BatchTransferText));
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToElement", "Batch_Transfer_Information_card");
		EnterBatchName.sendKeys("Testbatch2024");
		CommonLibref.scroll(SaveBatch, "scrollToBottomOFPage", "SaveBatch");
		try {
			SaveBatch.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(SaveBatch));
			js.executeScript("arguments[0].click();", SaveBatch);
		}

		wait.until(ExpectedConditions.visibilityOf(CloseIcon));
		CloseIcon.click();
		CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
		QuickActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		AddReceivingAccount.click();
		EnterAccountNumber.sendKeys(AccountNum);
		EnterQuantity.sendKeys("1");
		CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(AddtoBatch));
			actions1.moveToElement(AddtoBatch).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(ErrorMessageOFAccountStatus));
		} catch (Exception e) {
			driver.get().navigate().refresh();
			CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
			QuickActions.click();
			wait.until(ExpectedConditions.elementToBeClickable(AddReceivingAccount));
			actions1.moveToElement(AddReceivingAccount).click().build().perform();

//          		AddReceivingAccount.click();
			EnterAccountNumber.sendKeys(AccountNum);
			EnterQuantity.sendKeys("1");
			CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");

			wait.until(ExpectedConditions.elementToBeClickable(AddtoBatch));
			actions1.moveToElement(AddtoBatch).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(ErrorMessageOFAccountStatus));
		}
		ErrorMessageOFAccountStatus.isDisplayed();
		ObjectRepo.test.info(
				"Result of Step 2:- Jurisdiction account whose status is Restricted- Cannot Receive, is not be able to receive the Compliance Instrument.");
		CancelOnDeactivateUserPopUp.click();
		CommonLibref.scroll(BatchTransferTitle, "scrollToTopOFPage", "BatchTransferTitle");

	}

	public void restricted_Cannot_transfer_Status_for_transferring_and_receiving_instruments() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Select objSelect = new Select(Select1);
		objSelect.selectByVisibleText("Account Status");
		Select objSelect1 = new Select(Select2);
		objSelect1.selectByVisibleText("equals");
		SearchName.sendKeys("Restricted- Cannot Transfer");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		String AccountNum = AccountNumberLink1.getText();
		System.out.println(AccountNum);
		AccountNumberLink1.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
//      		   CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");

		actions.moveToElement(MoreActions).click().perform();
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransfer));

		if (InitiateBatchTransfer.isSelected()) {

			System.out.println(
					"INITIATE BATCH TRANSFER is Enabled hence Jurisdiction user is able to Send the Compliance Instrument ");
			Assert.assertTrue(false);
		} else {
			System.out.println(
					"INITIATE BATCH TRANSFER is Disabled hence Jurisdiction user is not able to Send the Compliance Instrument");

		}

		ObjectRepo.test.info(
				"Result of Step 1:- Jurisdiction Admin is not able to initiate Batch/Replenishment Transfer from the Jurisdiction account whose status is Restricted- Cannot Transfer");

		Actions actions1 = new Actions(driver.get());
		actions1.sendKeys(Keys.ESCAPE).build().perform();
//       		 Actions actions1 = new Actions((WebDriver) driver);
//            actions1.sendKeys(Keys.ESCAPE).build().perform();
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		AccountNumberLink1.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		InitiateBatchTransfer.click();
		Radio_Button.click();
		ContinueButton.click();
		SecondCheckBox.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(BatchTransferText));
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToElement", "Batch_Transfer_Information_card");
		EnterBatchName.sendKeys("Testbatch2024");
		CommonLibref.scroll(SaveBatch, "scrollToBottomOFPage", "SaveBatch");
		try {
			SaveBatch.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(SaveBatch));
			js.executeScript("arguments[0].click();", SaveBatch);
		}

		wait.until(ExpectedConditions.visibilityOf(CloseIcon));
		CloseIcon.click();
		CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");

		QuickActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		AddReceivingAccount.click();
		EnterAccountNumber.sendKeys(AccountNum);
		EnterQuantity.sendKeys("1");
		CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(AddtoBatch));
			actions1.moveToElement(AddtoBatch).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception e) {
			driver.get().navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(QuickActions));
			actions1.moveToElement(QuickActions).click().build().perform();
//    			 CommonLibref.click(QuickActions, "seleniumClick", "QuickActions");
			wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
			Assert.assertEquals(AddReceivingAccountBtn.isDisplayed(), true);
			ObjectRepo.test.log(Status.PASS, "The 'ADD RECEIVING ACCOUNT' option is displayed.");
			AddReceivingAccountBtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(EnterAccountNumber));
			EnterAccountNumber.sendKeys(prop.getProperty(AccountNum));
			EnterQuantity.sendKeys("1");

			wait.until(ExpectedConditions.elementToBeClickable(AddtoBatch));

			actions1.moveToElement(AddtoBatch).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		}

		SuccessMessage.isDisplayed();
		ObjectRepo.test.info(
				"Result of Step 2:- Jurisdiction account whose status is Restricted- Cannot Transfer, is able to receive the Compliance Instrument.");
//       		CancelOnDeactivateUserPopUp.click();
		CloseIcon.click();
		CommonLibref.scroll(BatchTransferTitle, "scrollToTopOFPage", "BatchTransferTitle");

	}

	public void restricted_Cannot_Transfer_and_Receive_Status_for_transferring_and_receiving_instruments() {
		wait.until(ExpectedConditions.visibilityOf(MegaMenu));
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));
		Filter.click();
		try {
			Select objSelect = new Select(Select1);
			objSelect.selectByVisibleText("Account Status");
			SearchName.sendKeys("Restricted- Cannot Transfer and Receive");
		} catch (Exception e) {

		}

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Jurisdiction_Accounts_Text.click();
		String AccountNum = AccountNumberLink1.getText();
		System.out.println(AccountNum);
		AccountNumberLink1.click();

		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
//       		
//		    actions.moveToElement(MoreActions).click().perform();
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransfer));

		if (InitiateBatchTransfer.isSelected()) {

			System.out.println(
					"INITIATE BATCH TRANSFER is Enabled hence Jurisdiction user is able to Send the Compliance Instrument ");
			Assert.assertTrue(false);
		} else {
			System.out.println(
					"INITIATE BATCH TRANSFER is Disabled hence Jurisdiction user is not able to Send the Compliance Instrument");

		}

		ObjectRepo.test.info(
				"Result of Step 1:- Jurisdiction Admin is not able to initiate Batch/Replenishment Transfer from the Jurisdiction account whose status is Restricted: Cannot Transfer and Receive");

//       		Actions actions1 = new Actions(driver.get());
		actions.sendKeys(Keys.ESCAPE).build().perform();
//       		 Actions actions1 = new Actions((WebDriver) driver);
//            actions1.sendKeys(Keys.ESCAPE).build().perform();
		MegaMenu.click();
		wait.until(ExpectedConditions.elementToBeClickable(JuriAccount));
		CommonLibref.click(JuriAccount, "seleniumClick", "JuriAccount");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.visibilityOf(Jurisdiction_Accounts_Text));

		AccountNumberLink1.click();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "seleniumClick", "MoreActions");
		InitiateBatchTransfer.click();
		Radio_Button.click();
		ContinueButton.click();
		SecondCheckBox.click();
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(BatchTransferText));
		CommonLibref.scroll(Batch_Transfer_Information_card, "scrollToElement", "Batch_Transfer_Information_card");
		EnterBatchName.sendKeys("Testbatch2024");
		CommonLibref.scroll(SaveBatch, "scrollToBottomOFPage", "SaveBatch");
		try {
			SaveBatch.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(SaveBatch));
			js.executeScript("arguments[0].click();", SaveBatch);
		}

		wait.until(ExpectedConditions.visibilityOf(CloseIcon));
		CloseIcon.click();
		CommonLibref.scroll(SelectHoldingsText, "scrollToElement", "SelectHoldingsText");
		wait.until(ExpectedConditions.elementToBeClickable(QuickActions));
		QuickActions.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		AddReceivingAccount.click();
		EnterAccountNumber.sendKeys(AccountNum);
		EnterQuantity.sendKeys("1");
		CommonLibref.scroll(AddtoBatch, "scrollToElement", "AddtoBatch");
		AddtoBatch.click();

		ErrorMessageOFAccountStatus.isDisplayed();
		ObjectRepo.test.info(
				"Result of Step 2:- Jurisdiction account whose status is Restricted: Cannot Transfer and Receive, is not able to receive the Compliance Instrument.");
		CancelOnDeactivateUserPopUp.click();
		CommonLibref.scroll(BatchTransferTitle, "scrollToTopOFPage", "BatchTransferTitle");
//       		CloseIcon.click();
	}

}
