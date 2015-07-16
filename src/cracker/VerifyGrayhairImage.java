package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class VerifyGrayhairImage {
	
	@Test
	public void verifyImage()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.istockphoto.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement imagesearch = driver.findElement(By.xpath("//div[@class='promo-banner']/section/div/img"));
		//WebElement imagesearch = driver.findElement(By.xpath("//div[@class='banner-headline']/p[2]"));
		
		
		Boolean imagedisplay = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth >0" , imagesearch);
		
		if(!imagedisplay)
		{
			System.out.println("Image is not Visible");
		}
		else
		{
			System.out.println("Image is Visible");
		}
		
	}

}
