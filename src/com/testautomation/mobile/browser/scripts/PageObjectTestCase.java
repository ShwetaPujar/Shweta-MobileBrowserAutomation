package com.testautomation.mobile.browser.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.utility.BrowserUtility;
import com.testautomation.mobile.browser.pages.PageObjectPage1;
import com.testautomation.mobile.browser.pages.PageObjectPage2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectTestCase {

	@Test
	 public void pageObjectTestCase() {
	  AppiumDriver<WebElement> driver=BrowserUtility.setup_Android();
	  try {
	   Thread.sleep(3000);
	   PageObjectPage1 pageObjectPage1=new PageObjectPage1(driver);
	   pageObjectPage1.clickonX();
	   PageObjectPage2 pageObjectPage2= new PageObjectPage2(driver);
	   pageObjectPage2.enterLoginData();
	   driver.quit();
	  } catch (InterruptedException e) {
	   e.printStackTrace();
	  }
	 }

	}

