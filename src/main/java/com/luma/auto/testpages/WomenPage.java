package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends TestBase {

    @FindBy(xpath = "//span[@class='base']")
    WebElement womenTitle;

    public void WomenPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean validateWomenTitle(){
        return womenTitle.isDisplayed();
    }
}
