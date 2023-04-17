package org.testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameter {
	@Parameters({"val1", "val2"})
	@Test
	
	public void Add(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
	}
	
}
