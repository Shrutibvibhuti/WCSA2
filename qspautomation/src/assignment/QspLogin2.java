package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspLogin2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://campus.qspiders.com/user");
	    driver.findElement(By.id("edit-name")).sendKeys("9657763942");
	    Thread.sleep(3000);
	    driver.findElement(By.id("edit-pass")).sendKeys("9657763942");
	    Thread.sleep(3000);
	    driver.findElement(By.id("edit-submit")).click();



	}

}
