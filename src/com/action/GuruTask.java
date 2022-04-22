package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GuruTask {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement s = driver.findElement(By.id("credit2"));
	WebElement d = driver.findElement(By.id("bank"));
	Actions action=new Actions(driver);   
	action.dragAndDrop(s, d).perform();
	WebElement s1 = driver.findElement(By.id("fourth"));
	WebElement d1 = driver.findElement(By.id("amt7"));
	action.dragAndDrop(s1, d1).perform();
	WebElement s2 = driver.findElement(By.id("credit1"));
	WebElement d2 = driver.findElement(By.id("loan"));
	action.dragAndDrop(s2, d2).perform();
	WebElement s3 = driver.findElement(By.id("fourth"));
	WebElement d3 = driver.findElement(By.id("amt8"));
	action.dragAndDrop(s3, d3).perform();
	WebElement txtsentc= driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
	String text = txtsentc.getText();

	
	System.out.println(text);

	
 
 }
 
	
	
	
 }
 
 
 
 
 
 
 
 
 
 
 

