package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String IEPath = System.getProperty("user.dir") + "\\drivers\\IEDriverServer3.8.exe";
		System.setProperty("webdriver.ie.driver", IEPath);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		WebDriver driver = new InternetExplorerDriver(cap);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.quit();
		

	}

}

