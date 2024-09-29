package pages;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import Utilities.ObjectRepo;
import Utilities.commonLib;

public class CrossTransferPreRequest {

    @FindBy(xpath = "//input[@name='email']")
    public WebElement searchFieldOnInitialUsers01;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement textBoxPassWord;

    @FindBy(xpath = "//button[@data-testid='login_btn']")
    private WebElement btnLogin;

    private commonLib CommonLibref = new commonLib();
    private jurisdictionNameStoreInExcelFile_Pom jp = new jurisdictionNameStoreInExcelFile_Pom();

    public CrossTransferPreRequest() {
        PageFactory.initElements(driver.get(), this);
    }

    public void fetchSeededUserCAAuth() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(27));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededUserQCAuth() {
        wait.until(ExpectedConditions.elementToBeClickable(searchFieldOnInitialUsers01));
        CommonLibref.click(searchFieldOnInitialUsers01, "moveToElementClick", "userIDField");
        searchFieldOnInitialUsers01.sendKeys(Keys.CONTROL, "a");
        searchFieldOnInitialUsers01.sendKeys(Keys.BACK_SPACE);
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(28));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededUserWAAdmin() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(11));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededUserNewJuriAdmin() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(25));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededCaliforniaRegistrar() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(31));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededQuebecRegistrar() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(32));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededUserNewJuriAuth() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(26));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededUserTransferringUser() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(29));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void fetchSeededUserReceivingUser() {
        wait.until(ExpectedConditions.visibilityOf(searchFieldOnInitialUsers01));
        searchFieldOnInitialUsers01.sendKeys(jp.fetchStoredJurisdictionNameValue(30));
        ObjectRepo.test.log(Status.PASS, "UserName entered successfully ");
        System.out.println("UserName entered successfully");

        wait.until(ExpectedConditions.elementToBeClickable(textBoxPassWord));
        CommonLibref.click(textBoxPassWord, "moveToElementClick", "PassphraseField");
        textBoxPassWord.sendKeys(Keys.CONTROL, "a");
        textBoxPassWord.sendKeys(Keys.BACK_SPACE);
        textBoxPassWord.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
        ObjectRepo.test.log(Status.PASS, "Step : User ID or passphrase entered is valid.");
        System.out.println("User ID or passphrase entered is valid.");

        CommonLibref.click(btnLogin, "seleniumClick", "btnLogin");
        ObjectRepo.test.log(Status.PASS, "Step : Click on Login button ");
        System.out.println("Click on Login button");
    }

    public void CreateCaliforniaEntity() {
        EntityRegistrartion_Flow2_POM ref6 = new EntityRegistrartion_Flow2_POM();
        ref6.Verification_of_accessibility_of_Register_an_Entity_button_of_Entity_Account_Application_Page();
        ref6.selectJurisdictionFunctionalityForQuebec();
        ref6.selectEntityTypeAsCoveredEntity();
        ref6.addEntityInformationforCaliforniaTransfers();
        ref6.addContatctInformation();
        ref6.Verification_of_Add_Facility_Information();
        ref6.addRepresentative();
        ref6.AuctionandReserveSaleInformation();
        ref6.ReviewandSubmitpage();
        ref6.ClickonFinish();
    }

    public void CreateQuebecEntity() {
        EntityRegistrartion_Flow2_POM ref6 = new EntityRegistrartion_Flow2_POM();
        ref6.Verification_of_accessibility_of_Register_an_Entity_button_of_Entity_Account_Application_Page();
        ref6.selectJurisdictionFunctionalityForQuebec();
        ref6.selectEntityTypeAsCoveredEntity();
        ref6.addEntityInformationforQuebec();
        ref6.addContatctInformation();
        ref6.Verification_of_Add_Facility_Information();
        ref6.addRepresentative();
        ref6.AuctionandReserveSaleInformation();
        ref6.ReviewandSubmitpage();
        ref6.ClickonFinishEntity2();
    }

    public void ApproveCaliforniaEntity() {
        EntityRegistrartion_Flow2_POM ref6 = new EntityRegistrartion_Flow2_POM();
        ref6.handlesecurityQuestion();
        ref6.searchEntity1();
        ref6.approveEntityApplicationForCoveredEntity();
    }

    public void ApproveQuebecEntity() {
        EntityRegistrartion_Flow2_POM ref6 = new EntityRegistrartion_Flow2_POM();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fetchSeededQuebecRegistrar();
        ref6.handlesecurityQuestion();
        ref6.ClickOnSearchEntity();
        try {
            ref6.SearchEntityID(null, null, 0, 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            ref6.StoreEntityAccountNumbersEntity1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ref6.searchEntity2();
        ref6.approveEntityApplicationForCoveredEntity();
    }
}
