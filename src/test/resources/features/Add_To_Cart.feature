@REGRESSION 
@SMOKE 
Feature: Add to Cart 

@Add_to_Cart 
Scenario: Add a Product to Cart in https://www.bigbasket.com/ 
	Given user navigates to "https://www.bigbasket.com/" 
	When user navigates to Green Tea section 
	And user search for Tea Brand 
	And user selects first and last brands 
	And user get count of products listed in the View 
	And user get the price first product from the View 
	And user change quanity for adding item to cart 
		|Quantity|
		|2|
	Then verify success banner message
	When user click on My Basket link
	Then verify product is added successfully 
	And verify product price is updated successfully on Summary items