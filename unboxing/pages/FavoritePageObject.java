package unboxing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritePageObject extends BookingBasePageObject{
    public FavoritePageObject(WebDriver driver) {
        super(driver);
    }
    private String favoritePageUrl = "http://138.68.69.185/#favorites";
    private By favoritesHotels = By.xpath("//div[@class='w-full' and @id='favorites']");
    private By logoutButton = By.xpath("//ion-icon[@name='log-out-outline' and @class='md hydrated']");

   public void getFavoritePageUrl(){
        getPageUrl(favoritePageUrl);
   }
   public boolean isLogoutButtonVisible(){
       find(logoutButton).isDisplayed();
       return true;
   }

   public HomePageObject clickLogoutButton(){
       click(logoutButton);
       return new HomePageObject(driver);
   }

}
