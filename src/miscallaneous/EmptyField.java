package miscallaneous;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyField {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("theo"); // if this one then the field will be empty 
		String text = email.getAttribute("value");
		System.out.println(text.length());
		
		if (text.length()==0)
		{
			System.out.println("field is empty");
		}
		else
		{
			System.out.println("field is not empty");
		}
		
	}
}
