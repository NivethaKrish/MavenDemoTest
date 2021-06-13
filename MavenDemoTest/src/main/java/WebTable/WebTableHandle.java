package WebTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class WebTableHandle {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver","C://Users//Nivetha Deivendran//Downloads//chromedriver_win32//chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				
				/*List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customer']//tr"));
				int rowcount = rows.size();
				System.out.println(rowcount);				
				
		*/
				String companybeforexpath = "//*[@id=\"customers\"]/tbody/tr[";
				String companyafterxpath = "]/td[1]";
				
				String contactbeforexpath = "//*[@id=\"customers\"]/tbody/tr[";
				String contactafterxpath = "]/td[2]";
				
				Xls_Reader reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\Testdata.xlsx");
				reader.addSheet("companydata");
				reader.addColumn("companydata", "company");
				reader.addColumn("companydata","contact");
				
				for (int i=2;i<=7;i++)
				{

						String companyactualxpath = companybeforexpath + i + companyafterxpath;
						
						WebElement com = driver.findElement(By.xpath(companyactualxpath));
						String Company = com.getText();
						System.out.println(Company);
						reader.setCellData("companydata", "company", i, Company);
						
						String contactctualxpath = contactbeforexpath + i + contactafterxpath;
						WebElement con = driver.findElement(By.xpath(contactctualxpath));
						String contact = con.getText();
						System.out.println(contact);
						reader.setCellData("companydata", "contact", i, contact);
						System.out.println("*********************************************");
				
				}

	}

}
