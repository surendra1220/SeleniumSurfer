package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScrollBy {
	
	@Test
	public void testScroll()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Cron");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript(driver.findElement(By.id("")).click();, arg1)*/
		
	}

}
