package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
 
public class Reports {

	@Test
	public void verifySeleniumReports() throws InterruptedException{

           // Create object of extent report and specify the Class name in get method
           // in my case I have used AdvanceReporting.class
			ExtentReports extent = ExtentReports.get(Reports.class);
 
            // Call init method and specify the location where you want to save this report
           // second parameter is set to true it means it will overwrite report with new one
            extent.init("D:\\SeleniumReports\\myreport.html", true);
 
            // Start Test
            extent.startTest("MTWeb Login");
 
           // Start browser
           WebDriver driver = new FirefoxDriver();
           driver.manage().window().maximize();
           extent.log(LogStatus.INFO, "Browser started");
           
           // Open application
           driver.get("https://client.grayhairsoftware.com/");
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           extent.log(LogStatus.INFO, "Navigated to GrayHair Software website");
 
            // Enter User Name
           driver.findElement(By.id("Login")).sendKeys("demo@mailtrak.com");
           extent.log(LogStatus.INFO, "Inputting the User Name");
 
           // Enter User Name
           driver.findElement(By.id("Password")).sendKeys("GHSdemo1");
           extent.log(LogStatus.INFO, "Inputting the Password");
           
           // Click on Submit button
           driver.findElement(By.id("submit")).click();
           Thread.sleep(2000);
           extent.log(LogStatus.INFO, "Click on Submit button");
           
           // Click on LogOut button
           driver.switchTo().frame(driver.findElement(By.name("topFrame")));
           driver.findElement(By.xpath("//table[@class='Menu']/tbody/tr[4]/td/b/a[3]")).click();
           extent.log(LogStatus.INFO, "Click on Logout button");
           
           extent.log(LogStatus.PASS, "Successfully Logged Out");
 
 
 
            // In case you want to attach screenshot then use below method
            // I am taking random image but you have to take screenshot at run time and specify the path
           	extent.attachScreenshot("D:\\SeleniumReports\\Screenshots\\image1.jpg");
  
            // Close application
             driver.quit();
             extent.log(LogStatus.INFO, "Browser closed");
  
            // close report
             extent.endTest();
    }
 }