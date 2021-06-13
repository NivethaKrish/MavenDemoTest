package com.test.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/calendar");
		String reqdate = "11-june-2020";
		String datearr[] = reqdate.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];
		
		Select select = new Select();
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[3]
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[7]
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/div/div[1]
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/div/div[2]
	}

}
