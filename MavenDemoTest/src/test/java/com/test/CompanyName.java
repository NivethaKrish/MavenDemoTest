package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class CompanyName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\EbayData.xlsx");
		if(!reader.isSheetExist("w3schools"))
		{
		reader.addSheet("w3schools");
		reader.addColumn("w3schools", "Companyname");
		}
	
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		List<WebElement> rowlist = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr"));
		int rowcount = rowlist.size();
		
		for(int i=2;i<rowcount;i++)
		{
		String actualxpath = beforexpath + i + afterxpath;
		System.out.println(actualxpath);
		String companyname = driver.findElement(By.xpath(actualxpath)).getText();
		reader.setCellData("w3schools", "Companyname", i, companyname);
	}

}
}
