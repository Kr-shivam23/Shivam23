package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Orange;

public class Leave extends Orange
{
	
	@Test()
	public void leave()
	{
		driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']/span[1]")).click();
		driver.findElement(By.xpath("//a[.='Apply']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-option']/../div[2]/span[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-calendar-wrapper']/div[3]/div[13]")).click();
		WebElement to = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		to.click();
		to.sendKeys(Keys.CONTROL+"AX");
		to.sendKeys("2024-19-09");
		to.sendKeys(Keys.TAB);
		
		//driver.findElement(By.xpath("//div[@class='oxd-calendar-wrapper']/div[3]/div[19]")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-calendar-wrapper']/div[3]/div[16]")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input' and .='-- Select --']")).click();
		driver.findElement(By.xpath("//span[contains(.,'All Days')]")).click();
		driver.findElement(By.xpath("//div[.='-- Select --' and @class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//span[.='Half Day - Morning']")).click();
		driver.findElement(By.tagName("//textarea")).sendKeys("Operatioan");
		driver.findElement(By.xpath("//button[.=' Apply ']"));
		
		
	}
}
