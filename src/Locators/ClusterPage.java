package Locators;

import org.openqa.selenium.By;

public class ClusterPage {
    public static By Previous = By.xpath("//*[contains(text(),'Previous')]");
    public static By Next = By.xpath("//*[contains(text(),'Next')]");
    public static By ClusterList = By.xpath("//*[contains(text(),'Cluster: 1')]");
    public static By CLOSE = By.xpath("//*[contains(text(),'Search....')]");
    public static By Search = By.xpath("//*[contains(text(),'Search....')]");
    public static By AddAlabelInClusterPage = By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/div/span/div/div[1]/div/div[2]/div[1]/div/button/div/span");
    public static By NameOfLabelBox = By.xpath ("//*[@id=\"app\"]/div[2]/div/div/div/div/div/span/div/div[1]/div[2]/form/div[1]/div/div/div[1]/div/div/div[1]/div/input");
    public static By LabelDescription = By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div/div/span/div/div[1]/div[2]/form/div[1]/div/div/div[2]/div[4]/div/div/div[1]/div[1]/textarea");
    public static By AddNewelyCreatedLabel = By.xpath("//*[contains(text(),'Add label')]");
    public static By AddSecondLabel = By.xpath("//*[contains(text(),'Add a label')]");
    public static By AddCreatedlabelInClusterPage = By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div/div/span/div/div[1]/div[2]/form/div[2]/button/div/i");
    public static By PickAlabelMeny = By.xpath("//*[@id=\"app\"]/div[15]/div/div/div/div/div/span/div/div[1]/div/div[2]/div[3]/div/div[2]/div/button/div");
    public static By AddASecoundLabelInClusterPage = By.xpath("//*[@id=\"app\"]/div[15]/div/div/div/div/div/span/div/div[2]/div/div[2]/div[1]/div/button/div/span");
    public static By NameOfSecondLabelBox = By.xpath ("//*[@id=\"app\"]/div[16]/div/div/div/div/div/span/div/div[2]/div[2]/form/div[1]/div/div/div[1]/div/div/div[1]/div/input");
    public static By NameOfSecondDescriptionBox = By.xpath("//*[@id=\"app\"]/div[16]/div/div/div/div/div/span/div/div[2]/div[2]/form/div[1]/div/div/div[2]/div[4]/div/div/div[1]/div[1]/textarea");
    public static By AddNewelyCreatedSecoundLabel = By.xpath("//*[@id=\"app\"]/div[16]/div/div/div/div/div/span/div/div[2]/div[2]/form/div[2]/button/div");
    public static By SingleChoice = By.xpath("//*[contains(text(),'Single Choice')]");
    public static By AddAThirdLabelInClusterPage = By.xpath("//*[@id=\"app\"]/div[16]/div/div/div/div/div/span/div/div[3]/div/div[2]/div[1]/div/button/div/span");
    public static By NameOfThirdLabelBox = By.xpath ("//*[@id=\"app\"]/div[17]/div/div/div/div/div/span/div/div[3]/div[2]/form/div[1]/div/div/div[1]/div/div/div[1]/div/input");
    public static By NameOfThridDescriptionBox = By.xpath("//*[@id=\"app\"]/div[17]/div/div/div/div/div/span/div/div[3]/div[2]/form/div[1]/div/div/div[2]/div[4]/div/div/div[1]/div[1]/textarea");
    public static By AddNewelyCreatedThirdLabel = By.xpath("//*[@id=\"app\"]/div[17]/div/div/div/div/div/span/div/div[3]/div[2]/form/div[2]/button/div");
}
