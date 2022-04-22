package com.contain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("http://adactinhotelapp.com/");
		WebElement txtwords = driver.findElement(By.xpath("//p[ contains(@style,'text-align:center;')]"));
		String style = txtwords.getText();
		System.out.println(style);
		
		

}
}






