package com.Flipkart.stepdefenenition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Flipkart.Object.Tvpage;
import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class Tvpurchase extends CommonActions {

	CommonActions co = new CommonActions();
	
	Tvpage t = new Tvpage();
 
   	
	@Given("user launching URL")
	public void user_launching_URL() {

	}

	@Given("user login flipkart")
	public void user_login_flipkart() {
    t.getLoginclick().click();

	}
    String names;
	@When("user search the tv")
	public void user_search_the_tv() {
			
		names = "thomson tv";
       co.inserttextjs(t.getSearch(), names);
       t.getSearchclick().click();
			}

	@When("user select the tv")
	public void user_select_the_tv() {
		t.getTvclick().click();

	}

	@When("user add to cart the tv")
	public void user_add_to_cart_the_tv() throws Throwable {
		co.windowsh();
		Thread.sleep(3000);
       WebElement element = t.getAddtocart();
       element.click();
//		if (element.isDisplayed()) {
//			element.click();
//		} else {
//			System.err.println("out of stock");
//		}
	}

	@Then("user place order")
	public void user_place_order() {
		System.out.println("out of stock");
		t.getPlaceorder().click();

	}
   
	@When("user search the tv using oneD list")
	public void user_search_the_tv_using_oneD_list(io.cucumber.datatable.DataTable dataTable) {
	 List<String> data = dataTable.asList();
	 names = data.get(1);
	 co.inserttextjs(t.getSearch(), names);
     t.getSearchclick().click();
	}

	@When("user search the tv using oneD map")
	public void user_search_the_tv_using_oneD_map(io.cucumber.datatable.DataTable dataTable) {
		 Map<String, String> data1 = dataTable.asMap(String.class, String.class);
		 names = data1.get("TV1");
		 co.inserttextjs(t.getSearch(), names);
	     t.getSearchclick().click();

	}

	@When("user search the tv {string}")
	public void user_search_the_tv(String string) {
		
		names = string;
		 co.inserttextjs(t.getSearch(), names);
	     t.getSearchclick().click();
		

	}

}
