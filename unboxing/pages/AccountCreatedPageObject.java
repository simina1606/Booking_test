package unboxing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPageObject extends BookingBasePageObject{

    public AccountCreatedPageObject(WebDriver driver) {
        super(driver);
    }
    String pageUrlAccountCreated = "http://138.68.69.185/";
    private By pageTitleLocator = By.xpath("//div[@class='flex items-center justify-center text-sm' and text='Welcome,']");
    private By myAccountLocator = By.xpath("//div[@class= 'hover-icon text-sm bg-emerald-500 p-2 rounded font-bold' and text()='My account']");
    private By favoriteLocator = By.xpath("//div[@class='hover-icon text-sm bg-emerald-500 p-2 rounded font-bold' and text()='Favorites']");
    private By logoutLocator = By.xpath("//svg[@class='ionicon s-ion-icon' and @title='Log Out']");

    public MyAccountPageObject clickMyAccountButton(){
        click(myAccountLocator);
        return new MyAccountPageObject(driver);
    }
    public FavoritePageObject clickFavoriteButton(){
        click(favoriteLocator);
        return new FavoritePageObject(driver);
    }
    public HomePageObject clickLogoutButton(){
        click(logoutLocator);
        return new HomePageObject(driver);
    }

    public boolean getPageUrl(){
        getPageUrl(pageUrlAccountCreated);
        return true;
    }
}
