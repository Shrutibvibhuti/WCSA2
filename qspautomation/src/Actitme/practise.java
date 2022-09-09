package Actitme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-oht1m87/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Settings")).click();
		driver.findElement(By.xpath("//a[contains(text(),' & Color ')]")).click();
		driver.findElement(By.name("colorScheme")).click();
		driver.findElement(By.xpath("//select/ option[.='Red']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		 
	}

}
