package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlframe1 {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("file:///C:/Users/HP/Desktop/Username.html");
     
     driver.findElement(By.id("un")).sendKeys("admin");
     Thread.sleep(2000);
  
     WebElement frameelement = driver.findElement(By.id("frid"));  //using webelement
     driver.switchTo().frame(frameelement);
     Thread.sleep(2000);
     
     driver.findElement(By.id("pwd")).sendKeys("manager");
     Thread.sleep(2000);
     
	
	
	
	
	
	}
	

}
