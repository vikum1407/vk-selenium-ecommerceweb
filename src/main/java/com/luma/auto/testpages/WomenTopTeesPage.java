package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class WomenTopTeesPage extends TestBase {

    public WomenTopTeesPage(){
        PageFactory.initElements(driver, this);
    }
}
