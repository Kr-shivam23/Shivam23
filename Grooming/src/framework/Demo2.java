package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{

	@Test
	public void test1()
	{
		Reporter.log("Shivam",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Kumar",true);
	}
}
