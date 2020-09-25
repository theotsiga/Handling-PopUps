package miscallaneous;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtension {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\romse\\Desktop\\Homework\\extension_6_1_7_0.crx"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
	}

}
