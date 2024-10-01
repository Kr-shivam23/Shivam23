package navigate;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resolution
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/?hl=en");
//		Dimension d=new Dimension(1366, 768);
//		Dimension d=new Dimension(1360, 768);
//		Dimension d=new Dimension(1280, 768);
//		Dimension d=new Dimension(1280, 720);
//		Dimension d=new Dimension(1024, 768);
		Dimension d=new Dimension(800, 600);
		
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.quit();
	}
}
