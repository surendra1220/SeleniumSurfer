package cracker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelExample {

	
	WebDriver driver;
	
	public void setExample()
	{
		driver = new FirefoxDriver();
		
	}

	
	static public void main (String[] args)
	{
		SelExample s = new SelExample();
		s.setExample();
	}
}
