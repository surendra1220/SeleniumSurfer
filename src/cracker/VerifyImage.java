package cracker;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyImage{
 
 public static WebDriver driver;
 @BeforeTest
 public void startbrowser()
 {
  driver=new FirefoxDriver();
  driver.get("http://automationplace.blogspot.in/");
 }
 @Test
 public void imageverify()
 {
  
   WebElement ImageFile = driver.findElement(By.xpath("//*[@id='Profile1']/div/a[1]/img"));
          
          Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
          if (!ImagePresent)
          {
               System.out.println("Image not displayed.");
          }
          else
          {
              System.out.println("Image displayed.");
          }
   }
 
 @AfterMethod
 public void end()
 {
  //driver.quit()
 }

}
