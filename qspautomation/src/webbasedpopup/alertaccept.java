package webbasedpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertaccept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///E:/c%20drive%20backup%2026-7-22/Desktop/html%20document/alert.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(2000);
	
        Alert al = driver.switchTo().alert();
        al.accept();
        Thread.sleep(2000);
         
	}

}
