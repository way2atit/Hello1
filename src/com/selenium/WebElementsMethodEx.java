package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethodEx {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		//driver.findElement(By.linkText("WebTable")).click();
		driver.findElement(By.partialLinkText("Web")).click();
		
		
		
		/*WebElement fullname_txt =driver.findElement(By.xpath("//label[text()=\"Full Name* \"]"));
		
		fullname_txt.clear();
		fullname_txt.click();
		Point p=fullname_txt.getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		Dimension dim =fullname_txt.getSize();
		System.out.println(" height : " +dim.height);
		System.out.println("width : "+dim.width);
		
		String text =fullname_txt.getText();
		System.out.println("Text is :"+text);
		
		boolean b =fullname_txt.isDisplayed();
		System.out.println("isDisplayed :" +b );
		
		boolean b1 = fullname_txt.isEnabled();
		System.out.println("isEnabled :"+b1 );
		
		boolean b2 =fullname_txt.isSelected();
		System.out.println("isSelected :"+b2 );
		
		fullname_txt.sendKeys("Admin");
		fullname_txt.submit();
		
		
		fullname_txt.findElement(By.id(""));
		fullname_txt.findElements(By.id(""));
		
		
		
		
		//List<WebElement> allelm =driver.findElements(By.id(""));
		*/
		Thread.sleep(5000);
		driver.close();
		
		driver.findElement(By.xpath("//input[contains(@placeholder, \"First \")]"));
		
		
	}

}
