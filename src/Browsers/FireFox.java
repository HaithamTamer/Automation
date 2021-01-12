package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firefoxPath = System.getProperty("user.dir") + "\\drivers\\geckodriver27.exe";
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.quit();
		

	}

}

