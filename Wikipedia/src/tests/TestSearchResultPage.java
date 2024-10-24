//Student Name: Kariny Oliveira
//Student Number: CT1004878

package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchResultPage;
import utils.BaseClass;

public class TestSearchResultPage extends BaseClass {

	//Test to check if the query return any page as result, in this case we are checking if the Java Text is displayed
	@Test
    @Parameters({"baseURL", "searchQuery"})
    public void testSearchResultsDisplayed(String baseURL, String searchQuery) {
        HomePage homePage = new HomePage(driver);
        driver.get(baseURL);
        homePage.performSearch(searchQuery);

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertTrue(searchResultPage.areSearchResultsDisplayed());
    }
}