package com.cucumber.runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@rerun/failed_scenarios.txt"}, 
				glue = {"com.cucumber.stepdefinitions.cbs" }, //the path of the step definition files
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:" },//to generate different types of reporting
				monochrome = true, //display the console output in a proper readable format
				strict = true, //it will check if any step is not defined in step definition file
				dryRun = false//to check the mapping is proper between feature file and step def file		
		)

public class ReRunner 

{
	@BeforeClass
	public static void setup() {

		String dateName = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setProjectName("CLEAR_PC");
		extentProperties.setReportPath("output/Report_" + dateName + ".html");

	}

	@AfterClass
	public static void teardown() {

		//Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Selenium", "2.53.0");
		Reporter.setSystemInfo("Maven", "4.0.0");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setTestRunnerOutput("CLEAR PC Automation Testing");

	}

}