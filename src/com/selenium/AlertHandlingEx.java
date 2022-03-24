package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHandlingEx extends BrowserInit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =initBrowser();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement elem1 =driver.findElement(By.xpath("//a[text() = \"Alert with OK & Cancel \"]"));
		elem1.click();
		Thread.sleep(2000);
		WebElement elem2 =driver.findElement(By.xpath("//button[text() = \"click the button to display a confirm box \"]"));
		elem2.click();  // Alert --
		
		Thread.sleep(2000);
		Alert a =driver.switchTo().alert();
		String text = a.getText();  //
		System.out.println("text :" +text);
		
		//a.sendKeys("ADMin");
		Thread.sleep(2000);
		//a.accept();  // ok 
	
		a.dismiss();  // cancel
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
