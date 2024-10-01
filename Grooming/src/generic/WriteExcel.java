package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel 
{

	static String path="C:\\Users\\Administrator\\Desktop\\demoqa.xlsx";
	public static void read_ddt(String sheet,int row,int cell,String value)
	{
		Sheet sh;
		try
		{
			FileInputStream fis = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			try 
			{
				sh=book.createSheet(sheet);
			}
			catch (Exception e) 
			{
				System.out.println("Sheet name is same");
				sh= book.getSheet(sheet);
			}
			
			
			sh.createRow(row).createCell(cell).setCellValue(value);
			FileOutputStream fos=new FileOutputStream(path);
			book.write(fos);
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
		
}
