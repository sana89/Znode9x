package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class SelectOneOfMultipleElements extends PropertiesFile {
	
	public static void selectLocator()
	{
		System.out.println(1);
		
		 WebElement element = driver.findElement(By.xpath("(//i[@class='z-delete'])[1]"));
		String elementName = element.getText();
	       System.out.println(elementName);
		System.out.println(2);
		
	   
	}

}
