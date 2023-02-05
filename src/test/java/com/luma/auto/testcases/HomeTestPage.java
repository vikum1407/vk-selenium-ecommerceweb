package com.luma.auto.testcases;

import com.luma.auto.testbase.TestBase;
import com.luma.auto.testpages.HomePage;
import com.luma.auto.testpages.WomenPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTestPage extends TestBase {

    WomenPage womenPage;
    HomePage homePage;

    public HomeTestPage(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        homePage = new HomePage();
        womenPage = new WomenPage();
    }


   @Test
   public void validatelogo(){
    homePage.validateLumaLogo();
   }

   @Test
   public void validateHotSales(){
        homePage.validateHotSales();
   }

   @Test
   public void validateSubscriptionBtn(){
        homePage.validateSubscriptionBtn();
   }

   @Test
   public void validateProductGrids(){
        homePage.validateProductTitle();
   }


    @AfterMethod
    public void tierDownMethod(){
        driver.quit();
    }
}
