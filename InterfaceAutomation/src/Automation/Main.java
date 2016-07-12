package Automation;

import jxl.Sheet;

public class Main {
	public static void main(String[] args) {
		SheetParse sheetParse = new SheetParse("C:\\Users\\xu\\Desktop\\Interface_automation.xls");
		Sheet sheet = sheetParse.sheetMethod();
		UrlParse urlParse = new UrlParse();
		String str = "";
		for (int i =1;i<sheet.getRows();i++){
			for (int j = 0;j<sheet.getColumns();j++){
				str = str + sheet.getCell(j, i).getContents();
			}
			String BaseUrl = Config.base+str; 
			urlParse.setUrl(BaseUrl);
			System.out.println(urlParse.sentPost(""));
		}
	}

}
