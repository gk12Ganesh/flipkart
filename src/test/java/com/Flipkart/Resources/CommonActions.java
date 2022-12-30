package com.Flipkart.Resources;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
public static WebDriver driver;
	
	public void URL (String url){
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	 public void windowsh (){
		 String parent = driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
		 for (String x : child) {
			 if(!parent.equals(x)){
				 driver.switchTo().window(x);
			 }}}
	 
	 public void inserttextjs (WebElement element , String value){
		 element.sendKeys(value);
	 }

}
