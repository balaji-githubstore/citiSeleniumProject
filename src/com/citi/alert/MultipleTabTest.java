package com.citi.alert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTabTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver(); //launch the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.echoecho.com/javascript4.htm");	
		
		driver.findElement(By.name("B3")).click();
		
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("uuuuu");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
