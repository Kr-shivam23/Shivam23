package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Selenium123");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("123456789");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);


		//driver.quit();
	}
}
