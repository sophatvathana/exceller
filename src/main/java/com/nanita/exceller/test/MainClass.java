package com.nanita.exceller.test;

import com.nanita.exceller.Parser;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainClass {
	public static void main(String[] arg){
		new MainClass().importer();
	}
	
	public void importer(){
		String sheetName = "Sheet1";
		Parser parser = new Parser();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Sample Format.xlsx");
		XSSFSheet sheet = null;
		try {
			sheet = new XSSFWorkbook(inputStream).getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<Header> entityList = parser.create(sheet, sheetName, Header.class);
		Header header = entityList.get(0);
		System.out.println(header.toString());
	}
}
