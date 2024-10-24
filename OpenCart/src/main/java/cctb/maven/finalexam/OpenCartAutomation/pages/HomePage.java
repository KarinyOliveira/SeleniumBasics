package cctb.maven.finalexam.OpenCartAutomation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cctb.maven.finalexam.OpenCartAutomation.utils.Locators;

public class HomePage {
	private WebDriver driver;
	WebDriverWait wait;

	@FindBy(name = Locators.SEARCH_INPUT)
	WebElement searchBox;

	@FindBy(xpath = Locators.SEARCH_BUTTON)
	WebElement searchButton;

	@FindBy(xpath = Locators.ACCOUNT_MENU)
	WebElement myAccountDropdown;

	@FindBy(xpath = Locators.REGISTER_LINK)
	WebElement registerLink;

	@FindBy(linkText = Locators.LOGIN_LINK)
	WebElement loginLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void openHomePage() {
		driver.get("https://demo.opencart.com/");
	}

	public void searchProduct(String productName) {
		searchBox.sendKeys(productName);
		searchButton.click();
	}

	public void navigateToRegisterPage() throws InterruptedException{
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		//Checking if human
		Thread.sleep(12000);
	}

	public void navigateToLoginPage() {
		myAccountDropdown.click();
		loginLink.click();
	}
}
