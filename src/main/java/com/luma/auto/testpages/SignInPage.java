package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import io.cucumber.java.ro.Si;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {

    public SignInPage(){
        PageFactory.initElements(driver, this);
    }
}
