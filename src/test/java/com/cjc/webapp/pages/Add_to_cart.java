package com.cjc.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_to_cart {


WebDriver driver;
	
	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.search-results > div.product-grid > div > div > div.details > div.add-info > div.buttons > input")
	WebElement add;
	
	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.search-results > div.product-grid > div > div > div.details > div.add-info > div.buttons > input")
	WebElement addTcart;
	
	
	public Add_to_cart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addCart()
	{
		add.click();

		addTcart.click();
	}

}
