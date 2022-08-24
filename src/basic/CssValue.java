package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String css1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-weight");
		System.out.println(css1);
		String css2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		System.out.println(css2);
		driver.close();
	}
}
