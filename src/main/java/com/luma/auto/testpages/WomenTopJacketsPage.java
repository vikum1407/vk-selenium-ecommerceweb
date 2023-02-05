package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class WomenTopJacketsPage extends TestBase {

    public WomenTopJacketsPage(){
        PageFactory.initElements(driver, this);
    }
}
