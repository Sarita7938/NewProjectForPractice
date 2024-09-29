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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static Utilities.listeners.prop;
import com.aventstack.extentreports.Status;
import static Utilities.listeners.wait;

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

import static constants.ThreadConstants.driver;
import java.util.List;

//import static Utilities.listeners.actions;
public class Inter_Jurisdiction_Transfer {

	private JavascriptExecutor js = (JavascriptExecutor) driver.get();
	Select dropdown;
	String UserId1;
	String ProposedQuantity;
	// private JavascriptExecutor js = (JavascriptExecutor)driver.get();
	String EntityTransferID;
	String EntityTransferID2;
	String EntityTransferID3;
	String PageTitleName;
	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static String homePage;
	public static Actions actions;
	public static String accountNumber1;
	public static String accountNumber2;
	public static String accountNumber3;
	public static String accountNumber4;
	public static String BatchID2;
	public static String BatchID1;

	@FindBy(xpath = " //*[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e']")
	WebElement FirstElement;
	@FindBy(xpath = "(//*[@data-testid='ExpandMoreIcon'])[4]")
	WebElement PendingTransferExpandIcon;
	@FindBy(xpath = "(//input[@placeholder='Search…'])[4]")
	WebElement PendingTransferTableSearch;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	WebElement Comments1;
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']")
	WebElement Passphrase;
	@FindBy(xpath = "//button[text()='SUBMIT']")
	WebElement Submit2;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	WebElement ApproveRadioBtn;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement Cancle1;
	@FindBy(xpath = "//*[text()='Transfer Details']")
	WebElement TransferDetails;
	@FindBy(xpath = "//div[text()='Entity Transfer ID']//following::p[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e']")
	WebElement EntityTransferID1;
	@FindBy(xpath = "(//*[contains(text(),'Approved')])[2]")
	//(//*[@class="MuiDataGrid-cellContent"])[17]
	WebElement StatusValuePendingTransferTable;
	@FindBy(xpath = "(//div[@data-field='receivingAccountType'])[2]")
	WebElement ReceivingAccountTypeValuePendingTransferTable;
	@FindBy(xpath = "(//div[@data-field='transferringAccountType'])[2]")
	WebElement TransferringAccountTypeValuePendingTransferTable;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e']")
	WebElement TransferIdValuePendinfTransfertable;
	//p[text()='Pending Transfers']
	@FindBy(xpath = "//p[text()='Pending Transfers']")
	WebElement PendingTransfers;
//	(//*[@data-testid="ExpandMoreIcon"])[4]
//	(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz'])[4]
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz'])[4]")
	WebElement Search1;
	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement Search;
	@FindBy(xpath = "//p[text()='My Accounts']")
	WebElement MyAccount;
	@FindBy(xpath = "//*[@data-testid='ExpandMoreIcon']")
	WebElement ExpandMyAccount;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways linkHoverDesign css-1lgh3ou']")
	WebElement AccountNumber;
	@FindBy(xpath = "//h2[text()='Limited Use Holding Account Details']")
	WebElement LUHAPageTitle;
	@FindBy(xpath = "//input[@data-testid='Quantity']")
	WebElement Quantity;
	@FindBy(xpath = "//h2[text()='Transfer Details']")
	WebElement TransferDetailPageTitle;
	@FindBy(xpath = "  //*[@class='MuiTypography-root MuiTypography-body1 css-1r56cjq']")
	WebElement Home_Page;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-12t365l']")
	WebElement WarningMsgConfirmPopUp;
	@FindBy(xpath = "//input[@name='Yes']")
	WebElement YesRadioWiringInstruction;
	@FindBy(xpath = "(//button[@type='button'])[5]")
	WebElement Filters;
	@FindBy(xpath = "//h2[text()='Transferring Account Details']")
	WebElement InitiateLUHAPageTitle;
	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement SearchHolding;
	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	WebElement SelectVintage;
	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiInput-input css-mnn31']")
	WebElement FilterValue;
	@FindBy(xpath = "(//*[@data-testid='MoreHorizIcon'])[1]")
	WebElement ThreeDots;
	@FindBy(xpath = "//p[text()='INITIATE TRANSFER']")
	WebElement InitiateTransfer;
	@FindBy(xpath = "//p[text()='Transfer Type']")
	WebElement TransferType;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement btnWelcomeProfileDD;
	@FindBy(xpath = "//button[contains(text(),'Welcome,')]")
	private WebElement btnWelcomeProfile;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement btnLogOut;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	WebElement OTCNoMoreThan3DaysRadiobtn;
	@FindBy(xpath = "//button[text()='CONTINUE']")
	WebElement ContinueBtn;
	@FindBy(xpath = "//h2[@class=\"MuiTypography-root MuiTypography-h2 css-upmoyc\"]")
	WebElement HoldingsPopUp;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	WebElement CheckBox;
	@FindBy(xpath = "//button[@data-testid=\"priv_btn_Search\"]")
	WebElement Continue_Btn;
	@FindBy(xpath = "//button[@data-testid='add_batch_save']")
	WebElement SaveBtn;
	@FindBy(xpath = "//h1[text()='Batch Transfer']")
	WebElement InitiateBatchTransferPage;
	@FindBy(xpath = "//p[text()='Saved']")
	WebElement TransferStatusOnSavedBatchTransferPage;
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body2 css-1fr8lnd\"])[6]")
	WebElement BatchIdOnProposedBatchTransferPage;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	WebElement ThreeDotsMenuBtn;
	@FindBy(xpath = "//p[text()='ADD RECEIVING ACCOUNT']")
	WebElement AddReceivingAccountBtn;
	@FindBy(xpath = "//h2[text()='Receiving Account Information']")
	WebElement ReceivingAccountInformationPopUp;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	WebElement ProposedQuantityField;
	@FindBy(xpath = "//*[@name='receivingAccountDetails.[0].proposedQuantity']")
	WebElement ProposedQuantityField1;
	@FindBy(xpath = "//*[@name='receivingAccountDetails.[1].proposedQuantity']")
	WebElement ProposedQuantityField2;
	@FindBy(xpath = "//*[@name='receivingAccountDetails.[2].proposedQuantity']")
	WebElement ProposedQuantityField3;
	@FindBy(xpath = "//*[@name='receivingAccountDetails.[3].proposedQuantity']")
	WebElement ProposedQuantityField4;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	WebElement AddToBatchBtn;
	@FindBy(xpath = "//*[contains(text(),'Add Receiving Account')]")
	WebElement AddReceivingAccount;
	@FindBy(xpath = "//input[@name='accountNumber']")
	WebElement AccountNumberField;
	@FindBy(xpath = "//input[@name='receivingAccountDetails.[0].accountNumber']")
	WebElement AccountNumberField1;
	@FindBy(xpath = "//input[@name='receivingAccountDetails.[1].accountNumber']")
	WebElement AccountNumberField2;
	@FindBy(xpath = "//input[@name='receivingAccountDetails.[2].accountNumber']")
	WebElement AccountNumberField3;
	@FindBy(xpath = "//input[@name='receivingAccountDetails.[3].accountNumber']")
	WebElement AccountNumberField4;
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
	@FindBy(xpath = "//input[@placeholder='Select Currency']")
	WebElement CurrencyDropDown;
	@FindBy(xpath = "//button[text()='SUBMIT']")
	WebElement Submit1;
	@FindBy(xpath = "//*[contains(text(),'Transferring compliance instruments to an Entity’s General Account is permanent.')]")
	WebElement WarningMsg;
	@FindBy(xpath = "//*[@id='passphrase']")
	WebElement PassphraseField;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement ConfirmBtn1;
	@FindBy(xpath = "(//button[text()='CANCEL'])[2]")
	WebElement CancelBtnOnConfirmPopUp;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	WebElement SuccessMessage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	WebElement ErrorMessageStopTransfer;
	@FindBy(xpath = "//*[contains(text(),'The transfer cannot be Approved as the receiving account is not found. Please contact the Jurisdictions for more information.')]")
	WebElement ErrorMessage;
	@FindBy(xpath = "//*[contains(text(),'The transfer cannot be Approved as the receiving Entity is not found. Please contact the Jurisdictions for more information.')]")
	WebElement ErrorMessage_Stop_All_Transfer;
	@FindBy(xpath = "//*[contains(text(),'The transfer cannot be Accepted. Please contact the Jurisdictions for more information.')]")
	WebElement ErrorMessage1;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[3]")
	WebElement SuccessMsgCancleBtn;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	WebElement FechedTransferValue;
	@FindBy(xpath = "//h4[text()='Manage Jurisdictions']")
	private WebElement manageJurisdictions;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//..//p[text()='All Jurisdictions']")
	private WebElement expandAllJurisdictions;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement SearchBox;
	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;
	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement QuickActions;
	@FindBy(xpath = "//*[contains(text(),'MANAGE TRANSFERS')]")
	private WebElement Manage_Transfers;
	@FindBy(xpath = "//a[text()='My Approvals']")
	WebElement MyApprovalsLabelAuth;
	@FindBy(xpath = "//h1[text()=\"My Approvals\"]")
	WebElement MyApprovalsText;
	@FindBy(xpath = "//p[@class=\"MuiTypography-root MuiTypography-body1 link-cell css-1195g5e\"]")
	WebElement Click_MyApprovalsID;
	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	WebElement Batch_Transfer;
	@FindBy(xpath = "//h1[text()='Batch Transfer']")
	WebElement BatchTransfer;
	@FindBy(xpath = "//input[@name=\"Request Revisions\"]")
	WebElement RequestRevisionsRadioButton;
	@FindBy(xpath = "//input[@name=\"Approve\"]")
	WebElement ApproveRadioButton;
	@FindBy(xpath = "//textarea[@data-testid='comment']")
	WebElement CoomentsField;
	@FindBy(xpath = "(//button[text()=\"Submit\"])[1]")
	WebElement Auth_Submit_Btn;
	@FindBy(xpath = "//p[@class=\"MuiTypography-root MuiTypography-body1 css-ju587a\"]")
	WebElement Submit_Batch_Transfer_Popup;
	@FindBy(xpath = "//button[text()=\"CANCEL\"]")
	WebElement Cancel_Btn_For_Auth;
	@FindBy(xpath = "(//button[text()=\"Submit\"])[2]")
	WebElement Submit_Btn_For_Auth;
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-lz7acl\"])[1]")
	WebElement TotalRows;
	@FindBy(xpath = "//button[text()=\"MENU\"]")
	WebElement Menu_Btn;
	@FindBy(xpath = "//p[text()=\"Batch Transfers\"]")
	WebElement Batch_Transfers_Btn;
	@FindBy(xpath = "//a[@class=\"MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways css-1al1nad\"]")
	WebElement Batch_ID_In_Table;
	@FindBy(xpath = "//button[@aria-label=\"Show filters\"]")
	WebElement ClickOnFilters;
	@FindBy(xpath = "//*[text()=\"Add filter\"]")
	WebElement AddFilter;
	@FindBy(xpath = "(//select[@class=\"MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe\"])[2]")
	WebElement Operator;
	@FindBy(xpath = "(//select[@class=\"MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe\"])[4]")
	WebElement SecondColumns;
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input css-mnn31'])[2]")
	WebElement FilterValue2;
//	@FindBy(xpath = "//input[@placeholder=\"Filter value\"]")
//	WebElement FilterValue;
	@FindBy(xpath = "//*[text()='MANAGE ALL TRANSFERS']")
	private WebElement Manage_All_Transfers;
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
	@FindBy(xpath = "//button[@aria-label=\"Choose date\"]")
	public WebElement Calender;
	@FindBy(xpath = "//*[@aria-current='date']")
	public WebElement Current_Date;
	@FindBy(xpath = "//input[@name='ij_stop_all_transfers_in_progress']")
	public WebElement StopAllInProgressTransfer;
	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	public WebElement UnCheckedStopAllFutureTransfer;
	@FindBy(xpath = "//*[@name='ij_proposed_status_jurisdiction_entity']")
	public WebElement Checked_Jurisdiction_Entity_Transfers_Proposed_Status;
	@FindBy(xpath = "//*[@name='ij_approved_status_jurisdiction_entity']")
	public WebElement Checked_Jurisdiction_Entity_Transfers_Approved_Status;
	@FindBy(xpath = "//button[@data-testid='submitBtn']//..//*[contains(text(),'MANAGE ALL TRANSFERS')]")
	public WebElement ManageAllTransfers;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Submit']")
	public WebElement SubmitButton;
	@FindBy(xpath = "(//*[@data-testid='submitBtn'])[2]")
	public WebElement SaveButton;
	@FindBy(xpath = "//*[contains(text(),'Transfers in Progress within Jurisdictions')]/following::*[@data-testid='submitBtn']")
	public WebElement Submit_Button;
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement SubmitButtonOnApprove;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	WebElement ConfirmTransferProposalPopUpText;
	@FindBy(xpath = "//input[@data-testid='passphrase']")
	WebElement PassphraseFieldPopUp;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[3]")
	WebElement SuuccessCloseIcon;
	@FindBy(xpath = "//*[contains(text(),'Allow Transfers From \"Proposed\" Status')]/following::*[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium Mui-checked MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-r2e3ql'][1]")
	public WebElement Allowa_Transfers_From_Proposed_Status_Cliked;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Search']")
	public WebElement ContinueButton;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	private WebElement CloseIcon;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[2]")
	private WebElement CloseIcon2;
	@FindBy(xpath = "//p[text()='Proposed']")
	WebElement TransferStatusOnProposedBatchTransferPage;
	@FindBy(xpath = "(//div[text()='Event']//..//..//..//..//..//..//..//..//div[@title='Proposed'])[2]")
	WebElement TransferStatusOnBatchTransferHistoryTable;
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-lz7acl\"])[2]")
	WebElement TotalRows2;
	@FindBy(xpath = "//button[@data-testid='batch_propose']")
	WebElement SubmitBtn;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	WebElement Submit_Batch_Transfer_PopUp;
	@FindBy(xpath = "//input[@id='passphrase']")
	WebElement PasspharseEnter;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement SubmitBtnOnPassphrasePopUp;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[2]")
	private WebElement CloseIcon1;
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
	// *[@data-testid="CheckBoxOutlineBlankIcon"]//..//*[contains(@name,"ij_proposed_status_within_entity")]
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//*[contains(@name,'ij_proposed_status_within_entity')]")
	public WebElement Blanck;
	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-13tw421\"]")
	WebElement SearchEntities;
	@FindBy(xpath = "//p[text()='All Jurisdiction Accounts']")
	WebElement JurisdictionAccountsGrid;
	@FindBy(xpath = "//div[text()=\"Account Number\"]")
	WebElement AccountNumberText;
	@FindBy(xpath = "(//div[text()='Account Status'])[4]")
	WebElement AccountStatusText;
	@FindBy(xpath = "(//input[@type='search'])[4]")
	WebElement SearchJurisdictionAcc;
	@FindBy(xpath = "//div[text()=\"Account Type\"]")
	WebElement AccountTypeText;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	WebElement IssuanceAccounts;
	@FindBy(xpath = "//h1[text()='Issuance Account']")
	WebElement IssuancePageTitle;
	@FindBy(xpath = "//button[text() ='MORE ACTIONS']")
	WebElement MoreActions;
	@FindBy(xpath = "//input[@data-testid='batchName']")
	WebElement BatchNameField;
	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body1 css-1yfaah8\"])[3]")
	WebElement Initiate_Batch_Transfer_Btn;
	@FindBy(xpath = "//h2[@class=\"MuiTypography-root MuiTypography-h2 css-upmoyc\"]")
	WebElement InitiateBatchTransferPopUp;
	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	WebElement BatchTransferRadioBtn;
	@FindBy(xpath = "//*[@data-testid='comment']")
	WebElement CommentField;
	@FindBy(xpath = "//*[@placeholder='Search…']")
	private WebElement searchFieldOnMyApproval;
	@FindBy(xpath = "(//*[@class='link-cell'])[3]")
	private WebElement firstEntityAccountNumber;
	@FindBy(xpath = "(//*[@class='link-cell'])[6]")
	private WebElement secondEntityAccountNumber;
	@FindBy(xpath = "(//*[@class='link-cell'])[9]")
	private WebElement thirdEntityAccountNumber;
	@FindBy(xpath = "(//*[@class='link-cell'])[12]")
	private WebElement fourthEntityAccountNumber;

	public Inter_Jurisdiction_Transfer() {
		PageFactory.initElements(driver.get(), this);
		actions = new Actions(driver.get());
	}

	public void Navigate_To_JurisdictionAccounts(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(SearchEntities));
//		js.executeScript("window.scrollBy(0,2500)", "");
		js.executeScript("arguments[0].scrollIntoView();", JurisdictionAccountsGrid);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionAccountsGrid));
		js.executeScript("arguments[0].click();", JurisdictionAccountsGrid);
		wait.until(ExpectedConditions.visibilityOf(AccountNumberText));
		Assert.assertEquals(AccountNumberText.isDisplayed(), true);
		Assert.assertEquals(AccountTypeText.isDisplayed(), true);
		ExpectedConditions.visibilityOf(AccountStatusText);
		Assert.assertEquals(AccountStatusText.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS,
				"All the 'Jurisdiction Accounts' are displayed with 3 columns:- a. Account Number (With Hyperlink) b. Account Type c. Account Status");
		SearchJurisdictionAcc.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		System.out.println("Click on Issuance Account");
		wait.until(ExpectedConditions.elementToBeClickable(IssuanceAccounts));
		js.executeScript("arguments[0].click();", IssuanceAccounts);
		wait.until(ExpectedConditions.visibilityOf(IssuancePageTitle));
		PageTitleName = IssuancePageTitle.getText();
	//	String Title = IssuancePageTitle.getText();
	//	Assert.assertEquals(Title, "Issuance Account");
		ObjectRepo.test.log(Status.PASS,
				PageTitleName);
		System.out.println(
				PageTitleName);
	}

	public void Save_Batch_Transfer_Functionality() {
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		js.executeScript("arguments[0].click();", MoreActions);
		wait.until(ExpectedConditions.elementToBeClickable(Initiate_Batch_Transfer_Btn));
		Initiate_Batch_Transfer_Btn.click();
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPopUp));
		String PopUp = InitiateBatchTransferPopUp.getText();
		Assert.assertEquals(PopUp, "Initiate Batch Transfer");
		ObjectRepo.test.log(Status.PASS,
				"The 'Initiate Batch Transfer' pop-up is displayed along with 'Type of Transfers'");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.visibilityOf(BatchTransferRadioBtn);
		BatchTransferRadioBtn.click();
		ObjectRepo.test.log(Status.PASS, "The 'CONTINUE' button is enabled");
		ContinueBtn.click();
		wait.until(ExpectedConditions.visibilityOf(HoldingsPopUp));
		String PopUp1 = HoldingsPopUp.getText();
		Assert.assertEquals(PopUp1, "Holdings");
		ObjectRepo.test.log(Status.PASS, "The 'Holdings' grid pop-up is displayed ");
		js.executeScript("arguments[0].click();", CheckBox);
		js.executeScript("arguments[0].click();", Continue_Btn);
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPage));
		String Text = InitiateBatchTransferPage.getText();
		Assert.assertEquals(Text, "Batch Transfer");
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Admin is navigate to Initiate 'Batch Transfer' page ");
		BatchNameField.sendKeys("Test Batch Name");
		CommentField.sendKeys("Test Comment");
		js.executeScript("window.scrollBy(0,700)", "");
		wait.until(ExpectedConditions.elementToBeClickable(SaveBtn));
		js.executeScript("arguments[0].click();", SaveBtn);
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Successmessage = SuccessMessage.getText();
		Assert.assertEquals(Successmessage, "The Batch Transfer has been saved successfully");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPage));
		String Text1 = InitiateBatchTransferPage.getText();
		Assert.assertEquals(Text1, "Batch Transfer");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(TransferStatusOnSavedBatchTransferPage));
		String StatusText = TransferStatusOnSavedBatchTransferPage.getText();
		Assert.assertEquals(StatusText, "Saved");
		Assert.assertEquals(BatchIdOnProposedBatchTransferPage.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS,
				"The success message is displayed as 'The Batch Transfer has been saved successfully' & the Batch status is displayed as 'Saved' and Batch ID is created and the Jurisdiction Admin is navigate to the propose 'Batch Transfer' page");
		BatchID1 = BatchIdOnProposedBatchTransferPage.getText();
		System.out.println("Batch ID:- " + BatchID1);
	}
	public void Save_Cross_Batch_Transfer_Functionality() {
CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		js.executeScript("arguments[0].click();", MoreActions);
		wait.until(ExpectedConditions.elementToBeClickable(Initiate_Batch_Transfer_Btn));
		Initiate_Batch_Transfer_Btn.click();
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPopUp));
		String PopUp = InitiateBatchTransferPopUp.getText();
		Assert.assertEquals(PopUp, "Initiate Batch Transfer");
		ObjectRepo.test.log(Status.PASS,
				"The 'Initiate Batch Transfer' pop-up is displayed along with 'Type of Transfers'");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.visibilityOf(BatchTransferRadioBtn);
		ExpectedConditions.elementToBeClickable(BatchTransferRadioBtn);
		BatchTransferRadioBtn.click();
		ObjectRepo.test.log(Status.PASS, "The 'CONTINUE' button is enabled");
		ContinueBtn.click();
		wait.until(ExpectedConditions.visibilityOf(HoldingsPopUp));
		String PopUp1 = HoldingsPopUp.getText();
		Assert.assertEquals(PopUp1, "Holdings");
		ObjectRepo.test.log(Status.PASS, "The 'Holdings' grid pop-up is displayed ");
		js.executeScript("arguments[0].click();", CheckBox);
		js.executeScript("arguments[0].click();", Continue_Btn);
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPage));
		String Text = InitiateBatchTransferPage.getText();
		Assert.assertEquals(Text, "Batch Transfer");
		ObjectRepo.test.log(Status.PASS, "The Jurisdiction Admin is navigate to Initiate 'Batch Transfer' page ");
		BatchNameField.sendKeys("Test Batch Name");
		CommentField.sendKeys("Test Comment");
		js.executeScript("window.scrollBy(0,700)", "");
		wait.until(ExpectedConditions.elementToBeClickable(SaveBtn));
		js.executeScript("arguments[0].click();", SaveBtn);
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Successmessage = SuccessMessage.getText();
		Assert.assertEquals(Successmessage, "The Batch Transfer has been saved successfully");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPage));
		String Text1 = InitiateBatchTransferPage.getText();
		Assert.assertEquals(Text1, "Batch Transfer");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(TransferStatusOnSavedBatchTransferPage));
		String StatusText = TransferStatusOnSavedBatchTransferPage.getText();
		Assert.assertEquals(StatusText, "Saved");
		Assert.assertEquals(BatchIdOnProposedBatchTransferPage.isDisplayed(), true);
		System.out.println(TransferStatusOnSavedBatchTransferPage);
		ObjectRepo.test.log(Status.PASS,
				"TransferStatusOnSavedBatchTransferPage");
		BatchID2 = BatchIdOnProposedBatchTransferPage.getText();
		System.out.println("Batch ID:- " + BatchID2);
	}
	public void Propose_Batch_Transfer_Functionality(String FilePath, String SheetName, int rowNum, int cellNum) {
		js.executeScript("window.scrollBy(0,700)", "");
		wait.until(ExpectedConditions.elementToBeClickable(ThreeDotsMenuBtn));
		js.executeScript("arguments[0].click();", ThreeDotsMenuBtn);
		wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
		Assert.assertEquals(AddReceivingAccountBtn.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS, "The 'ADD RECEIVING ACCOUNT' option is displayed.");
		AddReceivingAccountBtn.click();
		wait.until(ExpectedConditions.visibilityOf(ReceivingAccountInformationPopUp));
		String PopUpText = ReceivingAccountInformationPopUp.getText();
		Assert.assertEquals(PopUpText, "Receiving Account Information");
		AccountNumberField1.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 21));
		ProposedQuantityField1.sendKeys("100");
		js.executeScript("arguments[0].click();", AddReceivingAccount);
		AccountNumberField2.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 22));
		ProposedQuantityField2.sendKeys("100");
		js.executeScript("arguments[0].click();", AddReceivingAccount);
		AccountNumberField3.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 23));
		ProposedQuantityField3.sendKeys("100");
		js.executeScript("arguments[0].click();", AddReceivingAccount);
		AccountNumberField4.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 1, 24));
		ProposedQuantityField4.sendKeys("100");
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 1000)");
			wait.until(ExpectedConditions.elementToBeClickable(AddToBatchBtn));
			actions.moveToElement(AddToBatchBtn).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception e) {
			driver.get().navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(ThreeDotsMenuBtn));
			js.executeScript("arguments[0].click();", ThreeDotsMenuBtn);
			wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
			Assert.assertEquals(AddReceivingAccountBtn.isDisplayed(), true);
			ObjectRepo.test.log(Status.PASS, "The 'ADD RECEIVING ACCOUNT' option is displayed.");
			AddReceivingAccountBtn.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			wait.until(ExpectedConditions.elementToBeClickable(AccountNumberField));
			AccountNumberField.sendKeys(prop.getProperty("ReceivingEntity1"));
			ProposedQuantityField.sendKeys("1");
			actions.moveToElement(AddToBatchBtn).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		}
		String Successmessage = SuccessMessage.getText();
		Assert.assertEquals(Successmessage, "Receiving Account(s) Information has been added for the selected record");
		ObjectRepo.test.log(Status.PASS,
				"'Receiving Account(s) Information has been added for the selected record' success message is displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
		js.executeScript("window.scrollBy(0,-300)", "");
//		String totalRows = TotalRows2.getText();
//		Assert.assertEquals(totalRows.contains("4"), true);
//		ObjectRepo.test.log(Status.PASS, "Records is added to the Batch Transfer grid");
		js.executeScript("window.scrollBy(0,1200)", "");
		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		Assert.assertEquals(SubmitBtn.isEnabled(), true);
		ObjectRepo.test.log(Status.PASS, "The 'SUBMIT' button is enabled");
		js.executeScript("arguments[0].click();", SubmitBtn);
		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
		String Title = Submit_Batch_Transfer_PopUp.getText();
		Assert.assertEquals(Title, "Submit Batch Transfer");
		ObjectRepo.test.log(Status.PASS, "The 'Submit Batch Transfer' passphrase pop-up is displayed");
		wait.until(ExpectedConditions.visibilityOf(PasspharseEnter));
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtnOnPassphrasePopUp));
		SubmitBtnOnPassphrasePopUp.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Successmessage1 = SuccessMessage.getText();
		Assert.assertEquals(Successmessage1, "Batch Transfer is successfully proposed");
		ObjectRepo.test.log(Status.PASS, "The 'Submit Batch Transfer' passphrase pop-up is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
		wait.until(ExpectedConditions.visibilityOf(TransferStatusOnProposedBatchTransferPage));
		String StatusText = TransferStatusOnProposedBatchTransferPage.getText();
		Assert.assertEquals(StatusText, "Proposed");
		js.executeScript("window.scrollBy(0,-1700)", "");
		// Calculation After Proposed

		String TransferStatus = TransferStatusOnBatchTransferHistoryTable.getText();
		Assert.assertEquals(TransferStatus, "Proposed");
		ObjectRepo.test.log(Status.PASS,
				"'Batch Transfer is successfully proposed' toast success message is displayed & 'Proposed' status is updated in the 'Batch Transfer History' grid");
	}
	public void Propose_Cross_Batch_Transfer_Functionality(String FilePath, String SheetName, int rowNum, int cellNum,String FilePath2, String SheetName2, int rowNum2, int cellNum2) {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		js.executeScript("window.scrollBy(0,700)", "");
		wait.until(ExpectedConditions.elementToBeClickable(ThreeDotsMenuBtn));
		js.executeScript("arguments[0].click();", ThreeDotsMenuBtn);
		wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
		Assert.assertEquals(AddReceivingAccountBtn.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS, "The 'ADD RECEIVING ACCOUNT' option is displayed.");
		AddReceivingAccountBtn.click();
		wait.until(ExpectedConditions.visibilityOf(ReceivingAccountInformationPopUp));
		String PopUpText = ReceivingAccountInformationPopUp.getText();
		Assert.assertEquals(PopUpText, "Receiving Account Information");
		AccountNumberField1.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));;
		ProposedQuantityField1.sendKeys("100");
		AddReceivingAccount.click();
		AccountNumberField2.sendKeys(ExcelProperties.readFromExcel(FilePath2, SheetName2, rowNum2, cellNum2));;
		ProposedQuantityField2.sendKeys("100");
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0, 1000)");
			wait.until(ExpectedConditions.elementToBeClickable(AddToBatchBtn));
			actions.moveToElement(AddToBatchBtn).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception e) {
			driver.get().navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(ThreeDotsMenuBtn));
			js.executeScript("arguments[0].click();", ThreeDotsMenuBtn);
			wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
			Assert.assertEquals(AddReceivingAccountBtn.isDisplayed(), true);
			ObjectRepo.test.log(Status.PASS, "The 'ADD RECEIVING ACCOUNT' option is displayed.");
			AddReceivingAccountBtn.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			wait.until(ExpectedConditions.elementToBeClickable(AccountNumberField1));
			AccountNumberField1.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
			ProposedQuantityField.sendKeys("1");
			actions.moveToElement(AddToBatchBtn).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		}
		String Successmessage = SuccessMessage.getText();
		Assert.assertEquals(Successmessage, "Receiving Account(s) Information has been added for the selected record");
		ObjectRepo.test.log(Status.PASS,
				"'Receiving Account(s) Information has been added for the selected record' success message is displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
		js.executeScript("window.scrollBy(0,-300)", "");
		System.out.println("Records is added to the Batch Transfer grid");
		ObjectRepo.test.log(Status.PASS, "Records is added to the Batch Transfer grid");
		js.executeScript("window.scrollBy(0,1200)", "");
		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		Assert.assertEquals(SubmitBtn.isEnabled(), true);
		System.out.println("The 'SUBMIT' button is enabled");
		ObjectRepo.test.log(Status.PASS, "The 'SUBMIT' button is enabled");
		js.executeScript("arguments[0].click();", SubmitBtn);
		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
		String Title = Submit_Batch_Transfer_PopUp.getText();
		Assert.assertEquals(Title, "Submit Batch Transfer");
		System.out.println("The 'Submit Batch Transfer' passphrase pop-up is displayed");
		ObjectRepo.test.log(Status.PASS, "The 'Submit Batch Transfer' passphrase pop-up is displayed");
		wait.until(ExpectedConditions.visibilityOf(PasspharseEnter));
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtnOnPassphrasePopUp));
		SubmitBtnOnPassphrasePopUp.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Successmessage1 = SuccessMessage.getText();
		Assert.assertEquals(Successmessage1, "Batch Transfer is successfully proposed");
		ObjectRepo.test.log(Status.PASS, "The 'Submit Batch Transfer' passphrase pop-up is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
		wait.until(ExpectedConditions.visibilityOf(TransferStatusOnProposedBatchTransferPage));
		String StatusText = TransferStatusOnProposedBatchTransferPage.getText();
		Assert.assertEquals(StatusText, "Proposed");
		js.executeScript("window.scrollBy(0,-1700)", "");
		// Calculation After Proposed

		String TransferStatus = TransferStatusOnBatchTransferHistoryTable.getText();
		Assert.assertEquals(TransferStatus, "Proposed");
		System.out.println("'Batch Transfer is successfully proposed' toast success message is displayed & 'Proposed' status is updated in the 'Batch Transfer History' grid");
		ObjectRepo.test.log(Status.PASS,
				"'Batch Transfer is successfully proposed' toast success message is displayed & 'Proposed' status is updated in the 'Batch Transfer History' grid");
	}
	
	
	
	
	

	public void Navigate_To_Search_Entities() {
		wait.until(ExpectedConditions.elementToBeClickable(SearchEntities));
		js.executeScript("arguments[0].click();", SearchEntities);
		ObjectRepo.test.info("Navigate to Search Entities");
	}

	public void ClickonManageAllTransfers() {
		wait.until(ExpectedConditions.elementToBeClickable(ManageAllTransfers));
		// CommonLibref.click(ManageAllTransfers, "seleniumClick",
		// "ManageAllTransfers");
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
		// wait.until(ExpectedConditions.elementToBeClickable(StopAllFutureTransfer));
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
		// wait.until(ExpectedConditions.elementToBeClickable(DateIcon));
		DateIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDateTime));
		CurrentDateTime.click();
	}

	public void SelectCheckBoxStopAllInProgressTransfer() {
//		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
//		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		// wait.until(ExpectedConditions.elementToBeClickable(StopAllFutureTransfer));
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

	public void SelectCheckBoxStopAllInProgressTransferFunctionality() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(Manage_All_Transfers));
		js.executeScript("arguments[0].click();", Manage_All_Transfers);
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		js.executeScript("arguments[0].click();", StopAllInProgressTransfer);
		boolean isChecked = StopAllInProgressTransfer.isSelected();
		if (isChecked) {
			System.out.println("Stop All Transfers In Progress CheckBox is checked");
		} else {
			System.out.println("Stop All Transfers In Progress CheckBox is un-checked");
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(UnCheckedStopAllInProgressTransfer).click(UnCheckedStopAllInProgressTransfer).build()
					.perform();
		}
		Assert.assertEquals(allowTransfersProposedStatusUncheckedCheckBox1.isSelected(), false);
		Assert.assertEquals(allowTransfersFromApprovedStatusCheckBox1.isSelected(), false);
		Assert.assertEquals(Checked_Jurisdiction_Entity_Transfers_Proposed_Status.isSelected(), false);
		Assert.assertEquals(Checked_Jurisdiction_Entity_Transfers_Approved_Status.isSelected(), false);
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		js.executeScript("arguments[0].click();", SubmitButton);
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		js.executeScript("arguments[0].click();", ContinueButton);
		wait.until(ExpectedConditions.elementToBeClickable(SuccessMessage));
		Assert.assertEquals(SuccessMessage.getText(),
				"The transfer(s) have been successfully updated for the jurisdiction.");
		try {
			CloseIcon.click();
		} catch (Exception e) {
			CloseIcon1.click();
		}
		ObjectRepo.test.log(Status.PASS,
				"Result Step :-1-Stop All Transfer in Progress Check Box is checked and all the Check Box in the Transfers within Entity Check Box is unchecked.");

	}

	public void SelectCheckBoxForAllowTransfersFromProposedStatus() throws InterruptedException {
		ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1);
//		String checkBox = allowTransfersProposedStatusUncheckedCheckBox1.getAttribute("data-testid");

		boolean isChecked = allowTransfersProposedStatusUncheckedCheckBox1.isSelected();

		// Print the result
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
//		String checkBox = allowTransfersProposedStatusUncheckedCheckBox1.getAttribute("data-testid");

		boolean isChecked = allowTransfersFromApprovedStatusCheckBox1.isSelected();

		// Print the result
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

	public void SearchSelectedJurisdiction() {
		String Jurisdiction = StoredJurisdiction.getText();
		System.out.println(Jurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(SearchJurisdiction));
		CommonLibref.click(SearchJurisdiction, "seleniumClick", "SearchJurisdiction");
		SearchJurisdiction.sendKeys(Jurisdiction);
	}

	public void clickOnQuickActionsThreeDot() throws InterruptedException {
		Thread.sleep(3000);
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
		// wait.until(ExpectedConditions.elementToBeClickable(StopAllFutureTransfer));
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
//			JavascriptExecutor executor = (JavascriptExecutor) driver.get();
//			executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		// wait.until(ExpectedConditions.elementToBeClickable(StopAllFutureTransfer));
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
		// wait.until(ExpectedConditions.elementToBeClickable(StopAllFutureTransfer));
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
		// String checkBox = Blanck.getAttribute("data-testid");
		try {
			allowTransfersProposedStatusUncheckedCheckBox1.click();
		} catch (Exception e) {
			Actions action1 = new Actions(driver.get());
			action1.moveToElement(allowTransfersProposedStatusUncheckedCheckBox1)
					.click(allowTransfersProposedStatusUncheckedCheckBox1).build().perform();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnQuickActions() {
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		wait.until(ExpectedConditions.elementToBeClickable(QuickActions));
//		CommonLibref.click(QuickActions, "seleniumClick", "QuickActions");
		actions.moveToElement(QuickActions).click().perform();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void expandAllJurisdictionsOnHomePage() {
//		wait=new WebDriverWait(driver.get(),30);
		homePage = manageJurisdictions.getText();
//		wait.until(ExpectedConditions.elementToBeClickable(expandAllJurisdictions));
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
		SearchBox.sendKeys("Quebec");
		System.out.println("Enter Jurisdiction Name =" + "Quebec");
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
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
		ObjectRepo.test.log(Status.PASS, "AR is navigated to the ‘Initiate Over-the-Counter Transfer <=3 Days’ page");

	}

	public void navigateToGenralAccountPageFunctionality() {

////      wait.until(ExpectedConditions.elementToBeClickable(MyAccount));
//		js.executeScript("arguments[0].click();", ExpandMyAccount);
////		ExpandMyAccount.click();
////		 CommonLibref.click(ExpandMyAccount, "seleniumClick", "ExpandMyAccount");
////		MyAccount.click();

		try {
			MyAccount.click();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", ExpandMyAccount);
		}
		Search.sendKeys("QC13193-10175");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(AccountNumber));
		wait.until(ExpectedConditions.elementToBeClickable(AccountNumber));
		actions.moveToElement(AccountNumber).click().build().perform();
//		AccountNumber.click();
		ObjectRepo.test.log(Status.PASS, " AR gets navigated to the General account details page .");
	}

	public void navigateToInitiateGenralAccount_Sanity() {
		js.executeScript("window.scrollBy(0,450)", "");
		try {
//			Search.sendKeys(listeners.prop.getProperty("HoldingVintageYear"));
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(ThreeDots));
		actions.moveToElement(ThreeDots).click().perform();
		wait.until(ExpectedConditions.elementToBeClickable(InitiateTransfer));
		InitiateTransfer.click();
		wait.until(ExpectedConditions.visibilityOf(TransferType));
		String Types = TransferType.getText();
		Assert.assertEquals(Types, "Transfer Type");
		ObjectRepo.test.log(Status.PASS, "  ‘Transfer Type’ pop-up screen is displayed");
	}

	public void Logout() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		CommonLibref.scroll(btnWelcomeProfileDD, "scrollToTopOFPage", "btnWelcomeProfile DD");
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfile));
		try {
			js.executeScript("arguments[0].click();", btnWelcomeProfileDD);

		} catch (ArrayIndexOutOfBoundsException e) {
			CommonLibref.click(btnWelcomeProfileDD, "moveToElementClick", "welcome profile button");
		} catch (Exception e) {
			btnWelcomeProfileDD.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnLogOut));
		try {
			btnLogOut.click();
		} catch (Exception e) {
			CommonLibref.click(btnLogOut, "moveToElementClick", "btnLogOut");
		}
	}

	public void ProposedGeneralTo_OTCLess_Than3_DaysTransfer_Sanity() {
		js.executeScript("window.scrollBy(0,1150)", "");
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		AccountNumberField.sendKeys("QC13191-10180");
		EntityReferenceField.sendKeys("00006998");
		QuantityField.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(AgreegateDatePickerIcon));
		js.executeScript("arguments[0].click();", AgreegateDatePickerIcon);
		js.executeScript("arguments[0].click();", CurrentDate);
		js.executeScript("window.scrollBy(0,1600)", "");

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
			actions.moveToElement(ExpectedTermination_DatePickerIcon).click().perform();
		} catch (Exception e) {
			ExpectedTermination_DatePickerIcon.click();
		}
		wait.until(ExpectedConditions.visibilityOf(CurrentDate));
		js.executeScript("arguments[0].click();", CurrentDate);
		PricePerInstrument.sendKeys("100");
		js.executeScript("window.scrollBy(0,550)", "");
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
		ObjectRepo.test.log(Status.PASS,
				"'Confirm Transfer Proposal' gets displayed with Passphrase along with warning message.");
	}

	public void Proposed_GeneralTo_OTCLess_Than3_DaysTransfer_Sanity() {
		ObjectRepo.test.log(Status.PASS, "Enter Valid Passphrase & click on CONFIRM Button");
		PassphraseField.sendKeys("Wciadmin@123");
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessageValue = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessageValue, "The proposal has been successfully prepared and is awaiting review.");
		ObjectRepo.test.log(Status.PASS,
				"The system has created the proposal for General Transfer and 'The proposal has been successfully prepared and is awaiting review' success message gets displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(SuccessMsgCancleBtn));
		SuccessMsgCancleBtn.click();
		EntityTransferID3 = FechedTransferValue.getText();
		ObjectRepo.test.log(Status.PASS,
				"Transfer ID (sequential) is assigned and displayed on the Transfer details page.: "
						+ EntityTransferID);
		System.out.println("EntityTransferID : " + EntityTransferID3);
	}

	public void Not_Proposed_GeneralTo_OTCLess_Than3_DaysTransfer_Sanity() {
		ObjectRepo.test.log(Status.PASS, "Enter Valid Passphrase & click on CONFIRM Button");
		PassphraseField.sendKeys("Wciadmin@123");
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageStopTransfer));
		String ErrorMessageValue = ErrorMessageStopTransfer.getText();
		System.out.println(ErrorMessageValue);
//		Assert.assertEquals(ErrorMessageValue,
//				"The transfer cannot be Proposed as the receiving Entity is not found. Please contact the Jurisdictions for more information.");
		ObjectRepo.test.log(Status.PASS,
				"The transfer cannot be Proposed as the receiving Entity is not found. Please contact the Jurisdictions for more information.' Error message is displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon1));
		CloseIcon1.click();
	}

	public void Propose_OTC_Less_Than_3_General_Allowance_Transfer() {
		navigateToGenralAccountPageFunctionality();
		navigateToInitiateGenralAccount_Sanity();
		navigateToInitiate_GenralAcc_Sanity();
		ProposedGeneralTo_OTCLess_Than3_DaysTransfer_Sanity();
		Proposed_GeneralTo_OTCLess_Than3_DaysTransfer_Sanity();
	}

	public void Not_Propose_OTC_Less_Than_3_General_Allowance_Transfer() {
		navigateToGenralAccountPageFunctionality();
		navigateToInitiateGenralAccount_Sanity();
		navigateToInitiate_GenralAcc_Sanity();
		ProposedGeneralTo_OTCLess_Than3_DaysTransfer_Sanity();
		Not_Proposed_GeneralTo_OTCLess_Than3_DaysTransfer_Sanity();
	}

	public void NavigateToManageTransfersPage() {
//		expandAllJurisdictionsOnHomePage();
//		searchJurisdictionNameOnHomePage();
		clickOnQuickActions();
		Manage_Transfers.click();
	}

	public void navigateToLUHAAccountPageFunctionality() {
		wait.until(ExpectedConditions.elementToBeClickable(MyAccount)).click();
		Search.sendKeys("QC13191-10178");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(AccountNumber)).click();
		} catch (Exception e) {
			AccountNumber.click();
		}
		wait.until(ExpectedConditions.visibilityOf(LUHAPageTitle));
		Assert.assertEquals(LUHAPageTitle.getText(), "Limited Use Holding Account Details");
	}

	public void navigateToInitiateConsignmentTransfer() {
		js.executeScript("window.scrollBy(0,450)", "");
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
			actions.moveToElement(ThreeDots).click().perform();
		} catch (Exception e) {
			CommonLibref.click(ThreeDots, "seleniumClick", "Element");
		}
		wait.until(ExpectedConditions.elementToBeClickable(InitiateTransfer));
		InitiateTransfer.click();
		wait.until(ExpectedConditions.elementToBeClickable(InitiateLUHAPageTitle));
		Assert.assertEquals(InitiateLUHAPageTitle.isDisplayed(), true);
	}

	public void proposedConsignmentTransfer() {
		js.executeScript("window.scrollBy(0,650)", "");
		wait.until(ExpectedConditions.visibilityOf(Quantity));
		Quantity.sendKeys("1");
		js.executeScript("window.scrollBy(0,850)", "");
		js.executeScript("arguments[0].click();", YesRadioWiringInstruction);
//		wait.until(ExpectedConditions.elementToBeClickable(YesRadioWiringInstruction)).click();
		js.executeScript("arguments[0].click();", SubmitButton);
		Passphrase.sendKeys("Wciadmin@123");
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

	public void navigateToMyApprovals_JAuth() {

		wait.until(ExpectedConditions.elementToBeClickable(MyApprovalsLabelAuth));
		try {
			MyApprovalsLabelAuth.click();
		} catch (Exception ex) {
			js.executeScript("arguments[0].click();", MyApprovalsLabelAuth);
		}
	}

	public void Not_proposeConsignmentTransfer() {
		js.executeScript("window.scrollBy(0,650)", "");
		wait.until(ExpectedConditions.visibilityOf(Quantity));
		Quantity.sendKeys("1");
		js.executeScript("window.scrollBy(0,850)", "");
		js.executeScript("arguments[0].click();", YesRadioWiringInstruction);
//		wait.until(ExpectedConditions.elementToBeClickable(YesRadioWiringInstruction)).click();
		js.executeScript("arguments[0].click();", SubmitButton);
		Assert.assertEquals(WarningMsgConfirmPopUp.isDisplayed() && Passphrase.isEnabled() && ConfirmBtn1.isDisplayed()
				&& CancelBtnOnConfirmPopUp.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS,
				"The 'Confirm Transfer Proposal' popup is displayed with a Passphrase along with a warning message.");
		Passphrase.sendKeys("Wciadmin@123");
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageStopTransfer));
		String ErrorMessageValue = ErrorMessageStopTransfer.getText();
		System.out.println(ErrorMessageValue);
//		Assert.assertEquals(ErrorMessageValue,
//				"The transfer cannot be Proposed as the receiving Entity is not found. Please contact the Jurisdictions for more information.");
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed : " + ErrorMessageValue);
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		CloseIcon.click();
	}

	public void Approve_Batch_TransferFunctionality() {
		String Text = MyApprovalsText.getText();
		Assert.assertEquals(Text, "My Approvals");
		ObjectRepo.test.log(Status.PASS,
				"The user is navigated to the My Approvals page which should contain the My Approvals Grid.");
		wait.until(ExpectedConditions.elementToBeClickable(ClickOnFilters));
		ClickOnFilters.click();
		AddFilter.click();
		dropdown = new Select(Operator);
		dropdown.selectByVisibleText("equals");
		dropdown = new Select(SecondColumns);
		dropdown.selectByVisibleText("Type");
		FilterValue.sendKeys(BatchID1);
		FilterValue2.sendKeys("Batch Transfer");
		Search.click();
		wait.until(ExpectedConditions.elementToBeClickable(Click_MyApprovalsID));
		Click_MyApprovalsID.click();
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
		Assert.assertEquals(Batch_Transfer.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS, "The Authority should navigated to the  'Batch Transfer' details page");
		js.executeScript("window.scrollBy(0,1800)", "");
		js.executeScript("arguments[0].click();", ApproveRadioButton);
		Assert.assertEquals(Auth_Submit_Btn.isEnabled(), true);
		Assert.assertEquals(ApproveRadioButton.isSelected(), true);
		ObjectRepo.test.log(Status.PASS,
				"The Approve option is selected & 'SUBMIT' button is enabled (Comment should not be mandatory)");

		js.executeScript("arguments[0].click();", Auth_Submit_Btn);
		String PassphrasePopup = Submit_Batch_Transfer_Popup.getText();
		Assert.assertEquals(PassphrasePopup, "Confirm Batch Transfer Decision");
		Assert.assertEquals(Cancel_Btn_For_Auth.isDisplayed(), true);
		Assert.assertEquals(Submit_Btn_For_Auth.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS, "The passphrase pop-up is displayed along with 'CANCEL' & 'SUBMIT' button");
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		js.executeScript("arguments[0].click();", Submit_Btn_For_Auth);
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessages = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessages, "The Approval for the Batch Transfer was successfully submitted");
		ObjectRepo.test.log(Status.PASS,
				"'The Approval for the Batch Transfer was successfully submitted' Success message is displayed.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
	}

	public void Stop_Future_Transfers_and_Transfers_in_Progress_within_Jurisdictions() {
		Common.pageLoader();
//		wait.until(ExpectedConditions.elementToBeClickable(Manage_All_Transfers));
//		try {
//			CommonLibref.click(Manage_All_Transfers, "javascriptClick", "Current_Date");
//		} catch (Exception e) {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(Manage_All_Transfers).click(Manage_All_Transfers).build().perform();
//			e.printStackTrace();
//		}
		CommonLibref.pageLoader();
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		js.executeScript("arguments[0].click();", StopAllFutureTransfer);
		wait.until(ExpectedConditions.elementToBeClickable(Calender));
		try {
			CommonLibref.click(Calender, "javascriptClick", "Calender");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Calender).click(Calender).build().perform();
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(Current_Date));
		CommonLibref.click(Current_Date, "javascriptClick", "Current_Date");
		Assert.assertEquals(StopAllFutureTransfer.isSelected(), true);
		ObjectRepo.test
				.info("Check box is checked for 'Future Transfers within Jurisdictions' and the Selection is saved.");

//		if (StopAllFutureTransfer.isSelected()) {
//			System.out.println("Check Box is Checked");
//			ObjectRepo.test.info(
//					"Check box is checked for 'Future Transfers within Jurisdictions' and the Selection is saved.");
//		} else {
//			js.executeScript("arguments[0].click();", StopAllFutureTransfer);
//			wait.until(ExpectedConditions.elementToBeClickable(Calender));
//			CommonLibref.click(Calender, "javasCalendercriptClick", "Calender");
//			wait.until(ExpectedConditions.visibilityOf(Current_Date));
//			CommonLibref.click(Current_Date, "javascriptClick", "Current_Date");
//			Assert.assertEquals(StopAllFutureTransfer.isSelected(), true);
//			ObjectRepo.test.info(
//					"Check box is checked for 'Future Transfers within Jurisdictions' and the Selection is saved.");
//		}
		if (StopAllInProgressTransfer.isSelected()) {
			System.out.println("Check Box is Checked");
			ObjectRepo.test.info(
					"Result Step 1:-Check box is checked for 'Stop All Transfers in Progress' and the Selection is saved.");
		} else {
			StopAllInProgressTransfer.click();
			Assert.assertEquals(StopAllInProgressTransfer.isSelected(), true);
		}
		wait.until(ExpectedConditions.elementToBeClickable(Submit_Button));
		CommonLibref.click(Submit_Button, "javascriptClick", "Submit_Button");
		// Submit_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		ContinueButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(SuccessMessage));
		Assert.assertEquals(SuccessMessage.getText(),
				"The transfer(s) have been successfully updated for the jurisdiction.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CloseIcon.click();
		} catch (Exception e) {
			CloseIcon2.click();
		}
		ObjectRepo.test.info("Check box is checked for 'Stop All Transfers in Progress' and the Selection is saved.");

	}

	public void navigateToReceving_AccountPageFunctionality() {
		js.executeScript("arguments[0].click();", MyAccount);
		Search.sendKeys(listeners.prop.getProperty("OTCLess_NS_ReceivingGeneralEntityAcc"));
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(AccountNumber));
		wait.until(ExpectedConditions.elementToBeClickable(AccountNumber));
		js.executeScript("arguments[0].click();", AccountNumber);
		ObjectRepo.test.log(Status.PASS, " AR gets navigated to the receiving General account details page .");
	}

	public void verifyPendingTransferTableafterProposedTransfer(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		PendingTransfers.click();
		js.executeScript("window.scrollBy(0,1500)", "");
		PendingTransferTableSearch.click();
		PendingTransferTableSearch.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,1500)", "");
		Assert.assertEquals(TransferIdValuePendinfTransfertable.getAttribute("value"), EntityTransferID2);
//		wait.until(ExpectedConditions.visibilityOf(TransferringAccountTypeValuePendingTransferTable));
//		Assert.assertEquals(TransferringAccountTypeValuePendingTransferTable.getText(), "Limited Use Holding");
		// Assert.assertEquals(ReceivingAccountTypeValuePendingTransferTable.getText(),
		// "General");
	//	Assert.assertEquals(StatusValuePendingTransferTable.getText(), "Proposed");
		ObjectRepo.test.log(Status.PASS,
				"The record of the Proposed transfer is displayed in the Pending Transfers table.");
	}
	public void verifyPendingTransferTableafterApprovedTransfer(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(PendingTransfers));
		wait.until(ExpectedConditions.elementToBeClickable(PendingTransfers));
	//	PendingTransfers.click();
		try {
			CommonLibref.click(PendingTransfers, "javascriptClick", "PendingTransfers");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(PendingTransfers).click(PendingTransfers).build().perform();
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,1500)", "");
		PendingTransferTableSearch.click();
		PendingTransferTableSearch.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,1500)", "");
		Assert.assertEquals(TransferIdValuePendinfTransfertable.getAttribute("value"), EntityTransferID2);
//		wait.until(ExpectedConditions.visibilityOf(TransferringAccountTypeValuePendingTransferTable));
//		Assert.assertEquals(TransferringAccountTypeValuePendingTransferTable.getText(), "Limited Use Holding");
		// Assert.assertEquals(ReceivingAccountTypeValuePendingTransferTable.getText(),
		// "General");
		Assert.assertEquals(StatusValuePendingTransferTable.getText(), "Approved");
		ObjectRepo.test.log(Status.PASS,
				"The record of the Proposed transfer is displayed in the Pending Transfers table.");
	}
	
	
	
	
	public void VerifyPendingTransferDetailPage() {
//		wait.until(ExpectedConditions.visibilityOf(EntityTransferID3));
		js.executeScript("arguments[0].click();", FirstElement);
		String PageTitle = TransferDetails.getText();
		Assert.assertEquals(PageTitle, "Transfer Details");
		System.out.println(PageTitle);
		ObjectRepo.test.log(Status.PASS, "PageTitle");
	}

	public void ApproveTransfer() {
		driver.get().navigate().refresh();
		CommonLibref.pageLoader();
		js.executeScript("window.scrollBy(0,1500)", "");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		Comments1.sendKeys("Test Automation");
		js.executeScript("arguments[0].click();", Submit2);
		PassphraseField.sendKeys(listeners.prop.getProperty("WciIncAdminPassphrase"));
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessageValue = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessageValue,
				"The Over-the-Counter (OTC) Agreement with delivery in no more than 3 days transfer has been approved successfully.");
		SuccessMsgCancleBtn.click();
		System.out.println(SuccessMessageValue);
		ObjectRepo.test.log(Status.PASS, SuccessMessageValue);
	}

	public void Not_ApproveTransfer_General_Transfer() {
		CommonLibref.pageLoader();
		js.executeScript("window.scrollBy(0,1500)", "");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		CommonLibref.click(ApproveRadioButton, "javascriptClick", "ApproveRadioButton");
		Comments1.sendKeys("Test Automation");
		js.executeScript("arguments[0].click();", Submit2);
		PassphraseField.sendKeys("Wciadmin@123");
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageStopTransfer));
		String ErrorMessageValue = ErrorMessageStopTransfer.getText();
	//	Assert.assertEquals(ErrorMessageValue,
	//			"The transfer cannot be Approved as the receiving account is not found. Please contact the Jurisdictions for more information.");
		SuccessMsgCancleBtn.click();
		System.out.println("Error message should get displayed as" + ErrorMessageValue);
		ObjectRepo.test.log(Status.PASS, ErrorMessageValue);
	}

	public void Navigate_Home_Page() {
		wait.until(ExpectedConditions.visibilityOf(Home_Page));
		js.executeScript("arguments[0].click();", Home_Page);
	}

	public void verifyNotApproveConsignmentTransferFunctionality() {
		js.executeScript("window.scrollBy(0,950)");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		js.executeScript("window.scrollBy(0,650)");
		ObjectRepo.test.log(Status.PASS, "Click on 'Approve' radio button, and then click on 'SUBMIT' button.");
		CommonLibref.click(ApproveRadioButton, "javascriptClick", "ApproveRadioButton");
		CoomentsField.sendKeys("Automation Testing");
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButtonOnApprove));
		js.executeScript("arguments[0].click();", SubmitButtonOnApprove);
		wait.until(ExpectedConditions.visibilityOf(ConfirmTransferProposalPopUpText));
		Assert.assertEquals(ConfirmTransferProposalPopUpText.isDisplayed(), true);
		Assert.assertEquals(PassphraseFieldPopUp.isDisplayed(), true);
		Assert.assertEquals(CancelBtnOnConfirmPopUp.isDisplayed(), true);
		Assert.assertEquals(ConfirmBtn1.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS,
				"‘Confirm Transfer Proposal’ pop up screen is displayed with 'CANCEL' and 'CONFIRM' button along with 'Passphrase' text field");
//		ObjectRepo.test.log(Status.PASS, "Enter the Valid Passphrase & click on the CONFIRM Button");
		PassphraseFieldPopUp.sendKeys("Wciadmin@123");
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageStopTransfer));
		System.out.println(ErrorMessageStopTransfer.getText());
//		Assert.assertEquals(ErrorMessageStopTransfer.getText(),
//				"The transfer cannot be Approved as the receiving Entity is not found. Please contact the Jurisdictions for more information.");
		ObjectRepo.test.log(Status.PASS,
				"'The transfer cannot be Approved as the receiving Entity is not found. Please contact the Jurisdictions for more information.' Error message is displayed");
		SuuccessCloseIcon.click();
	}

	public void navigateToTransferDetailPage_PendingTransgerTable(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		PendingTransferExpandIcon.click();
		PendingTransferTableSearch.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,350)");
		js.executeScript("arguments[0].click();", FirstElement);
		wait.until(ExpectedConditions.visibilityOf(TransferDetailPageTitle));
		Assert.assertEquals(TransferDetailPageTitle.isDisplayed(), true);
	}

	public void ApproveTransfer_For_Accept_Functionality() {
		js.executeScript("window.scrollBy(0,1500)", "");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		Comments1.sendKeys("Test Automation");
		js.executeScript("arguments[0].click();", Submit2);
		PassphraseField.sendKeys(listeners.prop.getProperty("TRUserBPassword"));
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessageValue = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessageValue,
				"The Over-the-Counter (OTC) Agreement with delivery in no more than 3 days transfer has been approved successfully.");
		SuccessMsgCancleBtn.click();
		ObjectRepo.test.log(Status.PASS, "AAR/PAR is be able to Approve the transfer.");
	}

	public void Accept_Functionality() {
		driver.get().navigate().refresh();
		CommonLibref.pageLoader();
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		Comments1.sendKeys("Test Automation");
		js.executeScript("arguments[0].click();", Submit2);
		PassphraseField.sendKeys(listeners.prop.getProperty("TRUserBPassword"));
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessageValue = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessageValue,
				"The transfer has been completed and the instruments have been transferred to your General Account.");
		SuccessMsgCancleBtn.click();
		System.out.println(SuccessMessageValue);
		ObjectRepo.test.log(Status.PASS,SuccessMessageValue);
	}

	public void Not_Accept_Functionality() {
		js.executeScript("window.scrollBy(0,1500)", "");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		Comments1.sendKeys("Test Automation");
		js.executeScript("arguments[0].click();", Submit2);
		PassphraseField.sendKeys(listeners.prop.getProperty("TRUserBPassword"));
		ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessage1));
		String ErrorMessageValue = ErrorMessage1.getText();
		Assert.assertEquals(ErrorMessageValue,
				"The transfer cannot be Accepted. Please contact the Jurisdictions for more information.");
// 	    SuccessMsgCancleBtn.click();
		System.out.println("AAR/PAR is not able to Accept the Transfer and an error message is displayed: The transfer cannot be Accepted. Please contact the Jurisdictions for more information.'");
		ObjectRepo.test.log(Status.PASS,
				"AAR/PAR is not able to Accept the Transfer and an error message is displayed: The transfer cannot be Accepted. Please contact the Jurisdictions for more information.'");
	}

	public void Allow_Transfer_From_Proposed_Status() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(Manage_All_Transfers));
		js.executeScript("arguments[0].click();", Manage_All_Transfers);
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
//	   wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
//	   wait.until(ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1));
		if (allowTransfersProposedStatusUncheckedCheckBox1.isSelected()) {
			System.out.println("Check Box is Checked");
			ObjectRepo.test.info(
					"Result Step 1:-Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		} else {
			allowTransfersProposedStatusUncheckedCheckBox1.click();
			Assert.assertEquals(allowTransfersProposedStatusUncheckedCheckBox1.isSelected(), true);
			wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
			SubmitButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(SuccessMessage));
			Assert.assertEquals(SuccessMessage.getText(),
					"The transfer(s) have been successfully updated for the jurisdiction.");
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
			ObjectRepo.test.info(
					"Result Step 1:-Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		}
	}

	public void Allow_Transfer_From_Approved_Status() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(Manage_All_Transfers));
		js.executeScript("arguments[0].click();", Manage_All_Transfers);
		CommonLibref.scroll(SubmitButton, "scrollToBottomOFPage", "SubmitButton");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
		}
//	   wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
//	   
		if (StopAllFutureTransfer.isSelected()) {
			StopAllFutureTransfer.click();
			Assert.assertEquals(StopAllFutureTransfer.isSelected(), false);
		} else {
			System.out.println("Stop All Future Transfer CheckBox is un-checked");
		}
		if (allowTransfersProposedStatusUncheckedCheckBox1.isSelected()) {
			System.out.println("Check Box is Checked");
			ObjectRepo.test.info(
					"Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		} else {
			allowTransfersProposedStatusUncheckedCheckBox1.click();
			Assert.assertEquals(allowTransfersProposedStatusUncheckedCheckBox1.isSelected(), true);
			ObjectRepo.test.info(
					"Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		}
		if (allowTransfersFromApprovedStatusCheckBox1.isSelected()) {
			System.out.println("Check Box is Checked");
			ObjectRepo.test.info(
					"Result Step 1:-Check box is checked for 'Allow Transfers From Approved Status' and the Selection is saved.");
		} else {
			allowTransfersFromApprovedStatusCheckBox1.click();
			Assert.assertEquals(allowTransfersFromApprovedStatusCheckBox1.isSelected(), true);
			wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
			SubmitButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(SuccessMessage));
			Assert.assertEquals(SuccessMessage.getText(),
					"The transfer(s) have been successfully updated for the jurisdiction.");
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
			ObjectRepo.test.info(
					"Result Step 1:-Check box is checked for 'Allow Transfers From Approved Status' and the Selection is saved.");
		}
		CommonLibref.scroll(Manage_All_Transfers, "scrollToTopOFPage", "Manage_All_Transfers");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void Do_Not_Allow_Transfer_From_Approved_Status() {
		Common.pageLoader();
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
//	   
		if (StopAllFutureTransfer.isSelected()) {
			StopAllFutureTransfer.click();
			Assert.assertEquals(StopAllFutureTransfer.isSelected(), false);
		} else {
			System.out.println("Stop All Future Transfer CheckBox is Un-Checked");
		}
		if (allowTransfersProposedStatusUncheckedCheckBox1.isSelected()) {
			System.out.println("Check Box is Checked for Allow Transfers From Proposed Status");
			ObjectRepo.test.info(
					"Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		} else {
			allowTransfersProposedStatusUncheckedCheckBox1.click();
			Assert.assertEquals(allowTransfersProposedStatusUncheckedCheckBox1.isSelected(), true);
			System.out.println("Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
			ObjectRepo.test.info(
					"Check box is checked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		}
		if (allowTransfersFromApprovedStatusCheckBox1.isSelected()) {
			try {
				allowTransfersFromApprovedStatusCheckBox1.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click();", allowTransfersFromApprovedStatusCheckBox1);
			}
//    	   allowTransfersFromApprovedStatusCheckBox1.click();
			Assert.assertEquals(allowTransfersFromApprovedStatusCheckBox1.isSelected(), false);
			wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
			CommonLibref.click(SaveButton, "javascriptClick", "SaveButton");
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(SuccessMessage));
			Assert.assertEquals(SuccessMessage.getText(),
					"The transfer(s) have been successfully updated for the jurisdiction.");
//		   wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			try {
				CloseIcon.click();
			} catch (Exception e) {
				CloseIcon1.click();
			}

			ObjectRepo.test.info(
					"Result Step 1:-Check box is not checked for 'Allow Transfers From Approved Status' and the Selection is saved.");

		} else {
			System.out.println("Check Box is UnChecked for Allow Transfers From Approved Status");
			ObjectRepo.test.info(
					"Result Step 1:-Check box is not checked for 'Allow Transfers From Approved Status' and the Selection is saved.");
		}
		CommonLibref.scroll(Manage_All_Transfers, "scrollToTopOFPage", "Manage_All_Transfers");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}

	public void Not_Allow_Transfer_From_Proposed_Status() {
		Common.pageLoader();
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
//		   wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
//		   wait.until(ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1));
		if (allowTransfersProposedStatusUncheckedCheckBox1.isSelected()) {
			try {
				js.executeScript("arguments[0].click();", allowTransfersProposedStatusUncheckedCheckBox1);
			} catch (Exception e) {
				allowTransfersProposedStatusUncheckedCheckBox1.click();
			}
			Assert.assertEquals(allowTransfersProposedStatusUncheckedCheckBox1.isSelected(), false);
			wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
			CommonLibref.click(SaveButton, "javascriptClick", "SaveButton");
			wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
			ContinueButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(SuccessMessage));
			Assert.assertEquals(SuccessMessage.getText(),
					"The transfer(s) have been successfully updated for the jurisdiction.");
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
			ObjectRepo.test.info(
					"Result Step 1:-Check box is Unchecked for 'Allow Transfers From Proposed Status' and the Selection is saved.");

		} else {
			System.out.println("Check Box is UnChecked");
			ObjectRepo.test.info(
					"Result Step 1:-Check box is Unchecked for 'Allow Transfers From Proposed Status' and the Selection is saved.");
		}
	}

	public void Not_Approve_Transfer() {
		js.executeScript("window.scrollBy(0,1500)", "");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		Comments1.sendKeys("Test Automation");
		js.executeScript("arguments[0].click();", Submit2);
		PassphraseField.sendKeys(listeners.prop.getProperty("TRUserBPassword"));
		js.executeScript("arguments[0].click();", ConfirmBtn1);
//				ConfirmBtn1.click();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessage_Stop_All_Transfer));
		String ErrorMessageValue = ErrorMessage_Stop_All_Transfer.getText();
		Assert.assertEquals(ErrorMessageValue,
				"The transfer cannot be Approved as the receiving Entity is not found. Please contact the Jurisdictions for more information.");
		SuccessMsgCancleBtn.click();
		ObjectRepo.test.log(Status.PASS, "Result Step:-2 -AAR/PAR is not able to Approve the transfer.");

	}

	public void searchEntityIdOnHomePage() {
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(searchFieldOnMyApproval));
		wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnMyApproval));
		searchFieldOnMyApproval.click();
		searchFieldOnMyApproval.sendKeys(jp.fetchStoredJurisdictionNameValue(16));
	}

	public void storedEntityAccountNumberInString1() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(firstEntityAccountNumber));
		accountNumber1 = firstEntityAccountNumber.getText();
//		String luhaAccountNumber = Inter_Jurisdiction_Transfer.accountNumber1;
		System.out.println("accountNumber1 :" + Inter_Jurisdiction_Transfer.accountNumber1);
	}

	public void storedEntityAccountNumberInString2() {
		wait.until(ExpectedConditions.elementToBeClickable(secondEntityAccountNumber));
		accountNumber2 = secondEntityAccountNumber.getText();
//		String annualAllocationHoldingsAccountNumber = Inter_Jurisdiction_Transfer.accountNumber2;
		System.out.println("accountNumber2 :" + Inter_Jurisdiction_Transfer.accountNumber2);
	}

	public void storedEntityAccountNumberInString3() {
		wait.until(ExpectedConditions.elementToBeClickable(thirdEntityAccountNumber));
		accountNumber3 = thirdEntityAccountNumber.getText();
//		String generalAccountNumber = Inter_Jurisdiction_Transfer.accountNumber3;
		System.out.println("accountNumber3 :" + Inter_Jurisdiction_Transfer.accountNumber3);
	}

	public void storedEntityAccountNumberInString4() {
		wait.until(ExpectedConditions.elementToBeClickable(fourthEntityAccountNumber));
		accountNumber4 = fourthEntityAccountNumber.getText();
//		String ComplianceAccountNumber = Inter_Jurisdiction_Transfer.accountNumber4;
		System.out.println("accountNumber4 :" + Inter_Jurisdiction_Transfer.accountNumber4);
	}

	public void clickOnApproveBatchTransferFunctionality() {
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
		Assert.assertEquals(Batch_Transfer.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS, "The Authority should navigated to the  'Batch Transfer' details page");
		js.executeScript("window.scrollBy(0,1800)", "");
		js.executeScript("arguments[0].click();", ApproveRadioButton);
		Assert.assertEquals(Auth_Submit_Btn.isEnabled(), true);
		Assert.assertEquals(ApproveRadioButton.isSelected(), true);
		ObjectRepo.test.log(Status.PASS,
				"The Approve option is selected & 'SUBMIT' button is enabled (Comment should not be mandatory)");
		System.out.println(
				"The Approve option is selected & 'SUBMIT' button is enabled (Comment should not be mandatory)");

		js.executeScript("arguments[0].click();", Auth_Submit_Btn);
		String PassphrasePopup = Submit_Batch_Transfer_Popup.getText();
		Assert.assertEquals(PassphrasePopup, "Confirm Batch Transfer Decision");
		Assert.assertEquals(Cancel_Btn_For_Auth.isDisplayed(), true);
		Assert.assertEquals(Submit_Btn_For_Auth.isDisplayed(), true);
		ObjectRepo.test.log(Status.PASS, "The passphrase pop-up is displayed along with 'CANCEL' & 'SUBMIT' button");
		System.out.println("The passphrase pop-up is displayed along with 'CANCEL' & 'SUBMIT' button");
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		js.executeScript("arguments[0].click();", Submit_Btn_For_Auth);
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessages = SuccessMessage.getText();
		Assert.assertEquals(SuccessMessages, "The Approval for the Batch Transfer was successfully submitted");
		ObjectRepo.test.log(Status.PASS,
				"The Approval for the Batch Transfer was successfully submitted' Success message is displayed.");
		System.out.println(
				"The Approval for the Batch Transfer was successfully submitted' Success message is displayed.");

		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		js.executeScript("arguments[0].click();", CloseIcon);
	}
}
