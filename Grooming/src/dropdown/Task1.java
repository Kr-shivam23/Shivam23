package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Dropdown;

public class Task1
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
		
		WebElement dp1= driver.findElement(By.id("products-orderby"));
		Select s1=Dropdown.dropdown(dp1);
		s1.selectByVisibleText("Name: A to Z");
		
		Thread.sleep(2000);
		
		WebElement dp2= driver.findElement(By.name("products-pagesize"));
		Select s2=Dropdown.dropdown(dp2);
		s2.selectByVisibleText("4");
		
		Thread.sleep(2000);
		
		WebElement dp3= driver.findElement(By.id("products-viewmode"));
		Select s3=Dropdown.dropdown(dp3);
		s3.selectByVisibleText("List");
		
		Thread.sleep(2000);
		

	    driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[2]/div[3]/div[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-to-cart']/div[1]/input[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button-5")).click();
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
