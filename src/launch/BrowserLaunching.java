package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserLaunching {

	public static void main(String[] args) {
		
		//WebDriver driver = new EdgeDriver();
		
		/*
		 Here WebDriver = Interface
		 	  driver = object
		 	  = means operator
		 	  new = keyword
		 	  EdgeDriver()/ChromeDriver()/FirefoxDriver() = class
		 */
		// Interface can be WebDriver/ChromeDriver/FirefoxDriver
		//EdgeDriver driver = new EdgeDriver();
		
		//ChromeDriver driver = new ChromeDriver()
		
		//driver.get("https://google.com");	
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("www.google.com");

	}

}
