package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///E:/c%20drive%20backup%2026-7-22/Desktop/html%20document/usernametextbox.html");
        driver.findElement(By.tagName("input")).sendKeys("admin");
		

	}

}
