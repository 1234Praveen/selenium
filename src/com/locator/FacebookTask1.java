package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//id=email
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("ramesh3457876@gamail.com");
		//id=password
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("4567809908**&");
		
	}
}
