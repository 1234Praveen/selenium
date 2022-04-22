package com.doubleclick;


import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GreenScart {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://greenscart.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txtusername = driver.findElement(By.id("loginEmailId"));
		txtusername.sendKeys("praveenkr31102000@gmail.com");
		Thread.sleep(2000);
		WebElement txtpassword = driver.findElement(By.id("loginPassword"));
		txtpassword.sendKeys("Praveenk5274#");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
	    btnlogin.click();
		
		

	}
	}
