package org.testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenConcept {
	
	@DataProvider(name = "Data Provider")
	public Object[][] para()
	{
		return new Object[][] {{"Selenium testNG"}};
	}

	@Test(dataProvider = "Data Provider")
	public void Google(String data)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEVEDHA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(data);
		driver.close();
	}
}
