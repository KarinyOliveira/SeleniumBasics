package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actions.Login_Actions;

public class LoginUser {
	
	WebDriver driver;
	Login_Actions loginActions;
	

	@Test
	public void setUp() throws InterruptedException {
		String baseUrl = "https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AdF4I77NnoGyEojZmfFbEbf-CLwx-rTDmKl0Evo4z83Rd2eA13OS8CpuAqoGR6t3BFJPCggCuq1o5Q&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.out.println("Launching Safari Browser");
		driver = new SafariDriver();
		loginActions = new Login_Actions(driver);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		loginActions.loginUser("dummytestautomation73", "Password12345!");
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
