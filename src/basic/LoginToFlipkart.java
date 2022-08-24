package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFlipkart {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("flipkart");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		
	}
}
