package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.aventstack.extentreports.Status;
import Utilities.ObjectRepo;
import static Utilities.listeners.wait;
import static constants.ThreadConstants.driver;

import java.util.List;
import java.util.Set;

public class getEmail {

    String link;

    @FindBy(xpath = "/html/body/header/div/div/div/a[2]")
    private WebElement signInButton;
    
    @FindBy(id = "identifierId")
    private WebElement emailField;
    
    @FindBy(xpath = "//*[text()='Next']")
    private WebElement nextButtonAfterEmail;
    
    @FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
    private WebElement passwordField;
    
    @FindBy(xpath = "//*[text()='Next']")
    private WebElement nextButtonAfterPassword;
    
    @FindBy(xpath = "(//tbody//tr[1])[6]")
    private WebElement firstEmail;
    
    @FindBy(xpath = "//*[@placeholder='Search mail']")
    private WebElement searchEmail;
    
    @FindBy(xpath = "(//table)[6]//tbody//tr")
    private WebElement elementWithId;
    
    @FindBy(xpath = "//*[text()='View messages']")
    private WebElement viewMessages;
    
    @FindBy(xpath = "//*[contains(@href, 'https://qa2.wci-registry.org/create-user-profile?LinkID=')]")
    private List<WebElement> linkContainingHref;

    public void getCurrentEmailData(String mailId, String mailData, String mailSubject) {
        driver.get().navigate().to("https://yopmail.com/en/");
        driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(mailId);
        driver.get().findElement(By.xpath("//*[@id='refreshbut']/button/i")).click();
        driver.get().switchTo().frame(2);
        WebElement userIDField = driver.get().findElement(By.xpath("//a[contains(@href,'https://qa2.wci-registry.org/create-user-profile?')]"));
        link = userIDField.getText();
        System.out.println(link);
        String mailTitle = driver.get().findElement(By.xpath("//div[@class='ellipsis nw b f18']")).getText();
        System.out.println("Mail title is :" + mailTitle);
        System.out.println("Mail Title is :" + mailSubject);
        String mailContent = driver.get().findElement(By.xpath("//*[@id='mail']/div")).getText();
        System.out.println(mailContent);
        System.out.println("mailContent is :" + mailContent);
        System.out.println("mailData is :" + mailData);
        if (mailTitle.equals(mailSubject)) {
            System.out.println("Email title verification passed");
        } else {
            System.out.println("Email title verification failed");
        }
        if (mailContent.equals(mailData)) {
            System.out.println("Email verification passed");
        } else {
            System.out.println("Email verification failed");
        }
    }

    public void getCurrentEmailDataForInvalid(String mailId, String mailData, String mailSubject) throws InterruptedException {
        driver.get().navigate().to("https://yopmail.com/en/");
        driver.get().findElement(By.xpath("//*[@id='login']")).sendKeys(mailId);
        Thread.sleep(2000);
        driver.get().findElement(By.xpath("//*[@id='refreshbut']/button/i")).click();
    }

    public void openMail(String email, String password, String username) {
        System.out.println("Click on the save button & verify the “Set Up” user account link");
        ObjectRepo.test.log(Status.PASS, "Click on the save button & verify the “Set Up” user account link");

        driver.get().navigate().to("https://www.google.com/gmail/about/");
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterEmail)).click();
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonAfterPassword)).click();
        wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(searchEmail)).sendKeys(Keys.ENTER);

        try {
            elementWithId.click();
        } catch (Exception e) {
            viewMessages.click();
            elementWithId.click();
        }

        String originalWindow = driver.get().getWindowHandle();
        assert driver.get().getWindowHandles().size() == 1;

        JavascriptExecutor js = (JavascriptExecutor) driver.get();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int noOfLinksFound = linkContainingHref.size();
        if (noOfLinksFound > 0) {
            linkContainingHref.get(noOfLinksFound - 1).click();
        } else {
            System.out.println("No links found!");
        }

        Set<String> allWindows = driver.get().getWindowHandles();
        while (allWindows.size() == 1) {
            allWindows = driver.get().getWindowHandles();
        }

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.get().switchTo().window(windowHandle);
                break;
            }
        }

        System.out.println("Registration Link Email should get sent to the registered Jurisdiction User.");
        ObjectRepo.test.log(Status.PASS, "Set Up user account link should be activated.");
    }
}
