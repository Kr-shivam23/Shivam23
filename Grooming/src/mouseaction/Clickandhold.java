package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold 
{

	public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele= driver.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(ele).build().perform();
    }
}
