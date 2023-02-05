package com.luma.auto.util;

import com.luma.auto.testbase.TestBase;
import com.relevantcodes.extentreports.model.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonMethod extends TestBase {

    public static void commonMethods() {
        List<WebElement> prodList = driver.findElements(By.xpath("//ol[@class='product-items widget-product-grid']//li"));

        int prodCount = prodList.size();
        for (int i = 0; i <= prodCount; i++) {
            for (WebElement lists : prodList) {
                lists.click();
                break;
            }
        }
    }
}
