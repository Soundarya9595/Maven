package com.TestNg;

import org.testng.annotations.Test;

public class priorityNg {

	@Test(priority = -3)
	
	public void violet() {
		System.out.println("V---------->Violet");
		System.out.println();
	}
	
	@Test(priority = -2 , invocationCount = 1)
	public void indigo() {
		System.out.println("I---------->Indigo");
		System.out.println();

	}
	
	@Test(priority = -1)
	public void blue() {
		System.out.println("B---------->Blue");
		System.out.println();

	}
	
	@Test(priority = 0)
	public void green() {
		System.out.println("G---------->Green");
		System.out.println();

	}
	
	@Test(priority = 1)
	public void yellow() {
		System.out.println("Y---------->Yellow");
		System.out.println();

	}
	
	@Test(priority = 2)
	public void orange() {
		System.out.println("O---------->Orange");
		System.out.println();

	}
	
	@Test(priority = 3)
	private void red() {
		System.out.println("R---------->Red");
		System.out.println();

		}
	
}
