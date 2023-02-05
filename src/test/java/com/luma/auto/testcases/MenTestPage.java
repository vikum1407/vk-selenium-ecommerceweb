package com.luma.auto.testcases;

import com.luma.auto.testbase.TestBase;
import com.luma.auto.testpages.HomePage;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenTestPage extends TestBase {

    HomePage homePage;

    public MenTestPage(){
        super();
    }

    @BeforeMethod
    public void setupMethod(){
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void clickMenBtn(){
        homePage.clickMenBtn();
    }



    @AfterMethod
    public void tierDown(){
        driver.quit();
    }
}
