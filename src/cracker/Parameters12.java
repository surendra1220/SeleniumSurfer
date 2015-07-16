package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameters12 {
	
	@Test
	@Parameters({"url"})
	public void testParameters(String url) throws Exception
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
	}

}
