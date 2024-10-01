package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("samsung s24 ultra 5G", Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement t1= driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../div[3]/ul/li"));
		Thread.sleep(1000);
		
		String a=t1.getText();
		System.out.println(a);
		
		WebElement t2= driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../div[3]/ul/li[2]"));
		String b=t2.getText();
		System.out.println(b);
		Thread.sleep(1000);
		
		WebElement t3= driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../div[3]/ul/li[3]"));
		String c=t3.getText();
		System.out.println(c);
		Thread.sleep(1000);
		
		WebElement t4= driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../div[3]/ul/li[4]"));
		String d=t4.getText();
		System.out.println(d);
		Thread.sleep(1000);
		
		WebElement t5= driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../div[3]/ul/li[5]"));
		String e=t5.getText();
		System.out.println(e);
		Thread.sleep(1000);
		
		WebElement t6= driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../div[3]/ul/li[6]"));
		String f=t6.getText();
		System.out.println(f);
		
		driver.quit();
	}
}
