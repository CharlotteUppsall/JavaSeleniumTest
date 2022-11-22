package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.Test;

import static Helpers.LoginUtils.*;
import static Locators.HamburgerMenu.*;
import static Locators.LoginWindowLocators.*;
import static Locators.userIconMenu.*;

public class LabelfTest extends DriverSetup {
    @Test
    public void VerifyHomePage() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\checd\\OneDrive\\Pulpit\\Webdriver\\chromedriver.exe");//driver director
        new SeleniumHelper()
                .click(acceptCookies)
                .setText(usernameBox, username)
                .setText(passwordBox, password)
                .click(loginButton)

                .click(ModelsButton)
                .click(DatasetsButton)
                .click(IntegrationsButton)
                .click(HamburgerMenu)

                .click(userMenuIcon)
                .click(logoutButton);


    }
}

