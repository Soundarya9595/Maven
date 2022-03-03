package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Additional_Details {

	
	public WebDriver driver;

	public Additional_Details(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement fname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lname;
	
	@FindBy(id = "address")
	WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	WebElement card;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	WebElement type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	WebElement month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	WebElement year;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	WebElement ccv;
	
	@FindBy(xpath = "//input[@id='book_now']")
	WebElement book;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
	
	
	
	
}
