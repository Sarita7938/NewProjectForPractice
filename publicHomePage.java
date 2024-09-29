package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;

import Utilities.CommonMethods;
import Utilities.ObjectRepo;
import static constants.ThreadConstants.driver;

import java.time.Duration;

import static Utilities.listeners.prop;
import static Utilities.listeners.wait;

public class publicHomePage {
	CommonMethods demo;
	@FindBy(xpath = "//div[text()='Select Jurisdiction']")
	WebElement SelectJurisdiction;
	@FindBy(xpath = "//span[text()=\"California\"]")
	WebElement CaliforniaJurisdiction;
	@FindBy(xpath = "//span[text()=\"Quebec\"]")
	WebElement QuebecJurisdiction;
	@FindBy(xpath = "//span[text()='Nova Scotia']")
	WebElement NSJurisdiction;
	@FindBy(xpath = "//span[text()=\"Washington State\"]")
	WebElement WashingtonJurisdiction;
	@FindBy(xpath = "//button[text()='CONTINUE']")
	WebElement ContinueBtn;
	@FindBy(xpath = "//input[@name='email']")
	public WebElement Username;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	@FindBy(xpath = "//button[@id='login_btn']")
	public WebElement LognBtn;
	@FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-h6 css-1etlmxt']")
	WebElement SecQueAnswer;
	@FindBy(xpath = "//input[@id='Answer']")
	WebElement InputAnswer;
	@FindBy(xpath = "//button[@data-testid='priv_btn_ContinueBtn']")
	WebElement Continue;
	@FindBy(xpath = "//h2[text()='Updated Terms and Conditions']")
	WebElement Updated_Terms_and_Conditions;
	@FindBy(xpath = "(//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-11jfdjc']//child::span)[1]")
	WebElement CheckBox;
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-5zd7v5']")
	WebElement SuccessPopupClose;

	public publicHomePage() {
		PageFactory.initElements(driver.get(), this);
	}

	public void selectJurisdiction(String Jurisdiction) {

		if (Jurisdiction.equals("California")) {
			SelectJurisdiction.click();
			ExpectedConditions.elementToBeClickable(CaliforniaJurisdiction);
			CaliforniaJurisdiction.click();
			ExpectedConditions.elementToBeClickable(ContinueBtn);
			ContinueBtn.click();
			ObjectRepo.test.log(Status.PASS, "Selects California Jurisdiction ");
		} else if (Jurisdiction.equals("Quebec")) {
			SelectJurisdiction.click();
			ExpectedConditions.elementToBeClickable(QuebecJurisdiction);
			QuebecJurisdiction.click();
			ExpectedConditions.elementToBeClickable(ContinueBtn);
			ContinueBtn.click();
			ObjectRepo.test.log(Status.PASS, "Selects Quebec Jurisdiction ");
		} else if (Jurisdiction.equals("Nova Scotia")) {
			SelectJurisdiction.click();
			wait.until(ExpectedConditions.elementToBeClickable(NSJurisdiction)).click();
			ExpectedConditions.elementToBeClickable(ContinueBtn);
			ContinueBtn.click();
			ObjectRepo.test.log(Status.PASS, "Selects Nova Scotia Jurisdiction ");
		} else if (Jurisdiction.equals("Washington")) {
			SelectJurisdiction.click();
			ExpectedConditions.elementToBeClickable(WashingtonJurisdiction);
			WashingtonJurisdiction.click();
			ExpectedConditions.elementToBeClickable(ContinueBtn);
			ContinueBtn.click();
			ObjectRepo.test.log(Status.PASS, "Selects Washington Jurisdiction ");
		}

	}

	public void loginFunctionality(String JurisdictionUser, String UserType) {
		wait.until(ExpectedConditions.elementToBeClickable(Username));
		if (UserType.equals("JurisdictionAdmin")) {
			if (JurisdictionUser.equals("California")) {
				Username.sendKeys(prop.getProperty("CaliforniaAdminUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with California Jurisdiction Admin ");
			} else if (JurisdictionUser.equals("Quebec")) {
				Username.sendKeys(prop.getProperty("QuebecAdminUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Quebec Jurisdiction Admin ");
			} else if (JurisdictionUser.equals("Nova Scotia")) {
				Username.sendKeys(prop.getProperty("NSAdminUsername"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Nova Scotia Jurisdiction Admin ");

			} else if (JurisdictionUser.equals("Washington")) {
				Username.sendKeys(prop.getProperty("WashingtonAdminUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Washington Jurisdiction Admin ");

			} else if (JurisdictionUser.equals("Sitka")) {
				Username.sendKeys(prop.getProperty("SitkaAdminUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Sitka Jurisdiction Admin ");
			} else if (JurisdictionUser.equals("QAOne")) {
				Username.sendKeys(prop.getProperty("QAOneAdminUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with QA One Jurisdiction Admin ");
			} else if (JurisdictionUser.equals("Trial9")) {
				Username.sendKeys(prop.getProperty("AdminTrial9"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Trial 9 Jurisdiction Admin ");
			}
			
			
		}

		else if (UserType.equals("Authority")) {
			if (JurisdictionUser.equals("California")) {
				Username.sendKeys(prop.getProperty("CaliforniaAuthUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with California Jurisdiction Authority ");
			} else if (JurisdictionUser.equals("Quebec")) {
				Username.sendKeys(prop.getProperty("QuebecAuthUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Quebec Jurisdiction Authority ");
			} else if (JurisdictionUser.equals("Nova Scotia")) {
				Username.sendKeys(prop.getProperty("NSAduthUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Nova Scotia Jurisdiction Authority ");

			} else if (JurisdictionUser.equals("Washington")) {
				Username.sendKeys(prop.getProperty("WashingtonAuthUsername"));
				Password.sendKeys(prop.getProperty("Password2"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Washington Jurisdiction Authority ");

			}  else if (JurisdictionUser.equals("Sitka")) {
				Username.sendKeys(prop.getProperty("SitkaAuthUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Sitka Jurisdiction Authority ");

			}  else if (JurisdictionUser.equals("QAOne")) {
				Username.sendKeys(prop.getProperty("QAOneAuthUsername"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with QA One Jurisdiction Authority ");

			} else if (JurisdictionUser.equals("Trial9")) {
				Username.sendKeys(prop.getProperty("AuthTrial9"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Trial9 Jurisdiction Authority ");

			} 
			
			
			

		} else if (UserType.equals("WciincAdmin")) {
			if (JurisdictionUser.equals("California")) {
				Username.sendKeys(prop.getProperty("WciIncAdminUserID11"));
				Password.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with WCI Inc Admin ");
			} else if (JurisdictionUser.equals("Quebec")) {
				Username.sendKeys(prop.getProperty("WciIncAdminUserID11"));
				Password.sendKeys(prop.getProperty("WciIncAdminPassphrase"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with WCI Inc Admin ");
			
			}
			
		} else if (UserType.equals("Registrar")) {
			if (JurisdictionUser.equals("California")) {
				Username.sendKeys(prop.getProperty("CaliforniaRegistrar"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with California Registrar Admin ");
			} else if (JurisdictionUser.equals("Quebec")) {
				Username.sendKeys(prop.getProperty("QuebecRegistrar"));
				Password.sendKeys(prop.getProperty("WciPassword"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Quebec Registrar Admin ");
			} else if (JurisdictionUser.equals("Nova Scotia")) {
				Username.sendKeys(prop.getProperty("NSRegistrar"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with NS Registrar Admin ");
			} else if (JurisdictionUser.equals("Washington")) {
				Username.sendKeys(prop.getProperty("WashingtonRegistrar"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Washington Registrar Admin ");
			}
		}else if (UserType.equals("JSA")) {
			if (JurisdictionUser.equals("Sitka")) {
				Username.sendKeys(prop.getProperty("CaliforniaRegistrar"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with California Registrar Admin ");
			} else if (JurisdictionUser.equals("QAOne")) {
				Username.sendKeys(prop.getProperty("QuebecRegistrar"));
				Password.sendKeys(prop.getProperty("WciPassword"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Quebec Registrar Admin ");
			}
		
		}else if (UserType.equals("AR")) {
			if (JurisdictionUser.equals("Nova Scotia")) {
				Username.sendKeys(prop.getProperty("NS_AR1"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Nova Scotia AR ");
			} else if (JurisdictionUser.equals("Quebec")) {
				Username.sendKeys(prop.getProperty("QC_AR1"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Quebec AR ");
			} else if (JurisdictionUser.equals("California")) {
				Username.sendKeys(prop.getProperty("cal_AR1"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with California AR ");
			} else if (JurisdictionUser.equals("Washington")) {
				Username.sendKeys(prop.getProperty("WA_AR1"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Trial9 AR ");
			} else if (JurisdictionUser.equals("Trial9")) {
				Username.sendKeys(prop.getProperty("Trial9AR"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with QAOne AR ");
			} else if (JurisdictionUser.equals("QAOne")) {
				Username.sendKeys(prop.getProperty("QAOneAR"));
				Password.sendKeys(prop.getProperty("Password3"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Washington AR ");
			}
			
		} else if (UserType.equals("ReceivingAR")) {
			if (JurisdictionUser.equals("Nova Scotia")) {
				Username.sendKeys(prop.getProperty("ApprovingAR_ns"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Nova Scotia Second AR ");
			} else if (JurisdictionUser.equals("Quebec")) {
				Username.sendKeys(prop.getProperty("ApprovingAR_Qb"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Quebec Second AR ");
			} else if (JurisdictionUser.equals("California")) {
				Username.sendKeys(prop.getProperty("ApprovingAR_Cal"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with California Second AR ");
			} else if (JurisdictionUser.equals("Washington")) {
				Username.sendKeys(prop.getProperty("ApprovingAR_wa"));
				Password.sendKeys(prop.getProperty("Password"));
				LognBtn.click();
				ObjectRepo.test.log(Status.PASS, "Logged in with Washington second AR ");
			}
		}
	}

	public void secQueAns() {
		String SecQue = SecQueAnswer.getText();
		if (SecQueAnswer.isDisplayed()) {
			if (SecQue.contains("first car?")) {
				InputAnswer.sendKeys("car");
				Continue.click();
			} else if (SecQue.contains("maiden name?")) {
				InputAnswer.sendKeys("name");
				Continue.click();
			} else if (SecQue.contains("first job?")) {
				InputAnswer.sendKeys("aaaa");
				Continue.click();
			} else if (SecQue.contains("first credit card?")) {
				InputAnswer.sendKeys("card");
				Continue.click();
			} else if (SecQue.contains("teacher?")) {
				InputAnswer.sendKeys("teacher");
				Continue.click();
		
		} else {
			System.out.println("Security Question is not displayed");
		}
		}
	}

	public void Updated_Terms_and_Conditions() throws Exception {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(50));
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		if (Updated_Terms_and_Conditions.isDisplayed()) {
			try {
				CheckBox.click();
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
				js.executeScript("arguments[0].click();", CheckBox);
			}
			Continue.click();
			wait.until(ExpectedConditions.elementToBeClickable(SuccessPopupClose));
			SuccessPopupClose.click();
			Thread.sleep(3000);
			try {
				SuccessPopupClose.click();
			} catch (Exception ex) {
				System.out.println("Popup not display");
			}

		} else {

			System.out.println("Updated Terms and Conditions popup is not displayed");
		}

	}


}
