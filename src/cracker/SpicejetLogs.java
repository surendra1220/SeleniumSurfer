package cracker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SpicejetLogs {
	
	@Test
	public void datePicker() throws Exception
	{
		
		Logger logger=Logger.getLogger("SpicejetLogs");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver = new FirefoxDriver();
		logger.info("Browser Opened");
		
		driver.get("http://www.spicejet.com/");
		logger.info("Application Launched");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		logger.info("Wait time to maximize the window");
		
		driver.manage().window().maximize();
		logger.info("Window maximized");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		logger.info("Checked One Way Radio button");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		logger.info("Clicked on text field to select Delhi");
		
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		logger.info("Selected Hyderabad");
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		logger.info("Selected Delhi");
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']")).click();
		logger.info("Clicked on date picker");
		
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
