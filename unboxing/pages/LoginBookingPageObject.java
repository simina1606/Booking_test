package unboxing.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginBookingPageObject extends BookingBasePageObject{

    public LoginBookingPageObject(WebDriver driver) {
        super(driver);
    }

    private By titleLocator =By.xpath("//div[@class='text-center font-bold p-2 text-xl md:text-2xl' and text()='Login to start planning your trip!']");
    private By enterEmailField = By.xpath("//input[@type='text' and @placeholder='Enter your email']");
    private By enterPasswordField = By.xpath("//input[@type='password' @placeholder='Enter your password']");
    private By loginButtonLocator = By.xpath("//button[@class='md:text-lg w-full bg-emerald-500 rounded hover-btn p-2 text-white font-bold' and @type='submit']");

    public AccountCreatedPageObject clickLoginButtonFromLoginPage(String enterEmail, String enterPassword){
        type(enterEmailField, enterEmail);
        type(enterPasswordField, enterPassword);
        click(loginButtonLocator);
        return new AccountCreatedPageObject(driver);

    }
}
