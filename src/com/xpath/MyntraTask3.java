package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get(" https://www.myntra.com/register?referer=https://www.myntra.com/\r\n");
		WebElement txtmobileno = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtmobileno.sendKeys("9090876548");
		WebElement btncontinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
        btncontinue.click();

}
}
