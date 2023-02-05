package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import io.cucumber.java.da.Men;
import org.openqa.selenium.support.PageFactory;

public class MenBottomsPantsPage extends TestBase {

    public MenBottomsPantsPage(){
        PageFactory.initElements(driver, this);
    }
}
