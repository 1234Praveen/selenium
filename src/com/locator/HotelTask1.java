package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://adactinhotelapp.com/");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("mountviewpristine");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("456MOUNT456@@");
		
}

	}


