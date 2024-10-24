//Student Name: Kariny Oliveira
//Student Number: CT1004878

package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;

public class ProductPage {
	WebDriver driver;
	WebDriverWait wait;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Map all the elements needed to Add a product to the cart and dismiss the alert
	// The product name is parameterized and can be changed on testng.xml file
	public void addProductToCart(String productName) {
		driver.findElement(By.linkText(productName)).click();
		driver.findElement(By.xpath(Locators.ADD_TO_CART_BUTTON)).click();
		Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
		alert2.dismiss();
	}
}
