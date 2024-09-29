package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import Utilities.listeners;

public class EntityRegistrartion_Flow2_POM {

	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static JavascriptExecutor js = (JavascriptExecutor) driver.get();
	// JavascriptExecutor js;
	public String GHGID;
	public static String entityID;
	public String entityID1;
	public String entityID2;
	public String entityID3;
	public String CAGId;
	public static String LuhaAccNumber;
	public static String AnnualAllocationAccNumber;
	public static String GeneralAccNumber;
	public static String ComplianceAccNumber;
	public String LuhaAccNumber2;
	public String AnnualAllocationAccNumber2;
	public String GeneralAccNumber2;
	public String ComplianceAccNumber2;
	public String LuhaAccNumber3;
	public String AnnualAllocationAccNumber3;
	public String GeneralAccNumber3;
	public String ComplianceAccNumber3;
	public String LuhaAccNumber4;
	public String AnnualAllocationAccNumber4;
	public String GeneralAccNumber4;
	public String ComplianceAccNumber4;
	public static String ReferenceCode1;
	public static String ReferenceCode2;

	// public String generateRandomString;
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	@FindBy(xpath = "//div[text()='Select Jurisdiction']")
	private WebElement SelectJurisdictionDropDown;

	@FindBy(xpath = "//span[contains(text(),'California')]")
	private WebElement SelectOptionCalifornia;

	@FindBy(xpath = "//div[text()='Select Jurisdiction']")
	private WebElement selectJurisdictionDropDown;

	@FindBy(xpath = "//*[@id='select-jurisdiction']")
	private WebElement selectJurisdictionDropDown2;
	// *[@data-testid="priv_modal_Cancel"]
	@FindBy(xpath = "//*[@data-testid='priv_modal_Cancel']")
	private WebElement Exit;
	@FindBy(xpath = "(//*[text()='Select Jurisdiction'])[1]")
	private WebElement selectJurisdictionLink;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[1]")
	private WebElement CAGId1;

	@FindBy(xpath = "//span[contains(text(),'California')]")
	private WebElement selectOptionCalifornia;

	@FindBy(xpath = "//span[text()='Quebec']")
	private WebElement selectOptionQuebec;

	@FindBy(xpath = "//span[text()='Washington State']")
	private WebElement selectOptionWashington;

	@FindBy(xpath = "//span[contains(text(),'Nova Scotia')]")
	private WebElement selectOptionNovaScotia;

	@FindBy(xpath = "//div[text()='Select Language']")
	private WebElement selectLangaugeDropDown;

	@FindBy(xpath = "//span[text()='English']")
	private WebElement selectlangEnglish;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement btnContineu;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement textBoxEmail;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement textBoxPassWord;

	@FindBy(xpath = "//input[@name='remember']")
	private WebElement checkBoxRememberMe;

	@FindBy(xpath = "//button[@data-testid='login_btn']")
	private WebElement btnLogin;

	@FindBy(xpath = "//button[@data-testid='priv_btn_login']")
	private WebElement btnLogin2;

	@FindBy(xpath = "//*[contains(text(),'Welcome,')]")
	private WebElement btnWelcomeProfile;

	@FindBy(xpath = "//button[contains(text(),'Welcome,')]//child::*[local-name()='svg']")
	private WebElement btnWelcomeProfileDD;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement btnLogOut;

	@FindBy(xpath = "(//button[text()='CONTINUE'])[3]")
	private WebElement ContinuBtn;

	@FindBy(xpath = "//*[text()='HOME']")
	private WebElement btnHome;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")
	private WebElement securityQuestion1ForLogin;

	@FindBy(xpath = "//input[@id='Answer']")
	private WebElement answerField;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	private WebElement continueButtonForLogin;

	@FindBy(xpath = "//*[contains(text(),'ENTITY ACCOUNT APPLICATION')]")
	private WebElement EAA_link;

	@FindBy(xpath = "//button[text()='Register An Entity']")
	private WebElement btnRegister;

	@FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1cdtra8']")
	private List<WebElement> selectJurisdictionoptions;

	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement contineuBtn;

	@FindBy(xpath = "//*[@id='select-entity']")
	private WebElement selectEntityDropDown;

	@FindBy(xpath = "//*[text()='Covered Entity, Covered Source, or Opt-In Entity']")
	private WebElement selectEntityType1;

	@FindBy(xpath = "(//button[text()='CONTINUE'])[2]")
	private WebElement contineuBtn3;

	@FindBy(xpath = "//*[text()='3. Enter Entity Information']")
	private WebElement entityInfoPageTitle;

	@FindBy(xpath = "//input[contains(@id,'country')]")
	private WebElement countryDropdown;

	@FindBy(xpath = "//li[text()='United States']")
	private WebElement UnitedState;

	@FindBy(xpath = "//*[text()='United States']")
	private WebElement selectCountry;

	@FindBy(xpath = "//*[text()='Alaska']")
	private WebElement selectProvince;

	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	private WebElement calendericon;

	@FindBy(xpath = "//*[@aria-current='date']")
	private WebElement todaysDate;

	@FindBy(xpath = "(//*[@id='priv_btn_Continue'])[2]")
	private WebElement NewcontineuBtn;

	@FindBy(xpath = "//*[contains(text(),'Afghanistan')]")
	private WebElement selectCountryForRegion;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h2 css-11brs9n']")
	private List<WebElement> contactInfoSections;

	@FindBy(xpath = "(//*[@value='Select Country'])[1]")
	private WebElement PhyAddCountryDropDown;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkboxMail;

	@FindBy(xpath = "(//*[@type='checkbox'])[1]")
	private WebElement addFacilityCheckBox;

	@FindBy(xpath = "(//*[@type='submit'])[2]")
	private WebElement btnSAVE;
	@FindBy(xpath = "//*[text()='About WCI, Inc.']")
	private WebElement AboutUs;
	@FindBy(xpath = "//*[@id='ghgEmissionsReportingId']")
	private WebElement GHCEmission;

	@FindBy(xpath = "//*[@name='Self' and @type ='radio']")
	private WebElement selectRadioBtnForSelf;

	@FindBy(xpath = "//*[@name='representative[1].userReferenceCode']")
	private WebElement userreference1;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[1]")
	private WebElement YesCheckbox;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	private WebElement closePopUpForAddRepresentative;

	@FindBy(xpath = "(//*[@id='priv_btn_Continue'])[2]")
	private WebElement btnContinue;

	@FindBy(xpath = "//*[@value='Select...']")
	private WebElement Naicscodedrop;

	@FindBy(xpath = "//*[text()='N/A  Not Applicable']")
	private WebElement selectoption_NAICScode;

	@FindBy(xpath = "(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	private WebElement UseEntityDatacheckbox;

	@FindBy(xpath = "//*[@name='is_auction']")
	private WebElement btnAddAuction;

	@FindBy(xpath = "(//*[@id='priv_btn_Continue'])[2]")
	private WebElement btn_Continue2;

	@FindBy(xpath = "(//button[text()='SUBMIT'])")
	private WebElement Submitbtn;

	@FindBy(xpath = "//*[@id='newPassphrase']")
	private WebElement Passphrase1;

	@FindBy(xpath = "(//*[text()='CONTINUE'])[2]")
	private WebElement continubtnofpopup;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement CloseIcononSubmitDocumentpage;

	@FindBy(xpath = "(//*[text()='CONTINUE'])[2]")
	private WebElement Continuebtn;

	@FindBy(xpath = "//*[@name='priv_btn_Search']")
	private WebElement Finishbtn;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-191hpac']")
	private WebElement EntityDetails;

	@FindBy(xpath = "(//p[text()='Pending Requests'])[2]")
	private WebElement entityMgtPendingRequest;

	@FindBy(xpath = "//h4[text()='ENTITY MANAGEMENT']")
	private WebElement entitymgtHeader;

	@FindBy(how = How.XPATH, using = "(//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1])[1]")
	private WebElement EntityIDLink;

	@FindBy(xpath = "//input[@name='Approve']")
	private WebElement CheckBoxApprove;

	@FindBy(xpath = "//*[@value='Special Purpose Holding Account']")
	private WebElement selectEntitySpecialPurposeHoldingAccounts;

	@FindBy(xpath = "//input[contains(@id,'entity_annual_allocation_holding_accounts_')]")
	private WebElement selectEntityAnnualAllocationHoldingAccounts;

	@FindBy(xpath = "	//*[text()='Limited Use Holding Account']")
	private WebElement LimiteduseholdingaccountOption;

	@FindBy(xpath = "//*[text()='Neither']")
	private WebElement NeitherOption;

	@FindBy(xpath = "//button[text()='SAVE']")
	private WebElement btnSave;

	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement btnContinueOnEntityStatusPage;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CloseIcon')]")
	private WebElement closePopup;

	@FindBy(name = "comment")
	private WebElement commentBox;

	@FindBy(xpath = "//*[text()='My Accounts']")
	private WebElement MyAccounts;

	@FindBy(xpath = "//*[text()='Annual Allocation Holding Account (c)']")
	private WebElement CAnnualallocationholding;

	@FindBy(xpath = "(//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1])[1]")
	private WebElement EntityIDLinkRev;

	@FindBy(xpath = "//*[text()='ENTITIES']")
	private WebElement Entities;

	@FindBy(xpath = "//*[text()='HOME']")
	private WebElement HomeMenu;

	@FindBy(xpath = "(//*[text()='Representatives'])[1]")
	private WebElement Representativesection;

	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	private WebElement editbtn2;

	@FindBy(xpath = "(//*[text()='Primary Account Representative'])[1]")
	private WebElement PrimaryAccountRepresentativeRole;

	@FindBy(xpath = "//button[text()='MENU']")
	private WebElement Menu;

	@FindBy(xpath = "(//*[text()='Alternate Account Representative'])[3]")
	private WebElement SwaproletoAAR;

	@FindBy(xpath = "(//*[text()='Alternate Account Representative'])[2]")
	private WebElement AlternateAccountRepresentativeRole;

	@FindBy(xpath = "(//*[text()='Primary Account Representative'])[2]")
	private WebElement SwaproletoPAR;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-ip80gu'])[4]")
	private WebElement EntityReferenceCode;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 css-ip80gu'])[1]")
	private WebElement EntityID;

	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement continubtn1;

	@FindBy(xpath = "(//*[text()='Save'])[1]")
	private WebElement savebtn;

	@FindBy(xpath = "//*[text()='Proposed Changes Saved Successfully.']")
	private WebElement ProposedSuccessPOPup;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[4]")
	private WebElement ClosePopup2;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[1]")
	private WebElement ClosePopup1;

	@FindBy(xpath = "//button[contains(text(),'Search Entities')]")
	private WebElement searchEntitiesbutton;

	@FindBy(xpath = "(//*[text()='Proposed Data Changes'])[1]")
	private WebElement proposeddatachangessection;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Selectallcheckbox;

	@FindBy(xpath = "(//span[@class='css-hyxlzm'])")
	private WebElement approvebtn;

	@FindBy(xpath = "//*[text()='Save']")
	private WebElement savebtn2;

	@FindBy(xpath = "//*[text()='Successfully Approved the Proposed Changes']")
	private WebElement successmesgofapprovechanges;

	@FindBy(xpath = "//*[text()='Facilities']")
	private WebElement facilitiessection;

	@FindBy(xpath = "//*[text()='Add Facility']")
	private WebElement AddFacility;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement AddFacilitybtn;

	@FindBy(xpath = "(//*[text()='Proposed Data Changes'])[2]")
	private WebElement ProposedDataChanges;

	@FindBy(xpath = "//*[@data-testid='CloseIcon']")
	private WebElement Closepopup3;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1ga5bvv']")
	private WebElement JurisdictionName;
	// Cag
	@FindBy(xpath = "//*[text()='MORE ACTIONS']")
	private WebElement moreaction;

	@FindBy(xpath = "//*[text()='Add New Group']")
	private WebElement AddNewGroup;

	@FindBy(xpath = "//input[@id='cagGroupName']")
	private WebElement CAGGroupName;

	@FindBy(xpath = "//input[@id='entityId']")
	private WebElement CAGEntityID;

	// input[@id="entity_id"]
	@FindBy(xpath = "//input[@id='entity_id']")
	private WebElement CAGEntityID1;

	@FindBy(xpath = "//input[@id='holdingLimitSharePercentage']")
	private WebElement CAGHoldingLimitShare;
	// *[@id="holding_limit_share"]
	// *[@id="purchase_limit_share"]
	@FindBy(xpath = "//*[@id='holding_limit_share']")
	private WebElement CAGHoldingLimitShare1;

	@FindBy(xpath = "//input[@id='purchaseLimitSharePercentage']")
	private WebElement CAGPurchaseLimitShare;
	@FindBy(xpath = "//*[@id='purchase_limit_share']")
	private WebElement CAGPurchaseLimitShare1;

	@FindBy(xpath = "//button[text()='Add Member']")
	private WebElement CAGAddMemberBtn;
	@FindBy(xpath = "(//*[@data-testid='priv_btn_save'])[2]")
	private WebElement CAGSaveBtn;
	@FindBy(xpath = "(//*[@type='button'])[40]")
	private WebElement CAGSaveBtn1;
	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement continuePopUp;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[3]")
	private WebElement closepopupforCAG;

	@FindBy(xpath = "//*[text()='Activate CAG']")
	private WebElement ActivateCAGbtn;

	@FindBy(xpath = "//*[text()='Close CAG']")
	private WebElement closeCAGbtn;

	@FindBy(xpath = "//*[text()='Cross-Jurisdiction Group']//preceding::input[@type='checkbox']")
	private WebElement CrossJurisdictionCheckbox;

	@FindBy(xpath = "//*[@id='jurisdictions-react-hook-form-select-search']")
	private WebElement SelectJurisdiction;

	@FindBy(xpath = "(//*[@class='MuiTouchRipple-root css-w0pj6f'])[5]")
	private WebElement CagJurisdiction;

	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[2]")
	private WebElement Luha;

	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[3]")
	private WebElement AnnualAllocation;

	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[4]")
	private WebElement General;

	@FindBy(xpath = "(//*[@data-field='entityAccountNumber'])[5]")
	private WebElement Compliance;

	@FindBy(xpath = "//*[@class='MuiTouchRipple-root css-w0pj6f']//preceding::button[text()='Search Entities']")
	private WebElement SearchEntity;

	@FindBy(xpath = "//*[@class='MuiTouchRipple-root css-w0pj6f']//preceding::button[text()='Search Users']")
	private WebElement SearchUsers;

	@FindBy(xpath = "(//*[@type='search'])[1]")
	private WebElement SearchBox;

	@FindBy(xpath = "//*[@class='link-cell']")
	private WebElement CaggroupId;

	@FindBy(xpath = "(//*[text()='EDIT'])[2]")
	private WebElement Edit;

	@FindBy(xpath = "//*[text()='CHECK']")
	private WebElement Check;
			private WebElement QuickAction;
	@FindBy(xpath = "(//*[@class='link-cell'])[1]")
	private WebElement firstEnityId;

	public EntityRegistrartion_Flow2_POM() {
		PageFactory.initElements(driver.get(), this);
	}

	public void ClickOnSearchEntity() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(SearchEntity));
		wait.until(ExpectedConditions.elementToBeClickable(SearchEntity));
		CommonLibref.click(SearchEntity, "javascriptClick", "SearchEntity");
		System.out.println("Click on Search Entity");
		ObjectRepo.test.log(Status.PASS, "Click on Search Entity");
		CommonLibref.pageLoader();
	}

	public void SearchEntityID(String FilePath, String SheetName,int rowNum,int cellNum) throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(SearchBox)).click();
		CommonLibref.click(SearchBox, "javascriptClick", "SearchBox");
		SearchBox.sendKeys(Keys.CONTROL, "a");
		SearchBox.sendKeys(Keys.BACK_SPACE);
		SearchBox.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		System.out.println("Search Entity ID - " + entityID);
		ObjectRepo.test.log(Status.PASS, "Search Entity ID - " + entityID);
	}

	public void SearchEntityID1() {
		CommonLibref.pageLoader();
		System.out.println("Search Approved Entity ID ");
		ObjectRepo.test.log(Status.PASS, "Search Approved Entity ID ");
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(SearchBox)).click();
		CommonLibref.click(SearchBox, "javascriptClick", "SearchBox");
		SearchBox.sendKeys(Keys.CONTROL, "a");
		SearchBox.sendKeys(Keys.BACK_SPACE);
		SearchBox.sendKeys(entityID1);
		System.out.println("Search Entity ID - " + entityID1);
		ObjectRepo.test.log(Status.PASS, "Search Entity ID - " + entityID1);
	}

	public void SearchEntityID2() throws InterruptedException {
		System.out.println("Search Approved Entity ID ");
		ObjectRepo.test.log(Status.PASS, "Search Approved Entity ID ");
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).click();
		CommonLibref.click(SearchBox, "javascriptClick", "SearchBox");
		SearchBox.sendKeys(Keys.CONTROL, "a");
		SearchBox.sendKeys(Keys.BACK_SPACE);
		SearchBox.sendKeys(entityID2);
		Thread.sleep(3000);
	}

	public void SearchEntityID3() {
		System.out.println("Search Approved Entity ID ");
		ObjectRepo.test.log(Status.PASS, "Search Approved Entity ID ");
		wait.until(ExpectedConditions.visibilityOf(SearchBox)).click();
		CommonLibref.click(SearchBox, "javascriptClick", "SearchBox");
		SearchBox.sendKeys(Keys.CONTROL, "a");
		SearchBox.sendKeys(Keys.BACK_SPACE);
		SearchBox.sendKeys(entityID3);
	}

	public void storeLuhaAccountNumber() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(Luha));
		System.out.println("Store the Account Numbers");
		ObjectRepo.test.log(Status.PASS, "Store the Account Numbers");
		LuhaAccNumber = Luha.getText();
		System.out.println("Luha Account Number- " + LuhaAccNumber);
		ObjectRepo.test.log(Status.PASS, "Luha Account Number- " + LuhaAccNumber);
	}

	public void storeAnnualAccountNumber() {
		AnnualAllocationAccNumber = AnnualAllocation.getText();
		System.out.println("Annual Allocation Account Number- " + AnnualAllocationAccNumber);
		ObjectRepo.test.log(Status.PASS, "Annual Allocation Account Number- " + AnnualAllocationAccNumber);
	}

	public void storeGeneralAccountNumber() {
		GeneralAccNumber = General.getText();
		System.out.println("General Account Number- " + GeneralAccNumber);
		ObjectRepo.test.log(Status.PASS, "General Account Number- " + GeneralAccNumber);
	}

	public void storecomplianceAccountNumber() {
		ComplianceAccNumber = Compliance.getText();
		System.out.println("Compliance Account Number- " + ComplianceAccNumber);
		ObjectRepo.test.log(Status.PASS, "Compliance Account Number- " + ComplianceAccNumber);
	}

	public void StoreEntityAccountNumbersEntity1() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(Luha));
		System.out.println("Store the Account Numbers");
		ObjectRepo.test.log(Status.PASS, "Store the Account Numbers");
		LuhaAccNumber = Luha.getText();
		System.out.println("Luha Account Number- " + LuhaAccNumber);
		ObjectRepo.test.log(Status.PASS, "Luha Account Number- " + LuhaAccNumber);
		AnnualAllocationAccNumber = AnnualAllocation.getText();
		System.out.println("Annual Allocation Account Number- " + AnnualAllocationAccNumber);
		ObjectRepo.test.log(Status.PASS, "Annual Allocation Account Number- " + AnnualAllocationAccNumber);
		GeneralAccNumber = General.getText();
		System.out.println("General Account Number- " + GeneralAccNumber);
		ObjectRepo.test.log(Status.PASS, "General Account Number- " + GeneralAccNumber);
		ComplianceAccNumber = Compliance.getText();
		System.out.println("Compliance Account Number- " + ComplianceAccNumber);
		ObjectRepo.test.log(Status.PASS, "Compliance Account Number- " + ComplianceAccNumber);
		SearchUsers.click();
	}

	public void StoreEntityAccountNumbersEntity2() {
		System.out.println("Store the Account Numbers");
		ObjectRepo.test.log(Status.PASS, "Store the Account Numbers");
		LuhaAccNumber2 = Luha.getText();
		System.out.println("Luha Account Number 2 - " + LuhaAccNumber2);
		ObjectRepo.test.log(Status.PASS, "Luha Account Number 2 - " + LuhaAccNumber2);
		AnnualAllocationAccNumber2 = AnnualAllocation.getText();
		System.out.println("Annual Allocation Account Number 2 - " + AnnualAllocationAccNumber2);
		ObjectRepo.test.log(Status.PASS, "Annual Allocation Account Number 2 - " + AnnualAllocationAccNumber2);
		GeneralAccNumber2 = General.getText();
		System.out.println("General Account Number 2 - " + GeneralAccNumber2);
		ObjectRepo.test.log(Status.PASS, "General Account Number 2 - " + GeneralAccNumber2);
		ComplianceAccNumber2 = Compliance.getText();
		System.out.println("Compliance Account Number 2 - " + ComplianceAccNumber2);
		ObjectRepo.test.log(Status.PASS, "Compliance Account Number 2 - " + ComplianceAccNumber2);
		SearchUsers.click();
	}

	public void StoreEntityAccountNumbersEntity3() {
		System.out.println("Store the Account Numbers");
		ObjectRepo.test.log(Status.PASS, "Store the Account Numbers");
		LuhaAccNumber3 = Luha.getText();
		System.out.println("Luha Account Number- " + LuhaAccNumber3);
		ObjectRepo.test.log(Status.PASS, "Luha Account Number- " + LuhaAccNumber3);
		AnnualAllocationAccNumber3 = AnnualAllocation.getText();
		System.out.println("Annual Allocation Account Number- " + AnnualAllocationAccNumber3);
		ObjectRepo.test.log(Status.PASS, "Annual Allocation Account Number- " + AnnualAllocationAccNumber);
		GeneralAccNumber3 = General.getText();
		System.out.println("General Account Number- " + GeneralAccNumber3);
		ObjectRepo.test.log(Status.PASS, "General Account Number- " + GeneralAccNumber3);
		ComplianceAccNumber3 = Compliance.getText();
		System.out.println("Compliance Account Number- " + ComplianceAccNumber3);
		ObjectRepo.test.log(Status.PASS, "Compliance Account Number- " + ComplianceAccNumber3);
		SearchUsers.click();
	}

	public void StoreEntityAccountNumbersEntity4() {
		System.out.println("Store the Account Numbers");
		ObjectRepo.test.log(Status.PASS, "Store the Account Numbers");
		LuhaAccNumber4 = Luha.getText();
		System.out.println("Luha Account Number- " + LuhaAccNumber4);
		ObjectRepo.test.log(Status.PASS, "Luha Account Number- " + LuhaAccNumber4);
		AnnualAllocationAccNumber4 = AnnualAllocation.getText();
		System.out.println("Annual Allocation Account Number- " + AnnualAllocationAccNumber4);
		ObjectRepo.test.log(Status.PASS, "Annual Allocation Account Number- " + AnnualAllocationAccNumber4);
		GeneralAccNumber4 = General.getText();
		System.out.println("General Account Number- " + GeneralAccNumber4);
		ObjectRepo.test.log(Status.PASS, "General Account Number- " + GeneralAccNumber4);
		ComplianceAccNumber4 = Compliance.getText();
		System.out.println("Compliance Account Number- " + ComplianceAccNumber4);
		ObjectRepo.test.log(Status.PASS, "Compliance Account Number- " + ComplianceAccNumber4);
		SearchUsers.click();
	}

	public void loginWithValidCredentials() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
		CommonLibref.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
		CommonLibref.typeText(textBoxPassWord, prop.getProperty("PassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "PassWord entered successfully :" + prop.getProperty("PassWord"));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Click on Login button ");
//		wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(HomeMenu));
		} catch (InterruptedException e) {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(HomeMenu));
		}
	}

	public void selectJurisdictionFunctionalityForQuebec() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(Exit));
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionDropDown2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(selectJurisdictionDropDown2).build().perform();
			action.click(selectJurisdictionDropDown2).build().perform();
		} catch (Exception e) {
			CommonLibref.click(selectJurisdictionDropDown2, "seleniumClick", "selectJurisdictionDropDown2");
			e.printStackTrace();
		}
		ObjectRepo.test.log(Status.PASS, "Click on Select jurisdiction dropdown ");
		CommonLibref.performActionOnElements(selectJurisdictionoptions, "selectJurisdictionoptions");
		String Jurisdiction = JurisdictionName.getText();
		selectJurisdictionDropDown2.sendKeys(Jurisdiction);
		selectJurisdictionDropDown2.sendKeys(Keys.ARROW_DOWN);
		selectJurisdictionDropDown2.sendKeys(Keys.ENTER);
		// wait.until(ExpectedConditions.elementToBeClickable(selectOptionQuebec));
		// CommonLibref.click(selectOptionQuebec, "seleniumClick",
		// "selectOptionQuebec");
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		wait.until(ExpectedConditions.elementToBeClickable(contineuBtn));
		CommonLibref.click(contineuBtn, "seleniumClick", "contineuBtn");
//		try {
//			selectJurisdictionDropDown2.click();
//		} catch (Exception e) {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(selectJurisdictionDropDown2).build().perform();
//			action.click(selectJurisdictionDropDown2).build().perform();
//		}
//		selectJurisdictionDropDown2.sendKeys("Quebec");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//span[text()='Quebec']")));
//		try {
//			driver.get().findElement(By.xpath("//span[text()='Quebec']")).click();
//		} catch (Exception e) {
//			driver.get().findElement(By.tagName("body")).sendKeys(Keys.ENTER);
//		}
//		System.out.println("Jurisdiction Selected : Quebec");
//		ObjectRepo.test.log(Status.PASS, "Jurisdiction Selected : Quebec");
//		CommonLibref.click(contineuBtn, "seleniumClick", "contineuBtn");
//		String pageTitle = CommonLibref.getTextElement(entityInfoPageTitle);
//		System.out.println("User is navigated to :" + pageTitle);

	}

	public void handlesecurityQuestion() {
		wait.until(ExpectedConditions.visibilityOf(securityQuestion1ForLogin));
		String str = securityQuestion1ForLogin.getText().trim();
		if (str.contains("first job?")) {
			answerField.sendKeys("aaaa");
		} else if (str.contains("maiden name?")) {
			answerField.sendKeys("bbbb");
		} else if (str.contains("first car?")) {
			answerField.sendKeys("cccc");
		} else if (str.contains("card?")) {
			answerField.sendKeys("cccc");
		} else {
			System.out.println("Nothing");
		}
		continueButtonForLogin.click();
		System.out.println("Registrar User should logged in successfully.");
	}

	public void Verification_of_accessibility_of_Register_an_Entity_button_of_Entity_Account_Application_Page() {
		CommonLibref.pageLoader();
//		wait.until(ExpectedConditions.visibilityOf(EAA_link));
//		CommonLibref.scroll(EAA_link, "scrollToTopOFPage", "EAA_link");
//		CommonLibref.isDisplayed(EAA_link, "EAA_link");
		System.out.println("User Can Access the EAA");
		ObjectRepo.test.log(Status.PASS, "User Can Access the EAA");
		wait.until(ExpectedConditions.visibilityOf(EAA_link));
		wait.until(ExpectedConditions.elementToBeClickable(EAA_link));

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(EAA_link).click(EAA_link).build().perform();
			// CommonLibref.click(EAA_link, "seleniumClick", "EAA_link");
		} catch (Exception e) {
			js = (JavascriptExecutor) driver.get();
			js.executeScript("arguments[0].click();", EAA_link);
//			CommonLibref.click(EAA_link, "javascriptClick", "EAA_link");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
			CommonLibref.click(btnRegister, "moveToElementClick", "btnRegister");
		} catch (Exception e) {
			CommonLibref.click(btnRegister, "seleniumClick", "btnRegister");
		}
	}

	public void selectEntityTypeAsCoveredEntity() {
		wait.until(ExpectedConditions.elementToBeClickable(selectEntityDropDown));
		try {
			selectEntityDropDown.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(selectEntityDropDown).build().perform();
			action.click(selectEntityDropDown).build().perform();
		}
		selectEntityDropDown.sendKeys("Covered Entity, Covered Source, or Opt-In Entity");

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[text()='Covered Entity, Covered Source, or Opt-In Entity']")));
		try {
			driver.get().findElement(By.xpath("//*[text()='Covered Entity, Covered Source, or Opt-In Entity']"))
					.click();
		} catch (Exception e) {
			driver.get().findElement(By.tagName("body")).sendKeys(Keys.ENTER);
		}
//		wait.until(ExpectedConditions.elementToBeClickable(selectEntityDropDown));

//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			CommonLibref.click(selectEntityDropDown, "moveToElementClick", "selectEntityDropDown");
//		} catch (Exception e) {
//			CommonLibref.click(selectEntityDropDown, "moveToElementClick", "selectEntityDropDown");
//		}
		//
//		wait.until(ExpectedConditions.elementToBeClickable(selectEntityType1));
//		CommonLibref.click(selectEntityType1, "seleniumClick", "selectEntityType1");
		System.out.println("Entity type Selected : Covered Entity, Covered Source, or Opt-In Entity");
		ObjectRepo.test.log(Status.PASS, "Entity type Selected : Covered Entity, Covered Source, or Opt-In Entity");
		CommonLibref.click(contineuBtn3, "moveToElementClick", "contineuBtn3");
		String pageTitle = CommonLibref.getTextElement(entityInfoPageTitle);
		System.out.println("User is navigated to :" + pageTitle);
	}

	public void addEntityInformationforQuebec() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("legalName")));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.id("legalName")).sendKeys("UserEntitylegalName");
		ObjectRepo.test.log(Status.PASS, "Legle Name entered ");
		driver.get().findElement(By.id("operationName")).sendKeys("UserEntityOperationalName");
		ObjectRepo.test.log(Status.PASS, "Operating name entered");
		try {
			CommonLibref.scroll(countryDropdown, "scrollToBottomOFPage", "Bottom To The Page");
			wait.until(ExpectedConditions.visibilityOf(countryDropdown)).click();
			CommonLibref.click(UnitedState, "seleniumClick", "UnitedState");
			System.out.println("Country selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "Country selected from dropdown");
			driver.get().findElement(By.xpath("//*[@value='Select State or Province']")).click();
			CommonLibref.click(selectProvince, "seleniumClick", "selectProvince");
			System.out.println("State or Province selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "State or Province selected from dropdown");
		} catch (Exception e) {
			CommonLibref.scroll(countryDropdown, "scrollToBottomOFPage", "Bottom To The Page");
			wait.until(ExpectedConditions.elementToBeClickable(countryDropdown)).click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			CommonLibref.click(selectCountry, "seleniumClick", "selectCountry");
			System.out.println("Country selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "Country selected from dropdown");
			// driver.get().findElement(By.id("province")).click();
			driver.get().findElement(By.xpath("//*[@value='Select State or Province']")).click();
			CommonLibref.click(selectProvince, "seleniumClick", "selectProvince");
			System.out.println("State or Province selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "State or Province selected from dropdown");
		}
		CommonLibref.click(calendericon, "seleniumClick", "calendericon");
		wait.until(ExpectedConditions.elementToBeClickable(todaysDate));
		CommonLibref.click(todaysDate, "seleniumClick", "todaysDate");
		driver.get().findElement(By.id("IdentificationNumber")).sendKeys("987654321");
		// driver.get().findElement(By.id("dunsNumber")).sendKeys("1212121212");
		// driver.get().findElement(By.id("québecEnterpriseNumber")).sendKeys("1212121212");
		CommonLibref.scroll(NewcontineuBtn, "scrollToBottomOFPage", "Bottom To The Page");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonLibref.click(NewcontineuBtn, "moveToElementClick", "NewcontineuBtn");
		ObjectRepo.test.log(Status.PASS,
				"************************************************************************************");
		System.out.println("************************************************************************************");
	}

	// For Corss Jurisdiction Transfers
	public void addEntityInformationforQuebecTransfers() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("legalName")));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.id("legalName")).sendKeys("UserEntitylegalName");
		ObjectRepo.test.log(Status.PASS, "Legle Name entered ");
		driver.get().findElement(By.id("operationName")).sendKeys("UserEntityOperationalName");
		ObjectRepo.test.log(Status.PASS, "Operating name entered");
		try {
			wait.until(ExpectedConditions.visibilityOf(countryDropdown)).click();
			CommonLibref.click(UnitedState, "seleniumClick", "UnitedState");
			System.out.println("Country selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "Country selected from dropdown");
			driver.get().findElement(By.xpath("//*[@value='Select State or Province']")).click();
			CommonLibref.click(selectProvince, "seleniumClick", "selectProvince");
			System.out.println("State or Province selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "State or Province selected from dropdown");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(countryDropdown)).click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			CommonLibref.click(selectCountry, "seleniumClick", "selectCountry");
			System.out.println("Country selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "Country selected from dropdown");
			// driver.get().findElement(By.id("province")).click();
			driver.get().findElement(By.xpath("//*[@value='Select State or Province']")).click();
			CommonLibref.click(selectProvince, "seleniumClick", "selectProvince");
			System.out.println("State or Province selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "State or Province selected from dropdown");
		}
		CommonLibref.click(calendericon, "seleniumClick", "calendericon");
		wait.until(ExpectedConditions.elementToBeClickable(todaysDate));
		CommonLibref.click(todaysDate, "seleniumClick", "todaysDate");
		driver.get().findElement(By.id("IdentificationNumber")).sendKeys("987654321");
		driver.get().findElement(By.id("dunsNumber")).sendKeys("1212121212");
		driver.get().findElement(By.id("québecEnterpriseNumber")).sendKeys("1212121212");
		CommonLibref.scroll(NewcontineuBtn, "scrollToBottomOFPage", "Bottom To The Page");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonLibref.click(NewcontineuBtn, "moveToElementClick", "NewcontineuBtn");
		ObjectRepo.test.log(Status.PASS,
				"************************************************************************************");
		System.out.println("************************************************************************************");
	}

	// For Corss Jurisdiction Transfers
	public void addEntityInformationforCaliforniaTransfers() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("legalName")));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get().findElement(By.id("legalName")).sendKeys("UserEntitylegalName");
		ObjectRepo.test.log(Status.PASS, "Legle Name entered ");
		driver.get().findElement(By.id("operationName")).sendKeys("UserEntityOperationalName");
		ObjectRepo.test.log(Status.PASS, "Operating name entered");
		try {
			wait.until(ExpectedConditions.visibilityOf(countryDropdown)).click();
			CommonLibref.click(UnitedState, "seleniumClick", "UnitedState");
			System.out.println("Country selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "Country selected from dropdown");
			driver.get().findElement(By.xpath("//*[@value='Select State or Province']")).click();
			CommonLibref.click(selectProvince, "seleniumClick", "selectProvince");
			System.out.println("State or Province selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "State or Province selected from dropdown");
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(countryDropdown)).click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver.get();
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			CommonLibref.click(selectCountry, "seleniumClick", "selectCountry");
			System.out.println("Country selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "Country selected from dropdown");
			// driver.get().findElement(By.id("province")).click();
			driver.get().findElement(By.xpath("//*[@value='Select State or Province']")).click();
			CommonLibref.click(selectProvince, "seleniumClick", "selectProvince");
			System.out.println("State or Province selected from dropdown");
			ObjectRepo.test.log(Status.PASS, "State or Province selected from dropdown");
		}
		CommonLibref.click(calendericon, "seleniumClick", "calendericon");
		wait.until(ExpectedConditions.elementToBeClickable(todaysDate));
		CommonLibref.click(todaysDate, "seleniumClick", "todaysDate");
		// Government Issued Taxpayer or Employer Identification Number* - California
		driver.get().findElement(By.id("IdentificationNumber")).sendKeys("987654321");
		// DUNS Number -California
		driver.get().findElement(By.id("dunsNumber")).sendKeys("1212121212");
		// ID Number Assigned by Incorporating Agency
		driver.get().findElement(By.id("IDByAgency")).sendKeys("1212121212");
		// ID Number Assigned by the California Secretary of State
		driver.get().findElement(By.id("idNumberAssignedByTheCaliforniaSecretaryOfState")).sendKeys("1212121212");
		CommonLibref.scroll(NewcontineuBtn, "scrollToBottomOFPage", "Bottom To The Page");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonLibref.click(NewcontineuBtn, "moveToElementClick", "NewcontineuBtn");
		ObjectRepo.test.log(Status.PASS,
				"************************************************************************************");
		System.out.println("************************************************************************************");
	}

	public void performActionOnElements(List<WebElement> element, String elementName) {
		List<WebElement> options = element;
		int totalOptions = options.size();
		for (int i = 0; i <= totalOptions - 1; i++) {
			String availOptions = options.get(i).getText();
			ObjectRepo.test.log(Status.PASS, availOptions + " is present in the list   " + elementName);
			ObjectRepo.test.log(Status.INFO, availOptions + " is present in the list   " + elementName);
		}
	}

	public void addContatctInformation() {
		CommonLibref.performActionOnElements(contactInfoSections, "contactInfoSections");

		driver.get().findElement(By.id("physicalAddress.street1")).sendKeys("physicalAddressstreet1");

		driver.get().findElement(By.id("physicalAddress.street2")).sendKeys("physicalAddressstreet2");

		driver.get().findElement(By.id("physicalAddress.city")).sendKeys("physicalAddresscity");
		wait.until(ExpectedConditions.elementToBeClickable(PhyAddCountryDropDown)).click();
		CommonLibref.click(selectCountryForRegion, "seleniumClick", "selectCountryForRegion");
		driver.get().findElement(By.id("physicalAddress.region")).sendKeys("RegionName");
		driver.get().findElement(By.id("physicalAddress.postalCode")).sendKeys("123456");
		CommonLibref.click(checkboxMail, "javascriptClick", "mailing address is same as phycsical address");
		driver.get().findElement(By.id("contactInfo.teleNumber")).sendKeys("+919146444781");
		driver.get().findElement(By.id("contactInfo.ext")).sendKeys("123");
		driver.get().findElement(By.id("contactInfo.mobilePhone")).sendKeys("+919146444781");

		driver.get().findElement(By.id("contactInfo.facsimileNumber")).sendKeys("12345678901");

		driver.get().findElement(By.id("contactInfo.email")).sendKeys("qb1-all@eqanim-qa.wci-validate.org");
		driver.get().findElement(By.id("contactInfo.website")).sendKeys("www.mailingAddress.com");
		CommonLibref.scroll(NewcontineuBtn, "scrollToBottomOFPage", "NewcontineuBtn");
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(NewcontineuBtn).click(NewcontineuBtn).build().perform();

		} catch (Exception e) {
			CommonLibref.click(NewcontineuBtn, "javascriptClick", "NewcontineuBtn");
		}
		String title = driver.get().getTitle();
		System.out.println(title);
	}

	public void Verification_of_Add_Facility_Information() {
		CommonLibref.pageLoader();
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Facilities']"));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0,1000)");
		} catch (Exception e) {
			CommonLibref.scroll(GHCEmission, "scrollToElement", "approveAndRevisionHeading");
			e.printStackTrace();
		}
		int length = 12;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		String randomString = (generatedString);
		Random random = new Random();
		int randomNumber = random.nextInt(1000000000);
		// CommonLibref.scroll(FacilityInfoTitle, "scrollToElement",
		// "approveAndRevisionHeading");
		String randomStr = Integer.toString(randomNumber);

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(GHCEmission).click(GHCEmission).build().perform();
		} catch (Exception e) {
			CommonLibref.click(GHCEmission, "javascriptClick", "self radio button click");
			e.printStackTrace();
		}
		GHCEmission.sendKeys(randomStr);
		// driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);

		try {
			boolean errMsg1 = driver.get()
					.findElements(By.xpath("//p[text()='Facility belongs to another jurisdiction!']")).size() > 0;

			if (errMsg1) {
				randomStr = Integer.toString(randomNumber);
				driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed");
		}

		try {
			boolean errMsg2 = driver.get().findElements(By.xpath("//p[contains(text()='Facility already exist')]"))
					.size() > 0;

			if (errMsg2) {
				randomStr = Integer.toString(randomNumber);
				driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed");
		}
		// wait.until(ExpectedConditions.elementToBeClickable(Naicscodedrop));
//		try {
//			CommonLibref.click(Naicscodedrop, "seleniumClick", "naicsCode_dropdown");
//		} catch (Exception e) {
//			CommonLibref.click(Naicscodedrop, "seleniumClick", "naicsCode_dropdown");
//		}
//		CommonLibref.scroll(selectoption_NAICScode, "scrollToElement", "selectoption_NAICScode");
//		wait.until(ExpectedConditions.elementToBeClickable(selectoption_NAICScode));
//		CommonLibref.click(selectoption_NAICScode, "seleniumClick", "selectoption_NAICScode");

		WebElement useEntityDataChkbox = driver.get()
				.findElement(By.xpath("//*[text()='Use Entity Data']//preceding::input[@type='checkbox'][1]"));
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		CommonLibref.scroll(useEntityDataChkbox, "scrollToElement", "UseEntityData Checkbox scroll");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			ExpectedConditions.elementToBeClickable(useEntityDataChkbox);
			useEntityDataChkbox.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(useEntityDataChkbox);
			CommonLibref.click(useEntityDataChkbox, "moveToElementClick", "useEntityDataChkbox");
		}

		CommonLibref.scroll(AboutUs, "scrollToBottomOFPage", "AboutUs");
		try {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(btnSAVE).click(btnSAVE).build().perform();
			ExpectedConditions.elementToBeClickable(btnSAVE);
			btnSAVE.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(btnSAVE);
			CommonLibref.click(btnSAVE, "javascriptClick", "btnADD");
		}
		GHGID = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='MuiDataGrid-cellContent'])[3]")))
				.getText();
		System.out.println("New Facility's GHG ID Displayed : " + GHGID);

		try {
			ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='CONTINUE'])[2]"));
			Actions action = new Actions(driver.get());
			WebElement element = driver.get().findElement(By.xpath("(//*[text()='CONTINUE'])[2]"));
			action.moveToElement(element).build().perform();
			element.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='CONTINUE'])[2]"));
			Actions action = new Actions(driver.get());
			WebElement element = driver.get().findElement(By.xpath("(//*[text()='CONTINUE'])[2]"));
			action.moveToElement(element).build().perform();
			action.click(element).build().perform();
		}
		ExpectedConditions
				.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Facility added successfully']")));
		WebElement closePopup = driver.get().findElement(By.xpath("(//*[@data-testid=\"CloseIcon\"])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(closePopup));
		CommonLibref.pageLoader();
		closePopup.click();

	}

	public void Verification_of_Add_Facility_InformationQuebec() {
		CommonLibref.pageLoader();
		ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Facilities']"));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver.get();
			js.executeScript("window.scrollBy(0,1000)");
		} catch (Exception e) {
			CommonLibref.scroll(GHCEmission, "scrollToElement", "approveAndRevisionHeading");
			e.printStackTrace();
		}
		int length = 12;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		String randomString = (generatedString);
		Random random = new Random();
		int randomNumber = random.nextInt(1000000000);
		// CommonLibref.scroll(FacilityInfoTitle, "scrollToElement",
		// "approveAndRevisionHeading");
		String randomStr = Integer.toString(randomNumber);

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(GHCEmission).click(GHCEmission).build().perform();
		} catch (Exception e) {
			CommonLibref.click(GHCEmission, "javascriptClick", "self radio button click");
			e.printStackTrace();
		}
		GHCEmission.sendKeys(randomStr);
		// driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);

		try {
			boolean errMsg1 = driver.get()
					.findElements(By.xpath("//p[text()='Facility belongs to another jurisdiction!']")).size() > 0;

			if (errMsg1) {
				randomStr = Integer.toString(randomNumber);
				driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed");
		}

		try {
			boolean errMsg2 = driver.get().findElements(By.xpath("//p[contains(text()='Facility already exist')]"))
					.size() > 0;

			if (errMsg2) {
				randomStr = Integer.toString(randomNumber);
				driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed");
		}
		wait.until(ExpectedConditions.elementToBeClickable(Naicscodedrop));
		try {
			CommonLibref.click(Naicscodedrop, "seleniumClick", "naicsCode_dropdown");
		} catch (Exception e) {
			CommonLibref.click(Naicscodedrop, "seleniumClick", "naicsCode_dropdown");
		}
		CommonLibref.scroll(selectoption_NAICScode, "scrollToElement", "selectoption_NAICScode");
		wait.until(ExpectedConditions.elementToBeClickable(selectoption_NAICScode));
		CommonLibref.click(selectoption_NAICScode, "seleniumClick", "selectoption_NAICScode");

		WebElement useEntityDataChkbox = driver.get()
				.findElement(By.xpath("//*[text()='Use Entity Data']//preceding::input[@type='checkbox'][1]"));
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		CommonLibref.scroll(useEntityDataChkbox, "scrollToElement", "UseEntityData Checkbox scroll");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			ExpectedConditions.elementToBeClickable(useEntityDataChkbox);
			useEntityDataChkbox.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(useEntityDataChkbox);
			CommonLibref.click(useEntityDataChkbox, "moveToElementClick", "useEntityDataChkbox");
		}

		CommonLibref.scroll(AboutUs, "scrollToBottomOFPage", "AboutUs");
		try {
//			Actions action = new Actions(driver.get());
//			action.moveToElement(btnSAVE).click(btnSAVE).build().perform();
			ExpectedConditions.elementToBeClickable(btnSAVE);
			btnSAVE.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(btnSAVE);
			CommonLibref.click(btnSAVE, "javascriptClick", "btnADD");
		}
		GHGID = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='MuiDataGrid-cellContent'])[3]")))
				.getText();
		System.out.println("New Facility's GHG ID Displayed : " + GHGID);

		try {
			ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='CONTINUE'])[2]"));
			Actions action = new Actions(driver.get());
			WebElement element = driver.get().findElement(By.xpath("(//*[text()='CONTINUE'])[2]"));
			action.moveToElement(element).build().perform();
			element.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='CONTINUE'])[2]"));
			Actions action = new Actions(driver.get());
			WebElement element = driver.get().findElement(By.xpath("(//*[text()='CONTINUE'])[2]"));
			action.moveToElement(element).build().perform();
			action.click(element).build().perform();
		}
		ExpectedConditions
				.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Facility added successfully']")));
		WebElement closePopup = driver.get().findElement(By.xpath("(//*[@data-testid=\"CloseIcon\"])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(closePopup));
		closePopup.click();

	}

	public void addRepresentative() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.elementToBeClickable(selectRadioBtnForSelf);
		CommonLibref.click(selectRadioBtnForSelf, "javascriptClick", "self radio button click");
//		CommonLibref.click(selectRadioBtnForSelf, "seleniumClick", "Rolse assign Using URC");
//		CommonLibref.click(selectRadioBtnForSelf, "seleniumClick", "Rolse assign Using URC");
		WebElement ReferenceCode = driver.get()
				.findElement(By.xpath("//*[contains(@id,'representative[0].userReferenceCode')][@type='text']"));
		if (ReferenceCode.getText() != null) {
			System.out.println("Self Reference code is auto populated");
			if (ReferenceCode.getText() == null) {
				driver.get().findElement(By.xpath("(//*[@name='User Reference Code'])[2]")).click();
				CommonLibref.click(selectRadioBtnForSelf, "seleniumClick", "Rolse assign Using URC");
			}
		} else {
			driver.get().findElement(By.xpath("(//*[@name='User Reference Code'])[2]")).click();
			CommonLibref.click(selectRadioBtnForSelf, "seleniumClick", "Rolse assign Using URC");
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Select Role']")));
		driver.get().findElement(By.xpath("//*[@value='Select Role']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Primary Account Representative']")));
		driver.get().findElement(By.xpath("//*[text()='Primary Account Representative']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='ADD MORE']")));
//		driver.get().findElement(By.xpath("//*[text()='ADD MORE']")).click();

		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@name='User
		// Reference Code'])[2]")));
//		ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@name='User Reference Code'])[2]"));
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		driver.get().findElement(By.xpath("(//*[@name='User Reference Code'])[2]")).click();
//		ExpectedConditions.visibilityOf(userreference1);

//		driver.get().findElement(By.xpath("//*[@id='representative[1].userReferenceCode']"))
//				.sendKeys(prop.getProperty("QArefId2"));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Select Role']")));
//		driver.get().findElement(By.xpath("//*[@value='Select Role']")).click();
//		driver.get().findElement(By.xpath("//*[text()='Alternate Account Representative']")).click();
//		driver.get().findElement(By.xpath("//*[@name='representative[1].isAllowedAccess']")).click();
		WebElement element = driver.get().findElement(By.xpath("//button[text()='ADD']"));
		CommonLibref.scroll(element, "scrollToElement", "btnAdd");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		wait.until(ExpectedConditions.elementToBeClickable(closePopUpForAddRepresentative));
		CommonLibref.click(closePopUpForAddRepresentative, "javascriptClick", "closePopUpForAddRepresentative");
		wait.until(ExpectedConditions.elementToBeClickable(Continuebtn));
		CommonLibref.click(Continuebtn, "javascriptClick", "Continuebtn");
	}

	public void AuctionandReserveSaleInformation() {

		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(YesCheckbox));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(YesCheckbox));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(YesCheckbox).click(YesCheckbox).build().perform();
		} catch (Exception e) {
			js.executeScript("arguments[0].click();", YesCheckbox);
			try {
			} catch (Exception innerException) {
				CommonLibref.click(YesCheckbox, "javascriptClick", "YesCheckbox");
			}
		}
		wait.until(ExpectedConditions.elementToBeClickable(contineuBtn3));
		CommonLibref.click(contineuBtn3, "javascriptClick", "YesCheckbox");
	}

	public void ReviewandSubmitpage() {
		CommonLibref.pageLoader();
		WebElement contactUs = driver.get().findElement(By.xpath("//p[text()='Contact Us']"));
		CommonLibref.scroll(contactUs, "scrollToBottomOFPage", "scroll to bottom");
		WebElement element = driver.get().findElement(By.xpath("//*[text()='SUBMIT']"));
		try {
			CommonLibref.scroll(element, "scrollToBottomOFPage", "btnSubmit");
			CommonLibref.click(element, "javascriptClick", "Finishbtn");
			// element.click();
		} catch (Exception e) {
			CommonLibref.scroll(element, "scrollToBottomOFPage", "btnSubmit");
			Actions action = new Actions(driver.get());
			action.moveToElement(element).click(element).build().perform();
			// element.click();
		}
		driver.get().findElement(By.xpath("//*[@id='newPassphrase']"))
				.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		driver.get().findElement(By.xpath("(//*[text()='CONTINUE'])[2]")).click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcononSubmitDocumentpage));
			CloseIcononSubmitDocumentpage.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(CloseIcononSubmitDocumentpage));
			CloseIcononSubmitDocumentpage.click();
		}
	}

	public void ClickonFinish() {
		Common.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		CommonLibref.scroll(Finishbtn, "scrollToBottomOFPage", "Finishbtn");
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
//		Finishbtn.click();
		try {
			CommonLibref.click(Finishbtn, "javascriptClick", "Finishbtn");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Finishbtn).click(Finishbtn).build().perform();
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(EntityDetails));
		entityID =wait.until(ExpectedConditions.visibilityOf(EntityID)).getText();
		System.out.println(entityID);
		wait.until(ExpectedConditions.elementToBeClickable(EntityReferenceCode));
		ReferenceCode1 = EntityReferenceCode.getText();
		System.out.println(ReferenceCode1);
		Common.pageLoader();
	}

	public void ClickonFinishEntity2() {
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		CommonLibref.scroll(Finishbtn, "scrollToBottomOFPage", "Finishbtn");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		Finishbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(EntityDetails));
		entityID1 = wait.until(ExpectedConditions.visibilityOf(EntityID)).getText();
		System.out.println(entityID1);
		ReferenceCode2 = EntityReferenceCode.getText();
		System.out.println(ReferenceCode2);
		Common.pageLoader();
	}

	public void ClickonFinishEntity3() {
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		CommonLibref.scroll(Finishbtn, "scrollToBottomOFPage", "Finishbtn");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		Finishbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(EntityDetails));
		entityID2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-ip80gu'])[1]"))).getText();
		System.out.println(entityID2);
	}

	public void ClickonFinishEntity4() {
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		CommonLibref.scroll(Finishbtn, "scrollToBottomOFPage", "Finishbtn");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		Finishbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(EntityDetails));
		entityID3 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-ip80gu'])[1]"))).getText();
		System.out.println(entityID3);
	}

	public void Logout() {
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfile));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			btnWelcomeProfile.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(btnWelcomeProfile).build().perform();
			action.click(btnWelcomeProfile).build().perform();
		}
		// selectEntityDropDown.sendKeys("Logout");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Logout']")));
		try {
			driver.get().findElement(By.xpath("//*[text()='Logout']")).click();
		} catch (Exception e) {
			CommonLibref.click(btnLogOut, "seleniumClick", "btnLogOut");
		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void JurisdictionUserloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail)).clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail)).click();
		CommonLibref.typeText(textBoxEmail, prop.getProperty("JU_UserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JU_UserName"));
		// Thread.sleep(1000);
		CommonLibref.typeText(textBoxPassWord, prop.getProperty("JU_PassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("JU_PassWord"));
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void searchEntity1() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Entities']")));
		CommonLibref.scroll(entitymgtHeader, "scrollToElement", "entity management section");
		wait.until(ExpectedConditions.visibilityOf(entityMgtPendingRequest));
		CommonLibref.click(entityMgtPendingRequest, "seleniumClick", "entityMgt Pending Request dropdown");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = driver.get().findElement(By.xpath("(//*[@type='search'])[3]"));
		element.click();
		element.sendKeys(entityID);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(EntityIDLink, "scrollToElement", "EntityIDLink");
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1]")));
		CommonLibref.click(EntityIDLink, "seleniumClick", "EntityIDLink");
	}

	public void searchEntity2() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Entities']")));
		CommonLibref.scroll(entitymgtHeader, "scrollToElement", "entity management section");
		wait.until(ExpectedConditions.visibilityOf(entityMgtPendingRequest));
		CommonLibref.click(entityMgtPendingRequest, "seleniumClick", "entityMgt Pending Request dropdown");
		WebElement element = driver.get().findElement(By.xpath("(//*[@type='search'])[3]"));
		element.click();
		element.sendKeys(entityID1);
		Common.pageLoader();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(EntityIDLink, "scrollToElement", "EntityIDLink");
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1]")));
		CommonLibref.click(EntityIDLink, "seleniumClick", "EntityIDLink");
	}

	public void searchEntity3() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Entities']")));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(entitymgtHeader, "scrollToElement", "entity management section");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(entityMgtPendingRequest));
		CommonLibref.click(entityMgtPendingRequest, "seleniumClick", "entityMgt Pending Request dropdown");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = driver.get().findElement(By.xpath("(//*[@type='search'])[3]"));
		element.click();
		element.sendKeys(entityID2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(EntityIDLink, "scrollToElement", "EntityIDLink");
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1]")));
		CommonLibref.click(EntityIDLink, "seleniumClick", "EntityIDLink");
	}

	public void searchEntity4() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Entities']")));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(entitymgtHeader, "scrollToElement", "entity management section");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(entityMgtPendingRequest));
		CommonLibref.click(entityMgtPendingRequest, "seleniumClick", "entityMgt Pending Request dropdown");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = driver.get().findElement(By.xpath("(//*[@type='search'])[3]"));
		element.click();
		element.sendKeys(entityID3);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(EntityIDLink, "scrollToElement", "EntityIDLink");
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1]")));
		CommonLibref.click(EntityIDLink, "seleniumClick", "EntityIDLink");
	}

	public void approveEntityApplicationForCoveredEntity() {
//		commonLibref.scroll(CheckBoxApprove, "scrollToElement", "CheckBoxApprove");
		CommonLibref.click(CheckBoxApprove, "javascriptClick", "CheckBoxApprove");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExpectedConditions.elementToBeClickable(selectEntitySpecialPurposeHoldingAccounts);
		CommonLibref.click(selectEntitySpecialPurposeHoldingAccounts, "moveToElementClick",
				"selectEntitySpecialPurposeHoldingAccounts");
		ExpectedConditions.elementToBeClickable(LimiteduseholdingaccountOption);
		CommonLibref.click(LimiteduseholdingaccountOption, "moveToElementClick", "LimiteduseholdingaccountOption");
		CommonLibref.click(selectEntityAnnualAllocationHoldingAccounts, "moveToElementClick",
				"selectEntityAnnualAllocationHoldingAccounts");
		CommonLibref.click(CAnnualallocationholding, "javascriptClick", "CAnnualallocationholding");
		CommonLibref.scroll(btnSave, "scrollToBottomOFPage", "btnSave");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CommonLibref.typeText(commentBox, "Approve entity application", "comment for Approve user");
		} catch (Exception e) {
			CommonLibref.typeText(commentBox, "Approve entity application", "comment for Approve user");
		}
		CommonLibref.click(btnSave, "moveToElementClick", "btnSave");
		CommonLibref.click(btnContinueOnEntityStatusPage, "javascriptClick", "btnContinueOnEntityStatusPage");
//		String approvedSuccessPOPup = driver.get().findElement(By.xpath("//*[text()='Approve status updated']"))
//				.getText();
//		System.out.println(approvedSuccessPOPup);
//		Assert.assertEquals(approvedSuccessPOPup, "Approve status updated");
		wait.until(ExpectedConditions.elementToBeClickable(closePopup));
		CommonLibref.click(closePopup, "moveToElementClick", "closePopup");
		driver.get().navigate().refresh();

	}

	public void EditRepresentative() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(MyAccounts));
		try {
			MyAccounts.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(MyAccounts).build().perform();
			action.click(MyAccounts).build().perform();
		}
		WebElement element = driver.get().findElement(By.xpath("(//*[@type='search'])[1]"));
		element.sendKeys(entityID);
		driver.get()
				.findElement(By.xpath("(//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1])[1]"));
		CommonLibref.click(EntityIDLinkRev, "seleniumClick", "ENTITY MANAGEMENT EntityID");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(Representativesection, "scrollToElement", "Representative Section");
		wait.until(ExpectedConditions.elementToBeClickable(Representativesection));
		try {
			Representativesection.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(Representativesection).build().perform();
			action.click(Representativesection).build().perform();
		}
//		wait.until(ExpectedConditions.elementToBeClickable(editbtn2));
//		CommonLibref.click(editbtn2, "seleniumClick", "Click on Edit Button");
		try {
			editbtn2.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(editbtn2).build().perform();
			action.click(editbtn2).build().perform();
		}

		try {
			PrimaryAccountRepresentativeRole.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(PrimaryAccountRepresentativeRole).build().perform();
			action.click(PrimaryAccountRepresentativeRole).build().perform();
		}
		try {
			SwaproletoAAR.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(SwaproletoAAR).build().perform();
			action.click(SwaproletoAAR).build().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(continubtn1));
		CommonLibref.click(continubtn1, "seleniumClick", "Click on Continue Button");

		try {
			AlternateAccountRepresentativeRole.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(AlternateAccountRepresentativeRole).build().perform();
			action.click(AlternateAccountRepresentativeRole).build().perform();
		}
		try {
			SwaproletoPAR.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(SwaproletoAAR).build().perform();
			action.click(SwaproletoAAR).build().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(continubtn1));
		CommonLibref.click(continubtn1, "seleniumClick", "Click on Continue Button");
		try {
			savebtn.click();
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(savebtn).build().perform();
			action.click(savebtn).build().perform();
		}

//			wait.until(ExpectedConditions.elementToBeClickable(savebtn));
//			CommonLibref.click(savebtn, "seleniumClick", "Click on Save Button");
		driver.get().findElement(By.xpath("//*[@data-testid='passphrase']")).sendKeys(prop.getProperty("PassWord"));
		driver.get().findElement(By.xpath("//*[text()='SUBMIT']")).click();
		String ProposedSuccessPOPup = driver.get()
				.findElement(By.xpath("//*[text()='Proposed Changes Saved Successfully.']")).getText();
		System.out.println(ProposedSuccessPOPup);
		Assert.assertEquals(ProposedSuccessPOPup, "Proposed Changes Saved Successfully.");
		wait.until(ExpectedConditions.elementToBeClickable(closePopup));
		CommonLibref.click(ClosePopup2, "moveToElementClick", "closePopup");
		driver.get().navigate().refresh();

	}

	public void addfacilitybyJurisdictionAdmin() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// commonLibref.scroll(driver.get().findElement(By.xpath("//*[text()='Search
		// Entities']")), "scrollToElement","SearchEntitiesSection scroll");
		wait.until(ExpectedConditions.elementToBeClickable(searchEntitiesbutton));
		// commonLibref.click(searchEntitiesbutton, "seleniumClick",
		// "searchEntitiesbutton");
		searchEntitiesbutton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='search'])[1]"))).click();
		driver.get().findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys(entityID);
		driver.get().findElement(By.xpath("(//*[@data-field='entityId'])[2]")).click();

		driver.get().findElement(By.xpath("//*[text()='Facilities']")).click();
		CommonLibref.scroll(facilitiessection, "scrollToElement", "facilities Section");

		wait.until(ExpectedConditions.elementToBeClickable(AddFacility));
		CommonLibref.click(AddFacility, "seleniumClick", "Click on Add Facility");

		int length = 12;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		String randomString = (generatedString);
		Random random = new Random();
		int randomNumber = random.nextInt(1000000000);

		String randomStr = Integer.toString(randomNumber);
		driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);

		try {
			boolean errMsg1 = driver.get()
					.findElements(By.xpath("//p[text()='Facility belongs to another jurisdiction!']")).size() > 0;

			if (errMsg1) {
				randomStr = Integer.toString(randomNumber);
				driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed");
		}

		try {
			boolean errMsg2 = driver.get().findElements(By.xpath("//p[contains(text()='Facility already exist')]"))
					.size() > 0;

			if (errMsg2) {
				randomStr = Integer.toString(randomNumber);
				driver.get().findElement(By.id("ghgEmissionsReportingId")).sendKeys(randomStr);
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed");
		}
		wait.until(ExpectedConditions.elementToBeClickable(Naicscodedrop));
		try {
			CommonLibref.click(Naicscodedrop, "seleniumClick", "naicsCode_dropdown");
		} catch (Exception e) {
			CommonLibref.click(Naicscodedrop, "seleniumClick", "naicsCode_dropdown");
		}
		CommonLibref.scroll(selectoption_NAICScode, "scrollToElement", "selectoption_NAICScode");
		wait.until(ExpectedConditions.elementToBeClickable(selectoption_NAICScode));
		CommonLibref.click(selectoption_NAICScode, "seleniumClick", "selectoption_NAICScode");

		WebElement useEntityDataChkbox = driver.get()
				.findElement(By.xpath("//*[text()='Use Entity Data']//preceding::input[@type='checkbox'][1]"));
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		CommonLibref.scroll(useEntityDataChkbox, "scrollToElement", "UseEntityData Checkbox scroll");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {
			ExpectedConditions.elementToBeClickable(useEntityDataChkbox);
			useEntityDataChkbox.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(useEntityDataChkbox);
			CommonLibref.click(useEntityDataChkbox, "moveToElementClick", "useEntityDataChkbox");
		}
		CommonLibref.scroll(AddFacilitybtn, "scrollToBottomOFPage", "Add Facility button");
		try {
			ExpectedConditions.elementToBeClickable(AddFacilitybtn);
			AddFacilitybtn.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(AddFacilitybtn);
			CommonLibref.click(AddFacilitybtn, "moveToElementClick", "AddFacilitybtn");

		}
		driver.get().findElement(By.xpath("//*[@id='passphrase']")).sendKeys(prop.getProperty("Ju_AdminPassword"));
		driver.get().findElement(By.xpath("(//*[@type='submit'])[3]")).click();

		String successmsgofnewfacility = driver.get()
				.findElement(By.xpath("//*[text()='Successfully Proposed new Facility']")).getText();
		System.out.println(successmsgofnewfacility);
		Assert.assertEquals(successmsgofnewfacility, "Successfully Proposed new Facility");

	}

	public void approveProposeddatachanges() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// commonLibref.scroll(driver.get().findElement(By.xpath("//*[text()='Search
		// Entities']")), "scrollToElement","SearchEntitiesSection scroll");
		wait.until(ExpectedConditions.elementToBeClickable(searchEntitiesbutton));
		// commonLibref.click(searchEntitiesbutton, "seleniumClick",
		// "searchEntitiesbutton");
		searchEntitiesbutton.click();
		WebElement element = driver.get().findElement(By.xpath("(//*[@type='search'])[1]"));
		element.sendKeys(entityID);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// driver.get().findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys(EntityRegistrartion_Flow2_POM.entityID);
		// driver.get().findElement(By.xpath("(//*[@data-field='entityId'])[2]")).click();
		driver.get()
				.findElement(By.xpath("(//*[@data-field='entityId'][@aria-label='Entity ID']//following::a[1])[1]"));
		CommonLibref.click(EntityIDLinkRev, "seleniumClick", "ENTITY MANAGEMENT EntityID");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(proposeddatachangessection, "scrollToElement", "Proposed data changes section");
		wait.until(ExpectedConditions.elementToBeClickable(proposeddatachangessection));
		CommonLibref.click(proposeddatachangessection, "seleniumClick", "Click on proposed data changes section");
		try {
			ExpectedConditions.elementToBeClickable(Selectallcheckbox);
			Selectallcheckbox.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(Selectallcheckbox);
			CommonLibref.click(Selectallcheckbox, "moveToElementClick", "Select All checkbox");
		}

		CommonLibref.scroll(ProposedDataChanges, "scrollToElement", "Proposed data changes section");
//		wait.until(ExpectedConditions.elementToBeClickable(Selectallcheckbox));
//		CommonLibref.click(Selectallcheckbox, "seleniumClick", "Check Select All checkbox");
		try {
			ExpectedConditions.elementToBeClickable(approvebtn);
			approvebtn.click();
		} catch (Exception e) {
			ExpectedConditions.elementToBeClickable(approvebtn);
			CommonLibref.click(approvebtn, "moveToElementClick", "Select Approve radio button");
		}
//		try {
//			ExpectedConditions.elementToBeClickable(savebtn2);
//		savebtn2.click();
//		} catch (Exception e) {
//		ExpectedConditions.elementToBeClickable(savebtn2);			
//		CommonLibref.click(savebtn2, "moveToElementClick", "Select Approve radio button");
//		}
		CommonLibref.click(savebtn2, "moveToElementClick", "savebtn2");
		CommonLibref.click(savebtn2, "javascriptClick", "Click on Save button");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String successmesgofapprovechanges = driver.get()
				.findElement(By.xpath("//*[text()='Successfully Approved the Proposed Changes']")).getText();
		System.out.println(successmesgofapprovechanges);
		Assert.assertEquals(successmesgofapprovechanges, "Successfully Approved the Proposed Changes");
		wait.until(ExpectedConditions.elementToBeClickable(Closepopup3));
		CommonLibref.click(Closepopup3, "moveToElementClick", "closePopup");

	}

	public void JurisdictionAdminloginwithvalidcredential() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail)).clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail)).click();
		CommonLibref.typeText(textBoxEmail, prop.getProperty("JU_UserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JU_AdminUserName"));
		// Thread.sleep(1000);
		CommonLibref.typeText(textBoxPassWord, prop.getProperty("JU_PassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "PassWord entered successfully :" + prop.getProperty("Ju_AdminPassword"));
		CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Click on Login button ");
	}

//CAG

	public static String generateRandomString(int length) {
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			stringBuilder.append(randomChar);
		}
		return stringBuilder.toString();
	}

	public void createCAG(String entityID, String entityID1) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(driver.get().findElement(By.xpath("//button[text()='MENU']")), "scrollToElement",
				"Scroll to MENU");
		try {
			driver.get().findElement(By.xpath("//button[text()='MENU']")).click();
		} catch (Exception e) {
			driver.get().findElement(By.xpath("//button[text()='MENU']")).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Corporate Associations']")));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.get().findElement(By.xpath("//p[text()='Corporate Associations']")).click();
		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[text()='Corporate Associations']")).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(moreaction));
		moreaction.click();
		wait.until(ExpectedConditions.visibilityOf(AddNewGroup));
		AddNewGroup.click();
		int length = 10;
		String randomString = generateRandomString(length);
		System.out.println("Random String: " + randomString);
		String groupName = randomString;
		wait.until(ExpectedConditions.visibilityOf(CAGGroupName));
		CAGGroupName.sendKeys(groupName);
		ObjectRepo.test.log(Status.PASS, "Group Name Entered");
		wait.until(ExpectedConditions.elementToBeClickable(CAGEntityID));
		CAGEntityID.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CAGEntityID.sendKeys(entityID);
		wait.until(ExpectedConditions.visibilityOf(CAGHoldingLimitShare));
		CAGHoldingLimitShare.sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(CAGPurchaseLimitShare));
		CAGPurchaseLimitShare.sendKeys("1");
		try {
			CommonLibref.scroll(CAGAddMemberBtn, "scrollToBottomOFPage", "Add Member scroll");
			Thread.sleep(2000);
			CommonLibref.click(CAGAddMemberBtn, "moveToElementClick", "CAGAddMemberBtn");
			ObjectRepo.test.log(Status.PASS, "Entity Added in the CAG");
		} catch (Exception e) {
			CommonLibref.scroll(CAGAddMemberBtn, "scrollToBottomOFPage", "Add Member scroll");
			CommonLibref.click(CAGAddMemberBtn, "moveToElementClick", "CAGAddMemberBtn");

		}

		wait.until(ExpectedConditions
				.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']"))));
		String SuccessPopUp = driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']")).getText();
		ObjectRepo.test.log(Status.PASS, "Entity Added in the CAG");
		driver.get().findElement(By.xpath("(//*[@data-testid='CloseIcon'])[2]")).click();
		System.out.println(SuccessPopUp);
		// Assert.assertEquals(SuccessPopUp, "Changes Saved successfully.");

//		wait.until(ExpectedConditions.elementToBeClickable(closePopup));
//		CommonLibref.click(closePopup, "seleniumClick", "closePopup");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get().findElement(By.xpath("//input[@id='entityId']")).sendKeys(entityID1);
		driver.get().findElement(By.xpath("//input[@id='holdingLimitSharePercentage']")).sendKeys("1");
		driver.get().findElement(By.xpath("//input[@id='purchaseLimitSharePercentage']")).sendKeys("1");
		driver.get().findElement(By.xpath("//*[text()='Add Member']")).click();
		wait.until(ExpectedConditions
				.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']"))));
		// String SuccessPopUp = driver.get().findElement(By.xpath("//*[text()='Changes
		// Saved successfully.']")).getText();
		driver.get().findElement(By.xpath(
				"//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CloseIcon')]"))
				.click();
		ObjectRepo.test.log(Status.PASS, "Another Entity Added in the CAG");
		CommonLibref.scroll(CAGSaveBtn, "scrollToBottomOFPage", "CAGSaveBtn");
		CommonLibref.click(CAGSaveBtn, "javascriptClick", "CAGSaveBtn");
		// CAGSaveBtn.click();
		wait.until(ExpectedConditions.visibilityOf(continuePopUp));
		continuePopUp.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CAG Added Successfully']")));
		String CAGSuccessfulPopUp = driver.get().findElement(By.xpath("//*[text()='CAG Added Successfully']"))
				.getText();
		System.out.println(CAGSuccessfulPopUp);
		Assert.assertEquals(CAGSuccessfulPopUp, "CAG Added Successfully");
		ObjectRepo.test.log(Status.PASS, "CAG Added successfully");
		wait.until(ExpectedConditions.visibilityOf(closepopupforCAG));
		CommonLibref.click(closepopupforCAG, "seleniumClick", "closepopupforCAG");
//		try {
//			Thread.sleep(12000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='MORE ACTIONS']")));
		CAGId = driver.get()
				.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[1]"))
				.getText();
		System.out.println("CAG ID:" + CAGId);
	}

	public void SingleCag(String FilePath, String SheetName, int rowNum, int cellNum) throws InterruptedException {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(driver.get().findElement(By.xpath("//button[text()='MENU']")), "scrollToElement",
				"Scroll to MENU");
		try {
			driver.get().findElement(By.xpath("//button[text()='MENU']")).click();
		} catch (Exception e) {
			driver.get().findElement(By.xpath("//button[text()='MENU']")).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Corporate Associations']")));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.get().findElement(By.xpath("//*[text()='Corporate Associations']")).click();
		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[text()='Corporate Associations']")).click();
		}
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(moreaction));
		// moreaction.click();
		CommonLibref.click(moreaction, "javascriptClick", "moreaction");
		wait.until(ExpectedConditions.visibilityOf(AddNewGroup));
		AddNewGroup.click();
		int length = 10;
		String randomString = generateRandomString(length);
		System.out.println("Random String: " + randomString);
		String groupName = randomString;
		wait.until(ExpectedConditions.visibilityOf(CAGGroupName));
		CAGGroupName.sendKeys(groupName);
		CrossJurisdictionCheckbox.click();
		ObjectRepo.test.log(Status.PASS, "Group Name Entered");
		SelectJurisdiction.click();
		// CommonLibref.click(SelectJurisdiction, "javascriptClick", "CagJurisdiction");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(CagJurisdiction));
		CommonLibref.click(CagJurisdiction, "javascriptClick", "CagJurisdiction");

//	SelectJurisdiction.sendKeys(Keys.ARROW_DOWN);
//	SelectJurisdiction.sendKeys(Keys.ENTER);
//wait.until(ExpectedConditions.visibilityOf(CagJurisdiction));
		ObjectRepo.test.log(Status.PASS, "Jurisdiction is Selected");
		wait.until(ExpectedConditions.elementToBeClickable(CAGEntityID));
		CAGEntityID.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CAGEntityID.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		wait.until(ExpectedConditions.visibilityOf(CAGHoldingLimitShare));
		CAGHoldingLimitShare.sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(CAGPurchaseLimitShare));
		CAGPurchaseLimitShare.sendKeys("1");
		try {
			CommonLibref.scroll(CAGAddMemberBtn, "scrollToBottomOFPage", "Add Member scroll");
			Thread.sleep(2000);
			CommonLibref.click(CAGAddMemberBtn, "moveToElementClick", "CAGAddMemberBtn");
			ObjectRepo.test.log(Status.PASS, "Entity Added in the CAG");
		} catch (Exception e) {
			CommonLibref.scroll(CAGAddMemberBtn, "scrollToBottomOFPage", "Add Member scroll");
			CommonLibref.click(CAGAddMemberBtn, "moveToElementClick", "CAGAddMemberBtn");
		}

		wait.until(ExpectedConditions
				.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']"))));
		String SuccessPopUp = driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']")).getText();
		ObjectRepo.test.log(Status.PASS, "Entity Added in the CAG");
		driver.get().findElement(By.xpath(
				"//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']"))
				.click();
		System.out.println(SuccessPopUp);
		// Assert.assertEquals(SuccessPopUp, "Changes Saved successfully.");

//	wait.until(ExpectedConditions.elementToBeClickable(closePopup));
//	CommonLibref.click(closePopup, "seleniumClick", "closePopup");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(CAGSaveBtn1, "scrollToBottomOFPage", "CAGSaveBtn");
		CommonLibref.click(CAGSaveBtn1, "javascriptClick", "CAGSaveBtn");
		// CAGSaveBtn.click();
		wait.until(ExpectedConditions.visibilityOf(continuePopUp));
		continuePopUp.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CAG Added Successfully']")));
		String CAGSuccessfulPopUp = driver.get().findElement(By.xpath("//*[text()='CAG Added Successfully']"))
				.getText();
		System.out.println(CAGSuccessfulPopUp);
		Assert.assertEquals(CAGSuccessfulPopUp, "CAG Added Successfully");
		ObjectRepo.test.log(Status.PASS, "CAG Added successfully");
		wait.until(ExpectedConditions.visibilityOf(closepopupforCAG));
		CommonLibref.click(closepopupforCAG, "seleniumClick", "closepopupforCAG");
//	try {
//		Thread.sleep(12000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='MORE
		// ACTIONS']")));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CAGId1));
		wait.until(ExpectedConditions.elementToBeClickable(CAGId1));
		CAGId = CAGId1.getText();
		System.out.println("CAG ID:" + CAGId);
	}

	public void CrossJurisdictionCAG(String FilePath, String SheetName, int rowNum, int cellNum) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search Users']")));
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonLibref.scroll(driver.get().findElement(By.xpath("//button[text()='MENU']")), "scrollToElement",
				"Scroll to MENU");
		try {
			CommonLibref.click(Menu, "javascriptClick", "Menu");

		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.click(Menu).build().perform();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Corporate Associations']")));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.get().findElement(By.xpath("//*[text()='Corporate Associations']")).click();
		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[text()='Corporate Associations']")).click();
		}

		wait.until(ExpectedConditions.elementToBeClickable(SearchBox));
		SearchBox.click();
		SearchBox.sendKeys(CAGId);
		try {
			CommonLibref.click(CaggroupId, "javascriptClick", "CaggroupId");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(CaggroupId).click(CaggroupId).build().perform();
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(Edit));
		CommonLibref.click(Edit, "javascriptClick", "CaggroupId");
//	wait.until(ExpectedConditions.elementToBeClickable(moreaction));
//	moreaction.click();
		wait.until(ExpectedConditions.visibilityOf(CAGAddMemberBtn));
		CommonLibref.scroll(CAGAddMemberBtn, "scrollToElement", "CAGAddMemberBtn");
		js.executeScript("window.scrollBy(0,2000)");
		try {
			CommonLibref.click(CAGAddMemberBtn, "javascriptClick", "CAGAddMemberBtn");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(CAGAddMemberBtn).click(CAGAddMemberBtn).build().perform();
			e.printStackTrace();
		}

//	int length = 10;
//	String randomString = generateRandomString(length);
//	System.out.println("Random String: " + randomString);
//	String groupName = randomString;
//	wait.until(ExpectedConditions.visibilityOf(CAGGroupName));
//	CAGGroupName.sendKeys(groupName);
//	CrossJurisdictionCheckbox.click();
//	ObjectRepo.test.log(Status.PASS, "Group Name Entered");
//	SelectJurisdiction.click();
//	//CommonLibref.click(SelectJurisdiction, "javascriptClick", "CagJurisdiction");
//	try {
//		Thread.sleep(4000);
//	} catch (InterruptedException e) {
//		
//		e.printStackTrace();
//	}
//	wait.until(ExpectedConditions.elementToBeClickable(CagJurisdiction));
//	CommonLibref.click(CagJurisdiction, "javascriptClick", "CagJurisdiction");
//	
////	SelectJurisdiction.sendKeys(Keys.ARROW_DOWN);
////	SelectJurisdiction.sendKeys(Keys.ENTER);
////wait.until(ExpectedConditions.visibilityOf(CagJurisdiction));
//	ObjectRepo.test.log(Status.PASS, "Jurisdiction is Selected");
		wait.until(ExpectedConditions.elementToBeClickable(CAGEntityID1));
		CommonLibref.click(CAGEntityID1, "javascriptClick", "CAGAddMemberBtn");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CAGEntityID1.sendKeys(ExcelProperties.readFromExcel(FilePath, SheetName, rowNum, cellNum));
		wait.until(ExpectedConditions.visibilityOf(CAGHoldingLimitShare1));
		CAGHoldingLimitShare1.sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(CAGPurchaseLimitShare1));
		CAGPurchaseLimitShare1.sendKeys("1");
		try {
			CommonLibref.scroll(Check, "scrollToBottomOFPage", "Add Member scroll");
			Thread.sleep(2000);
			CommonLibref.click(Check, "moveToElementClick", "CAGAddMemberBtn");
			ObjectRepo.test.log(Status.PASS, "Entity Added in the CAG");
		} catch (Exception e) {
			CommonLibref.scroll(Check, "scrollToBottomOFPage", "Add Member scroll");
			CommonLibref.click(Check, "moveToElementClick", "Check");
		}

		wait.until(ExpectedConditions
				.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']"))));
		String SuccessPopUp = driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']")).getText();
		ObjectRepo.test.log(Status.PASS, "Entity Added in the CAG");
		driver.get().findElement(By.xpath(
				"//*[@data-testid='CloseIcon' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']"))
				.click();
		System.out.println(SuccessPopUp);
		// Assert.assertEquals(SuccessPopUp, "Changes Saved successfully.");

//	wait.until(ExpectedConditions.elementToBeClickable(closePopup));
//	CommonLibref.click(closePopup, "seleniumClick", "closePopup");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//	driver.get().findElement(By.xpath("//input[@id='entityId']")).sendKeys(entityID3);
//	driver.get().findElement(By.xpath("//input[@id='holdingLimitSharePercentage']")).sendKeys("1");
//	driver.get().findElement(By.xpath("//input[@id='purchaseLimitSharePercentage']")).sendKeys("1");
//	driver.get().findElement(By.xpath("//*[text()='Add Member']")).click();
//	wait.until(ExpectedConditions.visibilityOf(driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']"))));
//	//String SuccessPopUp = driver.get().findElement(By.xpath("//*[text()='Changes Saved successfully.']")).getText();
//	driver.get().findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']//..//*[contains(@data-testid,'CloseIcon')]")).click();
//	ObjectRepo.test.log(Status.PASS, "Another Entity Added in the CAG");
		CommonLibref.scroll(CAGSaveBtn, "scrollToBottomOFPage", "CAGSaveBtn");
		CommonLibref.click(CAGSaveBtn, "javascriptClick", "CAGSaveBtn");
		// CAGSaveBtn.click();
		wait.until(ExpectedConditions.visibilityOf(continuePopUp));
		continuePopUp.click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='CAG Added Successfully']")));
		String CAGSuccessfulPopUp = driver.get().findElement(By.xpath("//*[text()='CAG updated successfully']"))
				.getText();
		System.out.println(CAGSuccessfulPopUp);
	//	Assert.assertEquals(CAGSuccessfulPopUp, "CAG updated Successfully");
		ObjectRepo.test.log(Status.PASS, "CAG updated successfully");
//		wait.until(ExpectedConditions.visibilityOf(closepopupforCAG));
//		CommonLibref.click(closepopupforCAG, "seleniumClick", "closepopupforCAG");
////	try {
////		Thread.sleep(12000);
////	} catch (InterruptedException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='MORE ACTIONS']")));
//		CAGId = driver.get()
//				.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 css-1cpdyr0'])[1]"))
//				.getText();
//		System.out.println("CAG ID:" + CAGId);

	}

	public void activate_CAG() {
		driver.get().findElement(By.xpath("(//*[@type='button'])[27]")).click();
		wait.until(ExpectedConditions.visibilityOf(ActivateCAGbtn));
	//	ActivateCAGbtn.click();
		driver.get().findElement(By.xpath("//*[text()='Activate CAG']")).click();
//		wait.until(ExpectedConditions
//				.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Activated the CAG successfully']")));
		String ActivateCAGPopup = driver.get().findElement(By.xpath("//*[text()='Activated the CAG successfully']"))
				.getText();
		System.out.println(ActivateCAGPopup);
		Assert.assertEquals(ActivateCAGPopup, "Activated the CAG successfully");
		ObjectRepo.test.log(Status.PASS, "CAG Activated successfully");
//		wait.until(ExpectedConditions.visibilityOf(closepopupforCAG));
//		CommonLibref.click(closepopupforCAG, "seleniumClick", "closepopupforCAG");

	}

	public void CloseCag() {
		driver.get().findElement(By.xpath("(//*[@type='button'])[27]")).click();
		wait.until(ExpectedConditions.visibilityOf(closeCAGbtn));
		closeCAGbtn.click();
		driver.get().findElement(By.xpath("//*[text()='Close CAG']")).click();
//		wait.until(
//				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='CAG closed successfully']")));
		String CloseCAGPopup = driver.get().findElement(By.xpath("//*[text()='CAG closed successfully']")).getText();
		System.out.println(CloseCAGPopup);
		Assert.assertEquals(CloseCAGPopup, "CAG closed successfully");
		ObjectRepo.test.log(Status.PASS, "CAG Closed successfully");
//		wait.until(ExpectedConditions.visibilityOf(closepopupforCAG));
//		CommonLibref.click(closepopupforCAG, "seleniumClick", "closepopupforCAG");
	}

	public void clickOnFirstEntityId() {
		wait.until(ExpectedConditions.visibilityOf(firstEnityId));
		CommonLibref.click(firstEnityId, "seleniumClick", "firstEnityId");
	}

	public void ClickOnFinishButtonOnEntityPage() {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(Finishbtn));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0, 1200)");
		wait.until(ExpectedConditions.elementToBeClickable(Finishbtn));
		Actions action = new Actions(driver.get());
		action.moveToElement(Finishbtn).click(Finishbtn).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(EntityDetails));
		entityID = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//*[@class='MuiTypography-root MuiTypography-body1 css-ip80gu'])[1]"))).getText();
		System.out.println(entityID);
	}
}
