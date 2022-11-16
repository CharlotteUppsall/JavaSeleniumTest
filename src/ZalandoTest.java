import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZalandoTest {
    public static void main(String[] args ) {

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
}
