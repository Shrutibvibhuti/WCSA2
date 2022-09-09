package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iphone11 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://www.flipkart.com");
	       
	       driver.findElement(By.xpath("//button[.='✕']")).click();
	       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[@class='_4rR01T' and .='APPLE iPhone 11 (Black, 64 GB)']")).click();
	       
	      String parentWindow = driver.getWindowHandle();
	      
	     Set<String> allhandles = driver.getWindowHandles();
	     for(String handle:allhandles)
	        {
	        	System.err.println(handle);   // err used for highlighting the result
	        
	   
	      if(!parentWindow.equals(allhandles))
	      {
	    	  driver.switchTo().window(handle);
	      }
	      else
	      {
	    	  
	      }
	        }
	       driver.findElement(By.xpath("//li[@id='swatch-4-color']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("413521");
	     driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
        Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l 2U9uOA 3v1-ww']")).click();
	     Thread.sleep(3000);
	       
	       
	     WebElement target = driver.findElement(By.xpath("//div[@class=\"_3dsJAO\" and .='Remove']"));
      Actions act = new Actions(driver);
	      act.moveToElement(target).perform();
	     act.click();
	      
	      
	      
	      
	       
	       
	       

	}

}
