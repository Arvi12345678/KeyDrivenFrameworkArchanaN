package com.cjc.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
	WebDriver driver;
	public Payment(WebDriver driver)
	{
		super();
		this.driver=driver;
	}
	@FindBy(css="#billing-buttons-container > input")
	WebElement continue1 ;
	

}
