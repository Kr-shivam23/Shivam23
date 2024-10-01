package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Kalki");
		WebElement button = driver.findElement(By.id("search-icon-legacy"));
		button.click();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.className("style-scope ytd-video-renderer"));
		link.click();
		
	}
}
