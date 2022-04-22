package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask3 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver .get("https://www.redbus.in/");
			WebElement txtsignicon = driver.findElement(By.id("sign-in-icon-down"));
			txtsignicon.click();
			WebElement txtsignin = driver.findElement(By.id("signInLink"));
			txtsignin.click();
			WebElement txtmobileno = driver.findElement(By.id("mobileNoInp"));
			txtmobileno.sendKeys("8999876689");
			WebElement txtotpno = driver.findElement(By.id("opt-container"));
			txtotpno.click();
				
				
		}
}
