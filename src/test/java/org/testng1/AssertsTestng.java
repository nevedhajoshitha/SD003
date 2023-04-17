package org.testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsTestng {
	public WebDriver driver;
@BeforeMethod
public void Open()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEVEDHA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void TestCase()
{
	SoftAssert ass = new SoftAssert();
	String Title = "Google";
	String act_Title = driver.getTitle();
	ass.assertEquals(act_Title,Title);
	ass.assertAll();
}
@AfterMethod
public void Close()
{
	driver.close();
}



}
