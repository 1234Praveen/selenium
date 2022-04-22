package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.amazon.in/");

		WebElement txtprdname = driver.findElement(By.id("twotabsearchtextbox"));
		txtprdname.sendKeys("iphone");
		WebElement btnsearch = driver.findElement(By.id("nav-search-submit-button"));
		btnsearch.click();
		

}
}