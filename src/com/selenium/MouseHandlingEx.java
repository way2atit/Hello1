package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlingEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		
		WebElement fashion_elm =driver.findElement(By.xpath("//div[text() = \"Fashion\"]"));
		
		WebElement mb_elm =driver.findElement(By.xpath("//div[text() = \"Mobiles\"]"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(fashion_elm).build().perform();
		
		//act.click(mb_elm).build().perform();
		//act.clickAndHold(mb_elm).build().perform();
		
		//act.release(mb_elm)
		//act.contextClick(mb_elm).build().perform();  // RightClick
		
	//	act.doubleClick(target)
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
