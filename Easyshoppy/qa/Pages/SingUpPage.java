package Com.Easyshoppy.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Com.Easyshoppy.qa.TestBase.TestBase;

public class SingUpPage extends TestBase{

/*	public SingUpPage() {
		PageFactory.initElements(driver, this);
	}*/
	
	public boolean verifyregi() {
		boolean regi=driver.findElement(By.xpath(config.getProperty("regimsg"))).isDisplayed();
	return regi;
	}
	
	public void userdetails() {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(config.getProperty("FirstName"));
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys(config.getProperty("LastName"));
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys(config.getProperty("EmailId"));
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys(config.getProperty("PhoneNumber"));
	}
	
	public void shipingAddres() {
		driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]")).sendKeys(config.getProperty("Address"));
		driver.findElement(By.xpath(" (//input[@class='form-control'])[5]")).sendKeys(config.getProperty("City"));
		driver.findElement(By.xpath("//input[@placeholder='Enter your State..']")).sendKeys(config.getProperty("State"));
		driver.findElement(By.xpath(" //input[@placeholder='Enter your country..']")).sendKeys(config.getProperty("Country"));
		driver.findElement(By.xpath("//input[@placeholder='Enter zipcode..']")).sendKeys(config.getProperty("Zipcode"));
	}
	
	public void BillingAddres() {
		driver.findElement(By.xpath(" (//textarea[@class='form-control'])[2]")).sendKeys(config.getProperty("Addressbilling"));
		driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]")).sendKeys(config.getProperty("City"));
		driver.findElement(By.xpath("//input[@placeholder='Enter your state..']")).sendKeys(config.getProperty("State"));
		driver.findElement(By.xpath("(//input[@placeholder='Enter your City..'])[2]")).sendKeys(config.getProperty("Country"));
		driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode..']")).sendKeys(config.getProperty("Zipcode"));
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(config.getProperty("Password"));
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(config.getProperty("ConfirmPassword"));
	}
	
	public void submit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

public boolean msgregi() {
	boolean msg=driver.findElement(By.xpath(config.getProperty("First Name"))).isDisplayed();
	return msg;
}

}
