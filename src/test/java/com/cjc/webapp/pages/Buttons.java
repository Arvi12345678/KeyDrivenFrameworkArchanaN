package com.cjc.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons {

	WebDriver driver;
	public Buttons(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	@FindBy(css="#topcartlink > a > span.cart-label")
	WebElement scart;
	

	@FindBy(name="termsofservice")
	WebElement cbox;
	
	@FindBy(name="checkout")
	WebElement chkout;
	

	@FindBy(css="body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.new-wrapper.checkout-as-guest-or-register-block > div.buttons > input.button-1.checkout-as-guest-button")
	WebElement checkasguest;

	public void Button1()
	{
		
		scart.click();
		cbox.click();
		chkout.click();
		checkasguest.click();
		
		
	}

}
