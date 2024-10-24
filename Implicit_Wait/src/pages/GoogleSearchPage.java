//Student Name: Kariny Oliveira
//Student Number: CT1004878

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    WebDriver driver;

    //using FindBy annotation provided by support selenium library, the code is clean.
    @FindBy(name = "q")
    WebElement searchBox;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Method to insert the query to be searched and submit the input
    public void search(String query) {
        searchBox.sendKeys(query);
        searchBox.submit();
    }
}
