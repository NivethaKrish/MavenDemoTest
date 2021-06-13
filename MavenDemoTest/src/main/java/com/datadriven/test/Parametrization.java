package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class Parametrization {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\Testdata.xlsx");
		
		int row = reader.getRowCount("RegTestdata");
		reader.addColumn("RegTestdata", "Status 21 April 2021");
		
		for(int rownum=2;rownum<=row;rownum++)
		{
			String firstname = reader.getCellData("RegTestdata", "firstname", rownum);
			System.out.println(firstname);
			
			String lastname = reader.getCellData("RegTestdata", "lastname", rownum);
			System.out.println(lastname);
			
			String address1 = reader.getCellData("RegTestdata", "address1", rownum);
			System.out.println(address1);
			
			String address2 = reader.getCellData("RegTestdata", "address2", rownum);
			System.out.println(address2);
			
			String city = reader.getCellData("RegTestdata", "city", rownum);
			System.out.println(city);
			
			String state = reader.getCellData("RegTestdata", "state", rownum);
			System.out.println(state);
			
			String zip = reader.getCellData("RegTestdata", "zip", rownum);
			System.out.println(zip);
			
			String email = reader.getCellData("RegTestdata", "email", rownum);
			System.out.println(email);
			
			System.out.println("**************");
			
			
			
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("firstname")).clear();
			WebElement setfirstname = driver.findElement(By.id("firstname"));
			setfirstname.sendKeys(firstname);
			
			driver.findElement(By.id("lastname")).clear();
			WebElement setlastname = driver.findElement(By.id("lastname"));
			setlastname.sendKeys(lastname);
			
			
			driver.findElement(By.id("address1")).clear();
			WebElement setaddress1 = driver.findElement(By.id("address1"));
			setaddress1.sendKeys(address1);
			
			driver.findElement(By.id("address2")).clear();
			WebElement setaddress2 = driver.findElement(By.id("address2"));
			setaddress2.sendKeys(address2);
	      
			driver.findElement(By.id("city")).clear();
			WebElement setcity = driver.findElement(By.id("city"));
			setcity.sendKeys(city);
			
			
			WebElement setstate = driver.findElement(By.id("state"));
			Select select = new Select(setstate);
			select.selectByVisibleText("New Jersey");
			
			driver.findElement(By.id("zip")).clear();
			WebElement setzip = driver.findElement(By.id("zip"));
			setzip.sendKeys(zip);
			
			driver.findElement(By.id("email")).clear();
			WebElement setemail = driver.findElement(By.id("email"));
			setemail.sendKeys(email);
			
			driver.findElement(By.id("retype_email")).clear();
			WebElement setretypeemail = driver.findElement(By.id("retype_email"));
			setretypeemail.sendKeys(email);
			
			reader.setCellData("RegTestdata", "Status 21 April 2021" , rownum, "Pass");
		}
	}

}
