package shweta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
			driver.get("https://www.google.com");

	}

}
