package com.test.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@class='input-group']//input[@type='text']")).sendKeys("QATest3");
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("QATest");
		
		driver.findElement(By.xpath("//a[contains(text(),'Features')]")).click();
		
	
			}
}
