package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentsReportBasicDemo {
		private static WebDriver driver = null;
		
		public static void main(String[] args) {
		
		//http://extentreports.com/docs/versions/3/java/#examples
		
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One","This is Test to Validate Google Search Functionality");
        
        String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test1.pass("Entered text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keybord enter key");
		
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		
		test1.info("Test Completed");
		
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test One","This is Test to Validate Google Search Functionality");
		
		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.com");
		test2.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		test2.pass("Entered text in search box");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.fail("Pressed keybord enter key");
		
		driver.close();
		driver.quit();
		test2.pass("Close the browser");
		
		test2.info("Test Completed");
		
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
