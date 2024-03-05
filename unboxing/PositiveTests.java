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
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        HomePageObject homePageObject = new HomePageObject(driver);
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
        Assert.assertTrue("Incorrect page Url for Account Created", accountCreatedPageObject.getPageUrl());

        Assert.assertTrue("Incorrect Page Title on My Account Details", myAccountPageObject.getMyAccountPageTitle());

        FavoritePageObject favoritePageObject = myAccountPageObject.clickOnFavoriteButton();
        favoritePageObject.getFavoritePageUrl();
        Assert.assertTrue("Logout button is not visible", favoritePageObject.isLogoutButtonVisible());

        HomePageObject homePageObject1 = favoritePageObject.clickLogoutButton();



    }

}
