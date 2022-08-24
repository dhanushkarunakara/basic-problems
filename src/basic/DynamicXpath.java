package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String append = "text() = 'Gift Cards']";
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@class = 'nav-a  ' and "+append)).click();
		
		//a[@class = 'nav-a  ']
		
		
	}
}
