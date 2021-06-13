package com.test.utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("nivethaQA");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test@1234");
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		
		//clickElementByJs(driver,login);
		drawBorder(driver,login);
		generateAlert(driver,"Login not working" );
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Completed");
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\test\\utility\\element.png"));
		
	}
	
	
	public static void clickElementByJs(WebDriver driver,WebElement Element )
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", Element);
		
	}
	
	public static void drawBorder(WebDriver driver,WebElement Element )
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", Element);
		
	}
	
	public static void generateAlert(WebDriver driver,String Message )
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('" + Message + "')");
		
	}
}
