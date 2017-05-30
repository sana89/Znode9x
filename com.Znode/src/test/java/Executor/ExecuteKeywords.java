package Executor;

import ActionUtilities.ManageDrivers;
import ActionUtilities.TakeScreenshot;

public class ExecuteKeywords {
	
	public static void ExecuteTheKeywords(String testCase, String stepNumber,String testStep, String keyword, String Locator, String TestData1,String TestData2,String TestData3,String TestData4,String output) throws Exception
	{
		System.out.println("Executing step "+"-----"+testCase+"----"+stepNumber +"------"+testStep+"-----------");
        
		
		switch(keyword)
		{
		
		case "LaunchBrowser":
			ManageDrivers.OpenUrl(TestData2, TestData1, TestData3, TestData4);
			break;
		
			/*
		case "CloseBrowser":
		    closeBrowser.closeTheBrowser();
		    break;
			
		case "EnterText":
		    SendText.SendTheText(Locator,TestData1);
		    break;
		
		case "Click":
		    click.clickTheButton(Locator);
		    break;	
		    
		case "OpenSession":
		    openSession.openTheSession(TestData1);
		    break;
		    
		    
		case "GetText":
		    getText.getTheText(Locator,stepNumber);
		    break;
		    
		case "TakeScreenshot":
		    TakeScreenshot.TakeScrSht(testCase+" "+TestData1);
		    break;
		    
		    
		case "AddPartLine":
			AddLine.AddTheLine(TestData1,TestData2,TestData3);
		    break;
		    
		case "Drag":
			drag.dragit();
		    break;
		    
		case "GetTheMauc":
		    getMauc.gettheMAUC(stepNumber, TestData1, TestData2,TestData4);
		    break;
		    
		case "Wait":
		   Keywords.wait.waitForTime(TestData1);
		    break;
		    
		case "GetFinTransAmt":
			 getFinTransAmt.getFinTransAmount(stepNumber, TestData1, TestData2, TestData3, TestData4, "17");
			    break;
		    */
		    default:
		    	System.out.println("Invalid step");
		    	
		    	
			
		    	
	
		}
	}

}
