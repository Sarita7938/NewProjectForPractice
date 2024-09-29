package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.Status;
import com.beust.jcommander.converters.BigDecimalConverter;
import com.beust.jcommander.converters.FloatConverter;

import io.reactivex.rxjava3.exceptions.Exceptions;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

import static constants.ThreadConstants.driver;
import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;
import static Utilities.listeners.prop;
import static Utilities.listeners.wait;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class CrossJurisdictionTransfer_Pom {
	// Batch IDs
	String BatchID;
	String BatchID1st;
	String BatchID2nd;
	String BatchTranserID2;

	// Transfer and Account Information
	String TransferID;
	String ReceivingAccount;
	String Transfering_ID;
	String InactiveAccountNumber;
	String ActiveAccountNumber;
	String SecondActiveAccountNumber;

	// Quantities and Balances
	int AvailableHoldingQuantity;
	int Holding_Quantity;
	int AvailableAccBalance;
	int Account_Balance;
	int Holding_Quantity_AfterApproved;
	int Holdingquantity;
	int UpdatedHoldingQuantity;
	int Fetched_Hodling_Quantity;
	int Fetched_Hodling_Quantity2;
	int Receiving_Account_Balance_AfterApproved;
	int Receiving_Account_Balance_BeforeApproved;
	int Receiving_Available_Account_Balance_BeforeApproved;
	int Receiving_AvailableAccBalance_After_Approved;
	int AvailableHolding_Quantity_After_Proposed;
	int BeforeHoldingQuantity;
	long AvailableAccBalance_Before_Proposed;
	long AvailableHolding_Quantity_Before_Proposed;
	long AvailableAccBalance_After_Proposed;
	long Available_Holding_Quantity_After_Proposed;
	long AvailableAccBalance_After_Denied;
	long AvailableAccBalance_After_RevisionsRequested;
	long AvailableHoldingQuantity_After_Denied;
	long AvailableHoldingQuantity_After_RevisionsRequested;
	long Available_Holding_Quantity_AfterApproved;

	// Fetched Data
	String Fetched_Vintage;
	String Fetched_Type;
	String Fetched_SubType;
	String Fetched_OffsetType;
	String Fetched_OffsetProjectID;
	String Fetched_SpecialCategory;
	String Fetched_HoldingQuantity;
	String Fetched_HoldingQuantity2;
	String Fetched_Vintage2;
	String Fetched_Type2;
	String Fetched_SubType2;
	String Fetched_OffsetType2;
	String Fetched_OffsetProjectID2;
	String Fetched_SpecialCategory2;

	// Other Information
	String ProposedQuanity;
	String AccountBal;
	String AvailbleHoldingQuantity;
	String CaptureCrossSelectedDate;
	String CaptureCrossSelectedTime;
	String CaptureInterSelectedDate;
	String CaptureInterSelectedTime;
	public static String Cluster_ID;
	String RevisionsComment;

	publicHomePage sc;
	LoginPom s;
	Select dropdown;
	int quantity;

	@FindBy(xpath = "//*[contains(text(), 'Cross-Jurisdictional')]/following::*[@name='cj_effective_date'][1]")
	WebElement CaptureCrossDate;

	@FindBy(xpath = "//*[contains(text(), 'Cross-Jurisdictional')]/following::*[@name='cj_effective_date'][2]")
	WebElement CaptureCrossTime;

	@FindBy(xpath = "//*[contains(text(),'Cross-Jurisdictional Transfers with All Linked Jurisdictions')]/following::*[@class='MuiTypography-root MuiTypography-body1 css-9tutdm']")
	WebElement CaptureCrossDateandTime;

	@FindBy(xpath = "//*[contains(text(),'Cross-Jurisdictional Transfers')]/following::*[@class='MuiTypography-root MuiTypography-body1 css-9tutdm']")
	WebElement CaptureSelectDateandTime;

	@FindBy(xpath = "//*[contains(text(), 'Inter-Jurisdictional')]/following::*[@name='ij_effective_date'][1]")
	WebElement CaptureInterDate;

	@FindBy(xpath = "//*[contains(text(), 'Inter-Jurisdictional')]/following::*[@name='ij_effective_date'][2]")
	WebElement CaptureInterTime;

	@FindBy(xpath = "//*[contains(text(),'Inter-Jurisdictional Transfers')]/following::*[@class='MuiTypography-root MuiTypography-body1 css-9tutdm']")
	WebElement CaptureInterDateandTime;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[2]")
	public WebElement SuccessMessageCloseButton;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	WebElement ProposedQuantityField;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	WebElement AddToBatchBtn;

	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	WebElement AccountNumberField;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Reset']")
	WebElement CancelButton;
	@FindBy(xpath = "//p[text()='ADD RECEIVING ACCOUNT']")
	WebElement AddReceivingAccountBtn;

	@FindBy(xpath = "//h2[text()='Receiving Account Information']")
	WebElement ReceivingAccountInformationPopUp;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-13tw421']")
	WebElement SearchEntities;

	@FindBy(xpath = "//input[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz\"]") // Search
	WebElement Search;

	@FindBy(xpath = "//button[@aria-label='Show filters']")
	WebElement ClickOnFilters;

	@FindBy(xpath = "//*[text()='Add filter']")
	WebElement AddFilter;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[1]")
	WebElement FirstColumn;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[2]")
	WebElement Operator;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[3]")
	WebElement ValueDropdown;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[4]")
	WebElement SecondColumns;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input css-mnn31'])[2]")
	WebElement FilterValue2;

	@FindBy(xpath = "//input[@placeholder='Filter value']")
	WebElement FilterValue;

	// Columns Filter

	@FindBy(xpath = "//*[@aria-label='Select columns']")
	WebElement ShowColumn;

	@FindBy(xpath = "//*[@name='entityReferenceCode']")
	WebElement ColumnRefrenceCode;

	@FindBy(xpath = "(//*[@data-field='entityReferenceCode'])[2]")
	WebElement Capture1stEntityRefrenceCode;

	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[2]")
	WebElement CaptureFirstEntityAccountNumber;

	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[2]")
	WebElement CaptureSecondEntityAccountNumber;

	@FindBy(xpath = "//p[text()='All Jurisdiction Accounts']")
	WebElement JurisdictionAccountsGrid;

	@FindBy(xpath = "(//input[@type='search'])[4]")
	WebElement SearchJurisdictionAcc;

	@FindBy(xpath = "//div[text()='Account Number']")
	WebElement AccountNumberText;

	@FindBy(xpath = "//div[text()=\"Account Type\"]")
	WebElement AccountTypeText;

	@FindBy(xpath = "(//div[text()='Account Status'])[4]")
	WebElement AccountStatusText;

	@FindBy(xpath = "//button[text() ='MORE ACTIONS']")
	WebElement MoreActions;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	WebElement IssuanceAccounts;

	@FindBy(xpath = "//button[contains(text(),'MENU')]")
	WebElement MegaMenu;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	WebElement IssuancePageTitle;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[3]")
	WebElement Initiate_Batch_Transfer_Btn;

	@FindBy(xpath = "//h2[@class=\"MuiTypography-root MuiTypography-h2 css-upmoyc\"]")
	WebElement InitiateBatchTransferPopUp;

	@FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	WebElement BatchTransferRadioBtn;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	WebElement ContinueBtn;

	@FindBy(xpath = "//button[@data-testid='priv_modal_Continue']")
	WebElement ContinueBtnonWarningpopup;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Reset']")
	WebElement CancelBtn;

	@FindBy(xpath = "//button[@data-testid='priv_modal_Cancel']")
	WebElement CancelBtnonWarningPopup;

	@FindBy(xpath = "//h2[@class=\"MuiTypography-root MuiTypography-h2 css-upmoyc\"]")
	WebElement HoldingsPopUp;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	WebElement CheckBoxAll;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	WebElement CheckBox;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")
	WebElement CheckBox1;

	@FindBy(xpath = "//button[@data-testid=\"priv_btn_Search\"]")
	WebElement Continue_Btn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-disableElevation css-12bnjz9']")
	WebElement AddHoldingsButton;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation rc css-93we79']")
	WebElement CancelAddMoreCard;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation rc css-93we79'])[1]")
	WebElement CancelOnBatchTransfersCard;

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-disableElevation rc css-93we79'])[3]")
	WebElement CancelButtonInd3;

	@FindBy(xpath = "(//div[@data-field=\"vintage\"])[2]")
	WebElement Vintage;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field='vintage'][2]")
	WebElement VintageOnPopUp;

	@FindBy(xpath = "(//div[@data-field=\"type\"])[2]")
	WebElement Type;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field='type'][2]")
	WebElement TypeOnPopUp;

	@FindBy(xpath = "(//div[@data-field=\"offsetType\"])[2]")
	WebElement OffsetType;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field='offsetType'][2]")
	WebElement OffsetTypeOnPopUp;

	@FindBy(xpath = "(//div[@data-field=\"subType\"])[2]")
	WebElement SubType;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field='subType'][2]")
	WebElement SubTypeOnPopUp;

	@FindBy(xpath = "(//div[@data-field='offsetProjectID'])[2]")
	WebElement OffsetProjectId;

	@FindBy(xpath = "//*[@data-testid='more-actions']")
	WebElement MoreActionsButton;

	@FindBy(xpath = "(//div[@data-field='offsetProjectId'])[2]")
	WebElement OffsetProjectIdOnSavePage;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field='offsetProjectID'][2]")
	WebElement OffsetProjectIdOnPopUp;

	@FindBy(xpath = "(//div[@data-field=\"specialCategory\"])[2]")
	WebElement SpecialCategory;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field='specialCategory'][2]")
	WebElement SpecialCategoryOnPopUp;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-mphr3n']")
	WebElement SubmitButtonOnConfirmationPop;

	@FindBy(xpath = "(//div[@data-field='quantity'])[2]")
	WebElement HoldingQuantity;

	@FindBy(xpath = "//p[text()='Select holdings from the table below to initiate a batch transfer']//following::div[@data-field=\"quantity\"][2]")
	WebElement HoldingQuantityOnHoldingsPopup;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[8]")
	WebElement AvaialbleAccountBalanceAfterProposed;

	@FindBy(xpath = "(//div[@data-field=\"availableHoldingQuantity\"])[2]")
	WebElement AvaialbleHoldingQuantityAfterProposed;

	@FindBy(xpath = "//h1[text()='Batch Transfer']")
	WebElement InitiateBatchTransferPage;

	@FindBy(xpath = "//input[@data-testid='batchName']")
	WebElement BatchNameField;

	@FindBy(xpath = "//*[@data-testid='comment']")
	WebElement CommentField;

	@FindBy(xpath = "//button[@data-testid='add_batch_save']")
	WebElement SaveBtn;

	@FindBy(xpath = "//button[@data-testid='add_batch_cancel']")
	WebElement CancelBtnOnInitiateBatchTransfer;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	WebElement SuccessMessage;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-bj5op3'])[1]")
	WebElement ErrorMessageOnReceivingAccountInformationCard1;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-74todz']")
	WebElement ErrorMessageWhenProposed;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-74todz'])[2]")
	WebElement ErrorMessageWhenProposed1;
	@FindBy(xpath = "(//*[@class=\"MuiTypography-root MuiTypography-body2 css-74todz\"])[1]")
	WebElement ErrorMessageWhenProposed2;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	WebElement CloseIcon;

	@FindBy(xpath = "//p[text()='Saved']")
	WebElement TransferStatusOnSavedBatchTransferPage;

	@FindBy(xpath = "//p[text()='Proposed']")
	WebElement TransferStatusOnProposedBatchTransferPage;

	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body2 css-1fr8lnd\"])[6]")
	WebElement BatchIdOnProposedBatchTransferPage;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	WebElement ThreeDotsMenuBtn;

	@FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
	private WebElement ClickDropdownHomePage;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;

	@FindBy(xpath = "//*[text()='MANAGE JURISDICTION STATUS']")
	private WebElement manageJurisdictionStatusOption;

	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;

	@FindBy(xpath = "//input[@id='passphrase']")
	WebElement PasspharseEnter;

	@FindBy(xpath = "//button[@data-testid='batch_propose']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	WebElement Submit_Batch_Transfer_PopUp;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement SubmitBtnForApprove;

	@FindBy(xpath = "(//*[@data-field='batchId'])[2]")
	WebElement FirstBatchIDonBatchTransfersPage;

	@FindBy(xpath = "(//*[@data-field='clusterId'])[2]")
	WebElement FirstAdministraitveIDonBatchTransfersPage;

	@FindBy(xpath = "//*[contains(text(),'JURISDICTION MANAGEMENT')]//..//*[contains(text(),'Batch Transfers')]")
	WebElement BatchTransfersOnMegaMenu;

	@FindBy(xpath = "//*[contains(text(),'JURISDICTION MANAGEMENT')]//..//*[contains(text(),'Administrative Transfers')]")
	WebElement AdminstrativeTransfersOnMegaMenu;

	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-1l7rfk3']")
	WebElement Batch_Transfer;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[6]")
	WebElement BatchIDOnTransferDatailsCard;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[4]")
	WebElement ReceivingAcc_AccBal;

	@FindBy(xpath = "//a[text()='HOME']")
	WebElement Home;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	WebElement TransferIDOnTransferDatailsCard;

	// Administrative
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1x776eu']")
	WebElement Initiate_Administrative_Transfer_Btn;

	@FindBy(xpath = "//p[text()='Transfer Type']")
	WebElement TransferType;

	@FindBy(xpath = "//h1[@class=\"MuiTypography-root MuiTypography-h1 css-1l7rfk3\"]")
	WebElement Administrative_Transfer;

	@FindBy(xpath = "//input[@data-testid=\"receivingAccountNumber\"]")
	WebElement Receiving_Account_Number_Field;

	@FindBy(xpath = "(//p[@class=\"MuiTypography-root MuiTypography-body2 css-1cpdyr0\"])[3]")
	WebElement Administrative_Transfer_Status;

	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[1]")
	WebElement Cluster_ID_On_Propose_Administartive_Transfer_Page;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement Save_Btn;

	@FindBy(xpath = "//div[text()='Selected Holdings']")
	WebElement SelectedHoldingText;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement EDIT_Btn;

	@FindBy(xpath = "//*[@data-testid='comment']")
	WebElement Comments_Field;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Submit_Btn;

	@FindBy(xpath = "//button[contains(text(),'SUBMIT')]")
	WebElement CapSubmit;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	WebElement PrivSubmitButton;

	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement Confirm_Btn_On_Confirm_Transfer_Proposal_Popup;

	@FindBy(xpath = "//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained MuiFormHelperText-filled css-sf5fa6']")
	WebElement ErrorMessageOnCard;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")
	WebElement OTCNoMoreThan3DaysRadiobtn;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	WebElement ContinueBtn1;

	@FindBy(xpath = "//input[@name='entityReferenceCode']")
	WebElement EntityReferenceField;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement QuantityField;

	@FindBy(xpath = "//button[@aria-label='Choose date']")
	WebElement AgreegateDatePickerIcon;

	@FindBy(xpath = "(//*[@data-testid='CalendarIcon'])[2]")
	WebElement ExpectedTermination_DatePickerIcon;

	@FindBy(xpath = "//input[@placeholder='Select Currency']")
	WebElement CurrencyDropDown;

	@FindBy(xpath = "//*[@data-testid='Currency']")
	WebElement CurrencySelect;

	@FindBy(xpath = "//*[contains(text(),'Transferring compliance instruments to an Entity’s General Account is permanent.')]")
	WebElement WarningMsg;

	@FindBy(xpath = "//input[@name='pricePerInstrument']")
	WebElement PricePerInstrument;

	@FindBy(xpath = "//button[text()='CONFIRM']")
	WebElement Confirm_Button;

	@FindBy(xpath = "//p[text()='Pending Transfers']")
	WebElement PendingTransfers;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz'])[4]")
	WebElement Search1;

	@FindBy(xpath = "//div[text()='Entity Transfer ID']//following::p[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e']")
	WebElement EntityTransferIDInPendingTransfer;

	// Arvind Elements
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//..//*[contains(text(),'MANAGE TRANSFERS')]")
	WebElement manageJurisdictionTransferOption;

	@FindBy(xpath = "//*[@name='ij_approved_status_within_entity']")
	WebElement checkBoc_Icon;

	@FindBy(xpath = "//*[@name='ij_approved_status_within_entity']")
	WebElement allowTransfersFromApprovedStatusCheckBox1;

	@FindBy(xpath = "//*[@name='ij_proposed_status_within_entity']")
	WebElement allowTransfersProposedStatusUncheckedCheckBox1;

	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	WebElement StopAllFutureTransfer;

	@FindBy(xpath = "//input[@name='ij_stop_all_transfers_in_progress']")
	WebElement StopAllInProgressTransfer;

	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	WebElement UnCheckedStopAllFutureTransfer;

	@FindBy(xpath = "//button[@data-testid='submitBtn']//..//*[contains(text(),'MANAGE ALL TRANSFERS')]")
	WebElement ManageAllTransfers;

	@FindBy(xpath = "//*[contains(text(),'Cross-Jurisdictional Transfers with All Linked Jurisdictions')]")
	WebElement CrossAllLinkedJurisdictionTransfers;

	@FindBy(xpath = "//*[contains(text(),'Cross-Jurisdictional Transfers with All Linked Jurisdictions')]")
	List<WebElement> CrossAllLinkedJurisdictionTransfersList;

	@FindBy(xpath = "//button[@data-testid='submitBtn']//..//*[contains(text(),'SAVE')]")
	WebElement SubmitButton;
	@FindBy(xpath = "//*[text()='MANAGE ALL TRANSFERS']")
	private WebElement Manage_All_Transfers;

	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']//preceding::*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CalendarIcon')]")
	WebElement DateIconCross;

	@FindBy(xpath = "//*[contains(@data-testid,'CalendarIcon')]")
	WebElement DateIconSelected;

	@FindBy(xpath = "//*[contains(@data-testid,'CalendarIcon')]")
	List<WebElement> ListDateIconSelected;

	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']//following::*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CalendarIcon')]")
	WebElement DateIconInter;

	@FindBy(xpath = "//*[@aria-current='date']")
	WebElement CurrentDateTimeForCross;

	@FindBy(xpath = "//*[@aria-current='date']")
	WebElement CurrentDateTimeForInter;

	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	WebElement UnCheckedStopAllInProgressTransfer;

	@FindBy(xpath = "(//button[@data-testid='submitBtn'])[1]")
	private WebElement SubmitButton1Index;

	@FindBy(xpath = "(//button[@data-testid='submitBtn'])[2]")
	private WebElement SubmitButton2Index;

	@FindBy(xpath = "(//*[@class=\"MuiDataGrid-cellContent\"])[1]")
	private WebElement StoredJurisdiction;

	@FindBy(xpath = "//input[@type='search']")
	WebElement SearchJurisdiction;

	@FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
	private WebElement quickActionsOnHomePage;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	private WebElement quickActionsOnHomePage2;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8']//..//*[contains(text(),'MANAGE TRANSFERS')]")
	private WebElement ManageTransfer;

	@FindBy(xpath = "//input[@name='cj_stop_all_future_transfers']")
	WebElement CrossJurisdictionStopFutureTransfer;

	@FindBy(xpath = "//input[@name='cj_stop_all_transfers_in_progress']")
	WebElement CrossJurisdictionStopInProgressTransfer;

	@FindBy(xpath = "//input[@name='ij_stop_all_future_transfers']")
	WebElement InterJurisdictionStopFutureTransfer;

	@FindBy(xpath = "(//*[contains(text(),'Stop All Future Transfer')])[1]/preceding::*[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium Mui-checked MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-r2e3ql']")
	WebElement CheckedClassCrossJurisdictionStopFutureTransfer;

	@FindBy(xpath = "//*[contains(text(),'Inter-Jurisdictional Transfers')]/following::*[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium Mui-checked MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-r2e3ql']")
	WebElement CheckedClassInterJurisdictionStopFutureTransfer;

	@FindBy(xpath = "//input[@name='cj_stop_all_future_transfers']")
	WebElement UnCheckedCrossJurisdictionStopFutureTransfer;

	@FindBy(xpath = "//*[@name='cj_saved_status_administrative_transfer']")
	WebElement AllowAdminstrativeTransferFromSavedStatus;

	@FindBy(xpath = "//input[@name='cj_stop_all_transfers_in_progress']")
	WebElement CrossJurisdictionInProgressTransfer;

	@FindBy(xpath = "//input[@name='cj_stop_all_transfers_in_progress']")
	WebElement CrossJurisdictionAllFutureTransfer;

	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']//..//*[contains(@name,'ij_proposed_status_within_entity')]")
	WebElement Blanck;

	@FindBy(xpath = "(//*[@type='checkbox'])[2]")
	WebElement CheckedClassCrossJurisdictionStopProgressTransfer;

	String PageTitleName;
	Actions action = new Actions(driver.get());
	public static JavascriptExecutor js;
	commonLib CommonLibref = new commonLib();

	public CrossJurisdictionTransfer_Pom() {
		PageFactory.initElements(driver.get(), this);
	}

	public void navigate_To_JurisdictionAccounts() {
		wait.until(ExpectedConditions.visibilityOf(SearchEntities));
		CommonLibref.scroll(JurisdictionAccountsGrid, "scrollToElement", "JurisdictionAccountsGrid");
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionAccountsGrid));
		JurisdictionAccountsGrid.click();
		wait.until(ExpectedConditions.visibilityOf(AccountNumberText));
		System.out.println("Clicked on All Jurisdiction Accounts Accordion");
		ObjectRepo.test.log(Status.PASS, "Clicked on All Jurisdiction Accounts Accordion");
		Assert.assertTrue(AccountNumberText.isDisplayed());
		Assert.assertTrue(AccountTypeText.isDisplayed());
		wait.until(ExpectedConditions.visibilityOf(AccountStatusText));
		Assert.assertTrue(AccountStatusText.isDisplayed());
		ObjectRepo.test.log(Status.PASS, "Jurisdiction User is on Account Details Page.");
		SearchJurisdictionAcc.sendKeys("Issuance");
		wait.until(ExpectedConditions.elementToBeClickable(IssuanceAccounts));
		CommonLibref.click(IssuanceAccounts, "moveToElementClick", "IssuanceAccounts");
		wait.until(ExpectedConditions.visibilityOf(IssuancePageTitle));
		System.out.println(IssuancePageTitle.getText());
		ObjectRepo.test.log(Status.PASS,
				"The Jurisdiction Admin is navigated to the Jurisdiction Account page which has different cards & grids");
		System.out.println(
				"The Jurisdiction Admin is navigated to the Jurisdiction Account page which has different cards & grids");
	}

	public void save_Batch_Transfer_Functionality_Generic_Method() {
		ObjectRepo.test.log(Status.PASS,
				"Step: Click on More Action button and select 'Initiate Batch Transfers Option'");
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "moveToElementClick", "MoreActions");
		wait.until(ExpectedConditions.elementToBeClickable(Initiate_Batch_Transfer_Btn));
		ObjectRepo.test.log(Status.PASS, "Step: Select the Holdings which need to be Transferred.");
		CommonLibref.click(Initiate_Batch_Transfer_Btn, "moveToElementClick", "Initiate_Batch_Transfer_Btn");
		wait.until(ExpectedConditions.visibilityOf(BatchTransferRadioBtn));
		BatchTransferRadioBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
		Assert.assertTrue(ContinueBtn.isEnabled());
		ObjectRepo.test.log(Status.PASS, "The 'CONTINUE' button is enabled");
		ContinueBtn.click();
		wait.until(ExpectedConditions.visibilityOf(HoldingsPopUp));
		CommonLibref.click(CheckBox, "moveToElementClick", "CheckBox");
		Fetched_Vintage = VintageOnPopUp.getText();
		Fetched_Type = TypeOnPopUp.getText();
		Fetched_SubType = SubTypeOnPopUp.getText();
		Fetched_OffsetType = OffsetTypeOnPopUp.getText();
		Fetched_OffsetProjectID = OffsetProjectIdOnPopUp.getText();
		Fetched_SpecialCategory = SpecialCategoryOnPopUp.getText();
		wait.until(ExpectedConditions.visibilityOf(HoldingQuantityOnHoldingsPopup));
		Fetched_HoldingQuantity = HoldingQuantityOnHoldingsPopup.getText();
		String modifiedNum = Fetched_HoldingQuantity.replace(",", "");
		Fetched_Hodling_Quantity = Integer.parseInt(modifiedNum);
		System.out.println("Previous Holding Quantity:-" + Fetched_Hodling_Quantity);
		CommonLibref.click(Continue_Btn, "moveToElementClick", "Continue_Btn");
		wait.until(ExpectedConditions.elementToBeClickable(BatchNameField));
		ObjectRepo.test.log(Status.PASS, "Step: Enter the batch Name and Comment and then click on Save Button");
		BatchNameField.sendKeys("Cross Jurisdiction Batch Transfer");
		CommentField.sendKeys("Cross Jurisdiction Transfer");
		wait.until(ExpectedConditions.elementToBeClickable(SaveBtn));
		CommonLibref.click(SaveBtn, "moveToElementClick", "SaveBtn");
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Successmessage = SuccessMessage.getText();
		Assert.assertEquals(Successmessage, "The Batch Transfer has been saved successfully");
		CommonLibref.click(CloseIcon, "javascriptClick", "CloseIcon");
		wait.until(ExpectedConditions.visibilityOf(InitiateBatchTransferPage));
		String Text1 = InitiateBatchTransferPage.getText();
		Assert.assertEquals(Text1, "Batch Transfer");
		wait.until(ExpectedConditions.visibilityOf(TransferStatusOnSavedBatchTransferPage));
		String StatusText = TransferStatusOnSavedBatchTransferPage.getText();
		Assert.assertEquals(StatusText, "Saved");
		Assert.assertTrue(BatchIdOnProposedBatchTransferPage.isDisplayed());
		BatchID = BatchIdOnProposedBatchTransferPage.getText();
		System.out.println("Batch ID:- " + BatchID);
		ObjectRepo.test.log(Status.PASS, "The Batch " + BatchID + " is saved Successfully");
	}

	public void addReceivingAccountPopupOpen() {
		ObjectRepo.test.log(Status.PASS, "Click on Quick Action Button");
		CommonLibref.scroll(ThreeDotsMenuBtn, "scrollToBottomOFPage", "ThreeDotsMenuBtn");
		CommonLibref.click(ThreeDotsMenuBtn, "javascriptClick", "ThreeDotsMenuBtn");
		wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
		Assert.assertTrue(AddReceivingAccountBtn.isDisplayed());
		ObjectRepo.test.log(Status.PASS, "The 'ADD RECEIVING ACCOUNT' option is displayed.");
		AddReceivingAccountBtn.click();
		wait.until(ExpectedConditions.visibilityOf(ReceivingAccountInformationPopUp));
		String PopUpText = ReceivingAccountInformationPopUp.getText();
		Assert.assertEquals(PopUpText, "Receiving Account Information");
		ObjectRepo.test.log(Status.PASS, "Receiving Account Information is displayed.");
	}

	public void generic_AddToBatchMethod(String FilePath, String SheetName, int rowNum, int cellNum) {
		ObjectRepo.test.log(Status.PASS, "Add the Values on Receiving Account Information Card");
		System.out.println("Account Number Added to Batch Transfer: " + ActiveAccountNumber);
		AccountNumberField.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		System.out.println(AccountNumberField.getAttribute("value"));
		String Value2 = "4";
		ProposedQuantityField.sendKeys(Value2);
		Assert.assertTrue(AddToBatchBtn.isEnabled());
		CommonLibref.click(AddToBatchBtn, "javascriptClick", "AddToBatchBtn");
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String Successmessage = SuccessMessage.getText();
		Assert.assertEquals(Successmessage, "Receiving Account(s) Information has been added for the selected record");
		CommonLibref.click(CloseIcon, "javascriptClick", "CloseIcon");
		System.out.println(Successmessage);
		ObjectRepo.test.log(Status.PASS, "Batch Transfer Added to Batch Transfers Grid");
	}

	public void error_AddToBatchMethod(String FilePath, String SheetName, int rowNum, int cellNum) {
		ObjectRepo.test.log(Status.PASS, "Add the Values on Receiving Account Information Card");
		AccountNumberField.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		System.out.println(AccountNumberField.getAttribute("value"));
		String Value2 = "1";
		ProposedQuantityField.sendKeys(Value2);
		Assert.assertTrue(AddToBatchBtn.isEnabled());
		CommonLibref.click(AddToBatchBtn, "moveToElementClick", "AddToBatchBtn");
		System.out.println("Error Message is displayed.");
	//	String Error = (ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 2, 34));
		// String ErrorMessage = "["+Error +"]" + "is not found";
		// System.out.println(Error);
		System.out.println("Error Message is displayed on Card");
		System.out.println(ErrorMessageOnReceivingAccountInformationCard1.getText());
		// Assert.assertEquals(ErrorMessageOnReceivingAccountInformationCard1.getText(),
		// Error);
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed");
		CancelBtn.click();
	}

	public void navigate_To_Search_Entities() {
		System.out.println("Navigate to Entities Search Card");
		wait.until(ExpectedConditions.elementToBeClickable(SearchEntities));
		CommonLibref.click(SearchEntities, "javascriptClick", "SearchEntities");
		ObjectRepo.test.log(Status.PASS, "Navigate to Entities Search Card");
	}

	public void search_ActiveAccount() {
		navigate_To_Search_Entities();
		CommonLibref.pageLoader();
		Search.sendKeys("Active");
		Search.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(CaptureFirstEntityAccountNumber));
		System.out.println("Active Account Number: " + CaptureFirstEntityAccountNumber.getText());
		ActiveAccountNumber = CaptureFirstEntityAccountNumber.getText();
	}

	public void captureActiveAccountNumber() {
		SecondActiveAccountNumber = ActiveAccountNumber;
	}

	public void navigate_ActiveAccount() {
		navigate_To_Search_Entities();
		wait.until(ExpectedConditions.visibilityOf(CaptureFirstEntityAccountNumber));
		CaptureFirstEntityAccountNumber.click();
	}

	public void search_GeneralActiveAccount() {
		navigate_To_Search_Entities();
		Search.sendKeys("Active");
		wait.until(ExpectedConditions.visibilityOf(ClickOnFilters));
		ClickOnFilters.click();
		AddFilter.click();
		dropdown = new Select(Operator);
		dropdown.selectByVisibleText("is");
		FilterValue.sendKeys("General");
		wait.until(ExpectedConditions.visibilityOf(CaptureFirstEntityAccountNumber));
		System.out.println("Active Account Number: " + CaptureFirstEntityAccountNumber.getText());
		ActiveAccountNumber = CaptureFirstEntityAccountNumber.getText();
	}

	public void uncheckStopAllFutureTransfer() {
		CommonLibref.scroll(CrossJurisdictionStopFutureTransfer, "scrollToElement",
				"CrossJurisdictionStopFutureTransfer");
		action.moveToElement(CrossJurisdictionStopFutureTransfer).click().build().perform();
		if (ListDateIconSelected.size() != 0) {
			CrossJurisdictionStopFutureTransfer.click();
			System.out.println("Unchecked Stop All Transfer Future Cross Jurisdiction CheckBox. Selenium Click");
			ObjectRepo.test.log(Status.PASS, "Unchecked Stop All Transfer Future Cross Jurisdiction CheckBox.");
		} else {
			System.out.println("Unchecked Stop All Transfer Future Cross Jurisdiction CheckBox Action Click");
			ObjectRepo.test.log(Status.PASS, "Unchecked Stop All Transfer Future Cross Jurisdiction CheckBox");
		}
	}

	public void uncheckStopAllTransfer() {
		CommonLibref.scroll(CrossJurisdictionStopInProgressTransfer, "scrollToElement",
				"CrossJurisdictionStopInProgressTransfer");
		action.moveToElement(CrossJurisdictionStopInProgressTransfer).click().build().perform();
		boolean values = AllowAdminstrativeTransferFromSavedStatus.isSelected();
		if (!values) {
			CrossJurisdictionStopInProgressTransfer.click();
			System.out.println("Unchecked Stop All Transfer InProgress Cross Jurisdiction CheckBox. Selenium Click");
			ObjectRepo.test.log(Status.PASS, "Unchecked Stop All Transfer InProgress Cross Jurisdiction CheckBox.");
		} else {
			System.out.println(values);
			System.out.println("Unchecked Stop All Transfer InProgress Cross Jurisdiction CheckBox Action Click");
			ObjectRepo.test.log(Status.PASS, "Unchecked Stop All Transfer InProgress Cross Jurisdiction CheckBox");
		}
	}

	public void genric_ProposeBatchTransfer() {
		ObjectRepo.test.log(Status.PASS, "Step: Propose Batch Transfer");
		CommonLibref.scroll(SubmitBtn, "scrollToBottomOFPage", "SubmitBtn");
		action.moveToElement(SubmitBtn).click().build().perform();
		PasspharseEnter.click();
		action.moveToElement(PasspharseEnter).sendKeys("WciIncAdminPassphrase").build().perform();
		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		Assert.assertEquals(SuccessMessage.getText(), "Batch Transfer is successfully proposed");
		CommonLibref.click(CloseIcon, "javascriptClick", "CloseIcon");
		ObjectRepo.test.log(Status.PASS,
				"Success message should be displayed as 'Batch Transfer is successfully proposed'");
	}

	public void error_ProposeBatchTransfer() {
		ObjectRepo.test.log(Status.PASS, "Step: Propose Batch Transfer");
		CommonLibref.scroll(SubmitBtn, "scrollToBottomOFPage", "SubmitBtn");
		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		CommonLibref.click(SubmitBtn, "javascriptClick", "SubmitBtn");
		// action.moveToElement(SubmitBtn).click().build().perform();
		PasspharseEnter.click();
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		;
		// action.moveToElement(PasspharseEnter).sendKeys("WciIncAdminPassphrase").build().perform();
		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageWhenProposed));
		System.out.println(ErrorMessageWhenProposed.getText());
		// Assert.assertEquals(ErrorMessageWhenProposed.getText(), "[\"" +
		// ActiveAccountNumber + "\"] is not found .");
		CommonLibref.click(CloseIcon, "javascriptClick", "CloseIcon");
		ObjectRepo.test.log(Status.PASS,
				"Success message should be displayed as 'Batch Transfer is successfully proposed'");
	}

	public void generic_ApprovingBatchTransfer() {
		CommonLibref.scroll(CheckBox, "scrollToBottomOFPage", "CheckBox");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CheckBox.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBox, "moveToElementClick", "CheckBox");
		}
		CommonLibref.click(SubmitBtnForApprove, "moveToElementClick", "SubmitBtnForApprove");
		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
		String Title = Submit_Batch_Transfer_PopUp.getText();
		Assert.assertEquals(Title, "Confirm Batch Transfer Decision");
		PasspharseEnter.click();
		action.moveToElement(PasspharseEnter).sendKeys(prop.getProperty("WciIncAdminPassphrase")).build().perform();
		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		Assert.assertEquals(SuccessMessage.getText(), "The Approval for the Batch Transfer was successfully submitted");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
		ObjectRepo.test.log(Status.PASS,
				"The success message should be displayed as 'The batch transfer approval was submitted successfully'");
	}

	public void error_ApprovingBatchTransfer() {
		CommonLibref.scroll(CheckBox, "scrollToBottomOFPage", "CheckBox");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		CommonLibref.click(CheckBox, "moveToElementClick", "CheckBox");
		CommonLibref.click(SubmitBtnForApprove, "moveToElementClick", "SubmitBtnForApprove");
		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
		String Title = Submit_Batch_Transfer_PopUp.getText();
		Assert.assertEquals(Title, "Confirm Batch Transfer Decision");
		PasspharseEnter.click();
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(ErrorMessageWhenProposed1));
		System.out.println(ErrorMessageWhenProposed2.getText());
		System.out.println(ErrorMessageWhenProposed1.getText());
		// Assert.assertEquals(ErrorMessageWhenProposed1.getText(), "[\"" +
		// ActiveAccountNumber + "\"] is not found .");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
		ObjectRepo.test.log(Status.PASS, ErrorMessageWhenProposed1.getText());
	}

	public void addToBatchBatchTransfer() {
		navigate_To_JurisdictionAccounts();
		save_Batch_Transfer_Functionality_Generic_Method();
		wait.until(ExpectedConditions.visibilityOf(AddReceivingAccountBtn));
		addReceivingAccountPopupOpen();
		// generic_AddToBatchMethod();
	}

	public void expandAllJurisdictionsOnHomePage() {
		wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		ClickDropdownHomePage.click();
		ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
		System.out.println("Click on All Jurisdictions");
		ObjectRepo.test.log(Status.PASS, "Accordian is expanded.");
	}

	public void navigate_To_Home() {
		CommonLibref.scroll(Home, "scrollToTopOFPage", "Scroll to Top");
		wait.until(ExpectedConditions.elementToBeClickable(Home));
		action.moveToElement(Home).click().build().perform();
		ObjectRepo.test.log(Status.PASS, "User is navigated to Home Page");
	}

	public String searchJurisdiction(String Jurisdiction) {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(Jurisdiction);
		System.out.println("Enter Jurisdiction Name = " + Jurisdiction);
		return Jurisdiction;
	}

	public void checkStopAllFutureCheckBoxIsSelectedOrNotForCross() {
		try {
			WebElement element = CheckedClassCrossJurisdictionStopFutureTransfer;
			boolean isDisplayed = element.isDisplayed();
			System.out.println("Stop All Cross Jurisdiction Future Transfers CheckBox is checked: " + isDisplayed);

			action.moveToElement(CrossJurisdictionStopFutureTransfer).click().build().perform();
			System.out.println("Unchecked the CheckBox");
			System.out.println("Current state: " + CrossJurisdictionStopFutureTransfer.isSelected());

			submit();
			waitForElementToBeClickable(ManageAllTransfers);
			clickonManageAllTransfers();
			System.out.println("Clicked on Manage All Transfers");
		} catch (Exception e) {
			System.out
					.println("Stop All Cross Jurisdiction Future Transfers CheckBox is not checked: " + e.getMessage());
		}
	}

	public void checkStopAllFutureCheckBoxIsSelectedOrNotForInter() {
		try {
			WebElement element = CheckedClassInterJurisdictionStopFutureTransfer;
			boolean isDisplayed = element.isDisplayed();
			System.out.println("Stop All Inter Jurisdiction Future Transfers CheckBox is checked: " + isDisplayed);

			action.moveToElement(InterJurisdictionStopFutureTransfer).click().build().perform();
			System.out.println("Unchecked the CheckBox");
			System.out.println("Current state: " + InterJurisdictionStopFutureTransfer.isSelected());

			submit();
			waitForElementToBeClickable(ManageAllTransfers);
			clickonManageAllTransfers();
			System.out.println("Clicked on Manage All Transfers");
		} catch (Exception e) {
			System.out
					.println("Stop All Inter Jurisdiction Future Transfers CheckBox is not checked: " + e.getMessage());
		}
	}

	public void checkStopAllProgresCheckBoxIsSelectedOrNotForCross() {
		try {
			WebElement element = CheckedClassCrossJurisdictionStopProgressTransfer;
			boolean isSelected = element.isSelected();
			System.out.println("Stop All Cross Jurisdiction InProgress Transfers CheckBox is Checked: " + isSelected);

			action.moveToElement(CrossJurisdictionInProgressTransfer).click().build().perform();
			System.out.println("Unchecked the CheckBox");
			System.out.println("Current state: " + CrossJurisdictionInProgressTransfer.isSelected());

			submit();
			waitForElementToBeClickable(ManageAllTransfers);
			clickonManageAllTransfers();
			System.out.println("Clicked on Manage All Transfers");
		} catch (Exception e) {
			System.out.println(
					"Stop All Cross Jurisdiction InProgress Transfers CheckBox is not checked: " + e.getMessage());
		}
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

	public void clickStopAllFutureCheckBoxForCross() {
		CommonLibref.pageLoader();
		CommonLibref.scroll(CrossJurisdictionStopFutureTransfer, "scrollToElement",
				"CrossJurisdictionStopFutureTransfer");
		try {
			CommonLibref.click(CrossJurisdictionStopFutureTransfer, "javascriptClick", "Current_Date");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(CrossJurisdictionStopFutureTransfer).click(CrossJurisdictionStopFutureTransfer).build().perform();
			e.printStackTrace();
		}
	}

	public void clickStopAllInProgressCheckBoxForCross() {
		try {
			action.moveToElement(CrossJurisdictionStopInProgressTransfer).click().build().perform();
			System.out.println("Clicked on Cross CheckBox");
		} catch (Exception e) {
			System.out.println("Failed to click on Cross CheckBox: " + e.getMessage());
		}
	}

	public void clickStopAllFutureCheckBoxForInter() {
		try {
			action.moveToElement(InterJurisdictionStopFutureTransfer).click().build().perform();
			System.out.println("Clicked on Inter CheckBox");
		} catch (Exception e) {
			System.out.println("Failed to click on Inter CheckBox: " + e.getMessage());
		}
	}

	public void captureCrossDateandTime() {
		try {
			System.out.println("Cross Date: " + CaptureCrossDate.getAttribute("value"));
			System.out.println("Cross Time: " + CaptureCrossTime.getAttribute("value"));
			CaptureCrossSelectedDate = CaptureCrossDate.getAttribute("value");
			CaptureCrossSelectedTime = CaptureCrossTime.getAttribute("value");
		} catch (Exception e) {
			System.out.println("Failed to capture Cross Date and Time: " + e.getMessage());
		}
	}

	public void captureInterDateandTime() {
		try {
			System.out.println("Inter Date: " + CaptureInterDate.getAttribute("value"));
			System.out.println("Inter Time: " + CaptureInterTime.getAttribute("value"));
			CaptureInterSelectedDate = CaptureInterDate.getAttribute("value");
			CaptureInterSelectedTime = CaptureInterTime.getAttribute("value");
		} catch (Exception e) {
			System.out.println("Failed to capture Inter Date and Time: " + e.getMessage());
		}
	}

	public void submit() {
		CommonLibref.scroll(SubmitButton2Index, "scrollToBottomOFPage", "Submit Button");
		try {
			action.moveToElement(SubmitButton2Index).click().build().perform();
			action.moveToElement(AddToBatchBtn).click().build().perform();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
			System.out.println(SuccessMessage.getText());
			action.moveToElement(SuccessMessageCloseButton).click().build().perform();
		} catch (Exception e) {
			System.out.println("Failed to submit: " + e.getMessage());
		}
	}

	public void verifyDateandTimeCross() {
		verifyDateAndTime(CaptureCrossSelectedDate, CaptureCrossSelectedTime, CaptureCrossDateandTime);
	}

	public void verifyDateandTimeSelect() {
		verifyDateAndTime(CaptureCrossSelectedDate, CaptureCrossSelectedTime, CaptureSelectDateandTime);
	}

	public void verifyDateandTimeInter() {
		verifyDateAndTime(CaptureInterSelectedDate, CaptureInterSelectedTime, CaptureInterDateandTime);
	}

	private void verifyDateAndTime(String selectedDate, String selectedTime, WebElement actualDateElement) {
		String expectedDateStr = selectedDate + " " + selectedTime;
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a");
		SimpleDateFormat expectedDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm a");

		try {
			Date expectedDate = expectedDateFormat.parse(expectedDateStr);
			SimpleDateFormat actualDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String formattedDate = actualDateFormat.format(expectedDate) + " ET";

			System.out.println("Expected Date = " + formattedDate);
			String actualDateStr = actualDateElement.getText();
			System.out.println("Actual Date Displayed: " + actualDateStr);

			Assert.assertEquals(actualDateStr, formattedDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void manageTransferForSelectFirstJurisdiction() {
		
		manageTransfer(quickActionsOnHomePage, "First");
	}

	public void manageTransferForSelectSecondJurisdiction(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		Search.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CommonLibref.click(quickActionsOnHomePage2, "seleniumClick", "quickActionsOnHomePage2");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActionsOnHomePage2).click(quickActionsOnHomePage2).build().perform();
			e.printStackTrace();
		}
	//	ManageTransfer.click();
		CommonLibref.click(ManageTransfer, "seleniumClick", "ManageTransfer");
		
		//manageTransfer(quickActionsOnHomePage2, "Second");
	}

	private void manageTransfer(WebElement quickActionElement, String jurisdiction) {
		CommonLibref.scroll(quickActionElement, "scrollToElement",
				"Quick Action for " + jurisdiction + " Jurisdiction");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(quickActionElement));
			js.executeScript("arguments[0].click();", quickActionElement);
			wait.until(ExpectedConditions.visibilityOf(ManageTransfer));
			ManageTransfer.click();
		} catch (Exception e) {
			System.out.println("Failed to manage transfer for " + jurisdiction + " Jurisdiction: " + e.getMessage());
		}
	}

	public void searchSavedBatchOnBatchTransfersPage_ProposedTransfer(String FilePath, String SheetName, int rowNum,
			int cellNum) {

		ObjectRepo.test.log(Status.PASS, "Search on the Batch Transfers page");
		action.moveToElement(Search);
		Search.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		waitForElementToBeClickable(FirstBatchIDonBatchTransfersPage);
		action.moveToElement(FirstBatchIDonBatchTransfersPage).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
		System.out.println(BatchIDOnTransferDatailsCard.getText());

	}

	private void waitForElementToBeClickable(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException e) {
			System.out.println("Element not clickable: " + e.getMessage());
		}
	}

	public void searchSavedBatchOnBatchTransfersPage_CapturedID(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		ObjectRepo.test.log(Status.PASS, "Search on the Batch Transfers page");
		action.moveToElement(Search);
		Search.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//		Search.sendKeys("2788");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(FirstBatchIDonBatchTransfersPage).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
		ObjectRepo.test.log(Status.PASS, "Navigated to the Batch Transfers Page (" + BatchID1st + ")");
//		ObjectRepo.test.log(Status.PASS, "Navigated to the Batch Transfers Page");
	}

	public void capturing1stBatchID() {
		BatchID1st = BatchID;
	}

	public void capturing2ndBatchID() {
		BatchID2nd = BatchID;
	}

	public void moveToBatchTransfersPage() {
		CommonLibref.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Click on Mega Menu");
		CommonLibref.scroll(MoreActionsButton, "scrollToTopOFPage", "MoreActionsButton");
		System.out.println("Click on Mega Menu");
		
		
		try {
			CommonLibref.click(MegaMenu, "javascriptClick", "MegaMenu");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(MegaMenu).click(MegaMenu).build().perform();

			e.printStackTrace();
		}
//		MegaMenu.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Assert.assertEquals(BatchTransfersOnMegaMenu.getText(), "Batch Transfers");
//		ObjectRepo.test.log(Status.PASS, "Mega Menu should be displayed with the option to click on Batch Transfer under 'Jurisdiction Management'.");
		ObjectRepo.test.log(Status.PASS, "Click on 'Batch Transfers' option");
		try {
			CommonLibref.click(BatchTransfersOnMegaMenu, "javascriptClick", "BatchTransfersOnMegaMenu");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(BatchTransfersOnMegaMenu).click(BatchTransfersOnMegaMenu).build().perform();

			e.printStackTrace();
		}
//		action.moveToElement(BatchTransfersOnMegaMenu).click().build().perform();
		System.out.println("Clicked on Batch Transfers");
		CommonLibref.pageLoader();
		System.out.println("User in Batch Transfers page");
		wait.until(ExpectedConditions.visibilityOf(FirstBatchIDonBatchTransfersPage));
		PageTitleName = Batch_Transfer.getText();
		System.out.println(PageTitleName);
		Assert.assertEquals(PageTitleName, "Batch Transfers");
		ObjectRepo.test.log(Status.PASS,
				"The 'Batch Transfer' should be Accessible and Jurisdiction User should be navigated to 'Batch Transfers' Page.");
	}

	// Arvind Code
	public void clickonManageAllTransfers() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(SubmitButton1Index, "javascriptClick", "ManageAllTransfers");
//		ManageAllTransfers.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage All Transfers option");
		System.out.println("Select Manage All Transfers option");
		wait.until(ExpectedConditions.visibilityOf(CrossAllLinkedJurisdictionTransfers));
		System.out.println(CrossAllLinkedJurisdictionTransfers.getText());

	}

	public void selectManageJurisdictionTransferOptionFromQuickActions() {
		wait.until(ExpectedConditions.elementToBeClickable(manageJurisdictionTransferOption));
		manageJurisdictionTransferOption.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
		System.out.println("Select Manage Jurisdiction Status");
	}

	public void selectCheckBoxStopAllFutureTransfer() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void currentDateForCross() {
		wait.until(ExpectedConditions.elementToBeClickable(DateIconCross));
		CommonLibref.scroll(DateIconCross, "scrollToElement", "DateIconCross");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(DateIconCross, "seleniumClick", "DateIconCross");
//		action.moveToElement(DateIconCross).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDateTimeForCross));
		CurrentDateTimeForCross.click();
	}

	public void currentDateForSelect() {
		wait.until(ExpectedConditions.elementToBeClickable(DateIconSelected));
		CommonLibref.scroll(DateIconSelected, "scrollToElement", "DateIconSelected");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.click(DateIconSelected, "seleniumClick", "DateIconSelected");
//		action.moveToElement(DateIconCross).click().build().perform();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CurrentDateTimeForCross));
		} catch (Exception e) {

		}
		CurrentDateTimeForCross.click();
	}

	public void currentDateForInter() {
		// wait.until(ExpectedConditions.elementToBeClickable(DateIcon));
		DateIconInter.click();
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDateTimeForInter));
		CurrentDateTimeForInter.click();
	}

	public void selectCheckBoxStopAllInProgressTransfer() {
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

	public void selectCheckBoxForAllowTransfersFromProposedStatus() throws InterruptedException {
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

	public void selectCheckBoxForAllowTransfersFromApprovedStatus() throws InterruptedException {
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

	public void clickOnContinueButton2Index() {
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
		wait.until(ExpectedConditions.elementToBeClickable(AddToBatchBtn));
		AddToBatchBtn.click();
	}

	public void searchSelectedJurisdiction() {
		String Jurisdiction = StoredJurisdiction.getText();
		System.out.println(Jurisdiction);
		wait.until(ExpectedConditions.elementToBeClickable(SearchJurisdiction));
		CommonLibref.click(SearchJurisdiction, "seleniumClick", "SearchJurisdiction");
		SearchJurisdiction.sendKeys(Jurisdiction);
	}

	public void clickOnQuickActionsThreeDot() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
		try {
			System.out.println("Try Javascriptclick");
			wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
			js.executeScript("arguments[0].click();", quickActionsOnHomePage);
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		} catch (NoSuchElementException e) {
			System.out.println("JS Click failed try Selenium Click");
			CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		} catch (Exception e) {
			System.out.println("Selenium CLick Failed try Move to Element Click");
			CommonLibref.click(quickActionsOnHomePage, "moveToElementClick", "quickActionsOnHomePage");
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectRepo.test.log(Status.PASS, "Step :Click On Quick Actions option ");
		System.out.println("Step :Click OnQuick Actions option ");
		wait.until(ExpectedConditions.elementToBeClickable(ManageTransfer));
		ManageTransfer.click();
	}

	public void crossJurisdictionStopAllFutureTransfer() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,1000)", SubmitButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void crossJurisdictionStopAllInProgressTransfer() {
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

	public void crossJurisdictionWithAllStopAllFutureTransfer() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,350)", SubmitButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void unCheckBoxForAllowTransfersFromProposedStatus() {
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.scrollBy(0,1000)", SubmitButton);
		ExpectedConditions.elementToBeClickable(allowTransfersProposedStatusUncheckedCheckBox1);
		// String checkBox = Blanck.getAttribute("data-testid");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	// Administrative Transfer
	public void save_Administrative_Transfer_Functionality(String FilePath, String SheetName, int rowNum, int cellNum) {
		CommonLibref.pageLoader();
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		wait.until(ExpectedConditions.elementToBeClickable(Initiate_Administrative_Transfer_Btn));
		try {
			CommonLibref.click(Initiate_Administrative_Transfer_Btn, "javascriptClick",
					"Initiate_Administrative_Transfer_Btn");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Initiate_Administrative_Transfer_Btn).click(Initiate_Administrative_Transfer_Btn)
					.build().perform();
		}
		try {
			CommonLibref.click(CheckBox, "javascriptClick",
					"CheckBox");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(CheckBox).click(CheckBox).build().perform();
			e.printStackTrace();
		}
		CommonLibref.scroll(Save_Btn, "scrollToBottomOFPage", "Save_Btn");
		CommonLibref.pageLoader();
		Receiving_Account_Number_Field
				.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//			Receiving_Account_Number_Field.sendKeys("QO07472-4337");
		wait.until(ExpectedConditions.visibilityOf(Save_Btn));
		wait.until(ExpectedConditions.elementToBeClickable(Save_Btn));
		try {
			Save_Btn.click();
		} catch (Exception e) {
			CommonLibref.click(Save_Btn, "moveToElementClick", "Save_Btn");
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		CommonLibref.click(CloseIcon, "javascriptClick", "CloseIcon");
//			action.moveToElement(CloseIcon).click().build().perform();
		String Propose_Administrative_Transfer_Page = Administrative_Transfer.getText();
		System.out.println(Propose_Administrative_Transfer_Page);
//			Assert.assertEquals(Propose_Administrative_Transfer_Page, "Administrative Transfer");
		wait.until(ExpectedConditions.visibilityOf(Administrative_Transfer_Status));
		String Statuses = Administrative_Transfer_Status.getText();
		System.out.println(Statuses);
//			Assert.assertEquals(Statuses, "Saved");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid details in all fields and Click on Save button");
		ObjectRepo.test.log(Status.PASS,
				"Entered information is saved and user is navigated to the Proposed Administrative Transfer screen.");
		Cluster_ID = Cluster_ID_On_Propose_Administartive_Transfer_Page.getText();
		System.out.println(Cluster_ID);
	}
	public void save_Administrative_Transfer_Functionality_for_Selected_Jurisdiction(String FilePath, String SheetName, int rowNum, int cellNum) {
		CommonLibref.pageLoader();
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		wait.until(ExpectedConditions.elementToBeClickable(Initiate_Administrative_Transfer_Btn));
		try {
			CommonLibref.click(Initiate_Administrative_Transfer_Btn, "javascriptClick",
					"Initiate_Administrative_Transfer_Btn");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Initiate_Administrative_Transfer_Btn).click(Initiate_Administrative_Transfer_Btn)
					.build().perform();
		}
		CheckBox.click();
		CommonLibref.scroll(Save_Btn, "scrollToBottomOFPage", "Save_Btn");
		CommonLibref.pageLoader();
		Receiving_Account_Number_Field
				.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//			Receiving_Account_Number_Field.sendKeys("QO07472-4337");
		wait.until(ExpectedConditions.visibilityOf(Save_Btn));
		wait.until(ExpectedConditions.elementToBeClickable(Save_Btn));
		try {
			Save_Btn.click();
		} catch (Exception e) {
			CommonLibref.click(Save_Btn, "moveToElementClick", "Save_Btn");
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		CommonLibref.click(CloseIcon, "javascriptClick", "CloseIcon");
//			action.moveToElement(CloseIcon).click().build().perform();
		String Propose_Administrative_Transfer_Page = Administrative_Transfer.getText();
		System.out.println(Propose_Administrative_Transfer_Page);
//			Assert.assertEquals(Propose_Administrative_Transfer_Page, "Administrative Transfer");
		wait.until(ExpectedConditions.visibilityOf(Administrative_Transfer_Status));
		String Statuses = Administrative_Transfer_Status.getText();
		System.out.println(Statuses);
//			Assert.assertEquals(Statuses, "Saved");
		ObjectRepo.test.log(Status.PASS, "Step: Enter valid details in all fields and Click on Save button");
		ObjectRepo.test.log(Status.PASS,
				"Entered information is saved and user is navigated to the Proposed Administrative Transfer screen.");
		Cluster_ID = Cluster_ID_On_Propose_Administartive_Transfer_Page.getText();
		System.out.println(Cluster_ID);
	}
	String ProposedClusterID;

	public void captureProposedClusterID() {
		ProposedClusterID = Cluster_ID;
		System.out.println("Proposed Cluster ID: " + ProposedClusterID);
	}

	String SavedClusterID;

	public void captureSavedClusterID() {
		SavedClusterID = Cluster_ID;
		System.out.println("Proposed Cluster ID: " + SavedClusterID);
	}

	public void propose_Administrative_Transfer_Generic_Method() {
		wait.until(ExpectedConditions.visibilityOf(SelectedHoldingText));
		wait.until(ExpectedConditions.elementToBeClickable(EDIT_Btn));
		EDIT_Btn.click();
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		CommonLibref.click(AccountNumberField, "moveToElementClick", "AccountNumberField");
//			js.executeScript("arguments[0].value = '';", Proposed_Quantity_Field);
		AccountNumberField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		AccountNumberField.sendKeys("1");
		ProposedQuanity = AccountNumberField.getAttribute("value");
		System.out.println(ProposedQuanity);
		Comments_Field.sendKeys("Test Comment");
		wait.until(ExpectedConditions.elementToBeClickable(Save_Btn));
		CommonLibref.click(Save_Btn, "moveToElementClick", "Save_Btn");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
		CommonLibref.scroll(Submit_Btn, "scrollToBottomOFPage", "Submit_Btn");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Submit_Btn));
			CommonLibref.click(Submit_Btn, "javascriptClick", "Submit_Btn");
			wait.until(ExpectedConditions.visibilityOf(PasspharseEnter));
			PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
			wait.until(ExpectedConditions.elementToBeClickable(Confirm_Btn_On_Confirm_Transfer_Proposal_Popup));
			Confirm_Btn_On_Confirm_Transfer_Proposal_Popup.click();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception ex) {
			System.out.println("Error Message is displayed");
//				wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
//				action.moveToElement(CloseIcon).click().build().perform();
//				wait.until(ExpectedConditions.elementToBeClickable(Submit_Btn));
			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");
//				wait.until(ExpectedConditions.visibilityOf(PasspharseEnter));
			PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
//				wait.until(ExpectedConditions.elementToBeClickable(Confirm_Btn_On_Confirm_Transfer_Proposal_Popup));
			Confirm_Btn_On_Confirm_Transfer_Proposal_Popup.click();
//				wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();

	}

	public void editAdministrativeTransferHoldings() {
		wait.until(ExpectedConditions.visibilityOf(SelectedHoldingText));
		wait.until(ExpectedConditions.elementToBeClickable(EDIT_Btn));
		EDIT_Btn.click();
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		CommonLibref.click(AccountNumberField, "moveToElementClick", "AccountNumberField");
//		js.executeScript("arguments[0].value = '';", Proposed_Quantity_Field);
		AccountNumberField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		AccountNumberField.sendKeys("1");
		ProposedQuanity = AccountNumberField.getAttribute("value");
		System.out.println(ProposedQuanity);
		Comments_Field.sendKeys("Test Comment");
		wait.until(ExpectedConditions.elementToBeClickable(Save_Btn));
		CommonLibref.click(Save_Btn, "moveToElementClick", "Save_Btn");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
	}

	public void save_Administrative_Transfer_Functionality_Error(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		wait.until(ExpectedConditions.elementToBeClickable(Initiate_Administrative_Transfer_Btn));
		try {
			CommonLibref.click(Initiate_Administrative_Transfer_Btn, "javascriptClick",
					"Initiate_Administrative_Transfer_Btn");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Initiate_Administrative_Transfer_Btn).click(Initiate_Administrative_Transfer_Btn)
					.build().perform();
		}
		CheckBox.click();
		CommonLibref.scroll(Save_Btn, "scrollToBottomOFPage", "Save_Btn");
		CommonLibref.pageLoader();
		Receiving_Account_Number_Field
				.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//			Receiving_Account_Number_Field.sendKeys("QO07472-4337");
		System.out.println("Enter Cross Jurisdiction Account Number");
		try {
			System.out.println("Clicked on Save Button");
			wait.until(ExpectedConditions.elementToBeClickable(Save_Btn));
			CommonLibref.click(Save_Btn, "moveToElementClick", "Save_Btn");
			wait.until(ExpectedConditions.visibilityOf(ErrorMessageOnCard));
			String ErrorMessage = ErrorMessageOnCard.getText();
			System.out.println(ErrorMessage);
			assertEquals(ErrorMessage,
					"The transfer cannot be initiated as the receiving account is not found. Please contact the WCI, Inc. Admin for more information.");

		} catch (Exception e) {
			System.out.println("Error Message is displayed");
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			action.moveToElement(CloseIcon).click().build().perform();
//				wait.until(ExpectedConditions.elementToBeClickable(Save_Btn));
			CommonLibref.click(Save_Btn, "moveToElementClick", "Save_Btn");
			String ErrorMessage = ErrorMessageOnCard.getText();
			System.out.println(ErrorMessage);
//			assertEquals(ErrorMessage,
//					"The transfer cannot be initiated as the receiving account is not found. Please contact the WCI, Inc. Admin for more information.");
		}
	}

	public void moveToAdministrativeTransfersPage() {
		CommonLibref.pageLoader();
		ObjectRepo.test.log(Status.PASS, "Click on Mega Menu");
		CommonLibref.scroll(MoreActionsButton, "scrollToTopOFPage", "MoreActionsButton");
		System.out.println("Click on Mega Menu");
		try {
			CommonLibref.click(MegaMenu, "javascriptClick", "MegaMenu");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(MegaMenu).click(MegaMenu).build().perform();
			e.printStackTrace();
		}
//			MegaMenu.click();
		CommonLibref.pageLoader();
//			Assert.assertEquals(BatchTransfersOnMegaMenu.getText(), "Batch Transfers");
//			ObjectRepo.test.log(Status.PASS, "Mega Menu should be displayed with the option to click on Batch Transfer under 'Jurisdiction Management'.");
		ObjectRepo.test.log(Status.PASS, "Click on 'Batch Transfers' option");
		CommonLibref.click(AdminstrativeTransfersOnMegaMenu, "javascriptClick", "AdminstrativeTransfersOnMegaMenu");
//			action.moveToElement(BatchTransfersOnMegaMenu).click().build().perform();
		System.out.println("Clicked on Administrative Transfers");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User in Administrative Transfers page");
		wait.until(ExpectedConditions.visibilityOf(FirstAdministraitveIDonBatchTransfersPage));
		PageTitleName = Batch_Transfer.getText();
		System.out.println(PageTitleName);
		Assert.assertEquals(PageTitleName.contains("Administrative"), true);
		ObjectRepo.test.log(Status.PASS,
				"The 'Batch Transfer' should be Accessible and Jurisdiction User should be navigated to 'Batch Transfers' Page.");
	}

	public void searchSavedAdministrativeTransfer(String FilePath, String SheetName, int rowNum, int cellNum) {
		ObjectRepo.test.log(Status.PASS, "Search on the Batch Transfers page");
		action.moveToElement(Search);
		Search.sendKeys(ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionsInformation", 2, 30));
//			Search.sendKeys("1989");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(FirstAdministraitveIDonBatchTransfersPage).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
//			ObjectRepo.test.log(Status.PASS, "Navigated to the Administrative Transfers Page ("+SavedClusterID+")");
		ObjectRepo.test.log(Status.PASS, "Navigated to the Administrative Transfers Page");
	}

	public void searchProposedAdministratAdministrativeiveOnBatchTransfersPage_CapturedID(String FilePath,
			String SheetName, int rowNum, int cellNum) {
		ObjectRepo.test.log(Status.PASS, "Search on the Batch Transfers page");
		action.moveToElement(Search);
		Search.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
//			Search.sendKeys("1988");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(FirstAdministraitveIDonBatchTransfersPage).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
//			ObjectRepo.test.log(Status.PASS, "Navigated to the Administrative Transfers Page ("+SavedClusterID+")");
		ObjectRepo.test.log(Status.PASS, "Navigated to the Administrative Transfers Page");
	}

	public void propose_Administrative_Transfer_Error_Method(String FilePath, String SheetName, int rowNum,
			int cellNum) {
		CommonLibref.pageLoader();
		action.moveToElement(Search);
		Search.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		action.moveToElement(FirstAdministraitveIDonBatchTransfersPage).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Batch_Transfer));
		CommonLibref.scroll(Submit_Btn, "scrollToBottomOFPage", "Submit_Btn");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Submit_Btn));
			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");
			wait.until(ExpectedConditions.visibilityOf(PasspharseEnter));
			PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
			wait.until(ExpectedConditions.elementToBeClickable(Confirm_Btn_On_Confirm_Transfer_Proposal_Popup));
			Confirm_Btn_On_Confirm_Transfer_Proposal_Popup.click();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception e) {
			System.out.println("Error Message is displayed");
//				wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
//				action.moveToElement(CloseIcon).click().build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(Submit_Btn));
			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");
			wait.until(ExpectedConditions.visibilityOf(PasspharseEnter));
			PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
			wait.until(ExpectedConditions.elementToBeClickable(Confirm_Btn_On_Confirm_Transfer_Proposal_Popup));
			Confirm_Btn_On_Confirm_Transfer_Proposal_Popup.click();
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		}
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();

	}

	public void error_ApprovingAdministrativeTransfer() {
//			js.executeScript("window.scrollBy(0,3000)", "");
		CommonLibref.scroll(CheckBox, "scrollToBottomOFPage", "CheckBox");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CommonLibref.click(CheckBox, "javascriptClick", "CheckBox");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(CheckBox).click(CheckBox).build().perform();
			e.printStackTrace();
		}
		CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");
		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
		String Title = Submit_Batch_Transfer_PopUp.getText();
		Assert.assertEquals(Title.contains("Submit Administrative Transfer"), true);
		PasspharseEnter.click();
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
//		Assert.assertEquals(SuccessMessage.getText(),
//				"The transfer cannot be Approved as the receiving account is not found. Please contact the WCI, Inc. Admin for more information.");
		ObjectRepo.test.log(Status.PASS, "The error message is displayed as '" + SuccessMessage.getText() + "'");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
	}

	public void generic_ApprovingAdministrativeTransfer() {

		CommonLibref.scroll(CheckBox, "scrollToBottomOFPage", "CheckBox");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CheckBox.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBox, "moveToElementClick", "CheckBox");
		}
		CommonLibref.click(SubmitBtnForApprove, "moveToElementClick", "SubmitBtnForApprove");
		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
		String Title = Submit_Batch_Transfer_PopUp.getText();
		// Assert.assertEquals(Title, "Confirm Batch Transfer Decision");
		PasspharseEnter.click();
		action.moveToElement(PasspharseEnter).sendKeys(prop.getProperty("WciIncAdminPassphrase")).build().perform();
		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, SuccessMessage.getText());
		// Assert.assertEquals(SuccessMessage.getText(), "The Approval for the Batch
		// Transfer was successfully submitted");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();

//		CommonLibref.click(SubmitBtnForApprove, "moveToElementClick", "SubmitBtnForApprove");
////		js.executeScript("window.scrollBy(0,3000)", "");
//		wait.until(ExpectedConditions.visibilityOf(Submit_Batch_Transfer_PopUp));
//		String Title = Submit_Batch_Transfer_PopUp.getText();
//		Assert.assertEquals(Title.contains("Submit Administrative Transfer"), true);
//		PasspharseEnter.click();
//		action.moveToElement(PasspharseEnter).sendKeys("WciIncAdminPassphrase").build().perform();
//		action.moveToElement(SubmitButtonOnConfirmationPop).click().build().perform();
//		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
//		System.out.println(SuccessMessage.getText());
//		Assert.assertEquals(SuccessMessage.getText(), "Administrative Transfer has been successfully approved");
//		ObjectRepo.test.log(Status.PASS, "The Success message is displayed as '" + SuccessMessage.getText() + "'");
//		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
//		action.moveToElement(CloseIcon).click().build().perform();

	}

	// General Transfer
	public void navigateToGenralAccountPageFunctionality() {
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		} catch (Exception e) {
			e.printStackTrace();
		}
//			wait.until(ExpectedConditions.elementToBeClickable(MyAccount));
		try {
			ClickDropdownHomePage.click();
			wait.until(ExpectedConditions.elementToBeClickable(CaptureFirstEntityAccountNumber));
		} catch (Exception e) {
			CommonLibref.click(ClickDropdownHomePage, "moveToElementClick", "ClickDropdownHomePage");
			Search.click();
		}

//			 CommonLibref.click(ExpandMyAccount, "seleniumClick", "ExpandMyAccount");
//			MyAccount.click();
		Search.sendKeys(TransferingGeneralAccountNo);
//			Search.sendKeys("T912290-9002");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(CaptureFirstEntityAccountNumber));
		wait.until(ExpectedConditions.elementToBeClickable(CaptureFirstEntityAccountNumber));
		action.moveToElement(CaptureFirstEntityAccountNumber).click().build().perform();
//			AccountNumber.click();
		ObjectRepo.test.log(Status.PASS, " AR is logged in and is on Home Page.");
	}

	Select select;
	String GeneralEntityRefrenceNumber;

	public void captureGeneralAccount() {
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		} catch (Exception e) {
			e.printStackTrace();
		}
//			wait.until(ExpectedConditions.elementToBeClickable(MyAccount));
		ClickDropdownHomePage.click();
		ClickOnFilters.click();
		System.out.println("Clicked on Filter");
		try {
			wait.until(ExpectedConditions.visibilityOf(FirstColumn));
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Select First Column");
		select = new Select(FirstColumn);
		try {
			select.selectByVisibleText("Entity Account Type");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Select Third Column");
		wait.until(ExpectedConditions.elementToBeClickable(ValueDropdown));
		select = new Select(ValueDropdown);
		select.selectByVisibleText("General");
//			Search.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(CaptureFirstEntityAccountNumber));
		ActiveAccountNumber = CaptureFirstEntityAccountNumber.getText();
		GeneralEntityRefrenceNumber = Capture1stEntityRefrenceCode.getText();
		ObjectRepo.test.log(Status.PASS, " Capture General account detailsNumber" + ActiveAccountNumber);
	}

	public void captureGeneralAccountQO() {
		try {
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		} catch (Exception e) {
			e.printStackTrace();
		}
//			wait.until(ExpectedConditions.elementToBeClickable(MyAccount));
		ClickDropdownHomePage.click();
		Search.sendKeys("QO");
		ClickOnFilters.click();
		System.out.println("Clicked on Filter");
		try {
			wait.until(ExpectedConditions.visibilityOf(FirstColumn));
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Select First Column");
		select = new Select(FirstColumn);
		try {
			select.selectByVisibleText("Entity Account Type");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Select Third Column");
		wait.until(ExpectedConditions.elementToBeClickable(ValueDropdown));
		select = new Select(ValueDropdown);
		select.selectByVisibleText("General");
//			Search.sendKeys(Keys.ENTER);
		AddFilter.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterValue.click();
		FilterValue.sendKeys("QO");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(CaptureFirstEntityAccountNumber));
		ActiveAccountNumber = CaptureFirstEntityAccountNumber.getText();
		GeneralEntityRefrenceNumber = Capture1stEntityRefrenceCode.getText();
		ObjectRepo.test.log(Status.PASS, " Capture General account detailsNumber" + ActiveAccountNumber);
	}

	String TransferingGeneralAccountNo;

	public void transferingGeneralAccount() {
		TransferingGeneralAccountNo = ActiveAccountNumber;
		System.out.println("Transfering General AccountNo: " + TransferingGeneralAccountNo);
		ObjectRepo.test.log(Status.PASS, "Transfering General AccountNo: " + TransferingGeneralAccountNo);
	}

	String ReceivingGeneralAccountNo;

	public void receivingGeneralAccount() {
		ReceivingGeneralAccountNo = ActiveAccountNumber;
		System.out.println("Receiving General AccountNo: " + ReceivingGeneralAccountNo);
		ObjectRepo.test.log(Status.PASS, "Receiving General AccountNo: " + ReceivingGeneralAccountNo);
	}

	public void navigateToInitiateGenralAccount_Sanity() {
		CommonLibref.scroll(ThreeDotsMenuBtn, "scrollToElement", "ThreeDotsMenuBtn");
		wait.until(ExpectedConditions.elementToBeClickable(ThreeDotsMenuBtn));
		try {
//			action.moveToElement(ThreeDotsMenuBtn).click().perform();
			ThreeDotsMenuBtn.click();
			wait.until(ExpectedConditions.elementToBeClickable(Initiate_Administrative_Transfer_Btn));
		} catch (Exception e) {
			CommonLibref.click(ThreeDotsMenuBtn, "moveToElementClick", "ThreeDotsMenuBtn");
//				wait.until(ExpectedConditions.elementToBeClickable(Initiate_Administrative_Transfer_Btn));
		}
		try {
			Initiate_Administrative_Transfer_Btn.click();
		} catch (Exception e) {
			action.moveToElement(Initiate_Administrative_Transfer_Btn).click().build().perform();
		}

		wait.until(ExpectedConditions.visibilityOf(TransferType));
		String Types = TransferType.getText();
		Assert.assertEquals(Types, "Transfer Type");
		ObjectRepo.test.log(Status.PASS, "  ‘Transfer Type’ pop-up screen is displayed");
	}

	public void navigateToInitiate_GenralAcc_Sanity() {
		OTCNoMoreThan3DaysRadiobtn.click();
		ContinueBtn1.click();
		try {
			Thread.sleep(2000);
//				wait.until(ExpectedConditions.elementToBeClickable(ExpandMyAccount));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ObjectRepo.test.log(Status.PASS, "AR is navigated to the ‘Initiate Over-the-Counter Transfer <=3 Days’ page");

	}

	public void proposedGeneralTo_OTCLess_Than3_DaysTransfer_Sanity() {
		CommonLibref.scroll(AccountNumberField, "scrollToElement", "AccountNumberField");
//			js.executeScript("window.scrollBy(0,1150)", "");
		wait.until(ExpectedConditions.visibilityOf(AccountNumberField));
		System.out.println("Enter Account Number");
//			AccountNumberField.sendKeys("JKM10255-6877");
		AccountNumberField.sendKeys(ReceivingGeneralAccountNo);
		System.out.println("Enter Refrence Code");
//			EntityReferenceField.sendKeys("00004825");
		EntityReferenceField.sendKeys(GeneralEntityRefrenceNumber);
		System.out.println("Enter Quantity Field");
		QuantityField.sendKeys("1");
		wait.until(ExpectedConditions.elementToBeClickable(AgreegateDatePickerIcon));
		System.out.println("Select Agreement Date");
		CommonLibref.click(AgreegateDatePickerIcon, "javascriptClick", "AgreegateDatePickerIcon");
//			js.executeScript("arguments[0].click();", AgreegateDatePickerIcon);
		CommonLibref.click(CurrentDateTimeForCross, "javascriptClick", "CurrentDateTimeForCross");
		try {
			CheckBoxAll.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBoxAll, "moveToElementClick", "Expected Termination Date not specified");

		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			System.out.println("Select Expiration Date");
//			try {
//				Thread.sleep(6000);
//				wait.until(ExpectedConditions.elementToBeClickable(ExpectedTermination_DatePickerIcon));
//				
//			} catch (Exception e) {
////				Thread.sleep(5000);
//			}
////			 wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
//				try {
//					ExpectedTermination_DatePickerIcon.click();
//					System.out.println("Selenium Click");
////					js.executeScript("arguments[0].click();", ExpectedTermination_DatePickerIcon);
//					Thread.sleep(1000);
//				}catch (ArrayIndexOutOfBoundsException e) {
//					CommonLibref.click(ExpectedTermination_DatePickerIcon, "moveToElementClick", "ExpectedTermination_DatePickerIcon");
//					System.out.println("Move to Element Click");
//					}
//				catch (Exception e) {
//					action.moveToElement(ExpectedTermination_DatePickerIcon).click().perform();
////					CommonLibref.click(ExpectedTermination_DatePickerIcon, "javascriptClick", "ExpectedTermination_DatePickerIcon");
//					System.out.println("Java Script Click");
//				}
//			wait.until(ExpectedConditions.visibilityOf(CurrentDateTimeForCross));
//			CommonLibref.click(CurrentDateTimeForCross, "moveToElementClick", "CurrentDateTimeForCross");
//			js.executeScript("arguments[0].click();", CurrentDateTimeForCross);
		CommonLibref.scroll(PricePerInstrument, "scrollToElement", "PricePerInstrument");
		PricePerInstrument.click();
		PricePerInstrument.sendKeys("100");
//			js.executeScript("window.scrollBy(0,550)", "");
		CommonLibref.scroll(CurrencyDropDown, "scrollToElement", "CurrencyDropDown");
		wait.until(ExpectedConditions.visibilityOf(CurrencyDropDown));
		wait.until(ExpectedConditions.elementToBeClickable(CurrencyDropDown));
//			select = new Select(CurrencySelect);
//			select.selectByIndex(0);
		CommonLibref.click(CurrencyDropDown, "moveToElementClick", "CurrencyDropDown");
//			CurrencyDropDown.click();
		CurrencyDropDown.sendKeys(Keys.ARROW_DOWN);
		CurrencyDropDown.sendKeys(Keys.ENTER);
		CommonLibref.scroll(PrivSubmitButton, "scrollToBottomOFPage", "Submit_Btn");
	}

	public void submitGeneralTransferForProposal() {
		ObjectRepo.test.log(Status.PASS, "Step: Enter the Details to Initiate the General Transfer.");
		CommonLibref.scroll(PrivSubmitButton, "scrollToBottomOFPage", "Submit_Btn");
		try {
			Submit_Btn.click();
		} catch (Exception e) {
			CommonLibref.click(PrivSubmitButton, "moveToElementClick", "Submit_Btn");
		}

//			Submit_Btn.click();
//			js.executeScript("arguments[0].click();", Submit_Btn);
		ObjectRepo.test.log(Status.PASS, "'Confirm Transfer Proposal' gets displayed with Passphrase.");
		ObjectRepo.test.log(Status.PASS, "Enter Valid Passphrase & click on CONFIRM Button");
		PasspharseEnter.click();
		PasspharseEnter.sendKeys(prop.getProperty("Password3"));
		Confirm_Button.click();
		try {
			wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		} catch (Exception e) {

		}
		System.out.println(SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, "General Transfer is Successfully Proposed");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
		TransferID = TransferIDOnTransferDatailsCard.getText();
		System.out.println("Transfer ID is " + TransferID);
		ObjectRepo.test.log(Status.PASS, "AR Successfully Proposed General Transfer");
	}

	public void submitGeneralTransferForProposal_Error() {
		CommonLibref.scroll(PrivSubmitButton, "scrollToBottomOFPage", "Submit_Btn");
		try {
			Submit_Btn.click();
		} catch (Exception e) {
			CommonLibref.click(PrivSubmitButton, "moveToElementClick", "Submit_Btn");
		}

//			Submit_Btn.click();
//			js.executeScript("arguments[0].click();", Submit_Btn);
		ObjectRepo.test.log(Status.PASS, "'Confirm Transfer Proposal' gets displayed with Passphrase.");
		ObjectRepo.test.log(Status.PASS, "Enter Valid Passphrase & click on CONFIRM Button");
		PasspharseEnter.click();
		PasspharseEnter.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		Confirm_Button.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		String ErrorMessage = "The transfer cannot be initiated as the receiving account is not found. Please contact the Jurisdictions for more information.";
		 Assert.assertEquals(SuccessMessage.getText(), ErrorMessage);
		ObjectRepo.test.log(Status.PASS, ErrorMessage);
		System.out.println(ErrorMessage);
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
		TransferID = TransferIDOnTransferDatailsCard.getText();
		System.out.println("Transfer ID is " + TransferID);
	}

	public void approveTransfer_For_Accept_Functionality() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
		} catch (Exception e) {

		}
//			js.executeScript("window.scrollBy(0,1500)", "");
		CommonLibref.scroll(CheckBoxAll, "scrollToBottomOFPage", "Approve");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CheckBoxAll.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBoxAll, "moveToElementClick", "Approve");

		}
		System.out.println("Approve Radio Button Selected" + CheckBoxAll.isSelected());
//			js.executeScript("arguments[0].click();", OTCNoMoreThan3DaysRadiobtn);
//			CommentField.sendKeys("Test Automation");
		try {
			CapSubmit.click();
		} catch (Exception e) {
			CommonLibref.click(CapSubmit, "moveToElementClick", "Submit Button");
		}
//			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");

		PasspharseEnter.sendKeys(listeners.prop.getProperty("WciIncAdminPassphrase"));
		SubmitButtonOnConfirmationPop.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, "AAR/PAR is be able to Approve the transfer.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
	}

	public void approveTransfer_For_Accept_Functionality_Error() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
		} catch (Exception e) {

		}
//			js.executeScript("window.scrollBy(0,1500)", "");
		CommonLibref.scroll(CheckBoxAll, "scrollToBottomOFPage", "Approve");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CheckBoxAll.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBoxAll, "moveToElementClick", "Approve");

		}
		System.out.println("Approve Radio Button Selected" + CheckBoxAll.isSelected());
//			js.executeScript("arguments[0].click();", OTCNoMoreThan3DaysRadiobtn);
//			CommentField.sendKeys("Test Automation");
		try {
			CapSubmit.click();
		} catch (Exception e) {
			CommonLibref.click(CapSubmit, "moveToElementClick", "Submit Button");
		}
//			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");

		PasspharseEnter.sendKeys(listeners.prop.getProperty("WciIncAdminPassphrase"));
		SubmitButtonOnConfirmationPop.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		 String ErrorMessage = "The transfer cannot be Approved as the receiving Entity is not found. Please contact the Jurisdictions for more information.";
		 Assert.assertEquals(SuccessMessage.getText(), ErrorMessage);
		ObjectRepo.test.log(Status.PASS, SuccessMessage.getText());
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
	}

	String ProposedGeneralTransferID;

	public void proposedGeneralTransferID() {
		ProposedGeneralTransferID = TransferID;
		System.out.println("Proposed Transfer ID: " + ProposedGeneralTransferID);
	}

	String ApprovedGeneralTransferID;

	public void approvedGeneralTransferID() {
		ApprovedGeneralTransferID = TransferID;
		System.out.println("Approved Transfer ID: " + ApprovedGeneralTransferID);
	}

	public void acceptTransfer_For_Accept_Functionality() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
		} catch (Exception e) {

		}
//			js.executeScript("window.scrollBy(0,1500)", "");
		CommonLibref.scroll(CheckBoxAll, "scrollToBottomOFPage", "Approve");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CheckBoxAll.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBoxAll, "moveToElementClick", "Approve");

		}
		System.out.println("Approve Radio Button Selected" + CheckBoxAll.isSelected());
//			js.executeScript("arguments[0].click();", OTCNoMoreThan3DaysRadiobtn);
//			CommentField.sendKeys("Test Automation");
		try {
			CapSubmit.click();
		} catch (Exception e) {
			CommonLibref.click(CapSubmit, "moveToElementClick", "Submit Button");
		}
//			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");

		PasspharseEnter.sendKeys(listeners.prop.getProperty("WciIncAdminPassphrase"));
		SubmitButtonOnConfirmationPop.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, "AAR/PAR is be able to Accept the transfer.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
	}

	public void acceptTransfer_For_Accept_Functionality_Error() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
			CloseIcon.click();
		} catch (Exception e) {

		}
//			js.executeScript("window.scrollBy(0,1500)", "");
		CommonLibref.scroll(CheckBoxAll, "scrollToBottomOFPage", "Approve");
		ObjectRepo.test.log(Status.PASS, "Select Approve Radio Button");
		try {
			CheckBoxAll.click();
		} catch (Exception e) {
			CommonLibref.click(CheckBoxAll, "moveToElementClick", "Approve");

		}
		System.out.println("Approve Radio Button Selected" + CheckBoxAll.isSelected());
//			js.executeScript("arguments[0].click();", OTCNoMoreThan3DaysRadiobtn);
//			CommentField.sendKeys("Test Automation");
		try {
			CapSubmit.click();
		} catch (Exception e) {
			CommonLibref.click(CapSubmit, "moveToElementClick", "Submit Button");
		}
//			CommonLibref.click(Submit_Btn, "moveToElementClick", "Submit_Btn");

		PasspharseEnter.sendKeys(listeners.prop.getProperty("WciIncAdminPassphrase"));
		SubmitButtonOnConfirmationPop.click();
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		System.out.println(SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, SuccessMessage.getText());
		ObjectRepo.test.log(Status.PASS, "AAR/PAR is not able to Accept the transfer.");
		wait.until(ExpectedConditions.elementToBeClickable(CloseIcon));
		action.moveToElement(CloseIcon).click().build().perform();
	}

	public void pending_TransferDetailPage() {
		PendingTransfers.click();
		Search1.sendKeys(TransferID);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(EntityTransferIDInPendingTransfer));
		try {
			EntityTransferIDInPendingTransfer.click();
		} catch (Exception e) {
			CommonLibref.click(EntityTransferIDInPendingTransfer, "moveToElementClick",
					"EntityTransferIDInPendingTransfer");
		}
		ObjectRepo.test.log(Status.PASS, "AR gets navigated to the 'Over-the-Counter Transfer <=3 Days Detail' page");
	}

	public void poposed_TransferDetailPage() {
		PendingTransfers.click();
		Search1.sendKeys(ProposedGeneralTransferID);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(EntityTransferIDInPendingTransfer));
		try {
			EntityTransferIDInPendingTransfer.click();
		} catch (Exception e) {
			CommonLibref.click(EntityTransferIDInPendingTransfer, "moveToElementClick",
					"EntityTransferIDInPendingTransfer");
		}
		ObjectRepo.test.log(Status.PASS, "AR gets navigated to the 'Over-the-Counter Transfer <=3 Days Detail' page");
	}

	public void accept_TransferDetailPage() {
		PendingTransfers.click();
		Search1.sendKeys(ApprovedGeneralTransferID);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(EntityTransferIDInPendingTransfer));
		try {
			EntityTransferIDInPendingTransfer.click();
		} catch (Exception e) {
			CommonLibref.click(EntityTransferIDInPendingTransfer, "moveToElementClick",
					"EntityTransferIDInPendingTransfer");
		}
		ObjectRepo.test.log(Status.PASS, "AR gets navigated to the 'Over-the-Counter Transfer <=3 Days Detail' page");
	}

}
