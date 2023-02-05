package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsNewPage extends TestBase {

    @FindBy(xpath = "//span[@class='base']")
    WebElement whatsNewLb;

    @FindBy(xpath = "//main[@id='maincontent']//strong[1]//span[1]")
    WebElement newInWomens;

    @FindBy(xpath = "//main[@id='maincontent']//strong[2]//span[1]")
    WebElement newInMens;

    public WhatsNewPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean validatewhatsNewLabel(){
        return whatsNewLb.isDisplayed();
    }

    public boolean validatewhatsnewWomem(){
        return newInWomens.isDisplayed();
    }

    public boolean validateWhatsNewMens(){
        return newInMens.isDisplayed();
    }
}
