package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.znodellc.admin9xqa.Znode9X.baseScript.ManageDrivers;
import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class Click extends PropertiesFile {
	public static void clickAction(String locator) throws Exception
	{
		PropertiesFile propertyFile = new PropertiesFile();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(locator)).click();
		propertyFile.getWebElement(locator).click();
		
		
	}
}
