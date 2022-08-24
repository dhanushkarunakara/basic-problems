package thirtyoneMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		//Thread.sleep(3000);
		JavascriptExecutor jScriptExecutor = (JavascriptExecutor) driver;
		jScriptExecutor.executeScript("window.scrollBy(0,5000);"); //scroll down in pixels
		Thread.sleep(3000);
		jScriptExecutor.executeScript("window.scrollBy(0,-3000);"); //scroll up in pixels
		
	}
}
