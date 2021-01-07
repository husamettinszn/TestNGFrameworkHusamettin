package com.techproed.tests;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D35_WriteExcel {
    @Test
    public void writeExcel() throws IOException {

        String path="src/test/java/com/techproed/recourses/baskentler.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(8));

        workbook.getSheetAt(0).getRow(0).createCell(6).setCellValue("neyi meshur");

        workbook.getSheetAt(0).getRow(1).createCell(6).setCellValue("ordek");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);


    }
}
