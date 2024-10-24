package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.Login_Locators;

public class Login_Actions {
	
	private static WebDriver driver;

	public Login_Actions(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public static void fillEmail(String email) {
		WebElement emailInput = driver.findElement(Login_Locators.in_email);
		emailInput.sendKeys(email);
	}
	
	public static void fillPassword(String password) {
		WebElement passwordInput = driver.findElement(Login_Locators.in_password);
		passwordInput.sendKeys("example");
	}
	
	public static void clickShowPassword() {
		WebElement showPasswordCheckbox = driver.findElement(Login_Locators.cb_showPassword);
		showPasswordCheckbox.click();
	}
	
	public static void clickNextButton() {
		WebElement nextButton = driver.findElement(Login_Locators.bt_next);
		nextButton.click();
	}
	
	public void loginUser(String email, String password) throws InterruptedException {
		Thread.sleep(5000);
		fillEmail(email);
		Thread.sleep(2000);
		clickNextButton();
		Thread.sleep(5000);
		fillPassword(password);
		clickShowPassword();
		clickNextButton();	
	}

}
