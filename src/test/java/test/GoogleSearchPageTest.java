package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		
		String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchpageobj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com");
		
		searchpageobj.setTextInSearch("Automation Step by Step");
		
		searchpageobj.clickSearchButton();
		
		driver.close();
	}
}
