package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/accounts/login/");
	    Thread.sleep(3000);
	    driver.findElement(By.name("username")).sendKeys("shruti");
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("9657763942");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[class*='sqdOP']")).click();



	}

}
