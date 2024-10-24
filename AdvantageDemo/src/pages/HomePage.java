package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Locators;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = Locators.USER_VALUE)
	WebElement userValue;

	@FindBy(xpath = Locators.USER_MENU)
	WebElement userMenu;

	@FindBy(xpath = Locators.SEARCH_ICON)
	WebElement searchIcon;

	@FindBy(xpath = Locators.SEARCH_INPUT)
	WebElement searchInput;

	@FindBy(xpath = Locators.PRODUCT_RESULT)
	WebElement productResult;

	@FindBy(xpath = Locators.LOGIN_INPUT)
	WebElement loginInput;

	@FindBy(xpath = Locators.PASSWORD_INPUT)
	WebElement passwordInput;

	@FindBy(xpath = Locators.SIGNIN_BUTTON)
	WebElement signinButton;

	@FindBy(xpath = Locators.LOGOUT_BUTTON)
	WebElement logoutButton;

	@FindBy(xpath = Locators.SAVECART_BUTTON)
	WebElement savecartButton;

	@FindBy(xpath = Locators.CART_ITEMS)
	WebElement itemsCartNum;

	@FindBy(xpath = Locators.HOMEPAGE_ICON)
	WebElement homePageIcon;

	@FindBy(xpath = Locators.SPEAKER_LIST)
	WebElement speakerLabel;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void navigateHome(String baseurl) {
		driver.get(baseurl);
	}
	
	public String getUserIconValue() {
		return userValue.getDomProperty("outerText");
	}

	public void clickUserMenu() {
		userMenu.click();
	}

	public void searchItem(String item) throws InterruptedException {
		searchIcon.click();
		Thread.sleep(3000);
		searchInput.sendKeys(item);
		searchIcon.click();
		productResult.click();
	}

	public void loginUser(String username, String password) {
		loginInput.sendKeys(username);
		passwordInput.sendKeys(password);
		signinButton.click();
	}

	public void logoutUser() {
		userMenu.click();
		logoutButton.click();
	}

	public void addCart(String quantity) {
		savecartButton.click();
		String num = itemsCartNum.getDomProperty("innerText");
		if (num.equals(quantity))
			System.out.println("Test Pass !!!");
		else
			System.out.println("Test Fail !!!!");
	}

	public void goHomePage() {
		homePageIcon.click();
	}

	public void clickSpeaker(String speakerName) {
		speakerLabel.click();
		WebElement speakerItem = driver.findElement(By.xpath(Locators.PRODUCT_LABEL + speakerName + "')]"));
		speakerItem.click();
	}

}
