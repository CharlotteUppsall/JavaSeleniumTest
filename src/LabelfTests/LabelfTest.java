package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.*;
import static Helpers.LoginUtils.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindow.*;
import static Locators.EnteringTestarModel.*;
import static Locators.SartTrainingPage.*;
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

        //Logging in
        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton);

        //Asserts that elements are displayed on page
        new SeleniumHelper()
                .isDisplayed(homePage)
                .click(HamburgerMenu);

        //Asserts that elements are displayed in the hamburger menu
        new SeleniumHelper()
                .isDisplayed(hamburgerMenu)
                .click(HamburgerMenu);

        //Opening a created model
        new SeleniumHelper()
                .click(OverviewTestarModel);

        //Asserts that elements are displayed in the StartTrainingPage
        new SeleniumHelper()
                .isDisplayed(startTrainingPage)
                .click(StartTrainingOnStartTrainingPage);

        //Opening Start Training
        new SeleniumHelper();

               //.click(StartTrainingButtonInOverview);
                //.click(StartExploreModel)
                //.click(userMenuIcon)
                //.click(logoutButton);
    }
}

