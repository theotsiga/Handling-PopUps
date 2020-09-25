package miscallaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.gmail.com");
		    WebElement next = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		    next.click();
		    WebElement error = driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		    String actualmessage = error.getText();
		    if (actualmessage.contains("Enter"))  //if (actualmessage.equalsIgnoreCase("Enter an email or phone number "));
		    {
		    	System.out.println("matching");
			} 
		    else
		    {
		    	System.out.println("not matching");
			}
			
			
	}

}
