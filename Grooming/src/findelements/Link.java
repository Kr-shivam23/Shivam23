package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(size);
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			System.out.println(url);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
