package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	
	public static void Create_Sheet() throws Throwable {
		
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven_Project3\\excel.xlsx");
		 FileInputStream fis = new FileInputStream(f);
		 Workbook w = new XSSFWorkbook(fis);
		 
		 Sheet createSheet = w.createSheet("Candidates_List");
		 Row createRow = createSheet.createRow(0);
		 Cell createCell = createRow.createCell(0);
		 createCell.setCellValue("Candidate_Name");
		 w.getSheet("Candidates_List").getRow(0).createCell(1).setCellValue("Candidate_ID");
		 w.getSheet("Candidates_List").getRow(0).createCell(2).setCellValue("Candidate_Major");
		 w.getSheet("Candidates_List").getRow(0).createCell(3).setCellValue("Cut_Off");	 
		
		
		w.getSheet("Candidates_List").createRow(1).createCell(0).setCellValue("Jake Milston");
		w.getSheet("Candidates_List").getRow(1).createCell(1).setCellValue("Jake_001");
		w.getSheet("Candidates_List").getRow(1).createCell(2).setCellValue("EEE");
		w.getSheet("Candidates_List").getRow(1).createCell(3).setCellValue("182");
		
		
		w.getSheet("Candidates_List").createRow(2).createCell(0).setCellValue("John Joseph");
		w.getSheet("Candidates_List").getRow(2).createCell(1).setCellValue("John_002");
		w.getSheet("Candidates_List").getRow(2).createCell(2).setCellValue("B.Tech");
		w.getSheet("Candidates_List").getRow(2).createCell(3).setCellValue("185");
		
		
		w.getSheet("Candidates_List").createRow(3).createCell(0).setCellValue("Maria Anthony");
		w.getSheet("Candidates_List").getRow(3).createCell(1).setCellValue("Maria_003");
		w.getSheet("Candidates_List").getRow(3).createCell(2).setCellValue("Masters");
		w.getSheet("Candidates_List").getRow(3).createCell(3).setCellValue("165");
		
		w.getSheet("Candidates_List").createRow(4).createCell(0).setCellValue("Jasen Max");
		w.getSheet("Candidates_List").getRow(4).createCell(1).setCellValue("jason_004");
		w.getSheet("Candidates_List").getRow(4).createCell(2).setCellValue("M.Tech");
		w.getSheet("Candidates_List").getRow(4).createCell(3).setCellValue("198");
		
		
		w.getSheet("Candidates_List").createRow(5).createCell(0).setCellValue("Mathew Luke");
		w.getSheet("Candidates_List").getRow(5).createCell(1).setCellValue("Kanye_005");
		w.getSheet("Candidates_List").getRow(5).createCell(2).setCellValue("Arch");
		w.getSheet("Candidates_List").getRow(5).createCell(3).setCellValue("186");
		
		
		w.getSheet("Candidates_List").createRow(6).createCell(0).setCellValue("Mettilda Sweet");
		w.getSheet("Candidates_List").getRow(6).createCell(1).setCellValue("Matte_006");
		w.getSheet("Candidates_List").getRow(6).createCell(2).setCellValue("BE.IT");
		w.getSheet("Candidates_List").getRow(6).createCell(3).setCellValue("147");
		
		
		w.getSheet("Candidates_List").createRow(7).createCell(0).setCellValue("Ken Allen");
		w.getSheet("Candidates_List").getRow(7).createCell(1).setCellValue("Ken_007");
		w.getSheet("Candidates_List").getRow(7).createCell(2).setCellValue("M.Tech");
		w.getSheet("Candidates_List").getRow(7).createCell(3).setCellValue("125");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
	
	}
	 public static void main(String[] args) throws Throwable {
		Create_Sheet();
	}
	
	
	
}
