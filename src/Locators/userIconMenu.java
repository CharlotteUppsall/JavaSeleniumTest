package Locators;

import org.openqa.selenium.By;

public class userIconMenu {

    //public static By GreenBoxClose = By.xpath("/html/body/iframe[1]");
    public static By userMenuIcon = By.className("white--text");

    public static By ModelsButton = By.xpath("//*[@id=\"models-button-navbar\"]/div/span[1]");
    public static By DatasetsButton = By.xpath("//*[contains(text(),'table_view')]");
    public static By IntegrationsButton = By.xpath("//*[contains(text(),'integration_instructions')]");
    public static By HamburgerMenu = By.xpath("//*[contains(text(),'menu')]");
    public static By NewModelButton = By.xpath("//*[@id=\"model-card-title\"]/a");

}
