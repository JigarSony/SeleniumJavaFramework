import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String projectpath = System.getProperty("user.dir");
		
		System.out.println("Projectpath" +projectpath);
		
		//System.setProperty("webdriver.gecko.driver", projectpath + "//drivers//geckodriver//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectpath +"//drivers//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectpath +"//drivers//IEDriverServer//IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.in/");
		
		WebElement ele1 = driver.findElement(By.name("q"));
		
		ele1.sendKeys("Automation Step by Step");
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
