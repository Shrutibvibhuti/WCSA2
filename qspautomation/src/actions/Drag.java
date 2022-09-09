package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
      WebElement src = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));    //path of source
      WebElement des = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li[@class='placeholder']"));   //path for destination
      
           Actions act = new Actions(driver);
           act.dragAndDrop(src,des).perform();
      
      
        
        
	}

}
