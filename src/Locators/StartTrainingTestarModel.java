package Locators;

import org.openqa.selenium.By;

public class StartTrainingTestarModel {
    public static By ExploreModelInStartTrainingTestarModel = By.xpath("//*[contains(text(),'Explore model')]");
    public static By NewInStartTrainingTestarModel = By.xpath("//*[contains(text(),'New')]");
    public static By SettingsInStartTrainingTestarModel = By.xpath("//*[@id=\"app\"]/div[7]/div/div[1]/div[1]/div/div/nav/div/div[1]/a/div/i");
    public static By CloseButtonInStartTrainingTestarModel = By.id("close-button");
    public static By AddAlabelInStartTrainingTestarModel = By.xpath("//*[@id=\"app\"]/div[7]/div/div[1]/div[4]/div/div/span/div[2]/div/div[2]/div/div/button/div/i");
    public static By NameOfLabelBox = By.xpath ("//*[@id=\"app\"]/div[8]/div/div[1]/div[4]/div/div/span/div[2]/div[2]/form/div[1]/div/div/div[1]/div/div/div[1]/div/input");
    public static By LabelDescription = By.xpath("//*[@id=\"app\"]/div[8]/div/div[1]/div[4]/div/div/span/div[2]/div[2]/form/div[1]/div/div/div[2]/div[4]/div/div/div[1]/div[1]/textarea");
    public static By AddNewelyCreatedLabel = By.xpath("//*[contains(text(),'Add label')]");
    public static By AddSecondLabel = By.xpath("//*[contains(text(),'Add a label')]");
}
