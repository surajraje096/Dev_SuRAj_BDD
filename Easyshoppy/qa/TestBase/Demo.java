package Com.Easyshoppy.qa.TestBase;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

public class Demo extends TestBase{

	@Test
	public void singup() throws IOException {
		init();
	
		driver.findElement(By.xpath(config.getProperty("FirstName"))).sendKeys(config.getProperty("FirstName"));
		driver.findElement(By.xpath(config.getProperty("LastName"))).sendKeys(config.getProperty("LastName"));
		driver.findElement(By.xpath(config.getProperty("EmailId"))).sendKeys(config.getProperty("EmailId"));
		driver.findElement(By.xpath(config.getProperty("PhoneNumber"))).sendKeys(config.getProperty("PhoneNumber"));
	
	}
}
