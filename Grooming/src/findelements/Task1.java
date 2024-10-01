package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Administrator/Desktop/Selenium/checkbox.html");
		Thread.sleep(1000);
		
		List<WebElement> cbox=driver.findElements(By.tagName("input"));
		int size=cbox.size();
		
		
		for(int i=0;i<size;i++)
		{
			WebElement box = cbox.get(i);
			box.click();
			
		}
		for(int i=size-1;i>=0;i--)
		{

			WebElement box = cbox.get(i);
			box.click();
			
		}
		driver.quit();
	}
		
}
