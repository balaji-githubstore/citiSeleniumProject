package com.citi.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class LoginTest {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //launch the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.getTitle());
		
		//mousehover to make the logout visiblity

		Actions action=new Actions(driver);
		action
		.moveToElement(driver.findElement(By.xpath("//*[@data-bind='text:fname']")))
		.perform();
		
		
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
		
		
	}

}
