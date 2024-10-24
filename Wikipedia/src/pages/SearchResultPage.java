//Student Name: Kariny Oliveira
//Student Number: CT1004878

package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;

public class SearchResultPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    //Perform the actions regarding the page result after the query, so we need to check if the text Java is displayed
    public boolean areSearchResultsDisplayed() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Locators.SEARCH_RESULTS)));
        WebElement element = driver.findElement(By.xpath(Locators.SEARCH_RESULTS));
        return element.isDisplayed();
    }
}