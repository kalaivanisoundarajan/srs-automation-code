package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	private static final Utils UTILS = new Utils();
	public WebDriver webDriver;
	
	public void initialize(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
	
	
	
	public void wait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void hoverAndClick(String hoverer, String element) {
		// declare new Action
		Actions actions = new Actions(webDriver);		

		// Iterate through the WebElements from the Array
		for (String menu : hoverer.split("-->")) {
			// hover each of them			
			actions.moveToElement(webDriver.findElement(By.partialLinkText(menu))).build().perform();
		}
		// finally click the WebElement to click at
		webDriver.findElement(By.linkText(element)).click();

	}

	
	public boolean isElementDisplayed(WebElement element) {
		 wait(2);
		 return element.isDisplayed();
	}
	
	
	 /**
     * @return - webDriver
     */
    public WebDriver getDriver() {
        return webDriver;
    }

    /**
     * @return driver class instance
     */
    public static Utils getInstance() {
        return UTILS;
    }

    public Object clone()
            throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
