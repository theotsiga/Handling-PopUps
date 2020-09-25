package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignementActitime {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_settings')]//div[@class='menu_icon']")));
		driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_settings')]//div[@class='menu_icon']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Types of Work")));
		driver.findElement(By.linkText("Types of Work")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Create Type of Work')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		driver.findElement(By.id("name")).sendKeys("Theo");
		driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/form/table/tbody/tr/td/input[2]")).click();
		
		Alert pop = driver.switchTo().alert();
		pop.accept();
		
	}

}
