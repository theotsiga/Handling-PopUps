package popups;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssBritishAirways {

	public static void main(String[] args) throws InterruptedException, AWTException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.britishairways.com/travel/home/public/en_gb/");
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id='from']")).sendKeys("HARARE");
		driver.findElement(By.xpath("//input[@id='to']")).sendKeys("London Heathrow");
		driver.findElement(By.xpath("//div[@class='date h1 ng-binding']")).click();
		driver.findElement(By.xpath("//div[.='26']")).click();
		driver.findElement(By.xpath("//div[@class='date add-date h1 ng-scope']//span")).click();
		
		for (int i = 0; i < 2; i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='move-month next-month']//span")).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"
				+ "/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]"
				+ "/div[3]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='sb-Flight-pax-mix']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'12 - 15 years')]")).click();
		
		for (int i = 0; i < 3; i++) 
		{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='YoungAdultKey0']//button[@class='spinner-button increase']")).click();	
		}
		driver.findElement(By.xpath("//div[@id='sb-Flight-pax-mix-pop-up']//button[@class='pop-up-dialog-button ng-binding ng-scope ng-isolate-scope']"
				+ "[contains(text(),'Confirm')]")).click();
	    driver.findElement(By.xpath("//button[@class='primary search-button']")).click();
	    
	    Robot r = new Robot();
	    
	    for (int i = 0; i < 2; i++) 
	    {
		Thread.sleep(2000);	
		r.keyPress(KeyEvent.VK_TAB);
	    }
	    
	    driver.findElement(By.xpath("//input[@id='from']")).sendKeys("New York, New York (All Airports) (NYC), USA");
	    driver.findElement(By.xpath("//body[@id='content']")).click();
	    
	}

}
