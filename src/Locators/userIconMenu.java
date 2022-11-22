package Locators;

import org.openqa.selenium.By;

public class userIconMenu {

    public static By userMenuIcon = By.xpath("//*[@id=\"app\"]/div[5]/div[1]/nav/div/div[4]/div/button/div/div/span");

    public static By ModelsButton = By.xpath("//*[@id=\"models-button-navbar\"]/div/span[1]");
    public static By DatasetsButton = By.xpath("//*[contains(text(),'table_view')]");
    public static By IntegrationsButton = By.xpath("//*[contains(text(),'integration_instructions')]");
    public static By HamburgerMenu = By.xpath("//*[contains(text(),'menu')]");
    public static By NewMoodelButton = By.linkText("New model");

}
