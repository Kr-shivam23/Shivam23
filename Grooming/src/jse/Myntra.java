package jse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{
	 public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Hrx shoes", Keys.ENTER);
			Thread.sleep(1000);
			WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
			Thread.sleep(1000);
			Actions a=new Actions(driver);
			Thread.sleep(1000);
			a.moveToElement(sort).build().perform();
			Thread.sleep(1000);
			//div[@class='sort-sortBy']/ul/li[2]
			WebElement n = driver.findElement(By.xpath("//input[@value='new']"));
			Thread.sleep(1000);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(1000);
			js.executeScript("arguments[0].click();", n);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='results-base']/li[1]")).click();
			Thread.sleep(2000);
			String parent=driver.getWindowHandle();
			Thread.sleep(2000);
			Set<String> ids = driver.getWindowHandles();
			Thread.sleep(2000);
			for (String id : ids) 
			{
				Thread.sleep(2000);
				if(!id.equals(parent))
				{
					Thread.sleep(2000);
					driver.switchTo().window(id);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@class='size-buttons-size-buttons']/div[3]/div[1]/button/p")).click();
					//div[@class='size-buttons-size-buttons']/div[3]/div[1]/button/p
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[@href='/checkout/cart']/span[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[.='REMOVE']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@role='dialog']/div/div/div[2]/div[1]/button")).click();
					Thread.sleep(2000);
				}
			}
			
			driver.quit();
			
//			try
//			{
//				
//				Actions a1=new Actions(driver);
//				a1.moveToElement(shoe).build().perform(); 
//				Thread.sleep(1000);
//				WebElement wl = driver.findElement(By.xpath("//span[.='VIEW SIMILAR']/../../../li[1]/div[3]/span/span"));
//				Thread.sleep(1000);
//				js.executeScript("arguments[0].click();", wl);
//				Thread.sleep(1000);
//			}
//			catch(StaleElementReferenceException e)
//			{
//				e.printStackTrace();
//			}
		}

}
