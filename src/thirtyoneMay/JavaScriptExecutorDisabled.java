package thirtyoneMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/*JavaScript executor is particularly used to handle scenarios 
including hidden web elements which cannot be located by Selenium WebDriver locators.*/
public class JavaScriptExecutorDisabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/selenium%20softwares/html/DisabledInput.html");
		RemoteWebDriver rDriver = (RemoteWebDriver) driver;
		rDriver.executeScript("document.getElementById('d2').value='dhanu';");
		
	}
}
