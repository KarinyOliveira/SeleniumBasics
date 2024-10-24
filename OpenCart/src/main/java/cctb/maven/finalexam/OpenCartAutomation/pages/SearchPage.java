package cctb.maven.finalexam.OpenCartAutomation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import cctb.maven.finalexam.OpenCartAutomation.utils.Locators;

public class SearchPage {
	private WebDriver driver;
	WebDriverWait wait;

	// Locators
	@FindBy(xpath = Locators.SEARCH_RESULT)
	WebElement searchResult;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public boolean isProductDisplayed() {
		return searchResult.isDisplayed();
	}
}
