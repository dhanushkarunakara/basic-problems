package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//takes only partial value by using 'contains' keyword
public class ContainsXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.findElement(By.xpath("//span[contains(text(),'Movies')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Movies')]")).sendKeys("RRR");
		
	}

}
