package com.testautomation.mobile.browser.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/*This Class is used to click on "Getting Started" button in the Home Page */
public class PageObjectPage1 extends BasePage{

	public PageObjectPage1(AppiumDriver<WebElement> driver) {
		   
		super(driver);
		  
	}
		 
	
	@FindAll(@FindBy(className="android.view.View"))
	
	private List<WebElement>buttons;;
	
	
	public void clickonX() throws InterruptedException {
		 
		
		try {
			for ( int i=0; i<buttons.size();i++){
			    WebElement button= buttons.get(i);
			    
			    if (button.getText()=="Getting Started"){
			        button.click();
			       
			    }         
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Clicked");
		 Thread.sleep(500);

	 
	 }

}	

