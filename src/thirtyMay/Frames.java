package thirtyMay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/selenium%20softwares/html/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		//we can only send values to input tag.
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.close();
		
	}

}
