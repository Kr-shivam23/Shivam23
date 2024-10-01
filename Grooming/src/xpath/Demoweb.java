package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoweb
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Blue and green Sneaker')]/../../div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-to-cart']/div[1]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(1000);
		
		
		driver.quit();
	}
}
