package test_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

public class TestCase_2 {
	public static WebDriver driver;

	@Test
	public static void Test1() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		String expectedResult = "Swag Labs to do";
		String actualResult = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		// Assert.assertEquals(actualResult, expectedResult);
		// Assert.assertTrue(actualResult==expectedResult);
		softassert.assertEquals(actualResult, expectedResult);
		// driver.close();
	}

	@Test
	public static void Test2() {
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("After Method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
