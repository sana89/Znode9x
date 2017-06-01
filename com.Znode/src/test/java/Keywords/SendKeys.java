package Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import ActionUtilities.ManageDrivers;

public class SendKeys extends ManageDrivers {
	
	public static void sendText(String locator, String value)
	{
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}

}
