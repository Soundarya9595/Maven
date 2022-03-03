package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver {

	
	public static void Read_ParticularData() throws Throwable {

		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project3\\excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		
		Workbook b = new XSSFWorkbook(fis);
		
		Sheet sheetAt = b.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
		
		
		
		
		
		if (cellType.equals(CellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(CellType.NUMERIC)){
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
			
	}
	
	public static void Read_entireData() throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project3\\excel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println("-----------Entire Table-------------");
		for(int i=0; i<physicalNumberOfRows;i++) {
			
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<physicalNumberOfCells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(" | " +stringCellValue);
				}
				else if(cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.print(" | " + numericCellValue);
					
				}
			}
			System.out.println();
			System.out.println("-------------------------------------------");
		}
		
	}
	
	
	
public static void Column_Data() throws Throwable {
	File  f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project3\\excel.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fis);
	
	Sheet sheetAt = w.getSheetAt(0);
	
	int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	System.out.println("\n  -----Column Data----");
	for (int i=0;i<physicalNumberOfRows;i++) {
		
		Row row = sheetAt.getRow(i);
		//int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for(int j=0;j<=0 ;j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println("  |  "+ stringCellValue );
				System.out.println("  ----------------------");
				
				
			}
			else if(cellType.equals((CellType.NUMERIC))){
				double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);
			}
		}
	}
}



public static void Specific_RowData() throws IOException {

	
	
	
	
	
	File f = new File("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Maven_Project3\\\\excel.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheetAt = wb.getSheetAt(0);
	
	int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	
	Scanner sc  = new Scanner(System.in);

	System.out.println("Enter the Name of the Candidate where yu want to view the entire Row----->");
	
	String input = sc.nextLine();
	
	for (int i =0; i<physicalNumberOfRows;i++) {
		
		Row row = sheetAt.getRow(i);
		
		{
			
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<physicalNumberOfCells;j++) {
				Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String s = cell.getStringCellValue();
				if(row.equals(input)) {
					
					System.out.println(s);
				}
				
			}}
			
		}
		
		
		
		
	}
	
	


}



	public static void main(String[] args) throws Throwable {
		Read_ParticularData();
		Read_entireData();
		Column_Data();
		Specific_RowData();
	}
	
	
	
	
	
	
	
	
	
	
	
}
