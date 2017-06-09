package com.znodellc.admin9xqa.Znode9X.keywords;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class Calender extends PropertiesFile {
	
	public static void selectDate(String inputDate, String locator)
	{
		 Date d = new Date(inputDate);
		 SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM/dd/yyyy");
		 String date = dateFormat.format(d);
		 
		 String[] split = date.split("/");
		 
		 String month = split[0]+" "+split[2];
		 
		 while(true){
			 try
			 {
				 driver.findElement(By.xpath("//*[contains(text(),'"+month+"')]")).isDisplayed();
				 String firstPart = ".//*[@id='ProductAttribute']";
				 String secondPart = "']/div";
				 String[] splitDate = inputDate.split("/");
				 String finalPart = firstPart+splitDate[0]+"_"+splitDate[2]+secondPart;
				 driver.findElement(By.xpath(finalPart)).click();
				 break;
				 
			 }
			 catch(Exception e)
			 {
				 driver.findElement(By.xpath("//th[@class='next']"));
			 }
		 }
	}

}
