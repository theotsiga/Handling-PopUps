package miscallaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickJavascriptExecutor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/");
		WebElement checkbox = driver.findElement(By.xpath("//label[contains(text(),'Stay signed in')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;///----down casting
		js.executeScript("arguments[0].click()", checkbox);
		
		}
	}

