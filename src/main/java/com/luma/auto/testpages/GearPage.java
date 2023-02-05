package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends TestBase {

    public GearPage(){
        PageFactory.initElements(driver, this);
    }
}
