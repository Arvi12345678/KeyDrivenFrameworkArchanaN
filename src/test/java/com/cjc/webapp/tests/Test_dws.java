package com.cjc.webapp.tests;

import java.io.IOException;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cjc.webapp.pages.Add_to_cart;
import com.cjc.webapp.pages.Address;
import com.cjc.webapp.pages.Buttons;
import com.cjc.webapp.pages.Registration;
import com.cjc.webapp.pages.Search_Product;

public class Test_dws {


	WebDriver driver;

static	Logger log=Logger.getLogger(Test_dws.class.getName());
	@BeforeSuite
	public void openBrowser()
	{
	
		System.setProperty("webdriver.chrome.driver", "A:\\Exe 125\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("openBrowser");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	@BeforeTest
	public void getUrl()
	{
		driver.get("https://demowebshop.tricentis.com/register");	
	
	}
	
	@BeforeClass
	public void maxWindow()
	{
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void getCookie()
	{
		Set<Cookie>c=driver.manage().getCookies();
		System.out.println(c.size());
		
		
	}

	@Test(priority=1)//Properties file through
	public void regPage() throws IOException, InterruptedException       
	{
		Registration r=PageFactory.initElements(driver,Registration.class);
		r.checkReg();
	}
	
	@Test(priority=2 ,dataProvider="getData" )
	public void searchBook(String book)
	{
		Search_Product sp=PageFactory.initElements(driver,Search_Product.class);
		sp.searchP(book);
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=3)
	public void addTo()
	{
		
		Add_to_cart ac=PageFactory.initElements(driver, Add_to_cart.class);
		ac.addCart();
	}
	@Test(priority=4)
	public void getButtons()
	{
		Buttons bt=PageFactory.initElements( driver,Buttons.class);
		bt.Button1();
		
	}
	
	@Test(priority=5)
	
	public void getAdd() throws IOException   //xlsx
	{
		Address ad=PageFactory.initElements(driver, Address.class);
		ad.setData();
	}
	
	
	@AfterMethod
	public void ss()
	{
		log.info("get ScreenShot");
	}
	@AfterClass
	public void deleteCookie()
	{
		driver.manage().deleteAllCookies();
		log.error("Delete Cookie");
	}
	
	@AfterTest
	public void db()
	{
		log.fatal("close db connec");
	}
	
	@DataProvider
	public Object[][]  getData()
	{
		return new Object[][] {
			
			new Object[] {"health book"}
			
		
			
		};
	}
	


}

