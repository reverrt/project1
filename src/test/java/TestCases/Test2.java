package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void eventsLink()  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ss\\Downloads\\browser drivers\\chromedriver.exe");
	    ChromeOptions option = new ChromeOptions ();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.eazydiner.com");
		

		
		WebElement hBtn=driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/div[1]/p[4]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(hBtn).build().perform();
		Thread.sleep(2000);
		hBtn.click();

	}

}
