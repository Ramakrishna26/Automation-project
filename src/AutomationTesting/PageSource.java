package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSource {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://redbus.in");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
	}

}
