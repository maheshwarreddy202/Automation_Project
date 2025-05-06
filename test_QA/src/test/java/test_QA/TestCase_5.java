package test_QA;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_5 {

	public WebDriver driver;

	@Parameters("browser")

	@BeforeClass

	// Passing Browser parameter from TestNG xml 
	@Test
	public void beforeTest(String browser) {
		
		//If the browser is Firefox, then do this
		if (browser.equalsIgnoreCase("firefox")) {
			
			//Initializing the Firefox driver (Gecko)
			driver = new FirefoxDriver();
		} else if (browser.contentEquals("chrome")) {
			
			//Initializing the chrome driver
			driver = new ChromeDriver();
		}
		
		driver.get("https://toolsqa.com/");
	}
}
