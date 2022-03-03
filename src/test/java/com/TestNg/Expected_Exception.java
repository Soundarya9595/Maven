package com.TestNg;

import org.testng.annotations.Test;

public class Expected_Exception {

	
	@Test(expectedExceptions = ArithmeticException.class)
	private void arithmetic_Excep() {
		int s=10;
		System.out.println(s/0);
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	private void nullPointer_Excep() {
		String a=null;
		System.out.println(a.charAt(12));
	}
	
	@Test(expectedExceptions = StringIndexOutOfBoundsException.cl)
	private void stringIndex_OutofBounds() {
		String d= "Hello World";
		System.out.println(d.charAt(40));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
