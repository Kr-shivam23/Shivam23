package orange;

import org.testng.annotations.Test;

import generic.Ddt;
import generic.Orange;
import pom.Pom_class;

public class Pim extends Orange
{
	@Test()
	public void employee()
	{	
		Pom_class p=new Pom_class(driver);
		
		p.pim().click();
		p.add().click();
		p.fname().sendKeys(Ddt.read_ddt("employee", 0, 1));
		p.save().click();
		p.employeelist().click();
		p.ename().sendKeys(Ddt.read_ddt("employee", 1, 1));
		p.search().click();
		p.delete().click();
		p.yes_delete().click();
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//span[contains(.,'PIM')]")).click();
//		
//		driver.findElement(By.xpath("//a[contains(.,'Add Employee')]")).click();
//		
//		driver.findElement(By.name("firstName")).sendKeys(Ddt.read_ddt("employee", 0, 1));
//		
//		driver.findElement(By.name("lastName")).sendKeys(Ddt.read_ddt("employee", 1, 1), Keys.ENTER);
//		
//		driver.findElement(By.xpath("//a[.='Employee List']")).click();
//			
//			
//		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(Ddt.read_ddt("employee", 1, 1));
//		driver.findElement(By.xpath("//button[.=' Search ']")).click();
//		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
//		driver.findElement(By.xpath("//button[contains(.,'Delete')]")).click();
//			
//		Screenshot.sc(driver);
//		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
//		driver.findElement(By.xpath("//a[.='Logout']")).click();
	
}
