package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("harry");
		Thread.sleep(3000);
		List<WebElement> autoSuggList = driver.findElements(By.xpath("//li[@class='sbct sbre']"));
		System.out.println("The autosuggested seach are \n");
		for (WebElement list : autoSuggList) {
			System.out.println(list.getText()+"\n");
		}
		driver.close();
	}
}
