package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollbarFunctionality {
	  @Test
	  public void TCase03() throws Exception {

			WebDriver driver = new FirefoxDriver();
			driver.get("http://automationplace.blogspot.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			/*EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			
			efw.executeScript("Scroll(0,4000)", args);*/
			
			
			
			JavaScriptExecutor jse = (JavaScriptExecutor)driver;
			
			
	
	  }
}