//Student Name: Kariny Oliveira
//Student Number: CT1004878

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Login Page mapped elements that will be used in Logging into Website test case
	//The username and password are passed via parameters on testng.xml file
	public void login(String username, String password) {
		driver.findElement(By.id(Locators.LOGIN_BUTTON)).click();
		driver.findElement(By.id(Locators.USERNAME_FIELD)).sendKeys(username);
		driver.findElement(By.id(Locators.PASSWORD_FIELD)).sendKeys(password);
		driver.findElement(By.xpath(Locators.LOGIN_SUBMIT_BUTTON)).click();
	}
}
