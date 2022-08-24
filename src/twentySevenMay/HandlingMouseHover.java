package twentySevenMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		WebElement menElement = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions action = new Actions(driver);
		action.moveToElement(menElement).perform();
		driver.findElement(By.xpath("//a[text()='Formal Shirts']")).click();
		
	}
}
