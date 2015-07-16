package cracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestCase04 {
	
	public void gmailSignUP()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("link-signup")).click();
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Surendra");
		driver.findElement(By.id("LastName")).sendKeys("Bharadwaj");
		driver.findElement(By.id("GmailAddress")).sendKeys("seleniumlearning7@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("9177477998");
		driver.findElement(By.id("PasswdAgain")).sendKeys("9177477998");
		driver.findElement(By.xpath("//*[@id='BirthMonth']/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=':8']/div")).click();
		driver.findElement(By.id("BirthDay")).sendKeys("21");
		driver.findElement(By.id("BirthYear")).sendKeys("1989");
		driver.findElement(By.xpath("//*[@id='Gender']/div")).click();
		driver.findElement(By.xpath("//*[@id=':f']/div")).click();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9999999999");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("surendrabharadwaj123456@gmail.com");
		driver.findElement(By.id("SkipCaptcha")).click();
		driver.findElement(By.id("TermsOfService")).click();
		driver.findElement(By.id("submitbutton")).click();
		
	}
	
	public static void main (String[] args)
	{
		TestCase04 tc4 = new TestCase04();
		tc4.gmailSignUP();
	}

}
