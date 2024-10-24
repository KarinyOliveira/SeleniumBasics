import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebdriverCommands {
	WebDriver driver;
	
	@Test
	@Parameters ({"url", "title", "username", "password"})
	public void setUp(String url, String title, String username, String password) throws InterruptedException {
		String baseUrl = url;
		System.out.println("Launching Chrome Browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String testTitle = title;
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menuUser']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='sign_in_btn']")).click();
		String user = driver.findElement(By.xpath("//*[@id='menuUserLink']/span")).getDomProperty("outerText");
		Assert.assertEquals(user, username);
		Thread.sleep(3000);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.close();

	}
}
