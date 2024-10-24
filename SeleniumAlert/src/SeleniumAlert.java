import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlert {

	public void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login1']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		String expectedAlertText = "Please enter a valid user name";
		if (alertMessage.equals(expectedAlertText)) {
			Thread.sleep(4000);
			alert.dismiss();
			System.out.println("TEST PASS");
			Thread.sleep(3000);
		} else
			System.out.println("TEST FAIL");
		driver.close();
	}

}
