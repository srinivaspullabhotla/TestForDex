package com.webroot.misc.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import org.openqa.selenium.*;
//import org.testng.*;

public class DataDrivenCode {
	//Using DataProvider
	//@DataProvider(name=PMSDeploymentSystemData)
	public Object[][] passData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin1";
		data[0][1] = "demo1";
		
		data[1][0] = "admin2";
		data[1][1] = "demo2";
		
		data[2][0] = "admin2";
		data[2][1] = "demo2";
		
		return data;
		//using this dataprovider with the number of columns, 
		//create two arguments and pass them in the actual code 
		//where it supposed to be sent
	}
	
	//using the Apache POI and excel sheet writing the DataDriven Tests
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File source = new File("path to the file");
		FileInputStream inputSource = new FileInputStream(source);
		//XSSFWorkbook wb = new XSSFWorkbook(inputSource);
		//XSSFSheet sh1 = wb.getSheetAt(0);
		//sh1.getRow(0).getCell(0).getStringCellValue;
		//String data0 = 
		
		
	}
	
	//public static String[][] readExcel (String filename, String sheetname) throws FileNotFoundException{
		
		
		//File file = new File("path to the file");
		//FileInputStream inputSource = new FileInputStream(file);
		
		//Workbook wb = XSSFWorkbook(inputSource);
		//org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Data");
		
		//int rowNum = sh.getLastRowNum() + 1;
		//int colNum = sh.getRow(0).getLastCellNum();
		
		//String[][] data = new String[rowNum][colNum];
		
		//for (int i=0; i<rowNum; i++) {
			
			//Row row = sh.getRow(i);
			
			//for(int j=0; j<colNum; j++) {
				
				//String value = row.getCell(j).getStringCellValue();
				//data[i][j] = value;
			//}
			
		//}
		
		//return data;
		
		
	}
	

//}
