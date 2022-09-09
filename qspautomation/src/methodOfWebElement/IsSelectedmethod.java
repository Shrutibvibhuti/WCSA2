package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/c%20drive%20backup%2026-7-22/Desktop/html%20document/checkbox.html");
		Thread.sleep(3000);
		WebElement automationCheckBox = driver.findElement(By.id("automation"));
		automationCheckBox.click();
		boolean status = automationCheckBox.isSelected();
		System.out.println(status);


	}

}
