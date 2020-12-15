package stepdefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import utilities.Utils;

public class HomePageStepDefs {

	protected Utils utils;
	protected WebDriver webDriver;

	HomePage homePage = new HomePage();
	
	String firstProQuantity;

	public HomePageStepDefs() {
		utils = Utils.getInstance();
		webDriver = utils.getDriver();
	}

	@Given("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) {
		webDriver.navigate().to(url);
		utils.wait(5);
		homePage.closeBanner.click();
	}

	@When("^user navigates to Green Tea section$")
	public void user_navigates_to_Green_Tea_section() {
		// Write code here that turns the phrase above into concrete actions
		homePage.shopByCategory.click();
		utils.hoverAndClick("Beverages-->Tea", "Green Tea");
		utils.wait(2);
	}

	@When("^user search for Tea Brand$")
	public void user_search_for_Tea_Brand() {
		// Write code here that turns the phrase above into concrete actions
		homePage.searchBrands.get(0).click();
	}

	@When("^user selects first and last brands$")
	public void user_selects_first_and_last_brands() {
		// Write code here that turns the phrase above into concrete actions

		List<WebElement> checkboxes = new ArrayList<WebElement>();
		for (WebElement checkbox : homePage.teaBrands) {

			if (checkbox.isDisplayed())
				checkboxes.add(checkbox);

		}

		homePage.teaBrands.get(0).click();

		utils.wait(2);

		homePage.teaBrands.get(checkboxes.size() - 1).click();

		utils.wait(2);
	}

	@When("^user get count of products listed in the View$")
	public void user_get_count_of_products_listed_in_the_View() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("List of products:::" + homePage.products.size());
	}

	@When("^user get the price first product from the View$")
	public void user_get_the_price_first_product_from_the_View() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("First product price::"+ homePage.firstProdctPrice.getText());
	}

	@When("^user change quanity for adding item to cart$")
	public void user_change_quanity_for_adding_item_to_cart(List<Map<String, String>> data) {
		firstProQuantity = data.get(0).get("Quantity");
		homePage.firstProdQuanity.clear();
		homePage.firstProdQuanity.sendKeys(data.get(0).get("Quantity"));
	}

	@Then("^verify success banner message$")
	public void verify_success_banner_message() {
		// Write code here that turns the phrase above into concrete actions
		utils.wait(2);
		org.junit.Assert.assertTrue("No successful message", homePage.successfulBanner.isDisplayed());
	}

	@When("^user click on My Basket link$")
	public void user_click_on_My_Basket_link() {
		// Write code here that turns the phrase above into concrete actions
		utils.wait(2);
		homePage.myBasket.click();
	}

	@Then("^verify product is added successfully$")
	public void verify_product_is_added_successfully() {
		// Write code here that turns the phrase above into concrete actions
		utils.wait(2);
		org.junit.Assert.assertTrue("Product didn't to Basket", homePage.prodDescIncart.getText().contains(homePage.firstProductName.getText().trim()));
	}

	@Then("^verify product price is updated successfully on Summary items$")
	public void verify_product_price_is_updated_successfully_on_Summary_items() {
		
		int quantity = Integer.parseInt(firstProQuantity);
		
		double prodPrice = Integer.parseInt(homePage.firstProdctPrice.getText());
		
		org.junit.Assert.assertEquals("Cart price mis-match", prodPrice*quantity, Double.parseDouble(homePage.cartSubTotal.getText()));
		
		
		
		
		
		
	}

}
