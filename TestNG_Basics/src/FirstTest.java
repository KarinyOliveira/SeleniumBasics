import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
	
	private WebDriver driver;

    @BeforeClass
    public void setUp() {
        
        driver = new ChromeDriver();
    }

    @Test
    public void testDemoBlazeHomePage() {
        driver.get("https://www.demoblaze.com");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
}
