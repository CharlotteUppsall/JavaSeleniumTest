package Helpers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class SeleniumHelper extends DriverSetup {

    public SeleniumHelper click(By element) throws InterruptedException {
        waitForElement(element);
        driver.findElement(element).click();
        return this;
    }

    public SeleniumHelper setText(By element, String textToSend) throws InterruptedException {
        waitForElement(element);
        driver.findElement(element).sendKeys(textToSend);
        return this;
    }

    public SeleniumHelper isDisplayed (List<By> element) throws InterruptedException {
        for (int i=0; i<element.size(); i++){
            waitForElement(element.get(i));
        }
        return this;
    }

    private SeleniumHelper waitForElement(By element) throws InterruptedException {
        //Thread.sleep(400);
        WebElement firstResult = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(element));
        if (firstResult.isDisplayed()){

        }else {
            Assert.fail("Could not find "+element);
        }
        return this;
    }
}
