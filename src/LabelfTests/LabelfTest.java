package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import Locators.StartTrainingTestarModel;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.*;

import static Helpers.LabelUtils.*;
import static Helpers.LoginUtils.*;
import static Locators.ClusterPage.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindow.*;
import static Locators.SartTrainingPage.*;
import static Locators.StartTrainingTestarModel.*;
import static Locators.TestarModel.*;
import static Locators.userIconMenu.*;



public class LabelfTest extends DriverSetup {
    @Test
    public void VerifyHomePage() throws InterruptedException {

        List<By> homePage = Arrays.asList(ModelsButton, DatasetsButton, IntegrationsButton, HamburgerMenu);
        List<By> hamburgerMenu = Arrays.asList(ModelsButton, DatasetsInHamburger,
                SharedInHamburger, UsersInHamburger, APIinHambureger, BillingInHamburger, IntegrationsInHambureger,
                CreateWorkspaceInHamburger);
        List<By> startTrainingPage = Arrays.asList(ModelsButton,DatasetsButton, IntegrationsButton, HamburgerMenu,
                SettingOnStartTrainingPage,OveriewOnStartTrainingPage, MetricsOnStartTrainingPage, APIOnStartTrainingPage,
                StartTrainingOnStartTrainingPage);
        List<By> TestarModelPage = Arrays.asList(ExploreModelInStartTrainingTestarModel, NewInStartTrainingTestarModel,
                SettingsInStartTrainingTestarModel, CloseButtonInStartTrainingTestarModel,AddAlabelInStartTrainingTestarModel);
        List<By> ClusterPage = Arrays.asList(Previous, Next,ClusterList, CLOSE,Search);

        //Logging in
        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton);

        //Asserts that elements are displayed on homePage
        new SeleniumHelper()
                .isDisplayed(homePage)
                .click(HamburgerMenu);

        //Asserts that elements are displayed in the hamburger menu and opening testar model
        new SeleniumHelper()
                .isDisplayed(hamburgerMenu)
                .click(HamburgerMenu)
                .click(OpeningTestarModel);

        //Asserts that elements are displayed in the StartTrainingPage
        new SeleniumHelper()
                .isDisplayed(startTrainingPage)
                .click(StartTrainingOnStartTrainingPage);

        //Asserts That elements are displayed in the StartTrainingTestarModel
        new SeleniumHelper()
                .isDisplayed(TestarModelPage)
                .click(ExploreModelInStartTrainingTestarModel);

        //Asserts that elements are displayed in the Cluster Page and creates first label
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(AddAlabelInClusterPage)
                .setText(NameOfLabelBox, NameOfFirstLabel)
                .setText(LabelDescription, DescriptionOfFirstLabel)
                .click(AddCreatedlabelInClusterPage);

        //Creating second label
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(PickAlabelMeny)
                .click(PickAlabelMeny)
                .click(AddASecoundLabelInClusterPage)
                .setText(NameOfLabelBox, NameofSecondLabel)
                .setText(LabelDescription, DescriptionOfSecondLabel)
                .click(AddCreatedlabelInClusterPage);

        //Creating third label
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(PickAlabelMeny)
                .click(PickAlabelMeny)
                .click(AddAThirdLabelInClusterPage)
                .setText(NameOfLabelBox, NameofThirdLabel)
                .setText(LabelDescription, DescriptionOfThirdLabel)
                .click(AddCreatedlabelInClusterPage);











                /*.click(AddAlabelInStartTrainingTestarModel)
                .setText(NameOfLabelBox, NameOfFirstLabel)
                .setText(LabelDescription, DescriptionOfFirstLabel);

        // Scroll down to "Create Label button"
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/div/div[1]/div[4]/div/div/span/div[2]/div[2]/form/div[2]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);

       new SeleniumHelper()
                .click(AddNewelyCreatedLabel);
        Thread.sleep(20000);
        new SeleniumHelper()
                .click(AddSecondLabel)
                .setText(NameOfLabelBox, NameofSecondLabel)
                .setText(LabelDescription, DescriptionOfSecondLabel);

        JavascriptExecutor jssecond = (JavascriptExecutor) driver;
        WebElement Elementsecond = driver.findElement(By.xpath("//*[@id=\"app\"]/div[8]/div/div[1]/div[4]/div/div/span/div[2]/div[2]/form/div[2]"));
        js.executeScript("arguments[0].scrollIntoView();", Elementsecond);

        new SeleniumHelper()
                .click(AddNewelyCreatedLabel);



        //Opens and Veryfies Cluster Page
        //new SeleniumHelper()
          */     // .isDisplayed(ClusterPage);
    }
}

