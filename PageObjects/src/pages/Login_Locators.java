package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Locators {
	
	
	public static final By in_email = By.xpath("//input[@id='identifierId']");
	public static final By bt_next = By.xpath("//span[normalize-space()='Next']");
	public static final By in_password = By.xpath("//input[@name='password']");
	public static final By cb_showPassword = By.xpath("//input[@type='checkbox']");
	public static final By bt_forgotPassword = By.xpath("//span[contains(text(),'Forgot your password?')]");
	

}
