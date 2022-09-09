package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        Thread.sleep(4000);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);    //generate print pop-up
        robot.keyPress(KeyEvent.VK_P);
        
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);
          
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_TAB);    //to transfer control from print to cancel
        robot.keyRelease(KeyEvent.VK_TAB);
        
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ENTER);  //press enter to cancel
        robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
