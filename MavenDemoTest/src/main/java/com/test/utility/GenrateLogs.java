package com.test.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenrateLogs {
	

	public static void main(String[] args) {
		WebDriver driver;
		Logger log = Logger.getLogger(GenrateLogs.class);
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		driver =new ChromeDriver();
		log.info("Browser launched");
		
		driver.get("http://www.google.com");
		log.info("Url Loaded");
		log.warn("Warning");
		log.fatal("Fatal message");
		log.debug("debug");
		
		String title = driver.getTitle();
		
		if(title.equals("Google"))
		{
			System.out.println("Correct");
			log.info("Correct");
		}
		
		else
		{
			System.out.println("Incorrect");
			log.info("Incorrect");
		}
		
		driver.quit();
		log.info("Browser closed");
		

	}

}
