package cctb.maven.finalexam.OpenCartAutomation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cctb.maven.finalexam.OpenCartAutomation.utils.Locators;

public class RegisterPage {
	private WebDriver driver;
	WebDriverWait wait;

	@FindBy(id = Locators.FNAME_INPUT)
	WebElement firstNameField;

	@FindBy(id = Locators.LNAME_INPUT)
	WebElement lastNameField;

	@FindBy(id = Locators.EMAIL_INPUT)
	WebElement emailField;

	@FindBy(id = Locators.PHONE_INPUT)
	WebElement telephoneField;

	@FindBy(id = Locators.PASSWORD_INPUT)
	WebElement passwordField;

	@FindBy(id = Locators.CPWD_INPUT)
	WebElement confirmPasswordField;

	@FindBy(name = Locators.TERMS_CHECKBOX)
	WebElement agreeCheckbox;

	@FindBy(xpath = Locators.CONTINUE_BUTTON)
	WebElement continueButton;

	@FindBy(xpath = Locators.SUCESS_MESSAGE)
	WebElement successMessage;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void registerUser(String firstName, String lastName, String email, String telephone, String password) {
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		telephoneField.sendKeys(telephone);
		passwordField.sendKeys(password);
		confirmPasswordField.sendKeys(password);
		agreeCheckbox.click();
		continueButton.click();
	}

	public boolean isRegistrationSuccessful() {
		return successMessage.isDisplayed();
	}
}