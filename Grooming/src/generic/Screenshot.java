package generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	static String path="C:\\Users\\Administrator\\Desktop\\Screenshot\\";
	public static void sc(WebDriver driver)
	{
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replace(":", "-");
		try
		{
			TakesScreenshot t=(TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File target=new File(path+date+ ".jpeg");
			FileHandler.copy(src, target);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
