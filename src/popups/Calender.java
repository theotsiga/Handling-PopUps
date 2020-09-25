package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americanairlines.in/");
		driver.findElement(By.xpath("//button[@name='optoutmulti_button']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Depart')]")).click();
		driver.findElement(By.xpath("//a[.='23']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Return')]")).click();
		//driver.findElement(By.xpath("(//a[.='25'])[2]")).click();
		
		for (int i = 0; i <=3; i++)
		//(int i = 0; i < 4; i++)	
		{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Next']")).click();
		}
		driver.findElement(By.xpath("(//a[.='12'])[2]")).click();
	}

}
