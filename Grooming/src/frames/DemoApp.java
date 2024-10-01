package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl']"));
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		Thread.sleep(1000);
		un.click();
		un.sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
		driver.quit();

		

		
		
		
		
		
	}
}
