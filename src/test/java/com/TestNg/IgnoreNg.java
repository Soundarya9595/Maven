package com.TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreNg {

	@Test(groups = "color")
	
	public void black() {
		System.out.println("****Black****");
	}
	
	@Test(groups = "color")
	
	public void white() {
		System.out.println("****White****");
	}
	@Test(groups = "color")
	public void pink() {
		System.out.println("****Pink****");
	}
	@Test(groups = "color")
	public void lavender() {
		System.out.println("****Lavander****");
	}
	@Test(groups = "rainbow",priority = -4)
	public void violet() {
		System.out.println("****Violet****");
	}
	
	 @Test(groups = "rainbow",priority = 0)
	 public void orange() {
		 System.out.println("****Orange****");
	}
	@Ignore
	@Test
	public void red() {
		System.out.println("****Red****");
	}
	@Test(enabled = false)
	public void green() {
		System.out.println("****Green****");
	}
	
	@Test(groups = "rainbow",priority = -2)
	
	public void blue() {
		System.out.println("****Blue****");
	}
	
	@Test(groups = "rainbow",priority = -1)

	public void yellow() {
		System.out.println("****Yellow****");
	}
	
	@Test(groups = "rainbow",priority = -3)

	public void indigo() {
		System.out.println("****Indigo****");
	}
	
}
