package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainsTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(" https://www.cleartrip.com/trains");
		WebElement txtfrom = driver.findElement(By.id ("from_station"));
		txtfrom.sendKeys("chennai");
		WebElement txtto = driver.findElement(By.id("to_station"));
		txtto.sendKeys("Ramnad");
		WebElement btnserach = driver.findElement(By.id("trainFormButton"));
		btnserach.click();
		
	}
}
