package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{

		public static void main(String[] args) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
			
			driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Kumar");
			driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Shivam");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Kumar@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("label[class='custom-control-input']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='userNumber']")).sendKeys("7044918480");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input['autocapitalize=none']")).sendKeys("English");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("Qspiders");
			

			


			


	}
}
