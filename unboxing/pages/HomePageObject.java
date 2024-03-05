package unboxing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BookingBasePageObject{
    public HomePageObject(WebDriver driver) {
        super(driver);
    }

    private String pageUrl = "http://138.68.69.185/";
    private By loginLocator = By.xpath("//div[@class='hover-icon text-sm bg-emerald-500 p-2 rounded font-bold' and text()='Login']");
    private By registerLink = By.xpath("//div[@class = 'hover-icon text-sm bg-emerald-500 p-2 rounded font-bold' and text()='Register']");

    public void openHomePageBooking(){
        openUrl(pageUrl);
    }

    public LoginBookingPageObject clickLoginButton(){
        click(loginLocator);
        return new LoginBookingPageObject(driver);
    }

    public RegisterPageObject clickRegister(){
        click(registerLink);
        return new RegisterPageObject(driver);
    }


}
