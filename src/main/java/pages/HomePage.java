package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[contains(.,'Oscar')]")
    WebElement element;
    @FindBy(id = "login_link")
    WebElement logAndRegPage;
    @FindBy(css = ".alertinner.wicon")
    WebElement registerSuccessMessage;

  //  WebElement element = driver.findElement(By.xpath("//a[contains(.,'Oscar')]"));
    //WebElement logAndRegPage = driver.findElement(By.cssSelector("h2:first-child"));
    //WebElement buttonRegAndLog = driver.findElement(By.id("login_link"));

    public boolean homeLinkIsVissible() {
        return element.isDisplayed();
    }

    public boolean isPageOpened(){
        return logAndRegPage.isDisplayed();
    }

    public void clickToLoginAndRegistrationButton() {
        click(logAndRegPage);
    }

    public boolean registerSuccessIsDisplayed() {
        waitUntilElementVisible(registerSuccessMessage, 30);
        return registerSuccessMessage.isDisplayed();
    }
}
