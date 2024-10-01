package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("hindi books",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/div[1]/h2[1]/a[1]/span[1]"));
		Thread.sleep(2000);
		List<WebElement> ratings = driver.findElements(By.xpath("//div[@class='a-row a-size-small']/span[1]"));
		Thread.sleep(2000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='a-row']/a[1]/div[1]/span[1]/../preceding-sibling::span[1]/span[2]/span[2]"));
		int size = names.size();
		Sheet sheet = null;
		Workbook book = null;
		String path="C:\\Users\\Administrator\\Desktop\\demoqa.xlsx";
		try 
		{
		
			FileInputStream fis= new FileInputStream(path);
			book = WorkbookFactory.create(fis);
			try
			{
				sheet=book.createSheet("Description");
			}
			catch(Exception e)
			{
				sheet=book.getSheet("Description");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for (int i=1;i<size;i++)
		{
			Row r=sheet.createRow(i);
			
			WebElement N = names.get(i);
			Cell c=r.createCell(0);
			String name=N.getText();
			c.setCellValue(name);
			
			WebElement R = ratings.get(i);
			Cell c1=r.createCell(1);
			String rating=R.getAttribute("aria-label");
			c1.setCellValue(rating);
			
			WebElement P = prices.get(i);
			Cell c2=r.createCell(2);
			String price=P.getText();
			c2.setCellValue(price);
			if(price==null)
			{
				
			}
			
			
			FileOutputStream fos= new FileOutputStream(path);
			book.write(fos);
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
//		HashMap<WebElement, String> h=new HashMap<>();
//		int size = names.size();
//		Thread.sleep(2000);
//		for (int i=0;i<size;i++) 
//		{
//			WebElement N = names.get(i);
//			WebElement R = ratings.get(i);
//			WebElement P = prices.get(i);
//			
//			String a = h.put(N, N.getText());
////			h.put(P, R.getAttribute("aria-label") );
////			h.put(R, P.getText());
//			
//			WriteExcel.read_ddt("Description", i, 1, a);
//			
//			//h.put(N, WriteExcel.read_ddt("Description", i, 1, R.getAttribute("aria-label") )) ;
//			//h.put(R, WriteExcel.read_ddt("Description", i, 2, P.getText()));
//			
//			
//			
//			
//			
//			
//			//WriteExcel.read_ddt("Description", i, 1, R.getAttribute("aria-label") );
//			
//			
//			
//			//WriteExcel.read_ddt("Description", i, 2, P.getText());
//			
//		}
//		
//		
//		
//		
////		for(int i=0;i<=size-1;i++) 
////		{
////			WebElement N = names.get(i);
////			System.out.println("Name: "+N.getText());
////			WebElement R = ratings.get(i);
////			System.out.println("Ratings: "+R.getAttribute("aria-label"));
////			WebElement P = prices.get(i);
////			System.out.println("Prices: "+P.getText());
////		
////		    System.out.println();
////		}
//	}
//}
