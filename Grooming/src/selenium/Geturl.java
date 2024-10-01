package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geturl 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Administrator/Desktop/selenium.html");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		
	}
}
