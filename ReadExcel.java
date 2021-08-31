package FilesOperations;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("eFile.xls");
		
		HSSFWorkbook hw = new HSSFWorkbook(fs);
		
		HSSFSheet hs = hw.getSheetAt(0);
		
		//FormulaEvaluator fe = hw.getCreationHelper().createFormulaEvaluator();
		
		for(Row row : hs) {
			for(Cell cell : row) {
				switch(cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				}
			}
			System.out.println();
		}
		
	}

}
