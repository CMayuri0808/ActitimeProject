package com.Actitime.Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_lib {
	String path="./Testdata/commondata.property";
	public String readdatafromPropertyfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
	return value;
	}
	
	
	public String readdatafromExcelfile(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis1 =new FileInputStream("./Testdata/testdataa.xlsx");
	Workbook wb=WorkbookFactory.create(fis1);
	String value=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
	
	

}