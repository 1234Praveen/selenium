package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAlert {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get(" http://demo.automationtesting.in/Alerts.html");
	
		WebElement txtalert= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		txtalert.click();
		WebElement btnalert= driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btnalert.click();
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("praveen kumar");
		alert.accept();
	WebElement text = driver.findElement(By.xpath("//p[text()='Hello praveen kumar How are you today']"));
		String txt=text.getText();
		System.out.println(txt);


		
	}
}