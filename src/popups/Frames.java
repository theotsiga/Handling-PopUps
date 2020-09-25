package popups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/romse/Desktop/HTML/Frames.html");
		
		
		driver.findElement(By.id("t1")).sendKeys("Theo");
		driver.switchTo().frame(1);
		driver.findElement(By.id("t2")).sendKeys("Tester");
		
		
	}

}
