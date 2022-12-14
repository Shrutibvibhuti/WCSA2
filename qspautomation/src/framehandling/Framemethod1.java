package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framemethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
      	
		WebElement frameElement = driver.findElement(By.id("chat-widget"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
        
        WebElement chatWithOurExperts = driver.findElement(By.xpath("//p[contains(text(),'CHAT')]"));
		chatWithOurExperts.click();
		Thread.sleep(2000);
	}

}
