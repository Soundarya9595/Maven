package com.Maven_Project3;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;

	public static WebDriver browser(String str)
 {
		if(str.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		}
		return driver;
	}
//*******************************getUrl*************************
	public static void Url(String Url) {
		driver.get(Url);;// TODO Auto-generated method stub

	}
	
	
//------------------------------------------Click--------------------------------------------------------

	public static void Button(WebElement element) 
{
		 element.click();
}
//------------------------------------------Input--------------------------------------------------------

	public static void input(WebElement element, String input) 
{
		element.sendKeys(input);
}
//------------------------------------------Close--------------------------------------------------------

	public static  void close() 
{
		driver.close();
}

//------------------------------------------Quit--------------------------------------------------------

	public static void quit() 
{
		driver.quit();
}
//------------------------------------------NavigateTo--------------------------------------------------------

	public static void NaviTo(String Url) 
{
		driver.navigate().to(Url);
}

//------------------------------------------Refresh--------------------------------------------------------

    	public static void Refresh()
 {
    		driver.navigate().refresh();
}

//------------------------------------------Back--------------------------------------------------------

public static void Back() 
{
    		driver.navigate().back();
}
    
     
	
	
//------------------------------------------Mouse Events------------------------------------------------------

	public static void DoubleClick(Actions action)
 {
		action.doubleClick().build().perform();
}

//------------------------------------------Mouse Events Click-----------------------------------------------

	public static void click(Actions action)
 {
		action.click().build().perform();
}

//------------------------------------------ContextClick/Right Click-----------------------------------------

	public static void RightClick(Actions action)
 {
		action.contextClick().build().perform();
}


//------------------------------------------Drag&Drop--------------------------------------------------------

	
	
//------------------------------------------Robot---------------------------------------------------------

	public static void down() throws AWTException
 {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
}
	public static void up() throws AWTException 
{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
}
	public static void Enter() throws AWTException 
{
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
}
	
	
	
	
	
//------------------------------------------DropDown--------------------------------------------------------

//------------------------------------------Select By Index-------------------------------------
	public static void SelectIndex(WebElement we,int index) 
{
		Select select = new Select(we);
		
		select.selectByIndex(index);
}



//------------------------------------------Select By Value----------------------------------------------------

	public static void SelectValue(WebElement we,String value) 
{
		Select select = new Select(we);
		select.selectByValue(value);
}

//------------------------------Select By Visible Text--------------------------------------------------------

	public static void SelectVisibleTxt(WebElement we,String txt) 
{
		Select select = new Select(we);
		select.selectByVisibleText(txt);
}

//------------------------------DeSelect By Index--------------------------------------------------------

	public static void DeselectIndex(WebElement we,int indexD) 
{
		Select select = new Select(we);
		select.deselectByIndex(indexD);
}

//------------------------------Select By Value--------------------------------------------------------

	public static void DeselectValue(WebElement we, String str) 
{
		Select s = new Select(we);
		s.deselectByValue(str);
}

//------------------------------DeSelect By Visible Text----------------------------------------------------

	public static void DeselectVisibleTxt(WebElement we, String str) 
{
		Select s = new Select(we);
		s.deselectByVisibleText(str);
		
}

//------------------------------DeSelect All--------------------------------------------------------

	public static void DeselectAll(WebElement we) 
{
		Select s = new Select(we);
		s.deselectAll();
}

//------------------------------GetOption--------------------------------------------------------

	public static void GetOption(WebElement we) 
{


		Select s = new Select(we);
		java.util.List<WebElement> options = s.getOptions();

		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
}
	
	
//------------------------------ GetAllSelectedOpts -------------------
	
	public static void  getAllSelected(WebElement we) {
		
		Select s  = new Select(we);
		java.util.List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement webElement : all) {
			String text = webElement.getText();
			System.out.println(text);
		}
	
	
	
	}
	
	
	
//------------------------------ Get First Selected Options -----------------------------------------------

	public static void GetFirst(Select select)
 {
		WebElement optn = select.getFirstSelectedOption();
		String text = optn.getText();
		System.out.println(text);
}
	
//------------------------------ IS Multiple--------------------------------------------------------

	public static void IsMultiple(WebElement we, boolean b) 
{
		Select s = new Select(we);
		 b = s.isMultiple();
		 
}
	
	
//------------------------------ Radio Button --------------------------------------------------------

	public static void RadioBtn(WebElement wb) 
{
		wb.click();
}

//------------------------------ Check Box--------------------------------------------------------

	public static void CheckBx(WebElement wb) 
{
			wb.click();
}
	
	
//------------------------------ Screen Shot --------------------------------------------------------

	public static void Screenshot() throws Throwable 
{
		TakesScreenshot	ts=(TakesScreenshot) driver;
		
		  File Src = ts.getScreenshotAs(OutputType.FILE);
		
		 File Des = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project3\\Screenshot");
		
		FileUtils.copyFile(Src, Des);		
	}
	
	
//--------GetCrntUrl------------------------------------

	public static void GetCrntUrl(String Url) 
{
		 Url = driver.getCurrentUrl();
		System.out.println(Url);
}
	
	
	//-----------------------------TakesScreenShot-------------------

	public static void screenshot(String Location) throws Throwable {
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File(Location);
		FileUtils.copyFile(Source, Dest);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
}








