import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {
    public static void main(String[] args) {

        OpenZalando();
        //OpenYouTube();
        //SearchGmail();


    }

    public static void OpenZalando(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.zalando.com");
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"uc-btn-accept-banner\"]")));
        el.click();
        driver.findElement(By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/a")).click();
        driver.findElement(By.name("login.email")).sendKeys("checdd@gmail.com");
        driver.findElement(By.name("login.secret")).sendKeys("a7v469");
        driver.findElement(By.xpath("//*[@id=\"sso\"]/div/div[2]/main/div/div[2]/div/div/div/form/button/span")).click();
        System.out.println("Done");
        driver.close();


    }
    public static void OpenYouTube() {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\checd\\OneDrive\\Pulpit\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.youtube.com");
        WebDriverWait wait = new WebDriverWait(driver, 1);
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]"))); //Accept all cookies on YT
        el.click();
        driver.findElement(By.xpath("//*[@id=\"chips\"]/yt-chip-cloud-chip-renderer[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"text\"]")).click();
        driver.quit();

    }
    public static void SearchGmail() {

         WebDriver driver = new ChromeDriver();
         driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Gmail"); //Browser Searching Bar
         driver.findElement(By.id("element_id")).sendKeys(Keys.ENTER); //Searching path

    }

    public static void AcceptCookies(){
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();


    }

}