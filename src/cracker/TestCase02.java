package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase02 {

	@Test
	public void TCase02()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Start Webdriver\\Libraries\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a[@class='menu-text fk-inline-block']/span"));
		a.moveToElement(we).build().perform();
		String str = driver.findElement(By.xpath("//div[@id='menu-electronics-tab-0-content']/ul")).getText();
		System.out.println(str);
				
	}
	
/*	public static void main(String[] args) {
	
		
		TestCase02 tc2 = new TestCase02();
		tc2.TCase02();

	}*/

}
