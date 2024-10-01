package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]")).click();
		Thread.sleep(1000);

		
	    driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[2]/div[3]/div[2]/input[1]")).click();
		Thread.sleep(1000);
			
	    WebElement ele=driver.findElement(By.xpath("//div[@id='bar-notification']"));
		boolean dis=ele.isDisplayed();
		if(dis)
		{
			System.out.println("Displayed");
			driver.findElement(By.xpath("//div[@class='add-to-cart']/div[1]/input[2]")).click();
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
			Thread.sleep(1000);

			 
		 }
		 else
		 {
			 System.out.println("Defect");
		 }
			driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[.='Blue Jeans']/../..//div[3]//div[2]//input[1]")).click();
			Thread.sleep(1000);
			WebElement ele1=driver.findElement(By.xpath("//div[@id='bar-notification']"));
			 boolean dis1=ele1.isDisplayed();
			 if(dis1)
			 {
				 System.out.println("Displayed");
				 Thread.sleep(2000);
				// driver.findElement(By.xpath("//div[@class='add-to-cart']/div[1]/input[2]")).click();
					//Thread.sleep(1000);
					driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='updatecart']")).click();
					Thread.sleep(1000);
		
			 }
			 
			WebElement text= driver.findElement(By.xpath("//div[@class='order-summary-content']"));
			System.out.println(text.getText());
			 driver.quit(); 

		
	}
}
