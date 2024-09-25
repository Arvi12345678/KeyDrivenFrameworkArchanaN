package com.cjc.webapp.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Address {

	WebDriver driver;
	
		
	
	
	@FindBy(name="BillingNewAddress.FirstName")
	WebElement fname;
	
	@FindBy(name="BillingNewAddress.LastName")
	WebElement lname;
	
	@FindBy(name="BillingNewAddress.Email")
	WebElement Eemail;
	
	@FindBy(name="BillingNewAddress.Company")
	WebElement company;
	
	@FindBy(name="BillingNewAddress.CountryId")
	WebElement coun;
	
	@FindBy(name="BillingNewAddress.City")
	WebElement city;
	
	@FindBy(name="BillingNewAddress.Address1")
	WebElement Aadd1;
	
	@FindBy(name="BillingNewAddress.Address2")
	WebElement Badd2;
	
	@FindBy(name="BillingNewAddress.ZipPostalCode")
	WebElement zip;
	

	@FindBy(name="BillingNewAddress.PhoneNumber")
	WebElement phone;
	
	@FindBy(name="BillingNewAddress.FaxNumber")
	WebElement fax;
	

	
	public Address(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void setData() throws IOException
	{System.out.println("Hello");
	
	FileInputStream  fs=new FileInputStream("A:\\Programs\\KeywordDrivenFramework1\\src\\test\\resources\\xlsx\\kk.xlsx");
	
	XSSFWorkbook  wb=new XSSFWorkbook(fs);	
	XSSFSheet sheet =wb.getSheet("Address");
	XSSFRow row=sheet.getRow(1);
	
	XSSFCell fn=row.getCell(0);
	XSSFCell ln=row.getCell(1);
	XSSFCell email=row.getCell(2);
	XSSFCell comp=row.getCell(3);
	XSSFCell country=row.getCell(4);
	XSSFCell city1=row.getCell(5);
	XSSFCell add1=row.getCell(6);
	XSSFCell add2=row.getCell(7);
	
	String name=fn.getStringCellValue();
	String last=ln.getStringCellValue();
	String mail=email.getStringCellValue();
	String company1=comp.getStringCellValue();
	String country1=country.getStringCellValue();
	String city2=city1.getStringCellValue();
	String fadd1=add1.getStringCellValue();
	String fadd2=add2.getStringCellValue();
	
	
	fname.sendKeys(name);
	lname.sendKeys(last);
	Eemail.sendKeys(mail);
	company.sendKeys(company1);
	coun.sendKeys(country1);
	city.sendKeys(city2);
	Aadd1.sendKeys(fadd1);
	Badd2.sendKeys(fadd2);
	
	zip.sendKeys("201304");
	phone.sendKeys("9881756808");
	fax.sendKeys("201308");
	
	
	}}