package com.test.utility;
import java.util.ArrayList;
import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getExcelData()
	{
	ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
		try	{
		reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\Testdata.xlsx");
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	
	for( int rownum=2; rownum<=reader.getRowCount("RegTestdata"); rownum++ )
	{
		String firstname = reader.getCellData("RegTestdata", "firstname", rownum);
		String lastname = reader.getCellData("RegTestdata", "lastname", rownum);
		String address1 = reader.getCellData("RegTestdata", "address1", rownum);
		String address2 = reader.getCellData("RegTestdata", "address2", rownum);
		String city = reader.getCellData("RegTestdata", "city", rownum);
		String state = reader.getCellData("RegTestdata", "state", rownum);
		String zip = reader.getCellData("RegTestdata", "zip", rownum);
		String email = reader.getCellData("RegTestdata", "email", rownum);
		
		Object ob[] = {firstname,lastname,address1,address2,city,state,zip,email};
		myData.add(ob);
		
				
	}
		return myData;
	}
}
