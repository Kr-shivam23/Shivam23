package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String path="C:\\Users\\Administrator\\Desktop\\demoqa.xlsx";
		FileInputStream fis= new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet=book.createSheet("Amazon_links");
        System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		int i=0;
		for (WebElement link : all_links) 
		{
			Row r=sheet.createRow(i);
			Cell c=r.createCell(0);
			String href = link.getAttribute("href");
			c.setCellValue(href);
			FileOutputStream fos= new FileOutputStream(path);
			book.write(fos);
			i++;
			
		}
	}
}
