package com.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Retry_Analyzer {

	
	@Test(retryAnalyzer = ReRun.class)
	public void Test_0() {

		int a= 23;
		int e = 231;
		Assert.assertEquals(a, e);
		System.out.println("*******Validated**********");
	}
	
	
	
	@Test(retryAnalyzer = ReRun.class)
	
	public void Test_1() {
		String act = "hellowww";
		String exp = "Hellow";
		
		Assert.assertEquals(act, exp);
		System.out.println("*******Validated**********");
	
	
	}
	
	
	
}
