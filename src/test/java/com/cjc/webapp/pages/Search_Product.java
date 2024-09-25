package com.cjc.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Product {

	
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement search;
	
	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.search-box > form > input.button-1.search-box-button")
	WebElement cl;
	
	
	public Search_Product(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchP(String book)
	{
		
		search.sendKeys("blue jeans");
		cl.click();
		
		
		
		
	}

}
