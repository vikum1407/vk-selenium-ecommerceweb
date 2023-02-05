package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MenTopJacketsPage extends TestBase {

    public MenTopJacketsPage(){
        PageFactory.initElements(driver, this);
    }
}
