package com.appiumTests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import static util.driver.DriverHolder.getDriver;

@Epic("Browns Shoes")
@Feature("Login")
public class HomeTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void homeBeforeMethod() {
        homePage = new HomePage(getDriver());
    }

    @Test(description = "Verify that a valid user can login to the application")
    @Description("Verify that a valid user can login to the application")
    @Story("As a user I should be able to login to the application")
    public void testValidLogin() throws InterruptedException {
        homePage.clickMenu();
        Thread.sleep(5000);
    }
}
