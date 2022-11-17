package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper extends DriverSetup {


    public static void click(By element){
        waitForElement(element);
        driver.findElement(element).click();
    }

    public static void setText(By element, String textToSend){
        waitForElement(element);
        driver.findElement(element).sendKeys(textToSend);
    }

    private static void waitForElement(By element){
        WebElement firstResult = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(element));
        if (firstResult.isDisplayed()){

        }else {
            System.out.println("Could not find element "+element);
            driver.quit();
        }
    }
}
