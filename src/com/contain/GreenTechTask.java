package com.contain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://greenstech.in/selenium-course-content.html");
		WebElement btnoview = driver.findElement(By.id("overview-tab"));
		btnoview.click();
		Thread.sleep(2000);
		WebElement txtsentc = driver.findElement(By.xpath("//div[@class='card-body']"));
		String text = txtsentc.getText();
		System.out.println(text);
		
			
		
		
	}
}
