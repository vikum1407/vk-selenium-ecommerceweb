package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class GearWatchesPage extends TestBase {

    public GearWatchesPage(){
        PageFactory.initElements(driver, this);
    }
}
