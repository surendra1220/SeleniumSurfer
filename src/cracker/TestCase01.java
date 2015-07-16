package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase01 {
	
	public void TCase01()
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Start Webdriver\\Libraries\\chromedriver_win32 (2)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("fk-top-search-box")).sendKeys("Apple Iphone");
		driver.findElement(By.xpath("//input[@class='search-bar-submit fk-font-13 fk-font-bold']")).click();
		//driver.quit();
		
	}

	
	public static void main (String[] args)
	{
		TestCase01 tc1 = new TestCase01();
		tc1.TCase01();
	}
}
