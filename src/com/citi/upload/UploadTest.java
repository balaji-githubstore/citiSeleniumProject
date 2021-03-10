package com.citi.upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        driver.get("https://www.naukri.com/");
        
        driver.findElement(By.xpath("//*[@id='file_upload']")).sendKeys("D:\\B-Mine\\Company\\Company\\Citi\\Assignment_Set1.docx");
		//autoIT tool
	}

}
