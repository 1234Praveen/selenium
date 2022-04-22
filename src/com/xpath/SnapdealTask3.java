package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get(" https://www.snapdeal.com/\r\n");
		WebElement btnsigin = driver.findElement(By.className("accountInner"));
		btnsigin.click();
		WebElement btnreg = driver.findElement(By.className("newUserRegister"));
		btnreg.click();
		WebElement usermobileno = driver.findElement(By.xpath("//input[@data-ismobileonly='false']"));
		usermobileno.sendKeys("9087665596");
		
	}
}
