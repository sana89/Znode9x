package com.znodellc.admin9xqa.Znode9X.keywords;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;
import com.znodellc.admin9xqa.Znode9X.utilities.ConvertDataType;
import com.znodellc.admin9xqa.Znode9X.utilities.ExcelWrite;

public class IsDisplayed {
	
	public static void visibleElement(String step,String locator) throws Exception
	{
		int stepNo = ConvertDataType.getNumber(step);
		System.out.println(stepNo);
		WebElement element = PropertiesFile.getLocator(locator);
		Boolean result = element.isDisplayed();
		System.out.println(result);
		int steps = stepNo-2;
		
		if(result==true)
		{
		String actRes = PropertiesFile.getLocator(locator).getText();
		System.out.println(actRes);
		ExcelWrite.WriteTheExcel(actRes, steps, 8);
		System.out.println(actRes);
		}
		else
		{
			System.out.println("Element is not Visible");
		}
		
		try
		{
			System.out.println(result);
			Assert.assertTrue(result);
			ExcelWrite.WriteTheExcel( "Pass", steps, 9);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", steps, 9);
		}
		
	}

}
