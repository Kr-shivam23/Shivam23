package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilepricetext 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("samsung s20 fe5g", Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement text= driver.findElement(By.xpath("//div[@id='a-page']/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]"));
		String text1=text.getText();
		String t=text1.replace(",", "");
		System.out.println(t);
		//System.out.println(text1);
		/*char[] t=text1.toCharArray();
		for(int i=0;i<t.length;i++)
		{
			if(i==2)
			{
				
			}
			else
			{
				System.out.print(t[i]);
			}
		}
		
		Thread.sleep(5000);
		driver.quit();*/
				
				//div[@id='a-page']/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]			

	}
}
