//Student Name: Kariny Oliveira
//Student Number: CT1004878

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Locators;



public class ContactPage {
	WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	//Contact Page file mapping all the elements needed to run the test: Contacting Customer Support
	//The name, email and message parameters are passed via testng.xml file
	public void contactSupport(String name, String email, String message) {
		driver.findElement(By.linkText(Locators.CONTACT_LINK)).click();
		driver.findElement(By.id(Locators.RECIPIENT_NAME_FIELD)).sendKeys(name);
		driver.findElement(By.id(Locators.RECIPIENT_EMAIL_FIELD)).sendKeys(email);
		driver.findElement(By.id(Locators.MESSAGE_TEXT_AREA)).sendKeys(message);
		driver.findElement(By.xpath(Locators.SEND_MESSAGE_BUTTON)).click();
	}
}
