
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumAlert2 {
	WebDriver driver;

	@Test
	@Parameters({"username", "password" })
	public void emptyLogin(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login1']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		String expectedAlertText = "Please enter a valid user name";
		Assert.assertEquals(alertMessage, expectedAlertText);
		alert.dismiss();
		Thread.sleep(3000);

		
	}

	@BeforeMethod
	@Parameters({ "url" })
	public void beforeMethod(String url) throws InterruptedException {

		System.out.println("Starting test");
		String baseUrl = url;
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Closing Browser");
		driver.close();

	}

}
