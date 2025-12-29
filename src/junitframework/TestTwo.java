package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class TestTwo {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	void redmine() {
		
		driver.get("www.redmine.org");

	}

	@Test
	void facebook() {
		
		driver.get("https://www.facebook.com");

	}
	@Test
	void twitter() {
		
		driver.get("https://www.x.com");

	}
	@Test
	void google() {
		
		driver.get("www.google.com");

	}
	@Test
	void selenium() {
		
		driver.get("https://www.selenium.dev");

	}
	@Test
	void gmail() {
		
		driver.get("www.gmail.com");

	}
	
	@Test
	void swiggy() {
		
		driver.get("https://www.swiggy.com");

	}

}
