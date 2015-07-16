package cracker;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase03 {
  @Test
  public void TCase03() throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("SpecialAssistanceWindow")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[6]/a")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]/a")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(1000);
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("View all Deals")).click();
		System.out.println(parentwindow);
		
		
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String child : allwindows)
		{
			if(!child.equals(parentwindow))
			{
				driver.switchTo().window(child);
				Thread.sleep(3000);
				driver.findElement(By.linkText("Country Inn By Carlson Delhi S...")).click();
				
			}
		}
		String str = driver.getCurrentUrl();
		System.out.println("Window name is : "+str);
		driver.switchTo().window(parentwindow);
		String str1 = driver.getCurrentUrl();
		System.out.println("Main Window name is : "+str1);
		Thread.sleep(3000);
		driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_GoingNextday")).click();
  }
  
  

}
