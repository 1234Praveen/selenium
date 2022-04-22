package com.contain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.amazon.in/");
		WebElement txtsentc= driver.findElement(By.xpath("//a[contains(@href,'/gp/help/customer/display.html?nodeId=200545940&ref_=footer_cou') ]"));
		String text = txtsentc.getText();
		System.out.println(text);
}
}