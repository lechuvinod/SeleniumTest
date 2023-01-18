package ExcelUtils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelWorks {
    public static String path = "C:\\Software\\Selenium Ddrivers\\TestData.xlsx";

    public static void main(String[] args) {

        readFromExcel(1,1); // read row 1, column 1 data

		/*//for loop to read from excel
		for (int i=1;i<3;i++) {
			for (int j=1;j<3;j++) {
				readFromExcel(i,j);
			}
		}*/

        writeToExcel(1,3,"pass");
    }

    public static void readFromExcel ( int rownum, int colnum) {

        File file = new File (path);
        FileInputStream fileinputStream = null;
        try {
            fileinputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileinputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet("DataSheet");
        XSSFRow row = sheet.getRow(rownum);
        XSSFCell cell = row.getCell(colnum);

        String value = cell.getStringCellValue();
        System.out.println("Value from excel is : " +value);

    }

    public static void writeToExcel (int rownum, int colnum, String result){
        File file = new File(path);
        FileInputStream fileinputStream = null;
        try {
            fileinputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fileinputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        XSSFSheet sheet = workbook.getSheet("DataSheet");
        XSSFRow row = sheet.getRow(rownum);
        XSSFCell cell = row.getCell(colnum);
        if(cell==null)
        {
            cell = row.createCell(colnum);
        }
        cell.setCellValue(result);
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            workbook.write(fileOut);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileOut.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Updated.");
    }
}
