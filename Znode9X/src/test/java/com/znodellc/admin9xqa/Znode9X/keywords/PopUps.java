package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.Alert;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class PopUps extends PropertiesFile {
	
	public static void acceptPopUps()
	{
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}
	
	public static void dismissPopUps()
	{
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
	}
	
	public static void getTextPopUps()
	{
		Alert alert = driver.switchTo().alert();
		
		alert.getText();
	}
}
