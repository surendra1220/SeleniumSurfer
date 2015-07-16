package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCase05 {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void setup()
	{		
		driver.get("http://www.w3schools.com/sql/sql_and_or.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
  @Test
  public void TCase05_PrintCustomerName() {
	  
	  	String str = driver.findElement(By.xpath("//table[@class='reference notranslate']/tbody/tr[5]/td[4]")).getText();
		if(str.equals("120 Hanover Sq."))
		{
			String str1 = driver.findElement(By.xpath("//table[@class='reference notranslate']/tbody/tr[5]/td[2]")).getText();
			System.out.println("Customer Name is " +str1+" whose Address is '120 Hanover Sq.'");
		}
  }
  
  
  @Test
  public void TCase05_PrintCountryName() {
	  
	  	String str = driver.findElement(By.xpath("//table[@class='reference notranslate']/tbody/tr[6]/td")).getText();
		if(str.equals("5"))
		{
			String str1 = driver.findElement(By.xpath("//table[@class='reference notranslate']/tbody/tr[6]/td[7]")).getText();
			System.out.println("Country Name is " +str1+" whose Customer ID is '5'");
		}
  }
   
  

}
