package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillFormEx {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		WebElement fullname_lbl =  driver.findElement(By.xpath("//label[text() = \"Full Name* \"]"));
		String fullname_txt = fullname_lbl.getText();
		System.out.println("Text is : "+fullname_txt);
		
		Thread.sleep(1000);
		WebElement fname_txt =  driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		fname_txt.clear();
		fname_txt.sendKeys("Admin");
		
		Thread.sleep(1000);
		WebElement lname_txt =  driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lname_txt.clear();
		lname_txt.sendKeys("Admin1233");
		
		Thread.sleep(1000);
		WebElement male_radiobtn =  driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		male_radiobtn.click();
		Thread.sleep(1000);
		WebElement chkbox1 =  driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
		boolean b =chkbox1.isSelected();
		if(b == false)
		{
			chkbox1.click();
		}
		Thread.sleep(1000);
		WebElement submit_btn =driver.findElement(By.xpath("//button[@id=\"submitbtn\"]"));
		submit_btn.click();
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}

}
