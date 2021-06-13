package com.test.utility;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopify {

	public static void main(String[] args) throws InterruptedException {
		

				System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.shopify.in/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
				String oldwindow = driver.getWindowHandle();
				
				WebElement startfreetrial = driver.findElement(By.id("MainNavSignupButton"));
				startfreetrial.click();
			
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				Set<String> window = driver.getWindowHandles();
				
				for (String newwindow : window) {
					
					driver.switchTo().window(newwindow);
					
				}
				
				WebElement Email = driver.findElement(By.xpath("//input[@id='0_signup_email' ]"));
				Email.sendKeys("ballondragon007@gmail.com");
				
				WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
				Password.sendKeys("gowtham007");
				
				WebElement createstore = driver.findElement(By.xpath("//button[text()='Create your store']"));
				createstore.click();
				
				WebElement Errormsg=driver.findElement(By.xpath("//span[text()='Please enter a store name']"));
				
				String actualerrormsg=Errormsg.getText();
				String expectederrormsg="Please enter a store name";
				if(actualerrormsg.equals(expectederrormsg)) {
					System.out.println("Proper Error Message is shown");
				}
				else{
					System.out.println("ImProper Error Message is shown");
				}
				driver.close();


			}

				
}