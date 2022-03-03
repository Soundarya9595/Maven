package com.TestNg;

import org.testng.annotations.Test;

public class Time_Out {
@Test(timeOut = 5500)

	public void ready() throws InterruptedException {
	Thread.sleep(1000);
		System.out.println("\n\n\nReady\n.............\n..............");
		
		Thread.sleep(2000);
		System.out.println("\tSet\n\t.............\n\t.............");
		
		Thread.sleep(2000);
		System.out.println("\t\t GO ...\n");
	}
}
