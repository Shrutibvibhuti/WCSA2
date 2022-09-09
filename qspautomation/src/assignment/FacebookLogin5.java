package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/login/");
	    driver.findElement(By.id("email")).sendKeys("9657763942");
	    driver.findElement(By.id("pass")).sendKeys("9657763942");
	    Thread.sleep(3000);
	    driver.findElement(By.id("loginButton")).click();



	}

}
