package test_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase_3 {
	public static WebDriver driver;
	@Test
	public static void Test4() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		String expectedResult = "Swag Labs to do";
		String actualResult = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		// Assert.assertEquals(actualResult, expectedResult);
		// Assert.assertTrue(actualResult==expectedResult);
		softassert.assertEquals(actualResult, expectedResult);
		driver.close();
	}
	
	@Test
	public static void Test5() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.close();

	}

}
