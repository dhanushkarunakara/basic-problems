package secondJune.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchMain {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().setPosition(new Point(0, 100)); 
		//to open the chrome window at particular location on screen.
		driver.get("https://www.google.com/");
		
		driver.navigate().refresh();
		//staleElemRefExp is not thrown while using pom class
		
		GoogleSearch search = new GoogleSearch(driver);
		search.searchTextBox("Hello");
	}
}
