package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseClass {

	protected static WebDriver wd;
	static 	Actions a;
	static JavascriptExecutor js;
	
//	1 Launching
	public static WebDriver browserLaunch(String browser)
	{
		if(browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 wd = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 wd = new FirefoxDriver();
		}
		wd.manage().window().maximize();
		return wd;
	}
	
//	2 getUrl
	public static WebDriver url(String url)
	{
		wd.get(url);
		return wd;
	}
	
	//3 click
	public static void ClickOnElement(WebElement element)
	{
		element.click();
	}
	
//	4 sendKeys
	public static void inputValues(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
//	5 screenshot
	public static void screenShot(String filename) 
	{
		TakesScreenshot ts = (TakesScreenshot) wd;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Vivek\\eclipse-workspace\\Selenium\\Screenshots"+filename+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	6.getTitle
	public static void getATitle()
	{
		String title = wd.getTitle();
		System.out.println(title);
	}
	
//	7 getText
	public static void getAText(WebElement element)
	{
		String text =  element.getText();
		System.out.println(text);
	}
	
//	8 dropDown
	public static void dropDown(WebElement element, String option, String input) 
	{
		Select s= new Select(element);
		if(option.equals("index")) {
			int data = Integer.parseInt(input);
			s.selectByIndex(data);
		}
		else if(option.equals("value")) {
			s.selectByValue(input);
		}
		else if(option.equals("text")) {
			s.selectByVisibleText(input);	
		}
	}
	
//	9 Action
	public static Actions action()
	{
	 a = new Actions(wd);
		return a;
	}
	
//	10 actions MoveToElement
	public static void movetoelement(WebElement element)
	{
		action().moveToElement(element).perform();
	}
	
//	11 ActionsDragDrop
	public static void dragDrop(WebElement drag,WebElement drop)
	{
		action().dragAndDrop(drag, drop).click().perform();
	}
	
//	12 actions contextClick
	public static void contextClick(WebElement element)
	{
		action().contextClick(element).perform();
	}
	
//	13 actions DoubleClick
	public static void doubleClick(WebElement element)
	{
		action().doubleClick(element).perform();
	}
	
//	14 Actions Click
	public static void actionClick(WebElement element)
	{
		action().click(element).perform();
	}
	
//	15 Robot
	public static void robot(String keys) throws AWTException
	{
		Robot r = new Robot();
		if(keys.equals("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
		}
		else if(keys.equals("enter")) {
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	
//	16
	public static void alert(String value)
	{
		if(value.equals("accept")) {
			wd.switchTo().alert().accept();
		}
		else if(value.equals("dismiss")) {
			wd.switchTo().alert().dismiss();
		}
	}
	
//	17
	public static void windowHandle()
	{
		wd.getWindowHandle();
	}
	
//	18
	public static void frame(WebElement element)
	{
		wd.switchTo().frame(element);
	}
	
// 19	
	public static void windowHandles()
	{
		Set<String> tabs = wd.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		while(it.hasNext()) {
			String s  = it.next();
			wd.switchTo().window(s);
		}		
	}
	
//	20 implicitWait
	public static void implicityWait(int value)
	{
		wd.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}
	
//	21 scroll UpDown
	public static void scrollUpDown(int width, int height)
	{
		js = (JavascriptExecutor) wd;	
		js.executeScript("window.scrollBy(" + width + "," + height + ");");
		
	}
	
// 22 close
	public static void closeBrowser() {
		wd.close();
	}
	
//	23 quit
	public static void terminateBrowser() {
		wd.quit();
	}
	
//	24 Navigate-Forward
	public static void forwardPage() {
		wd.navigate().forward();
	}
	
//	25 Navigate-Back
	public static void backPage(WebElement element) {
		wd.navigate().back();;
	}
	
//	26 Navigate-To
	public static void navigateTo(String url) {
		wd.navigate().to(url);
	}
	
}

	
	

