package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTask1 {
	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver .get(" http://demo.automationtesting.in/Register.html");
			
			WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			txtfirstname.sendKeys("praveen");
			WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			txtlastname.sendKeys("kumar");
			WebElement txtaddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
			txtaddress.sendKeys("Andaman and nicobar island");
			WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
			txtemail.sendKeys("kumar34567@gmail.com");
			WebElement txtphoneno = driver.findElement(By.xpath("//input[@type='tel']"));
			txtphoneno.sendKeys("789878980");
			WebElement btngender = driver.findElement(By.xpath("//input[@type='radio'][1]"));
			btngender.click();
			WebElement btnhobbies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
			btnhobbies.click();
			WebElement txtpassword = driver.findElement(By.id("firstpassword"));
			txtpassword.sendKeys("kumar5274");
			WebElement txtrepassword = driver.findElement(By.id("secondpassword"));
			txtrepassword.sendKeys("kumar5274");
			WebElement btnsumbit= driver.findElement(By.xpath("//button[@id='submitbtn']"));
			btnsumbit.click();
			
	}

}
