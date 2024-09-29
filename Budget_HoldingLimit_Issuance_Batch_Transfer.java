package pages;

import static constants.ThreadConstants.driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import Utilities.CommonMethods;
import Utilities.ObjectRepo;
import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import com.aventstack.extentreports.Status;
import Utilities.commonLib;

public class Budget_HoldingLimit_Issuance_Batch_Transfer {

	public static commonLib CommonLibref = new commonLib();
	public static CommonMethods Common = new CommonMethods();
	public static String AddBudgetYear;
	public static Actions actions;
	public static String allowancetransferId;

	private JavascriptExecutor js = (JavascriptExecutor) driver.get();

	String BudgetYear;
	String QuantityIssued;
	String JursdictionName;
	String AddBudgetYr;
	String AnnualAllowanceBudget;
	String ReserveAdjustedAllowanceBudget;
	String EditedAnnualAllowance;

	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;

	@FindBy(xpath = "//input[@name='Approve']")
	WebElement ApproveRadio;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButtonOnAdminDecisioncard;

	@FindBy(xpath = "//button[text()='CANCEL']")
	WebElement CancelBtn_popUp;

	@FindBy(xpath = "(//input[@type='search'])[2]")
	WebElement SearchProposeRecord;

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

	@FindBy(xpath = "//h6[text()='Confirm Proposal']")
	WebElement ProposeBudgetPopup;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[1]")
	WebElement EnterAnnualAllowanceBudget;

	@FindBy(xpath = "//button[text()='Propose']")
	WebElement ButtonPropose;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	WebElement SuccessCross;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	WebElement TransferID;

	@FindBy(xpath = "//*[text()='All Budget Records']")
	WebElement AllBudgetRecordPageTitle;

	@FindBy(xpath = "//button[text()='CONTINUE']")
	WebElement ProposeBudgetPopupContinueButton;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[2]")
	WebElement EnterReserveAdjustedAllowanceBudget;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[3]")
	WebElement EnterAnnualAllowanceBudget2;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[4]")
	WebElement EnterReserveAdjustedAllowanceBudget2;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[5]")
	WebElement EnterAnnualAllowanceBudget3;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq'])[6]")
	WebElement EnterReserveAdjustedAllowanceBudget3;

	@FindBy(xpath = "(//div[@data-field='budgetYear'])[2]")
	WebElement AddBudgetRecordYear1;

	@FindBy(xpath = "(//div[@data-field='budgetYear'])[3]")
	WebElement AddBudgetRecordYear2;

	@FindBy(xpath = "(//div[@data-field='budgetYear'])[4]")
	WebElement AddBudgetRecordYear3;

	@FindBy(xpath = "//div[@data-testid='SubType']")
	WebElement SubTypeDropdown;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	WebElement SuccessMsg;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	WebElement SuccessCros;

	@FindBy(xpath = "//p[text()='Confirm Issuance Proposal']")
	WebElement MsgSubmitConfirm;

	@FindBy(xpath = "//input[@id='passphrase']")
	WebElement Passphrase;

	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	WebElement SubmitButton;

	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement ConfirmBtn;

	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[4]")
	WebElement SuccessMsgCancel;

	@FindBy(xpath = "//input[@id='SubType-react-hook-form-select-search']")
	WebElement SubTypeDropdown_input;

	@FindBy(xpath = "(//*[@role='option'])[1]")
	WebElement SubType1;

	@FindBy(xpath = "//a[text()='HOME']")
	public WebElement HomeMenu;

	@FindBy(xpath = "//p[text()='All Jurisdiction Accounts']")
	WebElement JurisdictionAccountsGrid;

	@FindBy(xpath = "(//*[@data-testid='ExpandMoreIcon'])[3]")
	WebElement JurisdictionAccountsGrid2;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	WebElement FirstElement;

	@FindBy(xpath = "(//input[@placeholder='Search…'])[4]")
	WebElement SearchJurisdictionAcc;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 link-cell css-j4m1we']")
	WebElement IssuanceAccounts;

	@FindBy(xpath = "//h1[text()='Issuance Account']")
	WebElement IssuanceAccountPageTitle;

	@FindBy(xpath = "//*[@id='panel1a-header']")
	WebElement AllJurisdiction;

	@FindBy(xpath = "(//input[@type='search'])[1]")
	WebElement SearchEffectiveRecord;

	@FindBy(xpath = "//p[text()='MANAGE BUDGET']")
	WebElement ManageBudget;

	@FindBy(xpath = "//h1[text()='Manage Jurisdiction Budget']")
	WebElement ManageBudgetPageTitle;

	@FindBy(xpath = "(//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk'])[1]")
	WebElement QuickActionCalifornia;

	@FindBy(xpath = "//button[text()='MORE ACTIONS']")
	WebElement MoreActionsBtn;

	@FindBy(xpath = "//p[text()='Jurisdiction Accounts']")
	private WebElement JurisdictionAccounts_Link;

	@FindBy(xpath = "//p[text()='ALLOWANCE ISSUANCE']")
	WebElement AllowanceIssuanceSubMenu;

	@FindBy(xpath = "//h1[text()='Allowance Issuance']")
	WebElement AllowanceIssuancePageTitle;

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'][1]")
	WebElement loggedInJurisdictionName;

	@FindBy(xpath = "//input[@id='Quantity']")
	WebElement quantity;

	@FindBy(xpath = "//h1[text()='Allowance Issuance Details']")
	WebElement AllowanceIssuanceDetailsPageTitle;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[3]")
	WebElement TransferStatusValue2;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	WebElement TransferIdValue;

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd'])[1]")
	WebElement TransferId;

	@FindBy(xpath = "//a[text()='My Approvals']")
	WebElement MyApprovalsLabelAuth;

	@FindBy(xpath = "(//select[@class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input css-1vynybe'])[4]")
	WebElement SecondFilterColumn;

	@FindBy(xpath = "(//input[@placeholder='Filter value'])[2]")
	WebElement secondFiltervalue;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e']")
	WebElement IdHyperlink;

	@FindBy(xpath = "//div[text()='Proposed Holding Limit Changes']")
	WebElement ProposedHoldingLimitChangesLabel;

	@FindBy(xpath = "//div[text()='Approve Request']")
	WebElement ApproveRequestCard;

	@FindBy(xpath = "//button[@aria-label='Show filters']")
	WebElement Filters;

	@FindBy(xpath = "//*[text()='Add filter']")
	WebElement AddFilter;

	@FindBy(xpath = "//input[@placeholder='Filter value']")
	WebElement Filtervalue;

	@FindBy(xpath = "//a[text()='View Holding Limits']")
	WebElement ViewHoldingLimitLabel;

	@FindBy(xpath = "(//div[@data-field='budgetYear'])[2]")
	WebElement budgetYear;

	@FindBy(xpath = "//p[text()='EDIT']")
	WebElement EditBtn;

	@FindBy(xpath = "//div[text()='Edit Holding Limit Record']")
	WebElement EditManageHoldingLimitTitle;

	@FindBy(xpath = "//input[@data-testid='quantity']")
	WebElement QuantityTextField;

	@FindBy(xpath = "//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-sf5fa6']")
	WebElement QuantityErrorMsg;

	@FindBy(xpath = "//input[@data-testid='description']")
	WebElement DescriptionTextField;

	@FindBy(xpath = "//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-sf5fa6'][1]")
	WebElement DescriptionErrorMsg;

	@FindBy(xpath = "//p[text()='Description must not be more than 8000 characters']")
	WebElement DescriptionTextFieldError;

	@FindBy(xpath = "//*[@data-testid='comment']")
	WebElement CommentTextField;

	@FindBy(xpath = "//button[text()='Propose']")
	WebElement ProposeBtn;

	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement CancleBtn;

	@FindBy(xpath = "//*[text()='Edit Holding Limit Record']/following::button[@type='button'][1]")
	WebElement CancleBtn2;

	@FindBy(xpath = "(//*[@data-testid='MoreHorizIcon'])[1]")
	WebElement QuickActionBtn;

	@FindBy(xpath = "//h1[text()='Manage Holding Limits']")
	WebElement ManageHoldingLimitTitle;

	@FindBy(xpath = "//input[@type='search']")
	WebElement Search;

	@FindBy(xpath = "(//div[@data-field='transferId'])[2]")
	WebElement SearchedTransferId;

	@FindBy(xpath = "//h1[text()='Allowance Issuance Details']")
	WebElement AllowanceIssunanceDetailTitle;

	@FindBy(xpath = "//input[@name='Approve']")
	WebElement ApproveRadioBtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMediumcss-5zd7v5']")
	public WebElement CrossBtn;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//input[@type='password']")
	WebElement PassphraseText;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement ConfirmBtn_popUp;

	@FindBy(xpath = "//h1[text()='Budget Records']")
	public WebElement BudgetRecordsHeadingBudgetRecordsPage;

	@FindBy(xpath = "//button[text()='Add Budget Records']")
	WebElement ButtonAddBudgetRecords;

	@FindBy(xpath = "//h1[text()='Add Budget Records']")
	WebElement HeadingAddBudgetRecords;

	@FindBy(xpath = "//a[text()='Proposed Budget Records']")
	WebElement ProposedBudgetRecordLabel;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputTypeSearch MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-c6bojz'])[2]")
	WebElement SearchProposeBudget;
	@FindBy(xpath = "(//*[@placeholder='Search…'])[2]")
	WebElement SearchRecord;

	@FindBy(xpath = "(//*[@data-testid='CheckBoxOutlineBlankIcon'])[2]")
	WebElement SelectRecord2;

	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	WebElement SelectRecord;

	@FindBy(xpath = "//input[@name='Propose to Authority']")
	WebElement ProposeToAuthRadio;

	@FindBy(xpath = "//textarea[@data-testid='comment']")
	WebElement CommentField;

	public Budget_HoldingLimit_Issuance_Batch_Transfer() {
		PageFactory.initElements(driver.get(), this);
	}

	public void navigateToAddBudgetRecordsPage_WCIAdmin() {
		Common.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(ButtonAddBudgetRecords));
		js.executeScript("arguments[0].click();", ButtonAddBudgetRecords);
		wait.until(ExpectedConditions.visibilityOf(HeadingAddBudgetRecords));
		Assert.assertTrue(HeadingAddBudgetRecords.isDisplayed());
	}

	public void navigateToBudgetRecordsPage_JAdmin() {
		commonLib CM = new commonLib();
		js.executeScript("window.scrollBy(0,450)");
		wait.until(ExpectedConditions.elementToBeClickable(ProposedBudgetRecordLabel));
		CM.click2(ProposedBudgetRecordLabel, "javascriptClick", "Label");
	}

	public void ProposeToAuthority() {
		CommonLibref.pageLoader();
		js.executeScript("window.scrollBy(0,950)");
		wait.until(ExpectedConditions.visibilityOf(SearchProposeBudget));
		wait.until(ExpectedConditions.elementToBeClickable(SearchProposeBudget));
		SearchProposeBudget.sendKeys(AddBudgetYear);
		wait.until(ExpectedConditions.elementToBeClickable(SelectRecord2));
		actions.moveToElement(SelectRecord2).click().build().perform();
		actions.moveToElement(ProposeToAuthRadio).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(SubmitBtn));
		js.executeScript("arguments[0].click();", SubmitBtn);
		PassphraseText.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		js.executeScript("arguments[0].click();", ConfirmBtn_popUp);
		wait.until(ExpectedConditions.visibilityOf(SuccessMsg));
		Assert.assertEquals(SuccessMsg.getText(),
				"The budget record was successfully proposed to the Authority for approval");
		ObjectRepo.test.log(Status.PASS,
				"'The budget record was successfully proposed to the Authority for approval' Toast success message is displayed");
		js.executeScript("arguments[0].click();", SuccessCross);
		ObjectRepo.test.log(Status.PASS, "Record Proposed To Authority successfully.");
		wait.until(ExpectedConditions.visibilityOf(BudgetRecordsHeadingBudgetRecordsPage));
		Assert.assertTrue(BudgetRecordsHeadingBudgetRecordsPage.isDisplayed());
	}

	public void verifyApproveFunctionality_JAuth() {
		// navigateToBudgetRecordsPage_JAdmin();
		js.executeScript("window.scrollBy(0,850)");
		SearchRecord.sendKeys(AddBudgetYear);
		// SearchProposeRecord
		ObjectRepo.test.log(Status.PASS, "Select one or more budget record");
		wait.until(ExpectedConditions.elementToBeClickable(SelectRecord2));
		js.executeScript("arguments[0].click();", SelectRecord);
		ObjectRepo.test.log(Status.PASS,
				"Jurisdiction Authority is able to select one or more budget record at a time");
		ObjectRepo.test.log(Status.PASS, "Select the 'Approve' radio button");
		try {
			CommonLibref.click(ApproveRadio, "javascriptClick", "ApproveRadio");
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
		try {
			CommonLibref.click(SubmitButtonOnAdminDecisioncard, "javascriptClick", "SubmitButtonOnAdminDecisioncard");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(SubmitButtonOnAdminDecisioncard).click(SubmitButtonOnAdminDecisioncard).build()
					.perform();
			e.printStackTrace();
		}
//		Assert.assertTrue(
//				ConfirmBtn_popUp.isDisplayed() && CancelBtn_popUp.isDisplayed() && PassphraseText.isDisplayed());
//		ObjectRepo.test.log(Status.PASS,
//				"Confirmation popup is display with 'Passphrase' text field along with 'Cancel' and 'Confirm' button");
//		ObjectRepo.test.log(Status.PASS, "Click on 'Cancel' button of popup message.");
//		CancelBtn_popUp.click();
//		Assert.assertTrue(DecisionCardHeading.isDisplayed());
//		ObjectRepo.test.log(Status.PASS, "Pop-up is closed and Jurisdiction Authority stays on same page");
//		ObjectRepo.test.log(Status.PASS, "Again click on 'Submit' button and enter the valid Passphrase.");
//		SubmitButtonOnAdminDecisioncard.click();
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

	public void proposeBudgetRecord() {
		actions = new Actions(driver.get());
		AddBudgetYear = AddBudgetRecordYear1.getText();
		System.out.println("add Budget Yr is - " + AddBudgetYear);
		AddBudgetYr = AddBudgetRecordYear2.getText();
		EnterAnnualAllowanceBudget.sendKeys("1000");
		EnterReserveAdjustedAllowanceBudget.sendKeys("100");
		AnnualAllowanceBudget = EnterAnnualAllowanceBudget.getAttribute("value");
		ReserveAdjustedAllowanceBudget = EnterReserveAdjustedAllowanceBudget.getAttribute("value");
		js.executeScript("window.scrollBy(0,750)");
		Assert.assertTrue(ButtonPropose.isEnabled());
		ObjectRepo.test.log(Status.PASS,
				"WCI Inc. Admin enters the values in the text fields and 'Propose' button gets enabled.");
		wait.until(ExpectedConditions.elementToBeClickable(ButtonPropose));
		js.executeScript("arguments[0].click();", ButtonPropose);
		ProposeBudgetPopupContinueButton.click();
		Common.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(SuccessCross));
		js.executeScript("arguments[0].click();", SuccessCross);
		ObjectRepo.test.log(Status.PASS, AddBudgetYear + " Budget Record proposed successfully.");
	}

	public void Navigate_To_IssuanceAccount() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.elementToBeClickable(HomeMenu));
		js.executeScript("arguments[0].scrollIntoView();", JurisdictionAccountsGrid);
		CommonLibref.click(JurisdictionAccountsGrid2, "seleniumClick", "Element");
		SearchJurisdictionAcc.sendKeys("Issuance");
		js.executeScript("arguments[0].click();", FirstElement);
		String Title = IssuanceAccountPageTitle.getText();
		Assert.assertEquals(Title, "Issuance Account");
		ObjectRepo.test.log(Status.PASS, "User navigated to Issuance Account page");
	}

	public void navigateToManageJurisdictionBudget_WCIAdmin() {
		wait.until(ExpectedConditions.elementToBeClickable(AllJurisdiction));
		AllJurisdiction.click();
		jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		homepageSearchOption.sendKeys(jp.fetchStoredJurisdictionNameValue(0));
		js.executeScript("window.scrollBy(0,350)");
		wait.until(ExpectedConditions.elementToBeClickable(QuickActionCalifornia));
		js.executeScript("arguments[0].click();", QuickActionCalifornia);
		ManageBudget.click();
		wait.until(ExpectedConditions.visibilityOf(ManageBudgetPageTitle));
		Assert.assertTrue(ManageBudgetPageTitle.isDisplayed());
	}

	public void navigateToAllowanceIssuancePage() {
		wait.until(ExpectedConditions.elementToBeClickable(MoreActionsBtn));
		MoreActionsBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(AllowanceIssuanceSubMenu));
		AllowanceIssuanceSubMenu.click();
		wait.until(ExpectedConditions.visibilityOf(AllowanceIssuancePageTitle));
		String PageTitle = AllowanceIssuancePageTitle.getText();
		Assert.assertEquals(PageTitle, "Allowance Issuance");
		System.out.println("Jurisdiction Admin navigated to Allowance Issuance page");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Admin navigated to Allowance Issuance page");
		wait.until(ExpectedConditions.visibilityOf(loggedInJurisdictionName));
		JursdictionName = loggedInJurisdictionName.getText();
		System.out.println("Jursdiction Name is :" + JursdictionName);
	}

	public void ProposeAllowanceIssuance_SubType() {
		CommonLibref.pageLoader();
		js.executeScript("window.scrollBy(0,1800)");
		wait.until(ExpectedConditions.elementToBeClickable(SubTypeDropdown));
		commonLib CM = new commonLib();
		CM.click2(SubTypeDropdown, "javascriptClick", "SubTypeDropdown");
		wait.until(ExpectedConditions.elementToBeClickable(SubType1));
		// SubType1.click();
		CommonLibref.click(SubType1, "javascriptClick", "SubType1");
		String SubTypeval = SubTypeDropdown_input.getAttribute("value");
		ObjectRepo.test.log(Status.PASS, "Sub Type value selected is: " + SubTypeval);
		quantity.sendKeys("150000");
		QuantityIssued = quantity.getAttribute("value");
		ObjectRepo.test.log(Status.PASS, "Proposed Quantity is: " + QuantityIssued);
		Assert.assertTrue(SubmitButton.isEnabled());
		ObjectRepo.test.log(Status.PASS, "Submit button is enabled");
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		// CM.click2(SubmitButton, "moveToElementClick", "SubmitButton");
		try {
			CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(SubmitButton).click(SubmitButton).build().perform();
			e.printStackTrace();
		}
		PassphraseText.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		js.executeScript("arguments[0].click();", ConfirmBtn_popUp);
		wait.until(ExpectedConditions.visibilityOf(MsgSubmitConfirm));
		String SubmitMsg = MsgSubmitConfirm.getText();
//		Assert.assertEquals(SubmitMsg, "The allowance issuance proposal was submitted successfully.");
		ObjectRepo.test.log(Status.PASS, SubmitMsg);
		System.out.println(SubmitMsg);
		CommonLibref.pageLoader();
		// SuccessCross.click();
		try {
			CommonLibref.click(SuccessCross, "javascriptClick", "SubmitButton");
		} catch (Exception e) {
			Actions action = new Actions(driver.get());
			action.moveToElement(SuccessCross).click(SuccessCross).build().perform();
			e.printStackTrace();
		}
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(TransferID));
		wait.until(ExpectedConditions.elementToBeClickable(TransferID));
		allowancetransferId =TransferID.getText();
        System.out.println(allowancetransferId);
		// Assert.assertTrue(AllowanceIssuancePageTitle.isDisplayed());
	}

	public void navigateToMyApprovals_JAuth() {
		js.executeScript("window.scrollBy(0,450)", "");
		wait.until(ExpectedConditions.elementToBeClickable(MyApprovalsLabelAuth));
		js.executeScript("arguments[0].click();", MyApprovalsLabelAuth);
	}

	public void navigateToManageHoldingLimitPage_JAuth() {
		Filters.click();
		Filtervalue.sendKeys(BudgetYear);
		AddFilter.click();
		Select dropdown = new Select(SecondFilterColumn);
		dropdown.selectByValue("type");
		secondFiltervalue.sendKeys("Holding Limit");
		Filters.click();
		js.executeScript("arguments[0].click();", IdHyperlink);
		Assert.assertTrue(ProposedHoldingLimitChangesLabel.isDisplayed());
		js.executeScript("window.scrollBy(0,850)", "");
		Assert.assertTrue(ApproveRequestCard.isDisplayed());
		ObjectRepo.test.log(Status.PASS,
				"User is redirected to Manage Holding Limits which has 'Approval request' card.");
	}

	public void verifyApproveFunctionality_MHL_JAuth() {
		commonLib CM = new commonLib();
		CommonLibref.pageLoader();
		js.executeScript("window.scrollBy(0,750)", "");
		ExpectedConditions.elementToBeClickable(ApproveRadioBtn);
		CM.click2(ApproveRadioBtn, "moveToElementClick", "ApproveRadionBtn");
		Assert.assertTrue(SubmitBtn.isEnabled());
		ExpectedConditions.elementToBeClickable(SubmitBtn);
		CM.click2(SubmitBtn, "moveToElementClick", "SubmitBtn");
		wait.until(ExpectedConditions.visibilityOf(SuccessMsg));
		Assert.assertEquals(SuccessMsg.getText(), "The holding limit has been successfully Approved");
		ObjectRepo.test.log(Status.PASS,
				"Success message is displayed as 'The holding limit has been successfully Approved'");
		System.out.println(SuccessMsg.getText());

//		ExpectedConditions.elementToBeClickable(CrossBtn);
//		try {
//			CrossBtn.click();
//		} catch (Exception e) {
//			CM.click(SubmitBtn, "seleniumClick", "SubmitBtn");
//		}
//		ExpectedConditions.visibilityOf(ManageHoldingLimitTitle);
//		Assert.assertTrue(ManageHoldingLimitTitle.isDisplayed());
//		ObjectRepo.test.log(Status.PASS, "User is redirected to 'Manage Holding Limits' page");
	}

	public void navigateAllowanceIssuanceDetailPage_MyApprovals() {
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(Search));
		Search.sendKeys(allowancetransferId);
		SearchedTransferId.click();
		Assert.assertEquals(AllowanceIssunanceDetailTitle.getText(), "Allowance Issuance Details");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Authority navigated to Allowance Issuance Details Page");
	}

	public void verifyApproveAllowanceFunctionality_JAuth_Sanity() {
		ObjectRepo.test.log(Status.PASS, "Step 2 : Click on Approve Radio button and Click on Submit button");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].click();", ApproveRadioBtn);
		Assert.assertTrue(SubmitBtn.isEnabled());
		ObjectRepo.test.log(Status.PASS, "Submit button is enabled post clicking on Approve Radio button");
		js.executeScript("arguments[0].click();", SubmitBtn);
		wait.until(ExpectedConditions.visibilityOf(SuccessMsg));
		Assert.assertEquals(SuccessMsg.getText(),
				"The issuance has been approved and compliance instrument holdings created.");
		ObjectRepo.test.log(Status.PASS,
				"The issuance has been approved and compliance instrument holdings created.' success message gets displayed");
		SuccessMsgCancel.click();
		ExpectedConditions.visibilityOf(AllowanceIssuanceDetailsPageTitle);
		Assert.assertEquals(AllowanceIssuanceDetailsPageTitle.getText(), "Allowance Issuance Details");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Authority gets navigated to 'Allowance Issuance Detail' Page");
		Assert.assertEquals(TransferStatusValue2.getText(), "Complete");
		ObjectRepo.test.log(Status.PASS, "Transfer Status is updated to 'Complete'");
	}

	public void navigateToMyApprovals_JAuth1() {
		wait.until(ExpectedConditions.elementToBeClickable(MyApprovalsLabelAuth));
		try {
			MyApprovalsLabelAuth.click();
		} catch (Exception ex) {
			js.executeScript("arguments[0].click();", MyApprovalsLabelAuth);
		}
	}

	public void navigate_ManageHoldingLimitsPage() {
		actions = new Actions(driver.get());
		js.executeScript("window.scrollBy(0,650)", "");
		wait.until(ExpectedConditions.elementToBeClickable(ViewHoldingLimitLabel));
		js.executeScript("arguments[0].click();", ViewHoldingLimitLabel);
		Assert.assertEquals(ManageHoldingLimitTitle.getText(), "Manage Holding Limits");
		ObjectRepo.test.log(Status.PASS, "User navigated to Manage Holding Limits page");
	}

	public void navigate_EditManageHoldingLimitsPage() {
		BudgetYear = budgetYear.getText();
		QuickActionBtn.click();
		EditBtn.click();
		Assert.assertTrue(EditManageHoldingLimitTitle.isDisplayed());
		ObjectRepo.test.log(Status.PASS, "Jurisdiction Admin navigated to Edit Holding Limit Page");
	}

	public void EditHoldingLimitFunctionality() {
		CommonLibref.pageLoader();
		js.executeScript("arguments[0].scrollIntoView();", DescriptionTextField);
		int ValueSize3 = DescriptionTextField.getAttribute("value").length();
		for (int i = 0; i <= ValueSize3 - 1; i++) {
			DescriptionTextField.sendKeys(Keys.BACK_SPACE);
		}
		ExpectedConditions.visibilityOf(DescriptionTextField);
		DescriptionTextField.sendKeys("Holding Limit test");
		int ValueSize1 = QuantityTextField.getAttribute("value").length();
		for (int i = 1; i <= ValueSize1; i++) {
			QuantityTextField.sendKeys(Keys.BACK_SPACE);
		}
		QuantityTextField.sendKeys("100000");
		int ValueSize2 = CommentTextField.getAttribute("value").length();
		for (int i = 1; i <= ValueSize2; i++) {
			CommentTextField.sendKeys(Keys.BACK_SPACE);
		}
		CommentTextField.sendKeys("Test New Comment");
		wait.until(ExpectedConditions.elementToBeClickable(ProposeBtn));
		js.executeScript("arguments[0].click();", ProposeBtn);
		wait.until(ExpectedConditions.visibilityOf(SuccessMsg));
		Assert.assertEquals(SuccessMsg.getText(), "Holding Limits have been submitted successfully");
		ObjectRepo.test.log(Status.PASS,
				"Success message is displayed as 'Holding Limits have been submitted successfully'");
		wait.until(ExpectedConditions.elementToBeClickable(SuccessCros));
		js.executeScript("arguments[0].click();", SuccessCros);
		Assert.assertEquals(ManageHoldingLimitTitle.getText(), "Manage Holding Limits");
		ObjectRepo.test.log(Status.PASS, "User navigated to Manage Holding Limits page");
	}
}
