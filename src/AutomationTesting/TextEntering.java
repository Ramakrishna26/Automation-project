package AutomationTesting;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextEntering 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("hyd");
		java.util.List<WebElement>cities;
		cities = driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println(cities.size());
		for (int i = 0; i < cities.size(); i++) 
		{
			String cityname = cities.get(i).getText();
			System.out.println(cityname);
			
		}

	}

}
