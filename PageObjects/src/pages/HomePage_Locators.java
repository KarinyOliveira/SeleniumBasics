package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage_Locators {

	private static WebDriver driver;

	public HomePage_Locators(WebDriver driver) {
		this.driver = driver;
	}
	
	final static WebElement bt_sigin = driver.findElement(By.xpath("//a[contains(text(),'Sign in']"));
	final static WebElement bt_createAccount = driver.findElement(By.xpath("//div[contains(text(),'Create an account')]"));


}
