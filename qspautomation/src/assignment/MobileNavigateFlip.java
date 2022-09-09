package assignment;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileNavigateFlip {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");//to open flipkart
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='✕']")).click(); //to close the popup
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 12"); //to search on text bar
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();; //to search on text bar
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_4rR01T' and .='APPLE iPhone 12 (Blue, 64 GB)']")).click();
		Thread.sleep(3000);
		
		
      Set<String> alltabs = driver.getWindowHandles();
		
	for(String tab:alltabs)
		{
		
	
		driver.switchTo().window(tab);
			
		}
	
	
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
		Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[.='256 GB']")).click();
	   Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("413521");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
       Thread.sleep(3000);
       driver.navigate().refresh();
       Thread.sleep(3000);
   //    driver.switchTo().frame("Remove")
      

		

		

		}
	}


