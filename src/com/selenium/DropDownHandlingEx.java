package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingEx {
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		WebElement drop_elem = driver.findElement(By.id("Skills"));
		
		Select s =  new Select(drop_elem);
		boolean b =s.isMultiple();
		System.out.println(b);
		
		//s.selectByIndex(4);
		//s.selectByValue("APIs");
		s.selectByVisibleText("Certifications");
		
	
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
}

}
