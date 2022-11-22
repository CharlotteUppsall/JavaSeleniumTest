package Locators;

import org.openqa.selenium.By;

public class LoginWindowLocators {
    public static By acceptCookies = By.xpath("//*[@id=\"diffuse-cookie-notice\"]/div/div/div/div[2]/button[3]");
    public static By usernameBox = By.name("login");
    public static By passwordBox =  By.name("password");
    public static By loginButton = By.xpath("//*[contains(text(),'Login')]");

}
