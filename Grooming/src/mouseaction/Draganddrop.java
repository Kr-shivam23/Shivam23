package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
	public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement ele= driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(ele,target).build().perform();
    }
}
