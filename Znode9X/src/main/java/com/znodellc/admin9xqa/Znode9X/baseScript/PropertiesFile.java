package com.znodellc.admin9xqa.Znode9X.baseScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PropertiesFile extends ManageDrivers{

	public Properties Repository = new Properties();
	public File file;
	public FileInputStream fileInputStream;
	
	public void loadPropertiesFile() throws Exception
	{
		file = new File(System.getProperty("user.dir")+".//pageLibrary//loginPage.properties");
		fileInputStream = new FileInputStream(file);
	}
	
	public static WebElement getLocator(String locator) throws Exception
	{
		String locatorType = locator.split("_")[0];
		String locatorValue = locator.split("_")[1];
		
		if(locatorType.toLowerCase().equals("id"))
		{
			return driver.findElement(By.id(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("name"))
		{
			return driver.findElement(By.name(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("classname"))
		{
			return driver.findElement(By.className(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("tagname"))
		{
			return driver.findElement(By.tagName(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("linktext"))
		{
			return driver.findElement(By.linkText(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("partiallinktext"))
		{
			return driver.findElement(By.partialLinkText(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("cssselector"))
		{
			return driver.findElement(By.cssSelector(locatorValue));
		}
		else if (locatorType.toLowerCase().equals("xpath"))
		{
			return driver.findElement(By.xpath(locatorValue));
		}
		else
		{
			throw new Exception("Unknown locator type '" + locatorType + "'" );
		}
	}
	
	public WebElement getWebElement(String locator) throws Exception
	{
		return getLocator(Repository.getProperty(locator));
	}
}
