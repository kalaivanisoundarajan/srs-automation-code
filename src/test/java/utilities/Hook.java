package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	private WebDriver webDriver;

	private Utils utils = Utils.getInstance();

	public static final String CHROME_DRIVER = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_PATH = "./src/test/resources/browser_drivers/chromedriver.exe";

	@Before
	public void launchBrowser() {
		System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();		
		utils.initialize(webDriver);

	}

	@After
	public void destoryDriver() {
		webDriver.close();
	}

}
