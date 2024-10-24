package cctb.maven.finalexam.OpenCartAutomation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import cctb.maven.finalexam.OpenCartAutomation.pages.HomePage;
import cctb.maven.finalexam.OpenCartAutomation.pages.LoginPage;
import cctb.maven.finalexam.OpenCartAutomation.pages.RegisterPage;
import cctb.maven.finalexam.OpenCartAutomation.pages.SearchPage;
import cctb.maven.finalexam.OpenCartAutomation.utils.BaseClass;

public class OpenCartTest extends BaseClass {
	private static final Logger logger = LogManager.getLogger(OpenCartTest.class);

	@Test(priority = 1)
	public void testUserRegistration() {
		HomePage homePage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);
		homePage.openHomePage();
		try {
			homePage.navigateToRegisterPage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		registerPage.registerUser("Automation", "Test", "automationtestuser@example.com", "123456789", "password1234");

		Assert.assertTrue(registerPage.isRegistrationSuccessful(), "User registration failed.");
		logger.info("User registration successful.");
	}

	@Test(priority = 2)
	public void testUserLogin() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);

		homePage.navigateToLoginPage();

		loginPage.loginUser("automationtestuser@example.com", "password1234");

		Assert.assertTrue(loginPage.isLoginSuccessful(), "User login failed.");
		logger.info("User login successful.");
	}

	@Test(priority = 3)
	public void testProductSearch() {
		HomePage homePage = new HomePage(driver);
		SearchPage searchPage = new SearchPage(driver);
		homePage.searchProduct("iPhone");

		Assert.assertTrue(searchPage.isProductDisplayed(), "Product search failed.");
		logger.info("Product search successful.");
	}

}
