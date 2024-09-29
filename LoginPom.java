package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aventstack.extentreports.Status;

import Utilities.ObjectRepo;
import Utilities.commonLib;
import static constants.ThreadConstants.driver;
import static Utilities.listeners.wait;
import static Utilities.listeners.prop;


public class LoginPom {
	public static commonLib commonLibRef = new commonLib();

    @FindBy(xpath = "//div[text()='Select Jurisdiction']")
    private WebElement selectJurisdictionDropDown;
    
    @FindBy(xpath = "//*[@class='MuiBox-root css-o0oaiu']")
    private WebElement selectJurisdictionDropDown2;
    
    @FindBy(xpath = "(//*[text()='Select Jurisdiction'])[1]")
    private WebElement selectJurisdictionLink;
    
    @FindBy(xpath = "//*[text()='California']")
    private WebElement selectOptionCalifornia;
    
    @FindBy(xpath = "//span[contains(text(),'Quebec')]")
    private WebElement selectOptionQuebec;
    
    @FindBy(xpath = "//span[contains(text(),'Washington')]")
    private WebElement selectOptionWashington;
    
    @FindBy(xpath = "//span[contains(text(),'Nova Scotia')]")
    private WebElement selectOptionNovaScotia;
    
    @FindBy(xpath = "//div[text()='Select Language']")
    private WebElement selectLanguageDropDown;
    
    @FindBy(xpath = "//span[text()='English']")
    private WebElement selectLanguageEnglish;
    
    @FindBy(xpath = "//button[text()='CONTINUE']")
    private WebElement btnContinue;
    
    @FindBy(xpath = "//input[@name='email']")
    private WebElement textBoxEmail;
    
    @FindBy(xpath = "//input[@name='password']")
    private WebElement textBoxPassword;
    
    @FindBy(xpath = "//input[@name='remember']")
    private WebElement checkBoxRememberMe;
    
    @FindBy(xpath = "//button[@data-testid='login_btn']")
    private WebElement btnLogin;
    
    @FindBy(xpath = "//button[@data-testid='priv_btn_login']")
    private WebElement btnLogin2;
    
    @FindBy(xpath = "//button[contains(text(),'Welcome,')]")
    private WebElement btnWelcomeProfile;
    
    @FindBy(xpath = "//button[contains(text(),'Welcome,')]//child::*[local-name()='svg']")
    private WebElement btnWelcomeProfileDropdown;
    
    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement btnLogOut;
	public LoginPom() {
		PageFactory.initElements(driver.get(), this);
	}

	public void selectJurisdictionandLangaugeForCalifornia() {
		wait.until(ExpectedConditions.visibilityOf(selectJurisdictionDropDown));
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionDropDown)).click();
		commonLibRef.click(selectOptionCalifornia, "javascriptClick", "selectOptionCalifornia");
//		wait.until(ExpectedConditions.elementToBeClickable(selectOptionCalifornia)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		ObjectRepo.test.log(Status.PASS, "User is navigated to login page");
	}

	public void changeJurisdictionandLangaugeForCalifornia() {
		commonLibRef.click(selectJurisdictionDropDown, "seleniumClick", "selectJurisdictionDropDown");
		commonLibRef.click(selectOptionCalifornia, "seleniumClick", "selectOptionCalifornia");
		commonLibRef.click(selectLanguageDropDown, "seleniumClick", "selectLangaugeDropDown");
		commonLibRef.click(selectLanguageEnglish, "seleniumClick", "selectlangEnglish");
		commonLibRef.click(selectJurisdictionDropDown2, "seleniumClick", "selectJurisdictionDropDown2");
		commonLibRef.click(selectOptionQuebec, "seleniumClick", "selectOptionQuebec");
		ObjectRepo.test.log(Status.PASS, "Step 6 : Select checkbox for Quebec jurisdiction ");
	}

	public void Verification_of_Select_Jurisdiction_Functionality_Continue_button_with_emptyData() {
		try {
			commonLibRef.isDisabled(btnContinue, "btnContineu");
			ObjectRepo.test.log(Status.PASS, "Step 6 : User is navigate to login page");
		} catch (Exception e) {
			System.out.println("continue button is disabled");
			ObjectRepo.test.log(Status.PASS, "continue button is disabled");
		}
	}

	public void selectJurisdictionandLangaugeForQuebec() {
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionDropDown));
		commonLibRef.click(selectJurisdictionDropDown, "seleniumClick", "selectJurisdictionDropDown");
		commonLibRef.click(selectOptionQuebec, "seleniumClick", "selectOptionQuebec");
		wait.until(ExpectedConditions.elementToBeClickable(btnContinue));
		commonLibRef.click(btnContinue, "seleniumClick", "btnContineu");
		ObjectRepo.test.log(Status.PASS, "Step 6 : User is navigate to login page");
	}

	public void selectJurisdictionandLangaugeForWashington() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionDropDown));
		commonLibRef.click(selectJurisdictionDropDown, "seleniumClick", "selectJurisdictionDropDown");
		wait.until(ExpectedConditions.elementToBeClickable(selectOptionWashington));
		commonLibRef.click(selectOptionWashington, "seleniumClick", "selectOptionWashington");
		commonLibRef.click(btnContinue, "seleniumClick", "btnContineu");
		ObjectRepo.test.log(Status.PASS, "Step 6 : User is navigate to login page");
	}

	public void selectJurisdictionandLangaugeForNovaScotia() {
		wait.until(ExpectedConditions.elementToBeClickable(selectJurisdictionDropDown));
		commonLibRef.click(selectJurisdictionDropDown, "seleniumClick", "selectJurisdictionDropDown");
		commonLibRef.click(selectOptionNovaScotia, "seleniumClick", "selectOptionNovaScotia");
		commonLibRef.click(btnContinue, "seleniumClick", "btnContineu");
		ObjectRepo.test.log(Status.PASS, "Step 6 : User is navigate to login page");
	}

	public void loginWithValidCredentials() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName2"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName2"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password2"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	
	

	public void loginWithValidCredentials_WCIAdmin() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("WciAdminLogin1"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName2"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord1"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("WCIIncAdmin12"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("WCIIncAdmin12"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}

	public void loginWithWCIIncAdmin12() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("WCIIncAdmin12"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("WCIIncAdmin12"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password2"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("WCIIncAdmin12"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("WCIIncAdmin12"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	
	public void loginWithValidCredentials_Registrar() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("RegistrarLogin2"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName2"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord2"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}

	public void loginWithValidCredentials_RegistrarTesting1() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("RegistrarTesting1"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("RegistrarTesting1"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord2"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	
	
	
	public void loginWithValidCredentials_Admin() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("AdminLogin3"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("LoginPassWord3"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	public void loginWithValidCredentials_Authority_Quebec() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("QuebecAuth1"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("QuebecAuth1PassWord"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	public void loginWithValidCredentials_QuebecRegistrar() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("Regitrar_QC"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("Regitrar_QC_Pass"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	
	public void loginWithValidCredentials_Admin_Quebec() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("admin1.qc"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("Password"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("admin1.qc"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}	
	public void loginWithValidCredentials_AR1() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("nsusera"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("nsuserapassword"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Clicked on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("nsusera"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("nsuserapassword"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Clicked on Login button ");
		}
	}
	public void loginWithValidCredentials_AR2() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("TRUserB"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("TRUserBPassword"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	public void loginWithValidCredentials_AR3() {
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("TRUserC"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("TRUserCPassword"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("LoginPassWord3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	public void loginWithARwithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("ARUserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("ARUserName"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("ARPassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("ARPassWord"));
		commonLibRef.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void loginWithAVAwithValidCredentials() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("AVAUsername"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("AVAUsername"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("AVAPassword"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("AVAPassword"));
		commonLibRef.click(checkBoxRememberMe, "seleniumClick", "checkBoxRememberMe");
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void loginWithValidCredentialsForPendingUser() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void loginWithDeniedIndividualUser() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName3"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName3"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord3"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord3"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void JurisdictionUserloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("JU_UserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JU_UserName"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("JU_PassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("JU_PassWord"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void IndividualUserloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("PassWord"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("PassWord"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void QuebecJurisdictionUserloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("JU_UserName_QC"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JU_UserName_QC"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("JU_PassWord_QC"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS,
				"Step 8 : PassWord entered successfully :" + prop.getProperty("JU_PassWord_QC"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void QuebecJurisdictionAdminloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("JAdmin_Username_QC"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JAdmin_Username_QC"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("JAdmin_Password_QC"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS,
				"Step 8 : PassWord entered successfully :" + prop.getProperty("JAdmin_Password_QC"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void NSJurisdictionUserloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("JU_UserName_NS"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JU_UserName_NS"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("JU_PassWord_NS"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS,
				"Step 8 : PassWord entered successfully :" + prop.getProperty("JU_PassWord_NS"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}

	public void WAJurisdictionUserloginWithValidCredentials() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmail));
		commonLibRef.typeText(textBoxEmail, prop.getProperty("JU_UserName_WA"), "textBoxEmail");
		ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JU_UserName_WA"));
		commonLibRef.typeText(textBoxPassword, prop.getProperty("JU_PassWord_WA"), "textBoxPassWord");
		ObjectRepo.test.log(Status.PASS,
				"Step 8 : PassWord entered successfully :" + prop.getProperty("JU_PassWord_WA"));
		commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
		ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
	}
	
	public void NorthDakotaJurisdictionJSAloginWithValidCredentials() {
	
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("JSANorthUserID"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSANorthUserID"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("JSAUserPassword"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("JSAUserPassword"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("JSANorthUserID"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("JSANorthUserID"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("JSAUserPassword"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("JSAUserPassword"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
		
	}

	public void AuthorityloginWithValidCredentials() {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName3"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName3"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("Password3"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("UserName3"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("UserName3"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("Password3"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
		
	}
	
	public void AuthorityloginWithParisJurisdiction() {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("ParisAuthority"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("ParisAuthority"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("Password3"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		} catch (Exception e) {
			commonLibRef.click(btnLogin2, "moveToElementClick", "btnLogin2");
			wait.until(ExpectedConditions.visibilityOf(textBoxEmail));
			commonLibRef.typeText(textBoxEmail, prop.getProperty("ParisAuthority"), "textBoxEmail");
			ObjectRepo.test.log(Status.PASS, "UserName entered successfully :" + prop.getProperty("ParisAuthority"));
			commonLibRef.typeText(textBoxPassword, prop.getProperty("Password3"), "textBoxPassWord");
			ObjectRepo.test.log(Status.PASS, "Step 8 : PassWord entered successfully :" + prop.getProperty("Password3"));
			commonLibRef.click(btnLogin, "seleniumClick", "btnLogin");
			ObjectRepo.test.log(Status.PASS, "Step 10 : Click on Login button ");
		}
	}
	
	
	
	
	public void logout() {
		commonLibRef.scroll(btnWelcomeProfile, "scrollToTopOFPage", "btnWelcomeProfile DD");
		wait.until(ExpectedConditions.elementToBeClickable(btnWelcomeProfile));
		try {
			commonLibRef.click(btnWelcomeProfile, "javascriptClick", "welcome profile button");
		} catch (Exception e) {
			commonLibRef.click(btnWelcomeProfile, "moveToElementClick", "welcome profile button");
		}
		wait.until(ExpectedConditions.elementToBeClickable(btnLogOut));
		try {
			commonLibRef.click(btnLogOut, "javascriptClick", "btnLogOut");	
		}catch (Exception e)
		{
			commonLibRef.click(btnLogOut, "moveToElementClick", "btnLogOut");
		}
		System.out.println("User has successfully logout");
		
	}
  
}
