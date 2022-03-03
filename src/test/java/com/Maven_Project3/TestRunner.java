package com.Maven_Project3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pomclass.Additional_Details;
import com.pomclass.Booking_Page;
import com.pomclass.Continue_Page;
import com.pomclass.Login_Page;
import com.properties.FileReaderManager;

public class TestRunner extends Base{

	public static void main(String[] args) throws Throwable {
		browser("chrome");
		String url= FileReaderManager.getobjFRM().getobjCRM().getUrl();
		
		Url(url);
	WebElement link = driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']"));
	Button(link);
	
		Login_Page lp= new Login_Page(driver);
		
		Booking_Page bp = new Booking_Page(driver);
		
		Continue_Page cp= new Continue_Page(driver);
		
		Additional_Details ad = new Additional_Details(driver);
	
		//******************************Login_Page*******************************************************		
				String uname = FileReaderManager.getobjFRM().getobjCRM().getUname();
				input(lp.getUname(),uname);
				
				String pwd = FileReaderManager.getobjFRM().getobjCRM().getPwd();
				input(lp.getPwd(),pwd);
				
				Button(lp.getLogin());
				
		//****************************************Booking_Page**********************************************		
				String loc = FileReaderManager.getobjFRM().getobjCRM().getLoc();
				SelectValue(bp.getLoc(), loc);
				String hotel = FileReaderManager.getobjFRM().getobjCRM().getHotel();
				SelectValue(bp.getHotel(), hotel );
				String room = FileReaderManager.getobjFRM().getobjCRM().getRoom();
				SelectValue(bp.getRoom(), room);
				SelectIndex(bp.getNos(), 1);
				String datein = FileReaderManager.getobjFRM().getobjCRM().getDatein();
				input(bp.getCheckin(), datein);
				String dateout = FileReaderManager.getobjFRM().getobjCRM().getDateout();
				input(bp.getCheckout(), dateout );
				
				SelectIndex(bp.getAdult(), 1);
				
				SelectIndex(bp.getChild(), 0);
				
				Button(bp.getSubmit1());
				
		//***************************Continue_Page*********************************************************
				
				Button(cp.getRadio());
				
				Button(cp.getContinuee());
				
				
		//*******************************Additional_Details******************************************************************		
				
				input(ad.getFname(), FileReaderManager.getobjFRM().getobjCRM().getFname());
				
				input(ad.getLname(), FileReaderManager.getobjFRM().getobjCRM().getLname());
				
				input(ad.getAddress(), FileReaderManager.getobjFRM().getobjCRM().getAddress());
				
				input(ad.getCard(), FileReaderManager.getobjFRM().getobjCRM().getCard());
				
				SelectIndex(ad.getType(), 1);
				
				SelectIndex(ad.getMonth(), 6);
				
				SelectIndex(ad.getYear(), 9);
				
				input(ad.getCcv(), FileReaderManager.getobjFRM().getobjCRM().getCcv());
				
				Button(ad.getBook());
				
				screenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project3\\ScreenShots\\Order.png");
			
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
