package Locators;

import org.openqa.selenium.By;

public class SettingsPageInTestarModel {

    public static By ModelsButtonInTestarModel = By.xpath("//*[@id=\"models-button-navbar\"]/div/span[1]");
    public static By DatasetsButtonInTestarModel = By.xpath("//*[contains(text(),'table_view')]");
    public static By IntegrationsButtonInTestarModel = By.xpath("//*[contains(text(),'integration_instructions')]");
    public static By SettingInTestarModel =By.xpath("//*[contains(text(),'settings')]");
    public static By OveriewOnStartTrainingPageInTestarModel =By.xpath("//*[contains(text(),'Overview')]");
    public static By APIOnStartTrainingPageInTestarModel =By.xpath("//*[@id=\"app\"]/div[4]/div[1]/main/div/div/div[1]/div/div/div/div/nav/div/a[5]/div");
    public static By StartTrainingOnStartTrainingPageInTestarModel =By.xpath("//*[contains(text(),'Start training')]");
    public static By MetricsOnStartTrainingPageInTestarModel =By.xpath("//*[contains(text(),'Metrics')]");
    public static By EditFirstLabelInSettings = By.xpath("//*[@id=\"app\"]/div[4]/div[1]/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/a/div[2]/i");
    public static By EditSecondLabelInSettings = By.xpath("//*[@id=\"app\"]/div[4]/div[1]/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/a/div[2]/i");
    public static By EditThirdLabelInSettings = By.xpath("//*[@id=\"app\"]/div[4]/div[1]/main/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[1]/a/div[2]/i");
    public static By DeleteLabelInSettings =By.xpath("//*[contains(text(),'Delete Label')]");
    public static By DeleteForeverInSettings =By.xpath("//*[@id=\"app\"]/div[5]/div/div/div[3]/button/div");

}
