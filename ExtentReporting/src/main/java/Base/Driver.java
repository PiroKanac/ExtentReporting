package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Driver {
	
	static String driverPath = "C:\\Users\\vnikolic\\Downloads\\Selenium";
	public WebDriver driver;
	public ExtentReports extentReport;
	public ExtentTest extentTest;
	@BeforeMethod
	public void setUp() {
		
		extentReport = new ExtentReports("./Report/report.html", true);
		extentReport.addSystemInfo("Author Name", "Testing");
		//    Open Chrome browser
		System.out.println("*******************");
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vnikolic\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {

	
		extentReport.flush();
		driver.quit();
	}
	
	@AfterSuite
	public void generateReport() throws Exception {
		
		
	}
	
}
