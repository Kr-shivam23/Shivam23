package orange;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Ddt;
import generic.Orange;
import pom.Pom_class;

public class Orangehrm_test extends Orange
{
	
	@Test()
	public void create()
	{
		Pom_class p=new Pom_class(driver);
		p.username().sendKeys(Ddt.read_ddt("login", 0, 1));
		p.password().sendKeys(Ddt.read_ddt("login", 1, 1));
		p.login().click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Ddt.read_ddt("login", 0, 1));
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Ddt.read_ddt("login", 1, 1));
		
		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		
		driver.findElement(By.xpath("//button[contains(.,' Add ')]")).click();
		
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@role='listbox']/div[3]/span")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("kumar shivam");
		
		driver.findElement(By.xpath("//span[.='kumar  shivam']")).click();
		
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();

		driver.findElement(By.xpath("//span[.='Enabled']")).click();
		//driver.findElement(By.xpath("//label[.='Username']/../following-sibling::div/input")).clear();
		
		driver.findElement(By.xpath("//label[.='Username']/../following-sibling::div/input")).sendKeys("Shivam");
		
		driver.findElement(By.xpath("//label[.='Password']/../following-sibling::div[1]/input")).sendKeys("Shivam@23");
		
		driver.findElement(By.xpath("//label[.='Confirm Password']/../following-sibling::div[1]/input")).sendKeys("Shivam@23");
		
		driver.findElement(By.xpath("//button[.=' Save ']")).click();
		
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();

		driver.findElement(By.xpath("//label[.='Username']/../following-sibling::div/input")).sendKeys("Shivam");
		
		driver.findElement(By.xpath("//button[.=' Search ']")).click();
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		
		driver.findElement(By.xpath("//button[.=' Yes, Delete ']/i")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
