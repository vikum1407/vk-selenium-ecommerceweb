package com.luma.auto.testcases;

import com.luma.auto.testbase.TestBase;
import com.luma.auto.testpages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhatsNewTestPage extends TestBase {

    HomePage homePage;

    public WhatsNewTestPage(){
        super();
    }

    @BeforeMethod
    public void setupMethod(){
        initialization();
        homePage = new HomePage();

    }

    @Test
    public void clickWomenBtn(){
        homePage.clickWhatsNewPage();
    }


    @AfterMethod
    public void tierDown(){
        driver.quit();
    }
}
