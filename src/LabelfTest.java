import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LabelfTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stag.labelf.ai/login");
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"diffuse-cookie-notice\"]/div/div/div/div[2]/button[3]")));
        el.click();
        driver.findElement(By.name("login")).sendKeys("checdd@gmail.com");
        driver.findElement(By.name("password")).sendKeys("kufowo92");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div[2]/button[2]/div")).click();
        WebDriverWait await = new WebDriverWait(driver, 3);
        WebElement elo = await.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[6]/div[1]/nav/div/div[4]/div/button/div/div")));
        elo.click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/div[1]/nav/div/div[4]/div/button/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"logout-button\"]/div[1]/div")).click();
        driver.quit();

    }
}