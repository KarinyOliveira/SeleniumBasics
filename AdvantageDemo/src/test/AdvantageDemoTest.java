package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.RegisterPage;
import utils.BaseClass;


public class AdvantageDemoTest extends BaseClass {
	
	@Test (priority = 0)
	@Parameters({ "url","username", "password", "email", "fname", "lname", "country", "city", "register_url" })
	public void newAccount(String url, String username, String password, String email, String fname, String lname, String country,
			String city, String register_url) throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);
		System.out.println("Opening Home Page");
		homePage.navigateHome(url);
		Thread.sleep(3000);
		System.out.println("Opening Register Page");
		homePage.clickUserMenu();
		registerPage.clickCreateAccount();
		Assert.assertEquals(driver.getCurrentUrl(), register_url);

		System.out.println("Fill Register Account Fields");
		Thread.sleep(5000);
		registerPage.fillNewUserForm(username, email, password, fname, lname, country, city);
		Thread.sleep(5000);
		String user = homePage.getUserIconValue();
		Assert.assertEquals(user, username);

	}
	
	@Test (priority = 1)
	@Parameters({"url", "username", "password", "search_item1", "speakerName" })
	public void addItemCart(String url, String username, String password, String search_item1, String speakerName) throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickUserMenu();
		homePage.loginUser(username, password);
		Thread.sleep(4000);
		String user = homePage.getUserIconValue();
		Assert.assertEquals(user, username);
		homePage.searchItem(search_item1);
		Thread.sleep(5000);
		homePage.addCart("1");
		homePage.goHomePage();
		homePage.clickSpeaker(speakerName);
		homePage.addCart("2");
		Thread.sleep(5000);
		homePage.goHomePage();

	}
//	
	@Test (priority = 2)
	@Parameters ({"username", "password","usernameSafepay", "passwordSafepay"})
	public void checkoutItems(String username, String password, String usernameSafepay, String passwordSafepay) throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		homePage.clickUserMenu();
		homePage.loginUser(username, password);
		Thread.sleep(4000);
		String user = homePage.getUserIconValue();
		Assert.assertEquals(user, username);
		checkoutPage.checkoutItems(usernameSafepay, passwordSafepay);
		
	}

	@Test (priority = 3)
	@Parameters({ "username", "password"})
	public void logout(String username, String password) throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickUserMenu();
		homePage.loginUser(username, password);
		Thread.sleep(4000);
		String user = homePage.getUserIconValue();
		Assert.assertEquals(user, username);
		homePage.logoutUser();
	}
	
	
}
