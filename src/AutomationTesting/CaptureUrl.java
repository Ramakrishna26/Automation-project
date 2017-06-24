package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureUrl 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://irctc.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
