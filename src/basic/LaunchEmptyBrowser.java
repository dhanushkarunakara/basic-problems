package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //it will open chrome and search the above url
		//Thread.sleep(1000);
		driver.get("https://www.google.com/");
		driver.navigate().back();
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.close();
	}

}
