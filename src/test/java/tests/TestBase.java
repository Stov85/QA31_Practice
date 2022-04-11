package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

   public WebDriver driver;

    @BeforeMethod

    public void setDriver(){

        driver = new ChromeDriver();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");
     //   driver.navigate().to("http://selenium1py.pythonanywhere.com/en-gb/");
     driver.manage().window().maximize();
      //  driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void tearDown(){
       // driver.close();
       // driver.quit();
    }

    public void click(By locator){
       driver.findElement(locator).click();
    }

}
