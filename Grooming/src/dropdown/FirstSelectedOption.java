package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Administrator/Desktop/Selenium/Party.html");
		Thread.sleep(1000);
		
		WebElement dp=driver.findElement(By.id("Party"));
		Select s=new Select(dp);
		s.selectByValue("4");
		Thread.sleep(1000);
		s.selectByValue("7");
		s.selectByValue("3");
		
		WebElement first_opt = s.getFirstSelectedOption();
		System.out.println(first_opt.getText());
		driver.quit();
	}
}
