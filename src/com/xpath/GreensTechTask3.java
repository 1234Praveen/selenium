package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://greenstech.in/selenium-course-content.html");

		WebElement txtsearch = driver.findElement(By.xpath("//h2[@class='tittle mb-0 center']"));
		txtsearch.click();
		WebElement txtinter = driver.findElement(By.xpath("//a[text()='CTS Interview Question']"));
		txtinter.click();
				
	}

}
