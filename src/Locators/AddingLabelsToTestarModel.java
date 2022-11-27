package Locators;

import org.openqa.selenium.By;

public class AddingLabelsToTestarModel {
    public static By NameofaddedLabel = By.xpath("//*[contains(text(),'Name*')]");
    public static By ExampleOdAddedLabel = By.xpath("//*[contains(text(),'Please provide a good example text for this label')]");
    public static String NameOfLabel = "First Label";
    public static String ExampleOfFirstLabel = "This is an exmples of first label.";

}
