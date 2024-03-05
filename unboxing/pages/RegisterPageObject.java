package unboxing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends BookingBasePageObject {
    public RegisterPageObject(WebDriver driver) {
        super(driver);
    }

    //Login Information
    private By firstNameLocator = By.xpath("//input[@placeholder = 'Enter your First Name']");
    private By lastNameLocator = By.xpath("//input[@placeholder='Enter your Last Name']");
    private By emailLocator = By.xpath("//input[@placeholder='Enter your email']");
    private By passwordLocator = By.xpath("//input[@placeholder='Enter your password']");
    private By confirmPasswordLocator = By.xpath("//input[@placeholder='Confirm password']");

    //Personal Information
    private By countryLocator = By.xpath("//input[@id = 'react-select-2-input' and type='text']");
    private By cityLocator = By.xpath("//input[@placeholder='City']");
    private By addressLocator = By.xpath("//input[@placeholder='Address 1']");
    private By genderLocator = By.xpath("//div[@class =' css-qc6sy-singleValue']");
    private By dateOfBirthLocator = By.xpath("//input[@placeholder='Date of Birth']");
    private By nationalityLocator = By.xpath("//input[@placeholder='Nationality']");

    private By cancelButton = By.xpath("//button[@class ='md:text-lg w-full bg-rose-500 rounded hover-btn p-2 text-white font-bold ' and text()='Cancel']");
   private By registerButton=  By.xpath("//button[@type ='submit' and @class='md:text-lg w-full bg-emerald-500 rounded hover-btn p-2 text-white font-bold ' and text()='Register']");


    /*    public void firstNameField(String firstName) {
        type(firstNameLocator, firstName);
    }
    public void lastNameField(String lastName) {
        type(lastNameLocator, lastName);
    }
    public void emailField(String email) {
        type(emailLocator, email);
    }
    public void passwordField(String password) {
        type(passwordLocator, password);
    }
    public void confirmPasswordField(String confirmPassword) {
        type(confirmPasswordLocator, confirmPassword);
    }
    public void dateOfBirthField(String dateOfBirth) {
        type(dateOfBirthLocator, dateOfBirth);
    }

      public AccountCreatedPageObject clickRegister() {
           click(registerButton);
           return new AccountCreatedPageObject(driver);
        }

    */
    public AccountCreatedPageObject registerForm(String firstName, String lastName,String email, String password, String confirmPassword){
        type(firstNameLocator, firstName);
        type(lastNameLocator, lastName);
        type(emailLocator, email);
        type(passwordLocator, password);
        type(confirmPasswordLocator, confirmPassword);
        click(registerButton);
        return new AccountCreatedPageObject(driver);
    }


    public boolean isRegisterButtonVisible(){
        find(registerButton).isDisplayed();
        return true;
    }



}

