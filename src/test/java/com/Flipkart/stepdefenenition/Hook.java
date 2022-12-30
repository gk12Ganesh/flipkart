package com.Flipkart.stepdefenenition;

import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends CommonActions{
	
	CommonActions co = new CommonActions ();
	
@Before
	
	public void beforescen (){
		co.URL("https://www.flipkart.com/");
	
		
	}
	@After
	
	public void afterscen (){
		
//		driver.quit();

}

}
