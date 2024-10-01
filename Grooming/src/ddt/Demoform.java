package ddt;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.*;

public class Demoform
{

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
		String f_name=Ddt.read_ddt("Sheet1", 0, 1);
		driver.findElement(By.id("firstName")).sendKeys(f_name);
		driver.findElement(By.id("lastName")).sendKeys(Ddt.read_ddt("Sheet1", 1, 1));
		driver.findElement(By.id("userEmail")).sendKeys(Ddt.read_ddt("Sheet1", 2, 1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(Ddt.read_ddt("Sheet1", 3, 1));
		
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Dropdown.dropdown(month).selectByVisibleText("December");
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Dropdown.dropdown(year).selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//div[.='30']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("Maths", Keys.ENTER);
		WebElement sub = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		Thread.sleep(2000);
		sub.sendKeys("Maths");
		sub.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Sports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\Administrator\\Downloads\\WhatsApp Image 2024-06-29 at 3.44.02 PM (1).jpeg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(Ddt.read_ddt("Sheet1", 8, 1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Haryana']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Panipat']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();


		
		
		
		
		
		
		
		
	}
}
