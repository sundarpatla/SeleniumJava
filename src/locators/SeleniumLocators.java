package locators;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

	@Test
	void idnameclassname() throws Exception {
		
		driver.get("https://www.techlearn.in/wp-login.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user_login")).sendKeys("Sundar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("rememberme")).click();
		
	}
	
	@Test
	void cssselectedlocator() throws Exception {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("Sundar");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#rememberme")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
		
	}
	
	@Test
	void linkedtextandpartiallinkedtextlocators() throws Exception {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost")).click();
		
	}
	
	//find element has return type WebElement
	//findElements has return type List<WebElement>
	
	@Test
	void findelementreturntype() throws Exception {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(2000);
		
		
		WebElement useremail = driver.findElement(By.id("user_login"));
		
		useremail.sendKeys("Sundar");
		
		WebElement pswd = driver.findElement(By.id("user_pass"));
		
		pswd.sendKeys("Hello@123");
		
		WebElement checkbox = driver.findElement(By.id("rememberme"));
		
		checkbox.click();
		
		driver.findElement(By.className("wp-login-lost-password")).click();
			
	}
	@Test
	void totalnumberoflinks() throws Exception {
		
		driver.get("https://www.redmine.org");
		
		Thread.sleep(2000);
		
		List<WebElement> nolinks = driver.findElements(By.tagName("a"));
		
		System.out.println(nolinks.size());
		
		System.out.println("Total number of lnks is "+nolinks.size());
		
	}
	
	@Test
	void totalnumberofimages() throws Exception {
		
		driver.get("https://www.redmine.org");
		
		Thread.sleep(2000);
		
		List<WebElement> noimages = driver.findElements(By.tagName("img"));
		
		System.out.println(noimages.size());
		
		System.out.println("Total number of images is "+noimages.size());
		
	}


}
