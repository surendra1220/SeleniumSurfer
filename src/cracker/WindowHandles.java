package cracker;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	
	
	@Test
	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();	
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		String mainwindow = driver.getWindowHandle();
		driver.findElement(By.id("popUpConverter")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String child : allwindows)
		{
			if(child.equals(allwindows))
			{
				System.out.println("Don't switch");
			}
			else{
				driver.switchTo().window(child);
				//System.out.println(child);
				/*Thread.sleep(10000);
				//driver.manage().window().maximize();
				driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("10000");
				driver.switchTo().defaultContent();*/
				
				
			}
		}
		
		
		
	}

}
