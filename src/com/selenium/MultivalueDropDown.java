package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultivalueDropDown {
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		Thread.sleep(2000);
		
		WebElement drop_elem = driver.findElement(By.xpath("//select[@name=\"selenium_commands\"]"));
		
		Select s =  new Select(drop_elem);
		boolean b =s.isMultiple();
		System.out.println(b);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByVisibleText("WebElement Commands");
		
		Thread.sleep(1000);
		//s.deselectAll();
	//	s.deselectByIndex(1);
		//s.deselectByValue("");
	//	s.deselectByVisibleText("WebElement Commands");
		
		List<WebElement> alloptins = s.getOptions();
		
		for(WebElement e : alloptins)
		{
			String option=e.getText();
			System.out.println("Option :" +option);
		}
		System.out.println("*****getAllSelectedOptions*********");
		
		List<WebElement> selectedoption=s.getAllSelectedOptions();
		for(WebElement e: selectedoption)
		{
			System.out.println("selected options: "+e.getText());
		}
		
		WebElement e =s.getFirstSelectedOption();
		System.out.println("getFirstSelectedOption : "+e.getText());
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
}

}
