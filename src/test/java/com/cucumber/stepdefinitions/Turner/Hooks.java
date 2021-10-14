package com.cucumber.stepdefinitions.Turner;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.cucumber.listener.Reporter;


import Utilities.CLEAR_User_Function;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CLEAR_User_Function
{
	static Logger log = Logger.getLogger(Hooks.class);
	static volatile int x = 0;
	
	@Before(order = 0)
	public String initDriver(Scenario scenario)
	
	{
		System.out.println("###########Successfully launched the Chrome browser###############");		
		String featureName = "Feature";
		String Feature = scenario.getId().split(";")[0].replace("-"," ");		 
		 System.out.println("Feature files in exection is : " +Feature);
		 System.out.println("Executing Scenario from "+Feature+" file : " +scenario.getName());
        return Feature;
        
        
	    }
	
	
	
	@After(order = 0)
	public static void tearDown(Scenario scenario) throws Exception 
	{		
			
			Thread.sleep(300);
			//CLEAR_User_Function.driver.close();
			String Feature = scenario.getId().split(";")[0].replace("-"," ");		
			
			if (scenario.isFailed()) 
			{
			    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			    scenario.embed(screenshot, "image/png");
			  System.out.println("****Feature file is - " +Feature+ " and Scenario is - " +scenario.getName() + " is Failed****");
			  CLEAR_User_Function.driver.close();
			}
			
	}
}

	
