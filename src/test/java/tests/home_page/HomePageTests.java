package tests.home_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import static helpers.APIHelpers.print111;

public class HomePageTests extends TestBase {
    HomePage homepage;


    @BeforeMethod
    public void initTest(){
        homepage = new HomePage();
    }

    @Test
    public void print(){
        print111();
//        System.out.println("test test");
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @Test
    public void print2(){
        System.out.println("222222test test");
    }
}
