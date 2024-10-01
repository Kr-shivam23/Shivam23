package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public  static Select dropdown(WebElement dp)
	{
		Select s=new Select(dp);
		return s;
	}

}
