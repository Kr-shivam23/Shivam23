package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Administrator/Desktop/mainpage.html");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.tagName("input"));
		Thread.sleep(1000);
		ele.sendKeys("Selenium");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("1234");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		ele.clear();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
}
