//Student Name: Kariny Oliveira
//Student Number: CT1004878

package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

/*
 * Purpose: Implicit wait is used to tell the WebDriver to wait for a certain amount of time before 
 * throwing a NoSuchElementException. It is applied globally to all elements in the WebDriver instance.
 * When to Use: Use implicit wait when you want to wait for elements to be present without specifying 
 * conditions for individual elements. It is useful for simple synchronization needs.
 */

public class ImplicitWaitGoogleSearchTest {
	WebDriver driver;
	GoogleSearchPage searchPage;

	// Setting up the parameters to start the test scenario
	// To parameterize the tests we are using TestNG and testng.xml file
	@Parameters({"driverPath", "url"})
    public void setUp(String driverPath, String url) {
        // Set up ChromeDriver
       // System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Set implicit wait
		// Impricit wait is used to wait for an element until some timeout, in this case
		// we are waiting for the element to no max than 25 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		// Navigate to the specified URL
		driver.get(url);

		// Initialize Page Object
		searchPage = new GoogleSearchPage(driver);
	}

	@Test
	@Parameters({ "searchQuery" })
	public void testGoogleSearch(String searchQuery) {
		// Perform search using the parameter received from testng.xml file
		searchPage.search(searchQuery);

		// Add a short sleep to simulate some processing
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.close();
		System.out.println("Browser closed.");

		// Quit the WebDriver
		driver.quit();
		System.out.println("Quit the browser and resources associated with it.");
	}
}