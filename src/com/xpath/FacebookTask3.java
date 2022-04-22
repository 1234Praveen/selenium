package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtusername = driver.findElement(By.id("email"));
	txtusername.sendKeys("ramesh@132456");
	Thread.sleep(2000);
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("132456");
	WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnlogin.click();
	
}
}
