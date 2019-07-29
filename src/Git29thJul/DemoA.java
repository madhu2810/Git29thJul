package Git29thJul;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoA {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String aTitle = driver.getTitle();
		String eTitle = "Google";
		Assert.assertEquals(aTitle,eTitle);
		/*if(aTitle==eTitle) {
			
			System.out.println("Title mathes");
		}
		else {
			System.out.println("Title not matches");
		}*/
		driver.close();
	}

}
