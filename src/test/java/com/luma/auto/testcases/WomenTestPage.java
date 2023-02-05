package com.luma.auto.testcases;

import com.luma.auto.testbase.TestBase;
import com.luma.auto.testpages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenTestPage extends TestBase {

    HomePage homePage;

    public WomenTestPage(){
        super();
    }

    @BeforeMethod
    public void setupMethod(){
        initialization();
    }

    @Test
    public void clickWomenBtn(){
        homePage.clickWomenBtn();
    }

    @AfterMethod
    public void tierDown(){
        driver.quit();
    }
}
