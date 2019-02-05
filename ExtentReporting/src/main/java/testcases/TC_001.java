package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.Driver;

	public class TC_001 extends Driver{
		
		@Test
		public void tc_001() {
	
			extentTest = new ExtentTest("TC_001", "Google search functionality");
			driver.get("https://google.com");
			System.out.println("Navigate to URL");
			driver.findElement(By.name("q")).sendKeys("Hello Selenium!");
			extentTest.log(LogStatus.PASS, "Test Case Passed");
			extentReport.endTest(extentTest);
	
		}
	}
