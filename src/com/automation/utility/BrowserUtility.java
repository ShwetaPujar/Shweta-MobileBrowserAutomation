
/*This Class is used to initialize the desired capabilties to launch the browser on the mobile device, to UDID must be changed to run on the particular mobile device */
package com.automation.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserUtility {

	public static AppiumDriver<WebElement> setup_Android() 
	{
		AppiumDriver<WebElement> driver=null;
		try {
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"c752b874");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		cap.setCapability("noReset", "true");
		
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			driver.get("https://www.lsac.org/lsat-prep-get-familiar");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
	}
		


}
