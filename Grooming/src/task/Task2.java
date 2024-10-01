package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("samsung s24 ultra 5G", Keys.ENTER);
		Thread.sleep(1000);
		
	    WebElement a= driver.findElement(By.xpath("//span[contains(text(),'Titanium Black, 12GB, 256GB ')]/../../../following-sibling::div[1]/div/span/span/a/i/span"));
	    Thread.sleep(1000);
	    //Actions ac=new Actions(driver);
	    //ac.moveToElement(a);
	    //WebElement text=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']"));
	    
	    String text=a.getText();
		System.out.println(text);
	}
}
