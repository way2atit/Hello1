package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInit {
	
	public static WebDriver driver = null;
	
	public static WebDriver initBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

}
