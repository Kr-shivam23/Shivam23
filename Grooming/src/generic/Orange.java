package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Orange implements Orange_constant
{
	public WebDriver driver;
	
	
	@BeforeMethod
	public void login()
	{
		System.setProperty(Chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
		driver.get(Url);
		//Pom_class p=new Pom_class(driver);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Ddt.read_ddt("login", 0, 1));
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Ddt.read_ddt("login", 1, 1));
		
		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
