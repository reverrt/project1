package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void citySearch()  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\Downloads\\browser drivers\\chromedriver.exe");
	    ChromeOptions option = new ChromeOptions ();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.eazydiner.com");
		
		driver.findElement(By.id("srchbar")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"search_city_content\"]/div[1]/ul/li[14]/div")).click();
		

	}


}
