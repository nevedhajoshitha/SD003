package org.testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Test
	@Parameters({"val1", "val2"})
	public void sum(int v1,int v2)
	{
		int sum = v1+v2;
		System.out.println("sum is : "+sum);
	}
}
