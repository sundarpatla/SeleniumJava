package dropdownmenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropdownValues {
	
	WebDriver driver;
	
  @Test
  public void dropdownoptions() throws InterruptedException {
	  
	  driver.get("https://www.redmine.org");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a"));
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("Sundar@123");
	  
	  Thread.sleep(3000);
	  
	  Select obj= new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  
	  obj.selectByContainsVisibleText("Chi");
	  //obj.selectByIndex(6); //Method: selectByIndex  i.e integer
	  //obj.selectByValue("cs");// Method:selectByValue i.e. string
	  //obj.selectByVisibleText("Catalan (Català)");  // Methods: SelectByVisibleText i.e string
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
	  
  
  }

}
