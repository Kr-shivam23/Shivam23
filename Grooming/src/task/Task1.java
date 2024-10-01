package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("samsung s24 ultra 5G", Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement text1= driver.findElement(By.xpath("//span[contains(text(),'Titanium Black, 12GB, 256GB ')]/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/div/a/span[1]/span[2]/span[2]"));
		Thread.sleep(1000);
		
		String t1=text1.getText();
		Thread.sleep(1000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("samsung s24 ultra 5G", Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement text2=driver.findElement(By.xpath(" //div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Black, 256 GB)')]/../following-sibling::div[1]/div[1]/div[1]/div[1]"));
		Thread.sleep(1000);
		
		String t2=text2.getText();
		
		//String a1=t1.replace("₹", "");
		String a2=t2.replace("₹", "");
		
		String T1= t1.replace(",", "");
		String T2=a2.replace(",", "");
		//System.out.println(a1);
		//System.out.println(a2);
		
		long x=Long.parseLong(T1);
		long y=Long.parseLong(T2);
		
		//System.out.println(x);
		//System.out.println(y);
		
		if(x==y)
		{
			System.out.println("Same price");
			
		}
		else
		{
			System.out.println("Sir will give a prize for me");
		}
		
		driver.quit();
	}
}
