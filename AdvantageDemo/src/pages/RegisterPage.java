package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;

public class RegisterPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = Locators.SIGNUP_BUTTON)
    WebElement createButton;
	
	@FindBy(xpath = Locators.USERNAME_INPUT)
	WebElement usernameInput;
	
	@FindBy(xpath = Locators.EMAIL_INPUT)
	WebElement emailInput;
	
	@FindBy(xpath = Locators.PASSWORDR_INPUT)
	WebElement passwordRInput;
	
	@FindBy(xpath = Locators.CONFIRM_PASSWORD_INPUT)
	WebElement confPasswordInput;
	
	@FindBy(xpath = Locators.FNAME_INPUT)
	WebElement fnameInput;
	
	@FindBy(xpath = Locators.LNAME_INPUT)
	WebElement lnameInput;
	
	@FindBy(xpath = Locators.COUNTRY_LIST)
	WebElement countryList;
	
	@FindBy(xpath = Locators.CITY_INPUT)
	WebElement cityInput;
	
	@FindBy(xpath = Locators.PROMOTIONS_CHECKBOX)
	WebElement promotionCheckbox;
	
	@FindBy(xpath = Locators.TERMS_CHECKBOX)
	WebElement termsCheckbox;
	
	@FindBy(xpath = Locators.REGISTER_BUTTON)
	WebElement registerButton;
    
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    
    public void clickCreateAccount() {
    	createButton.click();
    }
    
    public void fillNewUserForm(String username, String email, String password, String fname, String lname, String country, String city) throws InterruptedException {
    	usernameInput.sendKeys(username);
    	emailInput.sendKeys(email);
    	passwordRInput.sendKeys(password);
    	confPasswordInput.sendKeys(password);
    	fnameInput.sendKeys(fname);
    	lnameInput.sendKeys(lname);
    	Select drpCountry = new Select(countryList);
    	drpCountry.selectByVisibleText(country);
    	cityInput.sendKeys(city);
    	Thread.sleep(3000);
    	promotionCheckbox.click();
    	termsCheckbox.click();
    	registerButton.isEnabled();
    	registerButton.click();
    }
}
