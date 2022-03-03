package com.TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {

	
	@Test
	
	private void softTest1() {

		String a = "Hellow";
		String e = "Hello";
		SoftAssert s = new SoftAssert();
		s.assertEquals(a, e);
		System.out.println("********Verified--1***********");
	}
	
	@Test
	private void softTest2() {

		int a = 52;
		int e = 521;
		SoftAssert s = new SoftAssert();
		s.assertNotEquals(a, e);
		System.out.println("********Verified--2***********");
		
	}
	
	
	
	
	
}
