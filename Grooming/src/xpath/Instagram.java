package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[.='Log In']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("whiskey_the_dumb_dog");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shapoorji@1403");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[.='Save info']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[name()='svg' and .='Search']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("niranjan_ka_18");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(.,'niranjan_ka_18')]")).click();
		//Thread.sleep(1000);
		
	    //driver.findElement(By.xpath("//div[.='Follow' and @class='_ap3a _aaco _aacw _aad6 _aade']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x6ikm8r x10wlt62 x1iyjqo2 x2lwn1j xeuugli xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']/div[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[.='Message...'])[3]")).sendKeys("HI sir");

		
		
		//driver.quit();
		
		
		
		
		
		
	}
}
