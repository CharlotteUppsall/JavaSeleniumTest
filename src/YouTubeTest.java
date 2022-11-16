import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class YouTubeTest {
    public static void main(String[] args ){

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
}
