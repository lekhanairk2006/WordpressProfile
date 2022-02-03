package testCases;
import objectRepo.LogInPage;
import objectRepo.ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageRepo.LaunchServer;
import pageRepo.LogIn;
import pageRepo.Profile;

public class ProfileTest extends LaunchServer{
	@Test
	public void ProfileTest1() throws InterruptedException {	
		driver = LaunchUrl();
		LogIn LP = new LogIn();
		LP.LogInMethod(driver);
		Profile PP = new Profile();
		PP.UpdateProfile(driver);
		driver.quit();
	}

}
