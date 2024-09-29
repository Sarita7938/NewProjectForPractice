package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;
import Utilities.ObjectRepo;
import Utilities.commonLib;
import static constants.ThreadConstants.driver;

public class CancelEditedInitialUser_pom {
    private JavascriptExecutor js;
    private commonLib CommonLibref = new commonLib();
    private WebDriverWait wait;

    @FindBy(xpath = "//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")
    private WebElement ClickDropdownHomePage;

    @FindBy(xpath = "//input[@placeholder='Search…']")
    private WebElement SearchOnHomePage;

    @FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
    private WebElement quickActionsOnHomePage;

    @FindBy(xpath = "//p[text()='Setup Initial Users']")
    private WebElement ClickonSetupUsers;

    @FindBy(xpath = "(//input[@placeholder='Search…'])[1]")
    private WebElement SearchonInitialUser;

    @FindBy(xpath = "//*[@data-testid='MoreHorizIcon']")
    private WebElement quickActionsOnInitialUser;

    @FindBy(xpath = "//*[normalize-space()='UNLOCK PERMANENTLY LOCKED USER']")
    private WebElement UnlockTextonQuickAction;

    public CancelEditedInitialUser_pom() {
        PageFactory.initElements(driver.get(), this);
        wait = new WebDriverWait(driver.get(), Duration.ofSeconds(30));
    }

    public void clickDropdownHomePage() throws InterruptedException {
        Thread.sleep(5000);
        ClickDropdownHomePage.click();
        ObjectRepo.test.log(Status.PASS, "Step 1 : User Selects Dropdown on Home Page");
    }

    public void searchOnHomePage() throws InterruptedException {
        Thread.sleep(1000);
        SearchOnHomePage.sendKeys("CR7");
        ObjectRepo.test.log(Status.PASS, "Step 2 : User Searches Jurisdiction on Home Page");
    }

    public void quickActionsOnHomePage() throws InterruptedException {
        js = (JavascriptExecutor) driver.get();
        js.executeScript("window.scrollBy(0,1700)", "");
        Thread.sleep(6000);
        CommonLibref.click(quickActionsOnHomePage, "seleniumClick", "quickActionsOnHomePage");
        Thread.sleep(2000);
        ObjectRepo.test.log(Status.PASS, "Step 3 : User Selects Quick Action");
    }

    public void clickonSetupUsers() throws InterruptedException {
        CommonLibref.click(ClickonSetupUsers, "seleniumClick", "quickActionsOnHomePage");
        Thread.sleep(2000);
        ObjectRepo.test.log(Status.PASS, "Step 4 : User Selects Setup Initial User");
    }

    public void searchOnInitialUser() throws InterruptedException {
        Thread.sleep(1000);
        SearchonInitialUser.sendKeys("unlockuserwci");
        ObjectRepo.test.log(Status.PASS, "Step 5 : User Searches User on Initial User");
    }

    public void quickActionsOnInitialUser() throws InterruptedException {
        js = (JavascriptExecutor) driver.get();
        js.executeScript("window.scrollBy(0,170)", "");
        Thread.sleep(6000);
        CommonLibref.click(quickActionsOnInitialUser, "seleniumClick", "quickActionsOnInitialUser");
        Thread.sleep(2000);
        ObjectRepo.test.log(Status.PASS, "Step 6 : User Selects Quick Action");
    }

    public String unlockTextonQuickAction() throws InterruptedException {
        Thread.sleep(6000);
        String status;
        if (wait.until(ExpectedConditions.elementToBeClickable(UnlockTextonQuickAction)) != null) {
            status = "UNLOCK PERMANENTLY LOCKED USER Button is enabled";
        } else {
            status = "UNLOCK PERMANENTLY LOCKED USER Button is disabled";
        }
        ObjectRepo.test.log(Status.PASS, "Step 7 : Check Unlock Permanently Locked User Button is enabled or disabled");
        return status;
    }
}
