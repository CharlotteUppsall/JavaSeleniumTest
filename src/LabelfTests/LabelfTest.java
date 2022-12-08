package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.*;
import static Helpers.LoginUtils.*;
import static Locators.AddingLabelsToTestarModel.*;
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

        //Veryfing Cluster Page
        new SeleniumHelper()
                .isDisplayed(ClusterPage);


    }
}

