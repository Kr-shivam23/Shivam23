package screenshot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Screenshot;

public class DemoWebshop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[2]/div[3]/div[2]/input[1]")).click();
//		Thread.sleep(1000);
			
		List<WebElement> carts;
		
		try
		{
			Thread.sleep(1000);
			carts=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		}
		catch(StaleElementReferenceException e)
		{
			Thread.sleep(1000);
			e.printStackTrace();
			Thread.sleep(1000);
			carts=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		}
		
		for (WebElement cart : carts)
		{
			Thread.sleep(1000);
			cart.click();
			Thread.sleep(1000);
			WebElement ele=driver.findElement(By.xpath("//div[@id='bar-notification']"));
			Thread.sleep(1000);
			boolean dis=ele.isDisplayed();
			Thread.sleep(1000);
			if(!dis)
			{
				Thread.sleep(1000);
				System.out.println("Defect");
				Thread.sleep(1000);
				Screenshot.sc(driver);
				Thread.sleep(1000);
				driver.navigate().back();
			}
			else
			{
				System.out.println("Displayed");
			}
			
		}
		
		
		
		
		
		
			 
		
		
	}
}
