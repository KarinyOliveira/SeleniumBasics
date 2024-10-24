package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;

public class CheckoutPage {
	WebDriver driver;
	WebDriverWait wait;

    @FindBy(xpath = Locators.SHOPPINGCART_LINK)
    WebElement shoppingCart;
    
    @FindBy(xpath = Locators.CHECKOUT_BUTTON)
    WebElement checkoutButton;
    
    @FindBy(xpath = Locators.NEXT_BUTTON)
    WebElement nextButton;
    
    @FindBy(xpath = Locators.SAFEPAY_RADIO)
    WebElement safepayRadio;
    
    @FindBy(xpath = Locators.SAFEPAY_USERNAME)
    WebElement safepayUsername;
    
    @FindBy(xpath = Locators.SAFEPAY_PASSWORD)
    WebElement safepayPassword;
    
    @FindBy(xpath = Locators.SAFEPAY_SAVE)
    WebElement safepaySave;
    
    @FindBy(xpath = Locators.PAYNOW_SAFEPAY)
    WebElement safepayPayNow;
    
    @FindBy(xpath = Locators.HOMEPAGE_ICON)
    WebElement homePageLink;
    
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    
    public void checkoutItems(String usernameSafepay, String passwordSafepay) {
    	shoppingCart.click();
    	checkoutButton.click();
    	nextButton.click();
    	safepayRadio.click();
    	safepayUsername.sendKeys(usernameSafepay);
    	safepayPassword.sendKeys(passwordSafepay);
    	safepaySave.click();
    	safepayPayNow.click();
    	homePageLink.click();
    }

}
