package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		
		WebElement c = driver.findElement(By.xpath("//a[.='Careers']"));
//		Point location = c.getLocation();
//		int x = location.getX();
//		String x1 = Integer.toString(x);
//		
//		int y = location.getY();
//		String y1 = Integer.toString(y);
//	
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", c);
		
		
		
		
		
		
		
		
	}

}
