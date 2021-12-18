package demoweb_utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_Utils 
{
	public static WebDriver driver;
	public static String url = "";
	public static void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	public static void closeApplication()
	{
		driver.close();
	}

}
