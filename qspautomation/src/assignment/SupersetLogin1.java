package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupersetLogin1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://app.joinsuperset.com/#/s/feed");
	    driver.findElement(By.name("email")).sendKeys("shruti.vibhuti02@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("9657024501");
	    driver.findElement(By.tagName("submit")).click();

	}

}
