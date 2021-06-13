package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\Testdata.xlsx");
		
		String firstname = reader.getCellData("RegTestdata", "firstname", 2);
		System.out.println(firstname);
		
		String lastname = reader.getCellData("RegTestdata", "lastname", 2);
		System.out.println(lastname);
		
		String address1 = reader.getCellData("RegTestdata", "address1", 2);
		System.out.println(address1);
		
		String address2 = reader.getCellData("RegTestdata", "address2", 2);
		System.out.println(address2);
		
		String city = reader.getCellData("RegTestdata", "city", 2);
		System.out.println(city);
		
		String state = reader.getCellData("RegTestdata", "state", 2);
		System.out.println(state);
		
		String zip = reader.getCellData("RegTestdata", "zip", 2);
		System.out.println(zip);
		
		String email = reader.getCellData("RegTestdata", "email", 2);
		System.out.println(email);
		
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement setfirstname = driver.findElement(By.id("firstname"));
		setfirstname.sendKeys(firstname);
		
		WebElement setlastname = driver.findElement(By.id("lastname"));
		setlastname.sendKeys(lastname);
		
		WebElement setaddress1 = driver.findElement(By.id("address1"));
		setaddress1.sendKeys(address1);
		
		
		WebElement setaddress2 = driver.findElement(By.id("address2"));
		setaddress2.sendKeys(address2);
      
		
		WebElement setcity = driver.findElement(By.id("city"));
		setcity.sendKeys(city);
		
		WebElement setstate = driver.findElement(By.id("state"));
		Select select = new Select(setstate);
		select.selectByVisibleText("New Jersey");
		
		
		WebElement setzip = driver.findElement(By.id("zip"));
		setzip.sendKeys(zip);
		
		WebElement setemail = driver.findElement(By.id("email"));
		setemail.sendKeys(email);
		
		WebElement setretypeemail = driver.findElement(By.id("retype_email"));
		setretypeemail.sendKeys(email);
		
		
	}

}
