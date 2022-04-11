package tests.home_page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

//import static helpers.APIHelpers.print111;

public class HomePageTests extends TestBase {
    HomePage homepage;


    @BeforeMethod
    public void initTest() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void openLoginAndRegistrationPage() {
        click(By.cssSelector("#login_link"));
        Assert.assertTrue(homepage.isPageOpened());
    }

    @Test
    public void homePageValidationTest(){

Assert.assertTrue(homepage.homeLinkIsVissible(), "HomeLink");
    }
}
