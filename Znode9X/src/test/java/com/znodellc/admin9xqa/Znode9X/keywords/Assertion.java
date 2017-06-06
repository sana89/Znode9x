package com.znodellc.admin9xqa.Znode9X.keywords;

import org.testng.Assert;

import com.znodellc.admin9xqa.Znode9X.baseScript.PropertiesFile;
import com.znodellc.admin9xqa.Znode9X.utilities.ExcelWrite;

public class Assertion {
	
	public static void validateSuccesMsg(String step,String locator, String testdata1) throws Exception
	{
		int stepNo = Integer.parseInt(step);
		String actRes = PropertiesFile.getLocator(locator).getText();
		ExcelWrite.WriteTheExcel(actRes, stepNo);
		
		try
		{
			Assert.assertEquals(testdata1, actRes);
			ExcelWrite.WriteTheExcel( "Pass", stepNo);
		}
		catch(AssertionError er)
		{
			ExcelWrite.WriteTheExcel( "Fail", stepNo);
		}
	}

}
