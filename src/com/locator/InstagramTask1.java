package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get(" https://www.instagram.com/accounts/login/?hl=en) login page ");
		
		Thread.sleep(3000);
		WebElement txtusername = driver.findElement(By.xpath("//input[@type='text']"));
		txtusername.sendKeys("praveenkr31010@gmail.com");
		Thread.sleep(3000);
		WebElement txtuserpassword = driver.findElement(By.name("password"));
		txtuserpassword.sendKeys("12345@#");
		
		
	}

}
