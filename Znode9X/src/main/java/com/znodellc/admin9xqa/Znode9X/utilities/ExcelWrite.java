package com.znodellc.admin9xqa.Znode9X.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void WriteTheExcel(String data, int row) throws IOException
	{
		File src=new File(".//TestData/LoginTestData.xlsx");
		 
		   // load file
		       FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		       XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		       XSSFSheet sh1= wb.getSheetAt(1);
		       
		       sh1.getRow(row).getCell(9).setCellValue(data);
		       
		      
		       fis.close();
				
				FileOutputStream outFile =new FileOutputStream(src);
				wb.write(outFile);
				outFile.close();
		       
	}
}
 