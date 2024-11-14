package NewPackageGuvi;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WebElement {

	public void click() {
		// TODO Auto-generated method stub
		File src=new File("C:\\Java files\\Readme.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();

		XSSFSheet sheet=workbook.createSheet("Sheet2");
		XSSFRow heading=sheet.createRow(0);
		heading.createCell(0).setCellValue("Employee Name");
		heading.createCell(1).setCellValue("Age");
		heading.createCell(2).setCellValue("Dept");

		XSSFRow data1=sheet.createRow(1);
		data1.createCell(0).setCellValue("Person1");
		data1.createCell(1).setCellValue("Person2");
		data1.createCell(2).setCellValue("Person3");

		FileOutputStream fis=new FileOutputStream(src);
		workbook.write(fis);
		
	}

}
