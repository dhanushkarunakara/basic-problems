package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute //to get any attributes of the given element
{

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String attribute1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getAttribute("href");
		String attribute2 = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("class");
		System.out.println("attribute of first element is "+attribute1);
		System.out.println("attribute of second element is "+attribute2);
		driver.close();
	}
}
