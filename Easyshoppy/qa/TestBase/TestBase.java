package Com.Easyshoppy.qa.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Com.Easyshoppy.qa.Util.ExcelReader;
import Com.Easyshoppy.qa.Util.TestConfig;

import Com.Easyshoppy.qa.Util.testUtil;

public class TestBase {

	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver = null;
	public static FileInputStream fis;

	public static Logger app_logs = Logger.getLogger("devpinoyLogger");

	public void init() throws IOException {
		if (driver == null) {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Com\\Easyshoppy\\qa\\Config\\config.properties");
			config.load(fis);

			app_logs.debug("Loading config property file");

			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");

				System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrome83\\chromedriver.exe");
				driver = new ChromeDriver(options);

			} else if (config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Java standard files\\latest selenium jar\\ChromeWebDrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (config.getProperty("browser").equals("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Java standard files\\latest selenium jar\\ChromeWebDrivers\\IEDriver.exe");
				driver = new InternetExplorerDriver();
			}

			app_logs.debug("Launching browser");
			driver.get(config.getProperty("testsite"));
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(90L, TimeUnit.SECONDS);

		}
	}

}