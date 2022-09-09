package methodsWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCodemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/c%20drive%20backup%2026-7-22/Desktop/html%20document/checkbox.html");
		String htmlSourceCode = driver.getPageSource();
		System.out.println(htmlSourceCode);

	}

}
