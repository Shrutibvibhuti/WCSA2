package framehandling;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Framemethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
	
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		
		
	
		driver.switchTo().frame("chat-widget");
		
		driver.findElement(By.xpath("//p[contains(text(),'CHAT')]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shruti vibhuti");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shrutivibhuti02@gmail.com");

		driver.findElement(By.xpath("(//input[@class='lc-22twvl e1xplv9i0'])[3]")).sendKeys("9657763942");
	}

}
