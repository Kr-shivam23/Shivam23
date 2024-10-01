package explicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Ddt;

public class Orange 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Ddt.read_ddt("login", 0, 1));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Ddt.read_ddt("login", 1, 1));
		
		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
		
		WebElement home = driver.findElement(By.className("oxd-brand-banner"));
		wait.until(ExpectedConditions.visibilityOf(home));
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']/span[1]")).click();
		
		driver.findElement(By.xpath("//a[.='Apply']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-option']/../div[2]/span[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-calendar-date']/../../div[3]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-calendar-date']/../../div[6]")).click();
		//driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']/div[1])[2]")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div[2]/span")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
