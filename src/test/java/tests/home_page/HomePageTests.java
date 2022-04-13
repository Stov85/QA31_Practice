package tests.home_page;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import static helpers.APIHelpers.print111;

public class HomePageTests extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void initTest(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void homePageValidationTest(){
        Assert.assertTrue(homePage.homeLinkIsVisible(), "Home Link");
    }
@Test
    public void changeLanguageTest ()  {
       String lang = "ru";
       String expText = "Найти";
        homePage.selectLang(lang);
        homePage.clickOnGoButton();
     Assert.assertTrue(homePage.isTranslated(), "Найти");
   //Assert.assertEquals(homePage.getTextFromButton(), expText, "Texts are different!!!");

}
}
