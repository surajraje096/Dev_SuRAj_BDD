package Com.Easyshoppy.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Com.Easyshoppy.qa.TestBase.TestBase;

public class LoginPage extends TestBase{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifiloginPage() {
		boolean page=driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
	return page;
	}
	
	public void useridAndPass() {
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(config.getProperty("EmailId"));
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys(config.getProperty("Confirm"));
	}
	public void clicksbmitbtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	public boolean veryfiedmsg() {
		boolean msg=driver.findElement(By.xpath("(//ul[contains(@class,'nav navbar-nav')]//a)[5]")).isDisplayed();
	return msg;
	}
	
}
