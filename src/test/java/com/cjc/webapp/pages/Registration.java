package com.cjc.webapp.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Registration 
{
		WebDriver driver;
			
			
			@FindBy(name="Gender")
			WebElement gen;
			
			@FindBy(name="FirstName")
			WebElement fname;
			
			@FindBy(name="LastName")
			WebElement lname;
			
			@FindBy(name="Email")
			WebElement email;
			
			@FindBy(name="Password")
			WebElement pass;
			
			@FindBy(name="ConfirmPassword")
			WebElement cpass;
			
			@FindBy(name="register-button")
			WebElement reg;
			
			
			public Registration(WebDriver driver)
			{
				this.driver=driver;
			}
			
			public void checkReg() throws InterruptedException, IOException 
			{
				FileInputStream fs=new FileInputStream("A:\\Programs\\KeywordDrivenFramework1\\src\\test\\resources\\xlsx\\kk.xlsx");//xcell path
				
				XSSFWorkbook  wb=new XSSFWorkbook(fs);	
				XSSFSheet sheet =wb.getSheet("Registration");
				XSSFRow row=sheet.getRow(1);
				
				XSSFCell fn=row.getCell(0);
				XSSFCell ln=row.getCell(1);
				XSSFCell em=row.getCell(2);
				XSSFCell pass1=row.getCell(3);
				XSSFCell conpass=row.getCell(4);
				
				String f=fn.getStringCellValue();
				String l=ln.getStringCellValue();
				String mail=em.getStringCellValue();
				String pss=pass1.getStringCellValue();
				String cps=conpass.getStringCellValue();
				
				
			
				gen.click();
				fname.sendKeys(f);
				lname.sendKeys(l);
				email.sendKeys(mail);
				pass.sendKeys(pss);
				Thread.sleep(10);
				cpass.sendKeys(cps);
				reg.click();
				
			}
}
