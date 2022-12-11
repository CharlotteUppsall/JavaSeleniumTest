package Locators;

import org.openqa.selenium.By;

public class SartTrainingPage {
    public static By SettingOnStartTrainingPage =By.xpath("//*[contains(text(),'settings')]");
    public static By OveriewOnStartTrainingPage =By.xpath("//*[contains(text(),'Overview')]");
    public static By APIOnStartTrainingPage =By.xpath("//*[@id=\"app\"]/div[8]/div[1]/main/div/div/div[1]/div/div/div/div/nav/div/a[5]/div");
    public static By StartTrainingOnStartTrainingPage =By.xpath("//*[@id=\"app\"]/div[8]/div[1]/main/div/div/div[1]/div/div/div/div/nav/div/a[6]/div");
    public static By MetricsOnStartTrainingPage =By.xpath("//*[contains(text(),'Metrics')]");
    public static By CloseTestarModelPage = By.xpath("//*[@id=\"close-button\"]/div/i");
}
