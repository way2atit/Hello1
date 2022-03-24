package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx {

	public static void main(String[] args) throws InterruptedException {
                          //  key                    value
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		
		
		
		/*String url = driver.getCurrentUrl();
		System.out.println("url is :" +url);
		
		String title = driver.getTitle();
		System.out.println("Title is :" +title);
		
		Thread.sleep(2000);  
		String pageCode =driver.getPageSource();
		System.out.println("*********** \n" +pageCode);*/
		
		
		
		Thread.sleep(3000);  // java class
		driver.close();  //  Current window close  (only one)
		
		driver.quit();  // All window close (open by selenium)
		
		
		
	}

}

// Task  : 1
// Chrome :  chrome.exe
// Firefox :   geckodriver.exe
  // Key :  webdriver.gecko.driver


