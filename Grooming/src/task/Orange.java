package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Ddt;
import generic.Dropdown;
import generic.Screenshot;

public class Orange 
{
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Ddt.read_ddt("login", 0, 1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Ddt.read_ddt("login", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.className("oxd-brand-banner"));
		Thread.sleep(3000);
		if(home.isDisplayed())
		{
			driver.findElement(By.xpath("//span[contains(.,'PIM')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'Add Employee')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("firstName")).sendKeys(Ddt.read_ddt("employee", 0, 1));
			Thread.sleep(1000);
			driver.findElement(By.name("lastName")).sendKeys(Ddt.read_ddt("employee", 1, 1), Keys.ENTER);
			Thread.sleep(2000);
			
			WebElement confirmation = driver.findElement(By.xpath("//div[@id='oxd-toaster_1']"));
			if(confirmation.isDisplayed())
			{
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[.='Employee List']")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(Ddt.read_ddt("employee", 1, 1));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[.=' Search ']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(.,'Delete')]")).click();
				Thread.sleep(2000);
				
				WebElement con= driver.findElement(By.xpath("//p[.='Successfully Deleted']"));
				if(con.isDisplayed())
				{
					Thread.sleep(2000);
					Screenshot.sc(driver);
					driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[.='Logout']")).click();
					Thread.sleep(1000);
				}
			}
		}
		driver.quit();
	}
}
