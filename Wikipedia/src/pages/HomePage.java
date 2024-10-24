//Student Name: Kariny Oliveira
//Student Number: CT1004878

package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = Locators.SEARCH_INPUT)
    WebElement searchInput;

    @FindBy(id = Locators.SEARCH_LANGUAGE_LINK_DE)
    WebElement germanLink;

    @FindBy(id = Locators.SEARCH_LANGUAGE_LINK_ES)
    WebElement spanishLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage() {
        driver.get("https://www.wikipedia.org/");
    }

    public void navigateToGermanWikipedia() {
        wait.until(ExpectedConditions.elementToBeClickable(germanLink)).click();
    }

    public void navigateToSpanishWikipedia() {
        wait.until(ExpectedConditions.elementToBeClickable(spanishLink)).click();
    }

    public void performSearch(String query) {
        wait.until(ExpectedConditions.visibilityOf(searchInput)).sendKeys(query);
        searchInput.submit();
    }
}
