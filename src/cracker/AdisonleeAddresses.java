package cracker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdisonleeAddresses {
	
	
	
	public static void main (String[] args) throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://new.addisonlee.com/al/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("email-1")).sendKeys("vltestqa@yahoo.com");
		driver.findElement(By.xpath("//div[@class='form-group']/button")).click();
		driver.findElement(By.id("password-1")).sendKeys("12345");
		driver.findElement(By.xpath("//div[@class='form-group']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='row']/div[@class='col-sm-4 booking-flow-booking-types_item']/div")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='address-search_dropdown-controls']/span")).click();
		List<WebElement> allElements = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-stretched']"));
		
		for(WebElement element : allElements)
		{
			System.out.println(element.getText());
			
		}
		
    
	}

}
