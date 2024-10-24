//Student Name: Kariny Oliveira
//Student Number: CT1004878

package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultPage;
import utils.BaseClass;
//Extends the Base Class to execute the setup and teardown
public class TestHomePage extends BaseClass {

	//TestNG parameters are available on testng.xml file
	@Test
    @Parameters("baseURL")
    public void testNavigateToGermanWikipedia(String baseURL) {
        HomePage homePage = new HomePage(driver);
        driver.get(baseURL);
        homePage.navigateToGermanWikipedia();
        Assert.assertTrue(driver.getCurrentUrl().contains("de.wikipedia.org"));
    }

    @Test
    @Parameters({"baseURL", "searchQuery"})
    public void testNavigateToSpanishWikipediaAndSearch(String baseURL, String searchQuery) {
        HomePage homePage = new HomePage(driver);
        driver.get(baseURL);
        homePage.navigateToSpanishWikipedia();
        Assert.assertTrue(driver.getCurrentUrl().contains("es.wikipedia.org"));

        homePage.performSearch(searchQuery);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.areSearchResultsDisplayed());
    }
}
