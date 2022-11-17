package Labelf;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;


public class LabelfTest {


        @BeforeClass
        void beforeClass(){
            System.out.println("Before class");
        }
        @AfterClass
        void afterClass(){
            System.out.println("After Class");
        }
        @BeforeTest
        void beforeMethod() {
          System.out.println("Starting automation test!");
        }
        @AfterMethod
        void afterMethod() {
            System.out.println("Everything went well!");
        }
    @Test
    public static void main(String[] args) {
        //Open Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\checd\\OneDrive\\Pulpit\\Webdriver\\chromedriver.exe");//driver directory
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //OpenBrowser
        driver.get("https://stag.labelf.ai/login");//Open URL
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement AcceptCookies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"diffuse-cookie-notice\"]/div/div/div/div[2]/button[3]"))); //Accept Cookies
        AcceptCookies.click();

        //Log in and out
        driver.findElement(By.name("login")).sendKeys("checdd@gmail.com");//Log in
        driver.findElement(By.name("password")).sendKeys("kufowo92");//Log in
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div[2]/button[2]/div")).click(); //Login Button
        WebDriverWait await = new WebDriverWait(driver, 3);
        WebElement elo = await.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[6]/div[1]/nav/div/div[4]/div/button/div/div")));//C button
        elo.click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/div[1]/nav/div/div[4]/div/button/div/div")).click();//C button
        driver.findElement(By.xpath("//*[@id=\"logout-button\"]/div[1]/div")).click();//Log out button
        driver.quit();

    }
}