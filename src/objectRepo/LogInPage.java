package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	public LogInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	WebDriver driver;
	By email = By.xpath("//input[@id='usernameOrEmail']");
	By continueButton = By.xpath("//div[@class='login__form-action']/button[contains(text(),'Continue')]");
	By password = By.xpath("//input[@type='password']");
	By loginButton = By.xpath("//div[@class='login__form-action']/button[contains(text(),'Log In')]");
	
	public WebElement EmailId(){
		return driver.findElement(email);
	}
	
	public WebElement continueButton(){
		return driver.findElement(continueButton);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement loginButton(){
		return driver.findElement(loginButton);
	}


}
