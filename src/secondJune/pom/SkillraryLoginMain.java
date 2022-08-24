package secondJune.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryLoginMain {

	public static void main(String[] args) {
		/**
		 * open the browser and enter url of skillrary website
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		/**
		 * creating object for pom and using its methods to send values.
		 */
		
		SkillraryLogin skillLogin = new SkillraryLogin(driver);
		skillLogin.uName("admin");
		skillLogin.pWord("admin");
		skillLogin.loggingIn();		
		
	}
}
