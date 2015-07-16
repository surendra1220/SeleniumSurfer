package cracker;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class firefoxProfileClass {

	@Test
	public void testMethod()
	{
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("GrayHair");
		myprofile.setPreference("browser.startup.homepage","http://www.google.com");
		WebDriver driver = new FirefoxDriver(myprofile); 
		
	}

}
