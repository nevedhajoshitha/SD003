package org.testng1;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test(invocationCount = 3)
	public void TC1()
	{
		long id = Thread.currentThread().getId();
		System.out.println("First test case. ID is:"+id);
	}
	@Test
	public void TC2()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Second test case. ID is:"+id);
	}
	
	@Test
	public void TC3()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Third test case. ID is:"+id);
	}
}
