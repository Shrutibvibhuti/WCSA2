package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentframemethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("file:///C:/Users/HP/Desktop/Username.html");
	     
	     driver.findElement(By.id("un")).sendKeys("admin");
	     Thread.sleep(2000);
	     
	     driver.switchTo().frame(0);  //using index
	     
	     driver.findElement(By.id("pwd")).sendKeys("manager");
	     Thread.sleep(2000);
	     
	     driver.switchTo().parentFrame();  //from child window to parent(ie. from current to previous window)
	     Thread.sleep(2000);
 
	     driver.findElement(By.id("un")).clear();
	     Thread.sleep(2000);
	     


	}

}
