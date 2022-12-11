package Locators;

import org.openqa.selenium.By;

public class userIconMenu {

    //public static By GreenBoxClose = By.xpath("/html/body/iframe[1]");
    public static By userMenuIcon = By.xpath("//*[@id=\"app\"]/div[7]/div[1]/nav/div/div[4]/div/button/div/div");

    public static By ModelsButton = By.xpath("//*[@id=\"models-button-navbar\"]/div/span[1]");
    public static By DatasetsButton = By.xpath("//*[contains(text(),'table_view')]");
    public static By IntegrationsButton = By.xpath("//*[contains(text(),'integration_instructions')]");
    public static By HamburgerMenu = By.xpath("//*[contains(text(),'menu')]");
    public static By NewModelButton = By.xpath("//*[@id=\"model-card-title\"]/a");
    public static By MoreVertButton = By.xpath("//*[contains(text(),'more_vert')]");
    public static By SetingsInVertButton = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/a/div[1]/div");
    public static By LogoutButton = By.xpath("//*[contains(text(),'Logout')]");



}
