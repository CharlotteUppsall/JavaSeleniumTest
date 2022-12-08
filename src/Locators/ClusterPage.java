package Locators;

import org.openqa.selenium.By;

public class ClusterPage {
    public static By Previous = By.xpath("//*[contains(text(),'Previous')]");
    public static By Next = By.xpath("//*[contains(text(),'Next')]");
    public static By ClusterList = By.xpath("//*[contains(text(),'Cluster: 1')]");
    public static By CLOSE = By.xpath("//*[contains(text(),'close')]");
    public static By Search = By.xpath("//*[contains(text(),'Search....')]");
}
