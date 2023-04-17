package org.testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Sample {
	@BeforeClass
	public void browserLaunch()
	{
		System.out.println("Hello all");
		
	}
	
	@AfterClass
	public void exitBrowser()
	{
		System.out.println("bye all");
	}
	
	@BeforeMethod
	public void startTime()
	{
		System.out.println("start time");
	}
	
	@AfterMethod
	public void endTime()
	{
		System.out.println("end time");
	}
	
	@Test(enabled = true)
	@Parameters({"Hello"})
	public void TC1(@Optional String val)
	{
		System.out.println("started tc1");
		System.out.println(val);
	}
	
	
	@Test(priority = -1, invocationCount = 3)
	public void TC2()
	{
		System.out.println("started tc2");
	}
	

}
