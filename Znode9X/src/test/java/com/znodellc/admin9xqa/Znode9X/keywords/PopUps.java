package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;

public class PopUps extends PropertiesFile {
	
	public static void confirmPopUp(String locator) throws Exception
	{
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		PropertiesFile.getLocator(locator).click();
	}
	
//	public static void acceptPopUps() throws InterruptedException
//	{
//		    WebDriverWait wait = new WebDriverWait(driver, 2);
//		    wait.until(ExpectedConditions.alertIsPresent());
//		
//		Alert alert = driver.switchTo().alert();
//		
//		getTextPopUps();
//		
//		alert.accept();
//		
//	}
//	
//	public static void dismissPopUps()
//	{
//		Alert alert = driver.switchTo().alert();
//		
//		alert.dismiss();
//	}
//	
//	public static void getTextPopUps()
//	{
//		Alert alert = driver.switchTo().alert();
//		
//		String alertMessage = alert.getText();
//		
//		System.out.println(alertMessage);
//	}
}
