package org.testng1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestng {

	@DataProvider(name = "hello")
	public Object[][] data() 
	{
		return new Object[][] {{"all"}};
					
	}
	@Test(dataProvider = "hello")
	public void test(String val)
	{
		System.err.println(val);
	}
}

