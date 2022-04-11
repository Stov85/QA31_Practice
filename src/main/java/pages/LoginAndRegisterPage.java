package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAndRegisterPage extends PageBase {

    public LoginAndRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="register_form")
    WebElement LogAndRegPage;

//    WebElement LogAndRegPage = driver.findElement(By.cssSelector("h2:first-child"));
//WebElement RegConfirmButton = driver.findElement(By.cssSelector("[name=registration_submit]"));

    public boolean isLoginAndRegistrationPageOpened() {
        return LogAndRegPage.isDisplayed();
    }

    public void fillEmail(String email) {
        inputText(driver.findElement(By.cssSelector("#id_registration-email")), email);
    }

    public void fillPassword(String password) {
        inputText(driver.findElement(By.id("id_registration-password1")), password);
    }

    public void fillConfirmPassword(String password) {
        inputText(driver.findElement(By.id("id_registration-password2")), password);
    }

    public void clickOnRegisterButton() {
        click(driver.findElement(By.cssSelector("[name='registration_submit']")));
    }
}
