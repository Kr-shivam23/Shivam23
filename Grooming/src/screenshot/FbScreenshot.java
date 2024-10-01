package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import generic.Screenshot;

public class FbScreenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		
		Screenshot.sc(driver);
		
		
//		TakesScreenshot t=(TakesScreenshot) driver;
//		Thread.sleep(1000);
//		File src=t.getScreenshotAs(OutputType.FILE);
//		Thread.sleep(1000);
//		
//		File target=new File("C:\\Users\\Administrator\\Desktop\\Screenshot\\Fbdefect.jpeg");
//		Thread.sleep(1000);
//		
//		FileHandler.copy(src, target);
//		Thread.sleep(1000);
//		
//		driver.quit();
	}
}
