package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.snapdeal.com/login");
		WebElement txtusername = driver.findElement(By.id("userName"));
		txtusername.sendKeys("ravi123445@gmail.com");
		
		
	}

}
