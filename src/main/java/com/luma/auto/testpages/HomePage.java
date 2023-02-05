package com.luma.auto.testpages;

import com.luma.auto.testbase.TestBase;
import com.luma.auto.util.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@aria-label='store logo']//img")
    WebElement lumaLogo;

    @FindBy(xpath = "//h2[normalize-space()='Hot Sellers']")
    WebElement hotSales;

    @FindBy(xpath = "//span[normalize-space()='Subscribe']")
    WebElement subscriptionBtn;

    @FindBy(xpath = "//a[@id='ui-id-4']")
    WebElement womenBtn;

    @FindBy(xpath = "//a[@id='ui-id-3']")
    WebElement whatsNewBtn;

    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menBtn;

    // Single product details
    @FindBy(xpath = "\"//span[@class='base']\"")
    WebElement prodTitle;

    @FindBy(xpath = "//span[contains(text(),'$22.00')]")
    WebElement prodPrice;

    @FindBy(xpath = "//span[@id='option-label-color-93']")
    WebElement prodColor;

    @FindBy(xpath = "//span[@id='option-label-color-93']")
    WebElement prodQty;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//span[normalize-space()='Add to Wish List']")
    WebElement wishListBtn;

    @FindBy(xpath = "//span[normalize-space()='Add to Compare']")
    WebElement compareBtn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public WomenPage clickWomenBtn(){
        womenBtn.click();
        return new WomenPage();
    }

    public WhatsNewPage clickWhatsNewPage(){
        whatsNewBtn.click();
        return new WhatsNewPage();
    }

    public MenPage clickMenBtn(){
        menBtn.click();
        return new MenPage();
    }

    public boolean validateLumaLogo(){
        return lumaLogo.isDisplayed();
    }

    public boolean validateHotSales(){
        Actions actions = new Actions(driver);
        actions.perform();
        return hotSales.isDisplayed();
    }

    public boolean validateSubscriptionBtn(){
        Actions actions = new Actions(driver);
        actions.perform();
        return subscriptionBtn.isDisplayed();
    }

    public void validateProductTitle(){
        Actions actions = new Actions(driver);
        actions.perform();
        hotSales.isDisplayed();


    }
}
