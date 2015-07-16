package cracker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SpiceJetDatePicker {
	
	@Test
	public void datePicker() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']")).click();
		WebElement widget = driver.findElement(By.id("ui-datepicker-div"));
		List<WebElement> rows = widget.findElements(By.tagName("tr"));
		List<WebElement> columns = widget.findElements(By.tagName("td"));
		
		for(WebElement element : columns)
		{
			if(element.getText().equals("24"))
			{
				element.findElement(By.linkText("24")).click();
				break;
			}
		}
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(1000);
		
	}

}
