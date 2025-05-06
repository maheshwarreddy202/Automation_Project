package test_QA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase_6 {
	
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{"Mahesh"},{"Password"}};
		
		}
	
	@Test(dataProvider = "data-provider")
	public void myTest(String val) {
		System.out.println("Passed parameter Is : " + val);
	}
	
}


