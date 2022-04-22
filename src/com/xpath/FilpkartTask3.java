package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.flipkart.com/");
		WebElement txtuser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtuser .sendKeys("ramesh");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtpassword.sendKeys("132456");
        WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
        btnlogin.click();
        
}
}