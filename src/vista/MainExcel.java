/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author David
 */
public class MainExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp Info");

        Object empdate[][] = {
            {"EmpID", "Name", "Job"},
            {101, "David", "Enginner"},
            {102, "Maria", "Manager"},
            {102, "Camila", "Analys"}
        };

        //usar loop
        int rows = empdate.length;
        int cols = empdate[0].length;
        System.out.println(rows);
        System.out.println(cols);
        for (int r = 0; r < rows; r++) {
            XSSFRow row = sheet.createRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.createCell(c);
                Object value = empdate[r][c];

                if (value instanceof String) {
                    cell.setCellValue((String) value);
                }
                if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                }
                if (value instanceof Boolean) {
                    cell.setCellValue((Boolean) value);
                }
            }

        }
        String path = "archivoEx.xlsx";
        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream(path);
            workbook.write(outFile);
            outFile.close();
            System.out.println("se guardo con exito");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainExcel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
