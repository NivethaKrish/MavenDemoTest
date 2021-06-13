package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelUtiltity {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Nivetha Deivendran\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\com\\testdata\\Testdata.xlsx");
		
		
		
		if(!reader.isSheetExist("Login Page"))
		{
			reader.addSheet("Login page");
			
		}

		String citynew =  reader.getCellData("RegTestdata", "city", 4);
		System.out.println(citynew);
		
		int rownew = reader.getCellRowNum("RegTestdata", "city", "St.Louis");
		System.out.println(rownew);
		
		System.out.println(reader.getColumnCount("RegTestdata"));
		System.out.println(reader.getRowCount("RegTestdata"));
		
		
	}

}
