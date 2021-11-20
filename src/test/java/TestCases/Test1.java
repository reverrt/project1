package TestCases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void search() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\Downloads\\browser drivers\\chromedriver.exe");
	    ChromeOptions option = new ChromeOptions ();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.eazydiner.com");
		
		WebElement searchBox=driver.findElement(By.id("home-search"));
		searchBox.sendKeys("cafe");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']"));
		list.get(2).click();
		
	}

}
