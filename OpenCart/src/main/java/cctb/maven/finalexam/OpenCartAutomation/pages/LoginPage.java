package cctb.maven.finalexam.OpenCartAutomation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cctb.maven.finalexam.OpenCartAutomation.utils.Locators;

public class LoginPage {
	private WebDriver driver;
	WebDriverWait wait;

	// Locators
	@FindBy(id = Locators.LOGIN_EMAIL_INPUT)
	WebElement emailField;
	@FindBy(id = Locators.LOGIN_PASSWD_INPUT)
	WebElement passwordField;
	@FindBy(xpath = Locators.LOGIN_BUTTON)
	WebElement loginButton;
	@FindBy(xpath = Locators.ACCOUNT_LINK)
	WebElement myAccountLink;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void loginUser(String email, String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	public boolean isLoginSuccessful() {
		return myAccountLink.isDisplayed();
	}
}
