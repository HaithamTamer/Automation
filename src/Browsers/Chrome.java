package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.getProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.quit();
	}

}

