package com.sky.test;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Author: gs_wang
 * @Date: 2024/07/27/下午6:06
 * @Description: 使用POI操作excel文件
 */

//@SpringBootTest
public class POITest {

    // 通过POI创建excel文件并写入内容
    public static void write() throws Exception {
        // 在内存中创建一个excel文件
        XSSFWorkbook excel = new XSSFWorkbook();
        // 在excel文件中创建一个sheet页
        XSSFSheet sheet = excel.createSheet("info");
        // 在sheet页创建行
        XSSFRow row = sheet.createRow(1);
        // 在行上创建单元格并写入内容
        row.createCell(1).setCellValue("姓名");
        row.createCell(2).setCellValue("城市");

        // 创建一个新行
        row = sheet.createRow(2);
        row.createCell(1).setCellValue("张三");
        row.createCell(2).setCellValue("北京");
        row = sheet.createRow(3);
        row.createCell(1).setCellValue("李四");
        row.createCell(2).setCellValue("南京");

        // 通过输入流将内存中的excel写入磁盘
        FileOutputStream out = new FileOutputStream(new File("D:\\Nginx\\info.xlsx"));
        excel.write(out);

        // 关闭资源
        out.close();
        excel.close();
    }

    // 通过POI读excel文件
    public static void read() throws Exception {
        FileInputStream in = new FileInputStream("D:\\Nginx\\info.xlsx");
        XSSFWorkbook excel = new XSSFWorkbook(in);
        // 读取excel中第一个sheet页
        XSSFSheet sheet = excel.getSheetAt(0);
        // 获取sheet页中最后一行的行号(有内容的)
        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);
        for (int i = 1; i <= lastRowNum; i++) {
            // 获得某一行
            XSSFRow row = sheet.getRow(i);
            String stringCellValue1 = row.getCell(1).getStringCellValue();
            String stringCellValue2 = row.getCell(2).getStringCellValue();
            System.out.println(stringCellValue1+","+stringCellValue2);
        }

        in.close();
        excel.close();

    }

    public static void main(String[] args) throws Exception {
//        write();
        read();
    }

}
