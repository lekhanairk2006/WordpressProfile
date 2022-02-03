package pageRepo;
import objectRepo.ProfilePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Profile {

	public void UpdateProfile(WebDriver driver) throws InterruptedException {
		ProfilePage pp = new ProfilePage(driver);
		//enter profile details
		pp.firstName().clear();
		pp.firstName().sendKeys("Test");
		pp.lastName().clear();
		pp.lastName().sendKeys("User1");
		//validate button is enabled
		Assert.assertEquals(pp.saveProfileButton().isEnabled(), true);
		pp.saveProfileButton().click();
		//validate success notification
		String actualMsg = driver.findElement(By.xpath("//span[contains(text(),'Settings saved successfully!')]")).getText();
		String expectMsg = "Settings saved successfully!";
		Assert.assertEquals(actualMsg, expectMsg);
		//validate button is disabled
		Assert.assertEquals(pp.saveProfileButton().isEnabled(), false);
		//teardown
		pp.firstName().clear();
		pp.lastName().clear();
		pp.saveProfileButton().click();
		
	}

}
