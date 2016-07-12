package Automation;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class SheetParse {
	private String path; //定义使用的xls文件地址
	private Workbook book;

	public SheetParse(String path) {//定义构造方法
		super();
		this.path = path;
	}
	
	public Sheet sheetMethod(){ //解析工作簿
		File file = new File(this.path);
		try {
			this.book = Workbook.getWorkbook(file);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.book.getSheet(0);
	}

}
