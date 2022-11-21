package Locators;

import org.openqa.selenium.By;

public class userIconMenu {
    public static By element1 = By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div[2]/button[2]/div");

    public static By userMenuIcon = By.cssSelector(".v-avatar");
    public static By logoutButton = By.linkText("Logout");
    public static By ModelsButton = By.className ("v-btn__content");
    public static By DatasetsButton = By.xpath("//*[@id=\"app\"]/div[6]/div[1]/nav/div/a[2]/div/span[1]");
    public static By IntegrationsButton = By.linkText("Integrations");
    public static By HamburgerMenu = By.cssSelector("v-icon icon-menu-teal material-icons theme--light");
    public static By NewMoodelButton = By.linkText("New model");

}
