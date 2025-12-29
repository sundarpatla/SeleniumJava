package tabtitleapplicationurlapptext;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTabTitleAppURLAppText {
	
	WebDriver driver;
  @Test
  public void verifyTabTitle() {
	  
	  driver.get("https://www.google.com");
	  
	  String exptabtext = "Google";
	  System.out.println("Expexted Tab Text is "+exptabtext);
	  
	  String acttabtext = driver.getTitle();
	  System.out.println("Actual tab text is "+acttabtext);
	  
	  Assert.assertEquals(exptabtext, acttabtext);
	  
  }
  
  @Test
  public void verifyApplicationURL() {
	  
	  driver.get("https://www.google.com");
	  
	  String expturl = "https://www.google.com/";
	  String acturl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(expturl, acturl);

  }
  
  @Test
  public void verifyApplicationtext() {
	  
	  driver.get("https://www.google.com");
	  
	  String expgtext = "Gmail";
	  String actgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a")).getText();
	  
	  Assert.assertEquals(expgtext, actgtext);
	  
	  String expimgtext = "Images";
	  String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[2]/a")).getText();
	  
	  Assert.assertEquals(expimgtext, actimgtext);
	  


  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
  }

}
