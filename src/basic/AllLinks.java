package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//to get all the links in a given webpage
public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		int count = elements.size();
		System.out.println("The total links in the webpage are "+count);
		System.out.println("the links are \n");
		for (WebElement we : elements) {
			Thread.sleep(1500);
			System.out.println(we.getText()+"\n"); //getText() returns the text of the links
		}
		driver.close();
	}
}
