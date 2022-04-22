package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechlTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://greenstech.in/selenium-course-content.html");
		WebElement btnmodel = driver.findElement(By.xpath("//div[@class='card-header11 d-flex align-items-center justify-content-between']"));
		btnmodel.click();
		WebElement btnmodel1 = driver.findElement(By.xpath("//a[@title='Model Resume training in chennai']"));
		btnmodel1.click();
		
		

}
}