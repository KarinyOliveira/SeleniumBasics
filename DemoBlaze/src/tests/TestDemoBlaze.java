//Student Name: Kariny Oliveira
//Student Number: CT1004878

package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.BaseClass;

//Extends the Base Class to perform the setup and TearDown
public class TestDemoBlaze extends BaseClass {

	//The tests are executed using an specific order to ensure we are covering the manual scenarios in the same order
	//To do this we use the priority annotation and ensure the dependencies are covered
	//The tests are parameterized and the values can be changed in testng.xml file
    @Test(priority=0)
    @Parameters({"username", "password"})
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://www.demoblaze.com/");
        loginPage.login(username, password);
    }

    @Test(priority=1)
    @Parameters({"productName"})
    public void testAddProductToCart(String productName) {
        // Navigate to home page
        driver.get("https://www.demoblaze.com/");
        
        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart(productName);
    }

    @Test(priority=2)
    @Parameters({"contactName", "contactEmail", "contactMessage"})
    public void testContactSupport(String contactName, String contactEmail, String contactMessage) {
        // Navigate to home page
        driver.get("https://www.demoblaze.com/");
        
        ContactPage contactPage = new ContactPage(driver);
        contactPage.contactSupport(contactName, contactEmail, contactMessage);
    }
}