package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticleTest {

	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectpath + "/drivers/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//goto google.com
		driver.get("https://www.contrado.co.uk/");
		
		


	}

}
