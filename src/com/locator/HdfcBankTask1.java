package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBankTask1 {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/");
	
	  WebElement txtcustomerid = driver.findElement(By.id("//input[@type='text']"));
	  txtcustomerid.sendKeys("12345");
}
}



