package com.cjc.webapp.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common {

public static WebDriver driver;
//public static Properties pro=new Properties();
public static FileInputStream fis;
public static XSSFWorkbook wb;
public static XSSFSheet sheet;
public static XSSFRow row;
public static XSSFCell cell;


public static FileInputStream fineCall() throws IOException//didn't took this in test class if you have to take then remove checkasguest from buttons class.
{
	fis=new FileInputStream("A:\\Programs\\KeywordDrivenFramework1\\src\\test\\resources\\xlsx\\kk.xlsx");
return fis;


}
public static String username() throws IOException 
{
	
	fis=new FileInputStream("A:\\Programs\\KeywordDrivenFramework1\\src\\test\\resources\\xlsx\\kk.xlsx");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet("Login");
	row=sheet.getRow(1);
	cell=row.getCell(0);
	String username=cell.getStringCellValue();
	return username;



}
public static String password() throws IOException
{
	fis=new FileInputStream("A:\\Programs\\KeywordDrivenFramework1\\src\\test\\resources\\xlsx\\kk.xlsx");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet("Login");
	row=sheet.getRow(2);
	cell=row.getCell(0);
	String pass=cell.getStringCellValue();
	return pass;


}


}
