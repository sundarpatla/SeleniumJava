package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

class TestThree {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	void redmine() throws Exception {
		
		driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.techlearn.in");

	}
	@Disabled
	@Test
	void facebook() {
		
		driver.get("https://www.facebook.com");

	}
	/*
	 @Disabled is only to skip JUnit version 5
	 
	 @Ignore is used only to skip junit version 3 & 4
	 */
	@Disabled
	@Test
	void twitter() {
		
		driver.get("https://www.x.com");

	}
	@Test
	void google() {
		
		driver.get("https://www.google.com");

	}
	@Disabled
	@Test
	void selenium() {
		
		driver.get("https://www.selenium.dev");

	}
	@Disabled
	@Test
	void gmail() {
		
		driver.get("https://www.gmail.com");

	}
	@Ignore
	@Test
	void swiggy() {
		
		driver.get("https://www.swiggy.com");

	}

}
