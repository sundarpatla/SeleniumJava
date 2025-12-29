package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class TestOne {
	
	static WebDriver driver; //Note: WebDriver will be only created in static if not add static before it in the class

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.quit();
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
		
		driver.get("https://www.google.com");

	}
	@Test
	void selenium() {
		
		driver.get("https://www.selenium.dev");

	}
	@Test
	void gmail() {
		
		driver.get("https://www.gmail.com");

	}

}
