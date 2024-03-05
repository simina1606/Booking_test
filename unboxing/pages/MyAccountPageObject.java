package unboxing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPageObject extends BookingBasePageObject{
    public MyAccountPageObject(WebDriver driver) {
        super(driver);
    }

    private By myAccountForm = By.xpath("//div[@class='text-center font-bold text-xl md:text-2xl' and text()='My Account Details']");
    private By myAccountFavoriteButton = By.xpath("//div[@class='hover-icon text-sm bg-emerald-500 p-2 rounded font-bold' and text()='Favorites']");

    public boolean getMyAccountPageTitle(){
         find(myAccountForm).getText();
         return true;
    }

    public FavoritePageObject clickOnFavoriteButton(){
        click(myAccountFavoriteButton);
        return new FavoritePageObject(driver);
    }

}
