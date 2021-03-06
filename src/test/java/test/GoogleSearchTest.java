package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		googleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		googleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//close driver
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}
}
