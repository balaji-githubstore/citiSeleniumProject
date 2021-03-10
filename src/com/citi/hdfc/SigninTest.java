package com.citi.hdfc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninTest {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        
        //move to frame
        driver.switchTo().frame("login_page");
        driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
        driver.findElement(By.xpath("//img[@alt='continue']")).click();
        
        driver.switchTo().defaultContent(); //come to main html
        
        //comeout of frame
	}
}
