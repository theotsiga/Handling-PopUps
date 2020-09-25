package miscallaneous;

import org.openqa.selenium.os.WindowsUtils;

public class KillWindowProcess {

	public static void main(String[] args) {

		WindowsUtils.killByName("iexplore.exe");
		System.out.println(WindowsUtils.thisIsWindows());
	}

}
