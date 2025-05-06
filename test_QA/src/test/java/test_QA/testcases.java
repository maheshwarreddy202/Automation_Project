package test_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcases {

	@Test//(priority = 2)
	public static void Login1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[1]")).click();
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link fa-layers fa-fw\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(), \"CHECKOUT\")]")).click();
		driver.findElement(By.id("first-name")).sendKeys("abcd");
		driver.findElement(By.id("last-name")).sendKeys("Training");
		driver.findElement(By.xpath("//input[@data-test=\"postalCode\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"./checkout-complete.html\"]")).click();
		driver.close();

	}

	@Test//(groups = { "smoke" })
	public static void Login2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(), \"Text Box\")]")).click();
		driver.findElement(By.id("userName")).sendKeys("Mahesh");
		driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("email");
		driver.findElement(By.id("currentAddress")).sendKeys("address required");
		driver.findElement(By.id("permanentAddress")).sendKeys("permanent address required");
		driver.findElement(By.xpath("//button[contains(text(), \"Submit\")]")).click();
		driver.close();
	}

//	@Test
//	public static void Textbox() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/text-box");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[[@placeholder=\"Full Name\"]")).sendKeys("Hello world");
//		driver.findElement(By.id("userEmail")).sendKeys("Email");
//
//	}

}
