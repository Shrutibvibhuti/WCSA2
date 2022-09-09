package methodsWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");;
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		Thread.sleep(3000);
		Navigation ref = driver.navigate();		
		ref.back();
		Thread.sleep(3000);
		ref.forward();
		Thread.sleep(3000);
		ref.refresh();

	}

}
