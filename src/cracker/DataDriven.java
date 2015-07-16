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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class DataDriven {
	
	public WebDriver driver;
	public String str;
	@Test
	public void dataDrivenmeth() throws BiffException, IOException, RowsExceededException, WriteException, Exception
	{
									
		FileInputStream fi = new FileInputStream("D:\\StreamFiles\\MTWeb.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);
		
		FileOutputStream fo = new FileOutputStream("D:\\StreamFiles\\MTWebOut.xls");
		WritableWorkbook wb = Workbook.createWorkbook(fo);
		WritableSheet ws = wb.createSheet("Sheet1", 0);
		
		
		
		
		for(int i=1; i<s.getRows();i++)
		{
			driver.findElement(By.id("Login")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("Password")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("submit")).click();
			
			try
			{
				Thread.sleep(2000);
				driver.findElement(By.linkText(" Logout")).click();
				str="Pass";
			}
			catch(Exception e){
				str="Fail";
			}
			
			Label la = new Label(2, i, str);
			ws.addCell(la);
			
			for(int j=0;j<s.getColumns();j++)
			{
				System.out.println(s.getCell(j, i).getContents());
				Label re = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(re);
			}
			
		}
		
		
		Label un = new Label(0, 0, "UserName");
		Label pw = new Label(1, 0, "Password");
		Label res = new Label(2, 0, "Result");
		ws.addCell(un);
		ws.addCell(pw);
		ws.addCell(res);
		
		wb.write();
		wb.close();
		
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
				//WebDriver driver = new FirefoxDriver();
		
				System.setProperty("webdriver.chrome.driver", "D:\\Start Webdriver\\Libraries\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.grayhairsoftware.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//ul[@id='ancillary']/li/a")).click();
	}
	
	/*@AfterTest
	public void afterTest()
	{
		driver.quit();
	}*/
	
}
