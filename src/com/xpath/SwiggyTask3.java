package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.swiggy.com/");
		WebElement btnsignup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		btnsignup.click();
		WebElement txtmnumber = driver.findElement(By.id("mobile"));
		txtmnumber.sendKeys("7098765789");
		WebElement txtname = driver.findElement(By.id("name"));
		txtname.sendKeys("jeshwin");
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("jeshwin1233456@gamil.com");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("gyhyhyghu");
		WebElement btnnext = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnnext.click();

}
}
