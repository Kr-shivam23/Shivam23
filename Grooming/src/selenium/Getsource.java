package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getsource 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/Administrator/Desktop/selenium.html");
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.quit();
		
		
	}
}
