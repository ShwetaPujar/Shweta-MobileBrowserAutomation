package com.testautomation.mobile.browser.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
/*This Class is used to Enter the login username and password and Sign In on the login page */
public class PageObjectPage2 extends BasePage{

	public PageObjectPage2(AppiumDriver<WebElement> driver) {
		   super(driver);
		  }
		 //@FindBy(xpath= "//input[@id = 'logonIdentifier']")
	     @FindBy(id="logonIdentifier")
		 private WebElement username;
	     @FindBy(id="password")
	     private WebElement password;
	     
	     @FindBy(id="next")
	     private WebElement SignIn;
	     
		 public void enterLoginData() throws InterruptedException {
		  username.sendKeys("Test123");
		  password.sendKeys("Test");
		  SignIn.click();
		  ;
		 }
		}




