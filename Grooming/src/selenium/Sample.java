package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.cricbuzz.com");
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		
	}
}
