package unboxing;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import unboxing.pages.*;
import org.junit.Test;
import utils.BaseTestClass;

import java.time.Duration;

public class PositiveTests extends BaseTestClass {
    @Test
    public void positiveTests(){
        //we are not using driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); because we already created a method for waits
        //the wait method is used in every method in which we need to get, find, click or sendkeys

        HomePageObject homePageObject = new HomePageObject(driver);
        homePageObject.openChromeBrowser();
        homePageObject.openHomePageBooking();

        RegisterPageObject registerPageObject = homePageObject.clickRegister();
       /* registerPageObject.firstNameField("Test");
        registerPageObject.lastNameField("Name");
        registerPageObject.emailField("TestEmail@test.com");
        registerPageObject.passwordField("TestPassword123!");
        registerPageObject.confirmPasswordField("TestPassword123!");
        registerPageObject.dateOfBirthField("06/06/2000");
        */

        AccountCreatedPageObject accountCreatedPageObject = registerPageObject.registerForm("E", "B", "EB@test.com", "Test123!", "Test123!");
        Assert.assertTrue("Register button not visible", registerPageObject.isRegisterButtonVisible());

        MyAccountPageObject myAccountPageObject = accountCreatedPageObject.clickMyAccountButton();
        String expectedUrlForAccountCreated = "http://138.68.69.185/";
        Assert.assertEquals("Incorrect page Url for Account Created", expectedUrlForAccountCreated, accountCreatedPageObject.getPageUrl());

        String expectedPageTitleMyAccount = "My Account Details";
        Assert.assertEquals("Incorrect page title", expectedPageTitleMyAccount,myAccountPageObject.getMyAccountPageTitle());

        FavoritePageObject favoritePageObject = myAccountPageObject.clickOnFavoriteButton();
        favoritePageObject.getFavoritePageUrl();
        Assert.assertTrue("Logout button is not visible", favoritePageObject.isLogoutButtonVisible());

        HomePageObject homePageObject1 = favoritePageObject.clickLogoutButton();

        driver.quit();



    }

}
