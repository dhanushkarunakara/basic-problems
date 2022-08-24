package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitImplicitWait {
	
	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		WebDriverWait waitDriver = new WebDriverWait(driver, 5);
		waitDriver.until(ExpectedConditions.titleContains("Courses"));
		
		driver.close();
		
	}
}
