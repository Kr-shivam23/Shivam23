package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("hindi books",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/div[1]/h2[1]/a[1]/span[1]"));
		Thread.sleep(2000);
		List<WebElement> ratings = driver.findElements(By.xpath("//div[@class='a-row a-size-small']/span[1]"));
		Thread.sleep(2000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='a-row']/a[1]/div[1]/span[1]/../preceding-sibling::span[1]/span[2]/span[2]"));
		Thread.sleep(2000);
		int size = names.size();
		Thread.sleep(2000);
		for(int i=0;i<=size-1;i++) 
		{
			WebElement N = names.get(i);
			System.out.println("Name: "+N.getText());
			WebElement R = ratings.get(i);
			System.out.println("Ratings: "+R.getAttribute("aria-label"));
			WebElement P = prices.get(i);
			System.out.println("Prices: "+P.getText());
		
		    System.out.println();
		}
		driver.quit();
	}

}
