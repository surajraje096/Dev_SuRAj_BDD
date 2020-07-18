package Com.Easyshoppy.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Com.Easyshoppy.qa.TestBase.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public String currenturl() {
		String currenturl=driver.getCurrentUrl();
		return currenturl;
	}

	public String Tital() {
		String Tital=driver.getTitle();
		return Tital;
	}
	public boolean logo() {
		boolean logo=driver.findElement(By.xpath(config.getProperty("logo"))).isDisplayed();
		return logo;
	}
	
	public void  product() {
	List<WebElement>list=driver.findElements(By.xpath(config.getProperty("product")));
	System.out.println(list.size());

	}
	public boolean productlink() {
		boolean prolink=driver.findElement(By.xpath(config.getProperty("productlist"))).isDisplayed();
		return prolink;
	}
	public boolean singupBtn() {
		boolean sbtn=driver.findElement(By.xpath(config.getProperty("singup"))).isDisplayed();
		return sbtn;
	}
	public SingUpPage ClicksingupBtn() {
		driver.findElement(By.xpath(config.getProperty("singup"))).click();
		return new SingUpPage();
	}
	public boolean LoginBtn() {
		boolean sinup =driver.findElement(By.xpath(config.getProperty("login"))).isDisplayed();
		return sinup;
	}
	public LoginPage clickLoginBtn() {
		driver.findElement(By.xpath(config.getProperty("login"))).click();
		return new LoginPage();
	}
}
