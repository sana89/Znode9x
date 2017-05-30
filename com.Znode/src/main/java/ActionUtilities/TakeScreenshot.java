package ActionUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeScreenshot {
	
	
	public static void TakeScrSht(String file) throws IOException
	{
		WebDriver driver= ManageDrivers.GetDriver();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File fs = new File(".//Screenshots//"+file+".jpg");
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, fs);
		System.out.println("Screenshot Taken");
	}

}
