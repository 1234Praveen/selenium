package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbustask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.com/");
		WebElement txtfrom = driver.findElement(By.id ("src"));
		txtfrom.sendKeys("chennai");
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("Ramnad");
		
		
	}

}
