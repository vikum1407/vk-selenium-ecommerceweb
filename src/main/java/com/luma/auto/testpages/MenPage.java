package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MenPage extends TestBase {

    public MenPage(){
        PageFactory.initElements(driver, this);
    }
}
