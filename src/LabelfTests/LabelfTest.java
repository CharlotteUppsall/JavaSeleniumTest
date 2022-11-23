package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;

import static Helpers.LoginUtils.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindowLocators.*;
import static Locators.ModelOverview.StartExploreModel;
import static Locators.ModelOverview.StartTrainingButtonInOverview;
import static Locators.userIconMenu.*;
import static Locators.NewModel.*;


public class LabelfTest extends DriverSetup {
    @Test
    public void VerifyHomePage() throws InterruptedException {


        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton)

                .click(ModelsButton)
                .click(DatasetsButton)
                .click(IntegrationsButton)
                .click(HamburgerMenu)
                .click(HamburgerMenu)

                .click(userMenuIcon)
                .click(logoutButton);

    }
    @Test
    public void StartTrainingCreatedModel() throws InterruptedException{

        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox,username)
                .setText(passwordBox,password)
                .click(loginButton)
                .click(NewMoodelButton)
                .click(StartTrainingButtonInOverview)
                .click(StartExploreModel);


    }
}

