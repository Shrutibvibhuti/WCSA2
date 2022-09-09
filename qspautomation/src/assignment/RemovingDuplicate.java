package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///E:/c%20drive%20backup%2026-7-22/Desktop/html%20document/multiselectdropdown.html");
        WebElement dropdown = driver.findElement(By.id("menu"));
         Select sel = new Select(dropdown);
        List<WebElement> option = sel.getOptions();
        TreeSet <String>s = new TreeSet<String>();
        for(int i=0;i<option.size();i++)
        {
        	String texttoinsert = option.get(i).getText();
        	s.add(texttoinsert);
        }
        for(String text :s)
        {
        	System.out.println(text);
        }
	    

	}

}
