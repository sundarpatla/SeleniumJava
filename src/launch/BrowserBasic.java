package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserBasic {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize(); // driver maximize 
		
		Thread.sleep(3000); // Java Wait command
		
		//driver.manage().window().minimize(); // driver minimize exist only in selenium 4.0
		
		//driver.manage().window().fullscreen(); 
		
		//driver.close(); //only closes the currently active tab or window by automation and throws SocketException error on close.
		
		//driver.quit(); //closes all the tabs or window open by automation software and does not show an error as in driver.close()
		
		
		
		
		
	}

}
