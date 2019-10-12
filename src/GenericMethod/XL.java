package GenericMethod;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public static String getdata(String path, String sheet, int r, int c) {
		String v = " ";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
			System.out.println("Cell Value " + v);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}

}
