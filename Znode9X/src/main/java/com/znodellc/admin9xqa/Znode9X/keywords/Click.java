package com.znodellc.admin9xqa.Znode9X.keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.znodellc.admin9xqa.Znode9X.baseScript.ManageDrivers;

public class Click extends ManageDrivers {
	public static void clickAction(String locator)
	{
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(locator)).click();
		
		
	}
}
