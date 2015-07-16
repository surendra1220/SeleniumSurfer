package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MTWebLogin {
	
	public void Login() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://client.grayhairsoftware.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("Login")).sendKeys("demo@mailtrak.com");
		driver.findElement(By.id("Password")).sendKeys("GHSdemo1");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.name("topFrame")));
		driver.findElement(By.xpath("//table[@class='Menu']/tbody/tr[4]/td/b/a[3]")).click();
		//driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/b/a[3]")).click();
	
	}
	

	public static void main (String[] args) throws InterruptedException
	{
		MTWebLogin mt = new MTWebLogin();
		mt.Login();
		
	}
}
