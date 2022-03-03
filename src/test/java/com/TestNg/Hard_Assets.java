package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assets {

	@Test
	
	public void hardTest1() {

		String actual = "MonA";
		String expected = "MonA";
		
		Assert.assertEquals(actual, expected);
		System.out.println("**********Validation--1***************");
	}
	@Test
	public void hardTest2() {

		int v=23;
		int u=1000;
		Assert.assertNotEquals(v, u);
		System.out.println("************Validation--2**************");
	}	
	@Test
	public void hardTest3() {

		String s = "hello";
		String c = "Hello";
		Assert.assertEquals(s, c);
		System.out.println("************Validation--3**************");		
	}
	
	
}
