package com.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param2_Ng {

	@Test
	@Parameters({"Color", "Price"})
	
	
	private void addDetails(String Color, String Price) {
		System.out.println("\n\nVehical_Color " +Color);
		System.out.println("Price Range: " + Price);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
