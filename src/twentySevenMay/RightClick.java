package twentySevenMay;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		
	}
}
