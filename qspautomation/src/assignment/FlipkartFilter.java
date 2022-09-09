package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFilter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");//to open flipkart
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[.='X']")).click(); //to close the popup
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("laptop"); //to search on text bar
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click(); //for search icon of search bar
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//div[.='Corei5' and @class='3879cV']")).click(); //for check box of processor
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF' and .='Brand']")).click();//for brand title
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();// tp select checkbox of operating system
		Thread.sleep(3000);
		
		String priceOfTheFirstSuggestion = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'][1]")).getText();
		System.out.println("priceOfThwFirstSuggestion"+ priceOfTheFirstSuggestion);
		
	
	}

}
