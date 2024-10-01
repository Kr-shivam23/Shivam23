package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl ']"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234",Keys.TAB,Keys.ENTER);

		Thread.sleep(2000);
		driver.quit();
	}
}
