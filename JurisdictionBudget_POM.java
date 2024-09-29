package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aventstack.extentreports.Status;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import static constants.ThreadConstants.driver;

public class JurisdictionBudget_POM {
    private JavascriptExecutor js;
    private commonLib commonLibRef = new commonLib();

    @FindBy(xpath = "//a[text()='Proposed Budget Records']")
    private WebElement proposedBudgetRecords;
    
    @FindBy(xpath = "(//input[@placeholder='Search…'])[2]")
    private WebElement searchOnProposedBudgetRecords;
    
    @FindBy(xpath = "(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")
    private WebElement selectCheckBoxOnProposedBudgetRecords;
    
    @FindBy(xpath = "(//input[@name='Request Revisions'])")
    private WebElement selectRadioButtonRequestRevisions;
    
    @FindBy(xpath = "//textarea[@name='comment']")
    private WebElement enterComment;
    
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickSubmit;
    
    @FindBy(xpath = "//input[@name='passphrase']")
    private WebElement enterPassphrase;
    
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement clickConfirm;
    
    @FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-subtitle1 css-w9jsk0']")
    private WebElement getSuccessHeader;
    
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body2 css-1eifdk0']")
    private WebElement getSuccessMessage;

    public JurisdictionBudget_POM() {
        PageFactory.initElements(driver.get(), this);
    }

    public void clickProposedBudgets() throws InterruptedException {
        Thread.sleep(1000);
        js = (JavascriptExecutor) driver.get();
        js.executeScript("window.scrollBy(0,1700)", "");
        ExpectedConditions.elementToBeClickable(proposedBudgetRecords);
        Thread.sleep(5000);
        commonLibRef.click(proposedBudgetRecords, "javascriptClick", "ProposedBudgetRecords");
        ObjectRepo.test.log(Status.PASS, "User is navigated to Proposed Budget Records");
    }

    public void searchOnProposedBudgetRecords() throws InterruptedException {
        Thread.sleep(1000);
        js = (JavascriptExecutor) driver.get();
        js.executeScript("window.scrollBy(0,1000)", "");
        ExpectedConditions.elementToBeClickable(searchOnProposedBudgetRecords);
        Thread.sleep(5000);
        searchOnProposedBudgetRecords.sendKeys("2030");
        ObjectRepo.test.log(Status.PASS, "User is searching");
    }

    public void selectCheckBoxOnProposedBudgetRecords() throws InterruptedException {
        Thread.sleep(5000);
        selectCheckBoxOnProposedBudgetRecords.click();
        ObjectRepo.test.log(Status.PASS, "User selected the CheckBox");
    }

    public void selectRadioButtonRequestRevisions() throws InterruptedException {
        Thread.sleep(5000);
        selectRadioButtonRequestRevisions.click();
        ObjectRepo.test.log(Status.PASS, "User selected the Radio Button");
    }

    public void enterComment() throws InterruptedException {
        Thread.sleep(5000);
        enterComment.sendKeys("Revisions Request");
        ObjectRepo.test.log(Status.PASS, "User enters Comment");
    }

    public void clickSubmit() throws InterruptedException {
        Thread.sleep(5000);
        clickSubmit.click();
        ObjectRepo.test.log(Status.PASS, "User clicks Submit");
    }

    public void enterPassphrase() throws InterruptedException {
        Thread.sleep(5000);
        enterPassphrase.sendKeys("Wciadmin@123");
        ObjectRepo.test.log(Status.PASS, "User enters Passphrase");
    }

    public void clickConfirm() throws InterruptedException {
        Thread.sleep(5000);
        clickConfirm.click();
        ObjectRepo.test.log(Status.PASS, "User clicks Confirm Button");
    }

    public String getSuccessHeader() throws InterruptedException {
        Thread.sleep(5000);
        String text = getSuccessHeader.getText();
        ObjectRepo.test.log(Status.PASS, "Captured Success Header");
        return text;
    }

    public String getSuccessMessage() throws InterruptedException {
        Thread.sleep(5000);
        String text = getSuccessMessage.getText();
        ObjectRepo.test.log(Status.PASS, "Captured Success Message");
        return text;
    }
}
