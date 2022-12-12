package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.*;

import static Helpers.LabelUtils.*;
import static Helpers.LoginUtils.*;
import static Locators.ChoosingLabels.*;
import static Locators.ClusterPage.*;
import static Locators.ClusterRullgardinsMenu.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindow.*;
import static Locators.SartTrainingPage.*;
import static Locators.StartTrainingTestarModel.*;
import static Locators.TestarModel.*;
import static Locators.userIconMenu.*;
import static Locators.SettingsPageInTestarModel.*;


public class LabelfTest extends DriverSetup {
    @Test
    public void VerifyHomePage() throws InterruptedException {

        List<By> homePage = Arrays.asList(ModelsButton, DatasetsButton, IntegrationsButton, HamburgerMenu);
        List<By> hamburgerMenu = Arrays.asList(ModelsButton, DatasetsInHamburger,
                SharedInHamburger, UsersInHamburger, APIinHambureger, BillingInHamburger, IntegrationsInHambureger,
                CreateWorkspaceInHamburger);
        List<By> hamburgerManuAfterScroll = Arrays.asList(TestarModelInHamburger, MyFirstWorkspaceInHamburger);
        List<By> startTrainingPage = Arrays.asList(ModelsButton,DatasetsButton, IntegrationsButton, HamburgerMenu,
                SettingOnStartTrainingPage,OveriewOnStartTrainingPage, MetricsOnStartTrainingPage, APIOnStartTrainingPage,
                StartTrainingOnStartTrainingPage);
        List<By> TestarModelPage = Arrays.asList(ExploreModelInStartTrainingTestarModel, NewInStartTrainingTestarModel,
                SettingsInStartTrainingTestarModel, CloseButtonInStartTrainingTestarModel,AddAlabelInStartTrainingTestarModel);
        List<By> ClusterPage = Arrays.asList(Previous, Next,ClusterList, CLOSE,Search);
        List<By> Settings = Arrays.asList( ModelsButtonInTestarModel, DatasetsButtonInTestarModel, IntegrationsButtonInTestarModel,
                SettingInTestarModel, OveriewOnStartTrainingPageInTestarModel, APIOnStartTrainingPageInTestarModel,
                StartTrainingOnStartTrainingPageInTestarModel, MetricsOnStartTrainingPageInTestarModel);

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

        //Asserts that elements are displayed in the hamburger menu
        new SeleniumHelper()
                .isDisplayed(hamburgerMenu);

        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement hamburger = driver.findElement(By.xpath("//*[contains(text(),'TestarModel')]"));
        je.executeScript("arguments[0].scrollIntoView();", hamburger);

        new SeleniumHelper()
                .isDisplayed(hamburgerManuAfterScroll)
                .click(HamburgerMenu)
                .click(OpeningTestarModel);

        //Asserts that elements are displayed in the StartTrainingPage
        new SeleniumHelper()
                .isDisplayed(startTrainingPage)
                .click(StartTrainingOnStartTrainingPage)
                .click(ExploreModelInStartTrainingTestarModel);

        //Asserts that elements are displayed in the Cluster Page and creates first label
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(AddAlabelInClusterPage)
                .setText(NameOfLabelBox, NameOfFirstLabel)
                .click(AddCreatedlabelInClusterPage);

        //Creating second label
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(PickAlabelMeny)
                .click(PickAlabelMeny)
                .click(AddASecoundLabelInClusterPage)
                .setText(NameOfSecondLabelBox, NameofSecondLabel);

        //Accepting Single Choise pop up
        new SeleniumHelper()
                .click(AddNewelyCreatedSecoundLabel)
                .click(SingleChoice);

        //Creating third label
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(AddAThirdLabelInClusterPage)
                .setText(NameOfThirdLabelBox, NameofThirdLabel)
                .click(AddNewelyCreatedThirdLabel);


        //Asserts That elements are displayed in the StartTrainingTestarModel
        new SeleniumHelper()
                .isDisplayed(ClusterPage)
                .click(PickAlabelMeny2)
                .click(FirstDatasetPickAlabel)
                .click(FirstLabelChosen)
                .click(SecondLabelChosen);

        //Thread.sleep(3000);

        new SeleniumHelper()
                .click(ChoosingSecondLabel)
                .click(ChoosingThridLabel);

        //Asserts that NEXT button in explore model feature works
        new SeleniumHelper()
                .click(Next)
                .click(VerifyCluster2)
                .click(Next)
                .click(Next)
                .click(Next)
                .click(Next)
                .click(VerifyCluster6)
                .click(Previous)
                .click(Previous)
                .click(Previous)
                .click(Previous)
                .click(Previous)
                .click(Previous)
                .click(VerifyCluster0);

        //Scroll down Cluster:0 until element is clickable
        JavascriptExecutor jg = (JavascriptExecutor) driver;
        WebElement Clsuter5 = driver.findElement(By.xpath("//*[contains(text(),'5 (7 unlabeled items)')]"));
        jg.executeScript("arguments[0].scrollIntoView();", Clsuter5);
        new SeleniumHelper()
                .click(Cluster5)
                .click(VerifyCluster5);

        JavascriptExecutor ja = (JavascriptExecutor) driver;
        WebElement Clsuter10 = driver.findElement(By.xpath("//*[contains(text(),' 10 (6 unlabeled items) ')]"));
        ja.executeScript("arguments[0].scrollIntoView();", Clsuter10);
        new SeleniumHelper()
                .click(Cluster10)
                .click(VerifyCluster10);

        JavascriptExecutor jb = (JavascriptExecutor) driver;
        WebElement Clsuter15 = driver.findElement(By.xpath("//*[contains(text(),' 15 (8 unlabeled items) ')]"));
        jb.executeScript("arguments[0].scrollIntoView();", Clsuter15);
        new SeleniumHelper()
                .click(Cluster15)
                .click(VerifyCluster15);

        JavascriptExecutor jc = (JavascriptExecutor) driver;
        WebElement Clsuter20 = driver.findElement(By.xpath("//*[contains(text(),' 20 (6 unlabeled items) ')]"));
        jc.executeScript("arguments[0].scrollIntoView();", Clsuter20);
        new SeleniumHelper()
                .click(Cluster20)
                .click(VerifyCluster20);

        // Going from explore model feature to deleting labels
        new SeleniumHelper()
                .click(CLOSE);
        new SeleniumHelper()
                .isDisplayed(TestarModelPage)
                .click(CloseTestarModelPage);

       // Thread.sleep(3000);

        new SeleniumHelper()
                .click(ClosePoUp)
                .click(ModelsButton);
        new SeleniumHelper()
                .isDisplayed(homePage)
                .click(MoreVertButton)
                .click(SetingsInVertButton);
        new SeleniumHelper()
                .isDisplayed(Settings);

        JavascriptExecutor jd = (JavascriptExecutor) driver;
        WebElement AddaNewLabel = driver.findElement(By.xpath("//*[contains(text(),' Add a new label ')]"));
        jd.executeScript("arguments[0].scrollIntoView();", AddaNewLabel);

        new SeleniumHelper()
                .click(EditFirstLabelInSettings)
                .click(DeleteLabelInSettings)
                .click(DeleteForeverInSettings);

        JavascriptExecutor jh = (JavascriptExecutor) driver;
        WebElement AddNewLabel = driver.findElement(By.xpath("//*[contains(text(),' Add a new label ')]"));
        jh.executeScript("arguments[0].scrollIntoView();", AddNewLabel);

        new SeleniumHelper()
                .click(EditSecondLabelInSettings)
                .click(DeleteLabelInSettings)
                .click(DeleteForeverInSettings);

        JavascriptExecutor jf = (JavascriptExecutor) driver;
        WebElement AddaNewLabell = driver.findElement(By.xpath("//*[contains(text(),' Add a new label ')]"));
        jf.executeScript("arguments[0].scrollIntoView();", AddaNewLabell);

        new SeleniumHelper()
                .click(EditThirdLabelInSettings)
                .click(DeleteLabelInSettings)
                .click(DeleteForeverInSettings)
                .click(userMenuIcon)
                .click(LogoutButton);
    }
}

