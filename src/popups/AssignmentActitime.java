package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActitime {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).click();
		
		Set<String>allwindows = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<>();
		al.addAll(allwindows);
		System.out.println(al.size());
		
		Thread.sleep(5000);
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window(al.get(1));
	}

}
