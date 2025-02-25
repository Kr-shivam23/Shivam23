package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{
	public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele= driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(ele).build().perform();
    }

}
