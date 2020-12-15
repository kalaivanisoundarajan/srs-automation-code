package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.Utils;

public class MasterPage {

	public WebDriver webDriver;
	public Utils utils;
	
	 public MasterPage() {
	        utils = Utils.getInstance();
	        webDriver = utils.getDriver();
	        PageFactory.initElements(webDriver, this);
	       
	    }

}
