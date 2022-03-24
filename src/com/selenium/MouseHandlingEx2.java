package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlingEx2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Thread.sleep(3000);
		WebElement drag_elem = driver.findElement(By.xpath("//a[text()= \" 5000 \"]"));
		WebElement drop_elem = driver.findElement(By.xpath("//ol[@id=\"amt7\"]/li"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_elem, drop_elem).build().perform();
		
		
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
