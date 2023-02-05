package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class MenTopTeesPage extends TestBase {

    public MenTopTeesPage(){
        PageFactory.initElements(driver, this);
    }
}
