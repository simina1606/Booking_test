package unboxing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BookingBasePageObject {

    protected WebDriver driver;

    public BookingBasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    protected void openUrl(String url){
        driver.get(url);
    }

    protected WebElement find(By locator){
        waitForVisibilityOfElement(locator, 5);
        return driver.findElement(locator);
    }

    protected void click(By locator){
       waitForVisibilityOfElement(locator, 5);
        find(locator).click();
    }

    protected void type(By locator, String text){
        waitForVisibilityOfElement(locator, 5);
        find(locator).sendKeys(text);
    }

    public String getPageUrl(String favoritePageUrl){

        return driver.getCurrentUrl();
    }

    protected List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

     public void waitForVisibilityOfElement(By locator, int timeOut){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }




}
