package actionclassprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RCDCDDMOKF {
	
	WebDriver driver;
	
  @Test
  public void rightclick() throws InterruptedException {
	  
	  driver.get("https://techlearn.in");
	  
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-18\"]/a"))).build().perform();
	  
	  }
  
  @Test
  public void doubleclick() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  
	  //Either directly using double click or using moveTOElement and then double click can be used both ways.
	  
	  //act.doubleClick(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).build().perform();
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-3320\"]/div/div/div/div/div/div/button"))).doubleClick().build().perform();
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
	  
	  }
  
  @Test
  public void draganddrop() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	  
	  WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
	  
	  act.dragAndDrop(source, target).build().perform();
	  
	  
	  
	  }
  
  @Test
  public void mouseover() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in");
	  
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	  
	  Thread.sleep(2000);
	  
	  //in the movetoelement also we can perform click method or by normal method also we can click.
	  
	  //driver.findElement(By.xpath("//*[@id=\"mega-menu-item-43\"]/a")).click();
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-43\"]/a"))).click().build().perform();
	  
	  }
  
  @Test
  public void keyboardfunctions() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/admin");
	  
	  Thread.sleep(3000);
	  
	  Actions act = new Actions(driver);
	  
	  //act.sendKeys(Keys.TAB).build().perform();
	  
	  act.sendKeys(Keys.ENTER).build().perform();
	  
	  }
  
  @Test
  public void keyboardfunctions1() throws InterruptedException {
	  
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(3000);
	  
	  //driver.findElement(By.name("q")).sendKeys("Tirupati");
	  
	  //Thread.sleep(1000);
	  
	  //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
	  // Instead merge both into one by adding +
	  
	  driver.findElement(By.name("q")).sendKeys("Tirupati"+Keys.ENTER);
	  
	  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();  
	  
  }

}

/** using action class we can perform below features.
 * 
 * 1.Right Click: 2.Double click: 3.Drag & drop: 4.Mouse over: 5.Keyword functions:
 */
