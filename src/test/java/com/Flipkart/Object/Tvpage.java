package com.Flipkart.Object;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Resources.CommonActions;

public class Tvpage extends CommonActions {
	public Tvpage (){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement loginclick;
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement search;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchclick;
	
	@FindBy(xpath ="(//div[@class='_4rR01T'])[1]")
	private WebElement Tvclick;
	
	@FindBy(xpath ="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement Addtocart;
	
	@FindBy(xpath ="//span[contains(text(),'Place Order')]")
	private WebElement placeorder;

	public WebElement getLoginclick() {
		return loginclick;
	}

	
	public WebElement getSearch() {
		return search;
	}

	
	public WebElement getSearchclick() {
		return searchclick;
	}


	public WebElement getTvclick() {
		return Tvclick;
	}

	

	public WebElement getAddtocart() {
		return Addtocart;
	}

	

	public WebElement getPlaceorder() {
		return placeorder;
	}

	
}

	