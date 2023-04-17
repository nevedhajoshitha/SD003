package org.testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSuite {
	
	public WebDriver driver;
	@BeforeClass
	public void Start()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEVEDHA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
	}
	
	@Test(dataProvider = "Hello")
	public void Browser()
	{
		driver.findElement(By.name("q")).sendKeys("testng");
	}
	
	@Test
	public void Click()
	{
		driver.findElement(By.name("btnK")).click();
	}
	
	
	@AfterClass
	public void End()
	{
		driver.close();
	}
	
}
