package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	
	public WebDriver driver;

	public Booking_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	WebElement loc;
	
	
	@FindBy(id = "hotels")
	WebElement hotel;
	
	@FindBy(xpath = "//select[@id='room_type']")
	WebElement room;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	WebElement nos;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	WebElement checkin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	WebElement checkout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	WebElement adult;
	
	@FindBy(xpath = "//select[@id='child_room']")
	WebElement child;
	
	@FindBy(id = "Submit")
	WebElement submit1;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit1() {
		return submit1;
	}
	
	
	
}
