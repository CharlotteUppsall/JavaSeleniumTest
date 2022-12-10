package Helpers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetup {

    public static ChromeDriver driver;
    public WebDriverWait webDriverWait;


    @BeforeClass
    public static void StartDriver() {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\webdriver107\\chromedriver.exe");//CHARLOTTES driver director
        System.setProperty("webdriver.chrome.driver","C:\\Users\\checd\\IdeaProjects\\chromedriver.exe");//DAWID driver director
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stag.labelf.ai/login");
    }

    public void getWaitDriver() {
        WebDriverWait driverWait = new WebDriverWait(driver, 15);
    }

    @AfterClass
    public static void afterMethod() {
        //driver.quit();
        System.out.println("Test Finished!");
    }
}

