package LabelfTests;

import Helpers.DriverSetup;
import Helpers.SeleniumHelper;
import org.junit.*;
import org.openqa.selenium.By;

import static Helpers.LoginUtils.*;

import static Locators.LoginWindowLocators.*;
import static Locators.userIconMenu.logoutButton;
import static Locators.userIconMenu.userMenuIcon;

public class LabelfTest extends DriverSetup {
    @Test
    public void loginTest(){
        //Open Browser
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\checd\\OneDrive\\Pulpit\\Webdriver\\chromedriver.exe");//driver directory

        //OpenBrowser
        SeleniumHelper.click(acceptCookies);

        //Log in and out
        SeleniumHelper.setText(usernameBox, username);
        SeleniumHelper.setText(passwordBox, password);
        SeleniumHelper.click(loginButton);

        SeleniumHelper.click(userMenuIcon);
        SeleniumHelper.click(logoutButton);


        SeleniumHelper.click(element1);

    }
}