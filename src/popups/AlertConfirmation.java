package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConfirmation {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container_tasks")));
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[.= 'Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]")));
		driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]")).sendKeys("Theo");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());		
		alt.dismiss();
		
		
		
		
		
		
		
		
		
		
		
	}

}
