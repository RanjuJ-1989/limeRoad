package com.StepDefinition;

import com.Base.BaseClass;
import com.Pom.PomClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends BaseClass{

	PomClass pom = new PomClass();
	
	@When("User Clicks url {string}")
	public void user_clicks_url(String string) {
		url(string);
	}
	
	@And("User click login")
	public void user_click_login() {
		ClickOnElement(pom.getLogin());
	}
	
	@And("User enter MobileNumber {string}") 
	public void user_enter_mobileNumber(String string) {
		implicityWait(5);
		inputValues(pom.getMobileNum(), string);
		
	}
	
	@Then("User click next")
	public void user_click_next() {
		ClickOnElement(pom.getClickNext());
	}
	
//	@And("User clicks on shop men")
//	public void user_clicks_on_shop_men()  {
////		Thread.sleep(3000);
//		ClickOnElement(pom.getShop_Men());
//	}
	
	@And("User Mouseover on Men")
	public void user_mouseover_on_men() throws Exception {
//		Thread.sleep(5);
		implicityWait(5);
		 action();
		 movetoelement(pom.getSelectMen());
	}
	
	@And("User picks Suit Blazer")
	public void user_picks_suit_blazer() throws Exception {
//		Thread.sleep(5);
		implicityWait(5);
		ClickOnElement(pom.getTopWearItem());
	}
	
	@And("User selects wished item")
	public void user_selects_wished_item() throws Exception {
//		Thread.sleep(5);
		implicityWait(5);
//		scrollUpDown(0,1000);
		ClickOnElement(pom.getWishedItem());
	}
	
//	@And("User select Medium size of the Suit Blazer")
//	public void user_select_medium_size_of_the_suit_blazer() throws Exception {
////		Thread.sleep(5);
//		implicityWait(5);
//		ClickOnElement(pom.getSelectsize_M());
//	}
	
	@And("User select Large size of the Suit Blazer")
	public void user_select_large_size_of_the_suit_blazer() throws Exception {
		Thread.sleep(5);
//		implicityWait(5);
		ClickOnElement(pom.getSelectsize_L());
	}
	
	@And("User click on Add to cart")
	public void user_click_on_add_to_cart() throws Exception {
		implicityWait(5);
		ClickOnElement(pom.getItemAdded());
		Thread.sleep(5);
		
	}
	
	
//	
//	@And("User select XL size of the Suit Blazer")
//	public void user_select_xl_size_of_the_suit_blazer() throws Exception {
//		Thread.sleep(5);
////		implicityWait(5);
//		ClickOnElement(pom.getSelectsize_XL());
//	}
}

