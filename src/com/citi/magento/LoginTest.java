package com.citi.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //launch the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/"); //wait until page load
		
		driver.findElement(By.linkText("My Account")).click(); //500ms to do the operation
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("balaji017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("magento@123");
		driver.findElement(By.name("send")).click();
		
//		String actualValue= driver.getTitle();
//		System.out.println(actualValue);
		String actualValue=driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
		System.out.println(actualValue);

	}
}
