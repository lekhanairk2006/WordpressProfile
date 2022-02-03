package pageRepo;

import java.util.concurrent.TimeUnit;

import objectRepo.LogInPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LaunchServer {
	public WebDriver driver;
	public WebDriver LaunchUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Wordpress/chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://wordpress.com/me";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
