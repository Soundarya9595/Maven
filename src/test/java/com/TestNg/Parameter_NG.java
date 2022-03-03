package com.TestNg;

import org.junit.runners.Parameterized.Parameter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_NG {

	@Test
	
	@Parameters({"ModelName","ModelId","Loc"})
	public void Vehical_Details(@Optional("Hyundai Grand")String ModelName,String ModelId,String Loc) {
		
		System.out.println("\n\n\nModel_Name : "+ModelName);
		System.out.println("Model_Id : " +ModelId);
		System.out.println("Location : " +Loc);
	}
	
	
	@Test
	@Parameters({"mile","engine"})
	
	public void moreInfo(@Optional("32.52")String mile, String engine) {
		System.out.println("\n\nMax_Mileage : "+mile);
		System.out.println("Engine_Type "+engine);
	}
	
	
	
	
	
	
	
	
}
