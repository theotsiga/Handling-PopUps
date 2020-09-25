package miscallaneous;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
			WebElement gendertooltip = driver.findElement(By.id("gender-help"));
			String tooltext = gendertooltip.getAttribute("title");
			
			if (tooltext.equalsIgnoreCase("clickfor more information")) 
			{
				System.out.println("tooltip matching with expected result");
			} 
			else
			{
				System.out.println("tooltip not matching with expected result");
			}
			
			
			
			
			
			
	}

}
