package org.testng1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvider {
	@DataProvider(name = "Data Provider")
	public Object[][] dataprovidermethod()
	{
		return new Object[][] {{"value1"},{"value2"}};
	}
	
	@Test(dataProvider = "Data Provider")
		public void test1(String v)
		{
			System.out.println("parameter passed:"+v);
		}
	}


