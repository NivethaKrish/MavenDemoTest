package com.test.utility;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearchHandle {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("http://www.google.com");

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
				
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				List <WebElement> list = driver.findElements(By.xpath("//div[@class='aajZCb']//child::ul[@role='listbox']"));
				System.out.println(list.size());
				
				for(int i=0;i<=list.size();i++)	
				{
					System.out.println(list.get(i).getText());
					if(list.get(i).getText().contains("java tutorial"))
					{
						list.get(i).click();
						break;
					}
				}
				
				
			}

		
	

}
