package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt 
{
	static String value=null;
	static String path="C:\\Users\\Administrator\\Desktop\\Orange.xlsx";
	public static String read_ddt(String sheet,int row,int cell)
	{
		try
		{
			FileInputStream fis=new FileInputStream(path);
			value=WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).toString();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return value;
		
		
	}
}
