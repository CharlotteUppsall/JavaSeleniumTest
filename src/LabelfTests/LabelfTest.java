package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.*;
import static Helpers.LoginUtils.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindowLocators.*;
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
        List<By> StartTrainingPage = Arrays.asList(SettingOnStartTrainingPage);

        //Logging in
        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton)
                .click(HamburgerMenu);

        //Asserts that elements are displayed on page
        new SeleniumHelper()
                .isDisplayed(homePage);

        //Asserts that elements are displayed in the hamburger menu
        new SeleniumHelper()
                .isDisplayed(hamburgerMenu)
                .click(HamburgerMenu);

        //Opening a created model
        new SeleniumHelper()
                .click(OverviewTestarModel);
                //.click(StartTrainingButtonInOverview);
                //.click(StartExploreModel)
                //.click(userMenuIcon)
                //.click(logoutButton);
    }
}

