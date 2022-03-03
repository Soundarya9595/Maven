package com.TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {

	@Test(dataProvider = "datum")
	
	public void trainDetails(String TrainName, int TrainNumber) {

		System.out.println("Train_Name : "+TrainName);
		System.out.println("Train_Number : "+TrainNumber);	
		System.out.println();}
	
	
	@DataProvider
	
	public Object[][] datum() {
		return new Object[][] {
		
			{"Abadh Assam Express",15609},
			{"Abhanpur Rajim NG Passenger" ,58719},
			{"Et-Pcoi Spl",	01117},
			{"Ers-Ltt Duronto Express",01224},
			{"Vsg-Kcg Ghy Parcel Exp Sp",	00623},
			{"Vasai Road - Diva Memu Special",85454},
			{"Kanyakumari - Nagercoil Special	",8547},
			{"Konark Express",78548},
			{"Mangaluru Junction - Vasai Road Specialfare Special",87444},
			
		};
		}

}
