/*This is the Base Class which is used to initialize the elements using PageFactortry and this class is extended by all the other Page Class*/
package com.testautomation.mobile.browser.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	 protected AppiumDriver<WebElement> driver;
	 public BasePage(AppiumDriver<WebElement> driver2) {
	  this.driver = driver2;
	  PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	 }
	}