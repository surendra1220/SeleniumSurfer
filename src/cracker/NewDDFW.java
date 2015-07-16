package cracker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class NewDDFW {
	
	public WebDriver driver;
	public String str;
	@Test
	public void dataDrivenmeth() throws BiffException, IOException, RowsExceededException, WriteException, Exception
	{
		WebDriver driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Start Webdriver\\Libraries\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.get("https://www.grayhairsoftware.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='ancillary']/li/a")).click();
					
		FileInputStream fi = new FileInputStream("D:\\StreamFiles\\MTWeb.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);
	
		
		
		
		for(int i=1; i<s.getRows();i++)
		{
			driver.findElement(By.id("Login")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("Password")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("submit")).click();
			Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.name("topFrame")));
			driver.findElement(By.xpath("//table[@class='Menu']/tbody/tr[4]/td/b/a[3]")).click();
			
			
			
			
			
		
			
			
			
			
			
			
	}
	}
	
	
}
