package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	
	@BeforeTest
	
	public void urlLaunch() {
		System.out.println("Launch URl");
	}
	
	@BeforeClass
	
	public void homepage() {
		System.out.println("HomePage");
	}	
	
	@BeforeMethod
	
	public void login() {
		System.out.println("Website Login");
	}
	
	@Test
	
	public void Hotel() {
		System.out.println("Select Hotel");
	}
	
	@Test
	public void room() {
		System.out.println("Select the Room type");
	}
	
	@Test
	
	public void noOfRooms() {
		System.out.println("Select NO of Rooms");
	}
	
	@AfterMethod
	
	public void logout() {
		System.out.println("Logout ");
	}
	
	@AfterSuite
	public void exit() {
		System.out.println("Exit the web browser");
	}
	
	
	
	
	
	
	
}
