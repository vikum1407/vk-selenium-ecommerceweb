package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class WomenTopsPage extends TestBase {

    public WomenTopsPage(){
        PageFactory.initElements(driver, this);
    }
}
