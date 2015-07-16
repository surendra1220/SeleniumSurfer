package cracker;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PayTMLogin {
	
	
	@Test
	public void Login() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Start Webdriver\\Libraries\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.xpath("//ul[@class='fr nav1']/li/a")).click();
		Thread.sleep(6000);
		WebElement loginpopup = driver.findElement(By.xpath("//div[@class='modal-content']//div//iframe"));
		driver.switchTo().frame(loginpopup);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9177477998");
		driver.findElement(By.id("password")).sendKeys("Securechild@123");
		driver.findElement(By.xpath("//div[@class='tp10']/button")).click();
		
		
		
		
	}

}
