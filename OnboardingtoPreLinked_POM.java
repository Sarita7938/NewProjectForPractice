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

import com.aventstack.extentreports.Status;

import Utilities.ObjectRepo;
import Utilities.commonLib;

public class OnboardingtoPreLinked_POM {

	String status = "Pre-Linked";
	String Jurisdictionname = "California";

	@FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
	private WebElement ClickDropdownHomePage;
	@FindBy(xpath = "//input[@placeholder='Search…']")
	private WebElement homepageSearchOption;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']")
	private WebElement quickActionsOnHomePage;
	@FindBy(xpath = "//*[text()='MANAGE JURISDICTION STATUS']")
	private WebElement manageJurisdictionStatusOption;
	@FindBy(xpath = "//*[text()='MANAGE CRON JOBS']")
	private WebElement manageCornJobsSection;
	@FindBy(xpath = "(//div[@title='North Dakota'])[1]")
	public WebElement TitleJurisdictionName;
	@FindBy(xpath = "//*[text()='Manage Jurisdiction Status']")
	public WebElement headingOfManageJurisdictionStatusPage;
	@FindBy(xpath = "//input[@name='onboardingTasks.newJurisdictionInformation']")
	public WebElement checkboxnewjurisdiction;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
	public WebElement checkboxinitialusers;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")
	public WebElement checkboxjurisdictionaccount;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[4]")
	public WebElement checkboxjurisdictionbudget;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[5]")
	public WebElement checkboxpurchaselimit;
	@FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[6]")
	public WebElement checkboxacknowledgement;
	@FindBy(xpath = "//input[@id='jurisdictionStatus-react-hook-form-select-search']")
	public WebElement JurisdictionStatusTextBox;
	@FindBy(xpath = "//input[@id='jurisdictions-react-hook-form-select-search']")
	public WebElement JurisdictionsTextBox;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[1]")
	private WebElement approveRadioButton;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Submit']")
	public WebElement SubmitButton;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-ju587a']")
	public WebElement ConfirmationTextonConfirmationPopup;
	@FindBy(xpath = "//input[@data-testid='passphrase']")
	public WebElement PassphraseTextBox;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement PassphraseSubmitButton;
	@FindBy(xpath = "//*[text()='Welcome,']")
	// button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained
	// MuiButton-containedPrimary')])[1]

	private WebElement clickOnDropdown;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutOption;
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	public WebElement popupclosebutton;
	@FindBy(xpath = "//*[text()='Jurisidiction Details']")
	public WebElement JSAJurisdictionDetails;
	@FindBy(xpath = "//*[@name='Request Revisions']")
	public WebElement JSARequestRevision;
	// @FindBy (xpath="(//*[@class='MuiInputBase-input MuiOutlinedInput-input
	// MuiInputBase-inputMultiline css-u36398'])[1]")
	@FindBy(xpath = "// textarea[@data-testid='comment']")
	public WebElement JSAComment;
	@FindBy(xpath = "//*[text()='Manage Jurisdiction Details']")
	public WebElement ManageJurisdictionPage;
	@FindBy(xpath = "(//*[@data-testid='RadioButtonUncheckedIcon'])[2]")
	private WebElement RevisionRadioButton;
	@FindBy(xpath = "//button[@data-testid='current-holding-details']")
	public WebElement CancelProposalButton;
	@FindBy(xpath = "//textarea[@aria-describedby='comments-helper-text']")
	public WebElement CommentonCancelCard;
	@FindBy(xpath = "//button[@data-testid='priv_btn_Search']")
	public WebElement CancelStatusButton;
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	public WebElement Sucesspopupclosebutton;
	@FindBy(xpath = "//*[text()='*']")
	public WebElement Astrick;
	@FindBy(xpath = "//div[@class='MuiBox-root css-1ytub8b']//p[@class='MuiTypography-root MuiTypography-body2 css-1fr8lnd']")
	public WebElement JurisdictionInLinkage;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
	public WebElement ToastMeesageHeader;
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
	public WebElement ToastMessageBody;

	JavascriptExecutor js;
	public static String linkedstatus;
	public static commonLib CommonLibref = new commonLib();

	public OnboardingtoPreLinked_POM() {
		PageFactory.initElements(driver.get(), this);
	}

	public void expandAllJurisdictionsOnHomePage() {
		wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		ClickDropdownHomePage.click();
		ObjectRepo.test.log(Status.PASS, "Step: Click on All Jurisdictions");
		System.out.println("Click on All Jurisdictions");

	}

	public void selectJurisdictionOtherThanOnboarding() {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		String a = "Busan";
		homepageSearchOption.sendKeys(a);
		System.out.println("Enter Jurisdiction Name = " + a);
	}

	public void SelectJurisdictionOtherThanOnboardingForRevisionRequested() {
		CommonLibref.click(homepageSearchOption, "seleniumClick", "homepageSearchOption");
		String a = "NewestJurisdiction1";
		homepageSearchOption.sendKeys(a);
		System.out.println("Enter Jurisdiction Name = " + a);
	}

	public void selectManageJurisdictionStatusOptionFromQuickActions() {
		wait.until(ExpectedConditions.visibilityOf(manageCornJobsSection));
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		try {
//			System.out.println("Try Javascriptclick");
			wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
			js.executeScript("arguments[0].click();", quickActionsOnHomePage);
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		} catch (NoSuchElementException e) {
//			System.out.println("JS Click failed try Selenium Click");
			CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		} catch (Exception e) {
//			System.out.println("Selenium CLick Failed try Move to Element Click");
			CommonLibref.click(quickActionsOnHomePage, "moveToElementClick", "quickActionsOnHomePage");
			wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		manageJurisdictionStatusOption.click();
		ObjectRepo.test.log(Status.PASS, "Step : Click on Manage Jurisdiction Status");
		System.out.println("Select Manage Jurisdiction Status");
	}

	public void assertionOfManageJurisdictionStatus() {
		wait.until(ExpectedConditions.visibilityOf(headingOfManageJurisdictionStatusPage));
		String acualtext1 = headingOfManageJurisdictionStatusPage.getText();
		Assert.assertEquals(acualtext1, "Manage Jurisdiction Status");
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Status page is displayed");
		System.out.println("Manage Jurisdiction Status page is displayed");
	}

	public void assertionofManageJurisdictionStatusOptionFromQuickActions() {
		ExpectedConditions.visibilityOf(manageCornJobsSection);
		CommonLibref.scroll(manageCornJobsSection, "scrollToBottomOFPage", "manageCornJobsSection");
		wait.until(ExpectedConditions.visibilityOf(TitleJurisdictionName));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(quickActionsOnHomePage));
			js.executeScript("arguments[0].click();", quickActionsOnHomePage);
		} catch (Exception e) {
			CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.visibilityOf(manageJurisdictionStatusOption));
		String a = "MANAGE JURISDICTION STATUS";
		Assert.assertEquals(a, manageJurisdictionStatusOption.getText());
		ObjectRepo.test.log(Status.PASS, "Manage Jurisdiction Status Option is displayed");
	}

	public void verifyCancelProposedStatusButton() {
		OnboardingtoPreLinked_POM ref1 = new OnboardingtoPreLinked_POM();
		try {
			System.out.println("Step: Check whether Cancel Proposal Status Button is displayed or not");
			ref1.cancelProposal();
			System.out.println("Cancel Proposal is checked");
			ref1.expandAllJurisdictionsOnHomePage();
			ref1.selectJurisdictionOtherThanOnboarding();
			ref1.selectManageJurisdictionStatusOptionFromQuickActions();
			ref1.assertionOfManageJurisdictionStatus();
			ref1.checkallthecheckboxes();
		} catch (Exception e) {
			System.out.println("Step: No Cancel Proposal on Manage Jurisdiction Status Page");
			ref1.checkallthecheckboxes();
		}
	}

	public void checkallthecheckboxes() {
		System.out.println("Step: Check all CheckBoxes");
		ExpectedConditions.elementToBeClickable(checkboxnewjurisdiction);
		checkboxnewjurisdiction.click();
		ExpectedConditions.elementToBeClickable(checkboxinitialusers);
		checkboxinitialusers.click();
		ExpectedConditions.elementToBeClickable(checkboxjurisdictionaccount);
//			checkboxjurisdictionaccount.click();
		CommonLibref.click(checkboxjurisdictionaccount, "javascriptClick", "checkboxjurisdictionaccount");
		ExpectedConditions.elementToBeClickable(checkboxjurisdictionbudget);
		CommonLibref.click(checkboxjurisdictionbudget, "javascriptClick", "checkboxjurisdictionbudget");
		ExpectedConditions.elementToBeClickable(checkboxpurchaselimit);
		CommonLibref.click(checkboxpurchaselimit, "javascriptClick", "checkboxpurchaselimit");
		ExpectedConditions.elementToBeClickable(checkboxacknowledgement);
		CommonLibref.click(checkboxacknowledgement, "javascriptClick", "checkboxacknowledgement");
		System.out.println("All checkbox checked.");

	}

	public void AssertCheckboxes() {
		
       Assert.assertEquals(checkboxnewjurisdiction.isSelected() , true);
       System.out.println("New Jurisdiction Information Check box is Selected ");
      
       Assert.assertEquals(checkboxinitialusers.isSelected() , true);
       System.out.println("Set-up Initial User  Check box is Selected ");
       
       Assert.assertEquals(checkboxjurisdictionaccount.isSelected() , true);
       System.out.println("Jurisdiction Accounts Check box is Selected ");
       
       Assert.assertEquals(checkboxjurisdictionbudget.isSelected() , true);
       System.out.println("Budget Check box is Selected ");
       
       Assert.assertEquals(checkboxacknowledgement.isSelected() , true);
       System.out.println("Acknowledgement Check box is Selected ");
      
       CommonLibref.scroll(JurisdictionsTextBox, "scrollToBottomOFPage", "JSAJurisdictionDetails");
       
    String Status=  JurisdictionStatusTextBox.getAttribute("value");
    System.out.println("Status of Jurisdiction is displayred as "+Status);
    
    String Link = JurisdictionsTextBox.getAttribute("value");
    System.out.println("Selected Jurisdiction is displayred as "+ Link);
       
	}
	
	
	

	public void enterJurisdictios() {
		JurisdictionStatusTextBox.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JurisdictionStatusTextBox.sendKeys(Keys.CONTROL, "a");
		JurisdictionStatusTextBox.sendKeys(Keys.BACK_SPACE);
		JurisdictionStatusTextBox.sendKeys(status);
		JurisdictionStatusTextBox.sendKeys(Keys.ENTER);
		ExpectedConditions.visibilityOf(JurisdictionsTextBox);
		JurisdictionsTextBox.click();
		JurisdictionsTextBox.sendKeys(Keys.CONTROL, "a");
		JurisdictionsTextBox.sendKeys(Keys.BACK_SPACE);
		JurisdictionsTextBox.sendKeys(Jurisdictionname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JurisdictionsTextBox.sendKeys(Keys.ENTER);
		System.out.println("Linked Jurisdiction Entered.");
	}

	public void submitButton() {
		wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
		CommonLibref.click(SubmitButton, "javascriptClick", "SubmitButton");
		System.out.println("Clicked on Submit Button.");
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Submit Button");
	}

	public void enterPassphrase() {
		PassphraseTextBox.sendKeys(prop.getProperty("Password2"));
		PassphraseSubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(ToastMeesageHeader));
		wait.until(ExpectedConditions.visibilityOf(ToastMessageBody));
		System.out.println(ToastMeesageHeader.getText());
		System.out.println(ToastMessageBody.getText());
		ObjectRepo.test.log(Status.PASS, "WCI Clicks on Submit Button");
		ExpectedConditions.elementToBeClickable(popupclosebutton);
		CommonLibref.click(popupclosebutton, "javascriptClick", "popupclosebutton");
		ObjectRepo.test.log(Status.PASS, "Success Message is displayed and Confirmation Popup closes.");
	}

	public void logOutUser() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(clickOnDropdown));
		CommonLibref.click(clickOnDropdown, "javascriptClick", "clickOnDropdown");
		ObjectRepo.test.log(Status.PASS, "Step: Click on Welcome");
		System.out.println("Click on Welcome");
		wait.until(ExpectedConditions.elementToBeClickable(logoutOption));
		CommonLibref.click(logoutOption, "javascriptClick", "logoutOption");
		ObjectRepo.test.log(Status.PASS, "Step : Click on Log Out Option");
		System.out.println("Click on Log Out Option");
	}

	public void jSARequestRevision() {
		wait.until(ExpectedConditions.visibilityOf(RevisionRadioButton));
		wait.until(ExpectedConditions.elementToBeClickable(RevisionRadioButton));
		System.out.println("Step: User clicks on Request revision Button");
		try {
			Actions action = new Actions(driver.get());
			action.moveToElement(RevisionRadioButton).click(RevisionRadioButton).build().perform();
			wait.until(ExpectedConditions.visibilityOf(Astrick));
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision Request' radio button");
			System.out.println("Step:Click on 'Revision Request' radio button1");
		} catch (NoSuchElementException e) {

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", RevisionRadioButton);
			wait.until(ExpectedConditions.visibilityOf(Astrick));
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision' radio button");
			System.out.println("Step:Click on 'Revision Request' radio button2");

		} catch (Exception e) {
			driver.get().findElement(By.xpath(
					"(//label[text()='Decision']//..//..//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"))
					.click();
			wait.until(ExpectedConditions.visibilityOf(Astrick));
			ObjectRepo.test.log(Status.PASS, "Step:Click on 'Revision' radio button");
			System.out.println("Step:Click on 'Revision Request' radio button3");
		}
		System.out.println("User successfully clicks on Request revision Button");
	}

	public void enterComment() {
		CommonLibref.click(JSAComment, "moveToElementClick", "JSAComment");
		JSAComment.sendKeys("Test");
		System.out.println("Step: Enter Comment");

	}

	public void verifyprefilleddata() {
		String s = JurisdictionStatusTextBox.getAttribute("value");
		String name = JurisdictionsTextBox.getAttribute("value");
		System.out.println(s);
		System.out.println(name);
	//	Assert.assertEquals(status, s);
	//	Assert.assertEquals(Jurisdictionname, name);
		
		
		
		
		
	}

	public void cancelProposal() {
		System.out.println("Check the visiblity and clickablity of Cancel Proposal Button");
		wait.until(ExpectedConditions.visibilityOf(CancelProposalButton));
		System.out.println("Cancel Proposal Button is Visible");
		wait.until(ExpectedConditions.elementToBeClickable(CancelProposalButton));
		System.out.println("Cancel Proposal Button is Clickable");
		try {
			CancelProposalButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelCard));
		} catch (NoSuchElementException e) {
			CommonLibref.click(CancelProposalButton, "moveToElementClick", "CancelProposalButton");
			wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelCard));
		} catch (Exception e) {
			CommonLibref.click(CancelProposalButton, "javascriptClick", "CancelProposalButton");
			wait.until(ExpectedConditions.elementToBeClickable(CommentonCancelCard));
		}
		CommentonCancelCard.sendKeys("Text");
		CancelStatusButton.click();
		wait.until(ExpectedConditions.visibilityOf(ToastMeesageHeader));
		wait.until(ExpectedConditions.visibilityOf(ToastMessageBody));
		System.out.println(ToastMeesageHeader.getText());
		System.out.println(ToastMessageBody.getText());
		try {
			System.out.println("Selenium Click Close button");
			Sucesspopupclosebutton.click();
			wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		} catch (NoSuchElementException e) {
			System.out.println("Move To Element Click Close button");
			CommonLibref.click(Sucesspopupclosebutton, "moveToElementClick", "CancelProposalButton");
			wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		} catch (Exception e) {
			System.out.println("JavaScript Click Close button");
			CommonLibref.click(Sucesspopupclosebutton, "moveToElementClick", "CancelProposalButton");
			wait.until(ExpectedConditions.elementToBeClickable(ClickDropdownHomePage));
		}

	}

	public void jurisdictionDetails() {

		System.out.println("User Clicks on Jurisdiction Details Button");
		ObjectRepo.test.log(Status.PASS, "Step: User Clicks on Jurisdiction Details Button");
		CommonLibref.scroll(JSAJurisdictionDetails, "scrollToBottomOFPage", "JSAJurisdictionDetails");
		wait.until(ExpectedConditions.elementToBeClickable(JSAJurisdictionDetails));
		try {
			JSAJurisdictionDetails.click();
			System.out.println("Selenium Click");
			driver.get().navigate().refresh();
			wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionPage));
		} catch (NoSuchElementException e) {
			CommonLibref.click(JSAJurisdictionDetails, "moveToElementClick", "JSAJurisdictionDetails");
			System.out.println("Move to Element");
			driver.get().navigate().refresh();
			wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionPage));
		} catch (Exception e) {
			CommonLibref.click(JSAJurisdictionDetails, "javascriptClick", "JSAJurisdictionDetails");
			System.out.println("Javascript");
			driver.get().navigate().refresh();
			wait.until(ExpectedConditions.visibilityOf(ManageJurisdictionPage));

		}
		System.out.println("User is navigated to Jurisdiction Details Page");
		ObjectRepo.test.log(Status.PASS, "Step: User is navigated to Jurisdiction Details Page");

	}

}