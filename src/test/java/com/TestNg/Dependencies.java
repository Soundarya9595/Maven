package com.TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependencies {

	
	
	@Test(dependsOnGroups = "colors")
	public void green() {
		System.out.println("Green Color");
	}
	@Test(groups = "colors")
	@Ignore
	public void blue() {
		System.out.println("Blue Color");
	}
	@Test(groups = "colors")
	public void yellow() {
		System.out.println("Yellow Color");
	}
	@Test
	public void red() {
		System.out.println("Red Color");
	}
	@Test (dependsOnMethods = "yellow")
	public void orange() {
		System.out.println("Orange");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
