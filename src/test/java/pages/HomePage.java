package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MasterPage {

	public HomePage() {
		super();
	}
	
	
	@FindBy(xpath="//*[@class='close-btn']")
	public WebElement closeBanner;
	
	//linkText, partialLinkText seems not working 
	@FindBy(xpath="//a[contains(text(),'Shop by Category')]")
	public WebElement shopByCategory;
	
	@FindBy(xpath="//span[@qa='subTotalMB']")
	public WebElement cartSubTotal;
	
	@FindBy(xpath="//a[@qa='myBasket']")
	public WebElement myBasket;
	
	@FindBy(xpath="//div[contains(text(),'Successfully added')]")
	public WebElement successfulBanner;
	
	
	@FindBy(xpath="(//div[@qa='product'])[1]//button[@qa='add']")
	public WebElement firstProdcutAdd;
	
	@FindBy(xpath="(//div[@qa='product'])[1]//div[@qa='product_name']/a")
	public WebElement firstProductName;
	
	@FindBy(xpath="(//div[@qa='product'])[1]//span[@class='discnt-price']/span")
	public WebElement firstProdctPrice;
	
	@FindBy(xpath="(//div[@qa='product'])[1]//input[@ng-model='vm.startQuantity']")
	public WebElement firstProdQuanity;
	
	@FindBy(xpath="//input[@value='Search by Brand']")
	public List<WebElement> searchBrands;
	
	@FindBy(xpath="//span[@ng-bind='brand.display_name']")
	public List<WebElement> teaBrands;
	
	@FindBy(xpath="//div[@qa='product']")
	public List<WebElement> products;
	
	@FindBy(xpath="//a[@ng-bind='cartItem.description']")
	public WebElement prodDescIncart;
	
	
}
