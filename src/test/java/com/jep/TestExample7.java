package com.jep;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*@Listeners(com.jep.TestListtner.class)*/
public class TestExample7 {
	@Test
	public void scenario1()
	{
		System.out.println("Scenario 4--->"+Thread.currentThread().getName());
	}
	@Test
	public void scenario2()
	{
		System.out.println("Scenario 5--->"+Thread.currentThread().getName());
	}
	@Test
	public void scenario3()
	{
		System.out.println("Scenario 6--->"+Thread.currentThread().getName());
	}
}
