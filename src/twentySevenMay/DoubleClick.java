package twentySevenMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement course = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(course).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		WebElement addKey = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		action.doubleClick(addKey).perform();
	}
}
