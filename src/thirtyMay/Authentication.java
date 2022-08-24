package thirtyMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get("https://the-internet.herokuapp.com/digest_auth");
		/*this website will open an un-inspectable pop-up. Hence, we 
		pass username and password in the url itself*/
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
	}
}
