package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowserPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String>allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		ArrayList<String> al = new ArrayList<>();
		al.addAll(allwindows);
		System.out.println(al.size());
		
		driver.switchTo().window(al.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
