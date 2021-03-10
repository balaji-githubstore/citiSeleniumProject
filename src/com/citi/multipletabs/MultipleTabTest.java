package com.citi.multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); //launch the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");	
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(5000);
		
		String parent =driver.getWindowHandle(); //current session detail
		System.out.println(parent);
		
		System.out.println("------------------------");
		Set<String> windows= driver.getWindowHandles();
		
		for(String win : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Citibank India"))
			{
				break;
			}
		}
		driver.findElement(By.id("User_Id")).sendKeys("hello123");
		Thread.sleep(5000);
		driver.close();
		
		windows= driver.getWindowHandles();
		
		for(String win : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Citibank India"))
			{
				break;
			}
		}
	}

}
