package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://127.0.0.1/login.do;jsessionid=13nskcv6mkcv6");
	    driver.findElement(By.name("username")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    Thread.sleep(3000);
	    driver.findElement(By.id("loginButton")).click();



	}

}
