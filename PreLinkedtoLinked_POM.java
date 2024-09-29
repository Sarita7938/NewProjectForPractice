package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;

import static constants.ThreadConstants.driver;

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
import Utilities.commonLib;
import Utilities.listeners;

import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ExcelProperties;
import Utilities.ObjectRepo;

public class PreLinkedtoLinked_POM {
	public static CommonMethods Common = new CommonMethods();
	String EnterComment;

	@FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
	private WebElement ClickDropdownHomePage;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium dot-icon css-1ylescl']")
	private WebElement quickActionsOnHomePage;
	@FindBy(xpath = "//*[text()='MANAGE JURISDICTION STATUS']")
	private WebElement manageJurisdictionStatusOption;
	@FindBy(xpath = "//h2[text()='Jurisdiction Request and Status Change History']")
	private WebElement statusChangeHistory;
	@FindBy(xpath = "(//*[text()='Jurisdiction Status'])[2]")
	public WebElement JurisdictionStatusHeader;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//..//input[@placeholder='--Select--']")
	private WebElement searchFieldOfJurisdictionStatus;
	@FindBy(xpath = "//label[text()='Jurisdiction Status']//..//input[@value='Linked']")
	private WebElement saveLinkedStatus;
	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	private WebElement dateDropdownoption;
	@FindBy(xpath = "//*[@placeholder='YYYY/MM/DD']")
	private WebElement errorMessageForDateOfLinkage;
	@FindBy(xpath = "//*[contains(text(),'Date Of Joining is required')]")
	private WebElement errorMessageForDateOfLinkage01;
	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@tabindex='0']/following-sibling::button[@tabindex='-1']")
	private WebElement selectDate;
	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@aria-current='date']")
	private WebElement selectCurrentDate;
	@FindBy(xpath = "//*[@data-testid='CheckBoxOutlineBlankIcon']")
	private WebElement acknowledgeCheckbox;
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelButtonOnSetUpNewJurisdiction;
	@FindBy(xpath = "//h6[text()='Warning!']")
	private WebElement WarningPopupOnIntialPage;
	@FindBy(xpath = "//h6[text()='Warning!']//..//button[text()='CANCEL']")
	private WebElement cancelButtonOnWarningPopopup;
	@FindBy(xpath = "//button[text()='CANCEL']")
	private WebElement cancelButtonOnManagedStatus;
	@FindBy(xpath = "//*[@data-testid='priv_modal_Continue']")
	private WebElement continueBTNOnWarningPopup;
	@FindBy(xpath = "//h4[text()='Manage Jurisdictions']")
	private WebElement manageJurisdictions;
	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;
	@FindBy(xpath = "//*[text()='Manage Jurisdiction Status']")
	public WebElement headingOfManageJurisdictionStatusPage;
	@FindBy(xpath = "//h4[text()='Manage Jurisdictions']")
	public WebElement homePage;
	@FindBy(xpath = "//div[@class='MuiBox-root css-1ytub8b']//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd']")
	public WebElement JurisdictionInLinkage;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	public WebElement SubmitButton;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	public WebElement ConfirmationTextonConfirmationPopup;
	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@tabindex='0']")
	public WebElement CurrentDateFail;
	@FindBy(xpath = "//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//..//button[@tabindex='0']/preceding-sibling::button[@tabindex='-1'][1]")
	private WebElement selectpreviousDate;
	@FindBy(xpath = "(//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained MuiFormHelperText-filled css-sf5fa6'])[1]")
	public WebElement DateofLinkageErrorText;
	@FindBy(xpath = "(//input[@name='dateOfLinkage'])[1]")
	public WebElement ClickonDateofLinkageText;
	@FindBy(xpath = "//input[@placeholder='hh:mm aa']")
	public WebElement ClickonTimeOfLinkageText;
	// @FindBy (xpath="(//p[@class='MuiFormHelperText-root Mui-error
	// MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-sf5fa6'])[1]")
	@FindBy(xpath = "//p[@id='comment-helper-text']")
	public WebElement CaptureErrorMessageBlankText;
	@FindBy(xpath = "(//p[@class='MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained css-sf5fa6'])[1]")
	public WebElement DateofLinkageErrorMessage;
	@FindBy(xpath = "(//div[@title='New Jurisdiction82599'])[1]")
	public WebElement TitleJurisdiction;
	@FindBy(xpath = "//input[@data-testid='passphrase']")
	public WebElement PassphraseTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement PassphraseSubmitButton;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement PassphraseErrorMessage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	public WebElement PassphraseErrorMessageHeading;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[3]")
	public WebElement FailedMessageclosebutton;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[4]")
	public WebElement SuccessMessageclosebutton;
	// @FindBy (xpath = "(//*[@data-testid='CloseIcon'])[2]")
	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-subtitle1 css-w9jsk0')]//..//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv']")
	public WebElement CancelSuccessMessageButton;
	@FindBy(xpath = "(//*[@data-testid='CloseIcon'])[5]")
	public WebElement RequestRevisionSuccessMessageCloseButton;
	@FindBy(xpath = "//*[text()='MORE ACTIONS']")
	public WebElement MoreActions;
	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1yfaah8'])[1]")
	public WebElement CancelProposalButton;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398'])[1]")
	public WebElement CommentonCancelProposal;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	public WebElement CancelStatusButton;
	@FindBy(xpath = "//*[text()='Manage Jurisdiction Details']")
	public WebElement ManageJurisdictionDetails;
	@FindBy(xpath = "//*[text()='CANCEL PROPOSED STATUS']")
	public WebElement CancelledProposedButton;
	@FindBy(xpath = "//*[text()='EDIT']")
	public WebElement EditButton;
	@FindBy(xpath = "//*[text()='MANAGE STATUS']")
	public WebElement ManageStatusButton;
	@FindBy(xpath = "//*[text()='RETURN TO HOME PAGE']")
	public WebElement ReturntoHomePageButton;
	@FindBy(xpath = "//div[text()='No rows']")
	public WebElement Norows;
	@FindBy(xpath = "//*[text()='My Approvals']")
	public WebElement MyApprovals;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 link-cell css-1195g5e'])[1]")
	public WebElement IDonMyApproval;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	public WebElement SearchonMyApproval;
	@FindBy(xpath = "//h1[@class='MuiTypography-root MuiTypography-h1 css-qbgv2a']")
	public WebElement WCIHomePage;
	@FindBy(xpath = "//*[@data-testid='priv_btn_Reset']")
	public WebElement NoonCancelPopup;
	@FindBy(xpath = "//*[@name='Request Revisions']")
	public WebElement JurisdictionDetailsRequestRevision;
	// @FindBy (xpath="(//*[@class='MuiInputBase-input MuiOutlinedInput-input
	// MuiInputBase-inputMultiline css-u36398'])[1]")
	@FindBy(xpath = "// textarea[@data-testid='comment']")
	public WebElement JurisdictionDetailsComment;
	@FindBy(xpath = "//*[text()='Manage Jurisdiction Details']")
	public WebElement ManageJurisdictionPage;
	@FindBy(xpath = "//*[text()='Jurisidiction Details']")
	public WebElement JurisdictionDetails;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[2]")
	private WebElement RevisionRadioButton;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[1]")
	private WebElement ApproveRadioButton;
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-13tw421']")
	private WebElement HomepageVerificationSearchUsers;
	@FindBy(xpath = "(//div[@title='Proposed for Linked'])[1]")
	public WebElement StatusonMyApproval;
	@FindBy(xpath = "//*[text()='*']")
	public WebElement AstrickMark;
	@FindBy(xpath = "//p[@id='comment-helper-text']")
	public WebElement CommentErrorMessage;
	@FindBy(xpath = "//*[@data-testid='current-holding-details']")
	public WebElement CancelonJurisdictionStatus;
	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement cancelButtonOnPopup;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-h2 css-yj408y'])[2]")
	public WebElement JurisdictionRequestCardonJurisdictionDetails;
	@FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-h2 css-yj408y'])[3]")
	public WebElement statusHistoryTableName;
	@FindBy(xpath = "(//*[@data-field='requestStatus'])[2]")
	public WebElement FirstRequestStatusonJurisdictonDetails;
	@FindBy(xpath = "(//*[@data-field='jurisdictionStatus'])[2]")
	public WebElement FirstJurisdictionStatusonJurisdictonDetails;
	@FindBy(xpath = "(//*[@data-field='comment'])[2]")
	public WebElement FirstCommentonJurisdictonDetails;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-17dsxig']")
	public WebElement RequestRevisionCommentForWCI;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[1]")
	public WebElement EnteredDate;
	@FindBy(xpath = "(//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2'])[2]")
	public WebElement EnteredTime;
	@FindBy(xpath = "//input[@placeholder='--Select--']")
	public WebElement LinkedStatusDisplayed;
	@FindBy(xpath = "(//*[text()='JURISDICTION MANAGEMENT']//..//*[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-1d4ad'])[1]")
	public WebElement pedingApproval;
	
	
	JavascriptExecutor js;
	public static String linkedstatus;
	public static commonLib CommonLibref = new commonLib();

	public PreLinkedtoLinked_POM() {
		PageFactory.initElements(driver.get(), this);
	}

	public void expandAllJurisdictionsOnHomePage() {
		System.out.println("Step: Click on All Jurisdictions Dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		try {

			CommonLibref.click(ClickDropdownHomePage, "moveToElementClick", "ClickDropdownHomePage");
			wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
			System.out.println("Click on All Jurisdictions1");
		} catch (NoSuchElementException e) {
			ClickDropdownHomePage.click();
			wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
			System.out.println("Click on All Jurisdictions2");
		} catch (Exception e) {
			CommonLibref.scroll(ClickDropdownHomePage, "javascriptClick", "ClickDropdownHomePage");
			wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
			System.out.println("Click on All Jurisdictions3");
		}
		System.out.println("All Jurisdictions is displayed.");
		ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");

	}

	public void SelectJurisdictionOtherThanOnboarding() {
		wait.until(ExpectedConditions.elementToBeClickable(homepageSearchOption));
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		String JurisdictionName = "Paris";
		homepageSearchOption.sendKeys(JurisdictionName);
		System.out.println("Enter Jurisdiction Name = " + JurisdictionName);
	}

	public void selectManageJurisdictionStatusOptionFromQuickActions() {
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		// Thread.sleep(5000);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		wait.until(ExpectedConditions.visibilityOf(TitleJurisdiction));
		WebElement quickActions2 = driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']"));
		wait.until(ExpectedConditions.elementToBeClickable(quickActions2));
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(quickActions2).click(quickActions2).build().perform();
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action of Home Page1");

		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", quickActions2);
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action of Home Page2");

		} catch (Exception e) {
			driver.get().findElement(By.xpath("//*[@data-testid='MoreHorizIcon']")).click();
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
			ObjectRepo.test.log(Status.PASS, "Step :Click on Quick Action Menu for Onboarding Jurisdiction");
			System.out.println("Step :Click on Quick Action Menu for Onboarding Jurisdiction3");
		}

		wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		manageJurisdictionStatusOption.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
		System.out.println("Select Manage Jurisdiction Status");
	}

	public void assertionOfManageJurisdictionStatus() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(headingOfManageJurisdictionStatusPage));
		// Thread.sleep(6000);
		String acualtext1 = headingOfManageJurisdictionStatusPage.getText();
		Assert.assertEquals(acualtext1, "Manage Jurisdiction Status");
		ObjectRepo.test.log(Status.PASS, acualtext1+ " " + "Title is displayed");
		System.out.println(acualtext1+ " " + "Title is displayed");
	}

	public void selectLinkedFromDropdownOnManageJurisdictionStatus() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		wait.until(ExpectedConditions.visibilityOf(JurisdictionStatusHeader));
		wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
		CommonLibref.scroll(statusChangeHistory, "scrollToElement", "statusChangeHistory");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(searchFieldOfJurisdictionStatus));
		} catch (Exception e) {

		}
		try {
			CommonLibref.click(searchFieldOfJurisdictionStatus, "moveToElementClick",
					"searchFieldOfJurisdictionStatus");
			searchFieldOfJurisdictionStatus.sendKeys("Linked");
			Thread.sleep(2000);
			searchFieldOfJurisdictionStatus.sendKeys(Keys.ENTER);
			linkedstatus = saveLinkedStatus.getAttribute("value");
			System.out.println(linkedstatus + "1");
		} catch (Exception e) {
//			js.executeScript("arguments[0].value='Linked';", searchFieldOfJurisdictionStatus);
//			linkedstatus = saveLinkedStatus.getAttribute("value");
//			System.out.println(linkedstatus+"2");
		}

		System.out.println("Dropdown selected: " + LinkedStatusDisplayed.getAttribute("Value"));
		// //Thread.sleep(2000);
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("linked Status is selected");
	}

	public void verifyTheDateOfLinkageField() {
		ObjectRepo.test.log(Status.PASS, "Step : Click on the date and time field and then click outside");
		System.out.println("Step : Click on the date and time field and then click outside");
		wait.until(ExpectedConditions.elementToBeClickable(errorMessageForDateOfLinkage));
		CommonLibref.click(errorMessageForDateOfLinkage, "javascriptClick", "errorMessageForDateOfLinkage");
		errorMessageForDateOfLinkage.sendKeys(Keys.TAB);

		String errormessage = errorMessageForDateOfLinkage01.getText();
		Assert.assertEquals(errormessage, "Date Of Joining is required");

		ObjectRepo.test.log(Status.PASS, "Error message is display like: " + errorMessageForDateOfLinkage01);
		System.out.println("Error message is display like: " + errorMessageForDateOfLinkage01);

	}

	public void selectDateofLinkage() {

		wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption));
		js = (JavascriptExecutor) driver.get();
		// js.executeScript("arguments[0].click();", dateDropdownoption);
		try {
			CommonLibref.click(dateDropdownoption, "moveToElementClick", "dateDropdownoption");
			wait.until(ExpectedConditions.elementToBeClickable(selectDate));

		} catch (NoSuchElementException e) {
			CommonLibref.click(dateDropdownoption, "javascriptClick", "dateDropdownoption");
			wait.until(ExpectedConditions.elementToBeClickable(selectDate));

		} catch (Exception e) {
			CommonLibref.click(dateDropdownoption, "seleniumClick", "dateDropdownoption");
			wait.until(ExpectedConditions.elementToBeClickable(selectDate));

		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click on Date of Linkage");
		// js.executeScript("arguments[0].click();", selectDate);
		CommonLibref.click(selectDate, "moveToElementClick", "selectDate");
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		ObjectRepo.test.log(Status.PASS, "Step : Select linked Status from Dropdown");
		System.out.println("Date of Linkage is selected");
	}

	public void acknowledgeCheckBoxOnManageJurisdictionStatus() {
		js = (JavascriptExecutor) driver.get();
		wait.until(ExpectedConditions.elementToBeClickable(acknowledgeCheckbox));
		// acknowledgeCheckbox.click();
		CommonLibref.click(acknowledgeCheckbox, "moveToElementClick", "acknowledgeCheckbox");
		// js.executeScript("arguments[0].click();", acknowledgeCheckbox);
		ObjectRepo.test.log(Status.PASS, "Step : Select Acknowledge checkbox");
		System.out.println("Acknowledge checkbox is selected");
	}

	public void cancelButtonOnManageJurisdictionStatusPage() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnSetUpNewJurisdiction));
		CommonLibref.click(cancelButtonOnSetUpNewJurisdiction, "javascriptClick", "cancelButtonOnSetUpNewJurisdiction");
		ObjectRepo.test.log(Status.PASS, "Step : Enter valid data and Click on cancel button");
		System.out.println("Step : Enter valid data and Click on cancel button");
		wait.until(ExpectedConditions.elementToBeClickable(WarningPopupOnIntialPage));
		System.out.println("Click On Cancel Button");
		wait.until(ExpectedConditions.elementToBeClickable(WarningPopupOnIntialPage));
		String acualtext1 = WarningPopupOnIntialPage.getText();
		Assert.assertEquals(acualtext1, "Warning!");
		ObjectRepo.test.log(Status.PASS, "Warning popup should get displayed with cancel and continue button");
		System.out.println("Warning popup should get displayed with cancel and continue button");
	}

	public void cancelButtonOnWarningPopUpforlinkedStatusSelected() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelButtonOnManagedStatus));
		CommonLibref.click(cancelButtonOnManagedStatus, "javascriptClick", "cancelButtonOnManagedStatus");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Cancel button of Warning popup ");
		System.out.println("Click on Cancel button of Warning popup");
		String value = saveLinkedStatus.getAttribute("Value");
		Assert.assertEquals(linkedstatus, value);
		ObjectRepo.test.log(Status.PASS,
				"Warning pop up should get removed and and entered Data /selection should not get cleared ");
		System.out.println("Warning pop up should get removed and and entered Data /selection should not get cleared ");
	}

	public void continueButtonOnWarningPopUpOfManageJurisdictionStatusPage() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(continueBTNOnWarningPopup));
		CommonLibref.click(continueBTNOnWarningPopup, "javascriptClick", "continueBTNOnWarningPopup");
		ObjectRepo.test.log(Status.PASS,
				"Step :Again click on cancel button of Manage Jurisdiction Status page and click on continue button on warning popup ");
		System.out.println(
				"Again click on cancel button of Manage Jurisdiction Status page and click on continue button on warning popup");
		Thread.sleep(3000);
		String afterContinueBTN = manageJurisdictions.getText();
		Assert.assertEquals(homePage.getText(), afterContinueBTN);
		ObjectRepo.test.log(Status.PASS, "Home page should get displayed");
		System.out.println("Home page should get displayed");
	}

	public void JurisdictionInLinkage() {
		System.out.print("Jurisdiction In Linkage:");
		System.out.println(JurisdictionInLinkage.getText());
		ObjectRepo.test.log(Status.PASS, "Jurisdiction In Linkage is visble");
	}

	public void SubmitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
		System.out.println("Jurisdiction in Linkage with - " + JurisdictionInLinkage.getText());
		ObjectRepo.test.log(Status.PASS, "Jurisdiction in Linkage with - " + JurisdictionInLinkage.getText());
		System.out.println("WCI Clicks on Submit Button");
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Submit Button");
		wait.until(ExpectedConditions.elementToBeClickable(ConfirmationTextonConfirmationPopup));
		System.out.println(ConfirmationTextonConfirmationPopup.getText()+ " " + "is display");
		ObjectRepo.test.log(Status.PASS, ConfirmationTextonConfirmationPopup.getText()+ " " + "is display");
	}

	public void SubmitButtonisEnabledOrNot() {

		if (SubmitButton.isEnabled()) {

			CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
			System.out.println("Submit Button is Enabled.");
			ObjectRepo.test.log(Status.PASS, "Submit Button should be Enabled");
			Common.pageLoader();
			System.out.println(ConfirmationTextonConfirmationPopup.getText()+ " is display");
			ObjectRepo.test.log(Status.PASS, ConfirmationTextonConfirmationPopup.getText()+ " is display");
		} else {
			System.out.println("Submit Button is disabled.");
			ObjectRepo.test.log(Status.PASS, "Submit Button should be Disnabled");
		}
	}

	public void AstrickMarkisdisplayed() {
		wait.until(ExpectedConditions.visibilityOf(AstrickMark));
		System.out.println(AstrickMark.getText()+ " " + "mark is display on Revision Request" );
		ObjectRepo.test.log(Status.PASS, AstrickMark.getText()+ " " + "mark is display on Revision Request");
	}

	public void selectPastdate() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(ClickonDateofLinkageText));
		wait.until(ExpectedConditions.elementToBeClickable(ClickonDateofLinkageText));
		try {
			ClickonDateofLinkageText.click();
		} catch (Exception e) {
			CommonLibref.click(ClickonDateofLinkageText, "seleniumClick", "ClickonDateofLinkageText");
		}
		
		ClickonTimeOfLinkageText.click();
		wait.until(ExpectedConditions.visibilityOf(DateofLinkageErrorMessage));
		System.out.println(DateofLinkageErrorMessage.getText());
		ObjectRepo.test.log(Status.PASS, "Error Message 'Date of Linkage is required' is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption));
		js = (JavascriptExecutor) driver.get();
		// js.executeScript("arguments[0].click();", dateDropdownoption);
		CommonLibref.click(dateDropdownoption, "moveToElementClick", "dateDropdownoption");
		if (selectpreviousDate.isEnabled()) {
			CommonLibref.click(selectpreviousDate, "javascriptClick", "selectpreviousDate");
			System.out.println("Previous Date is enabled.");
		} else {
			System.out.println("Previous Date is disabled.");
			ObjectRepo.test.log(Status.PASS, "Previous Dates are not Accepted");
		}
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDateFail));
		CommonLibref.click(CurrentDateFail, "moveToElementClick", "CurrentDateFail");
		wait.until(ExpectedConditions.visibilityOf(DateofLinkageErrorText));
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		System.out.println(DateofLinkageErrorText.getText());
		ObjectRepo.test.log(Status.PASS, "Does Not Accept Time Less than Current Time");
	}

	public void IncorrectPassphrase() {
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseTextBox));
		PassphraseTextBox.sendKeys("Text@123");
		PassphraseSubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessage));
		System.out.println("Confirmed popup name displa like - "+PassphraseErrorMessageHeading.getText());
		Assert.assertEquals("Passphrase is incorrect", PassphraseErrorMessage.getText());
		System.out.println("Error message is display -" + PassphraseErrorMessage.getText());
		// Confirmation popup is not closed
		System.out.println(ConfirmationTextonConfirmationPopup.getText());
		wait.until(ExpectedConditions.elementToBeClickable(FailedMessageclosebutton));
		FailedMessageclosebutton.click();
		ObjectRepo.test.log(Status.PASS, "Error Message is displayed and Confirmation Popup does not close.");
	}

	public void IncorrectPassphraseForJurisdiction() {
			wait.until(ExpectedConditions.elementToBeClickable(PassphraseTextBox));
			PassphraseTextBox.sendKeys("Text@123");
			PassphraseSubmitButton.click();
			wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessage));
			System.out.println(PassphraseErrorMessageHeading.getText());
			System.out.println(PassphraseErrorMessage.getText());
			// Confirmation popup is not closed
			System.out.println(ConfirmationTextonConfirmationPopup.getText());
			wait.until(ExpectedConditions.elementToBeClickable(CancelSuccessMessageButton));
			CommonLibref.click(CancelSuccessMessageButton, "seleniumClick", "CancelSuccessMessageButton");
	}

	public void CorrectPassphrase() {
		System.out.println("Enter valid passphrase and click on Confirm");
		ObjectRepo.test.log(Status.PASS, "Enter valid passphrase and click on Confirm");
		PassphraseTextBox.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		PassphraseSubmitButton.click();
		CommonLibref.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessage));
		System.out.println(PassphraseErrorMessageHeading.getText());
		String Actual = PassphraseErrorMessage.getText();
		System.out.println(Actual);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(CancelSuccessMessageButton));
		CommonLibref.click(CancelSuccessMessageButton, "moveToElementClick", "CancelSuccessMessageButton");
		
	}

	public void NoButtononCancelProposal() {
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		// MoreActions.click();
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
		CancelProposalButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
		NoonCancelPopup.click();
	}

	public void CancelProposal() {
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		System.out.println("Cancelling the Proposal");
		// MoreActions.click();
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
		CancelProposalButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
		CancelStatusButton.click();
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessageHeading));
		System.out.println(PassphraseErrorMessageHeading.getText());
		System.out.println(PassphraseErrorMessage.getText());
		wait.until(ExpectedConditions.visibilityOf(CancelSuccessMessageButton));
		wait.until(ExpectedConditions.elementToBeClickable(CancelSuccessMessageButton));
		CommonLibref.click(CancelSuccessMessageButton, "seleniumClick", "CancelSuccessMessageButton");
		// CancelSuccessMessage.click();
		Assert.assertEquals("Welcome!", WCIHomePage.getText());
		System.out.println(WCIHomePage.getText());
		ObjectRepo.test.log(Status.PASS, "Cancel Success Message is displayed.");
	}

	public void AssertionManage() {
		wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionDetails));
		Assert.assertEquals(ManageJurisdictionDetails.getText(), "Manage Jurisdiction Details");
		System.out.println(ManageJurisdictionDetails.getText());
		ObjectRepo.test.log(Status.PASS, "WCI Inc Admin is redirected to Manage Jurisdiction Details page.");
	}

	public void MoreActionsAssertion() {
		wait.until(ExpectedConditions.elementToBeClickable(MoreActions));
		CommonLibref.click(MoreActions, "javascriptClick", "MoreActions");
		wait.until(ExpectedConditions.visibilityOf(CancelledProposedButton));
		Assert.assertEquals(CancelledProposedButton.getText(), "CANCEL PROPOSED STATUS");
		System.out.println(CancelledProposedButton.getText());
		Assert.assertEquals(EditButton.getText(), "EDIT");
		System.out.println(EditButton.getText());
		Assert.assertEquals(ManageStatusButton.getText(), "MANAGE STATUS");
		System.out.println(ManageStatusButton.getText());
		Assert.assertEquals(ReturntoHomePageButton.getText(), "RETURN TO HOME PAGE");
		System.out.println(ReturntoHomePageButton.getText());
		ObjectRepo.test.log(Status.PASS, "Assertion on More Action button");
	}

	public void ClickonMyApprovals() {
		Common.pageLoader();
		CommonLibref.scroll(MyApprovals, "scrollToElement", "MyApprovals");
		wait.until(ExpectedConditions.elementToBeClickable(MyApprovals));
		CommonLibref.click(MyApprovals, "javascriptClick", "MyApprovals");
		ObjectRepo.test.log(Status.PASS, "Jurisdiction User in on My Approval Page.");
		Common.pageLoader();
	}

	public void AssertiononNoRowsMyApproval() {
//		wait.until(ExpectedConditions.visibilityOf(IDonMyApproval));
		SearchonMyApproval.sendKeys("Proposed for Linked");
		Assert.assertEquals("No rows", Norows.getText());
		System.out.println(Norows.getText());
		ObjectRepo.test.log(Status.PASS,
				"Proposed for Pre-Linked to Linked' change request should get removed pending queue of all Jurisdiction Users (Jurisdiction Authority) of all Jurisdiction in proposed linkage to whom this request was sent");

	}

	public void cancelButtonOnManageJurisdictionStatus() {
		cancelButtonOnSetUpNewJurisdiction.click();
		cancelButtonOnWarningPopopup.click();
		cancelButtonOnSetUpNewJurisdiction.click();
		continueBTNOnWarningPopup.click();

	}

	public void JurisdictionDetails() {
//        Common.pageLoader();
		CommonLibref.scroll(JurisdictionDetails, "scrollToBottomOFPage", "JurisdictionDetails");
		wait.until(ExpectedConditions.visibilityOf(JurisdictionDetails));
		wait.until(ExpectedConditions.elementToBeClickable(JurisdictionDetails));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Common.pageLoader();
		CommonLibref.click(JurisdictionDetails, "javascriptClick", "juirsdictionDetailsOption");
		wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionPage));
		System.out.println(ManageJurisdictionPage.getText()+ " " + " is  display" );
		ObjectRepo.test.log(Status.PASS,ManageJurisdictionPage.getText()+ " " + "is display");
	}

	public void ClickOnRevisionButtonOnJurisdictionDetailsPage() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(RevisionRadioButton));
		CommonLibref.scroll(RevisionRadioButton, "scrollToElement", "approveAndRevisionHeading");
		ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision' radio button");
		System.out.println("Step:Click on 'Revision Request' radio button");
		Thread.sleep(2000);

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(RevisionRadioButton).click(RevisionRadioButton).build().perform();
			wait.until(ExpectedConditions.visibilityOf(AstrickMark));
		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", RevisionRadioButton);
			wait.until(ExpectedConditions.visibilityOf(AstrickMark));

		} catch (Exception e) {
			driver.get().findElement(By.xpath(
					"(//label[text()='Decision']//..//..//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"))
					.click();
			wait.until(ExpectedConditions.visibilityOf(AstrickMark));
		}
		ObjectRepo.test.log(Status.PASS, "Step:Request Revisions radio button should get selected and Asterisk mark of the 'comment' field for 'Request Revision' should get enabled.");
		System.out.println("Request Revisions radio button should get selected and Asterisk mark of the 'comment' field for 'Request Revision' should get enabled.");
	}

	public void ClickOnApproveButtonOnJurisdictionDetailsPage() throws InterruptedException {
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(ApproveRadioButton));
		CommonLibref.scroll(ApproveRadioButton, "scrollToElement", "approveAndRevisionHeading");
//		  ScrollPageUptoJurisdictionRequestStatusTable();
		Thread.sleep(2000);

		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(ApproveRadioButton).click(ApproveRadioButton).build().perform();
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Approve' radio button");
			System.out.println("Step:Click on 'Approve' radio button");
		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ApproveRadioButton);
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision' radio button");
			System.out.println("Step:Click on 'Approve' radio button");

		} catch (Exception e) {
			driver.get().findElement(By.xpath(
					"(//label[text()='Decision']//..//..//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]"))
					.click();
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Approve' radio button");
			System.out.println("Step:Click on 'Approve' radio button");
		}

	}

	public void EnterComment() {
		CommonLibref.click(JurisdictionDetailsComment, "moveToElementClick", "JSAComment");
		String CommentEntered = "Test";
		JurisdictionDetailsComment.sendKeys(CommentEntered);
		EnterComment = JurisdictionDetailsComment.getAttribute("value");
		System.out.println(EnterComment + " " + "entered in Comment box");
		ObjectRepo.test.log(Status.PASS, EnterComment + " " + "entered in Comment box");
	}

	public void CancelonJuridictionDetails() {
		cancelButtonOnSetUpNewJurisdiction.click();
		wait.until(ExpectedConditions.visibilityOf(WarningPopupOnIntialPage));
		CommonLibref.click(cancelButtonOnWarningPopopup, "moveToElementClick", "cancelButtonOnWarningPopopup");
		// cancelButtonOnWarningPopopup.click();
		CommonLibref.click(cancelButtonOnSetUpNewJurisdiction, "moveToElementClick",
				"cancelButtonOnSetUpNewJurisdiction");
		// cancelButtonOnSetUpNewJurisdiction.click();
		wait.until(ExpectedConditions.visibilityOf(WarningPopupOnIntialPage));
		System.out.println(WarningPopupOnIntialPage.getText());
		CommonLibref.click(continueBTNOnWarningPopup, "moveToElementClick", "continueBTNOnWarningPopup");
		// continueBTNOnWarningPopup.click();
		System.out.println(HomepageVerificationSearchUsers.getText());
		Assert.assertEquals("Search Users", HomepageVerificationSearchUsers.getText());
		System.out.println("Jurisdiction Authority clicks on Cancel");
		ObjectRepo.test.log(Status.PASS,
				"Details should not get saved and Jurisdiction Authority should get navigated to homepage");
	}

	public void AssertionOnMyApproval() {
		wait.until(ExpectedConditions.visibilityOf(IDonMyApproval));
		String proposedId = IDonMyApproval.getText();
		System.out.println(proposedId+ " Proposed Id is display like");
		ObjectRepo.test.log(Status.PASS,proposedId + " Proposed Id is display like");
		SearchonMyApproval.sendKeys("Proposed for Linked");
		System.out.println(StatusonMyApproval+ "Status is display like");
		Assert.assertEquals("Proposed for Linked", StatusonMyApproval.getText());
		ObjectRepo.test.log(Status.PASS,
				"Details should not get saved and Jurisdiction Authority should get navigated to homepage");
	}

	public void CommentErrorMessage() {
		CommonLibref.click(CommentonCancelProposal, "moveToElementClick", "CommentonCancelProposal");
		CommentonCancelProposal.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(CommentErrorMessage));
		System.out.println(CommentErrorMessage.getText());
		ObjectRepo.test.log(Status.PASS, "An error message should get displayed: <Comment> is mandatory");

	}

	public void CancelonJurisdictionStatus() {
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

	public void EnterRandomPassphrase() {
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseTextBox));
		String Passphrase = "Wciadmin@@2";
		PassphraseTextBox.click();
		PassphraseTextBox.sendKeys(Passphrase);
		String text = PassphraseTextBox.getAttribute("value");
		System.out.println("Passphrase entered :-" + text);
	}

	public void CancelonConfirmationPopup() {
		cancelButtonOnPopup.click();
		System.out.println("Cancel Button is clicked.");
		System.out.println(ManageJurisdictionPage.getText());
		ObjectRepo.test.log(Status.PASS,
				"Passphrase pop up should get closed and the Authority should be on the manage jurisdiction details page");
	}

	public void BlankPassphraseMeesage() {
		wait.until(ExpectedConditions.elementToBeClickable(PassphraseTextBox));
		PassphraseTextBox.click();
		ConfirmationTextonConfirmationPopup.click();
		ObjectRepo.test.log(Status.PASS, "Step: Click on passphrase field and click outside.");
		wait.until(ExpectedConditions.visibilityOf(CaptureErrorMessageBlankText));
		System.out.println(CaptureErrorMessageBlankText.getText());
		ObjectRepo.test.log(Status.PASS, "Error message should get displayed : Passphrase is required");
	}

	public void AssertionofSuccessMessageforRequestRevsion() {
		PassphraseTextBox.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
		PassphraseSubmitButton.click();
		Common.pageLoader();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessage));
		System.out.println(PassphraseErrorMessageHeading.getText());
		String Actual = PassphraseErrorMessage.getText();
		System.out.println(Actual);
		wait.until(ExpectedConditions.elementToBeClickable(CancelSuccessMessageButton));
		CommonLibref.click(CancelSuccessMessageButton, "moveToElementClick", "CancelSuccessMessageButton");
		ObjectRepo.test.log(Status.PASS, "Success Message is displayed.");
		String Expected = "Your request for revisions has been submitted successfully";
		System.out.println("Actual Message: " + Actual);
		System.out.println("Expected Message: " + Expected);
		Assert.assertEquals(Expected, Actual);
		System.out.println(Expected + " "+ "Success Message is displayed");
		ObjectRepo.test.log(Status.PASS, Expected + " "+ "Success Message is displayed");
	}

	public void AssertiononJurisdictionDetailsHistoryTable() {

		wait.until(ExpectedConditions.visibilityOf(JurisdictionRequestCardonJurisdictionDetails));
		String ActualRequestStatus = FirstRequestStatusonJurisdictonDetails.getText();
		String ExpectedRequestStatus = "Revisions Requested";
		System.out.println("Actual: " + ActualRequestStatus);
		System.out.println("Expected: " + ExpectedRequestStatus);
		ObjectRepo.test.log(Status.PASS, ExpectedRequestStatus + " "+ "Request status is display");
		Assert.assertEquals(ExpectedRequestStatus, ActualRequestStatus);
		String ActualJurisdictionStatus = FirstJurisdictionStatusonJurisdictonDetails.getText();
		String ExpectedJurisdictionStatus = "Pre-Linked";
		System.out.println("Actual: " + ActualJurisdictionStatus);
		System.out.println("Expected: " + ExpectedJurisdictionStatus);
		Assert.assertEquals(ExpectedJurisdictionStatus, ActualJurisdictionStatus);
		ObjectRepo.test.log(Status.PASS, ExpectedJurisdictionStatus + " "+ "Jurisdiction Status is display");
		
		String ActualComment = FirstCommentonJurisdictonDetails.getText();
		String ExpectedComment = EnterComment;
		System.out.println("Actual: " + ActualComment);
		System.out.println("Expected: " + ExpectedComment);
		Assert.assertEquals(ExpectedComment, ActualComment);
		ObjectRepo.test.log(Status.PASS, ExpectedComment + " "+ "Comment is display");
	}

	public void AssertionAfterRequestRevisionForWCI() {
		ObjectRepo.test.log(Status.PASS, "Step: Observe the 'Manage Jurisdiction Status' Page.");
		String ActualComment = RequestRevisionCommentForWCI.getText();
		String ExpectedComment = EnterComment;
		System.out.println("Actual: " + ActualComment);
		System.out.println("Expected: " + ExpectedComment);
		Assert.assertEquals(ExpectedComment, ActualComment);
		if (searchFieldOfJurisdictionStatus.isEnabled()) {
			System.out.println("Jurisdiction Status is editable");
		} else {
			System.out.println("Jurisdiction Status is not editable");
		}
		if (dateDropdownoption.isEnabled()) {
			System.out.println("Date of Linkage is editable");
		} else {
			System.out.println("Date of Linkage is not editable");
		}
		ObjectRepo.test.log(Status.PASS,
				"WCI, Inc. Admin should get to update (date/time of linkage) based on the Jurisdiction Authority comments received and resubmit the request.");
	}

	public void CancelFromManageJurisdictionDetails() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CancelledProposedButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelProposal));
		CommentonCancelProposal.sendKeys("Test");
		CancelStatusButton.click();
		wait.until(ExpectedConditions.visibilityOf(PassphraseErrorMessageHeading));
		System.out.println(PassphraseErrorMessageHeading.getText());
		System.out.println(PassphraseErrorMessage.getText());
		CommonLibref.click(CancelSuccessMessageButton, "moveToElementClick", "CancelSuccessMessageButton");
		// CancelSuccessMessage.click();
		Assert.assertEquals("Welcome!", WCIHomePage.getText());
		System.out.println(WCIHomePage.getText());
		ObjectRepo.test.log(Status.PASS, "Cancel Success Message is displayed.");
	}

	public void BlankCommentMeesage() {
		CommonLibref.click(JurisdictionDetailsComment, "moveToElementClick", "JSAComment");
		JurisdictionDetailsComment.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOf(CaptureErrorMessageBlankText));
		String ActualMessage = CaptureErrorMessageBlankText.getText();
		System.out.println("Actual Meesage: " + ActualMessage);
		String ExpectedMessage = "Comment is required";
		System.out.println("Expected Meesage: " + ExpectedMessage);
		Assert.assertEquals(ExpectedMessage, ActualMessage);
		CommonLibref.scroll(ManageJurisdictionDetails, "scrollToTopOFPage", "ManageJurisdictionDetails");

	}

	public void VerifyEditableOrNot() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(searchFieldOfJurisdictionStatus));
		PreLinkedtoLinked_POM ref1 = new PreLinkedtoLinked_POM();
		Module5_1_Pom sp = new Module5_1_Pom();
		try {
			WebElement element = CancelonJurisdictionStatus;
			Boolean value = element.isDisplayed();
			System.out.println(CancelonJurisdictionStatus.getText() + value);
			CommonLibref.scroll(CancelonJurisdictionStatus, "scrollToTopOFPage", "CancelonJurisdictionStatus");
			// CancelonJurisdictionStatusfor WCI
			ref1.CancelonJurisdictionStatus();
			sp.expandAllJurisdictionsOnHomePage();
			sp.scrollHomepageUptoLast();
			sp.fetchValueFromExcelSheet(listeners.filePath, "JurisdictionInfromation1",1,0);
			Thread.sleep(2000);
			String nameOfJurisdiction = ExcelProperties.readFromExcel(listeners.filePath, "JurisdictionInfromation1", 1, 0);
			System.out.println("Fetch Onboarding jurisdiction name from excel sheet -" + nameOfJurisdiction);
			ref1.selectManageJurisdictionStatusOptionFromQuickActions();
			ref1.assertionOfManageJurisdictionStatus();
			ref1.selectLinkedFromDropdownOnManageJurisdictionStatus();
		} catch (Exception e) {
//			wait.until(ExpectedConditions.visibilityOf(statusChangeHistory));
			wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
			WebElement element = statusChangeHistory;
			Boolean value = element.isEnabled();
			System.out.println(value);
			wait.until(ExpectedConditions.elementToBeClickable(statusChangeHistory));
			ref1.selectLinkedFromDropdownOnManageJurisdictionStatus();
		}
	}

	public void selectnegativedate() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(ClickonDateofLinkageText));
		ClickonDateofLinkageText.click();
		ClickonTimeOfLinkageText.click();
		wait.until(ExpectedConditions.visibilityOf(DateofLinkageErrorMessage));
		System.out.println(DateofLinkageErrorMessage.getText());
		ObjectRepo.test.log(Status.PASS, "Error Message 'Date of Linkage is required' is displayed");
		wait.until(ExpectedConditions.elementToBeClickable(dateDropdownoption));
		js = (JavascriptExecutor) driver.get();
		// js.executeScript("arguments[0].click();", dateDropdownoption);
		CommonLibref.click(dateDropdownoption, "moveToElementClick", "dateDropdownoption");
		if (selectpreviousDate.isEnabled()) {
			CommonLibref.click(selectpreviousDate, "javascriptClick", "selectpreviousDate");
			System.out.println("Previous Date is enabled.");
		} else {
			System.out.println("Previous Date is disabled.");
			ObjectRepo.test.log(Status.PASS, "Previous Dates are not Accepted");
		}
		wait.until(ExpectedConditions.elementToBeClickable(CurrentDateFail));
		CommonLibref.click(CurrentDateFail, "moveToElementClick", "CurrentDateFail");
		wait.until(ExpectedConditions.visibilityOf(DateofLinkageErrorText));
		System.out.println("Entered Date: " + EnteredDate.getAttribute("value"));
		System.out.println("Entered Time: " + EnteredTime.getAttribute("value"));
		System.out.println(DateofLinkageErrorText.getText());
		ObjectRepo.test.log(Status.PASS, "Does Not Accept Time Less than Current Time");
	}
	public void assertStatusHistoryTableOnManagedJurisdictionDetailPage() {
		wait.until(ExpectedConditions.visibilityOf(statusHistoryTableName));
		wait.until(ExpectedConditions.elementToBeClickable(statusHistoryTableName));
		String tableHeading = statusHistoryTableName.getText();
		System.out.println("Table is display like -  " + tableHeading);
		ObjectRepo.test.log(Status.PASS, "Table is display like -  " + tableHeading);
	}
	public void verifyTheRevisionRequestButtonPresentOrNot() throws InterruptedException {
		Common.pageLoader();
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
       String name = pedingApproval.getText();
       System.out.println(name + " " + " is display under JURISDICTION MANAGEMENT");
	   ObjectRepo.test.log(Status.PASS, name + " " + " is display under JURISDICTION MANAGEMENT");
	   
	}
}
