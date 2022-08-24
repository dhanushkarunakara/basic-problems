package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToHomePage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password' and @id ='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text() = 'Login' ]")).click();
		
	}
}
