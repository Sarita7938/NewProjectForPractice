package pages;

import static constants.ThreadConstants.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import static Utilities.listeners.prop;

public class jurisdictionNameStoreInExcelFile_Pom {
    public static String jurisdictionName;
    public static String userID;
    public static String userEmail;
    

    public jurisdictionNameStoreInExcelFile_Pom() {
        PageFactory.initElements(driver.get(), this);
    }

    public void jurisdictionInfoStoreInExcel(String jurisdictionName, int cell1) {
        String filePath = System.getProperty("user.dir") + "//ExcelFile//DataOutPut.xlsx";
        int rowNum = 1;
        int jurisdictionNameColNum = cell1;
        try (FileInputStream fileIn = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileIn)) {
            Sheet sheet = workbook.getSheet(prop.getProperty("Sheet_name"));
            Row row = sheet.getRow(rowNum);
            if (row == null) {
                row = sheet.createRow(rowNum);
            }
            Cell userIdCell = row.getCell(jurisdictionNameColNum);
            if (userIdCell == null) {
                userIdCell = row.createCell(jurisdictionNameColNum);
            }
            userIdCell.setCellValue(jurisdictionName);

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void storedSeededUserInfoStoreInExcel(String registrarId, int cell1, String emailId, int cell2) {
        String filePath = System.getProperty("user.dir") + "//ExcelFile//DataOutPut.xlsx";
        int rowNum = 1;
        try (FileInputStream fileIn = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileIn)) {
            Sheet sheet = workbook.getSheet("JurisdictionsInformation");
            Row row = sheet.getRow(rowNum);
            if (row == null) {
                row = sheet.createRow(rowNum);
            }
            Cell userIdCell = row.getCell(cell1);
            if (userIdCell == null) {
                userIdCell = row.createCell(cell1);
            }
            userIdCell.setCellValue(registrarId);

            Cell userEmailCell = row.getCell(cell2);
            if (userEmailCell == null) {
                userEmailCell = row.createCell(cell2);
            }
            userEmailCell.setCellValue(emailId);

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fetchStoredJurisdictionNameValue(int cell1) {
        String filePath = System.getProperty("user.dir") + "//ExcelFile//DataOutPut.xlsx";
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet("JurisdictionsInformation");
            Row row = sheet.getRow(1);
            Cell cellJurisdictionID = row.getCell(cell1);
            jurisdictionName = cellJurisdictionID.getStringCellValue();
            System.out.println("Fetched value from Excel name: " + jurisdictionName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jurisdictionName;
    }

    public void fetchSeededUserStoredIDAndEmailValue(int cell2, int cell3) {
        String filePath = System.getProperty("user.dir") + "//ExcelFile//DataOutPut.xlsx";
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet("JurisdictionsInformation");
            Row row = sheet.getRow(1);
            Cell userIdCell = row.getCell(cell2);
            Cell userEmailCell = row.getCell(cell3);
            userID = userIdCell.getStringCellValue();
            userEmail = userEmailCell.getStringCellValue();
            System.out.println("Fetched UserID from Excel: " + userID);
            System.out.println("Fetched UserEmail from Excel: " + userEmail);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String fetchStoredJurisdictionNameValueForSheet1(String sheetName , int cell1) {
        String filePath = System.getProperty("user.dir") + "//ExcelFile//DataOutPut.xlsx";
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(1);
            Cell cellJurisdictionID = row.getCell(cell1);
            jurisdictionName = cellJurisdictionID.getStringCellValue();
            System.out.println("Fetched value from Excel name: " + jurisdictionName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jurisdictionName;
    }
}
