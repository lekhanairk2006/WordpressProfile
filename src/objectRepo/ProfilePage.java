package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	public ProfilePage(WebDriver driver){
		this.driver = driver;
	}
	WebDriver driver;
	By firstName = By.xpath("//input[@id='first_name']");
	By lastName = By.xpath("//input[@id='last_name']");
	By saveProfileButton = By.xpath("//p[@class='profile__submit-button-wrapper']/button[contains(text(),'Save profile details')]");
	
	public WebElement firstName(){
		return driver.findElement(firstName);
	}
	
	public WebElement lastName(){
		return driver.findElement(lastName);
	}
	
	public WebElement saveProfileButton(){
		return driver.findElement(saveProfileButton);
	}

}
