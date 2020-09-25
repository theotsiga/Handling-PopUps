package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatBots {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/ngunp8");
		driver.findElement(By.xpath("//div[@class='mylivechat_collapsed']//div//div[@class='mylivechat_collapsed_text'][contains(text(),'Leave a Message')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='mylivechat_offline_question_box mylivechat_offline_box']")).sendKeys("hell hi how are you doing");
	}

}
