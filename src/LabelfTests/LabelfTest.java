package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;

import static Helpers.LoginUtils.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindowLocators.*;
import static Locators.ModelOverview.*;
import static Locators.userIconMenu.*;


public class LabelfTest extends DriverSetup {
    @Test
    public void VerifyHomePage() throws InterruptedException {

        new SeleniumHelper()
                .isDisplayed(acceptCookies)
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton)

                .isDisplayed(ModelsButton)
                .isDisplayed(DatasetsButton)
                .isDisplayed(IntegrationsButton)
                .isDisplayed(HamburgerMenu)

                .click(HamburgerMenu)
                .isDisplayed(MyFirstWorkspaceInHamburger)
                .isDisplayed(ModelsButton)
                .isDisplayed(DatasetsInHamburger)
                .isDisplayed(SharedInHamburger)
                .isDisplayed(UsersInHamburger)
                .isDisplayed(APIinHambureger)
                .isDisplayed(BillingInHamburger)
                .isDisplayed(IntegrationsInHambureger)
                .isDisplayed(CreateWorkspaceInHamburger)
                .click(HamburgerMenu)

                .click(userMenuIcon)
                .click(logoutButton);
    }

    @Test
    public void VerifyHomePage2() throws InterruptedException {

        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton)
                .click(NewMoodelButton)
                .click(StartTrainingButtonInOverview)
                .click(StartExploreModel);
    }
}

