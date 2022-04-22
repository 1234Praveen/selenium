package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask {
	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.sprint.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement linkphoneanddevice = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
			Actions action=new Actions(driver);
            action.moveToElement(linkphoneanddevice).perform();
			WebElement linkmobile = driver.findElement(By.xpath("//a[text()='5G phones']"));
			action.moveToElement(linkmobile).perform();
			WebElement txtsentc= driver.findElement(By.xpath("//a[text()='Do Not Sell My Personal Information']"));
			String text = txtsentc.getText();
			System.out.println(text);
			
			
			
			
	 }
}
