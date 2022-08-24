package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium%20softwares/html/basic.html");
		driver.findElement(By.tagName("a")).click(); //id locator
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("d1")).click(); //id locator
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("n1")).click(); //name locator
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.className("c1")).click(); //classname locator
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.linkText("jspiders")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("spider")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}

}
