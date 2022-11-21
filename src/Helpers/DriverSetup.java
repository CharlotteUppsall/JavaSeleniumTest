package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.List;
import java.util.Set;

public class DriverSetup {

    static WebDriver driver;
    static WebDriverWait driverWait;

    @BeforeSuite
    public static void setUp() {

        driver = new WebDriver() {
            @Override
            public void get(String s) {

            }

            @Override
            public String getCurrentUrl() {
                return null;
            }

            @Override
            public String getTitle() {
                return null;
            }

            @Override
            public List<WebElement> findElements(By by) {
                return null;
            }

            @Override
            public WebElement findElement(By by) {
                return null;
            }

            @Override
            public String getPageSource() {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public void quit() {

            }

            @Override
            public Set<String> getWindowHandles() {
                return null;
            }

            @Override
            public String getWindowHandle() {
                return null;
            }

            @Override
            public TargetLocator switchTo() {
                return null;
            }

            @Override
            public Navigation navigate() {
                return null;
            }

            @Override
            public Options manage() {
                return null;
            }
        };

        driverWait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();

        driver.get("https://stag.labelf.ai/login");

    }

    @AfterSuite
    public void afterMethod() {
        driver.quit();
        System.out.println("Everything went well!");
    }
}

