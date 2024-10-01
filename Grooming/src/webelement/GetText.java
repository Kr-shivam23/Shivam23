package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hrx shoes for men", Keys.ENTER);
		Thread.sleep(1000);
		WebElement text= driver.findElement(By.xpath("//span[@class='product-discountedPrice']/../../../../../../li[1]/a/div[2]/div[1]/span[1]/span[1]"));
		Thread.sleep(1000);
		String text1=text.getText();
		Thread.sleep(1000);
		//String t=text1.replace(",", "");
		//System.out.println(t);
		char[] arr= text1.toCharArray();
		//System.out.println(arr);
		for(int i=4;i<arr.length;i++)
		{	
			System.out.print(arr[i]);
		}
		
		driver.quit();
	}
}
