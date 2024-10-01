package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse 
{
	public static Actions action(WebDriver driver) 
	{
		Actions a=new Actions(driver);
		return a;
	}

}
