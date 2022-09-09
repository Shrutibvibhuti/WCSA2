package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robot1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		Thread.sleep(8000);
		
		WebElement target = driver.findElement(By.xpath("//div[@class='o3j99 qarstb']"));
	    Actions act = new Actions(driver);
	    act.contextClick(target).perform();
	    
	     Robot robot = new Robot();
	     for(int i=0;i<10;i++)
	     {
	    	 
	    	 robot.keyPress(KeyEvent.VK_DOWN);
	    	 robot.keyPress(KeyEvent.VK_DOWN);
	    	 Thread.sleep(1000);
	    	 
	    }
	     robot.keyPress(KeyEvent.VK_ENTER);
    	 robot.keyRelease(KeyEvent.VK_ENTER);
    	 
	
		
	   }

}
