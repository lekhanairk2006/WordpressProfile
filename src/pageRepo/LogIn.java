package pageRepo;

import objectRepo.LogInPage;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn {
	@Test
	public void LogInMethod(WebDriver driver) throws InterruptedException {
		LogInPage LP = new LogInPage(driver);	
		LP.EmailId().sendKeys("emailValue");
		LP.continueButton().click();
		Thread.sleep(2000);
		LP.password().sendKeys("passwordValue");
		LP.loginButton().click();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='formatted-header__title wp-brand-font']")));
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, "My Profile — WordPress.com");
	}
}
